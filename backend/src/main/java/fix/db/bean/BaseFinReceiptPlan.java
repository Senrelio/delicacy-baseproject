package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseFinReceiptPlan extends GenericBase implements BaseFactory<BaseFinReceiptPlan>, Comparable<BaseFinReceiptPlan> 
{


	public static BaseFinReceiptPlan newInstance(){
		return new BaseFinReceiptPlan();
	}

	@Override
	public BaseFinReceiptPlan make(){
		BaseFinReceiptPlan b = new BaseFinReceiptPlan();
		return b;
	}

	public final static java.lang.String CS_RECEIPT_PLAN_ID = "receipt_plan_id" ;
	public final static java.lang.String CS_RECEIPT_PLAN_CODE = "receipt_plan_code" ;
	public final static java.lang.String CS_DATE_RECEIPTED_PLANNED = "date_receipted_planned" ;
	public final static java.lang.String CS_DATE_FIRST_RECEIPT = "date_first_receipt" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_DATE_LATEST_RECEIPT = "date_latest_receipt" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_CUSTOMER_ID = "customer_id" ;
	public final static java.lang.String CS_CONTRACT_ID = "contract_id" ;
	public final static java.lang.String CS_STAGE_RECEIPT = "stage_receipt" ;
	public final static java.lang.String CS_RECEIPT_NTH_TIME = "receipt_nth_time" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_PERCENTAGE_RECEIPT_PLANNED = "percentage_receipt_planned" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_AMOUNT_RECEIPT_PLANNED = "amount_receipt_planned" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_FLAG_OVERTIME = "flag_overtime" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_ORDER_ID = "order_id" ;

	public final static java.lang.String ALL_CAPTIONS = "收款计划编码,收款计划编号,计划收款日期,首次收款日期,维护人员工编码,最近收款日期,所属部门,客户编码,合同编码,收款阶段,第 n 次收款,创建人编码,计划收款比例,创建日期,计划收款金额,修改人编码,是否已逾期,修改日期,订单编码";

	public java.lang.Integer getReceiptPlanId() {
		return this.__receipt_plan_id;
	}

	public void setReceiptPlanId( java.lang.Integer value ) {
		this.__receipt_plan_id = value;
	}

	public java.lang.String getReceiptPlanCode() {
		return this.__receipt_plan_code;
	}

	public void setReceiptPlanCode( java.lang.String value ) {
		this.__receipt_plan_code = value;
	}

	public java.util.Date getDateReceiptedPlanned() {
		return this.__date_receipted_planned;
	}

	public void setDateReceiptedPlanned( java.util.Date value ) {
		this.__date_receipted_planned = value;
	}

	public java.util.Date getDateFirstReceipt() {
		return this.__date_first_receipt;
	}

	public void setDateFirstReceipt( java.util.Date value ) {
		this.__date_first_receipt = value;
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return this.__employee_id_maintainer;
	}

	public void setEmployeeIdMaintainer( java.lang.Integer value ) {
		this.__employee_id_maintainer = value;
	}

	public java.util.Date getDateLatestReceipt() {
		return this.__date_latest_receipt;
	}

	public void setDateLatestReceipt( java.util.Date value ) {
		this.__date_latest_receipt = value;
	}

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
	}

	public java.lang.Integer getCustomerId() {
		return this.__customer_id;
	}

	public void setCustomerId( java.lang.Integer value ) {
		this.__customer_id = value;
	}

	public java.lang.Integer getContractId() {
		return this.__contract_id;
	}

	public void setContractId( java.lang.Integer value ) {
		this.__contract_id = value;
	}

	public java.lang.Integer getStageReceipt() {
		return this.__stage_receipt;
	}

	public void setStageReceipt( java.lang.Integer value ) {
		this.__stage_receipt = value;
	}

	public java.lang.Integer getReceiptNthTime() {
		return this.__receipt_nth_time;
	}

	public void setReceiptNthTime( java.lang.Integer value ) {
		this.__receipt_nth_time = value;
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.Integer value ) {
		this.__employee_id_created = value;
	}

	public java.math.BigDecimal getPercentageReceiptPlanned() {
		return this.__percentage_receipt_planned;
	}

	public void setPercentageReceiptPlanned( java.math.BigDecimal value ) {
		this.__percentage_receipt_planned = value;
	}

	public java.util.Date getDateCreated() {
		return this.__date_created;
	}

	public void setDateCreated( java.util.Date value ) {
		this.__date_created = value;
	}

	public java.math.BigDecimal getAmountReceiptPlanned() {
		return this.__amount_receipt_planned;
	}

	public void setAmountReceiptPlanned( java.math.BigDecimal value ) {
		this.__amount_receipt_planned = value;
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return this.__employee_id_updated;
	}

	public void setEmployeeIdUpdated( java.lang.Integer value ) {
		this.__employee_id_updated = value;
	}

	public java.lang.Boolean getFlagOvertime() {
		return this.__flag_overtime;
	}

	public void setFlagOvertime( java.lang.Boolean value ) {
		this.__flag_overtime = value;
	}

	public java.util.Date getDateUpdated() {
		return this.__date_updated;
	}

	public void setDateUpdated( java.util.Date value ) {
		this.__date_updated = value;
	}

	public java.lang.Integer getOrderId() {
		return this.__order_id;
	}

	public void setOrderId( java.lang.Integer value ) {
		this.__order_id = value;
	}

	public void cloneCopy(BaseFinReceiptPlan __bean){
		__bean.setReceiptPlanId(getReceiptPlanId());
		__bean.setReceiptPlanCode(getReceiptPlanCode());
		__bean.setDateReceiptedPlanned(getDateReceiptedPlanned());
		__bean.setDateFirstReceipt(getDateFirstReceipt());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setDateLatestReceipt(getDateLatestReceipt());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setCustomerId(getCustomerId());
		__bean.setContractId(getContractId());
		__bean.setStageReceipt(getStageReceipt());
		__bean.setReceiptNthTime(getReceiptNthTime());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setPercentageReceiptPlanned(getPercentageReceiptPlanned());
		__bean.setDateCreated(getDateCreated());
		__bean.setAmountReceiptPlanned(getAmountReceiptPlanned());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setFlagOvertime(getFlagOvertime());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setOrderId(getOrderId());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getReceiptPlanId() == null ? "" : getReceiptPlanId());
		sb.append(",");
		sb.append(getReceiptPlanCode() == null ? "" : getReceiptPlanCode());
		sb.append(",");
		sb.append(getDateReceiptedPlanned() == null ? "" : sdf.format(getDateReceiptedPlanned()));
		sb.append(",");
		sb.append(getDateFirstReceipt() == null ? "" : sdf.format(getDateFirstReceipt()));
		sb.append(",");
		sb.append(getEmployeeIdMaintainer() == null ? "" : getEmployeeIdMaintainer());
		sb.append(",");
		sb.append(getDateLatestReceipt() == null ? "" : sdf.format(getDateLatestReceipt()));
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getCustomerId() == null ? "" : getCustomerId());
		sb.append(",");
		sb.append(getContractId() == null ? "" : getContractId());
		sb.append(",");
		sb.append(getStageReceipt() == null ? "" : getStageReceipt());
		sb.append(",");
		sb.append(getReceiptNthTime() == null ? "" : getReceiptNthTime());
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getPercentageReceiptPlanned() == null ? "" : getPercentageReceiptPlanned());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getAmountReceiptPlanned() == null ? "" : getAmountReceiptPlanned());
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getFlagOvertime() == null ? "" : getFlagOvertime());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getOrderId() == null ? "" : getOrderId());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseFinReceiptPlan o) {
		return __receipt_plan_id == null ? -1 : __receipt_plan_id.compareTo(o.getReceiptPlanId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__receipt_plan_id);
		hash = 97 * hash + Objects.hashCode(this.__receipt_plan_code);
		hash = 97 * hash + Objects.hashCode(this.__date_receipted_planned);
		hash = 97 * hash + Objects.hashCode(this.__date_first_receipt);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__date_latest_receipt);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__customer_id);
		hash = 97 * hash + Objects.hashCode(this.__contract_id);
		hash = 97 * hash + Objects.hashCode(this.__stage_receipt);
		hash = 97 * hash + Objects.hashCode(this.__receipt_nth_time);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__percentage_receipt_planned);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__amount_receipt_planned);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__flag_overtime);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__order_id);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseFinReceiptPlan o = (BaseFinReceiptPlan)obj;
		if(!Objects.equals(this.__receipt_plan_id, o.getReceiptPlanId())) return false;
		if(!Objects.equals(this.__receipt_plan_code, o.getReceiptPlanCode())) return false;
		if(!Objects.equals(this.__date_receipted_planned, o.getDateReceiptedPlanned())) return false;
		if(!Objects.equals(this.__date_first_receipt, o.getDateFirstReceipt())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__date_latest_receipt, o.getDateLatestReceipt())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__customer_id, o.getCustomerId())) return false;
		if(!Objects.equals(this.__contract_id, o.getContractId())) return false;
		if(!Objects.equals(this.__stage_receipt, o.getStageReceipt())) return false;
		if(!Objects.equals(this.__receipt_nth_time, o.getReceiptNthTime())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__percentage_receipt_planned, o.getPercentageReceiptPlanned())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__amount_receipt_planned, o.getAmountReceiptPlanned())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__flag_overtime, o.getFlagOvertime())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__order_id, o.getOrderId())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getReceiptPlanId() != null) sb.append(__wrapNumber(count++, "receiptPlanId", getReceiptPlanId()));
		if(getReceiptPlanCode() != null) sb.append(__wrapString(count++, "receiptPlanCode", getReceiptPlanCode()));
		if(getDateReceiptedPlanned() != null) sb.append(__wrapDate(count++, "dateReceiptedPlanned", getDateReceiptedPlanned()));
		if(getDateFirstReceipt() != null) sb.append(__wrapDate(count++, "dateFirstReceipt", getDateFirstReceipt()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapNumber(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getDateLatestReceipt() != null) sb.append(__wrapDate(count++, "dateLatestReceipt", getDateLatestReceipt()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getCustomerId() != null) sb.append(__wrapNumber(count++, "customerId", getCustomerId()));
		if(getContractId() != null) sb.append(__wrapNumber(count++, "contractId", getContractId()));
		if(getStageReceipt() != null) sb.append(__wrapNumber(count++, "stageReceipt", getStageReceipt()));
		if(getReceiptNthTime() != null) sb.append(__wrapNumber(count++, "receiptNthTime", getReceiptNthTime()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getPercentageReceiptPlanned() != null) sb.append(__wrapDecimal(count++, "percentageReceiptPlanned", getPercentageReceiptPlanned()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getAmountReceiptPlanned() != null) sb.append(__wrapDecimal(count++, "amountReceiptPlanned", getAmountReceiptPlanned()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getFlagOvertime() != null) sb.append(__wrapBoolean(count++, "flagOvertime", getFlagOvertime()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getOrderId() != null) sb.append(__wrapNumber(count++, "orderId", getOrderId()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getReceiptPlanId() != null) res.put("receiptPlanId", getReceiptPlanId());
		if(getReceiptPlanCode() != null) res.put("receiptPlanCode", getReceiptPlanCode());
		if(getDateReceiptedPlanned() != null) res.put("dateReceiptedPlanned", getDateReceiptedPlanned());
		if(getDateFirstReceipt() != null) res.put("dateFirstReceipt", getDateFirstReceipt());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getDateLatestReceipt() != null) res.put("dateLatestReceipt", getDateLatestReceipt());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getCustomerId() != null) res.put("customerId", getCustomerId());
		if(getContractId() != null) res.put("contractId", getContractId());
		if(getStageReceipt() != null) res.put("stageReceipt", getStageReceipt());
		if(getReceiptNthTime() != null) res.put("receiptNthTime", getReceiptNthTime());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getPercentageReceiptPlanned() != null) res.put("percentageReceiptPlanned", getPercentageReceiptPlanned());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getAmountReceiptPlanned() != null) res.put("amountReceiptPlanned", getAmountReceiptPlanned());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getFlagOvertime() != null) res.put("flagOvertime", getFlagOvertime());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getOrderId() != null) res.put("orderId", getOrderId());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("receiptPlanId")) != null) setReceiptPlanId(__getInt(val)); 
		if((val = values.get("receiptPlanCode")) != null) setReceiptPlanCode(__getString(val));
		if((val = values.get("dateReceiptedPlanned")) != null) setDateReceiptedPlanned(__getDate(val)); 
		if((val = values.get("dateFirstReceipt")) != null) setDateFirstReceipt(__getDate(val)); 
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getInt(val)); 
		if((val = values.get("dateLatestReceipt")) != null) setDateLatestReceipt(__getDate(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("customerId")) != null) setCustomerId(__getInt(val)); 
		if((val = values.get("contractId")) != null) setContractId(__getInt(val)); 
		if((val = values.get("stageReceipt")) != null) setStageReceipt(__getInt(val)); 
		if((val = values.get("receiptNthTime")) != null) setReceiptNthTime(__getInt(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("percentageReceiptPlanned")) != null) setPercentageReceiptPlanned(__getDecimal(val));  
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("amountReceiptPlanned")) != null) setAmountReceiptPlanned(__getDecimal(val));  
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("flagOvertime")) != null) setFlagOvertime(__getBoolean(val));
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("orderId")) != null) setOrderId(__getInt(val)); 
	}

	protected java.lang.Integer  __receipt_plan_id ;
	protected java.lang.String  __receipt_plan_code ;
	protected java.util.Date  __date_receipted_planned ;
	protected java.util.Date  __date_first_receipt ;
	protected java.lang.Integer  __employee_id_maintainer ;
	protected java.util.Date  __date_latest_receipt ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Integer  __customer_id ;
	protected java.lang.Integer  __contract_id ;
	protected java.lang.Integer  __stage_receipt ;
	protected java.lang.Integer  __receipt_nth_time ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.math.BigDecimal  __percentage_receipt_planned ;
	protected java.util.Date  __date_created ;
	protected java.math.BigDecimal  __amount_receipt_planned ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.lang.Boolean  __flag_overtime ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Integer  __order_id ;
}
