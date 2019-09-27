package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseFinRefundReceivableProduct extends GenericBase implements BaseFactory<BaseFinRefundReceivableProduct>, Comparable<BaseFinRefundReceivableProduct> 
{


	public static BaseFinRefundReceivableProduct newInstance(){
		return new BaseFinRefundReceivableProduct();
	}

	@Override
	public BaseFinRefundReceivableProduct make(){
		BaseFinRefundReceivableProduct b = new BaseFinRefundReceivableProduct();
		return b;
	}

	public final static java.lang.String CS_REFUND_RECEIVABLE_PRODUCT_ID = "refund_receivable_product_id" ;
	public final static java.lang.String CS_REFUND_RECEIVABLE_PRODUCT_CODE = "refund_receivable_product_code" ;
	public final static java.lang.String CS_REFUND_ID = "refund_id" ;
	public final static java.lang.String CS_ORDER_ID = "order_id" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_ORDER_PRODUCT_ID = "order_product_id" ;
	public final static java.lang.String CS_RECEIVABLE_ID = "receivable_id" ;
	public final static java.lang.String CS_RECEIVABLE_PRODUCT_ID = "receivable_product_id" ;
	public final static java.lang.String CS_RECEIPT_ID = "receipt_id" ;
	public final static java.lang.String CS_RECEIPT_RECEIVABLE_PRODUCT_ID = "receipt_receivable_product_id" ;
	public final static java.lang.String CS_PRODUCT_ID = "product_id" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_AMOUNT_REFUND_RECEIVABLE_PRODUCT = "amount_refund_receivable_product" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_DATE_REFUNDED = "date_refunded" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;

	public final static java.lang.String ALL_CAPTIONS = "退款-<应收单产品明细编码,退款-<应收单产品明细编号,退款编码,订单编码,所属部门,订单-<产品明细编码,应收单编码,应收单-<产品编码,收款单编码,收款单-<应收单-<产品明细编码,产品编码,创建人编码,退款-<应收单产品明细金额,创建日期,退款日期,修改人编码,修改日期";

	public java.lang.Integer getRefundReceivableProductId() {
		return this.__refund_receivable_product_id;
	}

	public void setRefundReceivableProductId( java.lang.Integer value ) {
		this.__refund_receivable_product_id = value;
	}

	public java.lang.String getRefundReceivableProductCode() {
		return this.__refund_receivable_product_code;
	}

	public void setRefundReceivableProductCode( java.lang.String value ) {
		this.__refund_receivable_product_code = value;
	}

	public java.lang.Integer getRefundId() {
		return this.__refund_id;
	}

	public void setRefundId( java.lang.Integer value ) {
		this.__refund_id = value;
	}

	public java.lang.Integer getOrderId() {
		return this.__order_id;
	}

	public void setOrderId( java.lang.Integer value ) {
		this.__order_id = value;
	}

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
	}

	public java.lang.Integer getOrderProductId() {
		return this.__order_product_id;
	}

	public void setOrderProductId( java.lang.Integer value ) {
		this.__order_product_id = value;
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

	public java.lang.Integer getReceiptId() {
		return this.__receipt_id;
	}

	public void setReceiptId( java.lang.Integer value ) {
		this.__receipt_id = value;
	}

	public java.lang.Integer getReceiptReceivableProductId() {
		return this.__receipt_receivable_product_id;
	}

	public void setReceiptReceivableProductId( java.lang.Integer value ) {
		this.__receipt_receivable_product_id = value;
	}

	public java.lang.Integer getProductId() {
		return this.__product_id;
	}

	public void setProductId( java.lang.Integer value ) {
		this.__product_id = value;
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.Integer value ) {
		this.__employee_id_created = value;
	}

	public java.math.BigDecimal getAmountRefundReceivableProduct() {
		return this.__amount_refund_receivable_product;
	}

	public void setAmountRefundReceivableProduct( java.math.BigDecimal value ) {
		this.__amount_refund_receivable_product = value;
	}

	public java.util.Date getDateCreated() {
		return this.__date_created;
	}

	public void setDateCreated( java.util.Date value ) {
		this.__date_created = value;
	}

	public java.util.Date getDateRefunded() {
		return this.__date_refunded;
	}

	public void setDateRefunded( java.util.Date value ) {
		this.__date_refunded = value;
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

	public void cloneCopy(BaseFinRefundReceivableProduct __bean){
		__bean.setRefundReceivableProductId(getRefundReceivableProductId());
		__bean.setRefundReceivableProductCode(getRefundReceivableProductCode());
		__bean.setRefundId(getRefundId());
		__bean.setOrderId(getOrderId());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setOrderProductId(getOrderProductId());
		__bean.setReceivableId(getReceivableId());
		__bean.setReceivableProductId(getReceivableProductId());
		__bean.setReceiptId(getReceiptId());
		__bean.setReceiptReceivableProductId(getReceiptReceivableProductId());
		__bean.setProductId(getProductId());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setAmountRefundReceivableProduct(getAmountRefundReceivableProduct());
		__bean.setDateCreated(getDateCreated());
		__bean.setDateRefunded(getDateRefunded());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateUpdated(getDateUpdated());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getRefundReceivableProductId() == null ? "" : getRefundReceivableProductId());
		sb.append(",");
		sb.append(getRefundReceivableProductCode() == null ? "" : getRefundReceivableProductCode());
		sb.append(",");
		sb.append(getRefundId() == null ? "" : getRefundId());
		sb.append(",");
		sb.append(getOrderId() == null ? "" : getOrderId());
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getOrderProductId() == null ? "" : getOrderProductId());
		sb.append(",");
		sb.append(getReceivableId() == null ? "" : getReceivableId());
		sb.append(",");
		sb.append(getReceivableProductId() == null ? "" : getReceivableProductId());
		sb.append(",");
		sb.append(getReceiptId() == null ? "" : getReceiptId());
		sb.append(",");
		sb.append(getReceiptReceivableProductId() == null ? "" : getReceiptReceivableProductId());
		sb.append(",");
		sb.append(getProductId() == null ? "" : getProductId());
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getAmountRefundReceivableProduct() == null ? "" : getAmountRefundReceivableProduct());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getDateRefunded() == null ? "" : sdf.format(getDateRefunded()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		return sb.toString();
	}

	@Override
	public int compareTo(BaseFinRefundReceivableProduct o) {
		return __refund_receivable_product_id == null ? -1 : __refund_receivable_product_id.compareTo(o.getRefundReceivableProductId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__refund_receivable_product_id);
		hash = 97 * hash + Objects.hashCode(this.__refund_receivable_product_code);
		hash = 97 * hash + Objects.hashCode(this.__refund_id);
		hash = 97 * hash + Objects.hashCode(this.__order_id);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__order_product_id);
		hash = 97 * hash + Objects.hashCode(this.__receivable_id);
		hash = 97 * hash + Objects.hashCode(this.__receivable_product_id);
		hash = 97 * hash + Objects.hashCode(this.__receipt_id);
		hash = 97 * hash + Objects.hashCode(this.__receipt_receivable_product_id);
		hash = 97 * hash + Objects.hashCode(this.__product_id);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__amount_refund_receivable_product);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__date_refunded);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseFinRefundReceivableProduct o = (BaseFinRefundReceivableProduct)obj;
		if(!Objects.equals(this.__refund_receivable_product_id, o.getRefundReceivableProductId())) return false;
		if(!Objects.equals(this.__refund_receivable_product_code, o.getRefundReceivableProductCode())) return false;
		if(!Objects.equals(this.__refund_id, o.getRefundId())) return false;
		if(!Objects.equals(this.__order_id, o.getOrderId())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__order_product_id, o.getOrderProductId())) return false;
		if(!Objects.equals(this.__receivable_id, o.getReceivableId())) return false;
		if(!Objects.equals(this.__receivable_product_id, o.getReceivableProductId())) return false;
		if(!Objects.equals(this.__receipt_id, o.getReceiptId())) return false;
		if(!Objects.equals(this.__receipt_receivable_product_id, o.getReceiptReceivableProductId())) return false;
		if(!Objects.equals(this.__product_id, o.getProductId())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__amount_refund_receivable_product, o.getAmountRefundReceivableProduct())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__date_refunded, o.getDateRefunded())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getRefundReceivableProductId() != null) sb.append(__wrapNumber(count++, "refundReceivableProductId", getRefundReceivableProductId()));
		if(getRefundReceivableProductCode() != null) sb.append(__wrapString(count++, "refundReceivableProductCode", getRefundReceivableProductCode()));
		if(getRefundId() != null) sb.append(__wrapNumber(count++, "refundId", getRefundId()));
		if(getOrderId() != null) sb.append(__wrapNumber(count++, "orderId", getOrderId()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getOrderProductId() != null) sb.append(__wrapNumber(count++, "orderProductId", getOrderProductId()));
		if(getReceivableId() != null) sb.append(__wrapNumber(count++, "receivableId", getReceivableId()));
		if(getReceivableProductId() != null) sb.append(__wrapNumber(count++, "receivableProductId", getReceivableProductId()));
		if(getReceiptId() != null) sb.append(__wrapNumber(count++, "receiptId", getReceiptId()));
		if(getReceiptReceivableProductId() != null) sb.append(__wrapNumber(count++, "receiptReceivableProductId", getReceiptReceivableProductId()));
		if(getProductId() != null) sb.append(__wrapNumber(count++, "productId", getProductId()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getAmountRefundReceivableProduct() != null) sb.append(__wrapDecimal(count++, "amountRefundReceivableProduct", getAmountRefundReceivableProduct()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getDateRefunded() != null) sb.append(__wrapDate(count++, "dateRefunded", getDateRefunded()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getRefundReceivableProductId() != null) res.put("refundReceivableProductId", getRefundReceivableProductId());
		if(getRefundReceivableProductCode() != null) res.put("refundReceivableProductCode", getRefundReceivableProductCode());
		if(getRefundId() != null) res.put("refundId", getRefundId());
		if(getOrderId() != null) res.put("orderId", getOrderId());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getOrderProductId() != null) res.put("orderProductId", getOrderProductId());
		if(getReceivableId() != null) res.put("receivableId", getReceivableId());
		if(getReceivableProductId() != null) res.put("receivableProductId", getReceivableProductId());
		if(getReceiptId() != null) res.put("receiptId", getReceiptId());
		if(getReceiptReceivableProductId() != null) res.put("receiptReceivableProductId", getReceiptReceivableProductId());
		if(getProductId() != null) res.put("productId", getProductId());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getAmountRefundReceivableProduct() != null) res.put("amountRefundReceivableProduct", getAmountRefundReceivableProduct());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getDateRefunded() != null) res.put("dateRefunded", getDateRefunded());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("refundReceivableProductId")) != null) setRefundReceivableProductId(__getInt(val)); 
		if((val = values.get("refundReceivableProductCode")) != null) setRefundReceivableProductCode(__getString(val));
		if((val = values.get("refundId")) != null) setRefundId(__getInt(val)); 
		if((val = values.get("orderId")) != null) setOrderId(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("orderProductId")) != null) setOrderProductId(__getInt(val)); 
		if((val = values.get("receivableId")) != null) setReceivableId(__getInt(val)); 
		if((val = values.get("receivableProductId")) != null) setReceivableProductId(__getInt(val)); 
		if((val = values.get("receiptId")) != null) setReceiptId(__getInt(val)); 
		if((val = values.get("receiptReceivableProductId")) != null) setReceiptReceivableProductId(__getInt(val)); 
		if((val = values.get("productId")) != null) setProductId(__getInt(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("amountRefundReceivableProduct")) != null) setAmountRefundReceivableProduct(__getDecimal(val));  
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("dateRefunded")) != null) setDateRefunded(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
	}

	protected java.lang.Integer  __refund_receivable_product_id ;
	protected java.lang.String  __refund_receivable_product_code ;
	protected java.lang.Integer  __refund_id ;
	protected java.lang.Integer  __order_id ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Integer  __order_product_id ;
	protected java.lang.Integer  __receivable_id ;
	protected java.lang.Integer  __receivable_product_id ;
	protected java.lang.Integer  __receipt_id ;
	protected java.lang.Integer  __receipt_receivable_product_id ;
	protected java.lang.Integer  __product_id ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.math.BigDecimal  __amount_refund_receivable_product ;
	protected java.util.Date  __date_created ;
	protected java.util.Date  __date_refunded ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.util.Date  __date_updated ;
}
