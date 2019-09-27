package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmContractsOrder;
import java.util.List;
import fix.db.dao.CrmContractsOrder;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmContractsOrderHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmContractsOrderHandler.class);

	public static BaseCrmContractsOrder getCrmContractsOrderById( 
		java.lang.Integer contract_orders_id
	) throws Exception
	{
		CrmContractsOrder dao = new CrmContractsOrder();
		dao.setContractOrdersId(contract_orders_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmContractsOrderExists( fix.db.bean.BaseCrmContractsOrder bean, String additional ) throws Exception {

		CrmContractsOrder dao = new CrmContractsOrder();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmContractsOrder( fix.db.bean.BaseCrmContractsOrder bean, String additional ) throws Exception {

		CrmContractsOrder dao = new CrmContractsOrder();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmContractsOrder> queryCrmContractsOrder( fix.db.bean.BaseCrmContractsOrder bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmContractsOrder dao = new CrmContractsOrder();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmContractsOrder> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmContractsOrder> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmContractsOrder addToCrmContractsOrder ( BaseCrmContractsOrder crmcontractsorder )  throws Exception {
		return addToCrmContractsOrder ( crmcontractsorder , false);
	}

	public static BaseCrmContractsOrder addToCrmContractsOrder ( BaseCrmContractsOrder crmcontractsorder, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmContractsOrder dao = new CrmContractsOrder();
		dao.setDataFromBase(crmcontractsorder);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmContractsOrder addUpdateCrmContractsOrder ( BaseCrmContractsOrder crmcontractsorder ) throws Exception {
		return addUpdateCrmContractsOrder ( crmcontractsorder , false);
	}

	public static BaseCrmContractsOrder addUpdateCrmContractsOrder ( BaseCrmContractsOrder crmcontractsorder, boolean singleTransaction  ) throws Exception {
		if(crmcontractsorder.getContractOrdersId() == null) return addToCrmContractsOrder(crmcontractsorder);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmContractsOrder dao = new CrmContractsOrder();
		dao.setDataFromBase(crmcontractsorder);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmcontractsorder); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmContractsOrder ( BaseCrmContractsOrder bean ) throws Exception {
		CrmContractsOrder dao = new CrmContractsOrder();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmContractsOrder updateCrmContractsOrder ( BaseCrmContractsOrder crmcontractsorder ) throws Exception {
		CrmContractsOrder dao = new CrmContractsOrder();
		dao.setContractOrdersId( crmcontractsorder.getContractOrdersId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmcontractsorder);
			result = dao.update();
		}
		return result == 1 ? crmcontractsorder : null ;
	}

	public static BaseCrmContractsOrder updateCrmContractsOrderDirect( BaseCrmContractsOrder crmcontractsorder ) throws Exception {
		CrmContractsOrder dao = new CrmContractsOrder();
		int result = 0;
		dao.setDataFromBase(crmcontractsorder);
		result = dao.update();
		return result == 1 ? crmcontractsorder : null ;
	}

	public static int setDeleteConditions(BaseCrmContractsOrder bean, CrmContractsOrder dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getContractOrdersId() != null) {
			dao.setConditionContractOrdersId("=", bean.getContractOrdersId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getContractId() != null) {
				dao.setConditionContractId("=", bean.getContractId());
				count++;
			}
			if(bean.getOrderId() != null) {
				dao.setConditionOrderId("=", bean.getOrderId());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmContractsOrder bean, CrmContractsOrder dao){
		int count = 0;
		if(bean.getContractOrdersId() != null) {
			dao.setConditionContractOrdersId("=", bean.getContractOrdersId());
			count++;
		}
		if(bean.getContractId() != null) {
			dao.setConditionContractId("=", bean.getContractId());
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
		BaseCrmContractsOrder bean = new BaseCrmContractsOrder();
		bean.setDataFromJSON(json);
		CrmContractsOrder dao = new CrmContractsOrder();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmContractsOrder> rlist = new BaseCollection<>();
		BaseCrmContractsOrder bean = new BaseCrmContractsOrder();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmContractsOrder dao = new CrmContractsOrder();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmContractsOrder> result = dao.conditionalLoad(addtion);
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
		BaseCrmContractsOrder bean = new BaseCrmContractsOrder();
		bean.setDataFromJSON(json);
		CrmContractsOrder dao = new CrmContractsOrder();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmContractsOrder bean = new BaseCrmContractsOrder();
		bean.setDataFromJSON(json);
		CrmContractsOrder dao = new CrmContractsOrder();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmContractsOrder bean = new BaseCrmContractsOrder();
		bean.setDataFromJSON(json);
		CrmContractsOrder dao = new CrmContractsOrder();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmContractsOrder bean = new BaseCrmContractsOrder();
		bean.setDataFromJSON(json);
		CrmContractsOrder dao = new CrmContractsOrder();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


