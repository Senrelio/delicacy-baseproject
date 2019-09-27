package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseSysDepartment;
import java.util.List;
import fix.db.dao.SysDepartment;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class SysDepartmentHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(SysDepartmentHandler.class);

	public static BaseSysDepartment getSysDepartmentById( 
		java.lang.Integer department_id
	) throws Exception
	{
		SysDepartment dao = new SysDepartment();
		dao.setDepartmentId(department_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isSysDepartmentExists( fix.db.bean.BaseSysDepartment bean, String additional ) throws Exception {

		SysDepartment dao = new SysDepartment();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countSysDepartment( fix.db.bean.BaseSysDepartment bean, String additional ) throws Exception {

		SysDepartment dao = new SysDepartment();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseSysDepartment> querySysDepartment( fix.db.bean.BaseSysDepartment bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		SysDepartment dao = new SysDepartment();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseSysDepartment> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseSysDepartment> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseSysDepartment addToSysDepartment ( BaseSysDepartment sysdepartment )  throws Exception {
		return addToSysDepartment ( sysdepartment , false);
	}

	public static BaseSysDepartment addToSysDepartment ( BaseSysDepartment sysdepartment, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		SysDepartment dao = new SysDepartment();
		dao.setDataFromBase(sysdepartment);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseSysDepartment addUpdateSysDepartment ( BaseSysDepartment sysdepartment ) throws Exception {
		return addUpdateSysDepartment ( sysdepartment , false);
	}

	public static BaseSysDepartment addUpdateSysDepartment ( BaseSysDepartment sysdepartment, boolean singleTransaction  ) throws Exception {
		if(sysdepartment.getDepartmentId() == null) return addToSysDepartment(sysdepartment);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		SysDepartment dao = new SysDepartment();
		dao.setDataFromBase(sysdepartment);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(sysdepartment); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteSysDepartment ( BaseSysDepartment bean ) throws Exception {
		SysDepartment dao = new SysDepartment();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseSysDepartment updateSysDepartment ( BaseSysDepartment sysdepartment ) throws Exception {
		SysDepartment dao = new SysDepartment();
		dao.setDepartmentId( sysdepartment.getDepartmentId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(sysdepartment);
			result = dao.update();
		}
		return result == 1 ? sysdepartment : null ;
	}

	public static BaseSysDepartment updateSysDepartmentDirect( BaseSysDepartment sysdepartment ) throws Exception {
		SysDepartment dao = new SysDepartment();
		int result = 0;
		dao.setDataFromBase(sysdepartment);
		result = dao.update();
		return result == 1 ? sysdepartment : null ;
	}

	public static int setDeleteConditions(BaseSysDepartment bean, SysDepartment dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getDepartmentCode() != null) {
				dao.setConditionDepartmentCode("=", bean.getDepartmentCode());
				count++;
			}
			if(bean.getDepartmentName() != null) {
				dao.setConditionDepartmentName("=", bean.getDepartmentName());
				count++;
			}
			if(bean.getParentDepartmentId() != null) {
				dao.setConditionParentDepartmentId("=", bean.getParentDepartmentId());
				count++;
			}
			if(bean.getDepartmentType() != null) {
				dao.setConditionDepartmentType("=", bean.getDepartmentType());
				count++;
			}
			if(bean.getDepartmentSecondType() != null) {
				dao.setConditionDepartmentSecondType("=", bean.getDepartmentSecondType());
				count++;
			}
			if(bean.getEntityType() != null) {
				dao.setConditionEntityType("=", bean.getEntityType());
				count++;
			}
			if(bean.getAreaCode() != null) {
				dao.setConditionAreaCode("=", bean.getAreaCode());
				count++;
			}
			if(bean.getBusiness() != null) {
				dao.setConditionBusiness("=", bean.getBusiness());
				count++;
			}
			if(bean.getProductLine() != null) {
				dao.setConditionProductLine("=", bean.getProductLine());
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

	public static int setConditions(BaseSysDepartment bean, SysDepartment dao){
		int count = 0;
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getDepartmentCode() != null) {
			if(bean.getDepartmentCode().indexOf("%") >= 0)
				dao.setConditionDepartmentCode("like", bean.getDepartmentCode());
			else
				dao.setConditionDepartmentCode("=", bean.getDepartmentCode());
			count++;
		}
		if(bean.getDepartmentName() != null) {
			if(bean.getDepartmentName().indexOf("%") >= 0)
				dao.setConditionDepartmentName("like", bean.getDepartmentName());
			else
				dao.setConditionDepartmentName("=", bean.getDepartmentName());
			count++;
		}
		if(bean.getParentDepartmentId() != null) {
			dao.setConditionParentDepartmentId("=", bean.getParentDepartmentId());
			count++;
		}
		if(bean.getDepartmentType() != null) {
			dao.setConditionDepartmentType("=", bean.getDepartmentType());
			count++;
		}
		if(bean.getDepartmentSecondType() != null) {
			dao.setConditionDepartmentSecondType("=", bean.getDepartmentSecondType());
			count++;
		}
		if(bean.getEntityType() != null) {
			dao.setConditionEntityType("=", bean.getEntityType());
			count++;
		}
		if(bean.getAreaCode() != null) {
			if(bean.getAreaCode().indexOf("%") >= 0)
				dao.setConditionAreaCode("like", bean.getAreaCode());
			else
				dao.setConditionAreaCode("=", bean.getAreaCode());
			count++;
		}
		if(bean.getBusiness() != null) {
			if(bean.getBusiness().indexOf("%") >= 0)
				dao.setConditionBusiness("like", bean.getBusiness());
			else
				dao.setConditionBusiness("=", bean.getBusiness());
			count++;
		}
		if(bean.getProductLine() != null) {
			if(bean.getProductLine().indexOf("%") >= 0)
				dao.setConditionProductLine("like", bean.getProductLine());
			else
				dao.setConditionProductLine("=", bean.getProductLine());
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
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseSysDepartment bean = new BaseSysDepartment();
		bean.setDataFromJSON(json);
		SysDepartment dao = new SysDepartment();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseSysDepartment> rlist = new BaseCollection<>();
		BaseSysDepartment bean = new BaseSysDepartment();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		SysDepartment dao = new SysDepartment();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseSysDepartment> result = dao.conditionalLoad(addtion);
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
		BaseSysDepartment bean = new BaseSysDepartment();
		bean.setDataFromJSON(json);
		SysDepartment dao = new SysDepartment();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseSysDepartment bean = new BaseSysDepartment();
		bean.setDataFromJSON(json);
		SysDepartment dao = new SysDepartment();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseSysDepartment bean = new BaseSysDepartment();
		bean.setDataFromJSON(json);
		SysDepartment dao = new SysDepartment();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseSysDepartment bean = new BaseSysDepartment();
		bean.setDataFromJSON(json);
		SysDepartment dao = new SysDepartment();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


