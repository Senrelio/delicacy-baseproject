package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseSysEmployee;
import java.util.List;
import fix.db.dao.SysEmployee;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class SysEmployeeHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(SysEmployeeHandler.class);

	public static BaseSysEmployee getSysEmployeeById( 
		java.lang.Integer employee_id
	) throws Exception
	{
		SysEmployee dao = new SysEmployee();
		dao.setEmployeeId(employee_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isSysEmployeeExists( fix.db.bean.BaseSysEmployee bean, String additional ) throws Exception {

		SysEmployee dao = new SysEmployee();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countSysEmployee( fix.db.bean.BaseSysEmployee bean, String additional ) throws Exception {

		SysEmployee dao = new SysEmployee();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseSysEmployee> querySysEmployee( fix.db.bean.BaseSysEmployee bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		SysEmployee dao = new SysEmployee();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseSysEmployee> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseSysEmployee> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseSysEmployee addToSysEmployee ( BaseSysEmployee sysemployee )  throws Exception {
		return addToSysEmployee ( sysemployee , false);
	}

	public static BaseSysEmployee addToSysEmployee ( BaseSysEmployee sysemployee, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		SysEmployee dao = new SysEmployee();
		dao.setDataFromBase(sysemployee);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseSysEmployee addUpdateSysEmployee ( BaseSysEmployee sysemployee ) throws Exception {
		return addUpdateSysEmployee ( sysemployee , false);
	}

	public static BaseSysEmployee addUpdateSysEmployee ( BaseSysEmployee sysemployee, boolean singleTransaction  ) throws Exception {
		if(sysemployee.getEmployeeId() == null) return addToSysEmployee(sysemployee);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		SysEmployee dao = new SysEmployee();
		dao.setDataFromBase(sysemployee);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(sysemployee); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteSysEmployee ( BaseSysEmployee bean ) throws Exception {
		SysEmployee dao = new SysEmployee();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseSysEmployee updateSysEmployee ( BaseSysEmployee sysemployee ) throws Exception {
		SysEmployee dao = new SysEmployee();
		dao.setEmployeeId( sysemployee.getEmployeeId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(sysemployee);
			result = dao.update();
		}
		return result == 1 ? sysemployee : null ;
	}

	public static BaseSysEmployee updateSysEmployeeDirect( BaseSysEmployee sysemployee ) throws Exception {
		SysEmployee dao = new SysEmployee();
		int result = 0;
		dao.setDataFromBase(sysemployee);
		result = dao.update();
		return result == 1 ? sysemployee : null ;
	}

	public static int setDeleteConditions(BaseSysEmployee bean, SysEmployee dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getEmployeeId() != null) {
			dao.setConditionEmployeeId("=", bean.getEmployeeId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getPersonalEmail() != null) {
				dao.setConditionPersonalEmail("=", bean.getPersonalEmail());
				count++;
			}
			if(bean.getMobile() != null) {
				dao.setConditionMobile("=", bean.getMobile());
				count++;
			}
			if(bean.getEmployeeType() != null) {
				dao.setConditionEmployeeType("=", bean.getEmployeeType());
				count++;
			}
			if(bean.getEmployeeName() != null) {
				dao.setConditionEmployeeName("=", bean.getEmployeeName());
				count++;
			}
			if(bean.getEmployeeCode() != null) {
				dao.setConditionEmployeeCode("=", bean.getEmployeeCode());
				count++;
			}
			if(bean.getPassword() != null) {
				dao.setConditionPassword("=", bean.getPassword());
				count++;
			}
			if(bean.getPasswordRuleId() != null) {
				dao.setConditionPasswordRuleId("=", bean.getPasswordRuleId());
				count++;
			}
			if(bean.getPositionName() != null) {
				dao.setConditionPositionName("=", bean.getPositionName());
				count++;
			}
			if(bean.getRankId() != null) {
				dao.setConditionRankId("=", bean.getRankId());
				count++;
			}
			if(bean.getManagerId() != null) {
				dao.setConditionManagerId("=", bean.getManagerId());
				count++;
			}
			if(bean.getGender() != null) {
				dao.setConditionGender("=", bean.getGender());
				count++;
			}
			if(bean.getRelatedDepartmentId() != null) {
				dao.setConditionRelatedDepartmentId("=", bean.getRelatedDepartmentId());
				count++;
			}
			if(bean.getAreaCode() != null) {
				dao.setConditionAreaCode("=", bean.getAreaCode());
				count++;
			}
			if(bean.getRelatedBusiness() != null) {
				dao.setConditionRelatedBusiness("=", bean.getRelatedBusiness());
				count++;
			}
			if(bean.getProductLine() != null) {
				dao.setConditionProductLine("=", bean.getProductLine());
				count++;
			}
			if(bean.getRelatedProductLine() != null) {
				dao.setConditionRelatedProductLine("=", bean.getRelatedProductLine());
				count++;
			}
			if(bean.getNickname() != null) {
				dao.setConditionNickname("=", bean.getNickname());
				count++;
			}
			if(bean.getStatusEmployee() != null) {
				dao.setConditionStatusEmployee("=", bean.getStatusEmployee());
				count++;
			}
			if(bean.getSelfintro() != null) {
				dao.setConditionSelfintro("=", bean.getSelfintro());
				count++;
			}
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
				count++;
			}
			if(bean.getExtno() != null) {
				dao.setConditionExtno("=", bean.getExtno());
				count++;
			}
			if(bean.getExpertise() != null) {
				dao.setConditionExpertise("=", bean.getExpertise());
				count++;
			}
			if(bean.getWechat() != null) {
				dao.setConditionWechat("=", bean.getWechat());
				count++;
			}
			if(bean.getTelephone() != null) {
				dao.setConditionTelephone("=", bean.getTelephone());
				count++;
			}
			if(bean.getWeibo() != null) {
				dao.setConditionWeibo("=", bean.getWeibo());
				count++;
			}
			if(bean.getHobby() != null) {
				dao.setConditionHobby("=", bean.getHobby());
				count++;
			}
			if(bean.getEmployeeIdCreated() != null) {
				dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
				count++;
			}
			if(bean.getQq() != null) {
				dao.setConditionQq("=", bean.getQq());
				count++;
			}
			if(bean.getEmployeeIdUpdated() != null) {
				dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseSysEmployee bean, SysEmployee dao){
		int count = 0;
		if(bean.getEmployeeId() != null) {
			dao.setConditionEmployeeId("=", bean.getEmployeeId());
			count++;
		}
		if(bean.getPersonalEmail() != null) {
			if(bean.getPersonalEmail().indexOf("%") >= 0)
				dao.setConditionPersonalEmail("like", bean.getPersonalEmail());
			else
				dao.setConditionPersonalEmail("=", bean.getPersonalEmail());
			count++;
		}
		if(bean.getMobile() != null) {
			if(bean.getMobile().indexOf("%") >= 0)
				dao.setConditionMobile("like", bean.getMobile());
			else
				dao.setConditionMobile("=", bean.getMobile());
			count++;
		}
		if(bean.getEmployeeType() != null) {
			dao.setConditionEmployeeType("=", bean.getEmployeeType());
			count++;
		}
		if(bean.getEmployeeName() != null) {
			if(bean.getEmployeeName().indexOf("%") >= 0)
				dao.setConditionEmployeeName("like", bean.getEmployeeName());
			else
				dao.setConditionEmployeeName("=", bean.getEmployeeName());
			count++;
		}
		if(bean.getEmployeeCode() != null) {
			if(bean.getEmployeeCode().indexOf("%") >= 0)
				dao.setConditionEmployeeCode("like", bean.getEmployeeCode());
			else
				dao.setConditionEmployeeCode("=", bean.getEmployeeCode());
			count++;
		}
		if(bean.getPassword() != null) {
			if(bean.getPassword().indexOf("%") >= 0)
				dao.setConditionPassword("like", bean.getPassword());
			else
				dao.setConditionPassword("=", bean.getPassword());
			count++;
		}
		if(bean.getDateJoined() != null) {
			dao.setConditionDateJoined(">=", bean.getDateJoined());
			count++;
		}
		if(bean.getBirthday() != null) {
			dao.setConditionBirthday(">=", bean.getBirthday());
			count++;
		}
		if(bean.getPasswordRuleId() != null) {
			if(bean.getPasswordRuleId().indexOf("%") >= 0)
				dao.setConditionPasswordRuleId("like", bean.getPasswordRuleId());
			else
				dao.setConditionPasswordRuleId("=", bean.getPasswordRuleId());
			count++;
		}
		if(bean.getPositionName() != null) {
			if(bean.getPositionName().indexOf("%") >= 0)
				dao.setConditionPositionName("like", bean.getPositionName());
			else
				dao.setConditionPositionName("=", bean.getPositionName());
			count++;
		}
		if(bean.getRankId() != null) {
			if(bean.getRankId().indexOf("%") >= 0)
				dao.setConditionRankId("like", bean.getRankId());
			else
				dao.setConditionRankId("=", bean.getRankId());
			count++;
		}
		if(bean.getManagerId() != null) {
			dao.setConditionManagerId("=", bean.getManagerId());
			count++;
		}
		if(bean.getGender() != null) {
			dao.setConditionGender("=", bean.getGender());
			count++;
		}
		if(bean.getRelatedDepartmentId() != null) {
			dao.setConditionRelatedDepartmentId("=", bean.getRelatedDepartmentId());
			count++;
		}
		if(bean.getAreaCode() != null) {
			if(bean.getAreaCode().indexOf("%") >= 0)
				dao.setConditionAreaCode("like", bean.getAreaCode());
			else
				dao.setConditionAreaCode("=", bean.getAreaCode());
			count++;
		}
		if(bean.getRelatedBusiness() != null) {
			if(bean.getRelatedBusiness().indexOf("%") >= 0)
				dao.setConditionRelatedBusiness("like", bean.getRelatedBusiness());
			else
				dao.setConditionRelatedBusiness("=", bean.getRelatedBusiness());
			count++;
		}
		if(bean.getProductLine() != null) {
			if(bean.getProductLine().indexOf("%") >= 0)
				dao.setConditionProductLine("like", bean.getProductLine());
			else
				dao.setConditionProductLine("=", bean.getProductLine());
			count++;
		}
		if(bean.getRelatedProductLine() != null) {
			if(bean.getRelatedProductLine().indexOf("%") >= 0)
				dao.setConditionRelatedProductLine("like", bean.getRelatedProductLine());
			else
				dao.setConditionRelatedProductLine("=", bean.getRelatedProductLine());
			count++;
		}
		if(bean.getNickname() != null) {
			if(bean.getNickname().indexOf("%") >= 0)
				dao.setConditionNickname("like", bean.getNickname());
			else
				dao.setConditionNickname("=", bean.getNickname());
			count++;
		}
		if(bean.getStatusEmployee() != null) {
			dao.setConditionStatusEmployee("=", bean.getStatusEmployee());
			count++;
		}
		if(bean.getDateUpdated() != null) {
			dao.setConditionDateUpdated(">=", bean.getDateUpdated());
			count++;
		}
		if(bean.getSelfintro() != null) {
			if(bean.getSelfintro().indexOf("%") >= 0)
				dao.setConditionSelfintro("like", bean.getSelfintro());
			else
				dao.setConditionSelfintro("=", bean.getSelfintro());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getExtno() != null) {
			if(bean.getExtno().indexOf("%") >= 0)
				dao.setConditionExtno("like", bean.getExtno());
			else
				dao.setConditionExtno("=", bean.getExtno());
			count++;
		}
		if(bean.getExpertise() != null) {
			if(bean.getExpertise().indexOf("%") >= 0)
				dao.setConditionExpertise("like", bean.getExpertise());
			else
				dao.setConditionExpertise("=", bean.getExpertise());
			count++;
		}
		if(bean.getWechat() != null) {
			if(bean.getWechat().indexOf("%") >= 0)
				dao.setConditionWechat("like", bean.getWechat());
			else
				dao.setConditionWechat("=", bean.getWechat());
			count++;
		}
		if(bean.getTelephone() != null) {
			if(bean.getTelephone().indexOf("%") >= 0)
				dao.setConditionTelephone("like", bean.getTelephone());
			else
				dao.setConditionTelephone("=", bean.getTelephone());
			count++;
		}
		if(bean.getWeibo() != null) {
			if(bean.getWeibo().indexOf("%") >= 0)
				dao.setConditionWeibo("like", bean.getWeibo());
			else
				dao.setConditionWeibo("=", bean.getWeibo());
			count++;
		}
		if(bean.getHobby() != null) {
			if(bean.getHobby().indexOf("%") >= 0)
				dao.setConditionHobby("like", bean.getHobby());
			else
				dao.setConditionHobby("=", bean.getHobby());
			count++;
		}
		if(bean.getDateCreated() != null) {
			dao.setConditionDateCreated(">=", bean.getDateCreated());
			count++;
		}
		if(bean.getDateLatestLogin() != null) {
			dao.setConditionDateLatestLogin(">=", bean.getDateLatestLogin());
			count++;
		}
		if(bean.getEmployeeIdCreated() != null) {
			dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
			count++;
		}
		if(bean.getQq() != null) {
			if(bean.getQq().indexOf("%") >= 0)
				dao.setConditionQq("like", bean.getQq());
			else
				dao.setConditionQq("=", bean.getQq());
			count++;
		}
		if(bean.getEmployeeIdUpdated() != null) {
			dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseSysEmployee bean = new BaseSysEmployee();
		bean.setDataFromJSON(json);
		SysEmployee dao = new SysEmployee();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseSysEmployee> rlist = new BaseCollection<>();
		BaseSysEmployee bean = new BaseSysEmployee();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		SysEmployee dao = new SysEmployee();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseSysEmployee> result = dao.conditionalLoad(addtion);
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
		BaseSysEmployee bean = new BaseSysEmployee();
		bean.setDataFromJSON(json);
		SysEmployee dao = new SysEmployee();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseSysEmployee bean = new BaseSysEmployee();
		bean.setDataFromJSON(json);
		SysEmployee dao = new SysEmployee();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseSysEmployee bean = new BaseSysEmployee();
		bean.setDataFromJSON(json);
		SysEmployee dao = new SysEmployee();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseSysEmployee bean = new BaseSysEmployee();
		bean.setDataFromJSON(json);
		SysEmployee dao = new SysEmployee();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


