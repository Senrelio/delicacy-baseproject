package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseFinInvoiceReceivable extends GenericBase implements BaseFactory<BaseFinInvoiceReceivable>, Comparable<BaseFinInvoiceReceivable> 
{


	public static BaseFinInvoiceReceivable newInstance(){
		return new BaseFinInvoiceReceivable();
	}

	@Override
	public BaseFinInvoiceReceivable make(){
		BaseFinInvoiceReceivable b = new BaseFinInvoiceReceivable();
		return b;
	}

	public final static java.lang.String CS_INVOICE_RECEIVABLE_ID = "invoice_receivable_id" ;
	public final static java.lang.String CS_INVOICE_RECEIVABLE_CODE = "invoice_receivable_code" ;
	public final static java.lang.String CS_INVOICE_ID = "invoice_id" ;
	public final static java.lang.String CS_ORDER_ID = "order_id" ;
	public final static java.lang.String CS_ORDER_PRODUCT_ID = "order_product_id" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_RECEIVABLE_ID = "receivable_id" ;
	public final static java.lang.String CS_RECEIVABLE_PRODUCT_ID = "receivable_product_id" ;
	public final static java.lang.String CS_PRODUCT_ID = "product_id" ;
	public final static java.lang.String CS_AMOUNT_INVOICE_RECEIVABLE = "amount_invoice_receivable" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_ISSUED = "date_issued" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_CONTRACT_ID = "contract_id" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_RECEIPT_PLAN_ID = "receipt_plan_id" ;

	public final static java.lang.String ALL_CAPTIONS = "发票-<应收单明细编码,发票-<应收单明细编号,发票编码,订单编码,订单-<产品明细编码,所属部门,应收单编码,应收单-<产品编码,产品编码,发票明细金额,创建人编码,发票明细日期,创建日期,修改人编码,合同编码,修改日期,收款计划编码";

	public java.lang.Integer getInvoiceReceivableId() {
		return this.__invoice_receivable_id;
	}

	public void setInvoiceReceivableId( java.lang.Integer value ) {
		this.__invoice_receivable_id = value;
	}

	public java.lang.Integer getInvoiceReceivableCode() {
		return this.__invoice_receivable_code;
	}

	public void setInvoiceReceivableCode( java.lang.Integer value ) {
		this.__invoice_receivable_code = value;
	}

	public java.lang.Integer getInvoiceId() {
		return this.__invoice_id;
	}

	public void setInvoiceId( java.lang.Integer value ) {
		this.__invoice_id = value;
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

	public java.lang.Integer getReceivableId() {
		return this.__receivable_id;
	}

	public void setReceivableId( java.lang.Integer value ) {
		this.__receivable_id = value;
	}

	public java.lang.Integer getReceivableProductId() {
		return this.__receivable_product_id;
	}

	public void setReceivableProductId( java.lang.Integer value ) {
		this.__receivable_product_id = value;
	}

	public java.lang.Integer getProductId() {
		return this.__product_id;
	}

	public void setProductId( java.lang.Integer value ) {
		this.__product_id = value;
	}

	public java.math.BigDecimal getAmountInvoiceReceivable() {
		return this.__amount_invoice_receivable;
	}

	public void setAmountInvoiceReceivable( java.math.BigDecimal value ) {
		this.__amount_invoice_receivable = value;
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.Integer value ) {
		this.__employee_id_created = value;
	}

	public java.util.Date getDateIssued() {
		return this.__date_issued;
	}

	public void setDateIssued( java.util.Date value ) {
		this.__date_issued = value;
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

	public java.lang.Integer getContractId() {
		return this.__contract_id;
	}

	public void setContractId( java.lang.Integer value ) {
		this.__contract_id = value;
	}

	public java.util.Date getDateUpdated() {
		return this.__date_updated;
	}

	public void setDateUpdated( java.util.Date value ) {
		this.__date_updated = value;
	}

	public java.lang.Integer getReceiptPlanId() {
		return this.__receipt_plan_id;
	}

	public void setReceiptPlanId( java.lang.Integer value ) {
		this.__receipt_plan_id = value;
	}

	public void cloneCopy(BaseFinInvoiceReceivable __bean){
		__bean.setInvoiceReceivableId(getInvoiceReceivableId());
		__bean.setInvoiceReceivableCode(getInvoiceReceivableCode());
		__bean.setInvoiceId(getInvoiceId());
		__bean.setOrderId(getOrderId());
		__bean.setOrderProductId(getOrderProductId());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setReceivableId(getReceivableId());
		__bean.setReceivableProductId(getReceivableProductId());
		__bean.setProductId(getProductId());
		__bean.setAmountInvoiceReceivable(getAmountInvoiceReceivable());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateIssued(getDateIssued());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setContractId(getContractId());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setReceiptPlanId(getReceiptPlanId());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getInvoiceReceivableId() == null ? "" : getInvoiceReceivableId());
		sb.append(",");
		sb.append(getInvoiceReceivableCode() == null ? "" : getInvoiceReceivableCode());
		sb.append(",");
		sb.append(getInvoiceId() == null ? "" : getInvoiceId());
		sb.append(",");
		sb.append(getOrderId() == null ? "" : getOrderId());
		sb.append(",");
		sb.append(getOrderProductId() == null ? "" : getOrderProductId());
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getReceivableId() == null ? "" : getReceivableId());
		sb.append(",");
		sb.append(getReceivableProductId() == null ? "" : getReceivableProductId());
		sb.append(",");
		sb.append(getProductId() == null ? "" : getProductId());
		sb.append(",");
		sb.append(getAmountInvoiceReceivable() == null ? "" : getAmountInvoiceReceivable());
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getDateIssued() == null ? "" : sdf.format(getDateIssued()));
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getContractId() == null ? "" : getContractId());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getReceiptPlanId() == null ? "" : getReceiptPlanId());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseFinInvoiceReceivable o) {
		return __invoice_receivable_id == null ? -1 : __invoice_receivable_id.compareTo(o.getInvoiceReceivableId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__invoice_receivable_id);
		hash = 97 * hash + Objects.hashCode(this.__invoice_receivable_code);
		hash = 97 * hash + Objects.hashCode(this.__invoice_id);
		hash = 97 * hash + Objects.hashCode(this.__order_id);
		hash = 97 * hash + Objects.hashCode(this.__order_product_id);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__receivable_id);
		hash = 97 * hash + Objects.hashCode(this.__receivable_product_id);
		hash = 97 * hash + Objects.hashCode(this.__product_id);
		hash = 97 * hash + Objects.hashCode(this.__amount_invoice_receivable);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_issued);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__contract_id);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__receipt_plan_id);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseFinInvoiceReceivable o = (BaseFinInvoiceReceivable)obj;
		if(!Objects.equals(this.__invoice_receivable_id, o.getInvoiceReceivableId())) return false;
		if(!Objects.equals(this.__invoice_receivable_code, o.getInvoiceReceivableCode())) return false;
		if(!Objects.equals(this.__invoice_id, o.getInvoiceId())) return false;
		if(!Objects.equals(this.__order_id, o.getOrderId())) return false;
		if(!Objects.equals(this.__order_product_id, o.getOrderProductId())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__receivable_id, o.getReceivableId())) return false;
		if(!Objects.equals(this.__receivable_product_id, o.getReceivableProductId())) return false;
		if(!Objects.equals(this.__product_id, o.getProductId())) return false;
		if(!Objects.equals(this.__amount_invoice_receivable, o.getAmountInvoiceReceivable())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_issued, o.getDateIssued())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__contract_id, o.getContractId())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__receipt_plan_id, o.getReceiptPlanId())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getInvoiceReceivableId() != null) sb.append(__wrapNumber(count++, "invoiceReceivableId", getInvoiceReceivableId()));
		if(getInvoiceReceivableCode() != null) sb.append(__wrapNumber(count++, "invoiceReceivableCode", getInvoiceReceivableCode()));
		if(getInvoiceId() != null) sb.append(__wrapNumber(count++, "invoiceId", getInvoiceId()));
		if(getOrderId() != null) sb.append(__wrapNumber(count++, "orderId", getOrderId()));
		if(getOrderProductId() != null) sb.append(__wrapNumber(count++, "orderProductId", getOrderProductId()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getReceivableId() != null) sb.append(__wrapNumber(count++, "receivableId", getReceivableId()));
		if(getReceivableProductId() != null) sb.append(__wrapNumber(count++, "receivableProductId", getReceivableProductId()));
		if(getProductId() != null) sb.append(__wrapNumber(count++, "productId", getProductId()));
		if(getAmountInvoiceReceivable() != null) sb.append(__wrapDecimal(count++, "amountInvoiceReceivable", getAmountInvoiceReceivable()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateIssued() != null) sb.append(__wrapDate(count++, "dateIssued", getDateIssued()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getContractId() != null) sb.append(__wrapNumber(count++, "contractId", getContractId()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getReceiptPlanId() != null) sb.append(__wrapNumber(count++, "receiptPlanId", getReceiptPlanId()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getInvoiceReceivableId() != null) res.put("invoiceReceivableId", getInvoiceReceivableId());
		if(getInvoiceReceivableCode() != null) res.put("invoiceReceivableCode", getInvoiceReceivableCode());
		if(getInvoiceId() != null) res.put("invoiceId", getInvoiceId());
		if(getOrderId() != null) res.put("orderId", getOrderId());
		if(getOrderProductId() != null) res.put("orderProductId", getOrderProductId());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getReceivableId() != null) res.put("receivableId", getReceivableId());
		if(getReceivableProductId() != null) res.put("receivableProductId", getReceivableProductId());
		if(getProductId() != null) res.put("productId", getProductId());
		if(getAmountInvoiceReceivable() != null) res.put("amountInvoiceReceivable", getAmountInvoiceReceivable());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateIssued() != null) res.put("dateIssued", getDateIssued());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getContractId() != null) res.put("contractId", getContractId());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getReceiptPlanId() != null) res.put("receiptPlanId", getReceiptPlanId());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("invoiceReceivableId")) != null) setInvoiceReceivableId(__getInt(val)); 
		if((val = values.get("invoiceReceivableCode")) != null) setInvoiceReceivableCode(__getInt(val)); 
		if((val = values.get("invoiceId")) != null) setInvoiceId(__getInt(val)); 
		if((val = values.get("orderId")) != null) setOrderId(__getInt(val)); 
		if((val = values.get("orderProductId")) != null) setOrderProductId(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("receivableId")) != null) setReceivableId(__getInt(val)); 
		if((val = values.get("receivableProductId")) != null) setReceivableProductId(__getInt(val)); 
		if((val = values.get("productId")) != null) setProductId(__getInt(val)); 
		if((val = values.get("amountInvoiceReceivable")) != null) setAmountInvoiceReceivable(__getDecimal(val));  
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateIssued")) != null) setDateIssued(__getDate(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("contractId")) != null) setContractId(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("receiptPlanId")) != null) setReceiptPlanId(__getInt(val)); 
	}

	protected java.lang.Integer  __invoice_receivable_id ;
	protected java.lang.Integer  __invoice_receivable_code ;
	protected java.lang.Integer  __invoice_id ;
	protected java.lang.Integer  __order_id ;
	protected java.lang.Integer  __order_product_id ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Integer  __receivable_id ;
	protected java.lang.Integer  __receivable_product_id ;
	protected java.lang.Integer  __product_id ;
	protected java.math.BigDecimal  __amount_invoice_receivable ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_issued ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.lang.Integer  __contract_id ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Integer  __receipt_plan_id ;
}
