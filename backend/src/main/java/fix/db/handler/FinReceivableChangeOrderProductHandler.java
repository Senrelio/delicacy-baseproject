package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseFinReceivableChangeOrderProduct;
import java.util.List;
import fix.db.dao.FinReceivableChangeOrderProduct;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class FinReceivableChangeOrderProductHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(FinReceivableChangeOrderProductHandler.class);

	public static BaseFinReceivableChangeOrderProduct getFinReceivableChangeOrderProductById( 
		java.lang.Integer receivable_change_order_product_id
	) throws Exception
	{
		FinReceivableChangeOrderProduct dao = new FinReceivableChangeOrderProduct();
		dao.setReceivableChangeOrderProductId(receivable_change_order_product_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isFinReceivableChangeOrderProductExists( fix.db.bean.BaseFinReceivableChangeOrderProduct bean, String additional ) throws Exception {

		FinReceivableChangeOrderProduct dao = new FinReceivableChangeOrderProduct();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countFinReceivableChangeOrderProduct( fix.db.bean.BaseFinReceivableChangeOrderProduct bean, String additional ) throws Exception {

		FinReceivableChangeOrderProduct dao = new FinReceivableChangeOrderProduct();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseFinReceivableChangeOrderProduct> queryFinReceivableChangeOrderProduct( fix.db.bean.BaseFinReceivableChangeOrderProduct bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		FinReceivableChangeOrderProduct dao = new FinReceivableChangeOrderProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseFinReceivableChangeOrderProduct> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseFinReceivableChangeOrderProduct> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseFinReceivableChangeOrderProduct addToFinReceivableChangeOrderProduct ( BaseFinReceivableChangeOrderProduct finreceivablechangeorderproduct )  throws Exception {
		return addToFinReceivableChangeOrderProduct ( finreceivablechangeorderproduct , false);
	}

	public static BaseFinReceivableChangeOrderProduct addToFinReceivableChangeOrderProduct ( BaseFinReceivableChangeOrderProduct finreceivablechangeorderproduct, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		FinReceivableChangeOrderProduct dao = new FinReceivableChangeOrderProduct();
		dao.setDataFromBase(finreceivablechangeorderproduct);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseFinReceivableChangeOrderProduct addUpdateFinReceivableChangeOrderProduct ( BaseFinReceivableChangeOrderProduct finreceivablechangeorderproduct ) throws Exception {
		return addUpdateFinReceivableChangeOrderProduct ( finreceivablechangeorderproduct , false);
	}

	public static BaseFinReceivableChangeOrderProduct addUpdateFinReceivableChangeOrderProduct ( BaseFinReceivableChangeOrderProduct finreceivablechangeorderproduct, boolean singleTransaction  ) throws Exception {
		if(finreceivablechangeorderproduct.getReceivableChangeOrderProductId() == null) return addToFinReceivableChangeOrderProduct(finreceivablechangeorderproduct);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		FinReceivableChangeOrderProduct dao = new FinReceivableChangeOrderProduct();
		dao.setDataFromBase(finreceivablechangeorderproduct);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(finreceivablechangeorderproduct); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteFinReceivableChangeOrderProduct ( BaseFinReceivableChangeOrderProduct bean ) throws Exception {
		FinReceivableChangeOrderProduct dao = new FinReceivableChangeOrderProduct();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseFinReceivableChangeOrderProduct updateFinReceivableChangeOrderProduct ( BaseFinReceivableChangeOrderProduct finreceivablechangeorderproduct ) throws Exception {
		FinReceivableChangeOrderProduct dao = new FinReceivableChangeOrderProduct();
		dao.setReceivableChangeOrderProductId( finreceivablechangeorderproduct.getReceivableChangeOrderProductId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(finreceivablechangeorderproduct);
			result = dao.update();
		}
		return result == 1 ? finreceivablechangeorderproduct : null ;
	}

	public static BaseFinReceivableChangeOrderProduct updateFinReceivableChangeOrderProductDirect( BaseFinReceivableChangeOrderProduct finreceivablechangeorderproduct ) throws Exception {
		FinReceivableChangeOrderProduct dao = new FinReceivableChangeOrderProduct();
		int result = 0;
		dao.setDataFromBase(finreceivablechangeorderproduct);
		result = dao.update();
		return result == 1 ? finreceivablechangeorderproduct : null ;
	}

	public static int setDeleteConditions(BaseFinReceivableChangeOrderProduct bean, FinReceivableChangeOrderProduct dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getReceivableChangeOrderProductId() != null) {
			dao.setConditionReceivableChangeOrderProductId("=", bean.getReceivableChangeOrderProductId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getReceivableChangeId() != null) {
				dao.setConditionReceivableChangeId("=", bean.getReceivableChangeId());
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
			if(bean.getInvoiceitemid() != null) {
				dao.setConditionInvoiceitemid("=", bean.getInvoiceitemid());
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

	public static int setConditions(BaseFinReceivableChangeOrderProduct bean, FinReceivableChangeOrderProduct dao){
		int count = 0;
		if(bean.getReceivableChangeOrderProductId() != null) {
			dao.setConditionReceivableChangeOrderProductId("=", bean.getReceivableChangeOrderProductId());
			count++;
		}
		if(bean.getReceivableChangeId() != null) {
			dao.setConditionReceivableChangeId("=", bean.getReceivableChangeId());
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
		if(bean.getInvoiceitemid() != null) {
			dao.setConditionInvoiceitemid("=", bean.getInvoiceitemid());
			count++;
		}
		if(bean.getProductId() != null) {
			dao.setConditionProductId("=", bean.getProductId());
			count++;
		}
		if(bean.getAmountChangeReceivableOrderProduct() != null) {
			dao.setConditionAmountChangeReceivableOrderProduct("=", bean.getAmountChangeReceivableOrderProduct());
			count++;
		}
		if(bean.getEmployeeIdCreated() != null) {
			dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
			count++;
		}
		if(bean.getDateChanged() != null) {
			dao.setConditionDateChanged(">=", bean.getDateChanged());
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
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseFinReceivableChangeOrderProduct bean = new BaseFinReceivableChangeOrderProduct();
		bean.setDataFromJSON(json);
		FinReceivableChangeOrderProduct dao = new FinReceivableChangeOrderProduct();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseFinReceivableChangeOrderProduct> rlist = new BaseCollection<>();
		BaseFinReceivableChangeOrderProduct bean = new BaseFinReceivableChangeOrderProduct();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		FinReceivableChangeOrderProduct dao = new FinReceivableChangeOrderProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseFinReceivableChangeOrderProduct> result = dao.conditionalLoad(addtion);
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
		BaseFinReceivableChangeOrderProduct bean = new BaseFinReceivableChangeOrderProduct();
		bean.setDataFromJSON(json);
		FinReceivableChangeOrderProduct dao = new FinReceivableChangeOrderProduct();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseFinReceivableChangeOrderProduct bean = new BaseFinReceivableChangeOrderProduct();
		bean.setDataFromJSON(json);
		FinReceivableChangeOrderProduct dao = new FinReceivableChangeOrderProduct();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseFinReceivableChangeOrderProduct bean = new BaseFinReceivableChangeOrderProduct();
		bean.setDataFromJSON(json);
		FinReceivableChangeOrderProduct dao = new FinReceivableChangeOrderProduct();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseFinReceivableChangeOrderProduct bean = new BaseFinReceivableChangeOrderProduct();
		bean.setDataFromJSON(json);
		FinReceivableChangeOrderProduct dao = new FinReceivableChangeOrderProduct();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


