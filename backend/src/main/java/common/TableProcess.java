package common;

import java.io.StringReader;
import java.net.URLDecoder;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import delicacy.common.BaseHelpUtils;
import delicacy.common.CommonUtils;
import delicacy.common.GenericDao;
import delicacy.common.GenericProcessor;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import delicacy.servlet.AbstractProcessores;
import org.json.JSONObject;

/**
 * 单表操作的process
 * 
 * @author lxf
 */
public class TableProcess implements GenericProcessor {
	private static final Logger __logger = Logger.getLogger("");
	// 操作类型
	private static final String TABLE_NAME = "tableName";
	private static final String SUB_ACTION = "subaction";
	public final static String CURRENT_PAGE = "currentPage";
	public final static String PAGE_SIZE = "pageSize";
	public final static String PAGE_LINE = "pageLines";
	public final static String ADDITIONAL = "addtionalCondition";
	public final static String ENCODING_UTF = "UTF-8";

	@SuppressWarnings("deprecation")
	@Override
	public String execute(String creteria, HttpServletRequest request) throws Exception {
		//获取组织代码
//		int organizationId = UserInfoUtils.getOrganizationId(request);
//		if(organizationId == 0) {
//			throw new SQLException("Sorry, Could not get organizationId");
//		}
		@SuppressWarnings("rawtypes")
		JSON parser = new JSON(new StringReader(creteria));
		@SuppressWarnings("unchecked")
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
//		params.put("organizationId", organizationId);
		String result = null;
		JSONObject jsObject = new JSONObject(params);
		String content = jsObject.toString();
		__logger.info("execute single table process content----> " + content);
		// 获取表名称
		String tableName = BaseHelpUtils.getStringValue(params, TABLE_NAME);
		String className = AbstractProcessores.getTableHandlerClass(tableName);
		GenericDao dao = (GenericDao) Class.forName(className).newInstance();
		if (dao == null) {
			throw new SQLException(String.format("Sorry, Could not found Table Class [%1$s].", className));
		}
		__logger.info("execute single table process ----> " + className);
		//获取subaction
		String subaction = BaseHelpUtils.getStringValue(params,SUB_ACTION);
		__logger.info("execute single table process subaction----> " + subaction);
		if(BaseHelpUtils.isNullOrEmpty(subaction)) {
			throw new SQLException("Do you missing something like actionType.");
		}
		switch (subaction) {
			case "findUsingKey":
				result = dao.findUsingKey(content);
				break;
			case "find":
				String pageNo = null;
				String pageSize = null;
				String addtionalCondition = null;
				pageNo = (String)params.get(CURRENT_PAGE);
				pageSize = (String)params.get(PAGE_SIZE);
				addtionalCondition = (String)params.get(ADDITIONAL);
				int pageLines = 20;
				int currentPage = pageNo == null ? 0 : CommonUtils.isDigit(pageNo) ? Integer.valueOf(pageNo) : 0;
				if (currentPage > 0) {
					pageLines = pageSize == null ? 0 : CommonUtils.isDigit(pageSize) ? Integer.valueOf(pageSize) : 0;
					if (pageLines == 0) {
						pageSize = (String)params.get(PAGE_LINE);
						pageLines = pageSize == null ? 0 : CommonUtils.isDigit(pageSize) ? Integer.valueOf(pageSize) : 0;
					}
					if (pageLines == 0) {
						pageLines = 20;
					}
				}
				if (addtionalCondition != null) {
					addtionalCondition = URLDecoder.decode(addtionalCondition, ENCODING_UTF);
				}
				if (pageNo == null && pageSize == null && addtionalCondition == null) {
					if (params.containsKey(ADDITIONAL) || params.containsKey(CURRENT_PAGE)
							|| params.containsKey(PAGE_SIZE)) {
						currentPage = BaseHelpUtils.getIntValue(params, CURRENT_PAGE);
						pageLines = BaseHelpUtils.getIntValue(params, PAGE_SIZE);
						addtionalCondition = BaseHelpUtils.getStringValue(params, ADDITIONAL);
					}
				}
				result = dao.find(content, currentPage, pageLines, addtionalCondition);
				break;
			case "save":
				result = dao.save(content);
				break;
			case "update":
				result = dao.update(content);
				break;
			case "delete":
				result = dao.delete(content);
				break;
			case "saveOrUpdate":
				result = dao.saveOrUpdate(content);
				break;
			}
		__logger.info("execute single table process result----> " + result);
		return result;
	}

}
