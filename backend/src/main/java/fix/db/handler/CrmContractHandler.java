package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmContract;
import java.util.List;
import fix.db.dao.CrmContract;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmContractHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmContractHandler.class);

	public static BaseCrmContract getCrmContractById( 
		java.lang.Integer contract_id
	) throws Exception
	{
		CrmContract dao = new CrmContract();
		dao.setContractId(contract_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmContractExists( fix.db.bean.BaseCrmContract bean, String additional ) throws Exception {

		CrmContract dao = new CrmContract();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmContract( fix.db.bean.BaseCrmContract bean, String additional ) throws Exception {

		CrmContract dao = new CrmContract();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmContract> queryCrmContract( fix.db.bean.BaseCrmContract bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmContract dao = new CrmContract();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmContract> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmContract> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmContract addToCrmContract ( BaseCrmContract crmcontract )  throws Exception {
		return addToCrmContract ( crmcontract , false);
	}

	public static BaseCrmContract addToCrmContract ( BaseCrmContract crmcontract, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmContract dao = new CrmContract();
		dao.setDataFromBase(crmcontract);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmContract addUpdateCrmContract ( BaseCrmContract crmcontract ) throws Exception {
		return addUpdateCrmContract ( crmcontract , false);
	}

	public static BaseCrmContract addUpdateCrmContract ( BaseCrmContract crmcontract, boolean singleTransaction  ) throws Exception {
		if(crmcontract.getContractId() == null) return addToCrmContract(crmcontract);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmContract dao = new CrmContract();
		dao.setDataFromBase(crmcontract);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmcontract); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmContract ( BaseCrmContract bean ) throws Exception {
		CrmContract dao = new CrmContract();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmContract updateCrmContract ( BaseCrmContract crmcontract ) throws Exception {
		CrmContract dao = new CrmContract();
		dao.setContractId( crmcontract.getContractId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmcontract);
			result = dao.update();
		}
		return result == 1 ? crmcontract : null ;
	}

	public static BaseCrmContract updateCrmContractDirect( BaseCrmContract crmcontract ) throws Exception {
		CrmContract dao = new CrmContract();
		int result = 0;
		dao.setDataFromBase(crmcontract);
		result = dao.update();
		return result == 1 ? crmcontract : null ;
	}

	public static int setDeleteConditions(BaseCrmContract bean, CrmContract dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getContractId() != null) {
			dao.setConditionContractId("=", bean.getContractId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getContractCode() != null) {
				dao.setConditionContractCode("=", bean.getContractCode());
				count++;
			}
			if(bean.getContractTitle() != null) {
				dao.setConditionContractTitle("=", bean.getContractTitle());
				count++;
			}
			if(bean.getCustomerId() != null) {
				dao.setConditionCustomerId("=", bean.getCustomerId());
				count++;
			}
			if(bean.getOpportunityId() != null) {
				dao.setConditionOpportunityId("=", bean.getOpportunityId());
				count++;
			}
			if(bean.getMarketingEventId() != null) {
				dao.setConditionMarketingEventId("=", bean.getMarketingEventId());
				count++;
			}
			if(bean.getStatusContract() != null) {
				dao.setConditionStatusContract("=", bean.getStatusContract());
				count++;
			}
			if(bean.getEmployeeIdMaintainer() != null) {
				dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
				count++;
			}
			if(bean.getCreatedby() != null) {
				dao.setConditionCreatedby("=", bean.getCreatedby());
				count++;
			}
			if(bean.getEmployeeIdUpdated() != null) {
				dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
				count++;
			}
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
				count++;
			}
			if(bean.getFlagLocked() != null) {
				dao.setConditionFlagLocked("=", bean.getFlagLocked());
				count++;
			}
			if(bean.getContractType() != null) {
				dao.setConditionContractType("=", bean.getContractType());
				count++;
			}
			if(bean.getPaymentMethodAccepted() != null) {
				dao.setConditionPaymentMethodAccepted("=", bean.getPaymentMethodAccepted());
				count++;
			}
			if(bean.getContractContent() != null) {
				dao.setConditionContractContent("=", bean.getContractContent());
				count++;
			}
			if(bean.getCustomerSignerName() != null) {
				dao.setConditionCustomerSignerName("=", bean.getCustomerSignerName());
				count++;
			}
			if(bean.getEmployeeIdSigner() != null) {
				dao.setConditionEmployeeIdSigner("=", bean.getEmployeeIdSigner());
				count++;
			}
			if(bean.getMemo() != null) {
				dao.setConditionMemo("=", bean.getMemo());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmContract bean, CrmContract dao){
		int count = 0;
		if(bean.getContractId() != null) {
			dao.setConditionContractId("=", bean.getContractId());
			count++;
		}
		if(bean.getContractCode() != null) {
			if(bean.getContractCode().indexOf("%") >= 0)
				dao.setConditionContractCode("like", bean.getContractCode());
			else
				dao.setConditionContractCode("=", bean.getContractCode());
			count++;
		}
		if(bean.getContractTitle() != null) {
			if(bean.getContractTitle().indexOf("%") >= 0)
				dao.setConditionContractTitle("like", bean.getContractTitle());
			else
				dao.setConditionContractTitle("=", bean.getContractTitle());
			count++;
		}
		if(bean.getCustomerId() != null) {
			dao.setConditionCustomerId("=", bean.getCustomerId());
			count++;
		}
		if(bean.getOpportunityId() != null) {
			dao.setConditionOpportunityId("=", bean.getOpportunityId());
			count++;
		}
		if(bean.getMarketingEventId() != null) {
			dao.setConditionMarketingEventId("=", bean.getMarketingEventId());
			count++;
		}
		if(bean.getSum() != null) {
			dao.setConditionSum("=", bean.getSum());
			count++;
		}
		if(bean.getStatusContract() != null) {
			dao.setConditionStatusContract("=", bean.getStatusContract());
			count++;
		}
		if(bean.getDateStart() != null) {
			dao.setConditionDateStart(">=", bean.getDateStart());
			count++;
		}
		if(bean.getDateEnd() != null) {
			dao.setConditionDateEnd(">=", bean.getDateEnd());
			count++;
		}
		if(bean.getEmployeeIdMaintainer() != null) {
			dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
			count++;
		}
		if(bean.getDateSigned() != null) {
			dao.setConditionDateSigned(">=", bean.getDateSigned());
			count++;
		}
		if(bean.getDateCreated() != null) {
			dao.setConditionDateCreated(">=", bean.getDateCreated());
			count++;
		}
		if(bean.getCreatedby() != null) {
			dao.setConditionCreatedby("=", bean.getCreatedby());
			count++;
		}
		if(bean.getDateUpdated() != null) {
			dao.setConditionDateUpdated(">=", bean.getDateUpdated());
			count++;
		}
		if(bean.getEmployeeIdUpdated() != null) {
			dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getFlagLocked() != null) {
			dao.setConditionFlagLocked("=", bean.getFlagLocked());
			count++;
		}
		if(bean.getContractType() != null) {
			dao.setConditionContractType("=", bean.getContractType());
			count++;
		}
		if(bean.getPaymentMethodAccepted() != null) {
			dao.setConditionPaymentMethodAccepted("=", bean.getPaymentMethodAccepted());
			count++;
		}
		if(bean.getContractContent() != null) {
			if(bean.getContractContent().indexOf("%") >= 0)
				dao.setConditionContractContent("like", bean.getContractContent());
			else
				dao.setConditionContractContent("=", bean.getContractContent());
			count++;
		}
		if(bean.getCustomerSignerName() != null) {
			if(bean.getCustomerSignerName().indexOf("%") >= 0)
				dao.setConditionCustomerSignerName("like", bean.getCustomerSignerName());
			else
				dao.setConditionCustomerSignerName("=", bean.getCustomerSignerName());
			count++;
		}
		if(bean.getEmployeeIdSigner() != null) {
			dao.setConditionEmployeeIdSigner("=", bean.getEmployeeIdSigner());
			count++;
		}
		if(bean.getMemo() != null) {
			if(bean.getMemo().indexOf("%") >= 0)
				dao.setConditionMemo("like", bean.getMemo());
			else
				dao.setConditionMemo("=", bean.getMemo());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseCrmContract bean = new BaseCrmContract();
		bean.setDataFromJSON(json);
		CrmContract dao = new CrmContract();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmContract> rlist = new BaseCollection<>();
		BaseCrmContract bean = new BaseCrmContract();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmContract dao = new CrmContract();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmContract> result = dao.conditionalLoad(addtion);
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
		BaseCrmContract bean = new BaseCrmContract();
		bean.setDataFromJSON(json);
		CrmContract dao = new CrmContract();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmContract bean = new BaseCrmContract();
		bean.setDataFromJSON(json);
		CrmContract dao = new CrmContract();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmContract bean = new BaseCrmContract();
		bean.setDataFromJSON(json);
		CrmContract dao = new CrmContract();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmContract bean = new BaseCrmContract();
		bean.setDataFromJSON(json);
		CrmContract dao = new CrmContract();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


