package com.customerlist.handler;


import java.util.List;
import delicacy.common.BaseCollection;
import delicacy.connection.ThreadConnection;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import com.customerlist.bean.BaseCrmCustomerWithC;
import com.customerlist.dao.CrmCustomerWithC;
import fix.db.dao.CrmContactsCustomer;
import org.apache.log4j.Logger;
import delicacy.common.GenericDao;
import delicacy.connection.ThreadConnection;
import delicacy.date.util.TimeSpanCalculator;

public class CrmCustomerWithCHandler implements GenericDao {

	public final static ThreadLocal currentRequest = new ThreadLocal();

	private static final Logger __logger = Logger.getLogger(CrmCustomerWithCHandler.class);

	public static BaseCrmCustomerWithC getCrmCustomerWithCById( java.lang.Integer customer_id )
	{
		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			BaseCrmCustomerWithC result;
			CrmCustomerWithC dao = new CrmCustomerWithC();
			dao.setCustomerId(customer_id);
			if(dao.load(true)){
				result = dao.generateBaseExt();
				tsc.recordTime();
				__logger.info(String.format("Get CrmCustomerWithC By ID time used : [%1$d]", tsc.getLastTime()));
				return result;
			}
			return null;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static boolean isCrmCustomerWithCExists( com.customerlist.bean.BaseCrmCustomerWithC bean, String additional ) {

		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			CrmCustomerWithC dao = new CrmCustomerWithC();
			setConditions(bean, dao);
			boolean res = dao.isExist(additional);
			tsc.recordTime();
			__logger.info(String.format("Query CrmCustomerWithC List time used : [%1$d]", tsc.getLastTime()));
			return res;
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public static int countCrmCustomerWithC( com.customerlist.bean.BaseCrmCustomerWithC bean, String additional ) {

		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			CrmCustomerWithC dao = new CrmCustomerWithC();
			setConditions(bean, dao);
			int res = dao.countRows(additional);
			tsc.recordTime();
			__logger.info(String.format("Query CrmCustomerWithC List time used : [%1$d]", tsc.getLastTime()));
			return res;
		} catch(Exception ex) {
			ex.printStackTrace();
			return 0;
		}
	}

	public static BaseCollection<BaseCrmCustomerWithC> queryCrmCustomerWithC( BaseCrmCustomerWithC bean, int pageNo, int pageLines, String additionalCondition ) {
		__logger.info(String.format("Current Page No. [%1$d]", pageNo));
		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			CrmCustomerWithC dao = new CrmCustomerWithC();
			setConditions(bean, dao);
			dao.setCurrentPage(pageNo);
			dao.setPageLines(pageLines);
			List<BaseCrmCustomerWithC> result = dao.conditionalLoadExt(additionalCondition);
			BaseCollection<BaseCrmCustomerWithC> col = new BaseCollection<>();
			col.setCollections(result);
			col.setTotalPages(dao.getTotalPages());
			col.setCurrentPage(dao.getCurrentPage());
			col.setPageLines(dao.getPageLines());
			col.setTotalLines(dao.getTotalLines());
			col.setRecordNumber(result.size());
			tsc.recordTime();
			__logger.info(String.format("Query CrmCustomerWithC List time used : [%1$d]", tsc.getLastTime()));
			return col;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static BaseCrmCustomerWithC addToCrmCustomerWithC ( BaseCrmCustomerWithC crmcustomerwithc ) {
		return addToCrmCustomerWithC ( crmcustomerwithc , false);
	}

	public static BaseCrmCustomerWithC addToCrmCustomerWithC ( BaseCrmCustomerWithC crmcustomerwithc, boolean singleTransaction ) {
		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			if(singleTransaction) ThreadConnection.beginTransaction();
			CrmCustomerWithC dao = new CrmCustomerWithC();
			dao.setDataFromBase(crmcustomerwithc);
			int result = dao.save();
			if(singleTransaction) ThreadConnection.commit();
			tsc.recordTime();
			__logger.info(String.format("Add to CrmCustomerWithC time used : [%1$d]", tsc.getLastTime()));
			return result==1?dao.generateBaseExt():null;
		} catch(Exception ex) {
			if(singleTransaction) ThreadConnection.rollback();
			ex.printStackTrace();
			return null;
		}
	}

	public static BaseCrmCustomerWithC addUpdateCrmCustomerWithC ( BaseCrmCustomerWithC crmcustomerwithc ) {
		return addUpdateCrmCustomerWithC ( crmcustomerwithc , false);
	}

	public static BaseCrmCustomerWithC addUpdateCrmCustomerWithC ( BaseCrmCustomerWithC crmcustomerwithc, boolean singleTransaction  ) {
		if(crmcustomerwithc.getCustomerId() == null) return addToCrmCustomerWithC(crmcustomerwithc);
		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			if(singleTransaction) ThreadConnection.beginTransaction();
			CrmCustomerWithC dao = new CrmCustomerWithC();
			dao.setDataFromBase(crmcustomerwithc);
			int result = 0;
			if(dao.load()) {
				dao.setDataFromBase(crmcustomerwithc); 
				if(dao.isThisObjectModified()) { 
					result = dao.update();
				} else result = 1;
			} else result = dao.save();
			if(singleTransaction) ThreadConnection.commit();
			tsc.recordTime();
			__logger.info(String.format("Add to CrmCustomerWithC time used : [%1$d]", tsc.getLastTime()));
			return result==1?dao.generateBaseExt():null;
		} catch(Exception ex) {
			if(singleTransaction) ThreadConnection.rollback();
			ex.printStackTrace();
			return null;
		}
	}

	public static BaseCrmCustomerWithC deleteCrmCustomerWithC ( BaseCrmCustomerWithC bean ) {
		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			CrmCustomerWithC dao = new CrmCustomerWithC();
			setDeleteConditions(bean, dao);
			int result = dao.conditionalDelete();
			tsc.recordTime();
			__logger.info(String.format("Delete CrmCustomerWithC time used : [%1$d]", tsc.getLastTime()));
			return result == 1 ? bean : null ;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static BaseCrmCustomerWithC updateCrmCustomerWithC ( BaseCrmCustomerWithC crmcustomerwithc ) {
		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			CrmCustomerWithC dao = new CrmCustomerWithC();
			dao.setCustomerId( crmcustomerwithc.getCustomerId() );
			int result = 0;
			if( dao.load() ) {
				dao.setDataFromBase(crmcustomerwithc);
				result = dao.update();
			}
			tsc.recordTime();
			__logger.info(String.format("Update CrmCustomerWithC time used : [%1$d]", tsc.getLastTime()));
			return result == 1 ? crmcustomerwithc : null ;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static BaseCrmCustomerWithC updateCrmCustomerWithCDirect( BaseCrmCustomerWithC crmcustomerwithc ) {
		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			CrmCustomerWithC dao = new CrmCustomerWithC();
			int result = 0;
			dao.setDataFromBase(crmcustomerwithc);
			result = dao.update();
			tsc.recordTime();
			__logger.info(String.format("Update CrmCustomerWithC time used : [%1$d]", tsc.getLastTime()));
			return result == 1 ? crmcustomerwithc : null ;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static int setDeleteConditions(BaseCrmCustomerWithC bean, CrmCustomerWithC dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getCustomerId() != null) {
			dao.setCustomerId(bean.getCustomerId());
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

	public static int setConditions(BaseCrmCustomerWithC bean, CrmCustomerWithC dao){
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
		BaseCrmCustomerWithC bean = new BaseCrmCustomerWithC();
		bean.setDataFromJSON(json);
		CrmCustomerWithC dao = new CrmCustomerWithC();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load(true)) {
			dao.setDataToBase(bean);
			return bean.toOneLineJSON(1,null);
		}
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmCustomerWithC> rlist = new BaseCollection<>();
		BaseCrmCustomerWithC bean = new BaseCrmCustomerWithC();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmCustomerWithC dao = new CrmCustomerWithC();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmCustomerWithC> result = dao.conditionalLoadExt(addtion);
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
		BaseCrmCustomerWithC bean = new BaseCrmCustomerWithC();
		bean.setDataFromJSON(json);
		CrmCustomerWithC dao = new CrmCustomerWithC();
		ThreadConnection.beginTransaction();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		ThreadConnection.commit();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmCustomerWithC bean = new BaseCrmCustomerWithC();
		bean.setDataFromJSON(json);
		int num = 0;
		CrmCustomerWithC dao = new CrmCustomerWithC();
		ThreadConnection.beginTransaction();
		dao.setDataFromBase(bean);
		if(dao.isPrimaryKeyNull()) num = dao.save();
		else if(dao.load()){ dao.setDataFromBase(bean); num = dao.update(); }
		ThreadConnection.commit();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmCustomerWithC bean = new BaseCrmCustomerWithC();
		bean.setDataFromJSON(json);
		CrmCustomerWithC dao = new CrmCustomerWithC();
		ThreadConnection.beginTransaction();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		ThreadConnection.commit();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmCustomerWithC bean = new BaseCrmCustomerWithC();
		bean.setDataFromJSON(json);
		CrmCustomerWithC dao = new CrmCustomerWithC();
		ThreadConnection.beginTransaction();
		dao.setDataFromBase(bean);
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		ThreadConnection.commit();
		return bean.toOneLineJSON(num, null);
	}

}


