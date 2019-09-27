package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseFinReceivableChange;
import java.util.List;
import fix.db.dao.FinReceivableChange;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class FinReceivableChangeHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(FinReceivableChangeHandler.class);

	public static BaseFinReceivableChange getFinReceivableChangeById( 
		java.lang.Integer receivable_change_id
	) throws Exception
	{
		FinReceivableChange dao = new FinReceivableChange();
		dao.setReceivableChangeId(receivable_change_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isFinReceivableChangeExists( fix.db.bean.BaseFinReceivableChange bean, String additional ) throws Exception {

		FinReceivableChange dao = new FinReceivableChange();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countFinReceivableChange( fix.db.bean.BaseFinReceivableChange bean, String additional ) throws Exception {

		FinReceivableChange dao = new FinReceivableChange();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseFinReceivableChange> queryFinReceivableChange( fix.db.bean.BaseFinReceivableChange bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		FinReceivableChange dao = new FinReceivableChange();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseFinReceivableChange> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseFinReceivableChange> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseFinReceivableChange addToFinReceivableChange ( BaseFinReceivableChange finreceivablechange )  throws Exception {
		return addToFinReceivableChange ( finreceivablechange , false);
	}

	public static BaseFinReceivableChange addToFinReceivableChange ( BaseFinReceivableChange finreceivablechange, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		FinReceivableChange dao = new FinReceivableChange();
		dao.setDataFromBase(finreceivablechange);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseFinReceivableChange addUpdateFinReceivableChange ( BaseFinReceivableChange finreceivablechange ) throws Exception {
		return addUpdateFinReceivableChange ( finreceivablechange , false);
	}

	public static BaseFinReceivableChange addUpdateFinReceivableChange ( BaseFinReceivableChange finreceivablechange, boolean singleTransaction  ) throws Exception {
		if(finreceivablechange.getReceivableChangeId() == null) return addToFinReceivableChange(finreceivablechange);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		FinReceivableChange dao = new FinReceivableChange();
		dao.setDataFromBase(finreceivablechange);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(finreceivablechange); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteFinReceivableChange ( BaseFinReceivableChange bean ) throws Exception {
		FinReceivableChange dao = new FinReceivableChange();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseFinReceivableChange updateFinReceivableChange ( BaseFinReceivableChange finreceivablechange ) throws Exception {
		FinReceivableChange dao = new FinReceivableChange();
		dao.setReceivableChangeId( finreceivablechange.getReceivableChangeId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(finreceivablechange);
			result = dao.update();
		}
		return result == 1 ? finreceivablechange : null ;
	}

	public static BaseFinReceivableChange updateFinReceivableChangeDirect( BaseFinReceivableChange finreceivablechange ) throws Exception {
		FinReceivableChange dao = new FinReceivableChange();
		int result = 0;
		dao.setDataFromBase(finreceivablechange);
		result = dao.update();
		return result == 1 ? finreceivablechange : null ;
	}

	public static int setDeleteConditions(BaseFinReceivableChange bean, FinReceivableChange dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getReceivableChangeId() != null) {
			dao.setConditionReceivableChangeId("=", bean.getReceivableChangeId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getReceivableChangeCode() != null) {
				dao.setConditionReceivableChangeCode("=", bean.getReceivableChangeCode());
				count++;
			}
			if(bean.getCustomerId() != null) {
				dao.setConditionCustomerId("=", bean.getCustomerId());
				count++;
			}
			if(bean.getStatusReceivableChange() != null) {
				dao.setConditionStatusReceivableChange("=", bean.getStatusReceivableChange());
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
			if(bean.getAddressDelivery() != null) {
				dao.setConditionAddressDelivery("=", bean.getAddressDelivery());
				count++;
			}
			if(bean.getPostcode() != null) {
				dao.setConditionPostcode("=", bean.getPostcode());
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
			if(bean.getEmployeeIdCreated() != null) {
				dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
				count++;
			}
			if(bean.getDescription() != null) {
				dao.setConditionDescription("=", bean.getDescription());
				count++;
			}
			if(bean.getEmployeeIdUpdated() != null) {
				dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
				count++;
			}
			if(bean.getReasonInvalidation() != null) {
				dao.setConditionReasonInvalidation("=", bean.getReasonInvalidation());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseFinReceivableChange bean, FinReceivableChange dao){
		int count = 0;
		if(bean.getReceivableChangeId() != null) {
			dao.setConditionReceivableChangeId("=", bean.getReceivableChangeId());
			count++;
		}
		if(bean.getReceivableChangeCode() != null) {
			if(bean.getReceivableChangeCode().indexOf("%") >= 0)
				dao.setConditionReceivableChangeCode("like", bean.getReceivableChangeCode());
			else
				dao.setConditionReceivableChangeCode("=", bean.getReceivableChangeCode());
			count++;
		}
		if(bean.getCustomerId() != null) {
			dao.setConditionCustomerId("=", bean.getCustomerId());
			count++;
		}
		if(bean.getStatusReceivableChange() != null) {
			dao.setConditionStatusReceivableChange("=", bean.getStatusReceivableChange());
			count++;
		}
		if(bean.getEmployeeIdMaintainer() != null) {
			dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
			count++;
		}
		if(bean.getDateChanged() != null) {
			dao.setConditionDateChanged(">=", bean.getDateChanged());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
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
		if(bean.getEmployeeIdCreated() != null) {
			dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
			count++;
		}
		if(bean.getDateCreated() != null) {
			dao.setConditionDateCreated(">=", bean.getDateCreated());
			count++;
		}
		if(bean.getDescription() != null) {
			if(bean.getDescription().indexOf("%") >= 0)
				dao.setConditionDescription("like", bean.getDescription());
			else
				dao.setConditionDescription("=", bean.getDescription());
			count++;
		}
		if(bean.getDateValidation() != null) {
			dao.setConditionDateValidation(">=", bean.getDateValidation());
			count++;
		}
		if(bean.getEmployeeIdUpdated() != null) {
			dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
			count++;
		}
		if(bean.getDateInvalidation() != null) {
			dao.setConditionDateInvalidation(">=", bean.getDateInvalidation());
			count++;
		}
		if(bean.getDateUpdated() != null) {
			dao.setConditionDateUpdated(">=", bean.getDateUpdated());
			count++;
		}
		if(bean.getReasonInvalidation() != null) {
			dao.setConditionReasonInvalidation("=", bean.getReasonInvalidation());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseFinReceivableChange bean = new BaseFinReceivableChange();
		bean.setDataFromJSON(json);
		FinReceivableChange dao = new FinReceivableChange();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseFinReceivableChange> rlist = new BaseCollection<>();
		BaseFinReceivableChange bean = new BaseFinReceivableChange();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		FinReceivableChange dao = new FinReceivableChange();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseFinReceivableChange> result = dao.conditionalLoad(addtion);
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
		BaseFinReceivableChange bean = new BaseFinReceivableChange();
		bean.setDataFromJSON(json);
		FinReceivableChange dao = new FinReceivableChange();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseFinReceivableChange bean = new BaseFinReceivableChange();
		bean.setDataFromJSON(json);
		FinReceivableChange dao = new FinReceivableChange();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseFinReceivableChange bean = new BaseFinReceivableChange();
		bean.setDataFromJSON(json);
		FinReceivableChange dao = new FinReceivableChange();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseFinReceivableChange bean = new BaseFinReceivableChange();
		bean.setDataFromJSON(json);
		FinReceivableChange dao = new FinReceivableChange();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


