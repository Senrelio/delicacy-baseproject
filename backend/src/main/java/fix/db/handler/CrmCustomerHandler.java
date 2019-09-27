package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmCustomer;
import java.util.List;
import fix.db.dao.CrmCustomer;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmCustomerHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmCustomerHandler.class);

	public static BaseCrmCustomer getCrmCustomerById( 
		java.lang.Integer customer_id
	) throws Exception
	{
		CrmCustomer dao = new CrmCustomer();
		dao.setCustomerId(customer_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmCustomerExists( fix.db.bean.BaseCrmCustomer bean, String additional ) throws Exception {

		CrmCustomer dao = new CrmCustomer();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmCustomer( fix.db.bean.BaseCrmCustomer bean, String additional ) throws Exception {

		CrmCustomer dao = new CrmCustomer();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmCustomer> queryCrmCustomer( fix.db.bean.BaseCrmCustomer bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmCustomer dao = new CrmCustomer();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmCustomer> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmCustomer> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmCustomer addToCrmCustomer ( BaseCrmCustomer crmcustomer )  throws Exception {
		return addToCrmCustomer ( crmcustomer , false);
	}

	public static BaseCrmCustomer addToCrmCustomer ( BaseCrmCustomer crmcustomer, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmCustomer dao = new CrmCustomer();
		dao.setDataFromBase(crmcustomer);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmCustomer addUpdateCrmCustomer ( BaseCrmCustomer crmcustomer ) throws Exception {
		return addUpdateCrmCustomer ( crmcustomer , false);
	}

	public static BaseCrmCustomer addUpdateCrmCustomer ( BaseCrmCustomer crmcustomer, boolean singleTransaction  ) throws Exception {
		if(crmcustomer.getCustomerId() == null) return addToCrmCustomer(crmcustomer);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmCustomer dao = new CrmCustomer();
		dao.setDataFromBase(crmcustomer);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmcustomer); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmCustomer ( BaseCrmCustomer bean ) throws Exception {
		CrmCustomer dao = new CrmCustomer();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmCustomer updateCrmCustomer ( BaseCrmCustomer crmcustomer ) throws Exception {
		CrmCustomer dao = new CrmCustomer();
		dao.setCustomerId( crmcustomer.getCustomerId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmcustomer);
			result = dao.update();
		}
		return result == 1 ? crmcustomer : null ;
	}

	public static BaseCrmCustomer updateCrmCustomerDirect( BaseCrmCustomer crmcustomer ) throws Exception {
		CrmCustomer dao = new CrmCustomer();
		int result = 0;
		dao.setDataFromBase(crmcustomer);
		result = dao.update();
		return result == 1 ? crmcustomer : null ;
	}

	public static int setDeleteConditions(BaseCrmCustomer bean, CrmCustomer dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getCustomerId() != null) {
			dao.setConditionCustomerId("=", bean.getCustomerId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getCustomerCode() != null) {
				dao.setConditionCustomerCode("=", bean.getCustomerCode());
				count++;
			}
			if(bean.getLeadId() != null) {
				dao.setConditionLeadId("=", bean.getLeadId());
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
			if(bean.getCustomerName() != null) {
				dao.setConditionCustomerName("=", bean.getCustomerName());
				count++;
			}
			if(bean.getLevel() != null) {
				dao.setConditionLevel("=", bean.getLevel());
				count++;
			}
			if(bean.getParentCustomerId() != null) {
				dao.setConditionParentCustomerId("=", bean.getParentCustomerId());
				count++;
			}
			if(bean.getIndustryId() != null) {
				dao.setConditionIndustryId("=", bean.getIndustryId());
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
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
				count++;
			}
			if(bean.getFlagLocked() != null) {
				dao.setConditionFlagLocked("=", bean.getFlagLocked());
				count++;
			}
			if(bean.getFlagIndustrialCommercialRegistered() != null) {
				dao.setConditionFlagIndustrialCommercialRegistered("=", bean.getFlagIndustrialCommercialRegistered());
				count++;
			}
			if(bean.getFlagNoDisturb() != null) {
				dao.setConditionFlagNoDisturb("=", bean.getFlagNoDisturb());
				count++;
			}
			if(bean.getDaycountNotVisited() != null) {
				dao.setConditionDaycountNotVisited("=", bean.getDaycountNotVisited());
				count++;
			}
			if(bean.getDetailedAddress() != null) {
				dao.setConditionDetailedAddress("=", bean.getDetailedAddress());
				count++;
			}
			if(bean.getPostcode() != null) {
				dao.setConditionPostcode("=", bean.getPostcode());
				count++;
			}
			if(bean.getTelephone() != null) {
				dao.setConditionTelephone("=", bean.getTelephone());
				count++;
			}
			if(bean.getFax() != null) {
				dao.setConditionFax("=", bean.getFax());
				count++;
			}
			if(bean.getCompanyWebsiteLink() != null) {
				dao.setConditionCompanyWebsiteLink("=", bean.getCompanyWebsiteLink());
				count++;
			}
			if(bean.getWeibo() != null) {
				dao.setConditionWeibo("=", bean.getWeibo());
				count++;
			}
			if(bean.getNumberEmployees() != null) {
				dao.setConditionNumberEmployees("=", bean.getNumberEmployees());
				count++;
			}
			if(bean.getMemo() != null) {
				dao.setConditionMemo("=", bean.getMemo());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmCustomer bean, CrmCustomer dao){
		int count = 0;
		if(bean.getCustomerId() != null) {
			dao.setConditionCustomerId("=", bean.getCustomerId());
			count++;
		}
		if(bean.getCustomerCode() != null) {
			if(bean.getCustomerCode().indexOf("%") >= 0)
				dao.setConditionCustomerCode("like", bean.getCustomerCode());
			else
				dao.setConditionCustomerCode("=", bean.getCustomerCode());
			count++;
		}
		if(bean.getLeadId() != null) {
			dao.setConditionLeadId("=", bean.getLeadId());
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
		if(bean.getCustomerName() != null) {
			if(bean.getCustomerName().indexOf("%") >= 0)
				dao.setConditionCustomerName("like", bean.getCustomerName());
			else
				dao.setConditionCustomerName("=", bean.getCustomerName());
			count++;
		}
		if(bean.getLevel() != null) {
			dao.setConditionLevel("=", bean.getLevel());
			count++;
		}
		if(bean.getParentCustomerId() != null) {
			dao.setConditionParentCustomerId("=", bean.getParentCustomerId());
			count++;
		}
		if(bean.getIndustryId() != null) {
			dao.setConditionIndustryId("=", bean.getIndustryId());
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
		if(bean.getDateLatestActivity() != null) {
			dao.setConditionDateLatestActivity(">=", bean.getDateLatestActivity());
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
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getFlagLocked() != null) {
			dao.setConditionFlagLocked("=", bean.getFlagLocked());
			count++;
		}
		if(bean.getFlagIndustrialCommercialRegistered() != null) {
			dao.setConditionFlagIndustrialCommercialRegistered("=", bean.getFlagIndustrialCommercialRegistered());
			count++;
		}
		if(bean.getFlagNoDisturb() != null) {
			dao.setConditionFlagNoDisturb("=", bean.getFlagNoDisturb());
			count++;
		}
		if(bean.getDateLatestVisit() != null) {
			dao.setConditionDateLatestVisit(">=", bean.getDateLatestVisit());
			count++;
		}
		if(bean.getDaycountNotVisited() != null) {
			dao.setConditionDaycountNotVisited("=", bean.getDaycountNotVisited());
			count++;
		}
		if(bean.getDetailedAddress() != null) {
			if(bean.getDetailedAddress().indexOf("%") >= 0)
				dao.setConditionDetailedAddress("like", bean.getDetailedAddress());
			else
				dao.setConditionDetailedAddress("=", bean.getDetailedAddress());
			count++;
		}
		if(bean.getPostcode() != null) {
			if(bean.getPostcode().indexOf("%") >= 0)
				dao.setConditionPostcode("like", bean.getPostcode());
			else
				dao.setConditionPostcode("=", bean.getPostcode());
			count++;
		}
		if(bean.getTelephone() != null) {
			if(bean.getTelephone().indexOf("%") >= 0)
				dao.setConditionTelephone("like", bean.getTelephone());
			else
				dao.setConditionTelephone("=", bean.getTelephone());
			count++;
		}
		if(bean.getFax() != null) {
			if(bean.getFax().indexOf("%") >= 0)
				dao.setConditionFax("like", bean.getFax());
			else
				dao.setConditionFax("=", bean.getFax());
			count++;
		}
		if(bean.getCompanyWebsiteLink() != null) {
			if(bean.getCompanyWebsiteLink().indexOf("%") >= 0)
				dao.setConditionCompanyWebsiteLink("like", bean.getCompanyWebsiteLink());
			else
				dao.setConditionCompanyWebsiteLink("=", bean.getCompanyWebsiteLink());
			count++;
		}
		if(bean.getWeibo() != null) {
			if(bean.getWeibo().indexOf("%") >= 0)
				dao.setConditionWeibo("like", bean.getWeibo());
			else
				dao.setConditionWeibo("=", bean.getWeibo());
			count++;
		}
		if(bean.getNumberEmployees() != null) {
			dao.setConditionNumberEmployees("=", bean.getNumberEmployees());
			count++;
		}
		if(bean.getAnnualRevenue() != null) {
			dao.setConditionAnnualRevenue("=", bean.getAnnualRevenue());
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
		BaseCrmCustomer bean = new BaseCrmCustomer();
		bean.setDataFromJSON(json);
		CrmCustomer dao = new CrmCustomer();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmCustomer> rlist = new BaseCollection<>();
		BaseCrmCustomer bean = new BaseCrmCustomer();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmCustomer dao = new CrmCustomer();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmCustomer> result = dao.conditionalLoad(addtion);
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
		BaseCrmCustomer bean = new BaseCrmCustomer();
		bean.setDataFromJSON(json);
		CrmCustomer dao = new CrmCustomer();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmCustomer bean = new BaseCrmCustomer();
		bean.setDataFromJSON(json);
		CrmCustomer dao = new CrmCustomer();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmCustomer bean = new BaseCrmCustomer();
		bean.setDataFromJSON(json);
		CrmCustomer dao = new CrmCustomer();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmCustomer bean = new BaseCrmCustomer();
		bean.setDataFromJSON(json);
		CrmCustomer dao = new CrmCustomer();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


