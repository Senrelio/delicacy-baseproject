package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmMarketingEvent extends GenericBase implements BaseFactory<BaseCrmMarketingEvent>, Comparable<BaseCrmMarketingEvent> 
{


	public static BaseCrmMarketingEvent newInstance(){
		return new BaseCrmMarketingEvent();
	}

	@Override
	public BaseCrmMarketingEvent make(){
		BaseCrmMarketingEvent b = new BaseCrmMarketingEvent();
		return b;
	}

	public final static java.lang.String CS_MARKETING_EVENT_ID = "marketing_event_id" ;
	public final static java.lang.String CS_ENTITY_TYPE = "entity_type" ;
	public final static java.lang.String CS_EMPLOYEE_ID_RESPONSIBLE = "employee_id_responsible" ;
	public final static java.lang.String CS_EVENT_NAME = "event_name" ;
	public final static java.lang.String CS_EVENT_STATUS = "event_status" ;
	public final static java.lang.String CS_EVENT_TYPE = "event_type" ;
	public final static java.lang.String CS_DATE_START = "date_start" ;
	public final static java.lang.String CS_DATE_END = "date_end" ;
	public final static java.lang.String CS_BUDGET_EVENT = "budget_event" ;
	public final static java.lang.String CS_REVENUE_EXPECTED = "revenue_expected" ;
	public final static java.lang.String CS_NUM_PEOPLE_INVITED = "num_people_invited" ;
	public final static java.lang.String CS_NUM_PEOPLE_ATTENDED = "num_people_attended" ;
	public final static java.lang.String CS_COST_ACTUAL = "cost_actual" ;
	public final static java.lang.String CS_REVENUE_ACTUAL = "revenue_actual" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_LATEST_ACTIVITY = "date_latest_activity" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_FLAG_LOCKED = "flag_locked" ;
	public final static java.lang.String CS_EMPLOYEE_ID_LATEST_FOLLOWUP = "employee_id_latest_followup" ;
	public final static java.lang.String CS_EVENT_DETAILED_ADDRESS = "event_detailed_address" ;
	public final static java.lang.String CS_EVENT_DESCRIPTION = "event_description" ;
	public final static java.lang.String CS_MARKET_REACTION_EXPECTED = "market_reaction_expected" ;
	public final static java.lang.String CS_MEMO = "memo" ;

	public final static java.lang.String ALL_CAPTIONS = "市场活动编码,主体类型,市场活动负责人,活动名称,活动状态,活动类型,开始日期,结束日期,活动预算,预期收入,邀请人数,实际人数,实际开销,实际收入,创建日期,创建人编码,最近活动记录时间,最近修改日,修改人编码,负责部门编码,是否被锁定,最近跟进人编码,活动详细地址,活动说明,预期响应,备注";

	public java.lang.Integer getMarketingEventId() {
		return this.__marketing_event_id;
	}

	public void setMarketingEventId( java.lang.Integer value ) {
		this.__marketing_event_id = value;
	}

	public java.lang.Integer getEntityType() {
		return this.__entity_type;
	}

	public void setEntityType( java.lang.Integer value ) {
		this.__entity_type = value;
	}

	public java.lang.Integer getEmployeeIdResponsible() {
		return this.__employee_id_responsible;
	}

	public void setEmployeeIdResponsible( java.lang.Integer value ) {
		this.__employee_id_responsible = value;
	}

	public java.lang.String getEventName() {
		return this.__event_name;
	}

	public void setEventName( java.lang.String value ) {
		this.__event_name = value;
	}

	public java.lang.Integer getEventStatus() {
		return this.__event_status;
	}

	public void setEventStatus( java.lang.Integer value ) {
		this.__event_status = value;
	}

	public java.lang.Integer getEventType() {
		return this.__event_type;
	}

	public void setEventType( java.lang.Integer value ) {
		this.__event_type = value;
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

	public java.math.BigDecimal getBudgetEvent() {
		return this.__budget_event;
	}

	public void setBudgetEvent( java.math.BigDecimal value ) {
		this.__budget_event = value;
	}

	public java.math.BigDecimal getRevenueExpected() {
		return this.__revenue_expected;
	}

	public void setRevenueExpected( java.math.BigDecimal value ) {
		this.__revenue_expected = value;
	}

	public java.lang.Integer getNumPeopleInvited() {
		return this.__num_people_invited;
	}

	public void setNumPeopleInvited( java.lang.Integer value ) {
		this.__num_people_invited = value;
	}

	public java.lang.Integer getNumPeopleAttended() {
		return this.__num_people_attended;
	}

	public void setNumPeopleAttended( java.lang.Integer value ) {
		this.__num_people_attended = value;
	}

	public java.math.BigDecimal getCostActual() {
		return this.__cost_actual;
	}

	public void setCostActual( java.math.BigDecimal value ) {
		this.__cost_actual = value;
	}

	public java.lang.String getRevenueActual() {
		return this.__revenue_actual;
	}

	public void setRevenueActual( java.lang.String value ) {
		this.__revenue_actual = value;
	}

	public java.util.Date getDateCreated() {
		return this.__date_created;
	}

	public void setDateCreated( java.util.Date value ) {
		this.__date_created = value;
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.Integer value ) {
		this.__employee_id_created = value;
	}

	public java.util.Date getDateLatestActivity() {
		return this.__date_latest_activity;
	}

	public void setDateLatestActivity( java.util.Date value ) {
		this.__date_latest_activity = value;
	}

	public java.util.Date getDateUpdated() {
		return this.__date_updated;
	}

	public void setDateUpdated( java.util.Date value ) {
		this.__date_updated = value;
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return this.__employee_id_updated;
	}

	public void setEmployeeIdUpdated( java.lang.Integer value ) {
		this.__employee_id_updated = value;
	}

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
	}

	public java.lang.Boolean getFlagLocked() {
		return this.__flag_locked;
	}

	public void setFlagLocked( java.lang.Boolean value ) {
		this.__flag_locked = value;
	}

	public java.lang.Integer getEmployeeIdLatestFollowup() {
		return this.__employee_id_latest_followup;
	}

	public void setEmployeeIdLatestFollowup( java.lang.Integer value ) {
		this.__employee_id_latest_followup = value;
	}

	public java.lang.String getEventDetailedAddress() {
		return this.__event_detailed_address;
	}

	public void setEventDetailedAddress( java.lang.String value ) {
		this.__event_detailed_address = value;
	}

	public java.lang.String getEventDescription() {
		return this.__event_description;
	}

	public void setEventDescription( java.lang.String value ) {
		this.__event_description = value;
	}

	public java.lang.String getMarketReactionExpected() {
		return this.__market_reaction_expected;
	}

	public void setMarketReactionExpected( java.lang.String value ) {
		this.__market_reaction_expected = value;
	}

	public java.lang.String getMemo() {
		return this.__memo;
	}

	public void setMemo( java.lang.String value ) {
		this.__memo = value;
	}

	public void cloneCopy(BaseCrmMarketingEvent __bean){
		__bean.setMarketingEventId(getMarketingEventId());
		__bean.setEntityType(getEntityType());
		__bean.setEmployeeIdResponsible(getEmployeeIdResponsible());
		__bean.setEventName(getEventName());
		__bean.setEventStatus(getEventStatus());
		__bean.setEventType(getEventType());
		__bean.setDateStart(getDateStart());
		__bean.setDateEnd(getDateEnd());
		__bean.setBudgetEvent(getBudgetEvent());
		__bean.setRevenueExpected(getRevenueExpected());
		__bean.setNumPeopleInvited(getNumPeopleInvited());
		__bean.setNumPeopleAttended(getNumPeopleAttended());
		__bean.setCostActual(getCostActual());
		__bean.setRevenueActual(getRevenueActual());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateLatestActivity(getDateLatestActivity());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setFlagLocked(getFlagLocked());
		__bean.setEmployeeIdLatestFollowup(getEmployeeIdLatestFollowup());
		__bean.setEventDetailedAddress(getEventDetailedAddress());
		__bean.setEventDescription(getEventDescription());
		__bean.setMarketReactionExpected(getMarketReactionExpected());
		__bean.setMemo(getMemo());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getMarketingEventId() == null ? "" : getMarketingEventId());
		sb.append(",");
		sb.append(getEntityType() == null ? "" : getEntityType());
		sb.append(",");
		sb.append(getEmployeeIdResponsible() == null ? "" : getEmployeeIdResponsible());
		sb.append(",");
		sb.append(getEventName() == null ? "" : getEventName());
		sb.append(",");
		sb.append(getEventStatus() == null ? "" : getEventStatus());
		sb.append(",");
		sb.append(getEventType() == null ? "" : getEventType());
		sb.append(",");
		sb.append(getDateStart() == null ? "" : sdf.format(getDateStart()));
		sb.append(",");
		sb.append(getDateEnd() == null ? "" : sdf.format(getDateEnd()));
		sb.append(",");
		sb.append(getBudgetEvent() == null ? "" : getBudgetEvent());
		sb.append(",");
		sb.append(getRevenueExpected() == null ? "" : getRevenueExpected());
		sb.append(",");
		sb.append(getNumPeopleInvited() == null ? "" : getNumPeopleInvited());
		sb.append(",");
		sb.append(getNumPeopleAttended() == null ? "" : getNumPeopleAttended());
		sb.append(",");
		sb.append(getCostActual() == null ? "" : getCostActual());
		sb.append(",");
		sb.append(getRevenueActual() == null ? "" : getRevenueActual());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getDateLatestActivity() == null ? "" : sdf.format(getDateLatestActivity()));
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getFlagLocked() == null ? "" : getFlagLocked());
		sb.append(",");
		sb.append(getEmployeeIdLatestFollowup() == null ? "" : getEmployeeIdLatestFollowup());
		sb.append(",");
		sb.append(getEventDetailedAddress() == null ? "" : getEventDetailedAddress());
		sb.append(",");
		sb.append(getEventDescription() == null ? "" : getEventDescription());
		sb.append(",");
		sb.append(getMarketReactionExpected() == null ? "" : getMarketReactionExpected());
		sb.append(",");
		sb.append(getMemo() == null ? "" : getMemo());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmMarketingEvent o) {
		return __marketing_event_id == null ? -1 : __marketing_event_id.compareTo(o.getMarketingEventId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__marketing_event_id);
		hash = 97 * hash + Objects.hashCode(this.__entity_type);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_responsible);
		hash = 97 * hash + Objects.hashCode(this.__event_name);
		hash = 97 * hash + Objects.hashCode(this.__event_status);
		hash = 97 * hash + Objects.hashCode(this.__event_type);
		hash = 97 * hash + Objects.hashCode(this.__date_start);
		hash = 97 * hash + Objects.hashCode(this.__date_end);
		hash = 97 * hash + Objects.hashCode(this.__budget_event);
		hash = 97 * hash + Objects.hashCode(this.__revenue_expected);
		hash = 97 * hash + Objects.hashCode(this.__num_people_invited);
		hash = 97 * hash + Objects.hashCode(this.__num_people_attended);
		hash = 97 * hash + Objects.hashCode(this.__cost_actual);
		hash = 97 * hash + Objects.hashCode(this.__revenue_actual);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_latest_activity);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__flag_locked);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_latest_followup);
		hash = 97 * hash + Objects.hashCode(this.__event_detailed_address);
		hash = 97 * hash + Objects.hashCode(this.__event_description);
		hash = 97 * hash + Objects.hashCode(this.__market_reaction_expected);
		hash = 97 * hash + Objects.hashCode(this.__memo);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmMarketingEvent o = (BaseCrmMarketingEvent)obj;
		if(!Objects.equals(this.__marketing_event_id, o.getMarketingEventId())) return false;
		if(!Objects.equals(this.__entity_type, o.getEntityType())) return false;
		if(!Objects.equals(this.__employee_id_responsible, o.getEmployeeIdResponsible())) return false;
		if(!Objects.equals(this.__event_name, o.getEventName())) return false;
		if(!Objects.equals(this.__event_status, o.getEventStatus())) return false;
		if(!Objects.equals(this.__event_type, o.getEventType())) return false;
		if(!Objects.equals(this.__date_start, o.getDateStart())) return false;
		if(!Objects.equals(this.__date_end, o.getDateEnd())) return false;
		if(!Objects.equals(this.__budget_event, o.getBudgetEvent())) return false;
		if(!Objects.equals(this.__revenue_expected, o.getRevenueExpected())) return false;
		if(!Objects.equals(this.__num_people_invited, o.getNumPeopleInvited())) return false;
		if(!Objects.equals(this.__num_people_attended, o.getNumPeopleAttended())) return false;
		if(!Objects.equals(this.__cost_actual, o.getCostActual())) return false;
		if(!Objects.equals(this.__revenue_actual, o.getRevenueActual())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_latest_activity, o.getDateLatestActivity())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__flag_locked, o.getFlagLocked())) return false;
		if(!Objects.equals(this.__employee_id_latest_followup, o.getEmployeeIdLatestFollowup())) return false;
		if(!Objects.equals(this.__event_detailed_address, o.getEventDetailedAddress())) return false;
		if(!Objects.equals(this.__event_description, o.getEventDescription())) return false;
		if(!Objects.equals(this.__market_reaction_expected, o.getMarketReactionExpected())) return false;
		if(!Objects.equals(this.__memo, o.getMemo())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getMarketingEventId() != null) sb.append(__wrapNumber(count++, "marketingEventId", getMarketingEventId()));
		if(getEntityType() != null) sb.append(__wrapNumber(count++, "entityType", getEntityType()));
		if(getEmployeeIdResponsible() != null) sb.append(__wrapNumber(count++, "employeeIdResponsible", getEmployeeIdResponsible()));
		if(getEventName() != null) sb.append(__wrapString(count++, "eventName", getEventName()));
		if(getEventStatus() != null) sb.append(__wrapNumber(count++, "eventStatus", getEventStatus()));
		if(getEventType() != null) sb.append(__wrapNumber(count++, "eventType", getEventType()));
		if(getDateStart() != null) sb.append(__wrapDate(count++, "dateStart", getDateStart()));
		if(getDateEnd() != null) sb.append(__wrapDate(count++, "dateEnd", getDateEnd()));
		if(getBudgetEvent() != null) sb.append(__wrapDecimal(count++, "budgetEvent", getBudgetEvent()));
		if(getRevenueExpected() != null) sb.append(__wrapDecimal(count++, "revenueExpected", getRevenueExpected()));
		if(getNumPeopleInvited() != null) sb.append(__wrapNumber(count++, "numPeopleInvited", getNumPeopleInvited()));
		if(getNumPeopleAttended() != null) sb.append(__wrapNumber(count++, "numPeopleAttended", getNumPeopleAttended()));
		if(getCostActual() != null) sb.append(__wrapDecimal(count++, "costActual", getCostActual()));
		if(getRevenueActual() != null) sb.append(__wrapString(count++, "revenueActual", getRevenueActual()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateLatestActivity() != null) sb.append(__wrapDate(count++, "dateLatestActivity", getDateLatestActivity()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getFlagLocked() != null) sb.append(__wrapBoolean(count++, "flagLocked", getFlagLocked()));
		if(getEmployeeIdLatestFollowup() != null) sb.append(__wrapNumber(count++, "employeeIdLatestFollowup", getEmployeeIdLatestFollowup()));
		if(getEventDetailedAddress() != null) sb.append(__wrapString(count++, "eventDetailedAddress", getEventDetailedAddress()));
		if(getEventDescription() != null) sb.append(__wrapString(count++, "eventDescription", getEventDescription()));
		if(getMarketReactionExpected() != null) sb.append(__wrapString(count++, "marketReactionExpected", getMarketReactionExpected()));
		if(getMemo() != null) sb.append(__wrapString(count++, "memo", getMemo()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getMarketingEventId() != null) res.put("marketingEventId", getMarketingEventId());
		if(getEntityType() != null) res.put("entityType", getEntityType());
		if(getEmployeeIdResponsible() != null) res.put("employeeIdResponsible", getEmployeeIdResponsible());
		if(getEventName() != null) res.put("eventName", getEventName());
		if(getEventStatus() != null) res.put("eventStatus", getEventStatus());
		if(getEventType() != null) res.put("eventType", getEventType());
		if(getDateStart() != null) res.put("dateStart", getDateStart());
		if(getDateEnd() != null) res.put("dateEnd", getDateEnd());
		if(getBudgetEvent() != null) res.put("budgetEvent", getBudgetEvent());
		if(getRevenueExpected() != null) res.put("revenueExpected", getRevenueExpected());
		if(getNumPeopleInvited() != null) res.put("numPeopleInvited", getNumPeopleInvited());
		if(getNumPeopleAttended() != null) res.put("numPeopleAttended", getNumPeopleAttended());
		if(getCostActual() != null) res.put("costActual", getCostActual());
		if(getRevenueActual() != null) res.put("revenueActual", getRevenueActual());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateLatestActivity() != null) res.put("dateLatestActivity", getDateLatestActivity());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getFlagLocked() != null) res.put("flagLocked", getFlagLocked());
		if(getEmployeeIdLatestFollowup() != null) res.put("employeeIdLatestFollowup", getEmployeeIdLatestFollowup());
		if(getEventDetailedAddress() != null) res.put("eventDetailedAddress", getEventDetailedAddress());
		if(getEventDescription() != null) res.put("eventDescription", getEventDescription());
		if(getMarketReactionExpected() != null) res.put("marketReactionExpected", getMarketReactionExpected());
		if(getMemo() != null) res.put("memo", getMemo());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("marketingEventId")) != null) setMarketingEventId(__getInt(val)); 
		if((val = values.get("entityType")) != null) setEntityType(__getInt(val)); 
		if((val = values.get("employeeIdResponsible")) != null) setEmployeeIdResponsible(__getInt(val)); 
		if((val = values.get("eventName")) != null) setEventName(__getString(val));
		if((val = values.get("eventStatus")) != null) setEventStatus(__getInt(val)); 
		if((val = values.get("eventType")) != null) setEventType(__getInt(val)); 
		if((val = values.get("dateStart")) != null) setDateStart(__getDate(val)); 
		if((val = values.get("dateEnd")) != null) setDateEnd(__getDate(val)); 
		if((val = values.get("budgetEvent")) != null) setBudgetEvent(__getDecimal(val));  
		if((val = values.get("revenueExpected")) != null) setRevenueExpected(__getDecimal(val));  
		if((val = values.get("numPeopleInvited")) != null) setNumPeopleInvited(__getInt(val)); 
		if((val = values.get("numPeopleAttended")) != null) setNumPeopleAttended(__getInt(val)); 
		if((val = values.get("costActual")) != null) setCostActual(__getDecimal(val));  
		if((val = values.get("revenueActual")) != null) setRevenueActual(__getString(val));
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateLatestActivity")) != null) setDateLatestActivity(__getDate(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("flagLocked")) != null) setFlagLocked(__getBoolean(val));
		if((val = values.get("employeeIdLatestFollowup")) != null) setEmployeeIdLatestFollowup(__getInt(val)); 
		if((val = values.get("eventDetailedAddress")) != null) setEventDetailedAddress(__getString(val));
		if((val = values.get("eventDescription")) != null) setEventDescription(__getString(val));
		if((val = values.get("marketReactionExpected")) != null) setMarketReactionExpected(__getString(val));
		if((val = values.get("memo")) != null) setMemo(__getString(val));
	}

	protected java.lang.Integer  __marketing_event_id ;
	protected java.lang.Integer  __entity_type ;
	protected java.lang.Integer  __employee_id_responsible ;
	protected java.lang.String  __event_name ;
	protected java.lang.Integer  __event_status ;
	protected java.lang.Integer  __event_type ;
	protected java.util.Date  __date_start ;
	protected java.util.Date  __date_end ;
	protected java.math.BigDecimal  __budget_event ;
	protected java.math.BigDecimal  __revenue_expected ;
	protected java.lang.Integer  __num_people_invited ;
	protected java.lang.Integer  __num_people_attended ;
	protected java.math.BigDecimal  __cost_actual ;
	protected java.lang.String  __revenue_actual ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_latest_activity ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Boolean  __flag_locked ;
	protected java.lang.Integer  __employee_id_latest_followup ;
	protected java.lang.String  __event_detailed_address ;
	protected java.lang.String  __event_description ;
	protected java.lang.String  __market_reaction_expected ;
	protected java.lang.String  __memo ;
}
