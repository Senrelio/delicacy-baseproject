package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseFinReceivableProduct;
import java.util.List;
import fix.db.dao.FinReceivableProduct;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class FinReceivableProductHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(FinReceivableProductHandler.class);

	public static BaseFinReceivableProduct getFinReceivableProductById( 
		java.lang.Integer receivable_product_id
	) throws Exception
	{
		FinReceivableProduct dao = new FinReceivableProduct();
		dao.setReceivableProductId(receivable_product_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isFinReceivableProductExists( fix.db.bean.BaseFinReceivableProduct bean, String additional ) throws Exception {

		FinReceivableProduct dao = new FinReceivableProduct();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countFinReceivableProduct( fix.db.bean.BaseFinReceivableProduct bean, String additional ) throws Exception {

		FinReceivableProduct dao = new FinReceivableProduct();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseFinReceivableProduct> queryFinReceivableProduct( fix.db.bean.BaseFinReceivableProduct bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		FinReceivableProduct dao = new FinReceivableProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseFinReceivableProduct> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseFinReceivableProduct> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseFinReceivableProduct addToFinReceivableProduct ( BaseFinReceivableProduct finreceivableproduct )  throws Exception {
		return addToFinReceivableProduct ( finreceivableproduct , false);
	}

	public static BaseFinReceivableProduct addToFinReceivableProduct ( BaseFinReceivableProduct finreceivableproduct, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		FinReceivableProduct dao = new FinReceivableProduct();
		dao.setDataFromBase(finreceivableproduct);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseFinReceivableProduct addUpdateFinReceivableProduct ( BaseFinReceivableProduct finreceivableproduct ) throws Exception {
		return addUpdateFinReceivableProduct ( finreceivableproduct , false);
	}

	public static BaseFinReceivableProduct addUpdateFinReceivableProduct ( BaseFinReceivableProduct finreceivableproduct, boolean singleTransaction  ) throws Exception {
		if(finreceivableproduct.getReceivableProductId() == null) return addToFinReceivableProduct(finreceivableproduct);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		FinReceivableProduct dao = new FinReceivableProduct();
		dao.setDataFromBase(finreceivableproduct);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(finreceivableproduct); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteFinReceivableProduct ( BaseFinReceivableProduct bean ) throws Exception {
		FinReceivableProduct dao = new FinReceivableProduct();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseFinReceivableProduct updateFinReceivableProduct ( BaseFinReceivableProduct finreceivableproduct ) throws Exception {
		FinReceivableProduct dao = new FinReceivableProduct();
		dao.setReceivableProductId( finreceivableproduct.getReceivableProductId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(finreceivableproduct);
			result = dao.update();
		}
		return result == 1 ? finreceivableproduct : null ;
	}

	public static BaseFinReceivableProduct updateFinReceivableProductDirect( BaseFinReceivableProduct finreceivableproduct ) throws Exception {
		FinReceivableProduct dao = new FinReceivableProduct();
		int result = 0;
		dao.setDataFromBase(finreceivableproduct);
		result = dao.update();
		return result == 1 ? finreceivableproduct : null ;
	}

	public static int setDeleteConditions(BaseFinReceivableProduct bean, FinReceivableProduct dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getReceivableProductId() != null) {
			dao.setConditionReceivableProductId("=", bean.getReceivableProductId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getReceivableId() != null) {
				dao.setConditionReceivableId("=", bean.getReceivableId());
				count++;
			}
			if(bean.getEntityType() != null) {
				dao.setConditionEntityType("=", bean.getEntityType());
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
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
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
			if(bean.getFlagOvertime() != null) {
				dao.setConditionFlagOvertime("=", bean.getFlagOvertime());
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

	public static int setConditions(BaseFinReceivableProduct bean, FinReceivableProduct dao){
		int count = 0;
		if(bean.getReceivableProductId() != null) {
			dao.setConditionReceivableProductId("=", bean.getReceivableProductId());
			count++;
		}
		if(bean.getReceivableId() != null) {
			dao.setConditionReceivableId("=", bean.getReceivableId());
			count++;
		}
		if(bean.getEntityType() != null) {
			dao.setConditionEntityType("=", bean.getEntityType());
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
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getProductId() != null) {
			dao.setConditionProductId("=", bean.getProductId());
			count++;
		}
		if(bean.getAmountReceivable() != null) {
			dao.setConditionAmountReceivable("=", bean.getAmountReceivable());
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
		if(bean.getEmployeeIdUpdated() != null) {
			dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
			count++;
		}
		if(bean.getDateDueReceipt() != null) {
			dao.setConditionDateDueReceipt(">=", bean.getDateDueReceipt());
			count++;
		}
		if(bean.getDateUpdated() != null) {
			dao.setConditionDateUpdated(">=", bean.getDateUpdated());
			count++;
		}
		if(bean.getFlagOvertime() != null) {
			dao.setConditionFlagOvertime("=", bean.getFlagOvertime());
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
		BaseFinReceivableProduct bean = new BaseFinReceivableProduct();
		bean.setDataFromJSON(json);
		FinReceivableProduct dao = new FinReceivableProduct();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseFinReceivableProduct> rlist = new BaseCollection<>();
		BaseFinReceivableProduct bean = new BaseFinReceivableProduct();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		FinReceivableProduct dao = new FinReceivableProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseFinReceivableProduct> result = dao.conditionalLoad(addtion);
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
		BaseFinReceivableProduct bean = new BaseFinReceivableProduct();
		bean.setDataFromJSON(json);
		FinReceivableProduct dao = new FinReceivableProduct();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseFinReceivableProduct bean = new BaseFinReceivableProduct();
		bean.setDataFromJSON(json);
		FinReceivableProduct dao = new FinReceivableProduct();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseFinReceivableProduct bean = new BaseFinReceivableProduct();
		bean.setDataFromJSON(json);
		FinReceivableProduct dao = new FinReceivableProduct();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseFinReceivableProduct bean = new BaseFinReceivableProduct();
		bean.setDataFromJSON(json);
		FinReceivableProduct dao = new FinReceivableProduct();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


