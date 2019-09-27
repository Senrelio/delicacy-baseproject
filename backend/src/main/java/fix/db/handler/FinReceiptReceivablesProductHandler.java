package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseFinReceiptReceivablesProduct;
import java.util.List;
import fix.db.dao.FinReceiptReceivablesProduct;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class FinReceiptReceivablesProductHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(FinReceiptReceivablesProductHandler.class);

	public static BaseFinReceiptReceivablesProduct getFinReceiptReceivablesProductById( 
		java.lang.Integer receipt_receivable_product_id
	) throws Exception
	{
		FinReceiptReceivablesProduct dao = new FinReceiptReceivablesProduct();
		dao.setReceiptReceivableProductId(receipt_receivable_product_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isFinReceiptReceivablesProductExists( fix.db.bean.BaseFinReceiptReceivablesProduct bean, String additional ) throws Exception {

		FinReceiptReceivablesProduct dao = new FinReceiptReceivablesProduct();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countFinReceiptReceivablesProduct( fix.db.bean.BaseFinReceiptReceivablesProduct bean, String additional ) throws Exception {

		FinReceiptReceivablesProduct dao = new FinReceiptReceivablesProduct();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseFinReceiptReceivablesProduct> queryFinReceiptReceivablesProduct( fix.db.bean.BaseFinReceiptReceivablesProduct bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		FinReceiptReceivablesProduct dao = new FinReceiptReceivablesProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseFinReceiptReceivablesProduct> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseFinReceiptReceivablesProduct> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseFinReceiptReceivablesProduct addToFinReceiptReceivablesProduct ( BaseFinReceiptReceivablesProduct finreceiptreceivablesproduct )  throws Exception {
		return addToFinReceiptReceivablesProduct ( finreceiptreceivablesproduct , false);
	}

	public static BaseFinReceiptReceivablesProduct addToFinReceiptReceivablesProduct ( BaseFinReceiptReceivablesProduct finreceiptreceivablesproduct, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		FinReceiptReceivablesProduct dao = new FinReceiptReceivablesProduct();
		dao.setDataFromBase(finreceiptreceivablesproduct);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseFinReceiptReceivablesProduct addUpdateFinReceiptReceivablesProduct ( BaseFinReceiptReceivablesProduct finreceiptreceivablesproduct ) throws Exception {
		return addUpdateFinReceiptReceivablesProduct ( finreceiptreceivablesproduct , false);
	}

	public static BaseFinReceiptReceivablesProduct addUpdateFinReceiptReceivablesProduct ( BaseFinReceiptReceivablesProduct finreceiptreceivablesproduct, boolean singleTransaction  ) throws Exception {
		if(finreceiptreceivablesproduct.getReceiptReceivableProductId() == null) return addToFinReceiptReceivablesProduct(finreceiptreceivablesproduct);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		FinReceiptReceivablesProduct dao = new FinReceiptReceivablesProduct();
		dao.setDataFromBase(finreceiptreceivablesproduct);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(finreceiptreceivablesproduct); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteFinReceiptReceivablesProduct ( BaseFinReceiptReceivablesProduct bean ) throws Exception {
		FinReceiptReceivablesProduct dao = new FinReceiptReceivablesProduct();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseFinReceiptReceivablesProduct updateFinReceiptReceivablesProduct ( BaseFinReceiptReceivablesProduct finreceiptreceivablesproduct ) throws Exception {
		FinReceiptReceivablesProduct dao = new FinReceiptReceivablesProduct();
		dao.setReceiptReceivableProductId( finreceiptreceivablesproduct.getReceiptReceivableProductId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(finreceiptreceivablesproduct);
			result = dao.update();
		}
		return result == 1 ? finreceiptreceivablesproduct : null ;
	}

	public static BaseFinReceiptReceivablesProduct updateFinReceiptReceivablesProductDirect( BaseFinReceiptReceivablesProduct finreceiptreceivablesproduct ) throws Exception {
		FinReceiptReceivablesProduct dao = new FinReceiptReceivablesProduct();
		int result = 0;
		dao.setDataFromBase(finreceiptreceivablesproduct);
		result = dao.update();
		return result == 1 ? finreceiptreceivablesproduct : null ;
	}

	public static int setDeleteConditions(BaseFinReceiptReceivablesProduct bean, FinReceiptReceivablesProduct dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getReceiptReceivableProductId() != null) {
			dao.setConditionReceiptReceivableProductId("=", bean.getReceiptReceivableProductId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getReceiptReceivableCode() != null) {
				dao.setConditionReceiptReceivableCode("=", bean.getReceiptReceivableCode());
				count++;
			}
			if(bean.getReceiptId() != null) {
				dao.setConditionReceiptId("=", bean.getReceiptId());
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
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
				count++;
			}
			if(bean.getOrderId() != null) {
				dao.setConditionOrderId("=", bean.getOrderId());
				count++;
			}
			if(bean.getOrderProductId() != null) {
				dao.setConditionOrderProductId("=", bean.getOrderProductId());
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
			if(bean.getContractId() != null) {
				dao.setConditionContractId("=", bean.getContractId());
				count++;
			}
			if(bean.getReceiptPlanId() != null) {
				dao.setConditionReceiptPlanId("=", bean.getReceiptPlanId());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseFinReceiptReceivablesProduct bean, FinReceiptReceivablesProduct dao){
		int count = 0;
		if(bean.getReceiptReceivableProductId() != null) {
			dao.setConditionReceiptReceivableProductId("=", bean.getReceiptReceivableProductId());
			count++;
		}
		if(bean.getReceiptReceivableCode() != null) {
			if(bean.getReceiptReceivableCode().indexOf("%") >= 0)
				dao.setConditionReceiptReceivableCode("like", bean.getReceiptReceivableCode());
			else
				dao.setConditionReceiptReceivableCode("=", bean.getReceiptReceivableCode());
			count++;
		}
		if(bean.getReceiptId() != null) {
			dao.setConditionReceiptId("=", bean.getReceiptId());
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
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getOrderId() != null) {
			dao.setConditionOrderId("=", bean.getOrderId());
			count++;
		}
		if(bean.getOrderProductId() != null) {
			dao.setConditionOrderProductId("=", bean.getOrderProductId());
			count++;
		}
		if(bean.getProductId() != null) {
			dao.setConditionProductId("=", bean.getProductId());
			count++;
		}
		if(bean.getAmountReceiptReceivableProduct() != null) {
			dao.setConditionAmountReceiptReceivableProduct("=", bean.getAmountReceiptReceivableProduct());
			count++;
		}
		if(bean.getEmployeeIdCreated() != null) {
			dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
			count++;
		}
		if(bean.getDateReceipted() != null) {
			dao.setConditionDateReceipted(">=", bean.getDateReceipted());
			count++;
		}
		if(bean.getDateCreated() != null) {
			dao.setConditionDateCreated(">=", bean.getDateCreated());
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
		if(bean.getContractId() != null) {
			dao.setConditionContractId("=", bean.getContractId());
			count++;
		}
		if(bean.getReceiptPlanId() != null) {
			dao.setConditionReceiptPlanId("=", bean.getReceiptPlanId());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseFinReceiptReceivablesProduct bean = new BaseFinReceiptReceivablesProduct();
		bean.setDataFromJSON(json);
		FinReceiptReceivablesProduct dao = new FinReceiptReceivablesProduct();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseFinReceiptReceivablesProduct> rlist = new BaseCollection<>();
		BaseFinReceiptReceivablesProduct bean = new BaseFinReceiptReceivablesProduct();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		FinReceiptReceivablesProduct dao = new FinReceiptReceivablesProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseFinReceiptReceivablesProduct> result = dao.conditionalLoad(addtion);
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
		BaseFinReceiptReceivablesProduct bean = new BaseFinReceiptReceivablesProduct();
		bean.setDataFromJSON(json);
		FinReceiptReceivablesProduct dao = new FinReceiptReceivablesProduct();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseFinReceiptReceivablesProduct bean = new BaseFinReceiptReceivablesProduct();
		bean.setDataFromJSON(json);
		FinReceiptReceivablesProduct dao = new FinReceiptReceivablesProduct();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseFinReceiptReceivablesProduct bean = new BaseFinReceiptReceivablesProduct();
		bean.setDataFromJSON(json);
		FinReceiptReceivablesProduct dao = new FinReceiptReceivablesProduct();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseFinReceiptReceivablesProduct bean = new BaseFinReceiptReceivablesProduct();
		bean.setDataFromJSON(json);
		FinReceiptReceivablesProduct dao = new FinReceiptReceivablesProduct();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


