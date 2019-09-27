package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmDeliveryProduct extends GenericBase implements BaseFactory<BaseCrmDeliveryProduct>, Comparable<BaseCrmDeliveryProduct> 
{


	public static BaseCrmDeliveryProduct newInstance(){
		return new BaseCrmDeliveryProduct();
	}

	@Override
	public BaseCrmDeliveryProduct make(){
		BaseCrmDeliveryProduct b = new BaseCrmDeliveryProduct();
		return b;
	}

	public final static java.lang.String CS_DELIVERY_PRODUCT_ID = "delivery_product_id" ;
	public final static java.lang.String CS_DELIVERY_ID = "delivery_id" ;
	public final static java.lang.String CS_PRODUCT_ID = "product_id" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_FLAG_LOCKED = "flag_locked" ;
	public final static java.lang.String CS_DELIVERY_NAME = "delivery_name" ;
	public final static java.lang.String CS_ORDER_ID = "order_id" ;
	public final static java.lang.String CS_QUANTITY_TOTAL_DELIVER = "quantity_total_deliver" ;
	public final static java.lang.String CS_QUANTITY_DELIVERED = "quantity_delivered" ;
	public final static java.lang.String CS_FLAG_SQUARED_UP = "flag_squared_up" ;
	public final static java.lang.String CS_CONTACT_NAME = "contact_name" ;
	public final static java.lang.String CS_CONTACT_MOBILE = "contact_mobile" ;
	public final static java.lang.String CS_DETAILED_ADDRESS_DELIVERY = "detailed_address_delivery" ;
	public final static java.lang.String CS_MEMO = "memo" ;
	public final static java.lang.String CS_ORDER_PRODUCT_ID = "order_product_id" ;

	public final static java.lang.String ALL_CAPTIONS = "交付-<产品明细编码,交付编码,产品编码,所属部门,创建人编码,创建日期,修改人编码,修改日期,是否被锁定,交付记录名称,订单编码,应交付数量,正交付数量,是否已结清,联系人姓名,联系人手机,收货详细地址,备注,订单-<产品明细编码";

	public java.lang.Integer getDeliveryProductId() {
		return this.__delivery_product_id;
	}

	public void setDeliveryProductId( java.lang.Integer value ) {
		this.__delivery_product_id = value;
	}

	public java.lang.Integer getDeliveryId() {
		return this.__delivery_id;
	}

	public void setDeliveryId( java.lang.Integer value ) {
		this.__delivery_id = value;
	}

	public java.lang.Integer getProductId() {
		return this.__product_id;
	}

	public void setProductId( java.lang.Integer value ) {
		this.__product_id = value;
	}

	public java.lang.String getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.String value ) {
		this.__department_id = value;
	}

	public java.lang.String getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.String value ) {
		this.__employee_id_created = value;
	}

	public java.util.Date getDateCreated() {
		return this.__date_created;
	}

	public void setDateCreated( java.util.Date value ) {
		this.__date_created = value;
	}

	public java.lang.String getEmployeeIdUpdated() {
		return this.__employee_id_updated;
	}

	public void setEmployeeIdUpdated( java.lang.String value ) {
		this.__employee_id_updated = value;
	}

	public java.util.Date getDateUpdated() {
		return this.__date_updated;
	}

	public void setDateUpdated( java.util.Date value ) {
		this.__date_updated = value;
	}

	public java.lang.Boolean getFlagLocked() {
		return this.__flag_locked;
	}

	public void setFlagLocked( java.lang.Boolean value ) {
		this.__flag_locked = value;
	}

	public java.lang.String getDeliveryName() {
		return this.__delivery_name;
	}

	public void setDeliveryName( java.lang.String value ) {
		this.__delivery_name = value;
	}

	public java.lang.Integer getOrderId() {
		return this.__order_id;
	}

	public void setOrderId( java.lang.Integer value ) {
		this.__order_id = value;
	}

	public java.lang.Integer getQuantityTotalDeliver() {
		return this.__quantity_total_deliver;
	}

	public void setQuantityTotalDeliver( java.lang.Integer value ) {
		this.__quantity_total_deliver = value;
	}

	public java.lang.Float getQuantityDelivered() {
		return this.__quantity_delivered;
	}

	public void setQuantityDelivered( java.lang.Float value ) {
		this.__quantity_delivered = value;
	}

	public java.lang.Boolean getFlagSquaredUp() {
		return this.__flag_squared_up;
	}

	public void setFlagSquaredUp( java.lang.Boolean value ) {
		this.__flag_squared_up = value;
	}

	public java.lang.String getContactName() {
		return this.__contact_name;
	}

	public void setContactName( java.lang.String value ) {
		this.__contact_name = value;
	}

	public java.lang.String getContactMobile() {
		return this.__contact_mobile;
	}

	public void setContactMobile( java.lang.String value ) {
		this.__contact_mobile = value;
	}

	public java.lang.String getDetailedAddressDelivery() {
		return this.__detailed_address_delivery;
	}

	public void setDetailedAddressDelivery( java.lang.String value ) {
		this.__detailed_address_delivery = value;
	}

	public java.lang.String getMemo() {
		return this.__memo;
	}

	public void setMemo( java.lang.String value ) {
		this.__memo = value;
	}

	public java.lang.Integer getOrderProductId() {
		return this.__order_product_id;
	}

	public void setOrderProductId( java.lang.Integer value ) {
		this.__order_product_id = value;
	}

	public void cloneCopy(BaseCrmDeliveryProduct __bean){
		__bean.setDeliveryProductId(getDeliveryProductId());
		__bean.setDeliveryId(getDeliveryId());
		__bean.setProductId(getProductId());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setFlagLocked(getFlagLocked());
		__bean.setDeliveryName(getDeliveryName());
		__bean.setOrderId(getOrderId());
		__bean.setQuantityTotalDeliver(getQuantityTotalDeliver());
		__bean.setQuantityDelivered(getQuantityDelivered());
		__bean.setFlagSquaredUp(getFlagSquaredUp());
		__bean.setContactName(getContactName());
		__bean.setContactMobile(getContactMobile());
		__bean.setDetailedAddressDelivery(getDetailedAddressDelivery());
		__bean.setMemo(getMemo());
		__bean.setOrderProductId(getOrderProductId());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getDeliveryProductId() == null ? "" : getDeliveryProductId());
		sb.append(",");
		sb.append(getDeliveryId() == null ? "" : getDeliveryId());
		sb.append(",");
		sb.append(getProductId() == null ? "" : getProductId());
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getFlagLocked() == null ? "" : getFlagLocked());
		sb.append(",");
		sb.append(getDeliveryName() == null ? "" : getDeliveryName());
		sb.append(",");
		sb.append(getOrderId() == null ? "" : getOrderId());
		sb.append(",");
		sb.append(getQuantityTotalDeliver() == null ? "" : getQuantityTotalDeliver());
		sb.append(",");
		sb.append(getQuantityDelivered() == null ? "" : getQuantityDelivered());
		sb.append(",");
		sb.append(getFlagSquaredUp() == null ? "" : getFlagSquaredUp());
		sb.append(",");
		sb.append(getContactName() == null ? "" : getContactName());
		sb.append(",");
		sb.append(getContactMobile() == null ? "" : getContactMobile());
		sb.append(",");
		sb.append(getDetailedAddressDelivery() == null ? "" : getDetailedAddressDelivery());
		sb.append(",");
		sb.append(getMemo() == null ? "" : getMemo());
		sb.append(",");
		sb.append(getOrderProductId() == null ? "" : getOrderProductId());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmDeliveryProduct o) {
		return __delivery_product_id == null ? -1 : __delivery_product_id.compareTo(o.getDeliveryProductId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__delivery_product_id);
		hash = 97 * hash + Objects.hashCode(this.__delivery_id);
		hash = 97 * hash + Objects.hashCode(this.__product_id);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__flag_locked);
		hash = 97 * hash + Objects.hashCode(this.__delivery_name);
		hash = 97 * hash + Objects.hashCode(this.__order_id);
		hash = 97 * hash + Objects.hashCode(this.__quantity_total_deliver);
		hash = 97 * hash + Objects.hashCode(this.__quantity_delivered);
		hash = 97 * hash + Objects.hashCode(this.__flag_squared_up);
		hash = 97 * hash + Objects.hashCode(this.__contact_name);
		hash = 97 * hash + Objects.hashCode(this.__contact_mobile);
		hash = 97 * hash + Objects.hashCode(this.__detailed_address_delivery);
		hash = 97 * hash + Objects.hashCode(this.__memo);
		hash = 97 * hash + Objects.hashCode(this.__order_product_id);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmDeliveryProduct o = (BaseCrmDeliveryProduct)obj;
		if(!Objects.equals(this.__delivery_product_id, o.getDeliveryProductId())) return false;
		if(!Objects.equals(this.__delivery_id, o.getDeliveryId())) return false;
		if(!Objects.equals(this.__product_id, o.getProductId())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__flag_locked, o.getFlagLocked())) return false;
		if(!Objects.equals(this.__delivery_name, o.getDeliveryName())) return false;
		if(!Objects.equals(this.__order_id, o.getOrderId())) return false;
		if(!Objects.equals(this.__quantity_total_deliver, o.getQuantityTotalDeliver())) return false;
		if(!Objects.equals(this.__quantity_delivered, o.getQuantityDelivered())) return false;
		if(!Objects.equals(this.__flag_squared_up, o.getFlagSquaredUp())) return false;
		if(!Objects.equals(this.__contact_name, o.getContactName())) return false;
		if(!Objects.equals(this.__contact_mobile, o.getContactMobile())) return false;
		if(!Objects.equals(this.__detailed_address_delivery, o.getDetailedAddressDelivery())) return false;
		if(!Objects.equals(this.__memo, o.getMemo())) return false;
		if(!Objects.equals(this.__order_product_id, o.getOrderProductId())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getDeliveryProductId() != null) sb.append(__wrapNumber(count++, "deliveryProductId", getDeliveryProductId()));
		if(getDeliveryId() != null) sb.append(__wrapNumber(count++, "deliveryId", getDeliveryId()));
		if(getProductId() != null) sb.append(__wrapNumber(count++, "productId", getProductId()));
		if(getDepartmentId() != null) sb.append(__wrapString(count++, "departmentId", getDepartmentId()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapString(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapString(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getFlagLocked() != null) sb.append(__wrapBoolean(count++, "flagLocked", getFlagLocked()));
		if(getDeliveryName() != null) sb.append(__wrapString(count++, "deliveryName", getDeliveryName()));
		if(getOrderId() != null) sb.append(__wrapNumber(count++, "orderId", getOrderId()));
		if(getQuantityTotalDeliver() != null) sb.append(__wrapNumber(count++, "quantityTotalDeliver", getQuantityTotalDeliver()));
		if(getQuantityDelivered() != null) sb.append(__wrapNumber(count++, "quantityDelivered", getQuantityDelivered()));
		if(getFlagSquaredUp() != null) sb.append(__wrapBoolean(count++, "flagSquaredUp", getFlagSquaredUp()));
		if(getContactName() != null) sb.append(__wrapString(count++, "contactName", getContactName()));
		if(getContactMobile() != null) sb.append(__wrapString(count++, "contactMobile", getContactMobile()));
		if(getDetailedAddressDelivery() != null) sb.append(__wrapString(count++, "detailedAddressDelivery", getDetailedAddressDelivery()));
		if(getMemo() != null) sb.append(__wrapString(count++, "memo", getMemo()));
		if(getOrderProductId() != null) sb.append(__wrapNumber(count++, "orderProductId", getOrderProductId()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getDeliveryProductId() != null) res.put("deliveryProductId", getDeliveryProductId());
		if(getDeliveryId() != null) res.put("deliveryId", getDeliveryId());
		if(getProductId() != null) res.put("productId", getProductId());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getFlagLocked() != null) res.put("flagLocked", getFlagLocked());
		if(getDeliveryName() != null) res.put("deliveryName", getDeliveryName());
		if(getOrderId() != null) res.put("orderId", getOrderId());
		if(getQuantityTotalDeliver() != null) res.put("quantityTotalDeliver", getQuantityTotalDeliver());
		if(getQuantityDelivered() != null) res.put("quantityDelivered", getQuantityDelivered());
		if(getFlagSquaredUp() != null) res.put("flagSquaredUp", getFlagSquaredUp());
		if(getContactName() != null) res.put("contactName", getContactName());
		if(getContactMobile() != null) res.put("contactMobile", getContactMobile());
		if(getDetailedAddressDelivery() != null) res.put("detailedAddressDelivery", getDetailedAddressDelivery());
		if(getMemo() != null) res.put("memo", getMemo());
		if(getOrderProductId() != null) res.put("orderProductId", getOrderProductId());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("deliveryProductId")) != null) setDeliveryProductId(__getInt(val)); 
		if((val = values.get("deliveryId")) != null) setDeliveryId(__getInt(val)); 
		if((val = values.get("productId")) != null) setProductId(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getString(val));
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getString(val));
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getString(val));
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("flagLocked")) != null) setFlagLocked(__getBoolean(val));
		if((val = values.get("deliveryName")) != null) setDeliveryName(__getString(val));
		if((val = values.get("orderId")) != null) setOrderId(__getInt(val)); 
		if((val = values.get("quantityTotalDeliver")) != null) setQuantityTotalDeliver(__getInt(val)); 
		if((val = values.get("quantityDelivered")) != null) setQuantityDelivered(__getFloat(val));  
		if((val = values.get("flagSquaredUp")) != null) setFlagSquaredUp(__getBoolean(val));
		if((val = values.get("contactName")) != null) setContactName(__getString(val));
		if((val = values.get("contactMobile")) != null) setContactMobile(__getString(val));
		if((val = values.get("detailedAddressDelivery")) != null) setDetailedAddressDelivery(__getString(val));
		if((val = values.get("memo")) != null) setMemo(__getString(val));
		if((val = values.get("orderProductId")) != null) setOrderProductId(__getInt(val)); 
	}

	protected java.lang.Integer  __delivery_product_id ;
	protected java.lang.Integer  __delivery_id ;
	protected java.lang.Integer  __product_id ;
	protected java.lang.String  __department_id ;
	protected java.lang.String  __employee_id_created ;
	protected java.util.Date  __date_created ;
	protected java.lang.String  __employee_id_updated ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Boolean  __flag_locked ;
	protected java.lang.String  __delivery_name ;
	protected java.lang.Integer  __order_id ;
	protected java.lang.Integer  __quantity_total_deliver ;
	protected java.lang.Float  __quantity_delivered ;
	protected java.lang.Boolean  __flag_squared_up ;
	protected java.lang.String  __contact_name ;
	protected java.lang.String  __contact_mobile ;
	protected java.lang.String  __detailed_address_delivery ;
	protected java.lang.String  __memo ;
	protected java.lang.Integer  __order_product_id ;
}
