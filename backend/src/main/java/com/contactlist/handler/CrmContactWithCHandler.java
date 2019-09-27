package com.contactlist.handler;


import java.util.List;
import delicacy.common.BaseCollection;
import delicacy.connection.ThreadConnection;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import com.contactlist.bean.BaseCrmContactWithC;
import com.contactlist.dao.CrmContactWithC;
import fix.db.dao.CrmContactsCustomer;
import org.apache.log4j.Logger;
import delicacy.common.GenericDao;
import delicacy.connection.ThreadConnection;
import delicacy.date.util.TimeSpanCalculator;

public class CrmContactWithCHandler implements GenericDao {

	public final static ThreadLocal currentRequest = new ThreadLocal();

	private static final Logger __logger = Logger.getLogger(CrmContactWithCHandler.class);

	public static BaseCrmContactWithC getCrmContactWithCById( java.lang.Integer contact_id )
	{
		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			BaseCrmContactWithC result;
			CrmContactWithC dao = new CrmContactWithC();
			dao.setContactId(contact_id);
			if(dao.load(true)){
				result = dao.generateBaseExt();
				tsc.recordTime();
				__logger.info(String.format("Get CrmContactWithC By ID time used : [%1$d]", tsc.getLastTime()));
				return result;
			}
			return null;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static boolean isCrmContactWithCExists( com.contactlist.bean.BaseCrmContactWithC bean, String additional ) {

		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			CrmContactWithC dao = new CrmContactWithC();
			setConditions(bean, dao);
			boolean res = dao.isExist(additional);
			tsc.recordTime();
			__logger.info(String.format("Query CrmContactWithC List time used : [%1$d]", tsc.getLastTime()));
			return res;
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public static int countCrmContactWithC( com.contactlist.bean.BaseCrmContactWithC bean, String additional ) {

		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			CrmContactWithC dao = new CrmContactWithC();
			setConditions(bean, dao);
			int res = dao.countRows(additional);
			tsc.recordTime();
			__logger.info(String.format("Query CrmContactWithC List time used : [%1$d]", tsc.getLastTime()));
			return res;
		} catch(Exception ex) {
			ex.printStackTrace();
			return 0;
		}
	}

	public static BaseCollection<BaseCrmContactWithC> queryCrmContactWithC( BaseCrmContactWithC bean, int pageNo, int pageLines, String additionalCondition ) {
		__logger.info(String.format("Current Page No. [%1$d]", pageNo));
		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			CrmContactWithC dao = new CrmContactWithC();
			setConditions(bean, dao);
			dao.setCurrentPage(pageNo);
			dao.setPageLines(pageLines);
			List<BaseCrmContactWithC> result = dao.conditionalLoadExt(additionalCondition);
			BaseCollection<BaseCrmContactWithC> col = new BaseCollection<>();
			col.setCollections(result);
			col.setTotalPages(dao.getTotalPages());
			col.setCurrentPage(dao.getCurrentPage());
			col.setPageLines(dao.getPageLines());
			col.setTotalLines(dao.getTotalLines());
			col.setRecordNumber(result.size());
			tsc.recordTime();
			__logger.info(String.format("Query CrmContactWithC List time used : [%1$d]", tsc.getLastTime()));
			return col;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static BaseCrmContactWithC addToCrmContactWithC ( BaseCrmContactWithC crmcontactwithc ) {
		return addToCrmContactWithC ( crmcontactwithc , false);
	}

	public static BaseCrmContactWithC addToCrmContactWithC ( BaseCrmContactWithC crmcontactwithc, boolean singleTransaction ) {
		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			if(singleTransaction) ThreadConnection.beginTransaction();
			CrmContactWithC dao = new CrmContactWithC();
			dao.setDataFromBase(crmcontactwithc);
			int result = dao.save();
			if(singleTransaction) ThreadConnection.commit();
			tsc.recordTime();
			__logger.info(String.format("Add to CrmContactWithC time used : [%1$d]", tsc.getLastTime()));
			return result==1?dao.generateBaseExt():null;
		} catch(Exception ex) {
			if(singleTransaction) ThreadConnection.rollback();
			ex.printStackTrace();
			return null;
		}
	}

	public static BaseCrmContactWithC addUpdateCrmContactWithC ( BaseCrmContactWithC crmcontactwithc ) {
		return addUpdateCrmContactWithC ( crmcontactwithc , false);
	}

	public static BaseCrmContactWithC addUpdateCrmContactWithC ( BaseCrmContactWithC crmcontactwithc, boolean singleTransaction  ) {
		if(crmcontactwithc.getContactId() == null) return addToCrmContactWithC(crmcontactwithc);
		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			if(singleTransaction) ThreadConnection.beginTransaction();
			CrmContactWithC dao = new CrmContactWithC();
			dao.setDataFromBase(crmcontactwithc);
			int result = 0;
			if(dao.load()) {
				dao.setDataFromBase(crmcontactwithc); 
				if(dao.isThisObjectModified()) { 
					result = dao.update();
				} else result = 1;
			} else result = dao.save();
			if(singleTransaction) ThreadConnection.commit();
			tsc.recordTime();
			__logger.info(String.format("Add to CrmContactWithC time used : [%1$d]", tsc.getLastTime()));
			return result==1?dao.generateBaseExt():null;
		} catch(Exception ex) {
			if(singleTransaction) ThreadConnection.rollback();
			ex.printStackTrace();
			return null;
		}
	}

	public static BaseCrmContactWithC deleteCrmContactWithC ( BaseCrmContactWithC bean ) {
		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			CrmContactWithC dao = new CrmContactWithC();
			setDeleteConditions(bean, dao);
			int result = dao.conditionalDelete();
			tsc.recordTime();
			__logger.info(String.format("Delete CrmContactWithC time used : [%1$d]", tsc.getLastTime()));
			return result == 1 ? bean : null ;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static BaseCrmContactWithC updateCrmContactWithC ( BaseCrmContactWithC crmcontactwithc ) {
		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			CrmContactWithC dao = new CrmContactWithC();
			dao.setContactId( crmcontactwithc.getContactId() );
			int result = 0;
			if( dao.load() ) {
				dao.setDataFromBase(crmcontactwithc);
				result = dao.update();
			}
			tsc.recordTime();
			__logger.info(String.format("Update CrmContactWithC time used : [%1$d]", tsc.getLastTime()));
			return result == 1 ? crmcontactwithc : null ;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static BaseCrmContactWithC updateCrmContactWithCDirect( BaseCrmContactWithC crmcontactwithc ) {
		try{
			TimeSpanCalculator tsc = new TimeSpanCalculator();
			tsc.recordTime();
			CrmContactWithC dao = new CrmContactWithC();
			int result = 0;
			dao.setDataFromBase(crmcontactwithc);
			result = dao.update();
			tsc.recordTime();
			__logger.info(String.format("Update CrmContactWithC time used : [%1$d]", tsc.getLastTime()));
			return result == 1 ? crmcontactwithc : null ;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static int setDeleteConditions(BaseCrmContactWithC bean, CrmContactWithC dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getContactId() != null) {
			dao.setContactId(bean.getContactId());
			dao.setConditionContactId("=", bean.getContactId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getEmployeeIdMaintainer() != null) {
				dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
				count++;
			}
			if(bean.getEntityType() != null) {
				dao.setConditionEntityType("=", bean.getEntityType());
				count++;
			}
			if(bean.getContactName() != null) {
				dao.setConditionContactName("=", bean.getContactName());
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
			if(bean.getFlagNoDisturb() != null) {
				dao.setConditionFlagNoDisturb("=", bean.getFlagNoDisturb());
				count++;
			}
			if(bean.getContactRole() != null) {
				dao.setConditionContactRole("=", bean.getContactRole());
				count++;
			}
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
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
			if(bean.getPostcode() != null) {
				dao.setConditionPostcode("=", bean.getPostcode());
				count++;
			}
			if(bean.getGender() != null) {
				dao.setConditionGender("=", bean.getGender());
				count++;
			}
			if(bean.getMemo() != null) {
				dao.setConditionMemo("=", bean.getMemo());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmContactWithC bean, CrmContactWithC dao){
		int count = 0;
		if(bean.getContactId() != null) {
			dao.setConditionContactId("=", bean.getContactId());
			count++;
		}
		if(bean.getEmployeeIdMaintainer() != null) {
			dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
			count++;
		}
		if(bean.getEntityType() != null) {
			dao.setConditionEntityType("=", bean.getEntityType());
			count++;
		}
		if(bean.getContactName() != null) {
			if(bean.getContactName().indexOf("%") >= 0)
				dao.setConditionContactName("like", bean.getContactName());
			else
				dao.setConditionContactName("=", bean.getContactName());
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
		if(bean.getBirthday() != null) {
			dao.setConditionBirthday(">=", bean.getBirthday());
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
		if(bean.getFlagLocked() != null) {
			dao.setConditionFlagLocked("=", bean.getFlagLocked());
			count++;
		}
		if(bean.getFlagNoDisturb() != null) {
			dao.setConditionFlagNoDisturb("=", bean.getFlagNoDisturb());
			count++;
		}
		if(bean.getContactRole() != null) {
			dao.setConditionContactRole("=", bean.getContactRole());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
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
		if(bean.getPostcode() != null) {
			if(bean.getPostcode().indexOf("%") >= 0)
				dao.setConditionPostcode("like", bean.getPostcode());
			else
				dao.setConditionPostcode("=", bean.getPostcode());
			count++;
		}
		if(bean.getGender() != null) {
			dao.setConditionGender("=", bean.getGender());
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
		BaseCrmContactWithC bean = new BaseCrmContactWithC();
		bean.setDataFromJSON(json);
		CrmContactWithC dao = new CrmContactWithC();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load(true)) {
			dao.setDataToBase(bean);
			return bean.toOneLineJSON(1,null);
		}
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmContactWithC> rlist = new BaseCollection<>();
		BaseCrmContactWithC bean = new BaseCrmContactWithC();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmContactWithC dao = new CrmContactWithC();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmContactWithC> result = dao.conditionalLoadExt(addtion);
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
		BaseCrmContactWithC bean = new BaseCrmContactWithC();
		bean.setDataFromJSON(json);
		CrmContactWithC dao = new CrmContactWithC();
		ThreadConnection.beginTransaction();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		ThreadConnection.commit();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmContactWithC bean = new BaseCrmContactWithC();
		bean.setDataFromJSON(json);
		int num = 0;
		CrmContactWithC dao = new CrmContactWithC();
		ThreadConnection.beginTransaction();
		dao.setDataFromBase(bean);
		if(dao.isPrimaryKeyNull()) num = dao.save();
		else if(dao.load()){ dao.setDataFromBase(bean); num = dao.update(); }
		ThreadConnection.commit();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmContactWithC bean = new BaseCrmContactWithC();
		bean.setDataFromJSON(json);
		CrmContactWithC dao = new CrmContactWithC();
		ThreadConnection.beginTransaction();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		ThreadConnection.commit();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmContactWithC bean = new BaseCrmContactWithC();
		bean.setDataFromJSON(json);
		CrmContactWithC dao = new CrmContactWithC();
		ThreadConnection.beginTransaction();
		dao.setDataFromBase(bean);
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		ThreadConnection.commit();
		return bean.toOneLineJSON(num, null);
	}

}


