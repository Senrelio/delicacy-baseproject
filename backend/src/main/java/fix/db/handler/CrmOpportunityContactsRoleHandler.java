package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmOpportunityContactsRole;
import java.util.List;
import fix.db.dao.CrmOpportunityContactsRole;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmOpportunityContactsRoleHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmOpportunityContactsRoleHandler.class);

	public static BaseCrmOpportunityContactsRole getCrmOpportunityContactsRoleById( 
		java.lang.Integer opportunity_contact_role_id
	) throws Exception
	{
		CrmOpportunityContactsRole dao = new CrmOpportunityContactsRole();
		dao.setOpportunityContactRoleId(opportunity_contact_role_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmOpportunityContactsRoleExists( fix.db.bean.BaseCrmOpportunityContactsRole bean, String additional ) throws Exception {

		CrmOpportunityContactsRole dao = new CrmOpportunityContactsRole();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmOpportunityContactsRole( fix.db.bean.BaseCrmOpportunityContactsRole bean, String additional ) throws Exception {

		CrmOpportunityContactsRole dao = new CrmOpportunityContactsRole();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmOpportunityContactsRole> queryCrmOpportunityContactsRole( fix.db.bean.BaseCrmOpportunityContactsRole bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmOpportunityContactsRole dao = new CrmOpportunityContactsRole();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmOpportunityContactsRole> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmOpportunityContactsRole> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmOpportunityContactsRole addToCrmOpportunityContactsRole ( BaseCrmOpportunityContactsRole crmopportunitycontactsrole )  throws Exception {
		return addToCrmOpportunityContactsRole ( crmopportunitycontactsrole , false);
	}

	public static BaseCrmOpportunityContactsRole addToCrmOpportunityContactsRole ( BaseCrmOpportunityContactsRole crmopportunitycontactsrole, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmOpportunityContactsRole dao = new CrmOpportunityContactsRole();
		dao.setDataFromBase(crmopportunitycontactsrole);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmOpportunityContactsRole addUpdateCrmOpportunityContactsRole ( BaseCrmOpportunityContactsRole crmopportunitycontactsrole ) throws Exception {
		return addUpdateCrmOpportunityContactsRole ( crmopportunitycontactsrole , false);
	}

	public static BaseCrmOpportunityContactsRole addUpdateCrmOpportunityContactsRole ( BaseCrmOpportunityContactsRole crmopportunitycontactsrole, boolean singleTransaction  ) throws Exception {
		if(crmopportunitycontactsrole.getOpportunityContactRoleId() == null) return addToCrmOpportunityContactsRole(crmopportunitycontactsrole);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmOpportunityContactsRole dao = new CrmOpportunityContactsRole();
		dao.setDataFromBase(crmopportunitycontactsrole);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmopportunitycontactsrole); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmOpportunityContactsRole ( BaseCrmOpportunityContactsRole bean ) throws Exception {
		CrmOpportunityContactsRole dao = new CrmOpportunityContactsRole();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmOpportunityContactsRole updateCrmOpportunityContactsRole ( BaseCrmOpportunityContactsRole crmopportunitycontactsrole ) throws Exception {
		CrmOpportunityContactsRole dao = new CrmOpportunityContactsRole();
		dao.setOpportunityContactRoleId( crmopportunitycontactsrole.getOpportunityContactRoleId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmopportunitycontactsrole);
			result = dao.update();
		}
		return result == 1 ? crmopportunitycontactsrole : null ;
	}

	public static BaseCrmOpportunityContactsRole updateCrmOpportunityContactsRoleDirect( BaseCrmOpportunityContactsRole crmopportunitycontactsrole ) throws Exception {
		CrmOpportunityContactsRole dao = new CrmOpportunityContactsRole();
		int result = 0;
		dao.setDataFromBase(crmopportunitycontactsrole);
		result = dao.update();
		return result == 1 ? crmopportunitycontactsrole : null ;
	}

	public static int setDeleteConditions(BaseCrmOpportunityContactsRole bean, CrmOpportunityContactsRole dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getOpportunityContactRoleId() != null) {
			dao.setConditionOpportunityContactRoleId("=", bean.getOpportunityContactRoleId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getEntityType() != null) {
				dao.setConditionEntityType("=", bean.getEntityType());
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
			if(bean.getFlagMainContact() != null) {
				dao.setConditionFlagMainContact("=", bean.getFlagMainContact());
				count++;
			}
			if(bean.getCustomerId() != null) {
				dao.setConditionCustomerId("=", bean.getCustomerId());
				count++;
			}
			if(bean.getPosition() != null) {
				dao.setConditionPosition("=", bean.getPosition());
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
			if(bean.getContactRoleInOpportunity() != null) {
				dao.setConditionContactRoleInOpportunity("=", bean.getContactRoleInOpportunity());
				count++;
			}
			if(bean.getContactStandpointInOpportunity() != null) {
				dao.setConditionContactStandpointInOpportunity("=", bean.getContactStandpointInOpportunity());
				count++;
			}
			if(bean.getContactFamiliarity() != null) {
				dao.setConditionContactFamiliarity("=", bean.getContactFamiliarity());
				count++;
			}
			if(bean.getContactRoleInCustomer() != null) {
				dao.setConditionContactRoleInCustomer("=", bean.getContactRoleInCustomer());
				count++;
			}
			if(bean.getIdentifiableCharacteristic() != null) {
				dao.setConditionIdentifiableCharacteristic("=", bean.getIdentifiableCharacteristic());
				count++;
			}
			if(bean.getEmployeeIdMaintainerAtThatTime() != null) {
				dao.setConditionEmployeeIdMaintainerAtThatTime("=", bean.getEmployeeIdMaintainerAtThatTime());
				count++;
			}
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
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
		}
		return count;
	}

	public static int setConditions(BaseCrmOpportunityContactsRole bean, CrmOpportunityContactsRole dao){
		int count = 0;
		if(bean.getOpportunityContactRoleId() != null) {
			dao.setConditionOpportunityContactRoleId("=", bean.getOpportunityContactRoleId());
			count++;
		}
		if(bean.getEntityType() != null) {
			dao.setConditionEntityType("=", bean.getEntityType());
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
		if(bean.getFlagMainContact() != null) {
			dao.setConditionFlagMainContact("=", bean.getFlagMainContact());
			count++;
		}
		if(bean.getCustomerId() != null) {
			dao.setConditionCustomerId("=", bean.getCustomerId());
			count++;
		}
		if(bean.getPosition() != null) {
			if(bean.getPosition().indexOf("%") >= 0)
				dao.setConditionPosition("like", bean.getPosition());
			else
				dao.setConditionPosition("=", bean.getPosition());
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
		if(bean.getContactRoleInOpportunity() != null) {
			dao.setConditionContactRoleInOpportunity("=", bean.getContactRoleInOpportunity());
			count++;
		}
		if(bean.getContactStandpointInOpportunity() != null) {
			dao.setConditionContactStandpointInOpportunity("=", bean.getContactStandpointInOpportunity());
			count++;
		}
		if(bean.getContactFamiliarity() != null) {
			dao.setConditionContactFamiliarity("=", bean.getContactFamiliarity());
			count++;
		}
		if(bean.getContactRoleInCustomer() != null) {
			dao.setConditionContactRoleInCustomer("=", bean.getContactRoleInCustomer());
			count++;
		}
		if(bean.getIdentifiableCharacteristic() != null) {
			dao.setConditionIdentifiableCharacteristic("=", bean.getIdentifiableCharacteristic());
			count++;
		}
		if(bean.getEmployeeIdMaintainerAtThatTime() != null) {
			dao.setConditionEmployeeIdMaintainerAtThatTime("=", bean.getEmployeeIdMaintainerAtThatTime());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
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
		if(bean.getEmployeeIdUpdated() != null) {
			dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
			count++;
		}
		if(bean.getDateUpdated() != null) {
			dao.setConditionDateUpdated(">=", bean.getDateUpdated());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseCrmOpportunityContactsRole bean = new BaseCrmOpportunityContactsRole();
		bean.setDataFromJSON(json);
		CrmOpportunityContactsRole dao = new CrmOpportunityContactsRole();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmOpportunityContactsRole> rlist = new BaseCollection<>();
		BaseCrmOpportunityContactsRole bean = new BaseCrmOpportunityContactsRole();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmOpportunityContactsRole dao = new CrmOpportunityContactsRole();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmOpportunityContactsRole> result = dao.conditionalLoad(addtion);
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
		BaseCrmOpportunityContactsRole bean = new BaseCrmOpportunityContactsRole();
		bean.setDataFromJSON(json);
		CrmOpportunityContactsRole dao = new CrmOpportunityContactsRole();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmOpportunityContactsRole bean = new BaseCrmOpportunityContactsRole();
		bean.setDataFromJSON(json);
		CrmOpportunityContactsRole dao = new CrmOpportunityContactsRole();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmOpportunityContactsRole bean = new BaseCrmOpportunityContactsRole();
		bean.setDataFromJSON(json);
		CrmOpportunityContactsRole dao = new CrmOpportunityContactsRole();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmOpportunityContactsRole bean = new BaseCrmOpportunityContactsRole();
		bean.setDataFromJSON(json);
		CrmOpportunityContactsRole dao = new CrmOpportunityContactsRole();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


