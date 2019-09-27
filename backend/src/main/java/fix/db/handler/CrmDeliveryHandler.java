package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmDelivery;
import java.util.List;
import fix.db.dao.CrmDelivery;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmDeliveryHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmDeliveryHandler.class);

	public static BaseCrmDelivery getCrmDeliveryById( 
		java.lang.Integer delivery_id
	) throws Exception
	{
		CrmDelivery dao = new CrmDelivery();
		dao.setDeliveryId(delivery_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmDeliveryExists( fix.db.bean.BaseCrmDelivery bean, String additional ) throws Exception {

		CrmDelivery dao = new CrmDelivery();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmDelivery( fix.db.bean.BaseCrmDelivery bean, String additional ) throws Exception {

		CrmDelivery dao = new CrmDelivery();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmDelivery> queryCrmDelivery( fix.db.bean.BaseCrmDelivery bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmDelivery dao = new CrmDelivery();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmDelivery> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmDelivery> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmDelivery addToCrmDelivery ( BaseCrmDelivery crmdelivery )  throws Exception {
		return addToCrmDelivery ( crmdelivery , false);
	}

	public static BaseCrmDelivery addToCrmDelivery ( BaseCrmDelivery crmdelivery, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmDelivery dao = new CrmDelivery();
		dao.setDataFromBase(crmdelivery);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmDelivery addUpdateCrmDelivery ( BaseCrmDelivery crmdelivery ) throws Exception {
		return addUpdateCrmDelivery ( crmdelivery , false);
	}

	public static BaseCrmDelivery addUpdateCrmDelivery ( BaseCrmDelivery crmdelivery, boolean singleTransaction  ) throws Exception {
		if(crmdelivery.getDeliveryId() == null) return addToCrmDelivery(crmdelivery);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmDelivery dao = new CrmDelivery();
		dao.setDataFromBase(crmdelivery);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmdelivery); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmDelivery ( BaseCrmDelivery bean ) throws Exception {
		CrmDelivery dao = new CrmDelivery();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmDelivery updateCrmDelivery ( BaseCrmDelivery crmdelivery ) throws Exception {
		CrmDelivery dao = new CrmDelivery();
		dao.setDeliveryId( crmdelivery.getDeliveryId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmdelivery);
			result = dao.update();
		}
		return result == 1 ? crmdelivery : null ;
	}

	public static BaseCrmDelivery updateCrmDeliveryDirect( BaseCrmDelivery crmdelivery ) throws Exception {
		CrmDelivery dao = new CrmDelivery();
		int result = 0;
		dao.setDataFromBase(crmdelivery);
		result = dao.update();
		return result == 1 ? crmdelivery : null ;
	}

	public static int setDeleteConditions(BaseCrmDelivery bean, CrmDelivery dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getDeliveryId() != null) {
			dao.setConditionDeliveryId("=", bean.getDeliveryId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getDeliveryCode() != null) {
				dao.setConditionDeliveryCode("=", bean.getDeliveryCode());
				count++;
			}
			if(bean.getDeliveryName() != null) {
				dao.setConditionDeliveryName("=", bean.getDeliveryName());
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
			if(bean.getStatusDelivery() != null) {
				dao.setConditionStatusDelivery("=", bean.getStatusDelivery());
				count++;
			}
			if(bean.getFlagLocked() != null) {
				dao.setConditionFlagLocked("=", bean.getFlagLocked());
				count++;
			}
			if(bean.getCustomerId() != null) {
				dao.setConditionCustomerId("=", bean.getCustomerId());
				count++;
			}
			if(bean.getMemo() != null) {
				dao.setConditionMemo("=", bean.getMemo());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmDelivery bean, CrmDelivery dao){
		int count = 0;
		if(bean.getDeliveryId() != null) {
			dao.setConditionDeliveryId("=", bean.getDeliveryId());
			count++;
		}
		if(bean.getDeliveryCode() != null) {
			if(bean.getDeliveryCode().indexOf("%") >= 0)
				dao.setConditionDeliveryCode("like", bean.getDeliveryCode());
			else
				dao.setConditionDeliveryCode("=", bean.getDeliveryCode());
			count++;
		}
		if(bean.getDeliveryName() != null) {
			if(bean.getDeliveryName().indexOf("%") >= 0)
				dao.setConditionDeliveryName("like", bean.getDeliveryName());
			else
				dao.setConditionDeliveryName("=", bean.getDeliveryName());
			count++;
		}
		if(bean.getEmployeeIdMaintainer() != null) {
			if(bean.getEmployeeIdMaintainer().indexOf("%") >= 0)
				dao.setConditionEmployeeIdMaintainer("like", bean.getEmployeeIdMaintainer());
			else
				dao.setConditionEmployeeIdMaintainer("=", bean.getEmployeeIdMaintainer());
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
		if(bean.getStatusDelivery() != null) {
			dao.setConditionStatusDelivery("=", bean.getStatusDelivery());
			count++;
		}
		if(bean.getFlagLocked() != null) {
			dao.setConditionFlagLocked("=", bean.getFlagLocked());
			count++;
		}
		if(bean.getCustomerId() != null) {
			dao.setConditionCustomerId("=", bean.getCustomerId());
			count++;
		}
		if(bean.getDateDelivered() != null) {
			dao.setConditionDateDelivered(">=", bean.getDateDelivered());
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
		BaseCrmDelivery bean = new BaseCrmDelivery();
		bean.setDataFromJSON(json);
		CrmDelivery dao = new CrmDelivery();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmDelivery> rlist = new BaseCollection<>();
		BaseCrmDelivery bean = new BaseCrmDelivery();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmDelivery dao = new CrmDelivery();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmDelivery> result = dao.conditionalLoad(addtion);
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
		BaseCrmDelivery bean = new BaseCrmDelivery();
		bean.setDataFromJSON(json);
		CrmDelivery dao = new CrmDelivery();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmDelivery bean = new BaseCrmDelivery();
		bean.setDataFromJSON(json);
		CrmDelivery dao = new CrmDelivery();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmDelivery bean = new BaseCrmDelivery();
		bean.setDataFromJSON(json);
		CrmDelivery dao = new CrmDelivery();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmDelivery bean = new BaseCrmDelivery();
		bean.setDataFromJSON(json);
		CrmDelivery dao = new CrmDelivery();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


