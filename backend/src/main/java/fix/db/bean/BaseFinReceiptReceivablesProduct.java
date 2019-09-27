package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseFinReceiptReceivablesProduct extends GenericBase implements BaseFactory<BaseFinReceiptReceivablesProduct>, Comparable<BaseFinReceiptReceivablesProduct> 
{


	public static BaseFinReceiptReceivablesProduct newInstance(){
		return new BaseFinReceiptReceivablesProduct();
	}

	@Override
	public BaseFinReceiptReceivablesProduct make(){
		BaseFinReceiptReceivablesProduct b = new BaseFinReceiptReceivablesProduct();
		return b;
	}

	public final static java.lang.String CS_RECEIPT_RECEIVABLE_PRODUCT_ID = "receipt_receivable_product_id" ;
	public final static java.lang.String CS_RECEIPT_RECEIVABLE_CODE = "receipt_receivable_code" ;
	public final static java.lang.String CS_RECEIPT_ID = "receipt_id" ;
	public final static java.lang.String CS_RECEIVABLE_ID = "receivable_id" ;
	public final static java.lang.String CS_RECEIVABLE_PRODUCT_ID = "receivable_product_id" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_ORDER_ID = "order_id" ;
	public final static java.lang.String CS_ORDER_PRODUCT_ID = "order_product_id" ;
	public final static java.lang.String CS_PRODUCT_ID = "product_id" ;
	public final static java.lang.String CS_AMOUNT_RECEIPT_RECEIVABLE_PRODUCT = "amount_receipt_receivable_product" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_RECEIPTED = "date_receipted" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_CONTRACT_ID = "contract_id" ;
	public final static java.lang.String CS_RECEIPT_PLAN_ID = "receipt_plan_id" ;

	public final static java.lang.String ALL_CAPTIONS = "收款单-<应收单-<产品明细编码,收款单-<应收单-<产品编号,收款单编码,应收单编码,应收单-<产品编码,所属部门,订单编码,订单-<产品编码,产品编码,收款单-<应收-<产品金额,创建人编码,收款日期,创建日期,修改人编码,修改日期,合同编码,收款计划编码";

	public java.lang.Integer getReceiptReceivableProductId() {
		return this.__receipt_receivable_product_id;
	}

	public void setReceiptReceivableProductId( java.lang.Integer value ) {
		this.__receipt_receivable_product_id = value;
	}

	public java.lang.String getReceiptReceivableCode() {
		return this.__receipt_receivable_code;
	}

	public void setReceiptReceivableCode( java.lang.String value ) {
		this.__receipt_receivable_code = value;
	}

	public java.lang.Integer getReceiptId() {
		return this.__receipt_id;
	}

	public void setReceiptId( java.lang.Integer value ) {
		this.__receipt_id = value;
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

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
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

	public java.lang.Integer getProductId() {
		return this.__product_id;
	}

	public void setProductId( java.lang.Integer value ) {
		this.__product_id = value;
	}

	public java.math.BigDecimal getAmountReceiptReceivableProduct() {
		return this.__amount_receipt_receivable_product;
	}

	public void setAmountReceiptReceivableProduct( java.math.BigDecimal value ) {
		this.__amount_receipt_receivable_product = value;
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.Integer value ) {
		this.__employee_id_created = value;
	}

	public java.util.Date getDateReceipted() {
		return this.__date_receipted;
	}

	public void setDateReceipted( java.util.Date value ) {
		this.__date_receipted = value;
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

	public java.util.Date getDateUpdated() {
		return this.__date_updated;
	}

	public void setDateUpdated( java.util.Date value ) {
		this.__date_updated = value;
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

	public void cloneCopy(BaseFinReceiptReceivablesProduct __bean){
		__bean.setReceiptReceivableProductId(getReceiptReceivableProductId());
		__bean.setReceiptReceivableCode(getReceiptReceivableCode());
		__bean.setReceiptId(getReceiptId());
		__bean.setReceivableId(getReceivableId());
		__bean.setReceivableProductId(getReceivableProductId());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setOrderId(getOrderId());
		__bean.setOrderProductId(getOrderProductId());
		__bean.setProductId(getProductId());
		__bean.setAmountReceiptReceivableProduct(getAmountReceiptReceivableProduct());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateReceipted(getDateReceipted());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setContractId(getContractId());
		__bean.setReceiptPlanId(getReceiptPlanId());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getReceiptReceivableProductId() == null ? "" : getReceiptReceivableProductId());
		sb.append(",");
		sb.append(getReceiptReceivableCode() == null ? "" : getReceiptReceivableCode());
		sb.append(",");
		sb.append(getReceiptId() == null ? "" : getReceiptId());
		sb.append(",");
		sb.append(getReceivableId() == null ? "" : getReceivableId());
		sb.append(",");
		sb.append(getReceivableProductId() == null ? "" : getReceivableProductId());
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getOrderId() == null ? "" : getOrderId());
		sb.append(",");
		sb.append(getOrderProductId() == null ? "" : getOrderProductId());
		sb.append(",");
		sb.append(getProductId() == null ? "" : getProductId());
		sb.append(",");
		sb.append(getAmountReceiptReceivableProduct() == null ? "" : getAmountReceiptReceivableProduct());
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getDateReceipted() == null ? "" : sdf.format(getDateReceipted()));
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getContractId() == null ? "" : getContractId());
		sb.append(",");
		sb.append(getReceiptPlanId() == null ? "" : getReceiptPlanId());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseFinReceiptReceivablesProduct o) {
		return __receipt_receivable_product_id == null ? -1 : __receipt_receivable_product_id.compareTo(o.getReceiptReceivableProductId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__receipt_receivable_product_id);
		hash = 97 * hash + Objects.hashCode(this.__receipt_receivable_code);
		hash = 97 * hash + Objects.hashCode(this.__receipt_id);
		hash = 97 * hash + Objects.hashCode(this.__receivable_id);
		hash = 97 * hash + Objects.hashCode(this.__receivable_product_id);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__order_id);
		hash = 97 * hash + Objects.hashCode(this.__order_product_id);
		hash = 97 * hash + Objects.hashCode(this.__product_id);
		hash = 97 * hash + Objects.hashCode(this.__amount_receipt_receivable_product);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_receipted);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__contract_id);
		hash = 97 * hash + Objects.hashCode(this.__receipt_plan_id);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseFinReceiptReceivablesProduct o = (BaseFinReceiptReceivablesProduct)obj;
		if(!Objects.equals(this.__receipt_receivable_product_id, o.getReceiptReceivableProductId())) return false;
		if(!Objects.equals(this.__receipt_receivable_code, o.getReceiptReceivableCode())) return false;
		if(!Objects.equals(this.__receipt_id, o.getReceiptId())) return false;
		if(!Objects.equals(this.__receivable_id, o.getReceivableId())) return false;
		if(!Objects.equals(this.__receivable_product_id, o.getReceivableProductId())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__order_id, o.getOrderId())) return false;
		if(!Objects.equals(this.__order_product_id, o.getOrderProductId())) return false;
		if(!Objects.equals(this.__product_id, o.getProductId())) return false;
		if(!Objects.equals(this.__amount_receipt_receivable_product, o.getAmountReceiptReceivableProduct())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_receipted, o.getDateReceipted())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__contract_id, o.getContractId())) return false;
		if(!Objects.equals(this.__receipt_plan_id, o.getReceiptPlanId())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getReceiptReceivableProductId() != null) sb.append(__wrapNumber(count++, "receiptReceivableProductId", getReceiptReceivableProductId()));
		if(getReceiptReceivableCode() != null) sb.append(__wrapString(count++, "receiptReceivableCode", getReceiptReceivableCode()));
		if(getReceiptId() != null) sb.append(__wrapNumber(count++, "receiptId", getReceiptId()));
		if(getReceivableId() != null) sb.append(__wrapNumber(count++, "receivableId", getReceivableId()));
		if(getReceivableProductId() != null) sb.append(__wrapNumber(count++, "receivableProductId", getReceivableProductId()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getOrderId() != null) sb.append(__wrapNumber(count++, "orderId", getOrderId()));
		if(getOrderProductId() != null) sb.append(__wrapNumber(count++, "orderProductId", getOrderProductId()));
		if(getProductId() != null) sb.append(__wrapNumber(count++, "productId", getProductId()));
		if(getAmountReceiptReceivableProduct() != null) sb.append(__wrapDecimal(count++, "amountReceiptReceivableProduct", getAmountReceiptReceivableProduct()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateReceipted() != null) sb.append(__wrapDate(count++, "dateReceipted", getDateReceipted()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getContractId() != null) sb.append(__wrapNumber(count++, "contractId", getContractId()));
		if(getReceiptPlanId() != null) sb.append(__wrapNumber(count++, "receiptPlanId", getReceiptPlanId()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getReceiptReceivableProductId() != null) res.put("receiptReceivableProductId", getReceiptReceivableProductId());
		if(getReceiptReceivableCode() != null) res.put("receiptReceivableCode", getReceiptReceivableCode());
		if(getReceiptId() != null) res.put("receiptId", getReceiptId());
		if(getReceivableId() != null) res.put("receivableId", getReceivableId());
		if(getReceivableProductId() != null) res.put("receivableProductId", getReceivableProductId());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getOrderId() != null) res.put("orderId", getOrderId());
		if(getOrderProductId() != null) res.put("orderProductId", getOrderProductId());
		if(getProductId() != null) res.put("productId", getProductId());
		if(getAmountReceiptReceivableProduct() != null) res.put("amountReceiptReceivableProduct", getAmountReceiptReceivableProduct());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateReceipted() != null) res.put("dateReceipted", getDateReceipted());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getContractId() != null) res.put("contractId", getContractId());
		if(getReceiptPlanId() != null) res.put("receiptPlanId", getReceiptPlanId());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("receiptReceivableProductId")) != null) setReceiptReceivableProductId(__getInt(val)); 
		if((val = values.get("receiptReceivableCode")) != null) setReceiptReceivableCode(__getString(val));
		if((val = values.get("receiptId")) != null) setReceiptId(__getInt(val)); 
		if((val = values.get("receivableId")) != null) setReceivableId(__getInt(val)); 
		if((val = values.get("receivableProductId")) != null) setReceivableProductId(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("orderId")) != null) setOrderId(__getInt(val)); 
		if((val = values.get("orderProductId")) != null) setOrderProductId(__getInt(val)); 
		if((val = values.get("productId")) != null) setProductId(__getInt(val)); 
		if((val = values.get("amountReceiptReceivableProduct")) != null) setAmountReceiptReceivableProduct(__getDecimal(val));  
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateReceipted")) != null) setDateReceipted(__getDate(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("contractId")) != null) setContractId(__getInt(val)); 
		if((val = values.get("receiptPlanId")) != null) setReceiptPlanId(__getInt(val)); 
	}

	protected java.lang.Integer  __receipt_receivable_product_id ;
	protected java.lang.String  __receipt_receivable_code ;
	protected java.lang.Integer  __receipt_id ;
	protected java.lang.Integer  __receivable_id ;
	protected java.lang.Integer  __receivable_product_id ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Integer  __order_id ;
	protected java.lang.Integer  __order_product_id ;
	protected java.lang.Integer  __product_id ;
	protected java.math.BigDecimal  __amount_receipt_receivable_product ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_receipted ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Integer  __contract_id ;
	protected java.lang.Integer  __receipt_plan_id ;
}
