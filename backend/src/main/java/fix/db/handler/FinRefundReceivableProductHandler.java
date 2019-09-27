package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseFinRefundReceivableProduct;
import java.util.List;
import fix.db.dao.FinRefundReceivableProduct;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class FinRefundReceivableProductHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(FinRefundReceivableProductHandler.class);

	public static BaseFinRefundReceivableProduct getFinRefundReceivableProductById( 
		java.lang.Integer refund_receivable_product_id
	) throws Exception
	{
		FinRefundReceivableProduct dao = new FinRefundReceivableProduct();
		dao.setRefundReceivableProductId(refund_receivable_product_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isFinRefundReceivableProductExists( fix.db.bean.BaseFinRefundReceivableProduct bean, String additional ) throws Exception {

		FinRefundReceivableProduct dao = new FinRefundReceivableProduct();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countFinRefundReceivableProduct( fix.db.bean.BaseFinRefundReceivableProduct bean, String additional ) throws Exception {

		FinRefundReceivableProduct dao = new FinRefundReceivableProduct();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseFinRefundReceivableProduct> queryFinRefundReceivableProduct( fix.db.bean.BaseFinRefundReceivableProduct bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		FinRefundReceivableProduct dao = new FinRefundReceivableProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseFinRefundReceivableProduct> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseFinRefundReceivableProduct> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseFinRefundReceivableProduct addToFinRefundReceivableProduct ( BaseFinRefundReceivableProduct finrefundreceivableproduct )  throws Exception {
		return addToFinRefundReceivableProduct ( finrefundreceivableproduct , false);
	}

	public static BaseFinRefundReceivableProduct addToFinRefundReceivableProduct ( BaseFinRefundReceivableProduct finrefundreceivableproduct, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		FinRefundReceivableProduct dao = new FinRefundReceivableProduct();
		dao.setDataFromBase(finrefundreceivableproduct);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseFinRefundReceivableProduct addUpdateFinRefundReceivableProduct ( BaseFinRefundReceivableProduct finrefundreceivableproduct ) throws Exception {
		return addUpdateFinRefundReceivableProduct ( finrefundreceivableproduct , false);
	}

	public static BaseFinRefundReceivableProduct addUpdateFinRefundReceivableProduct ( BaseFinRefundReceivableProduct finrefundreceivableproduct, boolean singleTransaction  ) throws Exception {
		if(finrefundreceivableproduct.getRefundReceivableProductId() == null) return addToFinRefundReceivableProduct(finrefundreceivableproduct);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		FinRefundReceivableProduct dao = new FinRefundReceivableProduct();
		dao.setDataFromBase(finrefundreceivableproduct);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(finrefundreceivableproduct); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteFinRefundReceivableProduct ( BaseFinRefundReceivableProduct bean ) throws Exception {
		FinRefundReceivableProduct dao = new FinRefundReceivableProduct();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseFinRefundReceivableProduct updateFinRefundReceivableProduct ( BaseFinRefundReceivableProduct finrefundreceivableproduct ) throws Exception {
		FinRefundReceivableProduct dao = new FinRefundReceivableProduct();
		dao.setRefundReceivableProductId( finrefundreceivableproduct.getRefundReceivableProductId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(finrefundreceivableproduct);
			result = dao.update();
		}
		return result == 1 ? finrefundreceivableproduct : null ;
	}

	public static BaseFinRefundReceivableProduct updateFinRefundReceivableProductDirect( BaseFinRefundReceivableProduct finrefundreceivableproduct ) throws Exception {
		FinRefundReceivableProduct dao = new FinRefundReceivableProduct();
		int result = 0;
		dao.setDataFromBase(finrefundreceivableproduct);
		result = dao.update();
		return result == 1 ? finrefundreceivableproduct : null ;
	}

	public static int setDeleteConditions(BaseFinRefundReceivableProduct bean, FinRefundReceivableProduct dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getRefundReceivableProductId() != null) {
			dao.setConditionRefundReceivableProductId("=", bean.getRefundReceivableProductId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getRefundReceivableProductCode() != null) {
				dao.setConditionRefundReceivableProductCode("=", bean.getRefundReceivableProductCode());
				count++;
			}
			if(bean.getRefundId() != null) {
				dao.setConditionRefundId("=", bean.getRefundId());
				count++;
			}
			if(bean.getOrderId() != null) {
				dao.setConditionOrderId("=", bean.getOrderId());
				count++;
			}
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
				count++;
			}
			if(bean.getOrderProductId() != null) {
				dao.setConditionOrderProductId("=", bean.getOrderProductId());
				count++;
			}
			if(bean.getReceivableId() != null) {
				dao.setConditionReceivableId("=", bean.getReceivableId());
				count++;
			}
			if(bean.getReceivableProductId() != null) {
				dao.setConditionReceivableProductId("=", bean.getReceivableProductId());
				count++;
			}
			if(bean.getReceiptId() != null) {
				dao.setConditionReceiptId("=", bean.getReceiptId());
				count++;
			}
			if(bean.getReceiptReceivableProductId() != null) {
				dao.setConditionReceiptReceivableProductId("=", bean.getReceiptReceivableProductId());
				count++;
			}
			if(bean.getProductId() != null) {
				dao.setConditionProductId("=", bean.getProductId());
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

	public static int setConditions(BaseFinRefundReceivableProduct bean, FinRefundReceivableProduct dao){
		int count = 0;
		if(bean.getRefundReceivableProductId() != null) {
			dao.setConditionRefundReceivableProductId("=", bean.getRefundReceivableProductId());
			count++;
		}
		if(bean.getRefundReceivableProductCode() != null) {
			if(bean.getRefundReceivableProductCode().indexOf("%") >= 0)
				dao.setConditionRefundReceivableProductCode("like", bean.getRefundReceivableProductCode());
			else
				dao.setConditionRefundReceivableProductCode("=", bean.getRefundReceivableProductCode());
			count++;
		}
		if(bean.getRefundId() != null) {
			dao.setConditionRefundId("=", bean.getRefundId());
			count++;
		}
		if(bean.getOrderId() != null) {
			dao.setConditionOrderId("=", bean.getOrderId());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getOrderProductId() != null) {
			dao.setConditionOrderProductId("=", bean.getOrderProductId());
			count++;
		}
		if(bean.getReceivableId() != null) {
			dao.setConditionReceivableId("=", bean.getReceivableId());
			count++;
		}
		if(bean.getReceivableProductId() != null) {
			dao.setConditionReceivableProductId("=", bean.getReceivableProductId());
			count++;
		}
		if(bean.getReceiptId() != null) {
			dao.setConditionReceiptId("=", bean.getReceiptId());
			count++;
		}
		if(bean.getReceiptReceivableProductId() != null) {
			dao.setConditionReceiptReceivableProductId("=", bean.getReceiptReceivableProductId());
			count++;
		}
		if(bean.getProductId() != null) {
			dao.setConditionProductId("=", bean.getProductId());
			count++;
		}
		if(bean.getEmployeeIdCreated() != null) {
			dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
			count++;
		}
		if(bean.getAmountRefundReceivableProduct() != null) {
			dao.setConditionAmountRefundReceivableProduct("=", bean.getAmountRefundReceivableProduct());
			count++;
		}
		if(bean.getDateCreated() != null) {
			dao.setConditionDateCreated(">=", bean.getDateCreated());
			count++;
		}
		if(bean.getDateRefunded() != null) {
			dao.setConditionDateRefunded(">=", bean.getDateRefunded());
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
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseFinRefundReceivableProduct bean = new BaseFinRefundReceivableProduct();
		bean.setDataFromJSON(json);
		FinRefundReceivableProduct dao = new FinRefundReceivableProduct();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseFinRefundReceivableProduct> rlist = new BaseCollection<>();
		BaseFinRefundReceivableProduct bean = new BaseFinRefundReceivableProduct();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		FinRefundReceivableProduct dao = new FinRefundReceivableProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseFinRefundReceivableProduct> result = dao.conditionalLoad(addtion);
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
		BaseFinRefundReceivableProduct bean = new BaseFinRefundReceivableProduct();
		bean.setDataFromJSON(json);
		FinRefundReceivableProduct dao = new FinRefundReceivableProduct();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseFinRefundReceivableProduct bean = new BaseFinRefundReceivableProduct();
		bean.setDataFromJSON(json);
		FinRefundReceivableProduct dao = new FinRefundReceivableProduct();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseFinRefundReceivableProduct bean = new BaseFinRefundReceivableProduct();
		bean.setDataFromJSON(json);
		FinRefundReceivableProduct dao = new FinRefundReceivableProduct();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseFinRefundReceivableProduct bean = new BaseFinRefundReceivableProduct();
		bean.setDataFromJSON(json);
		FinRefundReceivableProduct dao = new FinRefundReceivableProduct();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


