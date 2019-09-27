package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmMarketingEvent;
import java.util.List;
import fix.db.dao.CrmMarketingEvent;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmMarketingEventHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmMarketingEventHandler.class);

	public static BaseCrmMarketingEvent getCrmMarketingEventById( 
		java.lang.Integer marketing_event_id
	) throws Exception
	{
		CrmMarketingEvent dao = new CrmMarketingEvent();
		dao.setMarketingEventId(marketing_event_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmMarketingEventExists( fix.db.bean.BaseCrmMarketingEvent bean, String additional ) throws Exception {

		CrmMarketingEvent dao = new CrmMarketingEvent();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmMarketingEvent( fix.db.bean.BaseCrmMarketingEvent bean, String additional ) throws Exception {

		CrmMarketingEvent dao = new CrmMarketingEvent();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmMarketingEvent> queryCrmMarketingEvent( fix.db.bean.BaseCrmMarketingEvent bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmMarketingEvent dao = new CrmMarketingEvent();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmMarketingEvent> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmMarketingEvent> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmMarketingEvent addToCrmMarketingEvent ( BaseCrmMarketingEvent crmmarketingevent )  throws Exception {
		return addToCrmMarketingEvent ( crmmarketingevent , false);
	}

	public static BaseCrmMarketingEvent addToCrmMarketingEvent ( BaseCrmMarketingEvent crmmarketingevent, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmMarketingEvent dao = new CrmMarketingEvent();
		dao.setDataFromBase(crmmarketingevent);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmMarketingEvent addUpdateCrmMarketingEvent ( BaseCrmMarketingEvent crmmarketingevent ) throws Exception {
		return addUpdateCrmMarketingEvent ( crmmarketingevent , false);
	}

	public static BaseCrmMarketingEvent addUpdateCrmMarketingEvent ( BaseCrmMarketingEvent crmmarketingevent, boolean singleTransaction  ) throws Exception {
		if(crmmarketingevent.getMarketingEventId() == null) return addToCrmMarketingEvent(crmmarketingevent);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmMarketingEvent dao = new CrmMarketingEvent();
		dao.setDataFromBase(crmmarketingevent);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmmarketingevent); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmMarketingEvent ( BaseCrmMarketingEvent bean ) throws Exception {
		CrmMarketingEvent dao = new CrmMarketingEvent();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmMarketingEvent updateCrmMarketingEvent ( BaseCrmMarketingEvent crmmarketingevent ) throws Exception {
		CrmMarketingEvent dao = new CrmMarketingEvent();
		dao.setMarketingEventId( crmmarketingevent.getMarketingEventId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmmarketingevent);
			result = dao.update();
		}
		return result == 1 ? crmmarketingevent : null ;
	}

	public static BaseCrmMarketingEvent updateCrmMarketingEventDirect( BaseCrmMarketingEvent crmmarketingevent ) throws Exception {
		CrmMarketingEvent dao = new CrmMarketingEvent();
		int result = 0;
		dao.setDataFromBase(crmmarketingevent);
		result = dao.update();
		return result == 1 ? crmmarketingevent : null ;
	}

	public static int setDeleteConditions(BaseCrmMarketingEvent bean, CrmMarketingEvent dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getMarketingEventId() != null) {
			dao.setConditionMarketingEventId("=", bean.getMarketingEventId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getEntityType() != null) {
				dao.setConditionEntityType("=", bean.getEntityType());
				count++;
			}
			if(bean.getEmployeeIdResponsible() != null) {
				dao.setConditionEmployeeIdResponsible("=", bean.getEmployeeIdResponsible());
				count++;
			}
			if(bean.getEventName() != null) {
				dao.setConditionEventName("=", bean.getEventName());
				count++;
			}
			if(bean.getEventStatus() != null) {
				dao.setConditionEventStatus("=", bean.getEventStatus());
				count++;
			}
			if(bean.getEventType() != null) {
				dao.setConditionEventType("=", bean.getEventType());
				count++;
			}
			if(bean.getNumPeopleInvited() != null) {
				dao.setConditionNumPeopleInvited("=", bean.getNumPeopleInvited());
				count++;
			}
			if(bean.getNumPeopleAttended() != null) {
				dao.setConditionNumPeopleAttended("=", bean.getNumPeopleAttended());
				count++;
			}
			if(bean.getRevenueActual() != null) {
				dao.setConditionRevenueActual("=", bean.getRevenueActual());
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
			if(bean.getEmployeeIdLatestFollowup() != null) {
				dao.setConditionEmployeeIdLatestFollowup("=", bean.getEmployeeIdLatestFollowup());
				count++;
			}
			if(bean.getEventDetailedAddress() != null) {
				dao.setConditionEventDetailedAddress("=", bean.getEventDetailedAddress());
				count++;
			}
			if(bean.getEventDescription() != null) {
				dao.setConditionEventDescription("=", bean.getEventDescription());
				count++;
			}
			if(bean.getMarketReactionExpected() != null) {
				dao.setConditionMarketReactionExpected("=", bean.getMarketReactionExpected());
				count++;
			}
			if(bean.getMemo() != null) {
				dao.setConditionMemo("=", bean.getMemo());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmMarketingEvent bean, CrmMarketingEvent dao){
		int count = 0;
		if(bean.getMarketingEventId() != null) {
			dao.setConditionMarketingEventId("=", bean.getMarketingEventId());
			count++;
		}
		if(bean.getEntityType() != null) {
			dao.setConditionEntityType("=", bean.getEntityType());
			count++;
		}
		if(bean.getEmployeeIdResponsible() != null) {
			dao.setConditionEmployeeIdResponsible("=", bean.getEmployeeIdResponsible());
			count++;
		}
		if(bean.getEventName() != null) {
			if(bean.getEventName().indexOf("%") >= 0)
				dao.setConditionEventName("like", bean.getEventName());
			else
				dao.setConditionEventName("=", bean.getEventName());
			count++;
		}
		if(bean.getEventStatus() != null) {
			dao.setConditionEventStatus("=", bean.getEventStatus());
			count++;
		}
		if(bean.getEventType() != null) {
			dao.setConditionEventType("=", bean.getEventType());
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
		if(bean.getBudgetEvent() != null) {
			dao.setConditionBudgetEvent("=", bean.getBudgetEvent());
			count++;
		}
		if(bean.getRevenueExpected() != null) {
			dao.setConditionRevenueExpected("=", bean.getRevenueExpected());
			count++;
		}
		if(bean.getNumPeopleInvited() != null) {
			dao.setConditionNumPeopleInvited("=", bean.getNumPeopleInvited());
			count++;
		}
		if(bean.getNumPeopleAttended() != null) {
			dao.setConditionNumPeopleAttended("=", bean.getNumPeopleAttended());
			count++;
		}
		if(bean.getCostActual() != null) {
			dao.setConditionCostActual("=", bean.getCostActual());
			count++;
		}
		if(bean.getRevenueActual() != null) {
			if(bean.getRevenueActual().indexOf("%") >= 0)
				dao.setConditionRevenueActual("like", bean.getRevenueActual());
			else
				dao.setConditionRevenueActual("=", bean.getRevenueActual());
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
		if(bean.getDateLatestActivity() != null) {
			dao.setConditionDateLatestActivity(">=", bean.getDateLatestActivity());
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
		if(bean.getEmployeeIdLatestFollowup() != null) {
			dao.setConditionEmployeeIdLatestFollowup("=", bean.getEmployeeIdLatestFollowup());
			count++;
		}
		if(bean.getEventDetailedAddress() != null) {
			if(bean.getEventDetailedAddress().indexOf("%") >= 0)
				dao.setConditionEventDetailedAddress("like", bean.getEventDetailedAddress());
			else
				dao.setConditionEventDetailedAddress("=", bean.getEventDetailedAddress());
			count++;
		}
		if(bean.getEventDescription() != null) {
			if(bean.getEventDescription().indexOf("%") >= 0)
				dao.setConditionEventDescription("like", bean.getEventDescription());
			else
				dao.setConditionEventDescription("=", bean.getEventDescription());
			count++;
		}
		if(bean.getMarketReactionExpected() != null) {
			if(bean.getMarketReactionExpected().indexOf("%") >= 0)
				dao.setConditionMarketReactionExpected("like", bean.getMarketReactionExpected());
			else
				dao.setConditionMarketReactionExpected("=", bean.getMarketReactionExpected());
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
		BaseCrmMarketingEvent bean = new BaseCrmMarketingEvent();
		bean.setDataFromJSON(json);
		CrmMarketingEvent dao = new CrmMarketingEvent();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmMarketingEvent> rlist = new BaseCollection<>();
		BaseCrmMarketingEvent bean = new BaseCrmMarketingEvent();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmMarketingEvent dao = new CrmMarketingEvent();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmMarketingEvent> result = dao.conditionalLoad(addtion);
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
		BaseCrmMarketingEvent bean = new BaseCrmMarketingEvent();
		bean.setDataFromJSON(json);
		CrmMarketingEvent dao = new CrmMarketingEvent();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmMarketingEvent bean = new BaseCrmMarketingEvent();
		bean.setDataFromJSON(json);
		CrmMarketingEvent dao = new CrmMarketingEvent();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmMarketingEvent bean = new BaseCrmMarketingEvent();
		bean.setDataFromJSON(json);
		CrmMarketingEvent dao = new CrmMarketingEvent();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmMarketingEvent bean = new BaseCrmMarketingEvent();
		bean.setDataFromJSON(json);
		CrmMarketingEvent dao = new CrmMarketingEvent();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


