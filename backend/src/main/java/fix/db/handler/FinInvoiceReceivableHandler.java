package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseFinInvoiceReceivable;
import java.util.List;
import fix.db.dao.FinInvoiceReceivable;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class FinInvoiceReceivableHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(FinInvoiceReceivableHandler.class);

	public static BaseFinInvoiceReceivable getFinInvoiceReceivableById( 
		java.lang.Integer invoice_receivable_id
	) throws Exception
	{
		FinInvoiceReceivable dao = new FinInvoiceReceivable();
		dao.setInvoiceReceivableId(invoice_receivable_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isFinInvoiceReceivableExists( fix.db.bean.BaseFinInvoiceReceivable bean, String additional ) throws Exception {

		FinInvoiceReceivable dao = new FinInvoiceReceivable();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countFinInvoiceReceivable( fix.db.bean.BaseFinInvoiceReceivable bean, String additional ) throws Exception {

		FinInvoiceReceivable dao = new FinInvoiceReceivable();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseFinInvoiceReceivable> queryFinInvoiceReceivable( fix.db.bean.BaseFinInvoiceReceivable bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		FinInvoiceReceivable dao = new FinInvoiceReceivable();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseFinInvoiceReceivable> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseFinInvoiceReceivable> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseFinInvoiceReceivable addToFinInvoiceReceivable ( BaseFinInvoiceReceivable fininvoicereceivable )  throws Exception {
		return addToFinInvoiceReceivable ( fininvoicereceivable , false);
	}

	public static BaseFinInvoiceReceivable addToFinInvoiceReceivable ( BaseFinInvoiceReceivable fininvoicereceivable, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		FinInvoiceReceivable dao = new FinInvoiceReceivable();
		dao.setDataFromBase(fininvoicereceivable);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseFinInvoiceReceivable addUpdateFinInvoiceReceivable ( BaseFinInvoiceReceivable fininvoicereceivable ) throws Exception {
		return addUpdateFinInvoiceReceivable ( fininvoicereceivable , false);
	}

	public static BaseFinInvoiceReceivable addUpdateFinInvoiceReceivable ( BaseFinInvoiceReceivable fininvoicereceivable, boolean singleTransaction  ) throws Exception {
		if(fininvoicereceivable.getInvoiceReceivableId() == null) return addToFinInvoiceReceivable(fininvoicereceivable);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		FinInvoiceReceivable dao = new FinInvoiceReceivable();
		dao.setDataFromBase(fininvoicereceivable);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(fininvoicereceivable); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteFinInvoiceReceivable ( BaseFinInvoiceReceivable bean ) throws Exception {
		FinInvoiceReceivable dao = new FinInvoiceReceivable();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseFinInvoiceReceivable updateFinInvoiceReceivable ( BaseFinInvoiceReceivable fininvoicereceivable ) throws Exception {
		FinInvoiceReceivable dao = new FinInvoiceReceivable();
		dao.setInvoiceReceivableId( fininvoicereceivable.getInvoiceReceivableId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(fininvoicereceivable);
			result = dao.update();
		}
		return result == 1 ? fininvoicereceivable : null ;
	}

	public static BaseFinInvoiceReceivable updateFinInvoiceReceivableDirect( BaseFinInvoiceReceivable fininvoicereceivable ) throws Exception {
		FinInvoiceReceivable dao = new FinInvoiceReceivable();
		int result = 0;
		dao.setDataFromBase(fininvoicereceivable);
		result = dao.update();
		return result == 1 ? fininvoicereceivable : null ;
	}

	public static int setDeleteConditions(BaseFinInvoiceReceivable bean, FinInvoiceReceivable dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getInvoiceReceivableId() != null) {
			dao.setConditionInvoiceReceivableId("=", bean.getInvoiceReceivableId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getInvoiceReceivableCode() != null) {
				dao.setConditionInvoiceReceivableCode("=", bean.getInvoiceReceivableCode());
				count++;
			}
			if(bean.getInvoiceId() != null) {
				dao.setConditionInvoiceId("=", bean.getInvoiceId());
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
			if(bean.getReceivableId() != null) {
				dao.setConditionReceivableId("=", bean.getReceivableId());
				count++;
			}
			if(bean.getReceivableProductId() != null) {
				dao.setConditionReceivableProductId("=", bean.getReceivableProductId());
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

	public static int setConditions(BaseFinInvoiceReceivable bean, FinInvoiceReceivable dao){
		int count = 0;
		if(bean.getInvoiceReceivableId() != null) {
			dao.setConditionInvoiceReceivableId("=", bean.getInvoiceReceivableId());
			count++;
		}
		if(bean.getInvoiceReceivableCode() != null) {
			dao.setConditionInvoiceReceivableCode("=", bean.getInvoiceReceivableCode());
			count++;
		}
		if(bean.getInvoiceId() != null) {
			dao.setConditionInvoiceId("=", bean.getInvoiceId());
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
		if(bean.getReceivableId() != null) {
			dao.setConditionReceivableId("=", bean.getReceivableId());
			count++;
		}
		if(bean.getReceivableProductId() != null) {
			dao.setConditionReceivableProductId("=", bean.getReceivableProductId());
			count++;
		}
		if(bean.getProductId() != null) {
			dao.setConditionProductId("=", bean.getProductId());
			count++;
		}
		if(bean.getAmountInvoiceReceivable() != null) {
			dao.setConditionAmountInvoiceReceivable("=", bean.getAmountInvoiceReceivable());
			count++;
		}
		if(bean.getEmployeeIdCreated() != null) {
			dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
			count++;
		}
		if(bean.getDateIssued() != null) {
			dao.setConditionDateIssued(">=", bean.getDateIssued());
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
		if(bean.getContractId() != null) {
			dao.setConditionContractId("=", bean.getContractId());
			count++;
		}
		if(bean.getDateUpdated() != null) {
			dao.setConditionDateUpdated(">=", bean.getDateUpdated());
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
		BaseFinInvoiceReceivable bean = new BaseFinInvoiceReceivable();
		bean.setDataFromJSON(json);
		FinInvoiceReceivable dao = new FinInvoiceReceivable();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseFinInvoiceReceivable> rlist = new BaseCollection<>();
		BaseFinInvoiceReceivable bean = new BaseFinInvoiceReceivable();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		FinInvoiceReceivable dao = new FinInvoiceReceivable();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseFinInvoiceReceivable> result = dao.conditionalLoad(addtion);
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
		BaseFinInvoiceReceivable bean = new BaseFinInvoiceReceivable();
		bean.setDataFromJSON(json);
		FinInvoiceReceivable dao = new FinInvoiceReceivable();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseFinInvoiceReceivable bean = new BaseFinInvoiceReceivable();
		bean.setDataFromJSON(json);
		FinInvoiceReceivable dao = new FinInvoiceReceivable();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseFinInvoiceReceivable bean = new BaseFinInvoiceReceivable();
		bean.setDataFromJSON(json);
		FinInvoiceReceivable dao = new FinInvoiceReceivable();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseFinInvoiceReceivable bean = new BaseFinInvoiceReceivable();
		bean.setDataFromJSON(json);
		FinInvoiceReceivable dao = new FinInvoiceReceivable();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


