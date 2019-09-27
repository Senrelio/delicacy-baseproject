package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmQuotation;
import java.util.List;
import fix.db.dao.CrmQuotation;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmQuotationHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmQuotationHandler.class);

	public static BaseCrmQuotation getCrmQuotationById( 
		java.lang.Integer quotation_id
	) throws Exception
	{
		CrmQuotation dao = new CrmQuotation();
		dao.setQuotationId(quotation_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmQuotationExists( fix.db.bean.BaseCrmQuotation bean, String additional ) throws Exception {

		CrmQuotation dao = new CrmQuotation();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmQuotation( fix.db.bean.BaseCrmQuotation bean, String additional ) throws Exception {

		CrmQuotation dao = new CrmQuotation();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmQuotation> queryCrmQuotation( fix.db.bean.BaseCrmQuotation bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmQuotation dao = new CrmQuotation();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmQuotation> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmQuotation> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmQuotation addToCrmQuotation ( BaseCrmQuotation crmquotation )  throws Exception {
		return addToCrmQuotation ( crmquotation , false);
	}

	public static BaseCrmQuotation addToCrmQuotation ( BaseCrmQuotation crmquotation, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmQuotation dao = new CrmQuotation();
		dao.setDataFromBase(crmquotation);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmQuotation addUpdateCrmQuotation ( BaseCrmQuotation crmquotation ) throws Exception {
		return addUpdateCrmQuotation ( crmquotation , false);
	}

	public static BaseCrmQuotation addUpdateCrmQuotation ( BaseCrmQuotation crmquotation, boolean singleTransaction  ) throws Exception {
		if(crmquotation.getQuotationId() == null) return addToCrmQuotation(crmquotation);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmQuotation dao = new CrmQuotation();
		dao.setDataFromBase(crmquotation);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmquotation); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmQuotation ( BaseCrmQuotation bean ) throws Exception {
		CrmQuotation dao = new CrmQuotation();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmQuotation updateCrmQuotation ( BaseCrmQuotation crmquotation ) throws Exception {
		CrmQuotation dao = new CrmQuotation();
		dao.setQuotationId( crmquotation.getQuotationId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmquotation);
			result = dao.update();
		}
		return result == 1 ? crmquotation : null ;
	}

	public static BaseCrmQuotation updateCrmQuotationDirect( BaseCrmQuotation crmquotation ) throws Exception {
		CrmQuotation dao = new CrmQuotation();
		int result = 0;
		dao.setDataFromBase(crmquotation);
		result = dao.update();
		return result == 1 ? crmquotation : null ;
	}

	public static int setDeleteConditions(BaseCrmQuotation bean, CrmQuotation dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getQuotationId() != null) {
			dao.setConditionQuotationId("=", bean.getQuotationId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getQuotationCode() != null) {
				dao.setConditionQuotationCode("=", bean.getQuotationCode());
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
			if(bean.getEmployeeIdCreated() != null) {
				dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
				count++;
			}
			if(bean.getEmployeeIdUpdated() != null) {
				dao.setConditionEmployeeIdUpdated("=", bean.getEmployeeIdUpdated());
				count++;
			}
			if(bean.getFlagLocked() != null) {
				dao.setConditionFlagLocked("=", bean.getFlagLocked());
				count++;
			}
			if(bean.getCustomerName() != null) {
				dao.setConditionCustomerName("=", bean.getCustomerName());
				count++;
			}
			if(bean.getOpportunityName() != null) {
				dao.setConditionOpportunityName("=", bean.getOpportunityName());
				count++;
			}
			if(bean.getQuotationTitle() != null) {
				dao.setConditionQuotationTitle("=", bean.getQuotationTitle());
				count++;
			}
			if(bean.getStageQuotation() != null) {
				dao.setConditionStageQuotation("=", bean.getStageQuotation());
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
			if(bean.getContactEmail() != null) {
				dao.setConditionContactEmail("=", bean.getContactEmail());
				count++;
			}
			if(bean.getMemo() != null) {
				dao.setConditionMemo("=", bean.getMemo());
				count++;
			}
			if(bean.getPriceListId() != null) {
				dao.setConditionPriceListId("=", bean.getPriceListId());
				count++;
			}
			if(bean.getQuotationMain() != null) {
				dao.setConditionQuotationMain("=", bean.getQuotationMain());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmQuotation bean, CrmQuotation dao){
		int count = 0;
		if(bean.getQuotationId() != null) {
			dao.setConditionQuotationId("=", bean.getQuotationId());
			count++;
		}
		if(bean.getQuotationCode() != null) {
			dao.setConditionQuotationCode("=", bean.getQuotationCode());
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
		if(bean.getFlagLocked() != null) {
			dao.setConditionFlagLocked("=", bean.getFlagLocked());
			count++;
		}
		if(bean.getCustomerName() != null) {
			dao.setConditionCustomerName("=", bean.getCustomerName());
			count++;
		}
		if(bean.getOpportunityName() != null) {
			dao.setConditionOpportunityName("=", bean.getOpportunityName());
			count++;
		}
		if(bean.getQuotationTitle() != null) {
			if(bean.getQuotationTitle().indexOf("%") >= 0)
				dao.setConditionQuotationTitle("like", bean.getQuotationTitle());
			else
				dao.setConditionQuotationTitle("=", bean.getQuotationTitle());
			count++;
		}
		if(bean.getDateValidation() != null) {
			dao.setConditionDateValidation(">=", bean.getDateValidation());
			count++;
		}
		if(bean.getStageQuotation() != null) {
			dao.setConditionStageQuotation("=", bean.getStageQuotation());
			count++;
		}
		if(bean.getDateCalled() != null) {
			dao.setConditionDateCalled(">=", bean.getDateCalled());
			count++;
		}
		if(bean.getDateLatestSync() != null) {
			dao.setConditionDateLatestSync(">=", bean.getDateLatestSync());
			count++;
		}
		if(bean.getSumQuotation() != null) {
			dao.setConditionSumQuotation("=", bean.getSumQuotation());
			count++;
		}
		if(bean.getContactName() != null) {
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
		if(bean.getContactEmail() != null) {
			if(bean.getContactEmail().indexOf("%") >= 0)
				dao.setConditionContactEmail("like", bean.getContactEmail());
			else
				dao.setConditionContactEmail("=", bean.getContactEmail());
			count++;
		}
		if(bean.getMemo() != null) {
			if(bean.getMemo().indexOf("%") >= 0)
				dao.setConditionMemo("like", bean.getMemo());
			else
				dao.setConditionMemo("=", bean.getMemo());
			count++;
		}
		if(bean.getPriceListId() != null) {
			dao.setConditionPriceListId("=", bean.getPriceListId());
			count++;
		}
		if(bean.getSumListed() != null) {
			dao.setConditionSumListed("=", bean.getSumListed());
			count++;
		}
		if(bean.getSumDiscount() != null) {
			dao.setConditionSumDiscount("=", bean.getSumDiscount());
			count++;
		}
		if(bean.getQuotationMain() != null) {
			dao.setConditionQuotationMain("=", bean.getQuotationMain());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseCrmQuotation bean = new BaseCrmQuotation();
		bean.setDataFromJSON(json);
		CrmQuotation dao = new CrmQuotation();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmQuotation> rlist = new BaseCollection<>();
		BaseCrmQuotation bean = new BaseCrmQuotation();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmQuotation dao = new CrmQuotation();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmQuotation> result = dao.conditionalLoad(addtion);
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
		BaseCrmQuotation bean = new BaseCrmQuotation();
		bean.setDataFromJSON(json);
		CrmQuotation dao = new CrmQuotation();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmQuotation bean = new BaseCrmQuotation();
		bean.setDataFromJSON(json);
		CrmQuotation dao = new CrmQuotation();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmQuotation bean = new BaseCrmQuotation();
		bean.setDataFromJSON(json);
		CrmQuotation dao = new CrmQuotation();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmQuotation bean = new BaseCrmQuotation();
		bean.setDataFromJSON(json);
		CrmQuotation dao = new CrmQuotation();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


