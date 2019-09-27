package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseSysBusinessAttachment;
import java.util.List;
import fix.db.dao.SysBusinessAttachment;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class SysBusinessAttachmentHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(SysBusinessAttachmentHandler.class);

	public static BaseSysBusinessAttachment getSysBusinessAttachmentById( 
		java.lang.Integer id
	) throws Exception
	{
		SysBusinessAttachment dao = new SysBusinessAttachment();
		dao.setId(id);
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isSysBusinessAttachmentExists( fix.db.bean.BaseSysBusinessAttachment bean, String additional ) throws Exception {

		SysBusinessAttachment dao = new SysBusinessAttachment();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countSysBusinessAttachment( fix.db.bean.BaseSysBusinessAttachment bean, String additional ) throws Exception {

		SysBusinessAttachment dao = new SysBusinessAttachment();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseSysBusinessAttachment> querySysBusinessAttachment( fix.db.bean.BaseSysBusinessAttachment bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		SysBusinessAttachment dao = new SysBusinessAttachment();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseSysBusinessAttachment> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseSysBusinessAttachment> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseSysBusinessAttachment addToSysBusinessAttachment ( BaseSysBusinessAttachment sysbusinessattachment )  throws Exception {
		return addToSysBusinessAttachment ( sysbusinessattachment , false);
	}

	public static BaseSysBusinessAttachment addToSysBusinessAttachment ( BaseSysBusinessAttachment sysbusinessattachment, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		SysBusinessAttachment dao = new SysBusinessAttachment();
		dao.setDataFromBase(sysbusinessattachment);
		int result = dao.save(false);
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseSysBusinessAttachment addUpdateSysBusinessAttachment ( BaseSysBusinessAttachment sysbusinessattachment ) throws Exception {
		return addUpdateSysBusinessAttachment ( sysbusinessattachment , false);
	}

	public static BaseSysBusinessAttachment addUpdateSysBusinessAttachment ( BaseSysBusinessAttachment sysbusinessattachment, boolean singleTransaction  ) throws Exception {
		if(sysbusinessattachment.getId() == null) return addToSysBusinessAttachment(sysbusinessattachment);
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		SysBusinessAttachment dao = new SysBusinessAttachment();
		dao.setDataFromBase(sysbusinessattachment);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(sysbusinessattachment); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save(false);
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteSysBusinessAttachment ( BaseSysBusinessAttachment bean ) throws Exception {
		SysBusinessAttachment dao = new SysBusinessAttachment();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseSysBusinessAttachment updateSysBusinessAttachment ( BaseSysBusinessAttachment sysbusinessattachment ) throws Exception {
		SysBusinessAttachment dao = new SysBusinessAttachment();
		dao.setId( sysbusinessattachment.getId() );
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(sysbusinessattachment);
			result = dao.update();
		}
		return result == 1 ? sysbusinessattachment : null ;
	}

	public static BaseSysBusinessAttachment updateSysBusinessAttachmentDirect( BaseSysBusinessAttachment sysbusinessattachment ) throws Exception {
		SysBusinessAttachment dao = new SysBusinessAttachment();
		int result = 0;
		dao.setDataFromBase(sysbusinessattachment);
		result = dao.update();
		return result == 1 ? sysbusinessattachment : null ;
	}

	public static int setDeleteConditions(BaseSysBusinessAttachment bean, SysBusinessAttachment dao){
		int count = 0;
		boolean foundKey = false;
		if(bean.getId() != null) {
			dao.setConditionId("=", bean.getId());
			count++;
			foundKey = true;
		}
		if(!foundKey) {
			if(bean.getBusinessType() != null) {
				dao.setConditionBusinessType("=", bean.getBusinessType());
				count++;
			}
			if(bean.getBusinessId() != null) {
				dao.setConditionBusinessId("=", bean.getBusinessId());
				count++;
			}
			if(bean.getAttachmentId() != null) {
				dao.setConditionAttachmentId("=", bean.getAttachmentId());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseSysBusinessAttachment bean, SysBusinessAttachment dao){
		int count = 0;
		if(bean.getId() != null) {
			dao.setConditionId("=", bean.getId());
			count++;
		}
		if(bean.getBusinessType() != null) {
			if(bean.getBusinessType().indexOf("%") >= 0)
				dao.setConditionBusinessType("like", bean.getBusinessType());
			else
				dao.setConditionBusinessType("=", bean.getBusinessType());
			count++;
		}
		if(bean.getBusinessId() != null) {
			dao.setConditionBusinessId("=", bean.getBusinessId());
			count++;
		}
		if(bean.getAttachmentId() != null) {
			dao.setConditionAttachmentId("=", bean.getAttachmentId());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseSysBusinessAttachment bean = new BaseSysBusinessAttachment();
		bean.setDataFromJSON(json);
		SysBusinessAttachment dao = new SysBusinessAttachment();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseSysBusinessAttachment> rlist = new BaseCollection<>();
		BaseSysBusinessAttachment bean = new BaseSysBusinessAttachment();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		SysBusinessAttachment dao = new SysBusinessAttachment();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseSysBusinessAttachment> result = dao.conditionalLoad(addtion);
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
		BaseSysBusinessAttachment bean = new BaseSysBusinessAttachment();
		bean.setDataFromJSON(json);
		SysBusinessAttachment dao = new SysBusinessAttachment();
		dao.setDataFromBase(bean);
		int num = dao.save(false);
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseSysBusinessAttachment bean = new BaseSysBusinessAttachment();
		bean.setDataFromJSON(json);
		SysBusinessAttachment dao = new SysBusinessAttachment();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseSysBusinessAttachment bean = new BaseSysBusinessAttachment();
		bean.setDataFromJSON(json);
		SysBusinessAttachment dao = new SysBusinessAttachment();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseSysBusinessAttachment bean = new BaseSysBusinessAttachment();
		bean.setDataFromJSON(json);
		SysBusinessAttachment dao = new SysBusinessAttachment();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(false); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


