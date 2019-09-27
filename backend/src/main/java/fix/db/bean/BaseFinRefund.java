package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseFinRefund extends GenericBase implements BaseFactory<BaseFinRefund>, Comparable<BaseFinRefund> 
{


	public static BaseFinRefund newInstance(){
		return new BaseFinRefund();
	}

	@Override
	public BaseFinRefund make(){
		BaseFinRefund b = new BaseFinRefund();
		return b;
	}

	public final static java.lang.String CS_REFUND_ID = "refund_id" ;
	public final static java.lang.String CS_REFUND_CODE = "refund_code" ;
	public final static java.lang.String CS_DATE_REFUNDED = "date_refunded" ;
	public final static java.lang.String CS_DATE_VALIDATION = "date_validation" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_CUSTOMER_ID = "customer_id" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_REASON_REFUND = "reason_refund" ;
	public final static java.lang.String CS_STATUS_REFUND = "status_refund" ;
	public final static java.lang.String CS_CONTACT_NAME = "contact_name" ;
	public final static java.lang.String CS_CONTACT_MOBILE = "contact_mobile" ;
	public final static java.lang.String CS_REASON_INVALIDATION = "reason_invalidation" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_INVALIDATION = "date_invalidation" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DESCRIPTION_REFUND = "description_refund" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;

	public final static java.lang.String ALL_CAPTIONS = "退款编码,退款编号,退款日期,生效日期,维护人员工编码,客户编码,所属部门,退款原因,退款状态,联系人姓名,联系人手机号,作废原因,创建人编码,作废日期,创建日期,修改人编码,退款描述,修改日期";

	public java.lang.Integer getRefundId() {
		return this.__refund_id;
	}

	public void setRefundId( java.lang.Integer value ) {
		this.__refund_id = value;
	}

	public java.lang.String getRefundCode() {
		return this.__refund_code;
	}

	public void setRefundCode( java.lang.String value ) {
		this.__refund_code = value;
	}

	public java.util.Date getDateRefunded() {
		return this.__date_refunded;
	}

	public void setDateRefunded( java.util.Date value ) {
		this.__date_refunded = value;
	}

	public java.util.Date getDateValidation() {
		return this.__date_validation;
	}

	public void setDateValidation( java.util.Date value ) {
		this.__date_validation = value;
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return this.__employee_id_maintainer;
	}

	public void setEmployeeIdMaintainer( java.lang.Integer value ) {
		this.__employee_id_maintainer = value;
	}

	public java.lang.Integer getCustomerId() {
		return this.__customer_id;
	}

	public void setCustomerId( java.lang.Integer value ) {
		this.__customer_id = value;
	}

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
	}

	public java.lang.Integer getReasonRefund() {
		return this.__reason_refund;
	}

	public void setReasonRefund( java.lang.Integer value ) {
		this.__reason_refund = value;
	}

	public java.lang.Integer getStatusRefund() {
		return this.__status_refund;
	}

	public void setStatusRefund( java.lang.Integer value ) {
		this.__status_refund = value;
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

	public java.lang.Integer getReasonInvalidation() {
		return this.__reason_invalidation;
	}

	public void setReasonInvalidation( java.lang.Integer value ) {
		this.__reason_invalidation = value;
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.Integer value ) {
		this.__employee_id_created = value;
	}

	public java.util.Date getDateInvalidation() {
		return this.__date_invalidation;
	}

	public void setDateInvalidation( java.util.Date value ) {
		this.__date_invalidation = value;
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

	public java.lang.String getDescriptionRefund() {
		return this.__description_refund;
	}

	public void setDescriptionRefund( java.lang.String value ) {
		this.__description_refund = value;
	}

	public java.util.Date getDateUpdated() {
		return this.__date_updated;
	}

	public void setDateUpdated( java.util.Date value ) {
		this.__date_updated = value;
	}

	public void cloneCopy(BaseFinRefund __bean){
		__bean.setRefundId(getRefundId());
		__bean.setRefundCode(getRefundCode());
		__bean.setDateRefunded(getDateRefunded());
		__bean.setDateValidation(getDateValidation());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setCustomerId(getCustomerId());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setReasonRefund(getReasonRefund());
		__bean.setStatusRefund(getStatusRefund());
		__bean.setContactName(getContactName());
		__bean.setContactMobile(getContactMobile());
		__bean.setReasonInvalidation(getReasonInvalidation());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateInvalidation(getDateInvalidation());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDescriptionRefund(getDescriptionRefund());
		__bean.setDateUpdated(getDateUpdated());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getRefundId() == null ? "" : getRefundId());
		sb.append(",");
		sb.append(getRefundCode() == null ? "" : getRefundCode());
		sb.append(",");
		sb.append(getDateRefunded() == null ? "" : sdf.format(getDateRefunded()));
		sb.append(",");
		sb.append(getDateValidation() == null ? "" : sdf.format(getDateValidation()));
		sb.append(",");
		sb.append(getEmployeeIdMaintainer() == null ? "" : getEmployeeIdMaintainer());
		sb.append(",");
		sb.append(getCustomerId() == null ? "" : getCustomerId());
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getReasonRefund() == null ? "" : getReasonRefund());
		sb.append(",");
		sb.append(getStatusRefund() == null ? "" : getStatusRefund());
		sb.append(",");
		sb.append(getContactName() == null ? "" : getContactName());
		sb.append(",");
		sb.append(getContactMobile() == null ? "" : getContactMobile());
		sb.append(",");
		sb.append(getReasonInvalidation() == null ? "" : getReasonInvalidation());
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getDateInvalidation() == null ? "" : sdf.format(getDateInvalidation()));
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getDescriptionRefund() == null ? "" : getDescriptionRefund());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		return sb.toString();
	}

	@Override
	public int compareTo(BaseFinRefund o) {
		return __refund_id == null ? -1 : __refund_id.compareTo(o.getRefundId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__refund_id);
		hash = 97 * hash + Objects.hashCode(this.__refund_code);
		hash = 97 * hash + Objects.hashCode(this.__date_refunded);
		hash = 97 * hash + Objects.hashCode(this.__date_validation);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__customer_id);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__reason_refund);
		hash = 97 * hash + Objects.hashCode(this.__status_refund);
		hash = 97 * hash + Objects.hashCode(this.__contact_name);
		hash = 97 * hash + Objects.hashCode(this.__contact_mobile);
		hash = 97 * hash + Objects.hashCode(this.__reason_invalidation);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_invalidation);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__description_refund);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseFinRefund o = (BaseFinRefund)obj;
		if(!Objects.equals(this.__refund_id, o.getRefundId())) return false;
		if(!Objects.equals(this.__refund_code, o.getRefundCode())) return false;
		if(!Objects.equals(this.__date_refunded, o.getDateRefunded())) return false;
		if(!Objects.equals(this.__date_validation, o.getDateValidation())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__customer_id, o.getCustomerId())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__reason_refund, o.getReasonRefund())) return false;
		if(!Objects.equals(this.__status_refund, o.getStatusRefund())) return false;
		if(!Objects.equals(this.__contact_name, o.getContactName())) return false;
		if(!Objects.equals(this.__contact_mobile, o.getContactMobile())) return false;
		if(!Objects.equals(this.__reason_invalidation, o.getReasonInvalidation())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_invalidation, o.getDateInvalidation())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__description_refund, o.getDescriptionRefund())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getRefundId() != null) sb.append(__wrapNumber(count++, "refundId", getRefundId()));
		if(getRefundCode() != null) sb.append(__wrapString(count++, "refundCode", getRefundCode()));
		if(getDateRefunded() != null) sb.append(__wrapDate(count++, "dateRefunded", getDateRefunded()));
		if(getDateValidation() != null) sb.append(__wrapDate(count++, "dateValidation", getDateValidation()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapNumber(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getCustomerId() != null) sb.append(__wrapNumber(count++, "customerId", getCustomerId()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getReasonRefund() != null) sb.append(__wrapNumber(count++, "reasonRefund", getReasonRefund()));
		if(getStatusRefund() != null) sb.append(__wrapNumber(count++, "statusRefund", getStatusRefund()));
		if(getContactName() != null) sb.append(__wrapString(count++, "contactName", getContactName()));
		if(getContactMobile() != null) sb.append(__wrapString(count++, "contactMobile", getContactMobile()));
		if(getReasonInvalidation() != null) sb.append(__wrapNumber(count++, "reasonInvalidation", getReasonInvalidation()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateInvalidation() != null) sb.append(__wrapDate(count++, "dateInvalidation", getDateInvalidation()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDescriptionRefund() != null) sb.append(__wrapString(count++, "descriptionRefund", getDescriptionRefund()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getRefundId() != null) res.put("refundId", getRefundId());
		if(getRefundCode() != null) res.put("refundCode", getRefundCode());
		if(getDateRefunded() != null) res.put("dateRefunded", getDateRefunded());
		if(getDateValidation() != null) res.put("dateValidation", getDateValidation());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getCustomerId() != null) res.put("customerId", getCustomerId());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getReasonRefund() != null) res.put("reasonRefund", getReasonRefund());
		if(getStatusRefund() != null) res.put("statusRefund", getStatusRefund());
		if(getContactName() != null) res.put("contactName", getContactName());
		if(getContactMobile() != null) res.put("contactMobile", getContactMobile());
		if(getReasonInvalidation() != null) res.put("reasonInvalidation", getReasonInvalidation());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateInvalidation() != null) res.put("dateInvalidation", getDateInvalidation());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDescriptionRefund() != null) res.put("descriptionRefund", getDescriptionRefund());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("refundId")) != null) setRefundId(__getInt(val)); 
		if((val = values.get("refundCode")) != null) setRefundCode(__getString(val));
		if((val = values.get("dateRefunded")) != null) setDateRefunded(__getDate(val)); 
		if((val = values.get("dateValidation")) != null) setDateValidation(__getDate(val)); 
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getInt(val)); 
		if((val = values.get("customerId")) != null) setCustomerId(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("reasonRefund")) != null) setReasonRefund(__getInt(val)); 
		if((val = values.get("statusRefund")) != null) setStatusRefund(__getInt(val)); 
		if((val = values.get("contactName")) != null) setContactName(__getString(val));
		if((val = values.get("contactMobile")) != null) setContactMobile(__getString(val));
		if((val = values.get("reasonInvalidation")) != null) setReasonInvalidation(__getInt(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateInvalidation")) != null) setDateInvalidation(__getDate(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("descriptionRefund")) != null) setDescriptionRefund(__getString(val));
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
	}

	protected java.lang.Integer  __refund_id ;
	protected java.lang.String  __refund_code ;
	protected java.util.Date  __date_refunded ;
	protected java.util.Date  __date_validation ;
	protected java.lang.Integer  __employee_id_maintainer ;
	protected java.lang.Integer  __customer_id ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Integer  __reason_refund ;
	protected java.lang.Integer  __status_refund ;
	protected java.lang.String  __contact_name ;
	protected java.lang.String  __contact_mobile ;
	protected java.lang.Integer  __reason_invalidation ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_invalidation ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.lang.String  __description_refund ;
	protected java.util.Date  __date_updated ;
}
