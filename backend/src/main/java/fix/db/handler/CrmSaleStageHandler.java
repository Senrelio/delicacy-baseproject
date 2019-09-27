package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseCrmSaleStage;
import java.util.List;
import fix.db.dao.CrmSaleStage;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class CrmSaleStageHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(CrmSaleStageHandler.class);

	public static BaseCrmSaleStage getCrmSaleStageById( 
		java.lang.Integer sale_stage_id
	) throws Exception
	{
		CrmSaleStage dao = new CrmSaleStage();
		dao.setSaleStageId(sale_stage_id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isCrmSaleStageExists( fix.db.bean.BaseCrmSaleStage bean, String additional ) throws Exception {

		CrmSaleStage dao = new CrmSaleStage();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countCrmSaleStage( fix.db.bean.BaseCrmSaleStage bean, String additional ) throws Exception {

		CrmSaleStage dao = new CrmSaleStage();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseCrmSaleStage> queryCrmSaleStage( fix.db.bean.BaseCrmSaleStage bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		CrmSaleStage dao = new CrmSaleStage();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseCrmSaleStage> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseCrmSaleStage> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseCrmSaleStage addToCrmSaleStage ( BaseCrmSaleStage crmsalestage )  throws Exception {
		return addToCrmSaleStage ( crmsalestage , false);
	}

	public static BaseCrmSaleStage addToCrmSaleStage ( BaseCrmSaleStage crmsalestage, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		CrmSaleStage dao = new CrmSaleStage();
		dao.setDataFromBase(crmsalestage);
		int result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseCrmSaleStage addUpdateCrmSaleStage ( BaseCrmSaleStage crmsalestage ) throws Exception {
		return addUpdateCrmSaleStage ( crmsalestage , false);
	}

	public static BaseCrmSaleStage addUpdateCrmSaleStage ( BaseCrmSaleStage crmsalestage, boolean singleTransaction  ) throws Exception {
		if(crmsalestage.getSaleStageId() == null) return addToCrmSaleStage(crmsalestage);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		CrmSaleStage dao = new CrmSaleStage();
		dao.setDataFromBase(crmsalestage);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(crmsalestage); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save();
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteCrmSaleStage ( BaseCrmSaleStage bean ) throws Exception {
		CrmSaleStage dao = new CrmSaleStage();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseCrmSaleStage updateCrmSaleStage ( BaseCrmSaleStage crmsalestage ) throws Exception {
		CrmSaleStage dao = new CrmSaleStage();
		dao.setSaleStageId( crmsalestage.getSaleStageId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(crmsalestage);
			result = dao.update();
		}
		return result == 1 ? crmsalestage : null ;
	}

	public static BaseCrmSaleStage updateCrmSaleStageDirect( BaseCrmSaleStage crmsalestage ) throws Exception {
		CrmSaleStage dao = new CrmSaleStage();
		int result = 0;
		dao.setDataFromBase(crmsalestage);
		result = dao.update();
		return result == 1 ? crmsalestage : null ;
	}

	public static int setDeleteConditions(BaseCrmSaleStage bean, CrmSaleStage dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getSaleStageId() != null) {
			dao.setConditionSaleStageId("=", bean.getSaleStageId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getSaleStageName() != null) {
				dao.setConditionSaleStageName("=", bean.getSaleStageName());
				count++;
			}
			if(bean.getStatusOpportunity() != null) {
				dao.setConditionStatusOpportunity("=", bean.getStatusOpportunity());
				count++;
			}
			if(bean.getStageOrderNo() != null) {
				dao.setConditionStageOrderNo("=", bean.getStageOrderNo());
				count++;
			}
			if(bean.getDurationExpected() != null) {
				dao.setConditionDurationExpected("=", bean.getDurationExpected());
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
		}
		return count;
	}

	public static int setConditions(BaseCrmSaleStage bean, CrmSaleStage dao){
		int count = 0;
		if(bean.getSaleStageId() != null) {
			dao.setConditionSaleStageId("=", bean.getSaleStageId());
			count++;
		}
		if(bean.getSaleStageName() != null) {
			if(bean.getSaleStageName().indexOf("%") >= 0)
				dao.setConditionSaleStageName("like", bean.getSaleStageName());
			else
				dao.setConditionSaleStageName("=", bean.getSaleStageName());
			count++;
		}
		if(bean.getStatusOpportunity() != null) {
			dao.setConditionStatusOpportunity("=", bean.getStatusOpportunity());
			count++;
		}
		if(bean.getStageOrderNo() != null) {
			dao.setConditionStageOrderNo("=", bean.getStageOrderNo());
			count++;
		}
		if(bean.getStageWinrate() != null) {
			dao.setConditionStageWinrate("=", bean.getStageWinrate());
			count++;
		}
		if(bean.getDurationExpected() != null) {
			dao.setConditionDurationExpected("=", bean.getDurationExpected());
			count++;
		}
		if(bean.getDateCreated() != null) {
			dao.setConditionDateCreated(">=", bean.getDateCreated());
			count++;
		}
		if(bean.getEmployeeIdCreated() != null) {
			dao.setConditionEmployeeIdCreated("=", bean.getEmployeeIdCreated());
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
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseCrmSaleStage bean = new BaseCrmSaleStage();
		bean.setDataFromJSON(json);
		CrmSaleStage dao = new CrmSaleStage();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseCrmSaleStage> rlist = new BaseCollection<>();
		BaseCrmSaleStage bean = new BaseCrmSaleStage();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		CrmSaleStage dao = new CrmSaleStage();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseCrmSaleStage> result = dao.conditionalLoad(addtion);
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
		BaseCrmSaleStage bean = new BaseCrmSaleStage();
		bean.setDataFromJSON(json);
		CrmSaleStage dao = new CrmSaleStage();
		dao.setDataFromBase(bean);
		int num = dao.save();
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseCrmSaleStage bean = new BaseCrmSaleStage();
		bean.setDataFromJSON(json);
		CrmSaleStage dao = new CrmSaleStage();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseCrmSaleStage bean = new BaseCrmSaleStage();
		bean.setDataFromJSON(json);
		CrmSaleStage dao = new CrmSaleStage();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseCrmSaleStage bean = new BaseCrmSaleStage();
		bean.setDataFromJSON(json);
		CrmSaleStage dao = new CrmSaleStage();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


