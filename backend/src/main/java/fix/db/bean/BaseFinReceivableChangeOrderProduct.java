package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseFinReceivableChangeOrderProduct extends GenericBase implements BaseFactory<BaseFinReceivableChangeOrderProduct>, Comparable<BaseFinReceivableChangeOrderProduct> 
{


	public static BaseFinReceivableChangeOrderProduct newInstance(){
		return new BaseFinReceivableChangeOrderProduct();
	}

	@Override
	public BaseFinReceivableChangeOrderProduct make(){
		BaseFinReceivableChangeOrderProduct b = new BaseFinReceivableChangeOrderProduct();
		return b;
	}

	public final static java.lang.String CS_RECEIVABLE_CHANGE_ORDER_PRODUCT_ID = "receivable_change_order_product_id" ;
	public final static java.lang.String CS_RECEIVABLE_CHANGE_ID = "receivable_change_id" ;
	public final static java.lang.String CS_ORDER_ID = "order_id" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_ORDER_PRODUCT_ID = "order_product_id" ;
	public final static java.lang.String CS_RECEIVABLE_ID = "receivable_id" ;
	public final static java.lang.String CS_INVOICEITEMID = "invoiceItemId" ;
	public final static java.lang.String CS_PRODUCT_ID = "product_id" ;
	public final static java.lang.String CS_AMOUNT_CHANGE_RECEIVABLE_ORDER_PRODUCT = "amount_change_receivable_order_product" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_CHANGED = "date_changed" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;

	public final static java.lang.String ALL_CAPTIONS = "应收变更单-<订单-<产品表编码,应收变更单编码,订单编码,所属部门,订单-<产品编码,应收单编码,应收单-<产品编码,产品编码,变更单明细金额,创建人编码,应收变更日期,创建日期,修改人编码,修改日期";

	public java.lang.Integer getReceivableChangeOrderProductId() {
		return this.__receivable_change_order_product_id;
	}

	public void setReceivableChangeOrderProductId( java.lang.Integer value ) {
		this.__receivable_change_order_product_id = value;
	}

	public java.lang.Integer getReceivableChangeId() {
		return this.__receivable_change_id;
	}

	public void setReceivableChangeId( java.lang.Integer value ) {
		this.__receivable_change_id = value;
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

	public java.lang.Integer getInvoiceitemid() {
		return this.__invoiceitemid;
	}

	public void setInvoiceitemid( java.lang.Integer value ) {
		this.__invoiceitemid = value;
	}

	public java.lang.Integer getProductId() {
		return this.__product_id;
	}

	public void setProductId( java.lang.Integer value ) {
		this.__product_id = value;
	}

	public java.math.BigDecimal getAmountChangeReceivableOrderProduct() {
		return this.__amount_change_receivable_order_product;
	}

	public void setAmountChangeReceivableOrderProduct( java.math.BigDecimal value ) {
		this.__amount_change_receivable_order_product = value;
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.Integer value ) {
		this.__employee_id_created = value;
	}

	public java.util.Date getDateChanged() {
		return this.__date_changed;
	}

	public void setDateChanged( java.util.Date value ) {
		this.__date_changed = value;
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

	public void cloneCopy(BaseFinReceivableChangeOrderProduct __bean){
		__bean.setReceivableChangeOrderProductId(getReceivableChangeOrderProductId());
		__bean.setReceivableChangeId(getReceivableChangeId());
		__bean.setOrderId(getOrderId());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setOrderProductId(getOrderProductId());
		__bean.setReceivableId(getReceivableId());
		__bean.setInvoiceitemid(getInvoiceitemid());
		__bean.setProductId(getProductId());
		__bean.setAmountChangeReceivableOrderProduct(getAmountChangeReceivableOrderProduct());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateChanged(getDateChanged());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateUpdated(getDateUpdated());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getReceivableChangeOrderProductId() == null ? "" : getReceivableChangeOrderProductId());
		sb.append(",");
		sb.append(getReceivableChangeId() == null ? "" : getReceivableChangeId());
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
		sb.append(getInvoiceitemid() == null ? "" : getInvoiceitemid());
		sb.append(",");
		sb.append(getProductId() == null ? "" : getProductId());
		sb.append(",");
		sb.append(getAmountChangeReceivableOrderProduct() == null ? "" : getAmountChangeReceivableOrderProduct());
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getDateChanged() == null ? "" : sdf.format(getDateChanged()));
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		return sb.toString();
	}

	@Override
	public int compareTo(BaseFinReceivableChangeOrderProduct o) {
		return __receivable_change_order_product_id == null ? -1 : __receivable_change_order_product_id.compareTo(o.getReceivableChangeOrderProductId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__receivable_change_order_product_id);
		hash = 97 * hash + Objects.hashCode(this.__receivable_change_id);
		hash = 97 * hash + Objects.hashCode(this.__order_id);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__order_product_id);
		hash = 97 * hash + Objects.hashCode(this.__receivable_id);
		hash = 97 * hash + Objects.hashCode(this.__invoiceitemid);
		hash = 97 * hash + Objects.hashCode(this.__product_id);
		hash = 97 * hash + Objects.hashCode(this.__amount_change_receivable_order_product);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_changed);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseFinReceivableChangeOrderProduct o = (BaseFinReceivableChangeOrderProduct)obj;
		if(!Objects.equals(this.__receivable_change_order_product_id, o.getReceivableChangeOrderProductId())) return false;
		if(!Objects.equals(this.__receivable_change_id, o.getReceivableChangeId())) return false;
		if(!Objects.equals(this.__order_id, o.getOrderId())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__order_product_id, o.getOrderProductId())) return false;
		if(!Objects.equals(this.__receivable_id, o.getReceivableId())) return false;
		if(!Objects.equals(this.__invoiceitemid, o.getInvoiceitemid())) return false;
		if(!Objects.equals(this.__product_id, o.getProductId())) return false;
		if(!Objects.equals(this.__amount_change_receivable_order_product, o.getAmountChangeReceivableOrderProduct())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_changed, o.getDateChanged())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getReceivableChangeOrderProductId() != null) sb.append(__wrapNumber(count++, "receivableChangeOrderProductId", getReceivableChangeOrderProductId()));
		if(getReceivableChangeId() != null) sb.append(__wrapNumber(count++, "receivableChangeId", getReceivableChangeId()));
		if(getOrderId() != null) sb.append(__wrapNumber(count++, "orderId", getOrderId()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getOrderProductId() != null) sb.append(__wrapNumber(count++, "orderProductId", getOrderProductId()));
		if(getReceivableId() != null) sb.append(__wrapNumber(count++, "receivableId", getReceivableId()));
		if(getInvoiceitemid() != null) sb.append(__wrapNumber(count++, "invoiceitemid", getInvoiceitemid()));
		if(getProductId() != null) sb.append(__wrapNumber(count++, "productId", getProductId()));
		if(getAmountChangeReceivableOrderProduct() != null) sb.append(__wrapDecimal(count++, "amountChangeReceivableOrderProduct", getAmountChangeReceivableOrderProduct()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateChanged() != null) sb.append(__wrapDate(count++, "dateChanged", getDateChanged()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getReceivableChangeOrderProductId() != null) res.put("receivableChangeOrderProductId", getReceivableChangeOrderProductId());
		if(getReceivableChangeId() != null) res.put("receivableChangeId", getReceivableChangeId());
		if(getOrderId() != null) res.put("orderId", getOrderId());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getOrderProductId() != null) res.put("orderProductId", getOrderProductId());
		if(getReceivableId() != null) res.put("receivableId", getReceivableId());
		if(getInvoiceitemid() != null) res.put("invoiceitemid", getInvoiceitemid());
		if(getProductId() != null) res.put("productId", getProductId());
		if(getAmountChangeReceivableOrderProduct() != null) res.put("amountChangeReceivableOrderProduct", getAmountChangeReceivableOrderProduct());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateChanged() != null) res.put("dateChanged", getDateChanged());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("receivableChangeOrderProductId")) != null) setReceivableChangeOrderProductId(__getInt(val)); 
		if((val = values.get("receivableChangeId")) != null) setReceivableChangeId(__getInt(val)); 
		if((val = values.get("orderId")) != null) setOrderId(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("orderProductId")) != null) setOrderProductId(__getInt(val)); 
		if((val = values.get("receivableId")) != null) setReceivableId(__getInt(val)); 
		if((val = values.get("invoiceitemid")) != null) setInvoiceitemid(__getInt(val)); 
		if((val = values.get("productId")) != null) setProductId(__getInt(val)); 
		if((val = values.get("amountChangeReceivableOrderProduct")) != null) setAmountChangeReceivableOrderProduct(__getDecimal(val));  
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateChanged")) != null) setDateChanged(__getDate(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
	}

	protected java.lang.Integer  __receivable_change_order_product_id ;
	protected java.lang.Integer  __receivable_change_id ;
	protected java.lang.Integer  __order_id ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Integer  __order_product_id ;
	protected java.lang.Integer  __receivable_id ;
	protected java.lang.Integer  __invoiceitemid ;
	protected java.lang.Integer  __product_id ;
	protected java.math.BigDecimal  __amount_change_receivable_order_product ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_changed ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.util.Date  __date_updated ;
}
