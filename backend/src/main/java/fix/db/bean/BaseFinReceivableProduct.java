package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseFinReceivableProduct extends GenericBase implements BaseFactory<BaseFinReceivableProduct>, Comparable<BaseFinReceivableProduct> 
{


	public static BaseFinReceivableProduct newInstance(){
		return new BaseFinReceivableProduct();
	}

	@Override
	public BaseFinReceivableProduct make(){
		BaseFinReceivableProduct b = new BaseFinReceivableProduct();
		return b;
	}

	public final static java.lang.String CS_RECEIVABLE_PRODUCT_ID = "receivable_product_id" ;
	public final static java.lang.String CS_RECEIVABLE_ID = "receivable_id" ;
	public final static java.lang.String CS_ENTITY_TYPE = "entity_type" ;
	public final static java.lang.String CS_ORDER_ID = "order_id" ;
	public final static java.lang.String CS_ORDER_PRODUCT_ID = "order_product_id" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_PRODUCT_ID = "product_id" ;
	public final static java.lang.String CS_AMOUNT_RECEIVABLE = "amount_receivable" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_DUE_RECEIPT = "date_due_receipt" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_FLAG_OVERTIME = "flag_overtime" ;
	public final static java.lang.String CS_CONTRACT_ID = "contract_id" ;
	public final static java.lang.String CS_RECEIPT_PLAN_ID = "receipt_plan_id" ;

	public final static java.lang.String ALL_CAPTIONS = "应收单产品明细编码,应收单编码,主体类型,订单编码,订单-<产品编码,所属部门,产品编码,应收金额,创建人编码,创建日期,修改人编码,收款截止日期,修改日期,是否已预期,合同编码,收款计划编码";

	public java.lang.Integer getReceivableProductId() {
		return this.__receivable_product_id;
	}

	public void setReceivableProductId( java.lang.Integer value ) {
		this.__receivable_product_id = value;
	}

	public java.lang.Integer getReceivableId() {
		return this.__receivable_id;
	}

	public void setReceivableId( java.lang.Integer value ) {
		this.__receivable_id = value;
	}

	public java.lang.Integer getEntityType() {
		return this.__entity_type;
	}

	public void setEntityType( java.lang.Integer value ) {
		this.__entity_type = value;
	}

	public java.lang.Integer getOrderId() {
		return this.__order_id;
	}

	public void setOrderId( java.lang.Integer value ) {
		this.__order_id = value;
	}

	public java.lang.Integer getOrderProductId() {
		return this.__order_product_id;
	}

	public void setOrderProductId( java.lang.Integer value ) {
		this.__order_product_id = value;
	}

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
	}

	public java.lang.Integer getProductId() {
		return this.__product_id;
	}

	public void setProductId( java.lang.Integer value ) {
		this.__product_id = value;
	}

	public java.math.BigDecimal getAmountReceivable() {
		return this.__amount_receivable;
	}

	public void setAmountReceivable( java.math.BigDecimal value ) {
		this.__amount_receivable = value;
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

	public java.lang.Integer getEmployeeIdUpdated() {
		return this.__employee_id_updated;
	}

	public void setEmployeeIdUpdated( java.lang.Integer value ) {
		this.__employee_id_updated = value;
	}

	public java.util.Date getDateDueReceipt() {
		return this.__date_due_receipt;
	}

	public void setDateDueReceipt( java.util.Date value ) {
		this.__date_due_receipt = value;
	}

	public java.util.Date getDateUpdated() {
		return this.__date_updated;
	}

	public void setDateUpdated( java.util.Date value ) {
		this.__date_updated = value;
	}

	public java.lang.Boolean getFlagOvertime() {
		return this.__flag_overtime;
	}

	public void setFlagOvertime( java.lang.Boolean value ) {
		this.__flag_overtime = value;
	}

	public java.lang.Integer getContractId() {
		return this.__contract_id;
	}

	public void setContractId( java.lang.Integer value ) {
		this.__contract_id = value;
	}

	public java.lang.Integer getReceiptPlanId() {
		return this.__receipt_plan_id;
	}

	public void setReceiptPlanId( java.lang.Integer value ) {
		this.__receipt_plan_id = value;
	}

	public void cloneCopy(BaseFinReceivableProduct __bean){
		__bean.setReceivableProductId(getReceivableProductId());
		__bean.setReceivableId(getReceivableId());
		__bean.setEntityType(getEntityType());
		__bean.setOrderId(getOrderId());
		__bean.setOrderProductId(getOrderProductId());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setProductId(getProductId());
		__bean.setAmountReceivable(getAmountReceivable());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateDueReceipt(getDateDueReceipt());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setFlagOvertime(getFlagOvertime());
		__bean.setContractId(getContractId());
		__bean.setReceiptPlanId(getReceiptPlanId());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getReceivableProductId() == null ? "" : getReceivableProductId());
		sb.append(",");
		sb.append(getReceivableId() == null ? "" : getReceivableId());
		sb.append(",");
		sb.append(getEntityType() == null ? "" : getEntityType());
		sb.append(",");
		sb.append(getOrderId() == null ? "" : getOrderId());
		sb.append(",");
		sb.append(getOrderProductId() == null ? "" : getOrderProductId());
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getProductId() == null ? "" : getProductId());
		sb.append(",");
		sb.append(getAmountReceivable() == null ? "" : getAmountReceivable());
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getDateDueReceipt() == null ? "" : sdf.format(getDateDueReceipt()));
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getFlagOvertime() == null ? "" : getFlagOvertime());
		sb.append(",");
		sb.append(getContractId() == null ? "" : getContractId());
		sb.append(",");
		sb.append(getReceiptPlanId() == null ? "" : getReceiptPlanId());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseFinReceivableProduct o) {
		return __receivable_product_id == null ? -1 : __receivable_product_id.compareTo(o.getReceivableProductId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__receivable_product_id);
		hash = 97 * hash + Objects.hashCode(this.__receivable_id);
		hash = 97 * hash + Objects.hashCode(this.__entity_type);
		hash = 97 * hash + Objects.hashCode(this.__order_id);
		hash = 97 * hash + Objects.hashCode(this.__order_product_id);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__product_id);
		hash = 97 * hash + Objects.hashCode(this.__amount_receivable);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_due_receipt);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__flag_overtime);
		hash = 97 * hash + Objects.hashCode(this.__contract_id);
		hash = 97 * hash + Objects.hashCode(this.__receipt_plan_id);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseFinReceivableProduct o = (BaseFinReceivableProduct)obj;
		if(!Objects.equals(this.__receivable_product_id, o.getReceivableProductId())) return false;
		if(!Objects.equals(this.__receivable_id, o.getReceivableId())) return false;
		if(!Objects.equals(this.__entity_type, o.getEntityType())) return false;
		if(!Objects.equals(this.__order_id, o.getOrderId())) return false;
		if(!Objects.equals(this.__order_product_id, o.getOrderProductId())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__product_id, o.getProductId())) return false;
		if(!Objects.equals(this.__amount_receivable, o.getAmountReceivable())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_due_receipt, o.getDateDueReceipt())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__flag_overtime, o.getFlagOvertime())) return false;
		if(!Objects.equals(this.__contract_id, o.getContractId())) return false;
		if(!Objects.equals(this.__receipt_plan_id, o.getReceiptPlanId())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getReceivableProductId() != null) sb.append(__wrapNumber(count++, "receivableProductId", getReceivableProductId()));
		if(getReceivableId() != null) sb.append(__wrapNumber(count++, "receivableId", getReceivableId()));
		if(getEntityType() != null) sb.append(__wrapNumber(count++, "entityType", getEntityType()));
		if(getOrderId() != null) sb.append(__wrapNumber(count++, "orderId", getOrderId()));
		if(getOrderProductId() != null) sb.append(__wrapNumber(count++, "orderProductId", getOrderProductId()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getProductId() != null) sb.append(__wrapNumber(count++, "productId", getProductId()));
		if(getAmountReceivable() != null) sb.append(__wrapDecimal(count++, "amountReceivable", getAmountReceivable()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateDueReceipt() != null) sb.append(__wrapDate(count++, "dateDueReceipt", getDateDueReceipt()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getFlagOvertime() != null) sb.append(__wrapBoolean(count++, "flagOvertime", getFlagOvertime()));
		if(getContractId() != null) sb.append(__wrapNumber(count++, "contractId", getContractId()));
		if(getReceiptPlanId() != null) sb.append(__wrapNumber(count++, "receiptPlanId", getReceiptPlanId()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getReceivableProductId() != null) res.put("receivableProductId", getReceivableProductId());
		if(getReceivableId() != null) res.put("receivableId", getReceivableId());
		if(getEntityType() != null) res.put("entityType", getEntityType());
		if(getOrderId() != null) res.put("orderId", getOrderId());
		if(getOrderProductId() != null) res.put("orderProductId", getOrderProductId());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getProductId() != null) res.put("productId", getProductId());
		if(getAmountReceivable() != null) res.put("amountReceivable", getAmountReceivable());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateDueReceipt() != null) res.put("dateDueReceipt", getDateDueReceipt());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getFlagOvertime() != null) res.put("flagOvertime", getFlagOvertime());
		if(getContractId() != null) res.put("contractId", getContractId());
		if(getReceiptPlanId() != null) res.put("receiptPlanId", getReceiptPlanId());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("receivableProductId")) != null) setReceivableProductId(__getInt(val)); 
		if((val = values.get("receivableId")) != null) setReceivableId(__getInt(val)); 
		if((val = values.get("entityType")) != null) setEntityType(__getInt(val)); 
		if((val = values.get("orderId")) != null) setOrderId(__getInt(val)); 
		if((val = values.get("orderProductId")) != null) setOrderProductId(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("productId")) != null) setProductId(__getInt(val)); 
		if((val = values.get("amountReceivable")) != null) setAmountReceivable(__getDecimal(val));  
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("dateDueReceipt")) != null) setDateDueReceipt(__getDate(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("flagOvertime")) != null) setFlagOvertime(__getBoolean(val));
		if((val = values.get("contractId")) != null) setContractId(__getInt(val)); 
		if((val = values.get("receiptPlanId")) != null) setReceiptPlanId(__getInt(val)); 
	}

	protected java.lang.Integer  __receivable_product_id ;
	protected java.lang.Integer  __receivable_id ;
	protected java.lang.Integer  __entity_type ;
	protected java.lang.Integer  __order_id ;
	protected java.lang.Integer  __order_product_id ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Integer  __product_id ;
	protected java.math.BigDecimal  __amount_receivable ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.util.Date  __date_due_receipt ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Boolean  __flag_overtime ;
	protected java.lang.Integer  __contract_id ;
	protected java.lang.Integer  __receipt_plan_id ;
}
