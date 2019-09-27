package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmOrderProduct;
import java.util.List;
import fix.db.dao.CrmOrderProduct;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmOrderProductHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmOrderProductHandler.class);

	public static BaseCrmOrderProduct getCrmOrderProductById( 
		java.lang.Integer order_product_id
	) throws Exception
	{
		CrmOrderProduct dao = new CrmOrderProduct();
		dao.setOrderProductId(order_product_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmOrderProductExists( fix.db.bean.BaseCrmOrderProduct bean, String additional ) throws Exception {

		CrmOrderProduct dao = new CrmOrderProduct();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmOrderProduct( fix.db.bean.BaseCrmOrderProduct bean, String additional ) throws Exception {

		CrmOrderProduct dao = new CrmOrderProduct();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmOrderProduct> queryCrmOrderProduct( fix.db.bean.BaseCrmOrderProduct bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmOrderProduct dao = new CrmOrderProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmOrderProduct> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmOrderProduct> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmOrderProduct addToCrmOrderProduct ( BaseCrmOrderProduct crmorderproduct )  throws Exception {
		return addToCrmOrderProduct ( crmorderproduct , false);
	}

	public static BaseCrmOrderProduct addToCrmOrderProduct ( BaseCrmOrderProduct crmorderproduct, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmOrderProduct dao = new CrmOrderProduct();
		dao.setDataFromBase(crmorderproduct);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmOrderProduct addUpdateCrmOrderProduct ( BaseCrmOrderProduct crmorderproduct ) throws Exception {
		return addUpdateCrmOrderProduct ( crmorderproduct , false);
	}

	public static BaseCrmOrderProduct addUpdateCrmOrderProduct ( BaseCrmOrderProduct crmorderproduct, boolean singleTransaction  ) throws Exception {
		if(crmorderproduct.getOrderProductId() == null) return addToCrmOrderProduct(crmorderproduct);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmOrderProduct dao = new CrmOrderProduct();
		dao.setDataFromBase(crmorderproduct);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmorderproduct); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmOrderProduct ( BaseCrmOrderProduct bean ) throws Exception {
		CrmOrderProduct dao = new CrmOrderProduct();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmOrderProduct updateCrmOrderProduct ( BaseCrmOrderProduct crmorderproduct ) throws Exception {
		CrmOrderProduct dao = new CrmOrderProduct();
		dao.setOrderProductId( crmorderproduct.getOrderProductId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmorderproduct);
			result = dao.update();
		}
		return result == 1 ? crmorderproduct : null ;
	}

	public static BaseCrmOrderProduct updateCrmOrderProductDirect( BaseCrmOrderProduct crmorderproduct ) throws Exception {
		CrmOrderProduct dao = new CrmOrderProduct();
		int result = 0;
		dao.setDataFromBase(crmorderproduct);
		result = dao.update();
		return result == 1 ? crmorderproduct : null ;
	}

	public static int setDeleteConditions(BaseCrmOrderProduct bean, CrmOrderProduct dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getOrderProductId() != null) {
			dao.setConditionOrderProductId("=", bean.getOrderProductId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getOrderId() != null) {
				dao.setConditionOrderId("=", bean.getOrderId());
				count++;
			}
			if(bean.getProductId() != null) {
				dao.setConditionProductId("=", bean.getProductId());
				count++;
			}
			if(bean.getMemo() != null) {
				dao.setConditionMemo("=", bean.getMemo());
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
			if(bean.getFlagSquaredUp() != null) {
				dao.setConditionFlagSquaredUp("=", bean.getFlagSquaredUp());
				count++;
			}
			if(bean.getOrderVersion() != null) {
				dao.setConditionOrderVersion("=", bean.getOrderVersion());
				count++;
			}
			if(bean.getChangetype() != null) {
				dao.setConditionChangetype("=", bean.getChangetype());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmOrderProduct bean, CrmOrderProduct dao){
		int count = 0;
		if(bean.getOrderProductId() != null) {
			dao.setConditionOrderProductId("=", bean.getOrderProductId());
			count++;
		}
		if(bean.getOrderId() != null) {
			dao.setConditionOrderId("=", bean.getOrderId());
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
		if(bean.getMemo() != null) {
			if(bean.getMemo().indexOf("%") >= 0)
				dao.setConditionMemo("like", bean.getMemo());
			else
				dao.setConditionMemo("=", bean.getMemo());
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
		if(bean.getPriceUnitListed() != null) {
			dao.setConditionPriceUnitListed("=", bean.getPriceUnitListed());
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
		if(bean.getQuantityToDeliver() != null) {
			dao.setConditionQuantityToDeliver("=", bean.getQuantityToDeliver());
			count++;
		}
		if(bean.getQuantityDelivered() != null) {
			dao.setConditionQuantityDelivered("=", bean.getQuantityDelivered());
			count++;
		}
		if(bean.getFlagSquaredUp() != null) {
			dao.setConditionFlagSquaredUp("=", bean.getFlagSquaredUp());
			count++;
		}
		if(bean.getDateOrderPlaced() != null) {
			dao.setConditionDateOrderPlaced(">=", bean.getDateOrderPlaced());
			count++;
		}
		if(bean.getSumTotalListed() != null) {
			dao.setConditionSumTotalListed("=", bean.getSumTotalListed());
			count++;
		}
		if(bean.getAmountTotalDiscount() != null) {
			dao.setConditionAmountTotalDiscount("=", bean.getAmountTotalDiscount());
			count++;
		}
		if(bean.getQuantityChange() != null) {
			dao.setConditionQuantityChange("=", bean.getQuantityChange());
			count++;
		}
		if(bean.getAmountChange() != null) {
			dao.setConditionAmountChange("=", bean.getAmountChange());
			count++;
		}
		if(bean.getOrderVersion() != null) {
			dao.setConditionOrderVersion("=", bean.getOrderVersion());
			count++;
		}
		if(bean.getChangetype() != null) {
			dao.setConditionChangetype("=", bean.getChangetype());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseCrmOrderProduct bean = new BaseCrmOrderProduct();
		bean.setDataFromJSON(json);
		CrmOrderProduct dao = new CrmOrderProduct();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmOrderProduct> rlist = new BaseCollection<>();
		BaseCrmOrderProduct bean = new BaseCrmOrderProduct();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmOrderProduct dao = new CrmOrderProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmOrderProduct> result = dao.conditionalLoad(addtion);
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
		BaseCrmOrderProduct bean = new BaseCrmOrderProduct();
		bean.setDataFromJSON(json);
		CrmOrderProduct dao = new CrmOrderProduct();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmOrderProduct bean = new BaseCrmOrderProduct();
		bean.setDataFromJSON(json);
		CrmOrderProduct dao = new CrmOrderProduct();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmOrderProduct bean = new BaseCrmOrderProduct();
		bean.setDataFromJSON(json);
		CrmOrderProduct dao = new CrmOrderProduct();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmOrderProduct bean = new BaseCrmOrderProduct();
		bean.setDataFromJSON(json);
		CrmOrderProduct dao = new CrmOrderProduct();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


