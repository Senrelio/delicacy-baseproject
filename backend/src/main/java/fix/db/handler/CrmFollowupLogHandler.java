package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmFollowupLog;
import java.util.List;
import fix.db.dao.CrmFollowupLog;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmFollowupLogHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmFollowupLogHandler.class);

	public static BaseCrmFollowupLog getCrmFollowupLogById( 
		java.lang.Integer id
	) throws Exception
	{
		CrmFollowupLog dao = new CrmFollowupLog();
		dao.setId(id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmFollowupLogExists( fix.db.bean.BaseCrmFollowupLog bean, String additional ) throws Exception {

		CrmFollowupLog dao = new CrmFollowupLog();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmFollowupLog( fix.db.bean.BaseCrmFollowupLog bean, String additional ) throws Exception {

		CrmFollowupLog dao = new CrmFollowupLog();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmFollowupLog> queryCrmFollowupLog( fix.db.bean.BaseCrmFollowupLog bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmFollowupLog dao = new CrmFollowupLog();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmFollowupLog> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmFollowupLog> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmFollowupLog addToCrmFollowupLog ( BaseCrmFollowupLog crmfollowuplog )  throws Exception {
		return addToCrmFollowupLog ( crmfollowuplog , false);
	}

	public static BaseCrmFollowupLog addToCrmFollowupLog ( BaseCrmFollowupLog crmfollowuplog, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmFollowupLog dao = new CrmFollowupLog();
		dao.setDataFromBase(crmfollowuplog);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmFollowupLog addUpdateCrmFollowupLog ( BaseCrmFollowupLog crmfollowuplog ) throws Exception {
		return addUpdateCrmFollowupLog ( crmfollowuplog , false);
	}

	public static BaseCrmFollowupLog addUpdateCrmFollowupLog ( BaseCrmFollowupLog crmfollowuplog, boolean singleTransaction  ) throws Exception {
		if(crmfollowuplog.getId() == null) return addToCrmFollowupLog(crmfollowuplog);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmFollowupLog dao = new CrmFollowupLog();
		dao.setDataFromBase(crmfollowuplog);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmfollowuplog); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmFollowupLog ( BaseCrmFollowupLog bean ) throws Exception {
		CrmFollowupLog dao = new CrmFollowupLog();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmFollowupLog updateCrmFollowupLog ( BaseCrmFollowupLog crmfollowuplog ) throws Exception {
		CrmFollowupLog dao = new CrmFollowupLog();
		dao.setId( crmfollowuplog.getId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmfollowuplog);
			result = dao.update();
		}
		return result == 1 ? crmfollowuplog : null ;
	}

	public static BaseCrmFollowupLog updateCrmFollowupLogDirect( BaseCrmFollowupLog crmfollowuplog ) throws Exception {
		CrmFollowupLog dao = new CrmFollowupLog();
		int result = 0;
		dao.setDataFromBase(crmfollowuplog);
		result = dao.update();
		return result == 1 ? crmfollowuplog : null ;
	}

	public static int setDeleteConditions(BaseCrmFollowupLog bean, CrmFollowupLog dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getId() != null) {
			dao.setConditionId("=", bean.getId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getEmployeesId() != null) {
				dao.setConditionEmployeesId("=", bean.getEmployeesId());
				count++;
			}
			if(bean.getSourceTable() != null) {
				dao.setConditionSourceTable("=", bean.getSourceTable());
				count++;
			}
			if(bean.getSourceId() != null) {
				dao.setConditionSourceId("=", bean.getSourceId());
				count++;
			}
			if(bean.getOperate() != null) {
				dao.setConditionOperate("=", bean.getOperate());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmFollowupLog bean, CrmFollowupLog dao){
		int count = 0;
		if(bean.getId() != null) {
			dao.setConditionId("=", bean.getId());
			count++;
		}
		if(bean.getEmployeesId() != null) {
			dao.setConditionEmployeesId("=", bean.getEmployeesId());
			count++;
		}
		if(bean.getSourceTable() != null) {
			if(bean.getSourceTable().indexOf("%") >= 0)
				dao.setConditionSourceTable("like", bean.getSourceTable());
			else
				dao.setConditionSourceTable("=", bean.getSourceTable());
			count++;
		}
		if(bean.getSourceId() != null) {
			dao.setConditionSourceId("=", bean.getSourceId());
			count++;
		}
		if(bean.getOperate() != null) {
			if(bean.getOperate().indexOf("%") >= 0)
				dao.setConditionOperate("like", bean.getOperate());
			else
				dao.setConditionOperate("=", bean.getOperate());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseCrmFollowupLog bean = new BaseCrmFollowupLog();
		bean.setDataFromJSON(json);
		CrmFollowupLog dao = new CrmFollowupLog();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmFollowupLog> rlist = new BaseCollection<>();
		BaseCrmFollowupLog bean = new BaseCrmFollowupLog();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmFollowupLog dao = new CrmFollowupLog();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmFollowupLog> result = dao.conditionalLoad(addtion);
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
		BaseCrmFollowupLog bean = new BaseCrmFollowupLog();
		bean.setDataFromJSON(json);
		CrmFollowupLog dao = new CrmFollowupLog();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmFollowupLog bean = new BaseCrmFollowupLog();
		bean.setDataFromJSON(json);
		CrmFollowupLog dao = new CrmFollowupLog();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmFollowupLog bean = new BaseCrmFollowupLog();
		bean.setDataFromJSON(json);
		CrmFollowupLog dao = new CrmFollowupLog();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmFollowupLog bean = new BaseCrmFollowupLog();
		bean.setDataFromJSON(json);
		CrmFollowupLog dao = new CrmFollowupLog();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


