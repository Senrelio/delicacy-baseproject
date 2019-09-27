package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmOpportunityContactsRole extends GenericBase implements BaseFactory<BaseCrmOpportunityContactsRole>, Comparable<BaseCrmOpportunityContactsRole> 
{


	public static BaseCrmOpportunityContactsRole newInstance(){
		return new BaseCrmOpportunityContactsRole();
	}

	@Override
	public BaseCrmOpportunityContactsRole make(){
		BaseCrmOpportunityContactsRole b = new BaseCrmOpportunityContactsRole();
		return b;
	}

	public final static java.lang.String CS_OPPORTUNITY_CONTACT_ROLE_ID = "opportunity_contact_role_id" ;
	public final static java.lang.String CS_ENTITY_TYPE = "entity_type" ;
	public final static java.lang.String CS_OPPORTUNITY_ID = "opportunity_id" ;
	public final static java.lang.String CS_CONTACT_ID = "contact_id" ;
	public final static java.lang.String CS_FLAG_MAIN_CONTACT = "flag_main_contact" ;
	public final static java.lang.String CS_CUSTOMER_ID = "customer_id" ;
	public final static java.lang.String CS_POSITION = "position" ;
	public final static java.lang.String CS_TELEPHONE = "telephone" ;
	public final static java.lang.String CS_MOBILE = "mobile" ;
	public final static java.lang.String CS_EMAIL = "email" ;
	public final static java.lang.String CS_CONTACT_ROLE_IN_OPPORTUNITY = "contact_role_in_opportunity" ;
	public final static java.lang.String CS_CONTACT_STANDPOINT_IN_OPPORTUNITY = "contact_standpoint_in_opportunity" ;
	public final static java.lang.String CS_CONTACT_FAMILIARITY = "contact_familiarity" ;
	public final static java.lang.String CS_CONTACT_ROLE_IN_CUSTOMER = "contact_role_in_customer" ;
	public final static java.lang.String CS_IDENTIFIABLE_CHARACTERISTIC = "identifiable_characteristic" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER_AT_THAT_TIME = "employee_id_maintainer_at_that_time" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;

	public final static java.lang.String ALL_CAPTIONS = "销售机会-<联系人-角色编码,主体类型,销售机会编码,联系人编码,是否为主要联系人,联系人所属客户编码,联系人职位,电话,手机,邮箱,联系人在销售机会中的角色,联系人在销售机会中的立场,联系人熟悉度,联系人在客户公司中的角色,特征性格,当时的维护人员工编码,部门编码,创建人编码,创建日期,修改人编码,修改日期";

	public java.lang.Integer getOpportunityContactRoleId() {
		return this.__opportunity_contact_role_id;
	}

	public void setOpportunityContactRoleId( java.lang.Integer value ) {
		this.__opportunity_contact_role_id = value;
	}

	public java.lang.Integer getEntityType() {
		return this.__entity_type;
	}

	public void setEntityType( java.lang.Integer value ) {
		this.__entity_type = value;
	}

	public java.lang.Integer getOpportunityId() {
		return this.__opportunity_id;
	}

	public void setOpportunityId( java.lang.Integer value ) {
		this.__opportunity_id = value;
	}

	public java.lang.Integer getContactId() {
		return this.__contact_id;
	}

	public void setContactId( java.lang.Integer value ) {
		this.__contact_id = value;
	}

	public java.lang.Boolean getFlagMainContact() {
		return this.__flag_main_contact;
	}

	public void setFlagMainContact( java.lang.Boolean value ) {
		this.__flag_main_contact = value;
	}

	public java.lang.Integer getCustomerId() {
		return this.__customer_id;
	}

	public void setCustomerId( java.lang.Integer value ) {
		this.__customer_id = value;
	}

	public java.lang.String getPosition() {
		return this.__position;
	}

	public void setPosition( java.lang.String value ) {
		this.__position = value;
	}

	public java.lang.String getTelephone() {
		return this.__telephone;
	}

	public void setTelephone( java.lang.String value ) {
		this.__telephone = value;
	}

	public java.lang.String getMobile() {
		return this.__mobile;
	}

	public void setMobile( java.lang.String value ) {
		this.__mobile = value;
	}

	public java.lang.String getEmail() {
		return this.__email;
	}

	public void setEmail( java.lang.String value ) {
		this.__email = value;
	}

	public java.lang.Integer getContactRoleInOpportunity() {
		return this.__contact_role_in_opportunity;
	}

	public void setContactRoleInOpportunity( java.lang.Integer value ) {
		this.__contact_role_in_opportunity = value;
	}

	public java.lang.Integer getContactStandpointInOpportunity() {
		return this.__contact_standpoint_in_opportunity;
	}

	public void setContactStandpointInOpportunity( java.lang.Integer value ) {
		this.__contact_standpoint_in_opportunity = value;
	}

	public java.lang.Integer getContactFamiliarity() {
		return this.__contact_familiarity;
	}

	public void setContactFamiliarity( java.lang.Integer value ) {
		this.__contact_familiarity = value;
	}

	public java.lang.Integer getContactRoleInCustomer() {
		return this.__contact_role_in_customer;
	}

	public void setContactRoleInCustomer( java.lang.Integer value ) {
		this.__contact_role_in_customer = value;
	}

	public java.lang.Integer getIdentifiableCharacteristic() {
		return this.__identifiable_characteristic;
	}

	public void setIdentifiableCharacteristic( java.lang.Integer value ) {
		this.__identifiable_characteristic = value;
	}

	public java.lang.Integer getEmployeeIdMaintainerAtThatTime() {
		return this.__employee_id_maintainer_at_that_time;
	}

	public void setEmployeeIdMaintainerAtThatTime( java.lang.Integer value ) {
		this.__employee_id_maintainer_at_that_time = value;
	}

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
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

	public void cloneCopy(BaseCrmOpportunityContactsRole __bean){
		__bean.setOpportunityContactRoleId(getOpportunityContactRoleId());
		__bean.setEntityType(getEntityType());
		__bean.setOpportunityId(getOpportunityId());
		__bean.setContactId(getContactId());
		__bean.setFlagMainContact(getFlagMainContact());
		__bean.setCustomerId(getCustomerId());
		__bean.setPosition(getPosition());
		__bean.setTelephone(getTelephone());
		__bean.setMobile(getMobile());
		__bean.setEmail(getEmail());
		__bean.setContactRoleInOpportunity(getContactRoleInOpportunity());
		__bean.setContactStandpointInOpportunity(getContactStandpointInOpportunity());
		__bean.setContactFamiliarity(getContactFamiliarity());
		__bean.setContactRoleInCustomer(getContactRoleInCustomer());
		__bean.setIdentifiableCharacteristic(getIdentifiableCharacteristic());
		__bean.setEmployeeIdMaintainerAtThatTime(getEmployeeIdMaintainerAtThatTime());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateUpdated(getDateUpdated());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getOpportunityContactRoleId() == null ? "" : getOpportunityContactRoleId());
		sb.append(",");
		sb.append(getEntityType() == null ? "" : getEntityType());
		sb.append(",");
		sb.append(getOpportunityId() == null ? "" : getOpportunityId());
		sb.append(",");
		sb.append(getContactId() == null ? "" : getContactId());
		sb.append(",");
		sb.append(getFlagMainContact() == null ? "" : getFlagMainContact());
		sb.append(",");
		sb.append(getCustomerId() == null ? "" : getCustomerId());
		sb.append(",");
		sb.append(getPosition() == null ? "" : getPosition());
		sb.append(",");
		sb.append(getTelephone() == null ? "" : getTelephone());
		sb.append(",");
		sb.append(getMobile() == null ? "" : getMobile());
		sb.append(",");
		sb.append(getEmail() == null ? "" : getEmail());
		sb.append(",");
		sb.append(getContactRoleInOpportunity() == null ? "" : getContactRoleInOpportunity());
		sb.append(",");
		sb.append(getContactStandpointInOpportunity() == null ? "" : getContactStandpointInOpportunity());
		sb.append(",");
		sb.append(getContactFamiliarity() == null ? "" : getContactFamiliarity());
		sb.append(",");
		sb.append(getContactRoleInCustomer() == null ? "" : getContactRoleInCustomer());
		sb.append(",");
		sb.append(getIdentifiableCharacteristic() == null ? "" : getIdentifiableCharacteristic());
		sb.append(",");
		sb.append(getEmployeeIdMaintainerAtThatTime() == null ? "" : getEmployeeIdMaintainerAtThatTime());
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
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmOpportunityContactsRole o) {
		return __opportunity_contact_role_id == null ? -1 : __opportunity_contact_role_id.compareTo(o.getOpportunityContactRoleId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__opportunity_contact_role_id);
		hash = 97 * hash + Objects.hashCode(this.__entity_type);
		hash = 97 * hash + Objects.hashCode(this.__opportunity_id);
		hash = 97 * hash + Objects.hashCode(this.__contact_id);
		hash = 97 * hash + Objects.hashCode(this.__flag_main_contact);
		hash = 97 * hash + Objects.hashCode(this.__customer_id);
		hash = 97 * hash + Objects.hashCode(this.__position);
		hash = 97 * hash + Objects.hashCode(this.__telephone);
		hash = 97 * hash + Objects.hashCode(this.__mobile);
		hash = 97 * hash + Objects.hashCode(this.__email);
		hash = 97 * hash + Objects.hashCode(this.__contact_role_in_opportunity);
		hash = 97 * hash + Objects.hashCode(this.__contact_standpoint_in_opportunity);
		hash = 97 * hash + Objects.hashCode(this.__contact_familiarity);
		hash = 97 * hash + Objects.hashCode(this.__contact_role_in_customer);
		hash = 97 * hash + Objects.hashCode(this.__identifiable_characteristic);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer_at_that_time);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmOpportunityContactsRole o = (BaseCrmOpportunityContactsRole)obj;
		if(!Objects.equals(this.__opportunity_contact_role_id, o.getOpportunityContactRoleId())) return false;
		if(!Objects.equals(this.__entity_type, o.getEntityType())) return false;
		if(!Objects.equals(this.__opportunity_id, o.getOpportunityId())) return false;
		if(!Objects.equals(this.__contact_id, o.getContactId())) return false;
		if(!Objects.equals(this.__flag_main_contact, o.getFlagMainContact())) return false;
		if(!Objects.equals(this.__customer_id, o.getCustomerId())) return false;
		if(!Objects.equals(this.__position, o.getPosition())) return false;
		if(!Objects.equals(this.__telephone, o.getTelephone())) return false;
		if(!Objects.equals(this.__mobile, o.getMobile())) return false;
		if(!Objects.equals(this.__email, o.getEmail())) return false;
		if(!Objects.equals(this.__contact_role_in_opportunity, o.getContactRoleInOpportunity())) return false;
		if(!Objects.equals(this.__contact_standpoint_in_opportunity, o.getContactStandpointInOpportunity())) return false;
		if(!Objects.equals(this.__contact_familiarity, o.getContactFamiliarity())) return false;
		if(!Objects.equals(this.__contact_role_in_customer, o.getContactRoleInCustomer())) return false;
		if(!Objects.equals(this.__identifiable_characteristic, o.getIdentifiableCharacteristic())) return false;
		if(!Objects.equals(this.__employee_id_maintainer_at_that_time, o.getEmployeeIdMaintainerAtThatTime())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getOpportunityContactRoleId() != null) sb.append(__wrapNumber(count++, "opportunityContactRoleId", getOpportunityContactRoleId()));
		if(getEntityType() != null) sb.append(__wrapNumber(count++, "entityType", getEntityType()));
		if(getOpportunityId() != null) sb.append(__wrapNumber(count++, "opportunityId", getOpportunityId()));
		if(getContactId() != null) sb.append(__wrapNumber(count++, "contactId", getContactId()));
		if(getFlagMainContact() != null) sb.append(__wrapBoolean(count++, "flagMainContact", getFlagMainContact()));
		if(getCustomerId() != null) sb.append(__wrapNumber(count++, "customerId", getCustomerId()));
		if(getPosition() != null) sb.append(__wrapString(count++, "position", getPosition()));
		if(getTelephone() != null) sb.append(__wrapString(count++, "telephone", getTelephone()));
		if(getMobile() != null) sb.append(__wrapString(count++, "mobile", getMobile()));
		if(getEmail() != null) sb.append(__wrapString(count++, "email", getEmail()));
		if(getContactRoleInOpportunity() != null) sb.append(__wrapNumber(count++, "contactRoleInOpportunity", getContactRoleInOpportunity()));
		if(getContactStandpointInOpportunity() != null) sb.append(__wrapNumber(count++, "contactStandpointInOpportunity", getContactStandpointInOpportunity()));
		if(getContactFamiliarity() != null) sb.append(__wrapNumber(count++, "contactFamiliarity", getContactFamiliarity()));
		if(getContactRoleInCustomer() != null) sb.append(__wrapNumber(count++, "contactRoleInCustomer", getContactRoleInCustomer()));
		if(getIdentifiableCharacteristic() != null) sb.append(__wrapNumber(count++, "identifiableCharacteristic", getIdentifiableCharacteristic()));
		if(getEmployeeIdMaintainerAtThatTime() != null) sb.append(__wrapNumber(count++, "employeeIdMaintainerAtThatTime", getEmployeeIdMaintainerAtThatTime()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getOpportunityContactRoleId() != null) res.put("opportunityContactRoleId", getOpportunityContactRoleId());
		if(getEntityType() != null) res.put("entityType", getEntityType());
		if(getOpportunityId() != null) res.put("opportunityId", getOpportunityId());
		if(getContactId() != null) res.put("contactId", getContactId());
		if(getFlagMainContact() != null) res.put("flagMainContact", getFlagMainContact());
		if(getCustomerId() != null) res.put("customerId", getCustomerId());
		if(getPosition() != null) res.put("position", getPosition());
		if(getTelephone() != null) res.put("telephone", getTelephone());
		if(getMobile() != null) res.put("mobile", getMobile());
		if(getEmail() != null) res.put("email", getEmail());
		if(getContactRoleInOpportunity() != null) res.put("contactRoleInOpportunity", getContactRoleInOpportunity());
		if(getContactStandpointInOpportunity() != null) res.put("contactStandpointInOpportunity", getContactStandpointInOpportunity());
		if(getContactFamiliarity() != null) res.put("contactFamiliarity", getContactFamiliarity());
		if(getContactRoleInCustomer() != null) res.put("contactRoleInCustomer", getContactRoleInCustomer());
		if(getIdentifiableCharacteristic() != null) res.put("identifiableCharacteristic", getIdentifiableCharacteristic());
		if(getEmployeeIdMaintainerAtThatTime() != null) res.put("employeeIdMaintainerAtThatTime", getEmployeeIdMaintainerAtThatTime());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("opportunityContactRoleId")) != null) setOpportunityContactRoleId(__getInt(val)); 
		if((val = values.get("entityType")) != null) setEntityType(__getInt(val)); 
		if((val = values.get("opportunityId")) != null) setOpportunityId(__getInt(val)); 
		if((val = values.get("contactId")) != null) setContactId(__getInt(val)); 
		if((val = values.get("flagMainContact")) != null) setFlagMainContact(__getBoolean(val));
		if((val = values.get("customerId")) != null) setCustomerId(__getInt(val)); 
		if((val = values.get("position")) != null) setPosition(__getString(val));
		if((val = values.get("telephone")) != null) setTelephone(__getString(val));
		if((val = values.get("mobile")) != null) setMobile(__getString(val));
		if((val = values.get("email")) != null) setEmail(__getString(val));
		if((val = values.get("contactRoleInOpportunity")) != null) setContactRoleInOpportunity(__getInt(val)); 
		if((val = values.get("contactStandpointInOpportunity")) != null) setContactStandpointInOpportunity(__getInt(val)); 
		if((val = values.get("contactFamiliarity")) != null) setContactFamiliarity(__getInt(val)); 
		if((val = values.get("contactRoleInCustomer")) != null) setContactRoleInCustomer(__getInt(val)); 
		if((val = values.get("identifiableCharacteristic")) != null) setIdentifiableCharacteristic(__getInt(val)); 
		if((val = values.get("employeeIdMaintainerAtThatTime")) != null) setEmployeeIdMaintainerAtThatTime(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
	}

	protected java.lang.Integer  __opportunity_contact_role_id ;
	protected java.lang.Integer  __entity_type ;
	protected java.lang.Integer  __opportunity_id ;
	protected java.lang.Integer  __contact_id ;
	protected java.lang.Boolean  __flag_main_contact ;
	protected java.lang.Integer  __customer_id ;
	protected java.lang.String  __position ;
	protected java.lang.String  __telephone ;
	protected java.lang.String  __mobile ;
	protected java.lang.String  __email ;
	protected java.lang.Integer  __contact_role_in_opportunity ;
	protected java.lang.Integer  __contact_standpoint_in_opportunity ;
	protected java.lang.Integer  __contact_familiarity ;
	protected java.lang.Integer  __contact_role_in_customer ;
	protected java.lang.Integer  __identifiable_characteristic ;
	protected java.lang.Integer  __employee_id_maintainer_at_that_time ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.util.Date  __date_updated ;
}
