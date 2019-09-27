package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmDeliveryProduct;
import java.util.List;
import fix.db.dao.CrmDeliveryProduct;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmDeliveryProductHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmDeliveryProductHandler.class);

	public static BaseCrmDeliveryProduct getCrmDeliveryProductById( 
		java.lang.Integer delivery_product_id
	) throws Exception
	{
		CrmDeliveryProduct dao = new CrmDeliveryProduct();
		dao.setDeliveryProductId(delivery_product_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmDeliveryProductExists( fix.db.bean.BaseCrmDeliveryProduct bean, String additional ) throws Exception {

		CrmDeliveryProduct dao = new CrmDeliveryProduct();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmDeliveryProduct( fix.db.bean.BaseCrmDeliveryProduct bean, String additional ) throws Exception {

		CrmDeliveryProduct dao = new CrmDeliveryProduct();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmDeliveryProduct> queryCrmDeliveryProduct( fix.db.bean.BaseCrmDeliveryProduct bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmDeliveryProduct dao = new CrmDeliveryProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmDeliveryProduct> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmDeliveryProduct> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmDeliveryProduct addToCrmDeliveryProduct ( BaseCrmDeliveryProduct crmdeliveryproduct )  throws Exception {
		return addToCrmDeliveryProduct ( crmdeliveryproduct , false);
	}

	public static BaseCrmDeliveryProduct addToCrmDeliveryProduct ( BaseCrmDeliveryProduct crmdeliveryproduct, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmDeliveryProduct dao = new CrmDeliveryProduct();
		dao.setDataFromBase(crmdeliveryproduct);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmDeliveryProduct addUpdateCrmDeliveryProduct ( BaseCrmDeliveryProduct crmdeliveryproduct ) throws Exception {
		return addUpdateCrmDeliveryProduct ( crmdeliveryproduct , false);
	}

	public static BaseCrmDeliveryProduct addUpdateCrmDeliveryProduct ( BaseCrmDeliveryProduct crmdeliveryproduct, boolean singleTransaction  ) throws Exception {
		if(crmdeliveryproduct.getDeliveryProductId() == null) return addToCrmDeliveryProduct(crmdeliveryproduct);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmDeliveryProduct dao = new CrmDeliveryProduct();
		dao.setDataFromBase(crmdeliveryproduct);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmdeliveryproduct); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmDeliveryProduct ( BaseCrmDeliveryProduct bean ) throws Exception {
		CrmDeliveryProduct dao = new CrmDeliveryProduct();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmDeliveryProduct updateCrmDeliveryProduct ( BaseCrmDeliveryProduct crmdeliveryproduct ) throws Exception {
		CrmDeliveryProduct dao = new CrmDeliveryProduct();
		dao.setDeliveryProductId( crmdeliveryproduct.getDeliveryProductId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmdeliveryproduct);
			result = dao.update();
		}
		return result == 1 ? crmdeliveryproduct : null ;
	}

	public static BaseCrmDeliveryProduct updateCrmDeliveryProductDirect( BaseCrmDeliveryProduct crmdeliveryproduct ) throws Exception {
		CrmDeliveryProduct dao = new CrmDeliveryProduct();
		int result = 0;
		dao.setDataFromBase(crmdeliveryproduct);
		result = dao.update();
		return result == 1 ? crmdeliveryproduct : null ;
	}

	public static int setDeleteConditions(BaseCrmDeliveryProduct bean, CrmDeliveryProduct dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getDeliveryProductId() != null) {
			dao.setConditionDeliveryProductId("=", bean.getDeliveryProductId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getDeliveryId() != null) {
				dao.setConditionDeliveryId("=", bean.getDeliveryId());
				count++;
			}
			if(bean.getProductId() != null) {
				dao.setConditionProductId("=", bean.getProductId());
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
			if(bean.getDeliveryName() != null) {
				dao.setConditionDeliveryName("=", bean.getDeliveryName());
				count++;
			}
			if(bean.getOrderId() != null) {
				dao.setConditionOrderId("=", bean.getOrderId());
				count++;
			}
			if(bean.getQuantityTotalDeliver() != null) {
				dao.setConditionQuantityTotalDeliver("=", bean.getQuantityTotalDeliver());
				count++;
			}
			if(bean.getFlagSquaredUp() != null) {
				dao.setConditionFlagSquaredUp("=", bean.getFlagSquaredUp());
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
			if(bean.getDetailedAddressDelivery() != null) {
				dao.setConditionDetailedAddressDelivery("=", bean.getDetailedAddressDelivery());
				count++;
			}
			if(bean.getMemo() != null) {
				dao.setConditionMemo("=", bean.getMemo());
				count++;
			}
			if(bean.getOrderProductId() != null) {
				dao.setConditionOrderProductId("=", bean.getOrderProductId());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmDeliveryProduct bean, CrmDeliveryProduct dao){
		int count = 0;
		if(bean.getDeliveryProductId() != null) {
			dao.setConditionDeliveryProductId("=", bean.getDeliveryProductId());
			count++;
		}
		if(bean.getDeliveryId() != null) {
			dao.setConditionDeliveryId("=", bean.getDeliveryId());
			count++;
		}
		if(bean.getProductId() != null) {
			dao.setConditionProductId("=", bean.getProductId());
			count++;
		}
		if(bean.getDepartmentId() != null) {
			if(bean.getDepartmentId().indexOf("%") >= 0)
				dao.setConditionDepartmentId("like", bean.getDepartmentId());
			else
				dao.setConditionDepartmentId("=", bean.getDepartmentId());
			count++;
		}
		if(bean.getEmployeeIdCreated() != null) {
			if(bean.getEmployeeIdCreated().indexOf("%") >= 0)
				dao.setConditionEmployeeIdCreated("like", bean.getEmployeeIdCreated());
			else
				dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
			count++;
		}
		if(bean.getDateCreated() != null) {
			dao.setConditionDateCreated(">=", bean.getDateCreated());
			count++;
		}
		if(bean.getEmployeeIdUpdated() != null) {
			if(bean.getEmployeeIdUpdated().indexOf("%") >= 0)
				dao.setConditionEmployeeIdUpdated("like", bean.getEmployeeIdUpdated());
			else
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
		if(bean.getDeliveryName() != null) {
			if(bean.getDeliveryName().indexOf("%") >= 0)
				dao.setConditionDeliveryName("like", bean.getDeliveryName());
			else
				dao.setConditionDeliveryName("=", bean.getDeliveryName());
			count++;
		}
		if(bean.getOrderId() != null) {
			dao.setConditionOrderId("=", bean.getOrderId());
			count++;
		}
		if(bean.getQuantityTotalDeliver() != null) {
			dao.setConditionQuantityTotalDeliver("=", bean.getQuantityTotalDeliver());
			count++;
		}
		if(bean.getQuantityDelivered() != null) {
			dao.setConditionQuantityDelivered("=", bean.getQuantityDelivered());
			count++;
		}
		if(bean.getFlagSquaredUp() != null) {
			dao.setConditionFlagSquaredUp("=", bean.getFlagSquaredUp());
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
		if(bean.getDetailedAddressDelivery() != null) {
			if(bean.getDetailedAddressDelivery().indexOf("%") >= 0)
				dao.setConditionDetailedAddressDelivery("like", bean.getDetailedAddressDelivery());
			else
				dao.setConditionDetailedAddressDelivery("=", bean.getDetailedAddressDelivery());
			count++;
		}
		if(bean.getMemo() != null) {
			if(bean.getMemo().indexOf("%") >= 0)
				dao.setConditionMemo("like", bean.getMemo());
			else
				dao.setConditionMemo("=", bean.getMemo());
			count++;
		}
		if(bean.getOrderProductId() != null) {
			dao.setConditionOrderProductId("=", bean.getOrderProductId());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseCrmDeliveryProduct bean = new BaseCrmDeliveryProduct();
		bean.setDataFromJSON(json);
		CrmDeliveryProduct dao = new CrmDeliveryProduct();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmDeliveryProduct> rlist = new BaseCollection<>();
		BaseCrmDeliveryProduct bean = new BaseCrmDeliveryProduct();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmDeliveryProduct dao = new CrmDeliveryProduct();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmDeliveryProduct> result = dao.conditionalLoad(addtion);
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
		BaseCrmDeliveryProduct bean = new BaseCrmDeliveryProduct();
		bean.setDataFromJSON(json);
		CrmDeliveryProduct dao = new CrmDeliveryProduct();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmDeliveryProduct bean = new BaseCrmDeliveryProduct();
		bean.setDataFromJSON(json);
		CrmDeliveryProduct dao = new CrmDeliveryProduct();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmDeliveryProduct bean = new BaseCrmDeliveryProduct();
		bean.setDataFromJSON(json);
		CrmDeliveryProduct dao = new CrmDeliveryProduct();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmDeliveryProduct bean = new BaseCrmDeliveryProduct();
		bean.setDataFromJSON(json);
		CrmDeliveryProduct dao = new CrmDeliveryProduct();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


