package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseFinInvoice extends GenericBase implements BaseFactory<BaseFinInvoice>, Comparable<BaseFinInvoice> 
{


	public static BaseFinInvoice newInstance(){
		return new BaseFinInvoice();
	}

	@Override
	public BaseFinInvoice make(){
		BaseFinInvoice b = new BaseFinInvoice();
		return b;
	}

	public final static java.lang.String CS_INVOICE_ID = "invoice_id" ;
	public final static java.lang.String CS_INVOICE_CODE = "invoice_code" ;
	public final static java.lang.String CS_CUSTOMER_ID = "customer_id" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_CONTACT_NAME = "contact_name" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_CONTACT_MOBILE = "contact_mobile" ;
	public final static java.lang.String CS_CUSTOMER_NAME = "customer_name" ;
	public final static java.lang.String CS_ADDRESS_DELIVERY = "address_delivery" ;
	public final static java.lang.String CS_POSTCODE = "postcode" ;
	public final static java.lang.String CS_STATUS_INVOICE = "status_invoice" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_INVOICE_TYPE = "invoice_type" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_ISSUED = "date_issued" ;
	public final static java.lang.String CS_DATE_VALIDATION = "date_validation" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_DESCRIPTION_INVOICE = "description_invoice" ;

	public final static java.lang.String ALL_CAPTIONS = "发票编码,发票编号,客户编码,维护人员工编码,联系人姓名,所属部门,联系人手机,开票客户名,邮寄地址,邮编,发票状态,创建人编码,发票种类,创建日期,修改人编码,发票日期,生效日期,修改日期,发票描述";

	public java.lang.Integer getInvoiceId() {
		return this.__invoice_id;
	}

	public void setInvoiceId( java.lang.Integer value ) {
		this.__invoice_id = value;
	}

	public java.lang.String getInvoiceCode() {
		return this.__invoice_code;
	}

	public void setInvoiceCode( java.lang.String value ) {
		this.__invoice_code = value;
	}

	public java.lang.Integer getCustomerId() {
		return this.__customer_id;
	}

	public void setCustomerId( java.lang.Integer value ) {
		this.__customer_id = value;
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return this.__employee_id_maintainer;
	}

	public void setEmployeeIdMaintainer( java.lang.Integer value ) {
		this.__employee_id_maintainer = value;
	}

	public java.lang.String getContactName() {
		return this.__contact_name;
	}

	public void setContactName( java.lang.String value ) {
		this.__contact_name = value;
	}

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
	}

	public java.lang.String getContactMobile() {
		return this.__contact_mobile;
	}

	public void setContactMobile( java.lang.String value ) {
		this.__contact_mobile = value;
	}

	public java.lang.String getCustomerName() {
		return this.__customer_name;
	}

	public void setCustomerName( java.lang.String value ) {
		this.__customer_name = value;
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

	public java.lang.Integer getStatusInvoice() {
		return this.__status_invoice;
	}

	public void setStatusInvoice( java.lang.Integer value ) {
		this.__status_invoice = value;
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.Integer value ) {
		this.__employee_id_created = value;
	}

	public java.lang.Integer getInvoiceType() {
		return this.__invoice_type;
	}

	public void setInvoiceType( java.lang.Integer value ) {
		this.__invoice_type = value;
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

	public java.util.Date getDateIssued() {
		return this.__date_issued;
	}

	public void setDateIssued( java.util.Date value ) {
		this.__date_issued = value;
	}

	public java.util.Date getDateValidation() {
		return this.__date_validation;
	}

	public void setDateValidation( java.util.Date value ) {
		this.__date_validation = value;
	}

	public java.util.Date getDateUpdated() {
		return this.__date_updated;
	}

	public void setDateUpdated( java.util.Date value ) {
		this.__date_updated = value;
	}

	public java.lang.String getDescriptionInvoice() {
		return this.__description_invoice;
	}

	public void setDescriptionInvoice( java.lang.String value ) {
		this.__description_invoice = value;
	}

	public void cloneCopy(BaseFinInvoice __bean){
		__bean.setInvoiceId(getInvoiceId());
		__bean.setInvoiceCode(getInvoiceCode());
		__bean.setCustomerId(getCustomerId());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setContactName(getContactName());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setContactMobile(getContactMobile());
		__bean.setCustomerName(getCustomerName());
		__bean.setAddressDelivery(getAddressDelivery());
		__bean.setPostcode(getPostcode());
		__bean.setStatusInvoice(getStatusInvoice());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setInvoiceType(getInvoiceType());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateIssued(getDateIssued());
		__bean.setDateValidation(getDateValidation());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setDescriptionInvoice(getDescriptionInvoice());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getInvoiceId() == null ? "" : getInvoiceId());
		sb.append(",");
		sb.append(getInvoiceCode() == null ? "" : getInvoiceCode());
		sb.append(",");
		sb.append(getCustomerId() == null ? "" : getCustomerId());
		sb.append(",");
		sb.append(getEmployeeIdMaintainer() == null ? "" : getEmployeeIdMaintainer());
		sb.append(",");
		sb.append(getContactName() == null ? "" : getContactName());
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getContactMobile() == null ? "" : getContactMobile());
		sb.append(",");
		sb.append(getCustomerName() == null ? "" : getCustomerName());
		sb.append(",");
		sb.append(getAddressDelivery() == null ? "" : getAddressDelivery());
		sb.append(",");
		sb.append(getPostcode() == null ? "" : getPostcode());
		sb.append(",");
		sb.append(getStatusInvoice() == null ? "" : getStatusInvoice());
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getInvoiceType() == null ? "" : getInvoiceType());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getDateIssued() == null ? "" : sdf.format(getDateIssued()));
		sb.append(",");
		sb.append(getDateValidation() == null ? "" : sdf.format(getDateValidation()));
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getDescriptionInvoice() == null ? "" : getDescriptionInvoice());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseFinInvoice o) {
		return __invoice_id == null ? -1 : __invoice_id.compareTo(o.getInvoiceId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__invoice_id);
		hash = 97 * hash + Objects.hashCode(this.__invoice_code);
		hash = 97 * hash + Objects.hashCode(this.__customer_id);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__contact_name);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__contact_mobile);
		hash = 97 * hash + Objects.hashCode(this.__customer_name);
		hash = 97 * hash + Objects.hashCode(this.__address_delivery);
		hash = 97 * hash + Objects.hashCode(this.__postcode);
		hash = 97 * hash + Objects.hashCode(this.__status_invoice);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__invoice_type);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_issued);
		hash = 97 * hash + Objects.hashCode(this.__date_validation);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__description_invoice);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseFinInvoice o = (BaseFinInvoice)obj;
		if(!Objects.equals(this.__invoice_id, o.getInvoiceId())) return false;
		if(!Objects.equals(this.__invoice_code, o.getInvoiceCode())) return false;
		if(!Objects.equals(this.__customer_id, o.getCustomerId())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__contact_name, o.getContactName())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__contact_mobile, o.getContactMobile())) return false;
		if(!Objects.equals(this.__customer_name, o.getCustomerName())) return false;
		if(!Objects.equals(this.__address_delivery, o.getAddressDelivery())) return false;
		if(!Objects.equals(this.__postcode, o.getPostcode())) return false;
		if(!Objects.equals(this.__status_invoice, o.getStatusInvoice())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__invoice_type, o.getInvoiceType())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_issued, o.getDateIssued())) return false;
		if(!Objects.equals(this.__date_validation, o.getDateValidation())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__description_invoice, o.getDescriptionInvoice())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getInvoiceId() != null) sb.append(__wrapNumber(count++, "invoiceId", getInvoiceId()));
		if(getInvoiceCode() != null) sb.append(__wrapString(count++, "invoiceCode", getInvoiceCode()));
		if(getCustomerId() != null) sb.append(__wrapNumber(count++, "customerId", getCustomerId()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapNumber(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getContactName() != null) sb.append(__wrapString(count++, "contactName", getContactName()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getContactMobile() != null) sb.append(__wrapString(count++, "contactMobile", getContactMobile()));
		if(getCustomerName() != null) sb.append(__wrapString(count++, "customerName", getCustomerName()));
		if(getAddressDelivery() != null) sb.append(__wrapString(count++, "addressDelivery", getAddressDelivery()));
		if(getPostcode() != null) sb.append(__wrapString(count++, "postcode", getPostcode()));
		if(getStatusInvoice() != null) sb.append(__wrapNumber(count++, "statusInvoice", getStatusInvoice()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getInvoiceType() != null) sb.append(__wrapNumber(count++, "invoiceType", getInvoiceType()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateIssued() != null) sb.append(__wrapDate(count++, "dateIssued", getDateIssued()));
		if(getDateValidation() != null) sb.append(__wrapDate(count++, "dateValidation", getDateValidation()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getDescriptionInvoice() != null) sb.append(__wrapString(count++, "descriptionInvoice", getDescriptionInvoice()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getInvoiceId() != null) res.put("invoiceId", getInvoiceId());
		if(getInvoiceCode() != null) res.put("invoiceCode", getInvoiceCode());
		if(getCustomerId() != null) res.put("customerId", getCustomerId());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getContactName() != null) res.put("contactName", getContactName());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getContactMobile() != null) res.put("contactMobile", getContactMobile());
		if(getCustomerName() != null) res.put("customerName", getCustomerName());
		if(getAddressDelivery() != null) res.put("addressDelivery", getAddressDelivery());
		if(getPostcode() != null) res.put("postcode", getPostcode());
		if(getStatusInvoice() != null) res.put("statusInvoice", getStatusInvoice());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getInvoiceType() != null) res.put("invoiceType", getInvoiceType());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateIssued() != null) res.put("dateIssued", getDateIssued());
		if(getDateValidation() != null) res.put("dateValidation", getDateValidation());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getDescriptionInvoice() != null) res.put("descriptionInvoice", getDescriptionInvoice());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("invoiceId")) != null) setInvoiceId(__getInt(val)); 
		if((val = values.get("invoiceCode")) != null) setInvoiceCode(__getString(val));
		if((val = values.get("customerId")) != null) setCustomerId(__getInt(val)); 
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getInt(val)); 
		if((val = values.get("contactName")) != null) setContactName(__getString(val));
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("contactMobile")) != null) setContactMobile(__getString(val));
		if((val = values.get("customerName")) != null) setCustomerName(__getString(val));
		if((val = values.get("addressDelivery")) != null) setAddressDelivery(__getString(val));
		if((val = values.get("postcode")) != null) setPostcode(__getString(val));
		if((val = values.get("statusInvoice")) != null) setStatusInvoice(__getInt(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("invoiceType")) != null) setInvoiceType(__getInt(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("dateIssued")) != null) setDateIssued(__getDate(val)); 
		if((val = values.get("dateValidation")) != null) setDateValidation(__getDate(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("descriptionInvoice")) != null) setDescriptionInvoice(__getString(val));
	}

	protected java.lang.Integer  __invoice_id ;
	protected java.lang.String  __invoice_code ;
	protected java.lang.Integer  __customer_id ;
	protected java.lang.Integer  __employee_id_maintainer ;
	protected java.lang.String  __contact_name ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.String  __contact_mobile ;
	protected java.lang.String  __customer_name ;
	protected java.lang.String  __address_delivery ;
	protected java.lang.String  __postcode ;
	protected java.lang.Integer  __status_invoice ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.lang.Integer  __invoice_type ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.util.Date  __date_issued ;
	protected java.util.Date  __date_validation ;
	protected java.util.Date  __date_updated ;
	protected java.lang.String  __description_invoice ;
}
