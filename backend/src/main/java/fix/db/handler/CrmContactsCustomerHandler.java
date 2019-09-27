package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmContactsCustomer;
import java.util.List;
import fix.db.dao.CrmContactsCustomer;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmContactsCustomerHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmContactsCustomerHandler.class);

	public static BaseCrmContactsCustomer getCrmContactsCustomerById( 
		java.lang.Integer contacts_customers_id
	) throws Exception
	{
		CrmContactsCustomer dao = new CrmContactsCustomer();
		dao.setContactsCustomersId(contacts_customers_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmContactsCustomerExists( fix.db.bean.BaseCrmContactsCustomer bean, String additional ) throws Exception {

		CrmContactsCustomer dao = new CrmContactsCustomer();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmContactsCustomer( fix.db.bean.BaseCrmContactsCustomer bean, String additional ) throws Exception {

		CrmContactsCustomer dao = new CrmContactsCustomer();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmContactsCustomer> queryCrmContactsCustomer( fix.db.bean.BaseCrmContactsCustomer bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmContactsCustomer dao = new CrmContactsCustomer();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmContactsCustomer> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmContactsCustomer> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmContactsCustomer addToCrmContactsCustomer ( BaseCrmContactsCustomer crmcontactscustomer )  throws Exception {
		return addToCrmContactsCustomer ( crmcontactscustomer , false);
	}

	public static BaseCrmContactsCustomer addToCrmContactsCustomer ( BaseCrmContactsCustomer crmcontactscustomer, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmContactsCustomer dao = new CrmContactsCustomer();
		dao.setDataFromBase(crmcontactscustomer);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmContactsCustomer addUpdateCrmContactsCustomer ( BaseCrmContactsCustomer crmcontactscustomer ) throws Exception {
		return addUpdateCrmContactsCustomer ( crmcontactscustomer , false);
	}

	public static BaseCrmContactsCustomer addUpdateCrmContactsCustomer ( BaseCrmContactsCustomer crmcontactscustomer, boolean singleTransaction  ) throws Exception {
		if(crmcontactscustomer.getContactsCustomersId() == null) return addToCrmContactsCustomer(crmcontactscustomer);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmContactsCustomer dao = new CrmContactsCustomer();
		dao.setDataFromBase(crmcontactscustomer);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmcontactscustomer); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmContactsCustomer ( BaseCrmContactsCustomer bean ) throws Exception {
		CrmContactsCustomer dao = new CrmContactsCustomer();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmContactsCustomer updateCrmContactsCustomer ( BaseCrmContactsCustomer crmcontactscustomer ) throws Exception {
		CrmContactsCustomer dao = new CrmContactsCustomer();
		dao.setContactsCustomersId( crmcontactscustomer.getContactsCustomersId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmcontactscustomer);
			result = dao.update();
		}
		return result == 1 ? crmcontactscustomer : null ;
	}

	public static BaseCrmContactsCustomer updateCrmContactsCustomerDirect( BaseCrmContactsCustomer crmcontactscustomer ) throws Exception {
		CrmContactsCustomer dao = new CrmContactsCustomer();
		int result = 0;
		dao.setDataFromBase(crmcontactscustomer);
		result = dao.update();
		return result == 1 ? crmcontactscustomer : null ;
	}

	public static int setDeleteConditions(BaseCrmContactsCustomer bean, CrmContactsCustomer dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getContactsCustomersId() != null) {
			dao.setConditionContactsCustomersId("=", bean.getContactsCustomersId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getContactsId() != null) {
				dao.setConditionContactsId("=", bean.getContactsId());
				count++;
			}
			if(bean.getCustomersId() != null) {
				dao.setConditionCustomersId("=", bean.getCustomersId());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmContactsCustomer bean, CrmContactsCustomer dao){
		int count = 0;
		if(bean.getContactsCustomersId() != null) {
			dao.setConditionContactsCustomersId("=", bean.getContactsCustomersId());
			count++;
		}
		if(bean.getContactsId() != null) {
			dao.setConditionContactsId("=", bean.getContactsId());
			count++;
		}
		if(bean.getCustomersId() != null) {
			dao.setConditionCustomersId("=", bean.getCustomersId());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseCrmContactsCustomer bean = new BaseCrmContactsCustomer();
		bean.setDataFromJSON(json);
		CrmContactsCustomer dao = new CrmContactsCustomer();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmContactsCustomer> rlist = new BaseCollection<>();
		BaseCrmContactsCustomer bean = new BaseCrmContactsCustomer();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmContactsCustomer dao = new CrmContactsCustomer();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmContactsCustomer> result = dao.conditionalLoad(addtion);
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
		BaseCrmContactsCustomer bean = new BaseCrmContactsCustomer();
		bean.setDataFromJSON(json);
		CrmContactsCustomer dao = new CrmContactsCustomer();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmContactsCustomer bean = new BaseCrmContactsCustomer();
		bean.setDataFromJSON(json);
		CrmContactsCustomer dao = new CrmContactsCustomer();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmContactsCustomer bean = new BaseCrmContactsCustomer();
		bean.setDataFromJSON(json);
		CrmContactsCustomer dao = new CrmContactsCustomer();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmContactsCustomer bean = new BaseCrmContactsCustomer();
		bean.setDataFromJSON(json);
		CrmContactsCustomer dao = new CrmContactsCustomer();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


