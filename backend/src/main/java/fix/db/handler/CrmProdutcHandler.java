package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmProdutc;
import java.util.List;
import fix.db.dao.CrmProdutc;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmProdutcHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmProdutcHandler.class);

	public static BaseCrmProdutc getCrmProdutcById( 
		java.lang.Integer product_id
	) throws Exception
	{
		CrmProdutc dao = new CrmProdutc();
		dao.setProductId(product_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmProdutcExists( fix.db.bean.BaseCrmProdutc bean, String additional ) throws Exception {

		CrmProdutc dao = new CrmProdutc();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmProdutc( fix.db.bean.BaseCrmProdutc bean, String additional ) throws Exception {

		CrmProdutc dao = new CrmProdutc();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmProdutc> queryCrmProdutc( fix.db.bean.BaseCrmProdutc bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmProdutc dao = new CrmProdutc();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmProdutc> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmProdutc> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmProdutc addToCrmProdutc ( BaseCrmProdutc crmprodutc )  throws Exception {
		return addToCrmProdutc ( crmprodutc , false);
	}

	public static BaseCrmProdutc addToCrmProdutc ( BaseCrmProdutc crmprodutc, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmProdutc dao = new CrmProdutc();
		dao.setDataFromBase(crmprodutc);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmProdutc addUpdateCrmProdutc ( BaseCrmProdutc crmprodutc ) throws Exception {
		return addUpdateCrmProdutc ( crmprodutc , false);
	}

	public static BaseCrmProdutc addUpdateCrmProdutc ( BaseCrmProdutc crmprodutc, boolean singleTransaction  ) throws Exception {
		if(crmprodutc.getProductId() == null) return addToCrmProdutc(crmprodutc);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmProdutc dao = new CrmProdutc();
		dao.setDataFromBase(crmprodutc);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmprodutc); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmProdutc ( BaseCrmProdutc bean ) throws Exception {
		CrmProdutc dao = new CrmProdutc();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmProdutc updateCrmProdutc ( BaseCrmProdutc crmprodutc ) throws Exception {
		CrmProdutc dao = new CrmProdutc();
		dao.setProductId( crmprodutc.getProductId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmprodutc);
			result = dao.update();
		}
		return result == 1 ? crmprodutc : null ;
	}

	public static BaseCrmProdutc updateCrmProdutcDirect( BaseCrmProdutc crmprodutc ) throws Exception {
		CrmProdutc dao = new CrmProdutc();
		int result = 0;
		dao.setDataFromBase(crmprodutc);
		result = dao.update();
		return result == 1 ? crmprodutc : null ;
	}

	public static int setDeleteConditions(BaseCrmProdutc bean, CrmProdutc dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getProductId() != null) {
			dao.setConditionProductId("=", bean.getProductId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getProductName() != null) {
				dao.setConditionProductName("=", bean.getProductName());
				count++;
			}
			if(bean.getParentId() != null) {
				dao.setConditionParentId("=", bean.getParentId());
				count++;
			}
			if(bean.getEmployeeIdMaintainer() != null) {
				dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
				count++;
			}
			if(bean.getUnit() != null) {
				dao.setConditionUnit("=", bean.getUnit());
				count++;
			}
			if(bean.getProductImage1() != null) {
				dao.setConditionProductImage1("=", bean.getProductImage1());
				count++;
			}
			if(bean.getDescription() != null) {
				dao.setConditionDescription("=", bean.getDescription());
				count++;
			}
			if(bean.getFlagEnabled() != null) {
				dao.setConditionFlagEnabled("=", bean.getFlagEnabled());
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
			if(bean.getEntityType() != null) {
				dao.setConditionEntityType("=", bean.getEntityType());
				count++;
			}
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmProdutc bean, CrmProdutc dao){
		int count = 0;
		if(bean.getProductId() != null) {
			dao.setConditionProductId("=", bean.getProductId());
			count++;
		}
		if(bean.getProductName() != null) {
			if(bean.getProductName().indexOf("%") >= 0)
				dao.setConditionProductName("like", bean.getProductName());
			else
				dao.setConditionProductName("=", bean.getProductName());
			count++;
		}
		if(bean.getParentId() != null) {
			dao.setConditionParentId("=", bean.getParentId());
			count++;
		}
		if(bean.getEmployeeIdMaintainer() != null) {
			dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
			count++;
		}
		if(bean.getPriceUnitListed() != null) {
			dao.setConditionPriceUnitListed("=", bean.getPriceUnitListed());
			count++;
		}
		if(bean.getUnit() != null) {
			if(bean.getUnit().indexOf("%") >= 0)
				dao.setConditionUnit("like", bean.getUnit());
			else
				dao.setConditionUnit("=", bean.getUnit());
			count++;
		}
		if(bean.getProductImage1() != null) {
			if(bean.getProductImage1().indexOf("%") >= 0)
				dao.setConditionProductImage1("like", bean.getProductImage1());
			else
				dao.setConditionProductImage1("=", bean.getProductImage1());
			count++;
		}
		if(bean.getDescription() != null) {
			if(bean.getDescription().indexOf("%") >= 0)
				dao.setConditionDescription("like", bean.getDescription());
			else
				dao.setConditionDescription("=", bean.getDescription());
			count++;
		}
		if(bean.getDateCreated() != null) {
			dao.setConditionDateCreated(">=", bean.getDateCreated());
			count++;
		}
		if(bean.getDateUpdated() != null) {
			dao.setConditionDateUpdated(">=", bean.getDateUpdated());
			count++;
		}
		if(bean.getFlagEnabled() != null) {
			dao.setConditionFlagEnabled("=", bean.getFlagEnabled());
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
		if(bean.getEntityType() != null) {
			dao.setConditionEntityType("=", bean.getEntityType());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseCrmProdutc bean = new BaseCrmProdutc();
		bean.setDataFromJSON(json);
		CrmProdutc dao = new CrmProdutc();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmProdutc> rlist = new BaseCollection<>();
		BaseCrmProdutc bean = new BaseCrmProdutc();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmProdutc dao = new CrmProdutc();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmProdutc> result = dao.conditionalLoad(addtion);
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
		BaseCrmProdutc bean = new BaseCrmProdutc();
		bean.setDataFromJSON(json);
		CrmProdutc dao = new CrmProdutc();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmProdutc bean = new BaseCrmProdutc();
		bean.setDataFromJSON(json);
		CrmProdutc dao = new CrmProdutc();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmProdutc bean = new BaseCrmProdutc();
		bean.setDataFromJSON(json);
		CrmProdutc dao = new CrmProdutc();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmProdutc bean = new BaseCrmProdutc();
		bean.setDataFromJSON(json);
		CrmProdutc dao = new CrmProdutc();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


