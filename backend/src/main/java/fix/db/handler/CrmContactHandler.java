package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmContact;
import java.util.List;
import fix.db.dao.CrmContact;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmContactHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmContactHandler.class);

	public static BaseCrmContact getCrmContactById( 
		java.lang.Integer contact_id
	) throws Exception
	{
		CrmContact dao = new CrmContact();
		dao.setContactId(contact_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmContactExists( fix.db.bean.BaseCrmContact bean, String additional ) throws Exception {

		CrmContact dao = new CrmContact();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmContact( fix.db.bean.BaseCrmContact bean, String additional ) throws Exception {

		CrmContact dao = new CrmContact();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmContact> queryCrmContact( fix.db.bean.BaseCrmContact bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmContact dao = new CrmContact();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmContact> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmContact> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmContact addToCrmContact ( BaseCrmContact crmcontact )  throws Exception {
		return addToCrmContact ( crmcontact , false);
	}

	public static BaseCrmContact addToCrmContact ( BaseCrmContact crmcontact, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmContact dao = new CrmContact();
		dao.setDataFromBase(crmcontact);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmContact addUpdateCrmContact ( BaseCrmContact crmcontact ) throws Exception {
		return addUpdateCrmContact ( crmcontact , false);
	}

	public static BaseCrmContact addUpdateCrmContact ( BaseCrmContact crmcontact, boolean singleTransaction  ) throws Exception {
		if(crmcontact.getContactId() == null) return addToCrmContact(crmcontact);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmContact dao = new CrmContact();
		dao.setDataFromBase(crmcontact);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmcontact); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmContact ( BaseCrmContact bean ) throws Exception {
		CrmContact dao = new CrmContact();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmContact updateCrmContact ( BaseCrmContact crmcontact ) throws Exception {
		CrmContact dao = new CrmContact();
		dao.setContactId( crmcontact.getContactId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmcontact);
			result = dao.update();
		}
		return result == 1 ? crmcontact : null ;
	}

	public static BaseCrmContact updateCrmContactDirect( BaseCrmContact crmcontact ) throws Exception {
		CrmContact dao = new CrmContact();
		int result = 0;
		dao.setDataFromBase(crmcontact);
		result = dao.update();
		return result == 1 ? crmcontact : null ;
	}

	public static int setDeleteConditions(BaseCrmContact bean, CrmContact dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getContactId() != null) {
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

	public static int setConditions(BaseCrmContact bean, CrmContact dao){
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
		BaseCrmContact bean = new BaseCrmContact();
		bean.setDataFromJSON(json);
		CrmContact dao = new CrmContact();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmContact> rlist = new BaseCollection<>();
		BaseCrmContact bean = new BaseCrmContact();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmContact dao = new CrmContact();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmContact> result = dao.conditionalLoad(addtion);
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
		BaseCrmContact bean = new BaseCrmContact();
		bean.setDataFromJSON(json);
		CrmContact dao = new CrmContact();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmContact bean = new BaseCrmContact();
		bean.setDataFromJSON(json);
		CrmContact dao = new CrmContact();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmContact bean = new BaseCrmContact();
		bean.setDataFromJSON(json);
		CrmContact dao = new CrmContact();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmContact bean = new BaseCrmContact();
		bean.setDataFromJSON(json);
		CrmContact dao = new CrmContact();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


