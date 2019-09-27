package common;

import java.io.StringReader;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import delicacy.common.GenericProcessor;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import delicacy.system.executor.DomainValueHandler;
import org.json.JSONObject;

/**
 * 下拉数据加载的process
 * 
 * @author lxf
 */
public class DomainValueProcess implements GenericProcessor {
	private static final Logger __logger = Logger.getLogger("");
	public final static String ADDITIONAL = "addtionalCondition";

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
		__logger.info("execute domain process content----> " + content);
		DomainValueHandler handel = new DomainValueHandler();
		result = handel.find(content);
		__logger.info("execute domain process result----> " + result);
		return result;
	}

}
