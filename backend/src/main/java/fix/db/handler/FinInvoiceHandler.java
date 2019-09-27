package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseFinInvoice;
import java.util.List;
import fix.db.dao.FinInvoice;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class FinInvoiceHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(FinInvoiceHandler.class);

	public static BaseFinInvoice getFinInvoiceById( 
		java.lang.Integer invoice_id
	) throws Exception
	{
		FinInvoice dao = new FinInvoice();
		dao.setInvoiceId(invoice_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isFinInvoiceExists( fix.db.bean.BaseFinInvoice bean, String additional ) throws Exception {

		FinInvoice dao = new FinInvoice();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countFinInvoice( fix.db.bean.BaseFinInvoice bean, String additional ) throws Exception {

		FinInvoice dao = new FinInvoice();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseFinInvoice> queryFinInvoice( fix.db.bean.BaseFinInvoice bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		FinInvoice dao = new FinInvoice();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseFinInvoice> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseFinInvoice> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseFinInvoice addToFinInvoice ( BaseFinInvoice fininvoice )  throws Exception {
		return addToFinInvoice ( fininvoice , false);
	}

	public static BaseFinInvoice addToFinInvoice ( BaseFinInvoice fininvoice, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		FinInvoice dao = new FinInvoice();
		dao.setDataFromBase(fininvoice);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseFinInvoice addUpdateFinInvoice ( BaseFinInvoice fininvoice ) throws Exception {
		return addUpdateFinInvoice ( fininvoice , false);
	}

	public static BaseFinInvoice addUpdateFinInvoice ( BaseFinInvoice fininvoice, boolean singleTransaction  ) throws Exception {
		if(fininvoice.getInvoiceId() == null) return addToFinInvoice(fininvoice);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		FinInvoice dao = new FinInvoice();
		dao.setDataFromBase(fininvoice);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(fininvoice); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteFinInvoice ( BaseFinInvoice bean ) throws Exception {
		FinInvoice dao = new FinInvoice();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseFinInvoice updateFinInvoice ( BaseFinInvoice fininvoice ) throws Exception {
		FinInvoice dao = new FinInvoice();
		dao.setInvoiceId( fininvoice.getInvoiceId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(fininvoice);
			result = dao.update();
		}
		return result == 1 ? fininvoice : null ;
	}

	public static BaseFinInvoice updateFinInvoiceDirect( BaseFinInvoice fininvoice ) throws Exception {
		FinInvoice dao = new FinInvoice();
		int result = 0;
		dao.setDataFromBase(fininvoice);
		result = dao.update();
		return result == 1 ? fininvoice : null ;
	}

	public static int setDeleteConditions(BaseFinInvoice bean, FinInvoice dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getInvoiceId() != null) {
			dao.setConditionInvoiceId("=", bean.getInvoiceId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getInvoiceCode() != null) {
				dao.setConditionInvoiceCode("=", bean.getInvoiceCode());
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
			if(bean.getContactName() != null) {
				dao.setConditionContactName("=", bean.getContactName());
				count++;
			}
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
				count++;
			}
			if(bean.getContactMobile() != null) {
				dao.setConditionContactMobile("=", bean.getContactMobile());
				count++;
			}
			if(bean.getCustomerName() != null) {
				dao.setConditionCustomerName("=", bean.getCustomerName());
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
			if(bean.getStatusInvoice() != null) {
				dao.setConditionStatusInvoice("=", bean.getStatusInvoice());
				count++;
			}
			if(bean.getEmployeeIdCreated() != null) {
				dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
				count++;
			}
			if(bean.getInvoiceType() != null) {
				dao.setConditionInvoiceType("=", bean.getInvoiceType());
				count++;
			}
			if(bean.getEmployeeIdUpdated() != null) {
				dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
				count++;
			}
			if(bean.getDescriptionInvoice() != null) {
				dao.setConditionDescriptionInvoice("=", bean.getDescriptionInvoice());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseFinInvoice bean, FinInvoice dao){
		int count = 0;
		if(bean.getInvoiceId() != null) {
			dao.setConditionInvoiceId("=", bean.getInvoiceId());
			count++;
		}
		if(bean.getInvoiceCode() != null) {
			if(bean.getInvoiceCode().indexOf("%") >= 0)
				dao.setConditionInvoiceCode("like", bean.getInvoiceCode());
			else
				dao.setConditionInvoiceCode("=", bean.getInvoiceCode());
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
		if(bean.getContactName() != null) {
			if(bean.getContactName().indexOf("%") >= 0)
				dao.setConditionContactName("like", bean.getContactName());
			else
				dao.setConditionContactName("=", bean.getContactName());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getContactMobile() != null) {
			if(bean.getContactMobile().indexOf("%") >= 0)
				dao.setConditionContactMobile("like", bean.getContactMobile());
			else
				dao.setConditionContactMobile("=", bean.getContactMobile());
			count++;
		}
		if(bean.getCustomerName() != null) {
			if(bean.getCustomerName().indexOf("%") >= 0)
				dao.setConditionCustomerName("like", bean.getCustomerName());
			else
				dao.setConditionCustomerName("=", bean.getCustomerName());
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
		if(bean.getStatusInvoice() != null) {
			dao.setConditionStatusInvoice("=", bean.getStatusInvoice());
			count++;
		}
		if(bean.getEmployeeIdCreated() != null) {
			dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
			count++;
		}
		if(bean.getInvoiceType() != null) {
			dao.setConditionInvoiceType("=", bean.getInvoiceType());
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
		if(bean.getDateIssued() != null) {
			dao.setConditionDateIssued(">=", bean.getDateIssued());
			count++;
		}
		if(bean.getDateValidation() != null) {
			dao.setConditionDateValidation(">=", bean.getDateValidation());
			count++;
		}
		if(bean.getDateUpdated() != null) {
			dao.setConditionDateUpdated(">=", bean.getDateUpdated());
			count++;
		}
		if(bean.getDescriptionInvoice() != null) {
			if(bean.getDescriptionInvoice().indexOf("%") >= 0)
				dao.setConditionDescriptionInvoice("like", bean.getDescriptionInvoice());
			else
				dao.setConditionDescriptionInvoice("=", bean.getDescriptionInvoice());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseFinInvoice bean = new BaseFinInvoice();
		bean.setDataFromJSON(json);
		FinInvoice dao = new FinInvoice();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseFinInvoice> rlist = new BaseCollection<>();
		BaseFinInvoice bean = new BaseFinInvoice();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		FinInvoice dao = new FinInvoice();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseFinInvoice> result = dao.conditionalLoad(addtion);
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
		BaseFinInvoice bean = new BaseFinInvoice();
		bean.setDataFromJSON(json);
		FinInvoice dao = new FinInvoice();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseFinInvoice bean = new BaseFinInvoice();
		bean.setDataFromJSON(json);
		FinInvoice dao = new FinInvoice();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseFinInvoice bean = new BaseFinInvoice();
		bean.setDataFromJSON(json);
		FinInvoice dao = new FinInvoice();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseFinInvoice bean = new BaseFinInvoice();
		bean.setDataFromJSON(json);
		FinInvoice dao = new FinInvoice();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


