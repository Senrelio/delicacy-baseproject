package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmPriceList;
import java.util.List;
import fix.db.dao.CrmPriceList;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmPriceListHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmPriceListHandler.class);

	public static BaseCrmPriceList getCrmPriceListById( 
		java.lang.Integer price_list_id
	) throws Exception
	{
		CrmPriceList dao = new CrmPriceList();
		dao.setPriceListId(price_list_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmPriceListExists( fix.db.bean.BaseCrmPriceList bean, String additional ) throws Exception {

		CrmPriceList dao = new CrmPriceList();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmPriceList( fix.db.bean.BaseCrmPriceList bean, String additional ) throws Exception {

		CrmPriceList dao = new CrmPriceList();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmPriceList> queryCrmPriceList( fix.db.bean.BaseCrmPriceList bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmPriceList dao = new CrmPriceList();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmPriceList> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmPriceList> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmPriceList addToCrmPriceList ( BaseCrmPriceList crmpricelist )  throws Exception {
		return addToCrmPriceList ( crmpricelist , false);
	}

	public static BaseCrmPriceList addToCrmPriceList ( BaseCrmPriceList crmpricelist, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmPriceList dao = new CrmPriceList();
		dao.setDataFromBase(crmpricelist);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmPriceList addUpdateCrmPriceList ( BaseCrmPriceList crmpricelist ) throws Exception {
		return addUpdateCrmPriceList ( crmpricelist , false);
	}

	public static BaseCrmPriceList addUpdateCrmPriceList ( BaseCrmPriceList crmpricelist, boolean singleTransaction  ) throws Exception {
		if(crmpricelist.getPriceListId() == null) return addToCrmPriceList(crmpricelist);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmPriceList dao = new CrmPriceList();
		dao.setDataFromBase(crmpricelist);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmpricelist); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmPriceList ( BaseCrmPriceList bean ) throws Exception {
		CrmPriceList dao = new CrmPriceList();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmPriceList updateCrmPriceList ( BaseCrmPriceList crmpricelist ) throws Exception {
		CrmPriceList dao = new CrmPriceList();
		dao.setPriceListId( crmpricelist.getPriceListId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmpricelist);
			result = dao.update();
		}
		return result == 1 ? crmpricelist : null ;
	}

	public static BaseCrmPriceList updateCrmPriceListDirect( BaseCrmPriceList crmpricelist ) throws Exception {
		CrmPriceList dao = new CrmPriceList();
		int result = 0;
		dao.setDataFromBase(crmpricelist);
		result = dao.update();
		return result == 1 ? crmpricelist : null ;
	}

	public static int setDeleteConditions(BaseCrmPriceList bean, CrmPriceList dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getPriceListId() != null) {
			dao.setConditionPriceListId("=", bean.getPriceListId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getPriceListName() != null) {
				dao.setConditionPriceListName("=", bean.getPriceListName());
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
			if(bean.getFlagEnabled() != null) {
				dao.setConditionFlagEnabled("=", bean.getFlagEnabled());
				count++;
			}
			if(bean.getMemo() != null) {
				dao.setConditionMemo("=", bean.getMemo());
				count++;
			}
			if(bean.getFlagStandardPriceList() != null) {
				dao.setConditionFlagStandardPriceList("=", bean.getFlagStandardPriceList());
				count++;
			}
			if(bean.getFlagLocked() != null) {
				dao.setConditionFlagLocked("=", bean.getFlagLocked());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseCrmPriceList bean, CrmPriceList dao){
		int count = 0;
		if(bean.getPriceListId() != null) {
			dao.setConditionPriceListId("=", bean.getPriceListId());
			count++;
		}
		if(bean.getPriceListName() != null) {
			if(bean.getPriceListName().indexOf("%") >= 0)
				dao.setConditionPriceListName("like", bean.getPriceListName());
			else
				dao.setConditionPriceListName("=", bean.getPriceListName());
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
		if(bean.getFlagEnabled() != null) {
			dao.setConditionFlagEnabled("=", bean.getFlagEnabled());
			count++;
		}
		if(bean.getMemo() != null) {
			if(bean.getMemo().indexOf("%") >= 0)
				dao.setConditionMemo("like", bean.getMemo());
			else
				dao.setConditionMemo("=", bean.getMemo());
			count++;
		}
		if(bean.getFlagStandardPriceList() != null) {
			dao.setConditionFlagStandardPriceList("=", bean.getFlagStandardPriceList());
			count++;
		}
		if(bean.getFlagLocked() != null) {
			dao.setConditionFlagLocked("=", bean.getFlagLocked());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseCrmPriceList bean = new BaseCrmPriceList();
		bean.setDataFromJSON(json);
		CrmPriceList dao = new CrmPriceList();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmPriceList> rlist = new BaseCollection<>();
		BaseCrmPriceList bean = new BaseCrmPriceList();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmPriceList dao = new CrmPriceList();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmPriceList> result = dao.conditionalLoad(addtion);
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
		BaseCrmPriceList bean = new BaseCrmPriceList();
		bean.setDataFromJSON(json);
		CrmPriceList dao = new CrmPriceList();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmPriceList bean = new BaseCrmPriceList();
		bean.setDataFromJSON(json);
		CrmPriceList dao = new CrmPriceList();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmPriceList bean = new BaseCrmPriceList();
		bean.setDataFromJSON(json);
		CrmPriceList dao = new CrmPriceList();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmPriceList bean = new BaseCrmPriceList();
		bean.setDataFromJSON(json);
		CrmPriceList dao = new CrmPriceList();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


