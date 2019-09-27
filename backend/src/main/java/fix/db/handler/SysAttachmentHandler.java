package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseSysAttachment;
import java.util.List;
import fix.db.dao.SysAttachment;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class SysAttachmentHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(SysAttachmentHandler.class);

	public static BaseSysAttachment getSysAttachmentById( 

	) throws Exception
	{
		SysAttachment dao = new SysAttachment();
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isSysAttachmentExists( fix.db.bean.BaseSysAttachment bean, String additional ) throws Exception {

		SysAttachment dao = new SysAttachment();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countSysAttachment( fix.db.bean.BaseSysAttachment bean, String additional ) throws Exception {

		SysAttachment dao = new SysAttachment();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseSysAttachment> querySysAttachment( fix.db.bean.BaseSysAttachment bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		SysAttachment dao = new SysAttachment();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseSysAttachment> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseSysAttachment> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseSysAttachment addToSysAttachment ( BaseSysAttachment sysattachment )  throws Exception {
		return addToSysAttachment ( sysattachment , false);
	}

	public static BaseSysAttachment addToSysAttachment ( BaseSysAttachment sysattachment, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		SysAttachment dao = new SysAttachment();
		dao.setDataFromBase(sysattachment);
		int result = dao.save(false);
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseSysAttachment addUpdateSysAttachment ( BaseSysAttachment sysattachment ) throws Exception {
		return addUpdateSysAttachment ( sysattachment , false);
	}

	public static BaseSysAttachment addUpdateSysAttachment ( BaseSysAttachment sysattachment, boolean singleTransaction  ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		SysAttachment dao = new SysAttachment();
		dao.setDataFromBase(sysattachment);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(sysattachment); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save(false);
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteSysAttachment ( BaseSysAttachment bean ) throws Exception {
		SysAttachment dao = new SysAttachment();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseSysAttachment updateSysAttachment ( BaseSysAttachment sysattachment ) throws Exception {
		SysAttachment dao = new SysAttachment();
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(sysattachment);
			result = dao.update();
		}
		return result == 1 ? sysattachment : null ;
	}

	public static BaseSysAttachment updateSysAttachmentDirect( BaseSysAttachment sysattachment ) throws Exception {
		SysAttachment dao = new SysAttachment();
		int result = 0;
		dao.setDataFromBase(sysattachment);
		result = dao.update();
		return result == 1 ? sysattachment : null ;
	}

	public static int setDeleteConditions(BaseSysAttachment bean, SysAttachment dao){
		int count = 0;
		boolean foundKey = false;
		if(!foundKey) {
			if(bean.getId() != null) {
				dao.setConditionId("=", bean.getId());
				count++;
			}
			if(bean.getUri() != null) {
				dao.setConditionUri("=", bean.getUri());
				count++;
			}
			if(bean.getCreateTime() != null) {
				dao.setConditionCreateTime("=", bean.getCreateTime());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseSysAttachment bean, SysAttachment dao){
		int count = 0;
		if(bean.getId() != null) {
			dao.setConditionId("=", bean.getId());
			count++;
		}
		if(bean.getUri() != null) {
			if(bean.getUri().indexOf("%") >= 0)
				dao.setConditionUri("like", bean.getUri());
			else
				dao.setConditionUri("=", bean.getUri());
			count++;
		}
		if(bean.getCreateTime() != null) {
			if(bean.getCreateTime().indexOf("%") >= 0)
				dao.setConditionCreateTime("like", bean.getCreateTime());
			else
				dao.setConditionCreateTime("=", bean.getCreateTime());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseSysAttachment bean = new BaseSysAttachment();
		bean.setDataFromJSON(json);
		SysAttachment dao = new SysAttachment();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseSysAttachment> rlist = new BaseCollection<>();
		BaseSysAttachment bean = new BaseSysAttachment();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		SysAttachment dao = new SysAttachment();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseSysAttachment> result = dao.conditionalLoad(addtion);
		rlist.setCollections(result);
		rlist.setTotalPages(dao.getTotalPages());
		rlist.setCurrentPage(dao.getCurrentPage());
		rlist.setPageLines(dao.getPageLines());
		rlist.setTotalLines(dao.getTotalLines());
		rlist.setRecordNumber(result.size());
		return rlist.toJSON(null);
	}

	@Override
	public String save(String json) throws Exception{
		BaseSysAttachment bean = new BaseSysAttachment();
		bean.setDataFromJSON(json);
		SysAttachment dao = new SysAttachment();
		dao.setDataFromBase(bean);
		int num = dao.save(false);
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseSysAttachment bean = new BaseSysAttachment();
		bean.setDataFromJSON(json);
		SysAttachment dao = new SysAttachment();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseSysAttachment bean = new BaseSysAttachment();
		bean.setDataFromJSON(json);
		SysAttachment dao = new SysAttachment();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseSysAttachment bean = new BaseSysAttachment();
		bean.setDataFromJSON(json);
		SysAttachment dao = new SysAttachment();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(false); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


