package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmOpportunityStage;
import java.util.List;
import fix.db.dao.CrmOpportunityStage;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmOpportunityStageHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmOpportunityStageHandler.class);

	public static BaseCrmOpportunityStage getCrmOpportunityStageById( 
		java.lang.Integer opportunity_stage_path_id
	) throws Exception
	{
		CrmOpportunityStage dao = new CrmOpportunityStage();
		dao.setOpportunityStagePathId(opportunity_stage_path_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmOpportunityStageExists( fix.db.bean.BaseCrmOpportunityStage bean, String additional ) throws Exception {

		CrmOpportunityStage dao = new CrmOpportunityStage();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmOpportunityStage( fix.db.bean.BaseCrmOpportunityStage bean, String additional ) throws Exception {

		CrmOpportunityStage dao = new CrmOpportunityStage();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmOpportunityStage> queryCrmOpportunityStage( fix.db.bean.BaseCrmOpportunityStage bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmOpportunityStage dao = new CrmOpportunityStage();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmOpportunityStage> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmOpportunityStage> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmOpportunityStage addToCrmOpportunityStage ( BaseCrmOpportunityStage crmopportunitystage )  throws Exception {
		return addToCrmOpportunityStage ( crmopportunitystage , false);
	}

	public static BaseCrmOpportunityStage addToCrmOpportunityStage ( BaseCrmOpportunityStage crmopportunitystage, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmOpportunityStage dao = new CrmOpportunityStage();
		dao.setDataFromBase(crmopportunitystage);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmOpportunityStage addUpdateCrmOpportunityStage ( BaseCrmOpportunityStage crmopportunitystage ) throws Exception {
		return addUpdateCrmOpportunityStage ( crmopportunitystage , false);
	}

	public static BaseCrmOpportunityStage addUpdateCrmOpportunityStage ( BaseCrmOpportunityStage crmopportunitystage, boolean singleTransaction  ) throws Exception {
		if(crmopportunitystage.getOpportunityStagePathId() == null) return addToCrmOpportunityStage(crmopportunitystage);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmOpportunityStage dao = new CrmOpportunityStage();
		dao.setDataFromBase(crmopportunitystage);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmopportunitystage); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmOpportunityStage ( BaseCrmOpportunityStage bean ) throws Exception {
		CrmOpportunityStage dao = new CrmOpportunityStage();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmOpportunityStage updateCrmOpportunityStage ( BaseCrmOpportunityStage crmopportunitystage ) throws Exception {
		CrmOpportunityStage dao = new CrmOpportunityStage();
		dao.setOpportunityStagePathId( crmopportunitystage.getOpportunityStagePathId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmopportunitystage);
			result = dao.update();
		}
		return result == 1 ? crmopportunitystage : null ;
	}

	public static BaseCrmOpportunityStage updateCrmOpportunityStageDirect( BaseCrmOpportunityStage crmopportunitystage ) throws Exception {
		CrmOpportunityStage dao = new CrmOpportunityStage();
		int result = 0;
		dao.setDataFromBase(crmopportunitystage);
		result = dao.update();
		return result == 1 ? crmopportunitystage : null ;
	}

	public static int setDeleteConditions(BaseCrmOpportunityStage bean, CrmOpportunityStage dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getOpportunityStagePathId() != null) {
			dao.setConditionOpportunityStagePathId("=", bean.getOpportunityStagePathId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getOpportunityId() != null) {
				dao.setConditionOpportunityId("=", bean.getOpportunityId());
				count++;
			}
			if(bean.getCurrentStageId() != null) {
				dao.setConditionCurrentStageId("=", bean.getCurrentStageId());
				count++;
			}
			if(bean.getEntityTypeId() != null) {
				dao.setConditionEntityTypeId("=", bean.getEntityTypeId());
				count++;
			}
			if(bean.getPreviousStageId() != null) {
				dao.setConditionPreviousStageId("=", bean.getPreviousStageId());
				count++;
			}
			if(bean.getEmployeeIdCreated() != null) {
				dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
				count++;
			}
			if(bean.getEntityType() != null) {
				dao.setConditionEntityType("=", bean.getEntityType());
				count++;
			}
			if(bean.getFlagRecentStagePath() != null) {
				dao.setConditionFlagRecentStagePath("=", bean.getFlagRecentStagePath());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmOpportunityStage bean, CrmOpportunityStage dao){
		int count = 0;
		if(bean.getOpportunityStagePathId() != null) {
			dao.setConditionOpportunityStagePathId("=", bean.getOpportunityStagePathId());
			count++;
		}
		if(bean.getOpportunityId() != null) {
			dao.setConditionOpportunityId("=", bean.getOpportunityId());
			count++;
		}
		if(bean.getCurrentStageId() != null) {
			dao.setConditionCurrentStageId("=", bean.getCurrentStageId());
			count++;
		}
		if(bean.getEntityTypeId() != null) {
			dao.setConditionEntityTypeId("=", bean.getEntityTypeId());
			count++;
		}
		if(bean.getPreviousStageId() != null) {
			dao.setConditionPreviousStageId("=", bean.getPreviousStageId());
			count++;
		}
		if(bean.getDateStart() != null) {
			dao.setConditionDateStart(">=", bean.getDateStart());
			count++;
		}
		if(bean.getDateEnd() != null) {
			dao.setConditionDateEnd(">=", bean.getDateEnd());
			count++;
		}
		if(bean.getEmployeeIdCreated() != null) {
			dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
			count++;
		}
		if(bean.getDateCreated() != null) {
			dao.setConditionDateCreated(">=", bean.getDateCreated());
			count++;
		}
		if(bean.getEntityType() != null) {
			dao.setConditionEntityType("=", bean.getEntityType());
			count++;
		}
		if(bean.getFlagRecentStagePath() != null) {
			dao.setConditionFlagRecentStagePath("=", bean.getFlagRecentStagePath());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseCrmOpportunityStage bean = new BaseCrmOpportunityStage();
		bean.setDataFromJSON(json);
		CrmOpportunityStage dao = new CrmOpportunityStage();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmOpportunityStage> rlist = new BaseCollection<>();
		BaseCrmOpportunityStage bean = new BaseCrmOpportunityStage();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmOpportunityStage dao = new CrmOpportunityStage();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmOpportunityStage> result = dao.conditionalLoad(addtion);
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
		BaseCrmOpportunityStage bean = new BaseCrmOpportunityStage();
		bean.setDataFromJSON(json);
		CrmOpportunityStage dao = new CrmOpportunityStage();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmOpportunityStage bean = new BaseCrmOpportunityStage();
		bean.setDataFromJSON(json);
		CrmOpportunityStage dao = new CrmOpportunityStage();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmOpportunityStage bean = new BaseCrmOpportunityStage();
		bean.setDataFromJSON(json);
		CrmOpportunityStage dao = new CrmOpportunityStage();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmOpportunityStage bean = new BaseCrmOpportunityStage();
		bean.setDataFromJSON(json);
		CrmOpportunityStage dao = new CrmOpportunityStage();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


