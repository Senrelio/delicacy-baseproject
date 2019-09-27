package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseFinRefund;
import java.util.List;
import fix.db.dao.FinRefund;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class FinRefundHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(FinRefundHandler.class);

	public static BaseFinRefund getFinRefundById( 
		java.lang.Integer refund_id
	) throws Exception
	{
		FinRefund dao = new FinRefund();
		dao.setRefundId(refund_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isFinRefundExists( fix.db.bean.BaseFinRefund bean, String additional ) throws Exception {

		FinRefund dao = new FinRefund();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countFinRefund( fix.db.bean.BaseFinRefund bean, String additional ) throws Exception {

		FinRefund dao = new FinRefund();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseFinRefund> queryFinRefund( fix.db.bean.BaseFinRefund bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		FinRefund dao = new FinRefund();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseFinRefund> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseFinRefund> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseFinRefund addToFinRefund ( BaseFinRefund finrefund )  throws Exception {
		return addToFinRefund ( finrefund , false);
	}

	public static BaseFinRefund addToFinRefund ( BaseFinRefund finrefund, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		FinRefund dao = new FinRefund();
		dao.setDataFromBase(finrefund);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseFinRefund addUpdateFinRefund ( BaseFinRefund finrefund ) throws Exception {
		return addUpdateFinRefund ( finrefund , false);
	}

	public static BaseFinRefund addUpdateFinRefund ( BaseFinRefund finrefund, boolean singleTransaction  ) throws Exception {
		if(finrefund.getRefundId() == null) return addToFinRefund(finrefund);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		FinRefund dao = new FinRefund();
		dao.setDataFromBase(finrefund);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(finrefund); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteFinRefund ( BaseFinRefund bean ) throws Exception {
		FinRefund dao = new FinRefund();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseFinRefund updateFinRefund ( BaseFinRefund finrefund ) throws Exception {
		FinRefund dao = new FinRefund();
		dao.setRefundId( finrefund.getRefundId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(finrefund);
			result = dao.update();
		}
		return result == 1 ? finrefund : null ;
	}

	public static BaseFinRefund updateFinRefundDirect( BaseFinRefund finrefund ) throws Exception {
		FinRefund dao = new FinRefund();
		int result = 0;
		dao.setDataFromBase(finrefund);
		result = dao.update();
		return result == 1 ? finrefund : null ;
	}

	public static int setDeleteConditions(BaseFinRefund bean, FinRefund dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getRefundId() != null) {
			dao.setConditionRefundId("=", bean.getRefundId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getRefundCode() != null) {
				dao.setConditionRefundCode("=", bean.getRefundCode());
				count++;
			}
			if(bean.getEmployeeIdMaintainer() != null) {
				dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
				count++;
			}
			if(bean.getCustomerId() != null) {
				dao.setConditionCustomerId("=", bean.getCustomerId());
				count++;
			}
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
				count++;
			}
			if(bean.getReasonRefund() != null) {
				dao.setConditionReasonRefund("=", bean.getReasonRefund());
				count++;
			}
			if(bean.getStatusRefund() != null) {
				dao.setConditionStatusRefund("=", bean.getStatusRefund());
				count++;
			}
			if(bean.getContactName() != null) {
				dao.setConditionContactName("=", bean.getContactName());
				count++;
			}
			if(bean.getContactMobile() != null) {
				dao.setConditionContactMobile("=", bean.getContactMobile());
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
			if(bean.getEmployeeIdUpdated() != null) {
				dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
				count++;
			}
			if(bean.getDescriptionRefund() != null) {
				dao.setConditionDescriptionRefund("=", bean.getDescriptionRefund());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseFinRefund bean, FinRefund dao){
		int count = 0;
		if(bean.getRefundId() != null) {
			dao.setConditionRefundId("=", bean.getRefundId());
			count++;
		}
		if(bean.getRefundCode() != null) {
			if(bean.getRefundCode().indexOf("%") >= 0)
				dao.setConditionRefundCode("like", bean.getRefundCode());
			else
				dao.setConditionRefundCode("=", bean.getRefundCode());
			count++;
		}
		if(bean.getDateRefunded() != null) {
			dao.setConditionDateRefunded(">=", bean.getDateRefunded());
			count++;
		}
		if(bean.getDateValidation() != null) {
			dao.setConditionDateValidation(">=", bean.getDateValidation());
			count++;
		}
		if(bean.getEmployeeIdMaintainer() != null) {
			dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
			count++;
		}
		if(bean.getCustomerId() != null) {
			dao.setConditionCustomerId("=", bean.getCustomerId());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getReasonRefund() != null) {
			dao.setConditionReasonRefund("=", bean.getReasonRefund());
			count++;
		}
		if(bean.getStatusRefund() != null) {
			dao.setConditionStatusRefund("=", bean.getStatusRefund());
			count++;
		}
		if(bean.getContactName() != null) {
			if(bean.getContactName().indexOf("%") >= 0)
				dao.setConditionContactName("like", bean.getContactName());
			else
				dao.setConditionContactName("=", bean.getContactName());
			count++;
		}
		if(bean.getContactMobile() != null) {
			if(bean.getContactMobile().indexOf("%") >= 0)
				dao.setConditionContactMobile("like", bean.getContactMobile());
			else
				dao.setConditionContactMobile("=", bean.getContactMobile());
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
		if(bean.getDateInvalidation() != null) {
			dao.setConditionDateInvalidation(">=", bean.getDateInvalidation());
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
		if(bean.getDescriptionRefund() != null) {
			if(bean.getDescriptionRefund().indexOf("%") >= 0)
				dao.setConditionDescriptionRefund("like", bean.getDescriptionRefund());
			else
				dao.setConditionDescriptionRefund("=", bean.getDescriptionRefund());
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
		BaseFinRefund bean = new BaseFinRefund();
		bean.setDataFromJSON(json);
		FinRefund dao = new FinRefund();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseFinRefund> rlist = new BaseCollection<>();
		BaseFinRefund bean = new BaseFinRefund();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		FinRefund dao = new FinRefund();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseFinRefund> result = dao.conditionalLoad(addtion);
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
		BaseFinRefund bean = new BaseFinRefund();
		bean.setDataFromJSON(json);
		FinRefund dao = new FinRefund();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseFinRefund bean = new BaseFinRefund();
		bean.setDataFromJSON(json);
		FinRefund dao = new FinRefund();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseFinRefund bean = new BaseFinRefund();
		bean.setDataFromJSON(json);
		FinRefund dao = new FinRefund();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseFinRefund bean = new BaseFinRefund();
		bean.setDataFromJSON(json);
		FinRefund dao = new FinRefund();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


