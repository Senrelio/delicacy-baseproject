package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmOpportunityProduct;
import java.util.List;
import fix.db.dao.CrmOpportunityProduct;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmOpportunityProductHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmOpportunityProductHandler.class);

	public static BaseCrmOpportunityProduct getCrmOpportunityProductById( 
		java.lang.Integer opportunity_product_id
	) throws Exception
	{
		CrmOpportunityProduct dao = new CrmOpportunityProduct();
		dao.setOpportunityProductId(opportunity_product_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmOpportunityProductExists( fix.db.bean.BaseCrmOpportunityProduct bean, String additional ) throws Exception {

		CrmOpportunityProduct dao = new CrmOpportunityProduct();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmOpportunityProduct( fix.db.bean.BaseCrmOpportunityProduct bean, String additional ) throws Exception {

		CrmOpportunityProduct dao = new CrmOpportunityProduct();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmOpportunityProduct> queryCrmOpportunityProduct( fix.db.bean.BaseCrmOpportunityProduct bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmOpportunityProduct dao = new CrmOpportunityProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmOpportunityProduct> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmOpportunityProduct> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmOpportunityProduct addToCrmOpportunityProduct ( BaseCrmOpportunityProduct crmopportunityproduct )  throws Exception {
		return addToCrmOpportunityProduct ( crmopportunityproduct , false);
	}

	public static BaseCrmOpportunityProduct addToCrmOpportunityProduct ( BaseCrmOpportunityProduct crmopportunityproduct, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmOpportunityProduct dao = new CrmOpportunityProduct();
		dao.setDataFromBase(crmopportunityproduct);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmOpportunityProduct addUpdateCrmOpportunityProduct ( BaseCrmOpportunityProduct crmopportunityproduct ) throws Exception {
		return addUpdateCrmOpportunityProduct ( crmopportunityproduct , false);
	}

	public static BaseCrmOpportunityProduct addUpdateCrmOpportunityProduct ( BaseCrmOpportunityProduct crmopportunityproduct, boolean singleTransaction  ) throws Exception {
		if(crmopportunityproduct.getOpportunityProductId() == null) return addToCrmOpportunityProduct(crmopportunityproduct);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmOpportunityProduct dao = new CrmOpportunityProduct();
		dao.setDataFromBase(crmopportunityproduct);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmopportunityproduct); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmOpportunityProduct ( BaseCrmOpportunityProduct bean ) throws Exception {
		CrmOpportunityProduct dao = new CrmOpportunityProduct();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmOpportunityProduct updateCrmOpportunityProduct ( BaseCrmOpportunityProduct crmopportunityproduct ) throws Exception {
		CrmOpportunityProduct dao = new CrmOpportunityProduct();
		dao.setOpportunityProductId( crmopportunityproduct.getOpportunityProductId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmopportunityproduct);
			result = dao.update();
		}
		return result == 1 ? crmopportunityproduct : null ;
	}

	public static BaseCrmOpportunityProduct updateCrmOpportunityProductDirect( BaseCrmOpportunityProduct crmopportunityproduct ) throws Exception {
		CrmOpportunityProduct dao = new CrmOpportunityProduct();
		int result = 0;
		dao.setDataFromBase(crmopportunityproduct);
		result = dao.update();
		return result == 1 ? crmopportunityproduct : null ;
	}

	public static int setDeleteConditions(BaseCrmOpportunityProduct bean, CrmOpportunityProduct dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getOpportunityProductId() != null) {
			dao.setConditionOpportunityProductId("=", bean.getOpportunityProductId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getOpportunityId() != null) {
				dao.setConditionOpportunityId("=", bean.getOpportunityId());
				count++;
			}
			if(bean.getProductId() != null) {
				dao.setConditionProductId("=", bean.getProductId());
				count++;
			}
			if(bean.getEntityType() != null) {
				dao.setConditionEntityType("=", bean.getEntityType());
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
			if(bean.getMemo() != null) {
				dao.setConditionMemo("=", bean.getMemo());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmOpportunityProduct bean, CrmOpportunityProduct dao){
		int count = 0;
		if(bean.getOpportunityProductId() != null) {
			dao.setConditionOpportunityProductId("=", bean.getOpportunityProductId());
			count++;
		}
		if(bean.getOpportunityId() != null) {
			dao.setConditionOpportunityId("=", bean.getOpportunityId());
			count++;
		}
		if(bean.getProductId() != null) {
			dao.setConditionProductId("=", bean.getProductId());
			count++;
		}
		if(bean.getPriceUnit() != null) {
			dao.setConditionPriceUnit("=", bean.getPriceUnit());
			count++;
		}
		if(bean.getQuantity() != null) {
			dao.setConditionQuantity("=", bean.getQuantity());
			count++;
		}
		if(bean.getDiscountRate() != null) {
			dao.setConditionDiscountRate("=", bean.getDiscountRate());
			count++;
		}
		if(bean.getSum() != null) {
			dao.setConditionSum("=", bean.getSum());
			count++;
		}
		if(bean.getPriceUnitListed() != null) {
			dao.setConditionPriceUnitListed("=", bean.getPriceUnitListed());
			count++;
		}
		if(bean.getEntityType() != null) {
			dao.setConditionEntityType("=", bean.getEntityType());
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
		BaseCrmOpportunityProduct bean = new BaseCrmOpportunityProduct();
		bean.setDataFromJSON(json);
		CrmOpportunityProduct dao = new CrmOpportunityProduct();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmOpportunityProduct> rlist = new BaseCollection<>();
		BaseCrmOpportunityProduct bean = new BaseCrmOpportunityProduct();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmOpportunityProduct dao = new CrmOpportunityProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmOpportunityProduct> result = dao.conditionalLoad(addtion);
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
		BaseCrmOpportunityProduct bean = new BaseCrmOpportunityProduct();
		bean.setDataFromJSON(json);
		CrmOpportunityProduct dao = new CrmOpportunityProduct();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmOpportunityProduct bean = new BaseCrmOpportunityProduct();
		bean.setDataFromJSON(json);
		CrmOpportunityProduct dao = new CrmOpportunityProduct();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmOpportunityProduct bean = new BaseCrmOpportunityProduct();
		bean.setDataFromJSON(json);
		CrmOpportunityProduct dao = new CrmOpportunityProduct();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmOpportunityProduct bean = new BaseCrmOpportunityProduct();
		bean.setDataFromJSON(json);
		CrmOpportunityProduct dao = new CrmOpportunityProduct();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


