package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmQuotationProduct;
import java.util.List;
import fix.db.dao.CrmQuotationProduct;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmQuotationProductHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmQuotationProductHandler.class);

	public static BaseCrmQuotationProduct getCrmQuotationProductById( 
		java.lang.Integer quotation_product_id
	) throws Exception
	{
		CrmQuotationProduct dao = new CrmQuotationProduct();
		dao.setQuotationProductId(quotation_product_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmQuotationProductExists( fix.db.bean.BaseCrmQuotationProduct bean, String additional ) throws Exception {

		CrmQuotationProduct dao = new CrmQuotationProduct();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmQuotationProduct( fix.db.bean.BaseCrmQuotationProduct bean, String additional ) throws Exception {

		CrmQuotationProduct dao = new CrmQuotationProduct();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmQuotationProduct> queryCrmQuotationProduct( fix.db.bean.BaseCrmQuotationProduct bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmQuotationProduct dao = new CrmQuotationProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmQuotationProduct> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmQuotationProduct> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmQuotationProduct addToCrmQuotationProduct ( BaseCrmQuotationProduct crmquotationproduct )  throws Exception {
		return addToCrmQuotationProduct ( crmquotationproduct , false);
	}

	public static BaseCrmQuotationProduct addToCrmQuotationProduct ( BaseCrmQuotationProduct crmquotationproduct, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmQuotationProduct dao = new CrmQuotationProduct();
		dao.setDataFromBase(crmquotationproduct);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmQuotationProduct addUpdateCrmQuotationProduct ( BaseCrmQuotationProduct crmquotationproduct ) throws Exception {
		return addUpdateCrmQuotationProduct ( crmquotationproduct , false);
	}

	public static BaseCrmQuotationProduct addUpdateCrmQuotationProduct ( BaseCrmQuotationProduct crmquotationproduct, boolean singleTransaction  ) throws Exception {
		if(crmquotationproduct.getQuotationProductId() == null) return addToCrmQuotationProduct(crmquotationproduct);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmQuotationProduct dao = new CrmQuotationProduct();
		dao.setDataFromBase(crmquotationproduct);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmquotationproduct); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmQuotationProduct ( BaseCrmQuotationProduct bean ) throws Exception {
		CrmQuotationProduct dao = new CrmQuotationProduct();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmQuotationProduct updateCrmQuotationProduct ( BaseCrmQuotationProduct crmquotationproduct ) throws Exception {
		CrmQuotationProduct dao = new CrmQuotationProduct();
		dao.setQuotationProductId( crmquotationproduct.getQuotationProductId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmquotationproduct);
			result = dao.update();
		}
		return result == 1 ? crmquotationproduct : null ;
	}

	public static BaseCrmQuotationProduct updateCrmQuotationProductDirect( BaseCrmQuotationProduct crmquotationproduct ) throws Exception {
		CrmQuotationProduct dao = new CrmQuotationProduct();
		int result = 0;
		dao.setDataFromBase(crmquotationproduct);
		result = dao.update();
		return result == 1 ? crmquotationproduct : null ;
	}

	public static int setDeleteConditions(BaseCrmQuotationProduct bean, CrmQuotationProduct dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getQuotationProductId() != null) {
			dao.setConditionQuotationProductId("=", bean.getQuotationProductId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getQuotationProductCode() != null) {
				dao.setConditionQuotationProductCode("=", bean.getQuotationProductCode());
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
			if(bean.getQuotationId() != null) {
				dao.setConditionQuotationId("=", bean.getQuotationId());
				count++;
			}
			if(bean.getProductName() != null) {
				dao.setConditionProductName("=", bean.getProductName());
				count++;
			}
			if(bean.getCustomerName() != null) {
				dao.setConditionCustomerName("=", bean.getCustomerName());
				count++;
			}
			if(bean.getUnit() != null) {
				dao.setConditionUnit("=", bean.getUnit());
				count++;
			}
			if(bean.getMemo() != null) {
				dao.setConditionMemo("=", bean.getMemo());
				count++;
			}
			if(bean.getParentId() != null) {
				dao.setConditionParentId("=", bean.getParentId());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmQuotationProduct bean, CrmQuotationProduct dao){
		int count = 0;
		if(bean.getQuotationProductId() != null) {
			dao.setConditionQuotationProductId("=", bean.getQuotationProductId());
			count++;
		}
		if(bean.getQuotationProductCode() != null) {
			if(bean.getQuotationProductCode().indexOf("%") >= 0)
				dao.setConditionQuotationProductCode("like", bean.getQuotationProductCode());
			else
				dao.setConditionQuotationProductCode("=", bean.getQuotationProductCode());
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
		if(bean.getQuotationId() != null) {
			dao.setConditionQuotationId("=", bean.getQuotationId());
			count++;
		}
		if(bean.getProductName() != null) {
			dao.setConditionProductName("=", bean.getProductName());
			count++;
		}
		if(bean.getPriceUnitListed() != null) {
			dao.setConditionPriceUnitListed("=", bean.getPriceUnitListed());
			count++;
		}
		if(bean.getCustomerName() != null) {
			dao.setConditionCustomerName("=", bean.getCustomerName());
			count++;
		}
		if(bean.getUnit() != null) {
			if(bean.getUnit().indexOf("%") >= 0)
				dao.setConditionUnit("like", bean.getUnit());
			else
				dao.setConditionUnit("=", bean.getUnit());
			count++;
		}
		if(bean.getPriceUnit() != null) {
			dao.setConditionPriceUnit("=", bean.getPriceUnit());
			count++;
		}
		if(bean.getQuantity() != null) {
			dao.setConditionQuantity("=", bean.getQuantity());
			count++;
		}
		if(bean.getDiscountRate() != null) {
			dao.setConditionDiscountRate("=", bean.getDiscountRate());
			count++;
		}
		if(bean.getAmount() != null) {
			dao.setConditionAmount("=", bean.getAmount());
			count++;
		}
		if(bean.getMemo() != null) {
			if(bean.getMemo().indexOf("%") >= 0)
				dao.setConditionMemo("like", bean.getMemo());
			else
				dao.setConditionMemo("=", bean.getMemo());
			count++;
		}
		if(bean.getParentId() != null) {
			dao.setConditionParentId("=", bean.getParentId());
			count++;
		}
		if(bean.getSumListed() != null) {
			dao.setConditionSumListed("=", bean.getSumListed());
			count++;
		}
		if(bean.getAmountTotalDiscount() != null) {
			dao.setConditionAmountTotalDiscount("=", bean.getAmountTotalDiscount());
			count++;
		}
		if(bean.getLevel() != null) {
			dao.setConditionLevel("=", bean.getLevel());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseCrmQuotationProduct bean = new BaseCrmQuotationProduct();
		bean.setDataFromJSON(json);
		CrmQuotationProduct dao = new CrmQuotationProduct();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmQuotationProduct> rlist = new BaseCollection<>();
		BaseCrmQuotationProduct bean = new BaseCrmQuotationProduct();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmQuotationProduct dao = new CrmQuotationProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmQuotationProduct> result = dao.conditionalLoad(addtion);
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
		BaseCrmQuotationProduct bean = new BaseCrmQuotationProduct();
		bean.setDataFromJSON(json);
		CrmQuotationProduct dao = new CrmQuotationProduct();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmQuotationProduct bean = new BaseCrmQuotationProduct();
		bean.setDataFromJSON(json);
		CrmQuotationProduct dao = new CrmQuotationProduct();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmQuotationProduct bean = new BaseCrmQuotationProduct();
		bean.setDataFromJSON(json);
		CrmQuotationProduct dao = new CrmQuotationProduct();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmQuotationProduct bean = new BaseCrmQuotationProduct();
		bean.setDataFromJSON(json);
		CrmQuotationProduct dao = new CrmQuotationProduct();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


