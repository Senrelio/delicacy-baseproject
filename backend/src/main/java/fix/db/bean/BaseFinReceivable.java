package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseFinReceivable extends GenericBase implements BaseFactory<BaseFinReceivable>, Comparable<BaseFinReceivable> 
{


	public static BaseFinReceivable newInstance(){
		return new BaseFinReceivable();
	}

	@Override
	public BaseFinReceivable make(){
		BaseFinReceivable b = new BaseFinReceivable();
		return b;
	}

	public final static java.lang.String CS_RECEIVABLE_ID = "receivable_id" ;
	public final static java.lang.String CS_ENTITY_TYPE = "entity_type" ;
	public final static java.lang.String CS_DESCRIPTION = "description" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_INVOICE_TYPE = "invoice_type" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_DATE_VALIDATION = "date_validation" ;
	public final static java.lang.String CS_CUSTOMER_ID = "customer_id" ;
	public final static java.lang.String CS_DATE_INVALIDATION = "date_invalidation" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_REASON_INVALIDATION = "reason_invalidation" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_DATE_DUE = "date_due" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_STATUS_RECEIVABLE = "status_receivable" ;
	public final static java.lang.String CS_CONTACT_ID = "contact_id" ;
	public final static java.lang.String CS_FLAG_OVERTIME = "flag_overtime" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_MOBILE = "mobile" ;
	public final static java.lang.String CS_COMPANY_NAME_INVOICE = "company_name_invoice" ;
	public final static java.lang.String CS_ADDRESS_DELIVERY = "address_delivery" ;
	public final static java.lang.String CS_POSTCODE = "postcode" ;

	public final static java.lang.String ALL_CAPTIONS = "应收单编码,主体类型,描述,维护人员工编码,发票种类,所属部门,生效日期,客户编码,作废日期,创建人编码,作废原因,创建日期,收款截止日期,修改人编码,应收单状态,联系人编码,是否已逾期,修改日期,联系手机,开票单位,邮寄地址,邮编";

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

	public java.lang.String getDescription() {
		return this.__description;
	}

	public void setDescription( java.lang.String value ) {
		this.__description = value;
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return this.__employee_id_maintainer;
	}

	public void setEmployeeIdMaintainer( java.lang.Integer value ) {
		this.__employee_id_maintainer = value;
	}

	public java.lang.Integer getInvoiceType() {
		return this.__invoice_type;
	}

	public void setInvoiceType( java.lang.Integer value ) {
		this.__invoice_type = value;
	}

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
	}

	public java.util.Date getDateValidation() {
		return this.__date_validation;
	}

	public void setDateValidation( java.util.Date value ) {
		this.__date_validation = value;
	}

	public java.lang.Integer getCustomerId() {
		return this.__customer_id;
	}

	public void setCustomerId( java.lang.Integer value ) {
		this.__customer_id = value;
	}

	public java.util.Date getDateInvalidation() {
		return this.__date_invalidation;
	}

	public void setDateInvalidation( java.util.Date value ) {
		this.__date_invalidation = value;
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.Integer value ) {
		this.__employee_id_created = value;
	}

	public java.lang.Integer getReasonInvalidation() {
		return this.__reason_invalidation;
	}

	public void setReasonInvalidation( java.lang.Integer value ) {
		this.__reason_invalidation = value;
	}

	public java.util.Date getDateCreated() {
		return this.__date_created;
	}

	public void setDateCreated( java.util.Date value ) {
		this.__date_created = value;
	}

	public java.util.Date getDateDue() {
		return this.__date_due;
	}

	public void setDateDue( java.util.Date value ) {
		this.__date_due = value;
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return this.__employee_id_updated;
	}

	public void setEmployeeIdUpdated( java.lang.Integer value ) {
		this.__employee_id_updated = value;
	}

	public java.lang.Integer getStatusReceivable() {
		return this.__status_receivable;
	}

	public void setStatusReceivable( java.lang.Integer value ) {
		this.__status_receivable = value;
	}

	public java.lang.Integer getContactId() {
		return this.__contact_id;
	}

	public void setContactId( java.lang.Integer value ) {
		this.__contact_id = value;
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

	public java.lang.String getMobile() {
		return this.__mobile;
	}

	public void setMobile( java.lang.String value ) {
		this.__mobile = value;
	}

	public java.lang.String getCompanyNameInvoice() {
		return this.__company_name_invoice;
	}

	public void setCompanyNameInvoice( java.lang.String value ) {
		this.__company_name_invoice = value;
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

	public void cloneCopy(BaseFinReceivable __bean){
		__bean.setReceivableId(getReceivableId());
		__bean.setEntityType(getEntityType());
		__bean.setDescription(getDescription());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setInvoiceType(getInvoiceType());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setDateValidation(getDateValidation());
		__bean.setCustomerId(getCustomerId());
		__bean.setDateInvalidation(getDateInvalidation());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setReasonInvalidation(getReasonInvalidation());
		__bean.setDateCreated(getDateCreated());
		__bean.setDateDue(getDateDue());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setStatusReceivable(getStatusReceivable());
		__bean.setContactId(getContactId());
		__bean.setFlagOvertime(getFlagOvertime());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setMobile(getMobile());
		__bean.setCompanyNameInvoice(getCompanyNameInvoice());
		__bean.setAddressDelivery(getAddressDelivery());
		__bean.setPostcode(getPostcode());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getReceivableId() == null ? "" : getReceivableId());
		sb.append(",");
		sb.append(getEntityType() == null ? "" : getEntityType());
		sb.append(",");
		sb.append(getDescription() == null ? "" : getDescription());
		sb.append(",");
		sb.append(getEmployeeIdMaintainer() == null ? "" : getEmployeeIdMaintainer());
		sb.append(",");
		sb.append(getInvoiceType() == null ? "" : getInvoiceType());
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getDateValidation() == null ? "" : sdf.format(getDateValidation()));
		sb.append(",");
		sb.append(getCustomerId() == null ? "" : getCustomerId());
		sb.append(",");
		sb.append(getDateInvalidation() == null ? "" : sdf.format(getDateInvalidation()));
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getReasonInvalidation() == null ? "" : getReasonInvalidation());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getDateDue() == null ? "" : sdf.format(getDateDue()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getStatusReceivable() == null ? "" : getStatusReceivable());
		sb.append(",");
		sb.append(getContactId() == null ? "" : getContactId());
		sb.append(",");
		sb.append(getFlagOvertime() == null ? "" : getFlagOvertime());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getMobile() == null ? "" : getMobile());
		sb.append(",");
		sb.append(getCompanyNameInvoice() == null ? "" : getCompanyNameInvoice());
		sb.append(",");
		sb.append(getAddressDelivery() == null ? "" : getAddressDelivery());
		sb.append(",");
		sb.append(getPostcode() == null ? "" : getPostcode());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseFinReceivable o) {
		return __receivable_id == null ? -1 : __receivable_id.compareTo(o.getReceivableId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__receivable_id);
		hash = 97 * hash + Objects.hashCode(this.__entity_type);
		hash = 97 * hash + Objects.hashCode(this.__description);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__invoice_type);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__date_validation);
		hash = 97 * hash + Objects.hashCode(this.__customer_id);
		hash = 97 * hash + Objects.hashCode(this.__date_invalidation);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__reason_invalidation);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__date_due);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__status_receivable);
		hash = 97 * hash + Objects.hashCode(this.__contact_id);
		hash = 97 * hash + Objects.hashCode(this.__flag_overtime);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__mobile);
		hash = 97 * hash + Objects.hashCode(this.__company_name_invoice);
		hash = 97 * hash + Objects.hashCode(this.__address_delivery);
		hash = 97 * hash + Objects.hashCode(this.__postcode);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseFinReceivable o = (BaseFinReceivable)obj;
		if(!Objects.equals(this.__receivable_id, o.getReceivableId())) return false;
		if(!Objects.equals(this.__entity_type, o.getEntityType())) return false;
		if(!Objects.equals(this.__description, o.getDescription())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__invoice_type, o.getInvoiceType())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__date_validation, o.getDateValidation())) return false;
		if(!Objects.equals(this.__customer_id, o.getCustomerId())) return false;
		if(!Objects.equals(this.__date_invalidation, o.getDateInvalidation())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__reason_invalidation, o.getReasonInvalidation())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__date_due, o.getDateDue())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__status_receivable, o.getStatusReceivable())) return false;
		if(!Objects.equals(this.__contact_id, o.getContactId())) return false;
		if(!Objects.equals(this.__flag_overtime, o.getFlagOvertime())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__mobile, o.getMobile())) return false;
		if(!Objects.equals(this.__company_name_invoice, o.getCompanyNameInvoice())) return false;
		if(!Objects.equals(this.__address_delivery, o.getAddressDelivery())) return false;
		if(!Objects.equals(this.__postcode, o.getPostcode())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getReceivableId() != null) sb.append(__wrapNumber(count++, "receivableId", getReceivableId()));
		if(getEntityType() != null) sb.append(__wrapNumber(count++, "entityType", getEntityType()));
		if(getDescription() != null) sb.append(__wrapString(count++, "description", getDescription()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapNumber(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getInvoiceType() != null) sb.append(__wrapNumber(count++, "invoiceType", getInvoiceType()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getDateValidation() != null) sb.append(__wrapDate(count++, "dateValidation", getDateValidation()));
		if(getCustomerId() != null) sb.append(__wrapNumber(count++, "customerId", getCustomerId()));
		if(getDateInvalidation() != null) sb.append(__wrapDate(count++, "dateInvalidation", getDateInvalidation()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getReasonInvalidation() != null) sb.append(__wrapNumber(count++, "reasonInvalidation", getReasonInvalidation()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getDateDue() != null) sb.append(__wrapDate(count++, "dateDue", getDateDue()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getStatusReceivable() != null) sb.append(__wrapNumber(count++, "statusReceivable", getStatusReceivable()));
		if(getContactId() != null) sb.append(__wrapNumber(count++, "contactId", getContactId()));
		if(getFlagOvertime() != null) sb.append(__wrapBoolean(count++, "flagOvertime", getFlagOvertime()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getMobile() != null) sb.append(__wrapString(count++, "mobile", getMobile()));
		if(getCompanyNameInvoice() != null) sb.append(__wrapString(count++, "companyNameInvoice", getCompanyNameInvoice()));
		if(getAddressDelivery() != null) sb.append(__wrapString(count++, "addressDelivery", getAddressDelivery()));
		if(getPostcode() != null) sb.append(__wrapString(count++, "postcode", getPostcode()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getReceivableId() != null) res.put("receivableId", getReceivableId());
		if(getEntityType() != null) res.put("entityType", getEntityType());
		if(getDescription() != null) res.put("description", getDescription());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getInvoiceType() != null) res.put("invoiceType", getInvoiceType());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getDateValidation() != null) res.put("dateValidation", getDateValidation());
		if(getCustomerId() != null) res.put("customerId", getCustomerId());
		if(getDateInvalidation() != null) res.put("dateInvalidation", getDateInvalidation());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getReasonInvalidation() != null) res.put("reasonInvalidation", getReasonInvalidation());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getDateDue() != null) res.put("dateDue", getDateDue());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getStatusReceivable() != null) res.put("statusReceivable", getStatusReceivable());
		if(getContactId() != null) res.put("contactId", getContactId());
		if(getFlagOvertime() != null) res.put("flagOvertime", getFlagOvertime());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getMobile() != null) res.put("mobile", getMobile());
		if(getCompanyNameInvoice() != null) res.put("companyNameInvoice", getCompanyNameInvoice());
		if(getAddressDelivery() != null) res.put("addressDelivery", getAddressDelivery());
		if(getPostcode() != null) res.put("postcode", getPostcode());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("receivableId")) != null) setReceivableId(__getInt(val)); 
		if((val = values.get("entityType")) != null) setEntityType(__getInt(val)); 
		if((val = values.get("description")) != null) setDescription(__getString(val));
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getInt(val)); 
		if((val = values.get("invoiceType")) != null) setInvoiceType(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("dateValidation")) != null) setDateValidation(__getDate(val)); 
		if((val = values.get("customerId")) != null) setCustomerId(__getInt(val)); 
		if((val = values.get("dateInvalidation")) != null) setDateInvalidation(__getDate(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("reasonInvalidation")) != null) setReasonInvalidation(__getInt(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("dateDue")) != null) setDateDue(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("statusReceivable")) != null) setStatusReceivable(__getInt(val)); 
		if((val = values.get("contactId")) != null) setContactId(__getInt(val)); 
		if((val = values.get("flagOvertime")) != null) setFlagOvertime(__getBoolean(val));
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("mobile")) != null) setMobile(__getString(val));
		if((val = values.get("companyNameInvoice")) != null) setCompanyNameInvoice(__getString(val));
		if((val = values.get("addressDelivery")) != null) setAddressDelivery(__getString(val));
		if((val = values.get("postcode")) != null) setPostcode(__getString(val));
	}

	protected java.lang.Integer  __receivable_id ;
	protected java.lang.Integer  __entity_type ;
	protected java.lang.String  __description ;
	protected java.lang.Integer  __employee_id_maintainer ;
	protected java.lang.Integer  __invoice_type ;
	protected java.lang.Integer  __department_id ;
	protected java.util.Date  __date_validation ;
	protected java.lang.Integer  __customer_id ;
	protected java.util.Date  __date_invalidation ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.lang.Integer  __reason_invalidation ;
	protected java.util.Date  __date_created ;
	protected java.util.Date  __date_due ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.lang.Integer  __status_receivable ;
	protected java.lang.Integer  __contact_id ;
	protected java.lang.Boolean  __flag_overtime ;
	protected java.util.Date  __date_updated ;
	protected java.lang.String  __mobile ;
	protected java.lang.String  __company_name_invoice ;
	protected java.lang.String  __address_delivery ;
	protected java.lang.String  __postcode ;
}
