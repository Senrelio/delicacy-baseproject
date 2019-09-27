package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmPriceListProduct;
import java.util.List;
import fix.db.dao.CrmPriceListProduct;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmPriceListProductHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmPriceListProductHandler.class);

	public static BaseCrmPriceListProduct getCrmPriceListProductById( 
		java.lang.Integer price_list_product_id
	) throws Exception
	{
		CrmPriceListProduct dao = new CrmPriceListProduct();
		dao.setPriceListProductId(price_list_product_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmPriceListProductExists( fix.db.bean.BaseCrmPriceListProduct bean, String additional ) throws Exception {

		CrmPriceListProduct dao = new CrmPriceListProduct();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmPriceListProduct( fix.db.bean.BaseCrmPriceListProduct bean, String additional ) throws Exception {

		CrmPriceListProduct dao = new CrmPriceListProduct();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmPriceListProduct> queryCrmPriceListProduct( fix.db.bean.BaseCrmPriceListProduct bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmPriceListProduct dao = new CrmPriceListProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmPriceListProduct> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmPriceListProduct> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmPriceListProduct addToCrmPriceListProduct ( BaseCrmPriceListProduct crmpricelistproduct )  throws Exception {
		return addToCrmPriceListProduct ( crmpricelistproduct , false);
	}

	public static BaseCrmPriceListProduct addToCrmPriceListProduct ( BaseCrmPriceListProduct crmpricelistproduct, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmPriceListProduct dao = new CrmPriceListProduct();
		dao.setDataFromBase(crmpricelistproduct);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmPriceListProduct addUpdateCrmPriceListProduct ( BaseCrmPriceListProduct crmpricelistproduct ) throws Exception {
		return addUpdateCrmPriceListProduct ( crmpricelistproduct , false);
	}

	public static BaseCrmPriceListProduct addUpdateCrmPriceListProduct ( BaseCrmPriceListProduct crmpricelistproduct, boolean singleTransaction  ) throws Exception {
		if(crmpricelistproduct.getPriceListProductId() == null) return addToCrmPriceListProduct(crmpricelistproduct);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmPriceListProduct dao = new CrmPriceListProduct();
		dao.setDataFromBase(crmpricelistproduct);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmpricelistproduct); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmPriceListProduct ( BaseCrmPriceListProduct bean ) throws Exception {
		CrmPriceListProduct dao = new CrmPriceListProduct();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmPriceListProduct updateCrmPriceListProduct ( BaseCrmPriceListProduct crmpricelistproduct ) throws Exception {
		CrmPriceListProduct dao = new CrmPriceListProduct();
		dao.setPriceListProductId( crmpricelistproduct.getPriceListProductId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmpricelistproduct);
			result = dao.update();
		}
		return result == 1 ? crmpricelistproduct : null ;
	}

	public static BaseCrmPriceListProduct updateCrmPriceListProductDirect( BaseCrmPriceListProduct crmpricelistproduct ) throws Exception {
		CrmPriceListProduct dao = new CrmPriceListProduct();
		int result = 0;
		dao.setDataFromBase(crmpricelistproduct);
		result = dao.update();
		return result == 1 ? crmpricelistproduct : null ;
	}

	public static int setDeleteConditions(BaseCrmPriceListProduct bean, CrmPriceListProduct dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getPriceListProductId() != null) {
			dao.setConditionPriceListProductId("=", bean.getPriceListProductId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getPriceListId() != null) {
				dao.setConditionPriceListId("=", bean.getPriceListId());
				count++;
			}
			if(bean.getProductId() != null) {
				dao.setConditionProductId("=", bean.getProductId());
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
			if(bean.getFlagStandardPriceUnit() != null) {
				dao.setConditionFlagStandardPriceUnit("=", bean.getFlagStandardPriceUnit());
				count++;
			}
			if(bean.getFlagEnabled() != null) {
				dao.setConditionFlagEnabled("=", bean.getFlagEnabled());
				count++;
			}
			if(bean.getMemo() != null) {
				dao.setConditionMemo("=", bean.getMemo());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmPriceListProduct bean, CrmPriceListProduct dao){
		int count = 0;
		if(bean.getPriceListProductId() != null) {
			dao.setConditionPriceListProductId("=", bean.getPriceListProductId());
			count++;
		}
		if(bean.getPriceListId() != null) {
			dao.setConditionPriceListId("=", bean.getPriceListId());
			count++;
		}
		if(bean.getProductId() != null) {
			dao.setConditionProductId("=", bean.getProductId());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			if(bean.getDepartmentId().indexOf("%") >= 0)
				dao.setConditionDepartmentId("like", bean.getDepartmentId());
			else
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getEmployeeIdCreated() != null) {
			if(bean.getEmployeeIdCreated().indexOf("%") >= 0)
				dao.setConditionEmployeeIdCreated("like", bean.getEmployeeIdCreated());
			else
				dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
			count++;
		}
		if(bean.getDateCreated() != null) {
			dao.setConditionDateCreated(">=", bean.getDateCreated());
			count++;
		}
		if(bean.getEmployeeIdUpdated() != null) {
			if(bean.getEmployeeIdUpdated().indexOf("%") >= 0)
				dao.setConditionEmployeeIdUpdated("like", bean.getEmployeeIdUpdated());
			else
				dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
			count++;
		}
		if(bean.getDateUpdated() != null) {
			dao.setConditionDateUpdated(">=", bean.getDateUpdated());
			count++;
		}
		if(bean.getPriceUnitListed() != null) {
			dao.setConditionPriceUnitListed("=", bean.getPriceUnitListed());
			count++;
		}
		if(bean.getFlagStandardPriceUnit() != null) {
			dao.setConditionFlagStandardPriceUnit("=", bean.getFlagStandardPriceUnit());
			count++;
		}
		if(bean.getPriceUnit() != null) {
			dao.setConditionPriceUnit("=", bean.getPriceUnit());
			count++;
		}
		if(bean.getFlagEnabled() != null) {
			dao.setConditionFlagEnabled("=", bean.getFlagEnabled());
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
		BaseCrmPriceListProduct bean = new BaseCrmPriceListProduct();
		bean.setDataFromJSON(json);
		CrmPriceListProduct dao = new CrmPriceListProduct();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmPriceListProduct> rlist = new BaseCollection<>();
		BaseCrmPriceListProduct bean = new BaseCrmPriceListProduct();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmPriceListProduct dao = new CrmPriceListProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmPriceListProduct> result = dao.conditionalLoad(addtion);
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
		BaseCrmPriceListProduct bean = new BaseCrmPriceListProduct();
		bean.setDataFromJSON(json);
		CrmPriceListProduct dao = new CrmPriceListProduct();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmPriceListProduct bean = new BaseCrmPriceListProduct();
		bean.setDataFromJSON(json);
		CrmPriceListProduct dao = new CrmPriceListProduct();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmPriceListProduct bean = new BaseCrmPriceListProduct();
		bean.setDataFromJSON(json);
		CrmPriceListProduct dao = new CrmPriceListProduct();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmPriceListProduct bean = new BaseCrmPriceListProduct();
		bean.setDataFromJSON(json);
		CrmPriceListProduct dao = new CrmPriceListProduct();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


