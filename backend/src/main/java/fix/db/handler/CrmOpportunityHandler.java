package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmOpportunity;
import java.util.List;
import fix.db.dao.CrmOpportunity;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmOpportunityHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmOpportunityHandler.class);

	public static BaseCrmOpportunity getCrmOpportunityById( 
		java.lang.Integer opportunity_id
	) throws Exception
	{
		CrmOpportunity dao = new CrmOpportunity();
		dao.setOpportunityId(opportunity_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmOpportunityExists( fix.db.bean.BaseCrmOpportunity bean, String additional ) throws Exception {

		CrmOpportunity dao = new CrmOpportunity();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmOpportunity( fix.db.bean.BaseCrmOpportunity bean, String additional ) throws Exception {

		CrmOpportunity dao = new CrmOpportunity();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmOpportunity> queryCrmOpportunity( fix.db.bean.BaseCrmOpportunity bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmOpportunity dao = new CrmOpportunity();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmOpportunity> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmOpportunity> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmOpportunity addToCrmOpportunity ( BaseCrmOpportunity crmopportunity )  throws Exception {
		return addToCrmOpportunity ( crmopportunity , false);
	}

	public static BaseCrmOpportunity addToCrmOpportunity ( BaseCrmOpportunity crmopportunity, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmOpportunity dao = new CrmOpportunity();
		dao.setDataFromBase(crmopportunity);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmOpportunity addUpdateCrmOpportunity ( BaseCrmOpportunity crmopportunity ) throws Exception {
		return addUpdateCrmOpportunity ( crmopportunity , false);
	}

	public static BaseCrmOpportunity addUpdateCrmOpportunity ( BaseCrmOpportunity crmopportunity, boolean singleTransaction  ) throws Exception {
		if(crmopportunity.getOpportunityId() == null) return addToCrmOpportunity(crmopportunity);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmOpportunity dao = new CrmOpportunity();
		dao.setDataFromBase(crmopportunity);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmopportunity); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmOpportunity ( BaseCrmOpportunity bean ) throws Exception {
		CrmOpportunity dao = new CrmOpportunity();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmOpportunity updateCrmOpportunity ( BaseCrmOpportunity crmopportunity ) throws Exception {
		CrmOpportunity dao = new CrmOpportunity();
		dao.setOpportunityId( crmopportunity.getOpportunityId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmopportunity);
			result = dao.update();
		}
		return result == 1 ? crmopportunity : null ;
	}

	public static BaseCrmOpportunity updateCrmOpportunityDirect( BaseCrmOpportunity crmopportunity ) throws Exception {
		CrmOpportunity dao = new CrmOpportunity();
		int result = 0;
		dao.setDataFromBase(crmopportunity);
		result = dao.update();
		return result == 1 ? crmopportunity : null ;
	}

	public static int setDeleteConditions(BaseCrmOpportunity bean, CrmOpportunity dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getOpportunityId() != null) {
			dao.setConditionOpportunityId("=", bean.getOpportunityId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getEntityType() != null) {
				dao.setConditionEntityType("=", bean.getEntityType());
				count++;
			}
			if(bean.getEmployeeIdMaintainer() != null) {
				dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
				count++;
			}
			if(bean.getOpportunityName() != null) {
				dao.setConditionOpportunityName("=", bean.getOpportunityName());
				count++;
			}
			if(bean.getCustomerId() != null) {
				dao.setConditionCustomerId("=", bean.getCustomerId());
				count++;
			}
			if(bean.getPriceListId() != null) {
				dao.setConditionPriceListId("=", bean.getPriceListId());
				count++;
			}
			if(bean.getOpportunityType() != null) {
				dao.setConditionOpportunityType("=", bean.getOpportunityType());
				count++;
			}
			if(bean.getSalesStageId() != null) {
				dao.setConditionSalesStageId("=", bean.getSalesStageId());
				count++;
			}
			if(bean.getSalesStageLostId() != null) {
				dao.setConditionSalesStageLostId("=", bean.getSalesStageLostId());
				count++;
			}
			if(bean.getWinrate() != null) {
				dao.setConditionWinrate("=", bean.getWinrate());
				count++;
			}
			if(bean.getDescriptionLost() != null) {
				dao.setConditionDescriptionLost("=", bean.getDescriptionLost());
				count++;
			}
			if(bean.getReasonLost() != null) {
				dao.setConditionReasonLost("=", bean.getReasonLost());
				count++;
			}
			if(bean.getFlagPromisedByCustomer() != null) {
				dao.setConditionFlagPromisedByCustomer("=", bean.getFlagPromisedByCustomer());
				count++;
			}
			if(bean.getEmployeeIdCreated() != null) {
				dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
				count++;
			}
			if(bean.getEmployeeIdUpdated() != null) {
				dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
				count++;
			}
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
				count++;
			}
			if(bean.getFlagLocked() != null) {
				dao.setConditionFlagLocked("=", bean.getFlagLocked());
				count++;
			}
			if(bean.getLeadId() != null) {
				dao.setConditionLeadId("=", bean.getLeadId());
				count++;
			}
			if(bean.getMemo() != null) {
				dao.setConditionMemo("=", bean.getMemo());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmOpportunity bean, CrmOpportunity dao){
		int count = 0;
		if(bean.getOpportunityId() != null) {
			dao.setConditionOpportunityId("=", bean.getOpportunityId());
			count++;
		}
		if(bean.getEntityType() != null) {
			dao.setConditionEntityType("=", bean.getEntityType());
			count++;
		}
		if(bean.getEmployeeIdMaintainer() != null) {
			dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
			count++;
		}
		if(bean.getOpportunityName() != null) {
			if(bean.getOpportunityName().indexOf("%") >= 0)
				dao.setConditionOpportunityName("like", bean.getOpportunityName());
			else
				dao.setConditionOpportunityName("=", bean.getOpportunityName());
			count++;
		}
		if(bean.getCustomerId() != null) {
			dao.setConditionCustomerId("=", bean.getCustomerId());
			count++;
		}
		if(bean.getPriceListId() != null) {
			dao.setConditionPriceListId("=", bean.getPriceListId());
			count++;
		}
		if(bean.getOpportunityType() != null) {
			dao.setConditionOpportunityType("=", bean.getOpportunityType());
			count++;
		}
		if(bean.getSalesAmount() != null) {
			dao.setConditionSalesAmount("=", bean.getSalesAmount());
			count++;
		}
		if(bean.getSalesStageId() != null) {
			dao.setConditionSalesStageId("=", bean.getSalesStageId());
			count++;
		}
		if(bean.getSalesStageLostId() != null) {
			dao.setConditionSalesStageLostId("=", bean.getSalesStageLostId());
			count++;
		}
		if(bean.getWinrate() != null) {
			dao.setConditionWinrate("=", bean.getWinrate());
			count++;
		}
		if(bean.getDescriptionLost() != null) {
			if(bean.getDescriptionLost().indexOf("%") >= 0)
				dao.setConditionDescriptionLost("like", bean.getDescriptionLost());
			else
				dao.setConditionDescriptionLost("=", bean.getDescriptionLost());
			count++;
		}
		if(bean.getReasonLost() != null) {
			dao.setConditionReasonLost("=", bean.getReasonLost());
			count++;
		}
		if(bean.getDateCloseOpportunity() != null) {
			dao.setConditionDateCloseOpportunity(">=", bean.getDateCloseOpportunity());
			count++;
		}
		if(bean.getFlagPromisedByCustomer() != null) {
			dao.setConditionFlagPromisedByCustomer("=", bean.getFlagPromisedByCustomer());
			count++;
		}
		if(bean.getBudgetProject() != null) {
			dao.setConditionBudgetProject("=", bean.getBudgetProject());
			count++;
		}
		if(bean.getCostActual() != null) {
			dao.setConditionCostActual("=", bean.getCostActual());
			count++;
		}
		if(bean.getDateStageUpdated() != null) {
			dao.setConditionDateStageUpdated(">=", bean.getDateStageUpdated());
			count++;
		}
		if(bean.getDateLatestActivity() != null) {
			dao.setConditionDateLatestActivity(">=", bean.getDateLatestActivity());
			count++;
		}
		if(bean.getDateCreated() != null) {
			dao.setConditionDateCreated(">=", bean.getDateCreated());
			count++;
		}
		if(bean.getEmployeeIdCreated() != null) {
			dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
			count++;
		}
		if(bean.getDateUpdated() != null) {
			dao.setConditionDateUpdated(">=", bean.getDateUpdated());
			count++;
		}
		if(bean.getEmployeeIdUpdated() != null) {
			dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getFlagLocked() != null) {
			dao.setConditionFlagLocked("=", bean.getFlagLocked());
			count++;
		}
		if(bean.getLeadId() != null) {
			dao.setConditionLeadId("=", bean.getLeadId());
			count++;
		}
		if(bean.getMemo() != null) {
			if(bean.getMemo().indexOf("%") >= 0)
				dao.setConditionMemo("like", bean.getMemo());
			else
				dao.setConditionMemo("=", bean.getMemo());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseCrmOpportunity bean = new BaseCrmOpportunity();
		bean.setDataFromJSON(json);
		CrmOpportunity dao = new CrmOpportunity();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmOpportunity> rlist = new BaseCollection<>();
		BaseCrmOpportunity bean = new BaseCrmOpportunity();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmOpportunity dao = new CrmOpportunity();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmOpportunity> result = dao.conditionalLoad(addtion);
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
		BaseCrmOpportunity bean = new BaseCrmOpportunity();
		bean.setDataFromJSON(json);
		CrmOpportunity dao = new CrmOpportunity();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmOpportunity bean = new BaseCrmOpportunity();
		bean.setDataFromJSON(json);
		CrmOpportunity dao = new CrmOpportunity();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmOpportunity bean = new BaseCrmOpportunity();
		bean.setDataFromJSON(json);
		CrmOpportunity dao = new CrmOpportunity();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmOpportunity bean = new BaseCrmOpportunity();
		bean.setDataFromJSON(json);
		CrmOpportunity dao = new CrmOpportunity();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


