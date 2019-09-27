package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmOpportunity extends GenericBase implements BaseFactory<BaseCrmOpportunity>, Comparable<BaseCrmOpportunity> 
{


	public static BaseCrmOpportunity newInstance(){
		return new BaseCrmOpportunity();
	}

	@Override
	public BaseCrmOpportunity make(){
		BaseCrmOpportunity b = new BaseCrmOpportunity();
		return b;
	}

	public final static java.lang.String CS_OPPORTUNITY_ID = "opportunity_id" ;
	public final static java.lang.String CS_ENTITY_TYPE = "entity_type" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_OPPORTUNITY_NAME = "opportunity_name" ;
	public final static java.lang.String CS_CUSTOMER_ID = "customer_id" ;
	public final static java.lang.String CS_PRICE_LIST_ID = "price_list_id" ;
	public final static java.lang.String CS_OPPORTUNITY_TYPE = "opportunity_type" ;
	public final static java.lang.String CS_SALES_AMOUNT = "sales_amount" ;
	public final static java.lang.String CS_SALES_STAGE_ID = "sales_stage_id" ;
	public final static java.lang.String CS_SALES_STAGE_LOST_ID = "sales_stage_lost_id" ;
	public final static java.lang.String CS_WINRATE = "winrate" ;
	public final static java.lang.String CS_DESCRIPTION_LOST = "description_lost" ;
	public final static java.lang.String CS_REASON_LOST = "reason_lost" ;
	public final static java.lang.String CS_DATE_CLOSE_OPPORTUNITY = "date_close_opportunity" ;
	public final static java.lang.String CS_FLAG_PROMISED_BY_CUSTOMER = "flag_promised_by_customer" ;
	public final static java.lang.String CS_BUDGET_PROJECT = "budget_project" ;
	public final static java.lang.String CS_COST_ACTUAL = "cost_actual" ;
	public final static java.lang.String CS_DATE_STAGE_UPDATED = "date_stage_updated" ;
	public final static java.lang.String CS_DATE_LATEST_ACTIVITY = "date_latest_activity" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_FLAG_LOCKED = "flag_locked" ;
	public final static java.lang.String CS_LEAD_ID = "lead_id" ;
	public final static java.lang.String CS_MEMO = "memo" ;

	public final static java.lang.String ALL_CAPTIONS = "销售机会编码,主体类型,维护人员工编码,销售机会名称,客户编码,价格表编码,销售机会类型,销售金额,销售阶段编码,输单阶段编码,赢率,输单描述,输单原因,结单日期,是否已获得客户承诺,项目预算,实际花费,阶段更新时间,最近活动记录时间,创建日期,创建人编码,最近修改日,修改人编码,所属部门编码,是否被锁定,销售线索编码,备注";

	public java.lang.Integer getOpportunityId() {
		return this.__opportunity_id;
	}

	public void setOpportunityId( java.lang.Integer value ) {
		this.__opportunity_id = value;
	}

	public java.lang.Integer getEntityType() {
		return this.__entity_type;
	}

	public void setEntityType( java.lang.Integer value ) {
		this.__entity_type = value;
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return this.__employee_id_maintainer;
	}

	public void setEmployeeIdMaintainer( java.lang.Integer value ) {
		this.__employee_id_maintainer = value;
	}

	public java.lang.String getOpportunityName() {
		return this.__opportunity_name;
	}

	public void setOpportunityName( java.lang.String value ) {
		this.__opportunity_name = value;
	}

	public java.lang.Integer getCustomerId() {
		return this.__customer_id;
	}

	public void setCustomerId( java.lang.Integer value ) {
		this.__customer_id = value;
	}

	public java.lang.Integer getPriceListId() {
		return this.__price_list_id;
	}

	public void setPriceListId( java.lang.Integer value ) {
		this.__price_list_id = value;
	}

	public java.lang.Integer getOpportunityType() {
		return this.__opportunity_type;
	}

	public void setOpportunityType( java.lang.Integer value ) {
		this.__opportunity_type = value;
	}

	public java.math.BigDecimal getSalesAmount() {
		return this.__sales_amount;
	}

	public void setSalesAmount( java.math.BigDecimal value ) {
		this.__sales_amount = value;
	}

	public java.lang.Integer getSalesStageId() {
		return this.__sales_stage_id;
	}

	public void setSalesStageId( java.lang.Integer value ) {
		this.__sales_stage_id = value;
	}

	public java.lang.Integer getSalesStageLostId() {
		return this.__sales_stage_lost_id;
	}

	public void setSalesStageLostId( java.lang.Integer value ) {
		this.__sales_stage_lost_id = value;
	}

	public java.lang.Integer getWinrate() {
		return this.__winrate;
	}

	public void setWinrate( java.lang.Integer value ) {
		this.__winrate = value;
	}

	public java.lang.String getDescriptionLost() {
		return this.__description_lost;
	}

	public void setDescriptionLost( java.lang.String value ) {
		this.__description_lost = value;
	}

	public java.lang.Integer getReasonLost() {
		return this.__reason_lost;
	}

	public void setReasonLost( java.lang.Integer value ) {
		this.__reason_lost = value;
	}

	public java.util.Date getDateCloseOpportunity() {
		return this.__date_close_opportunity;
	}

	public void setDateCloseOpportunity( java.util.Date value ) {
		this.__date_close_opportunity = value;
	}

	public java.lang.Integer getFlagPromisedByCustomer() {
		return this.__flag_promised_by_customer;
	}

	public void setFlagPromisedByCustomer( java.lang.Integer value ) {
		this.__flag_promised_by_customer = value;
	}

	public java.math.BigDecimal getBudgetProject() {
		return this.__budget_project;
	}

	public void setBudgetProject( java.math.BigDecimal value ) {
		this.__budget_project = value;
	}

	public java.math.BigDecimal getCostActual() {
		return this.__cost_actual;
	}

	public void setCostActual( java.math.BigDecimal value ) {
		this.__cost_actual = value;
	}

	public java.util.Date getDateStageUpdated() {
		return this.__date_stage_updated;
	}

	public void setDateStageUpdated( java.util.Date value ) {
		this.__date_stage_updated = value;
	}

	public java.util.Date getDateLatestActivity() {
		return this.__date_latest_activity;
	}

	public void setDateLatestActivity( java.util.Date value ) {
		this.__date_latest_activity = value;
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

	public java.lang.Integer getLeadId() {
		return this.__lead_id;
	}

	public void setLeadId( java.lang.Integer value ) {
		this.__lead_id = value;
	}

	public java.lang.String getMemo() {
		return this.__memo;
	}

	public void setMemo( java.lang.String value ) {
		this.__memo = value;
	}

	public void cloneCopy(BaseCrmOpportunity __bean){
		__bean.setOpportunityId(getOpportunityId());
		__bean.setEntityType(getEntityType());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setOpportunityName(getOpportunityName());
		__bean.setCustomerId(getCustomerId());
		__bean.setPriceListId(getPriceListId());
		__bean.setOpportunityType(getOpportunityType());
		__bean.setSalesAmount(getSalesAmount());
		__bean.setSalesStageId(getSalesStageId());
		__bean.setSalesStageLostId(getSalesStageLostId());
		__bean.setWinrate(getWinrate());
		__bean.setDescriptionLost(getDescriptionLost());
		__bean.setReasonLost(getReasonLost());
		__bean.setDateCloseOpportunity(getDateCloseOpportunity());
		__bean.setFlagPromisedByCustomer(getFlagPromisedByCustomer());
		__bean.setBudgetProject(getBudgetProject());
		__bean.setCostActual(getCostActual());
		__bean.setDateStageUpdated(getDateStageUpdated());
		__bean.setDateLatestActivity(getDateLatestActivity());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setFlagLocked(getFlagLocked());
		__bean.setLeadId(getLeadId());
		__bean.setMemo(getMemo());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getOpportunityId() == null ? "" : getOpportunityId());
		sb.append(",");
		sb.append(getEntityType() == null ? "" : getEntityType());
		sb.append(",");
		sb.append(getEmployeeIdMaintainer() == null ? "" : getEmployeeIdMaintainer());
		sb.append(",");
		sb.append(getOpportunityName() == null ? "" : getOpportunityName());
		sb.append(",");
		sb.append(getCustomerId() == null ? "" : getCustomerId());
		sb.append(",");
		sb.append(getPriceListId() == null ? "" : getPriceListId());
		sb.append(",");
		sb.append(getOpportunityType() == null ? "" : getOpportunityType());
		sb.append(",");
		sb.append(getSalesAmount() == null ? "" : getSalesAmount());
		sb.append(",");
		sb.append(getSalesStageId() == null ? "" : getSalesStageId());
		sb.append(",");
		sb.append(getSalesStageLostId() == null ? "" : getSalesStageLostId());
		sb.append(",");
		sb.append(getWinrate() == null ? "" : getWinrate());
		sb.append(",");
		sb.append(getDescriptionLost() == null ? "" : getDescriptionLost());
		sb.append(",");
		sb.append(getReasonLost() == null ? "" : getReasonLost());
		sb.append(",");
		sb.append(getDateCloseOpportunity() == null ? "" : sdf.format(getDateCloseOpportunity()));
		sb.append(",");
		sb.append(getFlagPromisedByCustomer() == null ? "" : getFlagPromisedByCustomer());
		sb.append(",");
		sb.append(getBudgetProject() == null ? "" : getBudgetProject());
		sb.append(",");
		sb.append(getCostActual() == null ? "" : getCostActual());
		sb.append(",");
		sb.append(getDateStageUpdated() == null ? "" : sdf.format(getDateStageUpdated()));
		sb.append(",");
		sb.append(getDateLatestActivity() == null ? "" : sdf.format(getDateLatestActivity()));
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
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
		sb.append(getLeadId() == null ? "" : getLeadId());
		sb.append(",");
		sb.append(getMemo() == null ? "" : getMemo());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmOpportunity o) {
		return __opportunity_id == null ? -1 : __opportunity_id.compareTo(o.getOpportunityId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__opportunity_id);
		hash = 97 * hash + Objects.hashCode(this.__entity_type);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__opportunity_name);
		hash = 97 * hash + Objects.hashCode(this.__customer_id);
		hash = 97 * hash + Objects.hashCode(this.__price_list_id);
		hash = 97 * hash + Objects.hashCode(this.__opportunity_type);
		hash = 97 * hash + Objects.hashCode(this.__sales_amount);
		hash = 97 * hash + Objects.hashCode(this.__sales_stage_id);
		hash = 97 * hash + Objects.hashCode(this.__sales_stage_lost_id);
		hash = 97 * hash + Objects.hashCode(this.__winrate);
		hash = 97 * hash + Objects.hashCode(this.__description_lost);
		hash = 97 * hash + Objects.hashCode(this.__reason_lost);
		hash = 97 * hash + Objects.hashCode(this.__date_close_opportunity);
		hash = 97 * hash + Objects.hashCode(this.__flag_promised_by_customer);
		hash = 97 * hash + Objects.hashCode(this.__budget_project);
		hash = 97 * hash + Objects.hashCode(this.__cost_actual);
		hash = 97 * hash + Objects.hashCode(this.__date_stage_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_latest_activity);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__flag_locked);
		hash = 97 * hash + Objects.hashCode(this.__lead_id);
		hash = 97 * hash + Objects.hashCode(this.__memo);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmOpportunity o = (BaseCrmOpportunity)obj;
		if(!Objects.equals(this.__opportunity_id, o.getOpportunityId())) return false;
		if(!Objects.equals(this.__entity_type, o.getEntityType())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__opportunity_name, o.getOpportunityName())) return false;
		if(!Objects.equals(this.__customer_id, o.getCustomerId())) return false;
		if(!Objects.equals(this.__price_list_id, o.getPriceListId())) return false;
		if(!Objects.equals(this.__opportunity_type, o.getOpportunityType())) return false;
		if(!Objects.equals(this.__sales_amount, o.getSalesAmount())) return false;
		if(!Objects.equals(this.__sales_stage_id, o.getSalesStageId())) return false;
		if(!Objects.equals(this.__sales_stage_lost_id, o.getSalesStageLostId())) return false;
		if(!Objects.equals(this.__winrate, o.getWinrate())) return false;
		if(!Objects.equals(this.__description_lost, o.getDescriptionLost())) return false;
		if(!Objects.equals(this.__reason_lost, o.getReasonLost())) return false;
		if(!Objects.equals(this.__date_close_opportunity, o.getDateCloseOpportunity())) return false;
		if(!Objects.equals(this.__flag_promised_by_customer, o.getFlagPromisedByCustomer())) return false;
		if(!Objects.equals(this.__budget_project, o.getBudgetProject())) return false;
		if(!Objects.equals(this.__cost_actual, o.getCostActual())) return false;
		if(!Objects.equals(this.__date_stage_updated, o.getDateStageUpdated())) return false;
		if(!Objects.equals(this.__date_latest_activity, o.getDateLatestActivity())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__flag_locked, o.getFlagLocked())) return false;
		if(!Objects.equals(this.__lead_id, o.getLeadId())) return false;
		if(!Objects.equals(this.__memo, o.getMemo())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getOpportunityId() != null) sb.append(__wrapNumber(count++, "opportunityId", getOpportunityId()));
		if(getEntityType() != null) sb.append(__wrapNumber(count++, "entityType", getEntityType()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapNumber(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getOpportunityName() != null) sb.append(__wrapString(count++, "opportunityName", getOpportunityName()));
		if(getCustomerId() != null) sb.append(__wrapNumber(count++, "customerId", getCustomerId()));
		if(getPriceListId() != null) sb.append(__wrapNumber(count++, "priceListId", getPriceListId()));
		if(getOpportunityType() != null) sb.append(__wrapNumber(count++, "opportunityType", getOpportunityType()));
		if(getSalesAmount() != null) sb.append(__wrapDecimal(count++, "salesAmount", getSalesAmount()));
		if(getSalesStageId() != null) sb.append(__wrapNumber(count++, "salesStageId", getSalesStageId()));
		if(getSalesStageLostId() != null) sb.append(__wrapNumber(count++, "salesStageLostId", getSalesStageLostId()));
		if(getWinrate() != null) sb.append(__wrapNumber(count++, "winrate", getWinrate()));
		if(getDescriptionLost() != null) sb.append(__wrapString(count++, "descriptionLost", getDescriptionLost()));
		if(getReasonLost() != null) sb.append(__wrapNumber(count++, "reasonLost", getReasonLost()));
		if(getDateCloseOpportunity() != null) sb.append(__wrapDate(count++, "dateCloseOpportunity", getDateCloseOpportunity()));
		if(getFlagPromisedByCustomer() != null) sb.append(__wrapNumber(count++, "flagPromisedByCustomer", getFlagPromisedByCustomer()));
		if(getBudgetProject() != null) sb.append(__wrapDecimal(count++, "budgetProject", getBudgetProject()));
		if(getCostActual() != null) sb.append(__wrapDecimal(count++, "costActual", getCostActual()));
		if(getDateStageUpdated() != null) sb.append(__wrapDate(count++, "dateStageUpdated", getDateStageUpdated()));
		if(getDateLatestActivity() != null) sb.append(__wrapDate(count++, "dateLatestActivity", getDateLatestActivity()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getFlagLocked() != null) sb.append(__wrapBoolean(count++, "flagLocked", getFlagLocked()));
		if(getLeadId() != null) sb.append(__wrapNumber(count++, "leadId", getLeadId()));
		if(getMemo() != null) sb.append(__wrapString(count++, "memo", getMemo()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getOpportunityId() != null) res.put("opportunityId", getOpportunityId());
		if(getEntityType() != null) res.put("entityType", getEntityType());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getOpportunityName() != null) res.put("opportunityName", getOpportunityName());
		if(getCustomerId() != null) res.put("customerId", getCustomerId());
		if(getPriceListId() != null) res.put("priceListId", getPriceListId());
		if(getOpportunityType() != null) res.put("opportunityType", getOpportunityType());
		if(getSalesAmount() != null) res.put("salesAmount", getSalesAmount());
		if(getSalesStageId() != null) res.put("salesStageId", getSalesStageId());
		if(getSalesStageLostId() != null) res.put("salesStageLostId", getSalesStageLostId());
		if(getWinrate() != null) res.put("winrate", getWinrate());
		if(getDescriptionLost() != null) res.put("descriptionLost", getDescriptionLost());
		if(getReasonLost() != null) res.put("reasonLost", getReasonLost());
		if(getDateCloseOpportunity() != null) res.put("dateCloseOpportunity", getDateCloseOpportunity());
		if(getFlagPromisedByCustomer() != null) res.put("flagPromisedByCustomer", getFlagPromisedByCustomer());
		if(getBudgetProject() != null) res.put("budgetProject", getBudgetProject());
		if(getCostActual() != null) res.put("costActual", getCostActual());
		if(getDateStageUpdated() != null) res.put("dateStageUpdated", getDateStageUpdated());
		if(getDateLatestActivity() != null) res.put("dateLatestActivity", getDateLatestActivity());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getFlagLocked() != null) res.put("flagLocked", getFlagLocked());
		if(getLeadId() != null) res.put("leadId", getLeadId());
		if(getMemo() != null) res.put("memo", getMemo());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("opportunityId")) != null) setOpportunityId(__getInt(val)); 
		if((val = values.get("entityType")) != null) setEntityType(__getInt(val)); 
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getInt(val)); 
		if((val = values.get("opportunityName")) != null) setOpportunityName(__getString(val));
		if((val = values.get("customerId")) != null) setCustomerId(__getInt(val)); 
		if((val = values.get("priceListId")) != null) setPriceListId(__getInt(val)); 
		if((val = values.get("opportunityType")) != null) setOpportunityType(__getInt(val)); 
		if((val = values.get("salesAmount")) != null) setSalesAmount(__getDecimal(val));  
		if((val = values.get("salesStageId")) != null) setSalesStageId(__getInt(val)); 
		if((val = values.get("salesStageLostId")) != null) setSalesStageLostId(__getInt(val)); 
		if((val = values.get("winrate")) != null) setWinrate(__getInt(val)); 
		if((val = values.get("descriptionLost")) != null) setDescriptionLost(__getString(val));
		if((val = values.get("reasonLost")) != null) setReasonLost(__getInt(val)); 
		if((val = values.get("dateCloseOpportunity")) != null) setDateCloseOpportunity(__getDate(val)); 
		if((val = values.get("flagPromisedByCustomer")) != null) setFlagPromisedByCustomer(__getInt(val)); 
		if((val = values.get("budgetProject")) != null) setBudgetProject(__getDecimal(val));  
		if((val = values.get("costActual")) != null) setCostActual(__getDecimal(val));  
		if((val = values.get("dateStageUpdated")) != null) setDateStageUpdated(__getDate(val)); 
		if((val = values.get("dateLatestActivity")) != null) setDateLatestActivity(__getDate(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("flagLocked")) != null) setFlagLocked(__getBoolean(val));
		if((val = values.get("leadId")) != null) setLeadId(__getInt(val)); 
		if((val = values.get("memo")) != null) setMemo(__getString(val));
	}

	protected java.lang.Integer  __opportunity_id ;
	protected java.lang.Integer  __entity_type ;
	protected java.lang.Integer  __employee_id_maintainer ;
	protected java.lang.String  __opportunity_name ;
	protected java.lang.Integer  __customer_id ;
	protected java.lang.Integer  __price_list_id ;
	protected java.lang.Integer  __opportunity_type ;
	protected java.math.BigDecimal  __sales_amount ;
	protected java.lang.Integer  __sales_stage_id ;
	protected java.lang.Integer  __sales_stage_lost_id ;
	protected java.lang.Integer  __winrate ;
	protected java.lang.String  __description_lost ;
	protected java.lang.Integer  __reason_lost ;
	protected java.util.Date  __date_close_opportunity ;
	protected java.lang.Integer  __flag_promised_by_customer ;
	protected java.math.BigDecimal  __budget_project ;
	protected java.math.BigDecimal  __cost_actual ;
	protected java.util.Date  __date_stage_updated ;
	protected java.util.Date  __date_latest_activity ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Boolean  __flag_locked ;
	protected java.lang.Integer  __lead_id ;
	protected java.lang.String  __memo ;
}
