package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmLead;
import java.util.List;
import fix.db.dao.CrmLead;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmLeadHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmLeadHandler.class);

	public static BaseCrmLead getCrmLeadById( 
		java.lang.Integer lead_id
	) throws Exception
	{
		CrmLead dao = new CrmLead();
		dao.setLeadId(lead_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmLeadExists( fix.db.bean.BaseCrmLead bean, String additional ) throws Exception {

		CrmLead dao = new CrmLead();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmLead( fix.db.bean.BaseCrmLead bean, String additional ) throws Exception {

		CrmLead dao = new CrmLead();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmLead> queryCrmLead( fix.db.bean.BaseCrmLead bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmLead dao = new CrmLead();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmLead> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmLead> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmLead addToCrmLead ( BaseCrmLead crmlead )  throws Exception {
		return addToCrmLead ( crmlead , false);
	}

	public static BaseCrmLead addToCrmLead ( BaseCrmLead crmlead, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmLead dao = new CrmLead();
		dao.setDataFromBase(crmlead);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmLead addUpdateCrmLead ( BaseCrmLead crmlead ) throws Exception {
		return addUpdateCrmLead ( crmlead , false);
	}

	public static BaseCrmLead addUpdateCrmLead ( BaseCrmLead crmlead, boolean singleTransaction  ) throws Exception {
		if(crmlead.getLeadId() == null) return addToCrmLead(crmlead);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmLead dao = new CrmLead();
		dao.setDataFromBase(crmlead);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmlead); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmLead ( BaseCrmLead bean ) throws Exception {
		CrmLead dao = new CrmLead();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmLead updateCrmLead ( BaseCrmLead crmlead ) throws Exception {
		CrmLead dao = new CrmLead();
		dao.setLeadId( crmlead.getLeadId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmlead);
			result = dao.update();
		}
		return result == 1 ? crmlead : null ;
	}

	public static BaseCrmLead updateCrmLeadDirect( BaseCrmLead crmlead ) throws Exception {
		CrmLead dao = new CrmLead();
		int result = 0;
		dao.setDataFromBase(crmlead);
		result = dao.update();
		return result == 1 ? crmlead : null ;
	}

	public static int setDeleteConditions(BaseCrmLead bean, CrmLead dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getLeadId() != null) {
			dao.setConditionLeadId("=", bean.getLeadId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getEventType() != null) {
				dao.setConditionEventType("=", bean.getEventType());
				count++;
			}
			if(bean.getEmployeeIdMaintainer() != null) {
				dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
				count++;
			}
			if(bean.getStatusFollowup() != null) {
				dao.setConditionStatusFollowup("=", bean.getStatusFollowup());
				count++;
			}
			if(bean.getLeadContactName() != null) {
				dao.setConditionLeadContactName("=", bean.getLeadContactName());
				count++;
			}
			if(bean.getPotentialCustomerName() != null) {
				dao.setConditionPotentialCustomerName("=", bean.getPotentialCustomerName());
				count++;
			}
			if(bean.getTelephone() != null) {
				dao.setConditionTelephone("=", bean.getTelephone());
				count++;
			}
			if(bean.getMobile() != null) {
				dao.setConditionMobile("=", bean.getMobile());
				count++;
			}
			if(bean.getEmail() != null) {
				dao.setConditionEmail("=", bean.getEmail());
				count++;
			}
			if(bean.getAreaProvince() != null) {
				dao.setConditionAreaProvince("=", bean.getAreaProvince());
				count++;
			}
			if(bean.getAreaCity() != null) {
				dao.setConditionAreaCity("=", bean.getAreaCity());
				count++;
			}
			if(bean.getAreaDistrict() != null) {
				dao.setConditionAreaDistrict("=", bean.getAreaDistrict());
				count++;
			}
			if(bean.getDetailedAddress() != null) {
				dao.setConditionDetailedAddress("=", bean.getDetailedAddress());
				count++;
			}
			if(bean.getLeadSourceId() != null) {
				dao.setConditionLeadSourceId("=", bean.getLeadSourceId());
				count++;
			}
			if(bean.getMarketingEventId() != null) {
				dao.setConditionMarketingEventId("=", bean.getMarketingEventId());
				count++;
			}
			if(bean.getEmployeeIdLatestFollowup() != null) {
				dao.setConditionEmployeeIdLatestFollowup("=", bean.getEmployeeIdLatestFollowup());
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
			if(bean.getFlagLocked() != null) {
				dao.setConditionFlagLocked("=", bean.getFlagLocked());
				count++;
			}
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
				count++;
			}
			if(bean.getFlagNoDisturb() != null) {
				dao.setConditionFlagNoDisturb("=", bean.getFlagNoDisturb());
				count++;
			}
			if(bean.getOpportunityId() != null) {
				dao.setConditionOpportunityId("=", bean.getOpportunityId());
				count++;
			}
			if(bean.getContactId() != null) {
				dao.setConditionContactId("=", bean.getContactId());
				count++;
			}
			if(bean.getCustomerId() != null) {
				dao.setConditionCustomerId("=", bean.getCustomerId());
				count++;
			}
			if(bean.getGender() != null) {
				dao.setConditionGender("=", bean.getGender());
				count++;
			}
			if(bean.getPendingDepartmentId() != null) {
				dao.setConditionPendingDepartmentId("=", bean.getPendingDepartmentId());
				count++;
			}
			if(bean.getPosition() != null) {
				dao.setConditionPosition("=", bean.getPosition());
				count++;
			}
			if(bean.getWechat() != null) {
				dao.setConditionWechat("=", bean.getWechat());
				count++;
			}
			if(bean.getWeibo() != null) {
				dao.setConditionWeibo("=", bean.getWeibo());
				count++;
			}
			if(bean.getPostcode() != null) {
				dao.setConditionPostcode("=", bean.getPostcode());
				count++;
			}
			if(bean.getMemo() != null) {
				dao.setConditionMemo("=", bean.getMemo());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmLead bean, CrmLead dao){
		int count = 0;
		if(bean.getLeadId() != null) {
			dao.setConditionLeadId("=", bean.getLeadId());
			count++;
		}
		if(bean.getEventType() != null) {
			dao.setConditionEventType("=", bean.getEventType());
			count++;
		}
		if(bean.getEmployeeIdMaintainer() != null) {
			dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
			count++;
		}
		if(bean.getStatusFollowup() != null) {
			dao.setConditionStatusFollowup("=", bean.getStatusFollowup());
			count++;
		}
		if(bean.getLeadContactName() != null) {
			if(bean.getLeadContactName().indexOf("%") >= 0)
				dao.setConditionLeadContactName("like", bean.getLeadContactName());
			else
				dao.setConditionLeadContactName("=", bean.getLeadContactName());
			count++;
		}
		if(bean.getPotentialCustomerName() != null) {
			if(bean.getPotentialCustomerName().indexOf("%") >= 0)
				dao.setConditionPotentialCustomerName("like", bean.getPotentialCustomerName());
			else
				dao.setConditionPotentialCustomerName("=", bean.getPotentialCustomerName());
			count++;
		}
		if(bean.getTelephone() != null) {
			if(bean.getTelephone().indexOf("%") >= 0)
				dao.setConditionTelephone("like", bean.getTelephone());
			else
				dao.setConditionTelephone("=", bean.getTelephone());
			count++;
		}
		if(bean.getMobile() != null) {
			if(bean.getMobile().indexOf("%") >= 0)
				dao.setConditionMobile("like", bean.getMobile());
			else
				dao.setConditionMobile("=", bean.getMobile());
			count++;
		}
		if(bean.getEmail() != null) {
			if(bean.getEmail().indexOf("%") >= 0)
				dao.setConditionEmail("like", bean.getEmail());
			else
				dao.setConditionEmail("=", bean.getEmail());
			count++;
		}
		if(bean.getAreaProvince() != null) {
			dao.setConditionAreaProvince("=", bean.getAreaProvince());
			count++;
		}
		if(bean.getAreaCity() != null) {
			dao.setConditionAreaCity("=", bean.getAreaCity());
			count++;
		}
		if(bean.getAreaDistrict() != null) {
			dao.setConditionAreaDistrict("=", bean.getAreaDistrict());
			count++;
		}
		if(bean.getDetailedAddress() != null) {
			if(bean.getDetailedAddress().indexOf("%") >= 0)
				dao.setConditionDetailedAddress("like", bean.getDetailedAddress());
			else
				dao.setConditionDetailedAddress("=", bean.getDetailedAddress());
			count++;
		}
		if(bean.getLeadSourceId() != null) {
			if(bean.getLeadSourceId().indexOf("%") >= 0)
				dao.setConditionLeadSourceId("like", bean.getLeadSourceId());
			else
				dao.setConditionLeadSourceId("=", bean.getLeadSourceId());
			count++;
		}
		if(bean.getDateLatestActivity() != null) {
			dao.setConditionDateLatestActivity(">=", bean.getDateLatestActivity());
			count++;
		}
		if(bean.getMarketingEventId() != null) {
			dao.setConditionMarketingEventId("=", bean.getMarketingEventId());
			count++;
		}
		if(bean.getEmployeeIdLatestFollowup() != null) {
			dao.setConditionEmployeeIdLatestFollowup("=", bean.getEmployeeIdLatestFollowup());
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
		if(bean.getFlagLocked() != null) {
			dao.setConditionFlagLocked("=", bean.getFlagLocked());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getFlagNoDisturb() != null) {
			dao.setConditionFlagNoDisturb("=", bean.getFlagNoDisturb());
			count++;
		}
		if(bean.getOpportunityId() != null) {
			dao.setConditionOpportunityId("=", bean.getOpportunityId());
			count++;
		}
		if(bean.getContactId() != null) {
			dao.setConditionContactId("=", bean.getContactId());
			count++;
		}
		if(bean.getCustomerId() != null) {
			dao.setConditionCustomerId("=", bean.getCustomerId());
			count++;
		}
		if(bean.getGender() != null) {
			dao.setConditionGender("=", bean.getGender());
			count++;
		}
		if(bean.getPendingDepartmentId() != null) {
			if(bean.getPendingDepartmentId().indexOf("%") >= 0)
				dao.setConditionPendingDepartmentId("like", bean.getPendingDepartmentId());
			else
				dao.setConditionPendingDepartmentId("=", bean.getPendingDepartmentId());
			count++;
		}
		if(bean.getPosition() != null) {
			if(bean.getPosition().indexOf("%") >= 0)
				dao.setConditionPosition("like", bean.getPosition());
			else
				dao.setConditionPosition("=", bean.getPosition());
			count++;
		}
		if(bean.getWechat() != null) {
			if(bean.getWechat().indexOf("%") >= 0)
				dao.setConditionWechat("like", bean.getWechat());
			else
				dao.setConditionWechat("=", bean.getWechat());
			count++;
		}
		if(bean.getWeibo() != null) {
			if(bean.getWeibo().indexOf("%") >= 0)
				dao.setConditionWeibo("like", bean.getWeibo());
			else
				dao.setConditionWeibo("=", bean.getWeibo());
			count++;
		}
		if(bean.getPostcode() != null) {
			if(bean.getPostcode().indexOf("%") >= 0)
				dao.setConditionPostcode("like", bean.getPostcode());
			else
				dao.setConditionPostcode("=", bean.getPostcode());
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
		BaseCrmLead bean = new BaseCrmLead();
		bean.setDataFromJSON(json);
		CrmLead dao = new CrmLead();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmLead> rlist = new BaseCollection<>();
		BaseCrmLead bean = new BaseCrmLead();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmLead dao = new CrmLead();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmLead> result = dao.conditionalLoad(addtion);
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
		BaseCrmLead bean = new BaseCrmLead();
		bean.setDataFromJSON(json);
		CrmLead dao = new CrmLead();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmLead bean = new BaseCrmLead();
		bean.setDataFromJSON(json);
		CrmLead dao = new CrmLead();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmLead bean = new BaseCrmLead();
		bean.setDataFromJSON(json);
		CrmLead dao = new CrmLead();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmLead bean = new BaseCrmLead();
		bean.setDataFromJSON(json);
		CrmLead dao = new CrmLead();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


