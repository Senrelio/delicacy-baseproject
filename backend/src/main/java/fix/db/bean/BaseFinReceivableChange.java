package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseFinReceivableChange extends GenericBase implements BaseFactory<BaseFinReceivableChange>, Comparable<BaseFinReceivableChange> 
{


	public static BaseFinReceivableChange newInstance(){
		return new BaseFinReceivableChange();
	}

	@Override
	public BaseFinReceivableChange make(){
		BaseFinReceivableChange b = new BaseFinReceivableChange();
		return b;
	}

	public final static java.lang.String CS_RECEIVABLE_CHANGE_ID = "receivable_change_id" ;
	public final static java.lang.String CS_RECEIVABLE_CHANGE_CODE = "receivable_change_code" ;
	public final static java.lang.String CS_CUSTOMER_ID = "customer_id" ;
	public final static java.lang.String CS_STATUS_RECEIVABLE_CHANGE = "status_receivable_change" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_DATE_CHANGED = "date_changed" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_ADDRESS_DELIVERY = "address_delivery" ;
	public final static java.lang.String CS_POSTCODE = "postcode" ;
	public final static java.lang.String CS_CONTACT_NAME = "contact_name" ;
	public final static java.lang.String CS_CONTACT_MOBILE = "contact_mobile" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_DESCRIPTION = "description" ;
	public final static java.lang.String CS_DATE_VALIDATION = "date_validation" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_INVALIDATION = "date_invalidation" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_REASON_INVALIDATION = "reason_invalidation" ;

	public final static java.lang.String ALL_CAPTIONS = "应收变更编码,应收变更编号,客户编码,变更单状态,维护人员工编码,变更日期,所属部门,邮寄地址,邮编,联系人姓名,联系人手机号,创建人编码,创建日期,描述,生效日期,修改人编码,作废日期,修改日期,作废原因";

	public java.lang.Integer getReceivableChangeId() {
		return this.__receivable_change_id;
	}

	public void setReceivableChangeId( java.lang.Integer value ) {
		this.__receivable_change_id = value;
	}

	public java.lang.String getReceivableChangeCode() {
		return this.__receivable_change_code;
	}

	public void setReceivableChangeCode( java.lang.String value ) {
		this.__receivable_change_code = value;
	}

	public java.lang.Integer getCustomerId() {
		return this.__customer_id;
	}

	public void setCustomerId( java.lang.Integer value ) {
		this.__customer_id = value;
	}

	public java.lang.Integer getStatusReceivableChange() {
		return this.__status_receivable_change;
	}

	public void setStatusReceivableChange( java.lang.Integer value ) {
		this.__status_receivable_change = value;
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return this.__employee_id_maintainer;
	}

	public void setEmployeeIdMaintainer( java.lang.Integer value ) {
		this.__employee_id_maintainer = value;
	}

	public java.util.Date getDateChanged() {
		return this.__date_changed;
	}

	public void setDateChanged( java.util.Date value ) {
		this.__date_changed = value;
	}

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
	}

	public java.lang.String getAddressDelivery() {
		return this.__address_delivery;
	}

	public void setAddressDelivery( java.lang.String value ) {
		this.__address_delivery = value;
	}

	public java.lang.String getPostcode() {
		return this.__postcode;
	}

	public void setPostcode( java.lang.String value ) {
		this.__postcode = value;
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

	public java.lang.String getDescription() {
		return this.__description;
	}

	public void setDescription( java.lang.String value ) {
		this.__description = value;
	}

	public java.util.Date getDateValidation() {
		return this.__date_validation;
	}

	public void setDateValidation( java.util.Date value ) {
		this.__date_validation = value;
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return this.__employee_id_updated;
	}

	public void setEmployeeIdUpdated( java.lang.Integer value ) {
		this.__employee_id_updated = value;
	}

	public java.util.Date getDateInvalidation() {
		return this.__date_invalidation;
	}

	public void setDateInvalidation( java.util.Date value ) {
		this.__date_invalidation = value;
	}

	public java.util.Date getDateUpdated() {
		return this.__date_updated;
	}

	public void setDateUpdated( java.util.Date value ) {
		this.__date_updated = value;
	}

	public java.lang.Integer getReasonInvalidation() {
		return this.__reason_invalidation;
	}

	public void setReasonInvalidation( java.lang.Integer value ) {
		this.__reason_invalidation = value;
	}

	public void cloneCopy(BaseFinReceivableChange __bean){
		__bean.setReceivableChangeId(getReceivableChangeId());
		__bean.setReceivableChangeCode(getReceivableChangeCode());
		__bean.setCustomerId(getCustomerId());
		__bean.setStatusReceivableChange(getStatusReceivableChange());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setDateChanged(getDateChanged());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setAddressDelivery(getAddressDelivery());
		__bean.setPostcode(getPostcode());
		__bean.setContactName(getContactName());
		__bean.setContactMobile(getContactMobile());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateCreated(getDateCreated());
		__bean.setDescription(getDescription());
		__bean.setDateValidation(getDateValidation());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateInvalidation(getDateInvalidation());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setReasonInvalidation(getReasonInvalidation());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getReceivableChangeId() == null ? "" : getReceivableChangeId());
		sb.append(",");
		sb.append(getReceivableChangeCode() == null ? "" : getReceivableChangeCode());
		sb.append(",");
		sb.append(getCustomerId() == null ? "" : getCustomerId());
		sb.append(",");
		sb.append(getStatusReceivableChange() == null ? "" : getStatusReceivableChange());
		sb.append(",");
		sb.append(getEmployeeIdMaintainer() == null ? "" : getEmployeeIdMaintainer());
		sb.append(",");
		sb.append(getDateChanged() == null ? "" : sdf.format(getDateChanged()));
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getAddressDelivery() == null ? "" : getAddressDelivery());
		sb.append(",");
		sb.append(getPostcode() == null ? "" : getPostcode());
		sb.append(",");
		sb.append(getContactName() == null ? "" : getContactName());
		sb.append(",");
		sb.append(getContactMobile() == null ? "" : getContactMobile());
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getDescription() == null ? "" : getDescription());
		sb.append(",");
		sb.append(getDateValidation() == null ? "" : sdf.format(getDateValidation()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getDateInvalidation() == null ? "" : sdf.format(getDateInvalidation()));
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getReasonInvalidation() == null ? "" : getReasonInvalidation());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseFinReceivableChange o) {
		return __receivable_change_id == null ? -1 : __receivable_change_id.compareTo(o.getReceivableChangeId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__receivable_change_id);
		hash = 97 * hash + Objects.hashCode(this.__receivable_change_code);
		hash = 97 * hash + Objects.hashCode(this.__customer_id);
		hash = 97 * hash + Objects.hashCode(this.__status_receivable_change);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__date_changed);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__address_delivery);
		hash = 97 * hash + Objects.hashCode(this.__postcode);
		hash = 97 * hash + Objects.hashCode(this.__contact_name);
		hash = 97 * hash + Objects.hashCode(this.__contact_mobile);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__description);
		hash = 97 * hash + Objects.hashCode(this.__date_validation);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_invalidation);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__reason_invalidation);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseFinReceivableChange o = (BaseFinReceivableChange)obj;
		if(!Objects.equals(this.__receivable_change_id, o.getReceivableChangeId())) return false;
		if(!Objects.equals(this.__receivable_change_code, o.getReceivableChangeCode())) return false;
		if(!Objects.equals(this.__customer_id, o.getCustomerId())) return false;
		if(!Objects.equals(this.__status_receivable_change, o.getStatusReceivableChange())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__date_changed, o.getDateChanged())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__address_delivery, o.getAddressDelivery())) return false;
		if(!Objects.equals(this.__postcode, o.getPostcode())) return false;
		if(!Objects.equals(this.__contact_name, o.getContactName())) return false;
		if(!Objects.equals(this.__contact_mobile, o.getContactMobile())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__description, o.getDescription())) return false;
		if(!Objects.equals(this.__date_validation, o.getDateValidation())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_invalidation, o.getDateInvalidation())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__reason_invalidation, o.getReasonInvalidation())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getReceivableChangeId() != null) sb.append(__wrapNumber(count++, "receivableChangeId", getReceivableChangeId()));
		if(getReceivableChangeCode() != null) sb.append(__wrapString(count++, "receivableChangeCode", getReceivableChangeCode()));
		if(getCustomerId() != null) sb.append(__wrapNumber(count++, "customerId", getCustomerId()));
		if(getStatusReceivableChange() != null) sb.append(__wrapNumber(count++, "statusReceivableChange", getStatusReceivableChange()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapNumber(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getDateChanged() != null) sb.append(__wrapDate(count++, "dateChanged", getDateChanged()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getAddressDelivery() != null) sb.append(__wrapString(count++, "addressDelivery", getAddressDelivery()));
		if(getPostcode() != null) sb.append(__wrapString(count++, "postcode", getPostcode()));
		if(getContactName() != null) sb.append(__wrapString(count++, "contactName", getContactName()));
		if(getContactMobile() != null) sb.append(__wrapString(count++, "contactMobile", getContactMobile()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getDescription() != null) sb.append(__wrapString(count++, "description", getDescription()));
		if(getDateValidation() != null) sb.append(__wrapDate(count++, "dateValidation", getDateValidation()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateInvalidation() != null) sb.append(__wrapDate(count++, "dateInvalidation", getDateInvalidation()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getReasonInvalidation() != null) sb.append(__wrapNumber(count++, "reasonInvalidation", getReasonInvalidation()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getReceivableChangeId() != null) res.put("receivableChangeId", getReceivableChangeId());
		if(getReceivableChangeCode() != null) res.put("receivableChangeCode", getReceivableChangeCode());
		if(getCustomerId() != null) res.put("customerId", getCustomerId());
		if(getStatusReceivableChange() != null) res.put("statusReceivableChange", getStatusReceivableChange());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getDateChanged() != null) res.put("dateChanged", getDateChanged());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getAddressDelivery() != null) res.put("addressDelivery", getAddressDelivery());
		if(getPostcode() != null) res.put("postcode", getPostcode());
		if(getContactName() != null) res.put("contactName", getContactName());
		if(getContactMobile() != null) res.put("contactMobile", getContactMobile());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getDescription() != null) res.put("description", getDescription());
		if(getDateValidation() != null) res.put("dateValidation", getDateValidation());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateInvalidation() != null) res.put("dateInvalidation", getDateInvalidation());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getReasonInvalidation() != null) res.put("reasonInvalidation", getReasonInvalidation());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("receivableChangeId")) != null) setReceivableChangeId(__getInt(val)); 
		if((val = values.get("receivableChangeCode")) != null) setReceivableChangeCode(__getString(val));
		if((val = values.get("customerId")) != null) setCustomerId(__getInt(val)); 
		if((val = values.get("statusReceivableChange")) != null) setStatusReceivableChange(__getInt(val)); 
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getInt(val)); 
		if((val = values.get("dateChanged")) != null) setDateChanged(__getDate(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("addressDelivery")) != null) setAddressDelivery(__getString(val));
		if((val = values.get("postcode")) != null) setPostcode(__getString(val));
		if((val = values.get("contactName")) != null) setContactName(__getString(val));
		if((val = values.get("contactMobile")) != null) setContactMobile(__getString(val));
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("description")) != null) setDescription(__getString(val));
		if((val = values.get("dateValidation")) != null) setDateValidation(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("dateInvalidation")) != null) setDateInvalidation(__getDate(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("reasonInvalidation")) != null) setReasonInvalidation(__getInt(val)); 
	}

	protected java.lang.Integer  __receivable_change_id ;
	protected java.lang.String  __receivable_change_code ;
	protected java.lang.Integer  __customer_id ;
	protected java.lang.Integer  __status_receivable_change ;
	protected java.lang.Integer  __employee_id_maintainer ;
	protected java.util.Date  __date_changed ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.String  __address_delivery ;
	protected java.lang.String  __postcode ;
	protected java.lang.String  __contact_name ;
	protected java.lang.String  __contact_mobile ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_created ;
	protected java.lang.String  __description ;
	protected java.util.Date  __date_validation ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.util.Date  __date_invalidation ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Integer  __reason_invalidation ;
}
