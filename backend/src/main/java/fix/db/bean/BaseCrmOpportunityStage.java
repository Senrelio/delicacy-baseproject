package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmOpportunityStage extends GenericBase implements BaseFactory<BaseCrmOpportunityStage>, Comparable<BaseCrmOpportunityStage> 
{


	public static BaseCrmOpportunityStage newInstance(){
		return new BaseCrmOpportunityStage();
	}

	@Override
	public BaseCrmOpportunityStage make(){
		BaseCrmOpportunityStage b = new BaseCrmOpportunityStage();
		return b;
	}

	public final static java.lang.String CS_OPPORTUNITY_STAGE_PATH_ID = "opportunity_stage_path_id" ;
	public final static java.lang.String CS_OPPORTUNITY_ID = "opportunity_id" ;
	public final static java.lang.String CS_CURRENT_STAGE_ID = "current_stage_id" ;
	public final static java.lang.String CS_ENTITY_TYPE_ID = "entity_type_id" ;
	public final static java.lang.String CS_PREVIOUS_STAGE_ID = "previous_stage_id" ;
	public final static java.lang.String CS_DATE_START = "date_start" ;
	public final static java.lang.String CS_DATE_END = "date_end" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_ENTITY_TYPE = "entity_type" ;
	public final static java.lang.String CS_FLAG_RECENT_STAGE_PATH = "flag_recent_stage_path" ;

	public final static java.lang.String ALL_CAPTIONS = "销售机会阶段轨迹编码,所属销售机会编码,当前阶段编码,主体类型编码,上一步阶段编码,开始时间,结束时间,创建人编码,创建时间,主体类型,是否最近阶段轨迹";

	public java.lang.Integer getOpportunityStagePathId() {
		return this.__opportunity_stage_path_id;
	}

	public void setOpportunityStagePathId( java.lang.Integer value ) {
		this.__opportunity_stage_path_id = value;
	}

	public java.lang.Integer getOpportunityId() {
		return this.__opportunity_id;
	}

	public void setOpportunityId( java.lang.Integer value ) {
		this.__opportunity_id = value;
	}

	public java.lang.Integer getCurrentStageId() {
		return this.__current_stage_id;
	}

	public void setCurrentStageId( java.lang.Integer value ) {
		this.__current_stage_id = value;
	}

	public java.lang.Integer getEntityTypeId() {
		return this.__entity_type_id;
	}

	public void setEntityTypeId( java.lang.Integer value ) {
		this.__entity_type_id = value;
	}

	public java.lang.Integer getPreviousStageId() {
		return this.__previous_stage_id;
	}

	public void setPreviousStageId( java.lang.Integer value ) {
		this.__previous_stage_id = value;
	}

	public java.util.Date getDateStart() {
		return this.__date_start;
	}

	public void setDateStart( java.util.Date value ) {
		this.__date_start = value;
	}

	public java.util.Date getDateEnd() {
		return this.__date_end;
	}

	public void setDateEnd( java.util.Date value ) {
		this.__date_end = value;
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.Integer value ) {
		this.__employee_id_created = value;
	}

	public java.util.Date getDateCreated() {
		return this.__date_created;
	}

	public void setDateCreated( java.util.Date value ) {
		this.__date_created = value;
	}

	public java.lang.Integer getEntityType() {
		return this.__entity_type;
	}

	public void setEntityType( java.lang.Integer value ) {
		this.__entity_type = value;
	}

	public java.lang.Boolean getFlagRecentStagePath() {
		return this.__flag_recent_stage_path;
	}

	public void setFlagRecentStagePath( java.lang.Boolean value ) {
		this.__flag_recent_stage_path = value;
	}

	public void cloneCopy(BaseCrmOpportunityStage __bean){
		__bean.setOpportunityStagePathId(getOpportunityStagePathId());
		__bean.setOpportunityId(getOpportunityId());
		__bean.setCurrentStageId(getCurrentStageId());
		__bean.setEntityTypeId(getEntityTypeId());
		__bean.setPreviousStageId(getPreviousStageId());
		__bean.setDateStart(getDateStart());
		__bean.setDateEnd(getDateEnd());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateCreated(getDateCreated());
		__bean.setEntityType(getEntityType());
		__bean.setFlagRecentStagePath(getFlagRecentStagePath());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getOpportunityStagePathId() == null ? "" : getOpportunityStagePathId());
		sb.append(",");
		sb.append(getOpportunityId() == null ? "" : getOpportunityId());
		sb.append(",");
		sb.append(getCurrentStageId() == null ? "" : getCurrentStageId());
		sb.append(",");
		sb.append(getEntityTypeId() == null ? "" : getEntityTypeId());
		sb.append(",");
		sb.append(getPreviousStageId() == null ? "" : getPreviousStageId());
		sb.append(",");
		sb.append(getDateStart() == null ? "" : sdf.format(getDateStart()));
		sb.append(",");
		sb.append(getDateEnd() == null ? "" : sdf.format(getDateEnd()));
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEntityType() == null ? "" : getEntityType());
		sb.append(",");
		sb.append(getFlagRecentStagePath() == null ? "" : getFlagRecentStagePath());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmOpportunityStage o) {
		return __opportunity_stage_path_id == null ? -1 : __opportunity_stage_path_id.compareTo(o.getOpportunityStagePathId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__opportunity_stage_path_id);
		hash = 97 * hash + Objects.hashCode(this.__opportunity_id);
		hash = 97 * hash + Objects.hashCode(this.__current_stage_id);
		hash = 97 * hash + Objects.hashCode(this.__entity_type_id);
		hash = 97 * hash + Objects.hashCode(this.__previous_stage_id);
		hash = 97 * hash + Objects.hashCode(this.__date_start);
		hash = 97 * hash + Objects.hashCode(this.__date_end);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__entity_type);
		hash = 97 * hash + Objects.hashCode(this.__flag_recent_stage_path);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmOpportunityStage o = (BaseCrmOpportunityStage)obj;
		if(!Objects.equals(this.__opportunity_stage_path_id, o.getOpportunityStagePathId())) return false;
		if(!Objects.equals(this.__opportunity_id, o.getOpportunityId())) return false;
		if(!Objects.equals(this.__current_stage_id, o.getCurrentStageId())) return false;
		if(!Objects.equals(this.__entity_type_id, o.getEntityTypeId())) return false;
		if(!Objects.equals(this.__previous_stage_id, o.getPreviousStageId())) return false;
		if(!Objects.equals(this.__date_start, o.getDateStart())) return false;
		if(!Objects.equals(this.__date_end, o.getDateEnd())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__entity_type, o.getEntityType())) return false;
		if(!Objects.equals(this.__flag_recent_stage_path, o.getFlagRecentStagePath())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getOpportunityStagePathId() != null) sb.append(__wrapNumber(count++, "opportunityStagePathId", getOpportunityStagePathId()));
		if(getOpportunityId() != null) sb.append(__wrapNumber(count++, "opportunityId", getOpportunityId()));
		if(getCurrentStageId() != null) sb.append(__wrapNumber(count++, "currentStageId", getCurrentStageId()));
		if(getEntityTypeId() != null) sb.append(__wrapNumber(count++, "entityTypeId", getEntityTypeId()));
		if(getPreviousStageId() != null) sb.append(__wrapNumber(count++, "previousStageId", getPreviousStageId()));
		if(getDateStart() != null) sb.append(__wrapDate(count++, "dateStart", getDateStart()));
		if(getDateEnd() != null) sb.append(__wrapDate(count++, "dateEnd", getDateEnd()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEntityType() != null) sb.append(__wrapNumber(count++, "entityType", getEntityType()));
		if(getFlagRecentStagePath() != null) sb.append(__wrapBoolean(count++, "flagRecentStagePath", getFlagRecentStagePath()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getOpportunityStagePathId() != null) res.put("opportunityStagePathId", getOpportunityStagePathId());
		if(getOpportunityId() != null) res.put("opportunityId", getOpportunityId());
		if(getCurrentStageId() != null) res.put("currentStageId", getCurrentStageId());
		if(getEntityTypeId() != null) res.put("entityTypeId", getEntityTypeId());
		if(getPreviousStageId() != null) res.put("previousStageId", getPreviousStageId());
		if(getDateStart() != null) res.put("dateStart", getDateStart());
		if(getDateEnd() != null) res.put("dateEnd", getDateEnd());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEntityType() != null) res.put("entityType", getEntityType());
		if(getFlagRecentStagePath() != null) res.put("flagRecentStagePath", getFlagRecentStagePath());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("opportunityStagePathId")) != null) setOpportunityStagePathId(__getInt(val)); 
		if((val = values.get("opportunityId")) != null) setOpportunityId(__getInt(val)); 
		if((val = values.get("currentStageId")) != null) setCurrentStageId(__getInt(val)); 
		if((val = values.get("entityTypeId")) != null) setEntityTypeId(__getInt(val)); 
		if((val = values.get("previousStageId")) != null) setPreviousStageId(__getInt(val)); 
		if((val = values.get("dateStart")) != null) setDateStart(__getDate(val)); 
		if((val = values.get("dateEnd")) != null) setDateEnd(__getDate(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("entityType")) != null) setEntityType(__getInt(val)); 
		if((val = values.get("flagRecentStagePath")) != null) setFlagRecentStagePath(__getBoolean(val));
	}

	protected java.lang.Integer  __opportunity_stage_path_id ;
	protected java.lang.Integer  __opportunity_id ;
	protected java.lang.Integer  __current_stage_id ;
	protected java.lang.Integer  __entity_type_id ;
	protected java.lang.Integer  __previous_stage_id ;
	protected java.util.Date  __date_start ;
	protected java.util.Date  __date_end ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __entity_type ;
	protected java.lang.Boolean  __flag_recent_stage_path ;
}
