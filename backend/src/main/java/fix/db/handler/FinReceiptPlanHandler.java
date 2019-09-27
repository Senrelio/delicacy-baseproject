package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseFinReceiptPlan;
import java.util.List;
import fix.db.dao.FinReceiptPlan;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class FinReceiptPlanHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(FinReceiptPlanHandler.class);

	public static BaseFinReceiptPlan getFinReceiptPlanById( 
		java.lang.Integer receipt_plan_id
	) throws Exception
	{
		FinReceiptPlan dao = new FinReceiptPlan();
		dao.setReceiptPlanId(receipt_plan_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isFinReceiptPlanExists( fix.db.bean.BaseFinReceiptPlan bean, String additional ) throws Exception {

		FinReceiptPlan dao = new FinReceiptPlan();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countFinReceiptPlan( fix.db.bean.BaseFinReceiptPlan bean, String additional ) throws Exception {

		FinReceiptPlan dao = new FinReceiptPlan();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseFinReceiptPlan> queryFinReceiptPlan( fix.db.bean.BaseFinReceiptPlan bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		FinReceiptPlan dao = new FinReceiptPlan();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseFinReceiptPlan> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseFinReceiptPlan> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseFinReceiptPlan addToFinReceiptPlan ( BaseFinReceiptPlan finreceiptplan )  throws Exception {
		return addToFinReceiptPlan ( finreceiptplan , false);
	}

	public static BaseFinReceiptPlan addToFinReceiptPlan ( BaseFinReceiptPlan finreceiptplan, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		FinReceiptPlan dao = new FinReceiptPlan();
		dao.setDataFromBase(finreceiptplan);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseFinReceiptPlan addUpdateFinReceiptPlan ( BaseFinReceiptPlan finreceiptplan ) throws Exception {
		return addUpdateFinReceiptPlan ( finreceiptplan , false);
	}

	public static BaseFinReceiptPlan addUpdateFinReceiptPlan ( BaseFinReceiptPlan finreceiptplan, boolean singleTransaction  ) throws Exception {
		if(finreceiptplan.getReceiptPlanId() == null) return addToFinReceiptPlan(finreceiptplan);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		FinReceiptPlan dao = new FinReceiptPlan();
		dao.setDataFromBase(finreceiptplan);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(finreceiptplan); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteFinReceiptPlan ( BaseFinReceiptPlan bean ) throws Exception {
		FinReceiptPlan dao = new FinReceiptPlan();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseFinReceiptPlan updateFinReceiptPlan ( BaseFinReceiptPlan finreceiptplan ) throws Exception {
		FinReceiptPlan dao = new FinReceiptPlan();
		dao.setReceiptPlanId( finreceiptplan.getReceiptPlanId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(finreceiptplan);
			result = dao.update();
		}
		return result == 1 ? finreceiptplan : null ;
	}

	public static BaseFinReceiptPlan updateFinReceiptPlanDirect( BaseFinReceiptPlan finreceiptplan ) throws Exception {
		FinReceiptPlan dao = new FinReceiptPlan();
		int result = 0;
		dao.setDataFromBase(finreceiptplan);
		result = dao.update();
		return result == 1 ? finreceiptplan : null ;
	}

	public static int setDeleteConditions(BaseFinReceiptPlan bean, FinReceiptPlan dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getReceiptPlanId() != null) {
			dao.setConditionReceiptPlanId("=", bean.getReceiptPlanId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getReceiptPlanCode() != null) {
				dao.setConditionReceiptPlanCode("=", bean.getReceiptPlanCode());
				count++;
			}
			if(bean.getEmployeeIdMaintainer() != null) {
				dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
				count++;
			}
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
				count++;
			}
			if(bean.getCustomerId() != null) {
				dao.setConditionCustomerId("=", bean.getCustomerId());
				count++;
			}
			if(bean.getContractId() != null) {
				dao.setConditionContractId("=", bean.getContractId());
				count++;
			}
			if(bean.getStageReceipt() != null) {
				dao.setConditionStageReceipt("=", bean.getStageReceipt());
				count++;
			}
			if(bean.getReceiptNthTime() != null) {
				dao.setConditionReceiptNthTime("=", bean.getReceiptNthTime());
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
			if(bean.getOrderId() != null) {
				dao.setConditionOrderId("=", bean.getOrderId());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseFinReceiptPlan bean, FinReceiptPlan dao){
		int count = 0;
		if(bean.getReceiptPlanId() != null) {
			dao.setConditionReceiptPlanId("=", bean.getReceiptPlanId());
			count++;
		}
		if(bean.getReceiptPlanCode() != null) {
			if(bean.getReceiptPlanCode().indexOf("%") >= 0)
				dao.setConditionReceiptPlanCode("like", bean.getReceiptPlanCode());
			else
				dao.setConditionReceiptPlanCode("=", bean.getReceiptPlanCode());
			count++;
		}
		if(bean.getDateReceiptedPlanned() != null) {
			dao.setConditionDateReceiptedPlanned(">=", bean.getDateReceiptedPlanned());
			count++;
		}
		if(bean.getDateFirstReceipt() != null) {
			dao.setConditionDateFirstReceipt(">=", bean.getDateFirstReceipt());
			count++;
		}
		if(bean.getEmployeeIdMaintainer() != null) {
			dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
			count++;
		}
		if(bean.getDateLatestReceipt() != null) {
			dao.setConditionDateLatestReceipt(">=", bean.getDateLatestReceipt());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getCustomerId() != null) {
			dao.setConditionCustomerId("=", bean.getCustomerId());
			count++;
		}
		if(bean.getContractId() != null) {
			dao.setConditionContractId("=", bean.getContractId());
			count++;
		}
		if(bean.getStageReceipt() != null) {
			dao.setConditionStageReceipt("=", bean.getStageReceipt());
			count++;
		}
		if(bean.getReceiptNthTime() != null) {
			dao.setConditionReceiptNthTime("=", bean.getReceiptNthTime());
			count++;
		}
		if(bean.getEmployeeIdCreated() != null) {
			dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
			count++;
		}
		if(bean.getPercentageReceiptPlanned() != null) {
			dao.setConditionPercentageReceiptPlanned("=", bean.getPercentageReceiptPlanned());
			count++;
		}
		if(bean.getDateCreated() != null) {
			dao.setConditionDateCreated(">=", bean.getDateCreated());
			count++;
		}
		if(bean.getAmountReceiptPlanned() != null) {
			dao.setConditionAmountReceiptPlanned("=", bean.getAmountReceiptPlanned());
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
		if(bean.getDateUpdated() != null) {
			dao.setConditionDateUpdated(">=", bean.getDateUpdated());
			count++;
		}
		if(bean.getOrderId() != null) {
			dao.setConditionOrderId("=", bean.getOrderId());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseFinReceiptPlan bean = new BaseFinReceiptPlan();
		bean.setDataFromJSON(json);
		FinReceiptPlan dao = new FinReceiptPlan();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseFinReceiptPlan> rlist = new BaseCollection<>();
		BaseFinReceiptPlan bean = new BaseFinReceiptPlan();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		FinReceiptPlan dao = new FinReceiptPlan();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseFinReceiptPlan> result = dao.conditionalLoad(addtion);
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
		BaseFinReceiptPlan bean = new BaseFinReceiptPlan();
		bean.setDataFromJSON(json);
		FinReceiptPlan dao = new FinReceiptPlan();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseFinReceiptPlan bean = new BaseFinReceiptPlan();
		bean.setDataFromJSON(json);
		FinReceiptPlan dao = new FinReceiptPlan();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseFinReceiptPlan bean = new BaseFinReceiptPlan();
		bean.setDataFromJSON(json);
		FinReceiptPlan dao = new FinReceiptPlan();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseFinReceiptPlan bean = new BaseFinReceiptPlan();
		bean.setDataFromJSON(json);
		FinReceiptPlan dao = new FinReceiptPlan();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


