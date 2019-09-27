package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseFinReceipt;
import java.util.List;
import fix.db.dao.FinReceipt;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class FinReceiptHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(FinReceiptHandler.class);

	public static BaseFinReceipt getFinReceiptById( 
		java.lang.Integer receipt_id
	) throws Exception
	{
		FinReceipt dao = new FinReceipt();
		dao.setReceiptId(receipt_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isFinReceiptExists( fix.db.bean.BaseFinReceipt bean, String additional ) throws Exception {

		FinReceipt dao = new FinReceipt();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countFinReceipt( fix.db.bean.BaseFinReceipt bean, String additional ) throws Exception {

		FinReceipt dao = new FinReceipt();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseFinReceipt> queryFinReceipt( fix.db.bean.BaseFinReceipt bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		FinReceipt dao = new FinReceipt();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseFinReceipt> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseFinReceipt> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseFinReceipt addToFinReceipt ( BaseFinReceipt finreceipt )  throws Exception {
		return addToFinReceipt ( finreceipt , false);
	}

	public static BaseFinReceipt addToFinReceipt ( BaseFinReceipt finreceipt, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		FinReceipt dao = new FinReceipt();
		dao.setDataFromBase(finreceipt);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseFinReceipt addUpdateFinReceipt ( BaseFinReceipt finreceipt ) throws Exception {
		return addUpdateFinReceipt ( finreceipt , false);
	}

	public static BaseFinReceipt addUpdateFinReceipt ( BaseFinReceipt finreceipt, boolean singleTransaction  ) throws Exception {
		if(finreceipt.getReceiptId() == null) return addToFinReceipt(finreceipt);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		FinReceipt dao = new FinReceipt();
		dao.setDataFromBase(finreceipt);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(finreceipt); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteFinReceipt ( BaseFinReceipt bean ) throws Exception {
		FinReceipt dao = new FinReceipt();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseFinReceipt updateFinReceipt ( BaseFinReceipt finreceipt ) throws Exception {
		FinReceipt dao = new FinReceipt();
		dao.setReceiptId( finreceipt.getReceiptId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(finreceipt);
			result = dao.update();
		}
		return result == 1 ? finreceipt : null ;
	}

	public static BaseFinReceipt updateFinReceiptDirect( BaseFinReceipt finreceipt ) throws Exception {
		FinReceipt dao = new FinReceipt();
		int result = 0;
		dao.setDataFromBase(finreceipt);
		result = dao.update();
		return result == 1 ? finreceipt : null ;
	}

	public static int setDeleteConditions(BaseFinReceipt bean, FinReceipt dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getReceiptId() != null) {
			dao.setConditionReceiptId("=", bean.getReceiptId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getReceiptCode() != null) {
				dao.setConditionReceiptCode("=", bean.getReceiptCode());
				count++;
			}
			if(bean.getCustomerId() != null) {
				dao.setConditionCustomerId("=", bean.getCustomerId());
				count++;
			}
			if(bean.getEmployeeIdMaintainer() != null) {
				dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
				count++;
			}
			if(bean.getStatusReceipt() != null) {
				dao.setConditionStatusReceipt("=", bean.getStatusReceipt());
				count++;
			}
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
				count++;
			}
			if(bean.getReasonInvalidation() != null) {
				dao.setConditionReasonInvalidation("=", bean.getReasonInvalidation());
				count++;
			}
			if(bean.getEmployeeIdCreated() != null) {
				dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
				count++;
			}
			if(bean.getPaymentMethodAccepted() != null) {
				dao.setConditionPaymentMethodAccepted("=", bean.getPaymentMethodAccepted());
				count++;
			}
			if(bean.getEmployeeIdUpdated() != null) {
				dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseFinReceipt bean, FinReceipt dao){
		int count = 0;
		if(bean.getReceiptId() != null) {
			dao.setConditionReceiptId("=", bean.getReceiptId());
			count++;
		}
		if(bean.getReceiptCode() != null) {
			if(bean.getReceiptCode().indexOf("%") >= 0)
				dao.setConditionReceiptCode("like", bean.getReceiptCode());
			else
				dao.setConditionReceiptCode("=", bean.getReceiptCode());
			count++;
		}
		if(bean.getCustomerId() != null) {
			dao.setConditionCustomerId("=", bean.getCustomerId());
			count++;
		}
		if(bean.getEmployeeIdMaintainer() != null) {
			dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
			count++;
		}
		if(bean.getStatusReceipt() != null) {
			dao.setConditionStatusReceipt("=", bean.getStatusReceipt());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getDateReceipted() != null) {
			dao.setConditionDateReceipted(">=", bean.getDateReceipted());
			count++;
		}
		if(bean.getDateValidation() != null) {
			dao.setConditionDateValidation(">=", bean.getDateValidation());
			count++;
		}
		if(bean.getDateInvalidation() != null) {
			dao.setConditionDateInvalidation(">=", bean.getDateInvalidation());
			count++;
		}
		if(bean.getReasonInvalidation() != null) {
			dao.setConditionReasonInvalidation("=", bean.getReasonInvalidation());
			count++;
		}
		if(bean.getEmployeeIdCreated() != null) {
			dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
			count++;
		}
		if(bean.getPaymentMethodAccepted() != null) {
			dao.setConditionPaymentMethodAccepted("=", bean.getPaymentMethodAccepted());
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
		BaseFinReceipt bean = new BaseFinReceipt();
		bean.setDataFromJSON(json);
		FinReceipt dao = new FinReceipt();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseFinReceipt> rlist = new BaseCollection<>();
		BaseFinReceipt bean = new BaseFinReceipt();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		FinReceipt dao = new FinReceipt();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseFinReceipt> result = dao.conditionalLoad(addtion);
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
		BaseFinReceipt bean = new BaseFinReceipt();
		bean.setDataFromJSON(json);
		FinReceipt dao = new FinReceipt();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseFinReceipt bean = new BaseFinReceipt();
		bean.setDataFromJSON(json);
		FinReceipt dao = new FinReceipt();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseFinReceipt bean = new BaseFinReceipt();
		bean.setDataFromJSON(json);
		FinReceipt dao = new FinReceipt();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseFinReceipt bean = new BaseFinReceipt();
		bean.setDataFromJSON(json);
		FinReceipt dao = new FinReceipt();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


