package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseFinReceivable;
import java.util.List;
import fix.db.dao.FinReceivable;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class FinReceivableHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(FinReceivableHandler.class);

	public static BaseFinReceivable getFinReceivableById( 

	) throws Exception
	{
		FinReceivable dao = new FinReceivable();
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isFinReceivableExists( fix.db.bean.BaseFinReceivable bean, String additional ) throws Exception {

		FinReceivable dao = new FinReceivable();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countFinReceivable( fix.db.bean.BaseFinReceivable bean, String additional ) throws Exception {

		FinReceivable dao = new FinReceivable();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseFinReceivable> queryFinReceivable( fix.db.bean.BaseFinReceivable bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		FinReceivable dao = new FinReceivable();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseFinReceivable> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseFinReceivable> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseFinReceivable addToFinReceivable ( BaseFinReceivable finreceivable )  throws Exception {
		return addToFinReceivable ( finreceivable , false);
	}

	public static BaseFinReceivable addToFinReceivable ( BaseFinReceivable finreceivable, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		FinReceivable dao = new FinReceivable();
		dao.setDataFromBase(finreceivable);
		int result = dao.save(false);
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseFinReceivable addUpdateFinReceivable ( BaseFinReceivable finreceivable ) throws Exception {
		return addUpdateFinReceivable ( finreceivable , false);
	}

	public static BaseFinReceivable addUpdateFinReceivable ( BaseFinReceivable finreceivable, boolean singleTransaction  ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		FinReceivable dao = new FinReceivable();
		dao.setDataFromBase(finreceivable);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(finreceivable); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save(false);
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteFinReceivable ( BaseFinReceivable bean ) throws Exception {
		FinReceivable dao = new FinReceivable();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseFinReceivable updateFinReceivable ( BaseFinReceivable finreceivable ) throws Exception {
		FinReceivable dao = new FinReceivable();
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(finreceivable);
			result = dao.update();
		}
		return result == 1 ? finreceivable : null ;
	}

	public static BaseFinReceivable updateFinReceivableDirect( BaseFinReceivable finreceivable ) throws Exception {
		FinReceivable dao = new FinReceivable();
		int result = 0;
		dao.setDataFromBase(finreceivable);
		result = dao.update();
		return result == 1 ? finreceivable : null ;
	}

	public static int setDeleteConditions(BaseFinReceivable bean, FinReceivable dao){
		int count = 0;
		boolean foundKey = false;
		if(!foundKey) {
			if(bean.getReceivableId() != null) {
				dao.setConditionReceivableId("=", bean.getReceivableId());
				count++;
			}
			if(bean.getEntityType() != null) {
				dao.setConditionEntityType("=", bean.getEntityType());
				count++;
			}
			if(bean.getDescription() != null) {
				dao.setConditionDescription("=", bean.getDescription());
				count++;
			}
			if(bean.getEmployeeIdMaintainer() != null) {
				dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
				count++;
			}
			if(bean.getInvoiceType() != null) {
				dao.setConditionInvoiceType("=", bean.getInvoiceType());
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
			if(bean.getEmployeeIdCreated() != null) {
				dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
				count++;
			}
			if(bean.getReasonInvalidation() != null) {
				dao.setConditionReasonInvalidation("=", bean.getReasonInvalidation());
				count++;
			}
			if(bean.getEmployeeIdUpdated() != null) {
				dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
				count++;
			}
			if(bean.getStatusReceivable() != null) {
				dao.setConditionStatusReceivable("=", bean.getStatusReceivable());
				count++;
			}
			if(bean.getContactId() != null) {
				dao.setConditionContactId("=", bean.getContactId());
				count++;
			}
			if(bean.getFlagOvertime() != null) {
				dao.setConditionFlagOvertime("=", bean.getFlagOvertime());
				count++;
			}
			if(bean.getMobile() != null) {
				dao.setConditionMobile("=", bean.getMobile());
				count++;
			}
			if(bean.getCompanyNameInvoice() != null) {
				dao.setConditionCompanyNameInvoice("=", bean.getCompanyNameInvoice());
				count++;
			}
			if(bean.getAddressDelivery() != null) {
				dao.setConditionAddressDelivery("=", bean.getAddressDelivery());
				count++;
			}
			if(bean.getPostcode() != null) {
				dao.setConditionPostcode("=", bean.getPostcode());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseFinReceivable bean, FinReceivable dao){
		int count = 0;
		if(bean.getReceivableId() != null) {
			dao.setConditionReceivableId("=", bean.getReceivableId());
			count++;
		}
		if(bean.getEntityType() != null) {
			dao.setConditionEntityType("=", bean.getEntityType());
			count++;
		}
		if(bean.getDescription() != null) {
			if(bean.getDescription().indexOf("%") >= 0)
				dao.setConditionDescription("like", bean.getDescription());
			else
				dao.setConditionDescription("=", bean.getDescription());
			count++;
		}
		if(bean.getEmployeeIdMaintainer() != null) {
			dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
			count++;
		}
		if(bean.getInvoiceType() != null) {
			dao.setConditionInvoiceType("=", bean.getInvoiceType());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getDateValidation() != null) {
			dao.setConditionDateValidation(">=", bean.getDateValidation());
			count++;
		}
		if(bean.getCustomerId() != null) {
			dao.setConditionCustomerId("=", bean.getCustomerId());
			count++;
		}
		if(bean.getDateInvalidation() != null) {
			dao.setConditionDateInvalidation(">=", bean.getDateInvalidation());
			count++;
		}
		if(bean.getEmployeeIdCreated() != null) {
			dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
			count++;
		}
		if(bean.getReasonInvalidation() != null) {
			dao.setConditionReasonInvalidation("=", bean.getReasonInvalidation());
			count++;
		}
		if(bean.getDateCreated() != null) {
			dao.setConditionDateCreated(">=", bean.getDateCreated());
			count++;
		}
		if(bean.getDateDue() != null) {
			dao.setConditionDateDue(">=", bean.getDateDue());
			count++;
		}
		if(bean.getEmployeeIdUpdated() != null) {
			dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
			count++;
		}
		if(bean.getStatusReceivable() != null) {
			dao.setConditionStatusReceivable("=", bean.getStatusReceivable());
			count++;
		}
		if(bean.getContactId() != null) {
			dao.setConditionContactId("=", bean.getContactId());
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
		if(bean.getMobile() != null) {
			if(bean.getMobile().indexOf("%") >= 0)
				dao.setConditionMobile("like", bean.getMobile());
			else
				dao.setConditionMobile("=", bean.getMobile());
			count++;
		}
		if(bean.getCompanyNameInvoice() != null) {
			if(bean.getCompanyNameInvoice().indexOf("%") >= 0)
				dao.setConditionCompanyNameInvoice("like", bean.getCompanyNameInvoice());
			else
				dao.setConditionCompanyNameInvoice("=", bean.getCompanyNameInvoice());
			count++;
		}
		if(bean.getAddressDelivery() != null) {
			if(bean.getAddressDelivery().indexOf("%") >= 0)
				dao.setConditionAddressDelivery("like", bean.getAddressDelivery());
			else
				dao.setConditionAddressDelivery("=", bean.getAddressDelivery());
			count++;
		}
		if(bean.getPostcode() != null) {
			if(bean.getPostcode().indexOf("%") >= 0)
				dao.setConditionPostcode("like", bean.getPostcode());
			else
				dao.setConditionPostcode("=", bean.getPostcode());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseFinReceivable bean = new BaseFinReceivable();
		bean.setDataFromJSON(json);
		FinReceivable dao = new FinReceivable();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseFinReceivable> rlist = new BaseCollection<>();
		BaseFinReceivable bean = new BaseFinReceivable();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		FinReceivable dao = new FinReceivable();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseFinReceivable> result = dao.conditionalLoad(addtion);
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
		BaseFinReceivable bean = new BaseFinReceivable();
		bean.setDataFromJSON(json);
		FinReceivable dao = new FinReceivable();
		dao.setDataFromBase(bean);
		int num = dao.save(false);
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseFinReceivable bean = new BaseFinReceivable();
		bean.setDataFromJSON(json);
		FinReceivable dao = new FinReceivable();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseFinReceivable bean = new BaseFinReceivable();
		bean.setDataFromJSON(json);
		FinReceivable dao = new FinReceivable();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseFinReceivable bean = new BaseFinReceivable();
		bean.setDataFromJSON(json);
		FinReceivable dao = new FinReceivable();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(false); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


