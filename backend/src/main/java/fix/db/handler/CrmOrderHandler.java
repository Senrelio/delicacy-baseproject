package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmOrder;
import java.util.List;
import fix.db.dao.CrmOrder;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmOrderHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmOrderHandler.class);

	public static BaseCrmOrder getCrmOrderById( 
		java.lang.Integer order_id
	) throws Exception
	{
		CrmOrder dao = new CrmOrder();
		dao.setOrderId(order_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmOrderExists( fix.db.bean.BaseCrmOrder bean, String additional ) throws Exception {

		CrmOrder dao = new CrmOrder();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmOrder( fix.db.bean.BaseCrmOrder bean, String additional ) throws Exception {

		CrmOrder dao = new CrmOrder();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmOrder> queryCrmOrder( fix.db.bean.BaseCrmOrder bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmOrder dao = new CrmOrder();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmOrder> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmOrder> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmOrder addToCrmOrder ( BaseCrmOrder crmorder )  throws Exception {
		return addToCrmOrder ( crmorder , false);
	}

	public static BaseCrmOrder addToCrmOrder ( BaseCrmOrder crmorder, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmOrder dao = new CrmOrder();
		dao.setDataFromBase(crmorder);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmOrder addUpdateCrmOrder ( BaseCrmOrder crmorder ) throws Exception {
		return addUpdateCrmOrder ( crmorder , false);
	}

	public static BaseCrmOrder addUpdateCrmOrder ( BaseCrmOrder crmorder, boolean singleTransaction  ) throws Exception {
		if(crmorder.getOrderId() == null) return addToCrmOrder(crmorder);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmOrder dao = new CrmOrder();
		dao.setDataFromBase(crmorder);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmorder); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmOrder ( BaseCrmOrder bean ) throws Exception {
		CrmOrder dao = new CrmOrder();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmOrder updateCrmOrder ( BaseCrmOrder crmorder ) throws Exception {
		CrmOrder dao = new CrmOrder();
		dao.setOrderId( crmorder.getOrderId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmorder);
			result = dao.update();
		}
		return result == 1 ? crmorder : null ;
	}

	public static BaseCrmOrder updateCrmOrderDirect( BaseCrmOrder crmorder ) throws Exception {
		CrmOrder dao = new CrmOrder();
		int result = 0;
		dao.setDataFromBase(crmorder);
		result = dao.update();
		return result == 1 ? crmorder : null ;
	}

	public static int setDeleteConditions(BaseCrmOrder bean, CrmOrder dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getOrderId() != null) {
			dao.setConditionOrderId("=", bean.getOrderId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getOrderCode() != null) {
				dao.setConditionOrderCode("=", bean.getOrderCode());
				count++;
			}
			if(bean.getOrderReturnCode() != null) {
				dao.setConditionOrderReturnCode("=", bean.getOrderReturnCode());
				count++;
			}
			if(bean.getOrderType() != null) {
				dao.setConditionOrderType("=", bean.getOrderType());
				count++;
			}
			if(bean.getEmployeeIdMaintainer() != null) {
				dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
				count++;
			}
			if(bean.getCustomerName() != null) {
				dao.setConditionCustomerName("=", bean.getCustomerName());
				count++;
			}
			if(bean.getContractId() != null) {
				dao.setConditionContractId("=", bean.getContractId());
				count++;
			}
			if(bean.getOpportunityId() != null) {
				dao.setConditionOpportunityId("=", bean.getOpportunityId());
				count++;
			}
			if(bean.getStatusOrder() != null) {
				dao.setConditionStatusOrder("=", bean.getStatusOrder());
				count++;
			}
			if(bean.getPriceListId() != null) {
				dao.setConditionPriceListId("=", bean.getPriceListId());
				count++;
			}
			if(bean.getContactId() != null) {
				dao.setConditionContactId("=", bean.getContactId());
				count++;
			}
			if(bean.getStatusOrderReturn() != null) {
				dao.setConditionStatusOrderReturn("=", bean.getStatusOrderReturn());
				count++;
			}
			if(bean.getContactMobile() != null) {
				dao.setConditionContactMobile("=", bean.getContactMobile());
				count++;
			}
			if(bean.getAddressDelivery() != null) {
				dao.setConditionAddressDelivery("=", bean.getAddressDelivery());
				count++;
			}
			if(bean.getQuotationId() != null) {
				dao.setConditionQuotationId("=", bean.getQuotationId());
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
			if(bean.getDepartmentId() != null) {
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
				count++;
			}
			if(bean.getFlagLocked() != null) {
				dao.setConditionFlagLocked("=", bean.getFlagLocked());
				count++;
			}
			if(bean.getOrderVersion() != null) {
				dao.setConditionOrderVersion("=", bean.getOrderVersion());
				count++;
			}
			if(bean.getMemo() != null) {
				dao.setConditionMemo("=", bean.getMemo());
				count++;
			}
			if(bean.getCustomitem175_c() != null) {
				dao.setConditionCustomitem175_c("=", bean.getCustomitem175_c());
				count++;
			}
			if(bean.getCustomitem176_c() != null) {
				dao.setConditionCustomitem176_c("=", bean.getCustomitem176_c());
				count++;
			}
			if(bean.getCustomitem177_c() != null) {
				dao.setConditionCustomitem177_c("=", bean.getCustomitem177_c());
				count++;
			}
			if(bean.getCustomitem178_c() != null) {
				dao.setConditionCustomitem178_c("=", bean.getCustomitem178_c());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmOrder bean, CrmOrder dao){
		int count = 0;
		if(bean.getOrderId() != null) {
			dao.setConditionOrderId("=", bean.getOrderId());
			count++;
		}
		if(bean.getOrderCode() != null) {
			if(bean.getOrderCode().indexOf("%") >= 0)
				dao.setConditionOrderCode("like", bean.getOrderCode());
			else
				dao.setConditionOrderCode("=", bean.getOrderCode());
			count++;
		}
		if(bean.getOrderReturnCode() != null) {
			if(bean.getOrderReturnCode().indexOf("%") >= 0)
				dao.setConditionOrderReturnCode("like", bean.getOrderReturnCode());
			else
				dao.setConditionOrderReturnCode("=", bean.getOrderReturnCode());
			count++;
		}
		if(bean.getOrderType() != null) {
			dao.setConditionOrderType("=", bean.getOrderType());
			count++;
		}
		if(bean.getEmployeeIdMaintainer() != null) {
			dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
			count++;
		}
		if(bean.getCustomerName() != null) {
			dao.setConditionCustomerName("=", bean.getCustomerName());
			count++;
		}
		if(bean.getContractId() != null) {
			dao.setConditionContractId("=", bean.getContractId());
			count++;
		}
		if(bean.getOpportunityId() != null) {
			dao.setConditionOpportunityId("=", bean.getOpportunityId());
			count++;
		}
		if(bean.getStatusOrder() != null) {
			dao.setConditionStatusOrder("=", bean.getStatusOrder());
			count++;
		}
		if(bean.getPriceListId() != null) {
			dao.setConditionPriceListId("=", bean.getPriceListId());
			count++;
		}
		if(bean.getContactId() != null) {
			dao.setConditionContactId("=", bean.getContactId());
			count++;
		}
		if(bean.getStatusOrderReturn() != null) {
			dao.setConditionStatusOrderReturn("=", bean.getStatusOrderReturn());
			count++;
		}
		if(bean.getSumActual() != null) {
			dao.setConditionSumActual("=", bean.getSumActual());
			count++;
		}
		if(bean.getSumInitial() != null) {
			dao.setConditionSumInitial("=", bean.getSumInitial());
			count++;
		}
		if(bean.getDateValidation() != null) {
			dao.setConditionDateValidation(">=", bean.getDateValidation());
			count++;
		}
		if(bean.getContactMobile() != null) {
			if(bean.getContactMobile().indexOf("%") >= 0)
				dao.setConditionContactMobile("like", bean.getContactMobile());
			else
				dao.setConditionContactMobile("=", bean.getContactMobile());
			count++;
		}
		if(bean.getAddressDelivery() != null) {
			if(bean.getAddressDelivery().indexOf("%") >= 0)
				dao.setConditionAddressDelivery("like", bean.getAddressDelivery());
			else
				dao.setConditionAddressDelivery("=", bean.getAddressDelivery());
			count++;
		}
		if(bean.getQuotationId() != null) {
			dao.setConditionQuotationId("=", bean.getQuotationId());
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
		if(bean.getDepartmentId() != null) {
			dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getFlagLocked() != null) {
			dao.setConditionFlagLocked("=", bean.getFlagLocked());
			count++;
		}
		if(bean.getDateOrderPlaced() != null) {
			dao.setConditionDateOrderPlaced(">=", bean.getDateOrderPlaced());
			count++;
		}
		if(bean.getSumTotalListed() != null) {
			dao.setConditionSumTotalListed("=", bean.getSumTotalListed());
			count++;
		}
		if(bean.getAmountTotalDiscount() != null) {
			dao.setConditionAmountTotalDiscount("=", bean.getAmountTotalDiscount());
			count++;
		}
		if(bean.getOrderVersion() != null) {
			dao.setConditionOrderVersion("=", bean.getOrderVersion());
			count++;
		}
		if(bean.getDeliverydate() != null) {
			dao.setConditionDeliverydate(">=", bean.getDeliverydate());
			count++;
		}
		if(bean.getMemo() != null) {
			if(bean.getMemo().indexOf("%") >= 0)
				dao.setConditionMemo("like", bean.getMemo());
			else
				dao.setConditionMemo("=", bean.getMemo());
			count++;
		}
		if(bean.getCustomitem175_c() != null) {
			dao.setConditionCustomitem175_c("=", bean.getCustomitem175_c());
			count++;
		}
		if(bean.getCustomitem176_c() != null) {
			dao.setConditionCustomitem176_c("=", bean.getCustomitem176_c());
			count++;
		}
		if(bean.getCustomitem177_c() != null) {
			dao.setConditionCustomitem177_c("=", bean.getCustomitem177_c());
			count++;
		}
		if(bean.getCustomitem178_c() != null) {
			dao.setConditionCustomitem178_c("=", bean.getCustomitem178_c());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseCrmOrder bean = new BaseCrmOrder();
		bean.setDataFromJSON(json);
		CrmOrder dao = new CrmOrder();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmOrder> rlist = new BaseCollection<>();
		BaseCrmOrder bean = new BaseCrmOrder();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmOrder dao = new CrmOrder();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmOrder> result = dao.conditionalLoad(addtion);
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
		BaseCrmOrder bean = new BaseCrmOrder();
		bean.setDataFromJSON(json);
		CrmOrder dao = new CrmOrder();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmOrder bean = new BaseCrmOrder();
		bean.setDataFromJSON(json);
		CrmOrder dao = new CrmOrder();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmOrder bean = new BaseCrmOrder();
		bean.setDataFromJSON(json);
		CrmOrder dao = new CrmOrder();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmOrder bean = new BaseCrmOrder();
		bean.setDataFromJSON(json);
		CrmOrder dao = new CrmOrder();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


