package fix.db.handler;

import org.apache.log4j.Logger;
import fix.db.bean.BaseArea;
import java.util.List;
import fix.db.dao.Area;
import delicacy.connection.ThreadConnection;
import delicacy.common.GenericDao;
import delicacy.json.BasicHandler;
import delicacy.json.JSON;
import java.io.StringReader;
import java.util.Map;
import delicacy.common.PaginationParameter;
import delicacy.common.BaseCollection;

public class AreaHandler implements GenericDao {

	private static final Logger __logger = Logger.getLogger(AreaHandler.class);

	public static BaseArea getAreaById( 

	) throws Exception
	{
		Area dao = new Area();
		if(dao.load()){
			return dao.generateBase();
		}
		return null;
	}

	public static boolean isAreaExists( fix.db.bean.BaseArea bean, String additional ) throws Exception {

		Area dao = new Area();
		setConditions(bean, dao);
		boolean res = dao.isExist(additional);
		return res;
	}

	public static int countArea( fix.db.bean.BaseArea bean, String additional ) throws Exception {

		Area dao = new Area();
		setConditions(bean, dao);
		int res = dao.countRows(additional);
		return res;
	}

	public static BaseCollection<BaseArea> queryArea( fix.db.bean.BaseArea bean, int pageNo, int pageLines, String additionalCondition ) throws Exception {
		Area dao = new Area();
		setConditions(bean, dao);
		dao.setCurrentPage(pageNo);
		dao.setPageLines(pageLines);
		java.util.List<BaseArea> result = dao.conditionalLoad(additionalCondition);
		BaseCollection<BaseArea> col = new BaseCollection<>();
		col.setCollections(result);
		col.setTotalPages(dao.getTotalPages());
		col.setCurrentPage(dao.getCurrentPage());
		col.setPageLines(dao.getPageLines());
		col.setTotalLines(dao.getTotalLines());
		col.setRecordNumber(result.size());
		return col;
	}

	public static BaseArea addToArea ( BaseArea area )  throws Exception {
		return addToArea ( area , false);
	}

	public static BaseArea addToArea ( BaseArea area, boolean singleTransaction ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		Area dao = new Area();
		dao.setDataFromBase(area);
		int result = dao.save(false);
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static BaseArea addUpdateArea ( BaseArea area ) throws Exception {
		return addUpdateArea ( area , false);
	}

	public static BaseArea addUpdateArea ( BaseArea area, boolean singleTransaction  ) throws Exception {
		if(singleTransaction) ThreadConnection.beginTransaction();
		StringBuilder sb = new StringBuilder();
		Area dao = new Area();
		dao.setDataFromBase(area);
		int result = 0;
		if(dao.load()) {
			dao.setDataFromBase(area); 
			if(dao.isThisObjectModified()) { 
				result = dao.update();
			} else result = 1;
		} else result = dao.save(false);
		if(singleTransaction) ThreadConnection.commit();
		return result==1?dao.generateBase():null;
	}

	public static int deleteArea ( BaseArea bean ) throws Exception {
		Area dao = new Area();
		if(setDeleteConditions(bean, dao) == 0) return 0;
		int result = dao.conditionalDelete();
		return result ;
	}

	public static BaseArea updateArea ( BaseArea area ) throws Exception {
		Area dao = new Area();
		int result = 0;
		if( dao.load() ) {
			dao.setDataFromBase(area);
			result = dao.update();
		}
		return result == 1 ? area : null ;
	}

	public static BaseArea updateAreaDirect( BaseArea area ) throws Exception {
		Area dao = new Area();
		int result = 0;
		dao.setDataFromBase(area);
		result = dao.update();
		return result == 1 ? area : null ;
	}

	public static int setDeleteConditions(BaseArea bean, Area dao){
		int count = 0;
		boolean foundKey = false;
		if(!foundKey) {
			if(bean.getId() != null) {
				dao.setConditionId("=", bean.getId());
				count++;
			}
			if(bean.getCode() != null) {
				dao.setConditionCode("=", bean.getCode());
				count++;
			}
			if(bean.getTitle() != null) {
				dao.setConditionTitle("=", bean.getTitle());
				count++;
			}
			if(bean.getPath() != null) {
				dao.setConditionPath("=", bean.getPath());
				count++;
			}
			if(bean.getStatus() != null) {
				dao.setConditionStatus("=", bean.getStatus());
				count++;
			}
			if(bean.getPid() != null) {
				dao.setConditionPid("=", bean.getPid());
				count++;
			}
			if(bean.getFirstWord() != null) {
				dao.setConditionFirstWord("=", bean.getFirstWord());
				count++;
			}
			if(bean.getLevel() != null) {
				dao.setConditionLevel("=", bean.getLevel());
				count++;
			}
			if(bean.getIsTown() != null) {
				dao.setConditionIsTown("=", bean.getIsTown());
				count++;
			}
			if(bean.getRemark() != null) {
				dao.setConditionRemark("=", bean.getRemark());
				count++;
			}
			if(bean.getEnMark() != null) {
				dao.setConditionEnMark("=", bean.getEnMark());
				count++;
			}
			if(bean.getDelFlag() != null) {
				dao.setConditionDelFlag("=", bean.getDelFlag());
				count++;
			}
			if(bean.getCreateBy() != null) {
				dao.setConditionCreateBy("=", bean.getCreateBy());
				count++;
			}
			if(bean.getUpdateBy() != null) {
				dao.setConditionUpdateBy("=", bean.getUpdateBy());
				count++;
			}
		}
		return count;
	}

	public static int setConditions(BaseArea bean, Area dao){
		int count = 0;
		if(bean.getId() != null) {
			dao.setConditionId("=", bean.getId());
			count++;
		}
		if(bean.getCode() != null) {
			if(bean.getCode().indexOf("%") >= 0)
				dao.setConditionCode("like", bean.getCode());
			else
				dao.setConditionCode("=", bean.getCode());
			count++;
		}
		if(bean.getTitle() != null) {
			if(bean.getTitle().indexOf("%") >= 0)
				dao.setConditionTitle("like", bean.getTitle());
			else
				dao.setConditionTitle("=", bean.getTitle());
			count++;
		}
		if(bean.getPath() != null) {
			if(bean.getPath().indexOf("%") >= 0)
				dao.setConditionPath("like", bean.getPath());
			else
				dao.setConditionPath("=", bean.getPath());
			count++;
		}
		if(bean.getStatus() != null) {
			dao.setConditionStatus("=", bean.getStatus());
			count++;
		}
		if(bean.getPid() != null) {
			dao.setConditionPid("=", bean.getPid());
			count++;
		}
		if(bean.getFirstWord() != null) {
			if(bean.getFirstWord().indexOf("%") >= 0)
				dao.setConditionFirstWord("like", bean.getFirstWord());
			else
				dao.setConditionFirstWord("=", bean.getFirstWord());
			count++;
		}
		if(bean.getLevel() != null) {
			dao.setConditionLevel("=", bean.getLevel());
			count++;
		}
		if(bean.getIsTown() != null) {
			dao.setConditionIsTown("=", bean.getIsTown());
			count++;
		}
		if(bean.getRemark() != null) {
			if(bean.getRemark().indexOf("%") >= 0)
				dao.setConditionRemark("like", bean.getRemark());
			else
				dao.setConditionRemark("=", bean.getRemark());
			count++;
		}
		if(bean.getEnMark() != null) {
			if(bean.getEnMark().indexOf("%") >= 0)
				dao.setConditionEnMark("like", bean.getEnMark());
			else
				dao.setConditionEnMark("=", bean.getEnMark());
			count++;
		}
		if(bean.getDelFlag() != null) {
			dao.setConditionDelFlag("=", bean.getDelFlag());
			count++;
		}
		if(bean.getCreateBy() != null) {
			if(bean.getCreateBy().indexOf("%") >= 0)
				dao.setConditionCreateBy("like", bean.getCreateBy());
			else
				dao.setConditionCreateBy("=", bean.getCreateBy());
			count++;
		}
		if(bean.getCreateTime() != null) {
			dao.setConditionCreateTime(">=", bean.getCreateTime());
			count++;
		}
		if(bean.getUpdateBy() != null) {
			if(bean.getUpdateBy().indexOf("%") >= 0)
				dao.setConditionUpdateBy("like", bean.getUpdateBy());
			else
				dao.setConditionUpdateBy("=", bean.getUpdateBy());
			count++;
		}
		if(bean.getUpdateTime() != null) {
			dao.setConditionUpdateTime(">=", bean.getUpdateTime());
			count++;
		}
		return count;
	}

	@Override
	public String findUsingKey(String json) throws Exception{
		BaseArea bean = new BaseArea();
		bean.setDataFromJSON(json);
		Area dao = new Area();
		dao.setPrimaryKeyFromBase(bean);
		if(dao.load()) { dao.setDataToBase(bean); return bean.toOneLineJSON(1,null); }
		return bean.toOneLineJSON(0,"Record not found.");
	}

	@Override
	public String find(String json, int currentPage, int pageSize, String addtion) throws Exception{
		BaseCollection<BaseArea> rlist = new BaseCollection<>();
		BaseArea bean = new BaseArea();
		JSON parser = new JSON(new StringReader(json));
		Map<String, Object> params = (Map<String, Object>) parser.parse(new BasicHandler());
		bean.setDataFromMap(params);
		PaginationParameter pp = PaginationParameter.generateFromMap(params);
		if(pp != null){
			if(pp.getCurrentPage() > 0) currentPage = pp.getCurrentPage();
			if(pp.getPageSize() > 0) pageSize = pp.getPageSize();
			if(pp.getCondition() != null) addtion = pp.getCondition();
		}
		Area dao = new Area();
		setConditions(bean, dao);
		dao.setCurrentPage(currentPage);
		dao.setPageLines(pageSize);
		List<BaseArea> result = dao.conditionalLoad(addtion);
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
		BaseArea bean = new BaseArea();
		bean.setDataFromJSON(json);
		Area dao = new Area();
		dao.setDataFromBase(bean);
		int num = dao.save(false);
		dao.setDataToBase(bean);
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String update(String json) throws Exception{
		BaseArea bean = new BaseArea();
		bean.setDataFromJSON(json);
		Area dao = new Area();
		dao.setPrimaryKeyFromBase(bean);
		int num=0;
		if(dao.load()){dao.setDataFromBase(bean); num = dao.update(); }
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String delete(String json) throws Exception{
		BaseArea bean = new BaseArea();
		bean.setDataFromJSON(json);
		Area dao = new Area();
		setDeleteConditions(bean, dao);
		int num = dao.conditionalDelete();
		return bean.toOneLineJSON(num, null);
	}

	@Override
	public String saveOrUpdate(String json) throws Exception{
		BaseArea bean = new BaseArea();
		bean.setDataFromJSON(json);
		Area dao = new Area();
		dao.setPrimaryKeyFromBase(bean);
		int ret = 0;
		if(dao.isPrimaryKeyNull()) { dao.setDataFromBase(bean); ret = dao.save(false); bean = dao.generateBase(); }
		else if(dao.load()) { dao.setDataFromBase(bean); ret = dao.update(); bean = dao.generateBase(); }
		return bean.toOneLineJSON(ret, null);
	}

}


