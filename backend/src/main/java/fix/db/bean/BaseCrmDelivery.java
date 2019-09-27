package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmDelivery extends GenericBase implements BaseFactory<BaseCrmDelivery>, Comparable<BaseCrmDelivery> 
{


	public static BaseCrmDelivery newInstance(){
		return new BaseCrmDelivery();
	}

	@Override
	public BaseCrmDelivery make(){
		BaseCrmDelivery b = new BaseCrmDelivery();
		return b;
	}

	public final static java.lang.String CS_DELIVERY_ID = "delivery_id" ;
	public final static java.lang.String CS_DELIVERY_CODE = "delivery_code" ;
	public final static java.lang.String CS_DELIVERY_NAME = "delivery_name" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_STATUS_DELIVERY = "status_delivery" ;
	public final static java.lang.String CS_FLAG_LOCKED = "flag_locked" ;
	public final static java.lang.String CS_CUSTOMER_ID = "customer_id" ;
	public final static java.lang.String CS_DATE_DELIVERED = "date_delivered" ;
	public final static java.lang.String CS_MEMO = "memo" ;

	public final static java.lang.String ALL_CAPTIONS = "交付编码,交付编号,交付记录名称,维护人员工编码,所属部门,创建人编码,创建日期,修改人编码,修改日期,收货状态,是否被锁定,客户编码,交货日期,备注";

	public java.lang.Integer getDeliveryId() {
		return this.__delivery_id;
	}

	public void setDeliveryId( java.lang.Integer value ) {
		this.__delivery_id = value;
	}

	public java.lang.String getDeliveryCode() {
		return this.__delivery_code;
	}

	public void setDeliveryCode( java.lang.String value ) {
		this.__delivery_code = value;
	}

	public java.lang.String getDeliveryName() {
		return this.__delivery_name;
	}

	public void setDeliveryName( java.lang.String value ) {
		this.__delivery_name = value;
	}

	public java.lang.String getEmployeeIdMaintainer() {
		return this.__employee_id_maintainer;
	}

	public void setEmployeeIdMaintainer( java.lang.String value ) {
		this.__employee_id_maintainer = value;
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

	public java.lang.Integer getStatusDelivery() {
		return this.__status_delivery;
	}

	public void setStatusDelivery( java.lang.Integer value ) {
		this.__status_delivery = value;
	}

	public java.lang.Boolean getFlagLocked() {
		return this.__flag_locked;
	}

	public void setFlagLocked( java.lang.Boolean value ) {
		this.__flag_locked = value;
	}

	public java.lang.Integer getCustomerId() {
		return this.__customer_id;
	}

	public void setCustomerId( java.lang.Integer value ) {
		this.__customer_id = value;
	}

	public java.util.Date getDateDelivered() {
		return this.__date_delivered;
	}

	public void setDateDelivered( java.util.Date value ) {
		this.__date_delivered = value;
	}

	public java.lang.String getMemo() {
		return this.__memo;
	}

	public void setMemo( java.lang.String value ) {
		this.__memo = value;
	}

	public void cloneCopy(BaseCrmDelivery __bean){
		__bean.setDeliveryId(getDeliveryId());
		__bean.setDeliveryCode(getDeliveryCode());
		__bean.setDeliveryName(getDeliveryName());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setStatusDelivery(getStatusDelivery());
		__bean.setFlagLocked(getFlagLocked());
		__bean.setCustomerId(getCustomerId());
		__bean.setDateDelivered(getDateDelivered());
		__bean.setMemo(getMemo());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getDeliveryId() == null ? "" : getDeliveryId());
		sb.append(",");
		sb.append(getDeliveryCode() == null ? "" : getDeliveryCode());
		sb.append(",");
		sb.append(getDeliveryName() == null ? "" : getDeliveryName());
		sb.append(",");
		sb.append(getEmployeeIdMaintainer() == null ? "" : getEmployeeIdMaintainer());
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
		sb.append(getStatusDelivery() == null ? "" : getStatusDelivery());
		sb.append(",");
		sb.append(getFlagLocked() == null ? "" : getFlagLocked());
		sb.append(",");
		sb.append(getCustomerId() == null ? "" : getCustomerId());
		sb.append(",");
		sb.append(getDateDelivered() == null ? "" : sdf.format(getDateDelivered()));
		sb.append(",");
		sb.append(getMemo() == null ? "" : getMemo());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmDelivery o) {
		return __delivery_id == null ? -1 : __delivery_id.compareTo(o.getDeliveryId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__delivery_id);
		hash = 97 * hash + Objects.hashCode(this.__delivery_code);
		hash = 97 * hash + Objects.hashCode(this.__delivery_name);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__status_delivery);
		hash = 97 * hash + Objects.hashCode(this.__flag_locked);
		hash = 97 * hash + Objects.hashCode(this.__customer_id);
		hash = 97 * hash + Objects.hashCode(this.__date_delivered);
		hash = 97 * hash + Objects.hashCode(this.__memo);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmDelivery o = (BaseCrmDelivery)obj;
		if(!Objects.equals(this.__delivery_id, o.getDeliveryId())) return false;
		if(!Objects.equals(this.__delivery_code, o.getDeliveryCode())) return false;
		if(!Objects.equals(this.__delivery_name, o.getDeliveryName())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__status_delivery, o.getStatusDelivery())) return false;
		if(!Objects.equals(this.__flag_locked, o.getFlagLocked())) return false;
		if(!Objects.equals(this.__customer_id, o.getCustomerId())) return false;
		if(!Objects.equals(this.__date_delivered, o.getDateDelivered())) return false;
		if(!Objects.equals(this.__memo, o.getMemo())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getDeliveryId() != null) sb.append(__wrapNumber(count++, "deliveryId", getDeliveryId()));
		if(getDeliveryCode() != null) sb.append(__wrapString(count++, "deliveryCode", getDeliveryCode()));
		if(getDeliveryName() != null) sb.append(__wrapString(count++, "deliveryName", getDeliveryName()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapString(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getDepartmentId() != null) sb.append(__wrapString(count++, "departmentId", getDepartmentId()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapString(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapString(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getStatusDelivery() != null) sb.append(__wrapNumber(count++, "statusDelivery", getStatusDelivery()));
		if(getFlagLocked() != null) sb.append(__wrapBoolean(count++, "flagLocked", getFlagLocked()));
		if(getCustomerId() != null) sb.append(__wrapNumber(count++, "customerId", getCustomerId()));
		if(getDateDelivered() != null) sb.append(__wrapDate(count++, "dateDelivered", getDateDelivered()));
		if(getMemo() != null) sb.append(__wrapString(count++, "memo", getMemo()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getDeliveryId() != null) res.put("deliveryId", getDeliveryId());
		if(getDeliveryCode() != null) res.put("deliveryCode", getDeliveryCode());
		if(getDeliveryName() != null) res.put("deliveryName", getDeliveryName());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getStatusDelivery() != null) res.put("statusDelivery", getStatusDelivery());
		if(getFlagLocked() != null) res.put("flagLocked", getFlagLocked());
		if(getCustomerId() != null) res.put("customerId", getCustomerId());
		if(getDateDelivered() != null) res.put("dateDelivered", getDateDelivered());
		if(getMemo() != null) res.put("memo", getMemo());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("deliveryId")) != null) setDeliveryId(__getInt(val)); 
		if((val = values.get("deliveryCode")) != null) setDeliveryCode(__getString(val));
		if((val = values.get("deliveryName")) != null) setDeliveryName(__getString(val));
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getString(val));
		if((val = values.get("departmentId")) != null) setDepartmentId(__getString(val));
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getString(val));
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getString(val));
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("statusDelivery")) != null) setStatusDelivery(__getInt(val)); 
		if((val = values.get("flagLocked")) != null) setFlagLocked(__getBoolean(val));
		if((val = values.get("customerId")) != null) setCustomerId(__getInt(val)); 
		if((val = values.get("dateDelivered")) != null) setDateDelivered(__getDate(val)); 
		if((val = values.get("memo")) != null) setMemo(__getString(val));
	}

	protected java.lang.Integer  __delivery_id ;
	protected java.lang.String  __delivery_code ;
	protected java.lang.String  __delivery_name ;
	protected java.lang.String  __employee_id_maintainer ;
	protected java.lang.String  __department_id ;
	protected java.lang.String  __employee_id_created ;
	protected java.util.Date  __date_created ;
	protected java.lang.String  __employee_id_updated ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Integer  __status_delivery ;
	protected java.lang.Boolean  __flag_locked ;
	protected java.lang.Integer  __customer_id ;
	protected java.util.Date  __date_delivered ;
	protected java.lang.String  __memo ;
}
