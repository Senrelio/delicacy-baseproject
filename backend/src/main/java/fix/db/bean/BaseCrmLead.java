package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmLead extends GenericBase implements BaseFactory<BaseCrmLead>, Comparable<BaseCrmLead> 
{


	public static BaseCrmLead newInstance(){
		return new BaseCrmLead();
	}

	@Override
	public BaseCrmLead make(){
		BaseCrmLead b = new BaseCrmLead();
		return b;
	}

	public final static java.lang.String CS_LEAD_ID = "lead_id" ;
	public final static java.lang.String CS_EVENT_TYPE = "event_type" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_STATUS_FOLLOWUP = "status_followup" ;
	public final static java.lang.String CS_LEAD_CONTACT_NAME = "lead_contact_name" ;
	public final static java.lang.String CS_POTENTIAL_CUSTOMER_NAME = "potential_customer_name" ;
	public final static java.lang.String CS_TELEPHONE = "telephone" ;
	public final static java.lang.String CS_MOBILE = "mobile" ;
	public final static java.lang.String CS_EMAIL = "email" ;
	public final static java.lang.String CS_AREA_PROVINCE = "area_province" ;
	public final static java.lang.String CS_AREA_CITY = "area_city" ;
	public final static java.lang.String CS_AREA_DISTRICT = "area_district" ;
	public final static java.lang.String CS_DETAILED_ADDRESS = "detailed_address" ;
	public final static java.lang.String CS_LEAD_SOURCE_ID = "lead_source_id" ;
	public final static java.lang.String CS_DATE_LATEST_ACTIVITY = "date_latest_activity" ;
	public final static java.lang.String CS_MARKETING_EVENT_ID = "marketing_event_id" ;
	public final static java.lang.String CS_EMPLOYEE_ID_LATEST_FOLLOWUP = "employee_id_latest_followup" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_FLAG_LOCKED = "flag_locked" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_FLAG_NO_DISTURB = "flag_no_disturb" ;
	public final static java.lang.String CS_OPPORTUNITY_ID = "opportunity_id" ;
	public final static java.lang.String CS_CONTACT_ID = "contact_id" ;
	public final static java.lang.String CS_CUSTOMER_ID = "customer_id" ;
	public final static java.lang.String CS_GENDER = "gender" ;
	public final static java.lang.String CS_PENDING_DEPARTMENT_ID = "pending_department_id" ;
	public final static java.lang.String CS_POSITION = "position" ;
	public final static java.lang.String CS_WECHAT = "wechat" ;
	public final static java.lang.String CS_WEIBO = "weibo" ;
	public final static java.lang.String CS_POSTCODE = "postcode" ;
	public final static java.lang.String CS_MEMO = "memo" ;

	public final static java.lang.String ALL_CAPTIONS = "销售线索编码,主体类型,销售线索维护人员工编码,跟进状态,线索联系人姓名,潜在客户名,电话,手机,电子邮件,省,市,区,详细地址,线索来源编码,最近活动记录时间,市场活动编码,最近跟进人员工编码,创建日期,创建人编码,最近修改日,修改人编码,是否被锁定,所属部门编码,是否为免打扰线索,销售机会编码,联系人编码,客户编码,性别,部门编码???不明作用,职位,微信,微博,邮政编码,备注";

	public java.lang.Integer getLeadId() {
		return this.__lead_id;
	}

	public void setLeadId( java.lang.Integer value ) {
		this.__lead_id = value;
	}

	public java.lang.Integer getEventType() {
		return this.__event_type;
	}

	public void setEventType( java.lang.Integer value ) {
		this.__event_type = value;
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return this.__employee_id_maintainer;
	}

	public void setEmployeeIdMaintainer( java.lang.Integer value ) {
		this.__employee_id_maintainer = value;
	}

	public java.lang.Integer getStatusFollowup() {
		return this.__status_followup;
	}

	public void setStatusFollowup( java.lang.Integer value ) {
		this.__status_followup = value;
	}

	public java.lang.String getLeadContactName() {
		return this.__lead_contact_name;
	}

	public void setLeadContactName( java.lang.String value ) {
		this.__lead_contact_name = value;
	}

	public java.lang.String getPotentialCustomerName() {
		return this.__potential_customer_name;
	}

	public void setPotentialCustomerName( java.lang.String value ) {
		this.__potential_customer_name = value;
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

	public java.lang.Integer getAreaProvince() {
		return this.__area_province;
	}

	public void setAreaProvince( java.lang.Integer value ) {
		this.__area_province = value;
	}

	public java.lang.Integer getAreaCity() {
		return this.__area_city;
	}

	public void setAreaCity( java.lang.Integer value ) {
		this.__area_city = value;
	}

	public java.lang.Integer getAreaDistrict() {
		return this.__area_district;
	}

	public void setAreaDistrict( java.lang.Integer value ) {
		this.__area_district = value;
	}

	public java.lang.String getDetailedAddress() {
		return this.__detailed_address;
	}

	public void setDetailedAddress( java.lang.String value ) {
		this.__detailed_address = value;
	}

	public java.lang.String getLeadSourceId() {
		return this.__lead_source_id;
	}

	public void setLeadSourceId( java.lang.String value ) {
		this.__lead_source_id = value;
	}

	public java.util.Date getDateLatestActivity() {
		return this.__date_latest_activity;
	}

	public void setDateLatestActivity( java.util.Date value ) {
		this.__date_latest_activity = value;
	}

	public java.lang.Integer getMarketingEventId() {
		return this.__marketing_event_id;
	}

	public void setMarketingEventId( java.lang.Integer value ) {
		this.__marketing_event_id = value;
	}

	public java.lang.Integer getEmployeeIdLatestFollowup() {
		return this.__employee_id_latest_followup;
	}

	public void setEmployeeIdLatestFollowup( java.lang.Integer value ) {
		this.__employee_id_latest_followup = value;
	}

	public java.util.Date getDateCreated() {
		return this.__date_created;
	}

	public void setDateCreated( java.util.Date value ) {
		this.__date_created = value;
	}

	public java.lang.Integer getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.Integer value ) {
		this.__employee_id_created = value;
	}

	public java.util.Date getDateUpdated() {
		return this.__date_updated;
	}

	public void setDateUpdated( java.util.Date value ) {
		this.__date_updated = value;
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return this.__employee_id_updated;
	}

	public void setEmployeeIdUpdated( java.lang.Integer value ) {
		this.__employee_id_updated = value;
	}

	public java.lang.Boolean getFlagLocked() {
		return this.__flag_locked;
	}

	public void setFlagLocked( java.lang.Boolean value ) {
		this.__flag_locked = value;
	}

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
	}

	public java.lang.Boolean getFlagNoDisturb() {
		return this.__flag_no_disturb;
	}

	public void setFlagNoDisturb( java.lang.Boolean value ) {
		this.__flag_no_disturb = value;
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

	public java.lang.Integer getCustomerId() {
		return this.__customer_id;
	}

	public void setCustomerId( java.lang.Integer value ) {
		this.__customer_id = value;
	}

	public java.lang.Integer getGender() {
		return this.__gender;
	}

	public void setGender( java.lang.Integer value ) {
		this.__gender = value;
	}

	public java.lang.String getPendingDepartmentId() {
		return this.__pending_department_id;
	}

	public void setPendingDepartmentId( java.lang.String value ) {
		this.__pending_department_id = value;
	}

	public java.lang.String getPosition() {
		return this.__position;
	}

	public void setPosition( java.lang.String value ) {
		this.__position = value;
	}

	public java.lang.String getWechat() {
		return this.__wechat;
	}

	public void setWechat( java.lang.String value ) {
		this.__wechat = value;
	}

	public java.lang.String getWeibo() {
		return this.__weibo;
	}

	public void setWeibo( java.lang.String value ) {
		this.__weibo = value;
	}

	public java.lang.String getPostcode() {
		return this.__postcode;
	}

	public void setPostcode( java.lang.String value ) {
		this.__postcode = value;
	}

	public java.lang.String getMemo() {
		return this.__memo;
	}

	public void setMemo( java.lang.String value ) {
		this.__memo = value;
	}

	public void cloneCopy(BaseCrmLead __bean){
		__bean.setLeadId(getLeadId());
		__bean.setEventType(getEventType());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setStatusFollowup(getStatusFollowup());
		__bean.setLeadContactName(getLeadContactName());
		__bean.setPotentialCustomerName(getPotentialCustomerName());
		__bean.setTelephone(getTelephone());
		__bean.setMobile(getMobile());
		__bean.setEmail(getEmail());
		__bean.setAreaProvince(getAreaProvince());
		__bean.setAreaCity(getAreaCity());
		__bean.setAreaDistrict(getAreaDistrict());
		__bean.setDetailedAddress(getDetailedAddress());
		__bean.setLeadSourceId(getLeadSourceId());
		__bean.setDateLatestActivity(getDateLatestActivity());
		__bean.setMarketingEventId(getMarketingEventId());
		__bean.setEmployeeIdLatestFollowup(getEmployeeIdLatestFollowup());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setFlagLocked(getFlagLocked());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setFlagNoDisturb(getFlagNoDisturb());
		__bean.setOpportunityId(getOpportunityId());
		__bean.setContactId(getContactId());
		__bean.setCustomerId(getCustomerId());
		__bean.setGender(getGender());
		__bean.setPendingDepartmentId(getPendingDepartmentId());
		__bean.setPosition(getPosition());
		__bean.setWechat(getWechat());
		__bean.setWeibo(getWeibo());
		__bean.setPostcode(getPostcode());
		__bean.setMemo(getMemo());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getLeadId() == null ? "" : getLeadId());
		sb.append(",");
		sb.append(getEventType() == null ? "" : getEventType());
		sb.append(",");
		sb.append(getEmployeeIdMaintainer() == null ? "" : getEmployeeIdMaintainer());
		sb.append(",");
		sb.append(getStatusFollowup() == null ? "" : getStatusFollowup());
		sb.append(",");
		sb.append(getLeadContactName() == null ? "" : getLeadContactName());
		sb.append(",");
		sb.append(getPotentialCustomerName() == null ? "" : getPotentialCustomerName());
		sb.append(",");
		sb.append(getTelephone() == null ? "" : getTelephone());
		sb.append(",");
		sb.append(getMobile() == null ? "" : getMobile());
		sb.append(",");
		sb.append(getEmail() == null ? "" : getEmail());
		sb.append(",");
		sb.append(getAreaProvince() == null ? "" : getAreaProvince());
		sb.append(",");
		sb.append(getAreaCity() == null ? "" : getAreaCity());
		sb.append(",");
		sb.append(getAreaDistrict() == null ? "" : getAreaDistrict());
		sb.append(",");
		sb.append(getDetailedAddress() == null ? "" : getDetailedAddress());
		sb.append(",");
		sb.append(getLeadSourceId() == null ? "" : getLeadSourceId());
		sb.append(",");
		sb.append(getDateLatestActivity() == null ? "" : sdf.format(getDateLatestActivity()));
		sb.append(",");
		sb.append(getMarketingEventId() == null ? "" : getMarketingEventId());
		sb.append(",");
		sb.append(getEmployeeIdLatestFollowup() == null ? "" : getEmployeeIdLatestFollowup());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getFlagLocked() == null ? "" : getFlagLocked());
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getFlagNoDisturb() == null ? "" : getFlagNoDisturb());
		sb.append(",");
		sb.append(getOpportunityId() == null ? "" : getOpportunityId());
		sb.append(",");
		sb.append(getContactId() == null ? "" : getContactId());
		sb.append(",");
		sb.append(getCustomerId() == null ? "" : getCustomerId());
		sb.append(",");
		sb.append(getGender() == null ? "" : getGender());
		sb.append(",");
		sb.append(getPendingDepartmentId() == null ? "" : getPendingDepartmentId());
		sb.append(",");
		sb.append(getPosition() == null ? "" : getPosition());
		sb.append(",");
		sb.append(getWechat() == null ? "" : getWechat());
		sb.append(",");
		sb.append(getWeibo() == null ? "" : getWeibo());
		sb.append(",");
		sb.append(getPostcode() == null ? "" : getPostcode());
		sb.append(",");
		sb.append(getMemo() == null ? "" : getMemo());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmLead o) {
		return __lead_id == null ? -1 : __lead_id.compareTo(o.getLeadId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__lead_id);
		hash = 97 * hash + Objects.hashCode(this.__event_type);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__status_followup);
		hash = 97 * hash + Objects.hashCode(this.__lead_contact_name);
		hash = 97 * hash + Objects.hashCode(this.__potential_customer_name);
		hash = 97 * hash + Objects.hashCode(this.__telephone);
		hash = 97 * hash + Objects.hashCode(this.__mobile);
		hash = 97 * hash + Objects.hashCode(this.__email);
		hash = 97 * hash + Objects.hashCode(this.__area_province);
		hash = 97 * hash + Objects.hashCode(this.__area_city);
		hash = 97 * hash + Objects.hashCode(this.__area_district);
		hash = 97 * hash + Objects.hashCode(this.__detailed_address);
		hash = 97 * hash + Objects.hashCode(this.__lead_source_id);
		hash = 97 * hash + Objects.hashCode(this.__date_latest_activity);
		hash = 97 * hash + Objects.hashCode(this.__marketing_event_id);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_latest_followup);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__flag_locked);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__flag_no_disturb);
		hash = 97 * hash + Objects.hashCode(this.__opportunity_id);
		hash = 97 * hash + Objects.hashCode(this.__contact_id);
		hash = 97 * hash + Objects.hashCode(this.__customer_id);
		hash = 97 * hash + Objects.hashCode(this.__gender);
		hash = 97 * hash + Objects.hashCode(this.__pending_department_id);
		hash = 97 * hash + Objects.hashCode(this.__position);
		hash = 97 * hash + Objects.hashCode(this.__wechat);
		hash = 97 * hash + Objects.hashCode(this.__weibo);
		hash = 97 * hash + Objects.hashCode(this.__postcode);
		hash = 97 * hash + Objects.hashCode(this.__memo);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmLead o = (BaseCrmLead)obj;
		if(!Objects.equals(this.__lead_id, o.getLeadId())) return false;
		if(!Objects.equals(this.__event_type, o.getEventType())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__status_followup, o.getStatusFollowup())) return false;
		if(!Objects.equals(this.__lead_contact_name, o.getLeadContactName())) return false;
		if(!Objects.equals(this.__potential_customer_name, o.getPotentialCustomerName())) return false;
		if(!Objects.equals(this.__telephone, o.getTelephone())) return false;
		if(!Objects.equals(this.__mobile, o.getMobile())) return false;
		if(!Objects.equals(this.__email, o.getEmail())) return false;
		if(!Objects.equals(this.__area_province, o.getAreaProvince())) return false;
		if(!Objects.equals(this.__area_city, o.getAreaCity())) return false;
		if(!Objects.equals(this.__area_district, o.getAreaDistrict())) return false;
		if(!Objects.equals(this.__detailed_address, o.getDetailedAddress())) return false;
		if(!Objects.equals(this.__lead_source_id, o.getLeadSourceId())) return false;
		if(!Objects.equals(this.__date_latest_activity, o.getDateLatestActivity())) return false;
		if(!Objects.equals(this.__marketing_event_id, o.getMarketingEventId())) return false;
		if(!Objects.equals(this.__employee_id_latest_followup, o.getEmployeeIdLatestFollowup())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__flag_locked, o.getFlagLocked())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__flag_no_disturb, o.getFlagNoDisturb())) return false;
		if(!Objects.equals(this.__opportunity_id, o.getOpportunityId())) return false;
		if(!Objects.equals(this.__contact_id, o.getContactId())) return false;
		if(!Objects.equals(this.__customer_id, o.getCustomerId())) return false;
		if(!Objects.equals(this.__gender, o.getGender())) return false;
		if(!Objects.equals(this.__pending_department_id, o.getPendingDepartmentId())) return false;
		if(!Objects.equals(this.__position, o.getPosition())) return false;
		if(!Objects.equals(this.__wechat, o.getWechat())) return false;
		if(!Objects.equals(this.__weibo, o.getWeibo())) return false;
		if(!Objects.equals(this.__postcode, o.getPostcode())) return false;
		if(!Objects.equals(this.__memo, o.getMemo())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getLeadId() != null) sb.append(__wrapNumber(count++, "leadId", getLeadId()));
		if(getEventType() != null) sb.append(__wrapNumber(count++, "eventType", getEventType()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapNumber(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getStatusFollowup() != null) sb.append(__wrapNumber(count++, "statusFollowup", getStatusFollowup()));
		if(getLeadContactName() != null) sb.append(__wrapString(count++, "leadContactName", getLeadContactName()));
		if(getPotentialCustomerName() != null) sb.append(__wrapString(count++, "potentialCustomerName", getPotentialCustomerName()));
		if(getTelephone() != null) sb.append(__wrapString(count++, "telephone", getTelephone()));
		if(getMobile() != null) sb.append(__wrapString(count++, "mobile", getMobile()));
		if(getEmail() != null) sb.append(__wrapString(count++, "email", getEmail()));
		if(getAreaProvince() != null) sb.append(__wrapNumber(count++, "areaProvince", getAreaProvince()));
		if(getAreaCity() != null) sb.append(__wrapNumber(count++, "areaCity", getAreaCity()));
		if(getAreaDistrict() != null) sb.append(__wrapNumber(count++, "areaDistrict", getAreaDistrict()));
		if(getDetailedAddress() != null) sb.append(__wrapString(count++, "detailedAddress", getDetailedAddress()));
		if(getLeadSourceId() != null) sb.append(__wrapString(count++, "leadSourceId", getLeadSourceId()));
		if(getDateLatestActivity() != null) sb.append(__wrapDate(count++, "dateLatestActivity", getDateLatestActivity()));
		if(getMarketingEventId() != null) sb.append(__wrapNumber(count++, "marketingEventId", getMarketingEventId()));
		if(getEmployeeIdLatestFollowup() != null) sb.append(__wrapNumber(count++, "employeeIdLatestFollowup", getEmployeeIdLatestFollowup()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getFlagLocked() != null) sb.append(__wrapBoolean(count++, "flagLocked", getFlagLocked()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getFlagNoDisturb() != null) sb.append(__wrapBoolean(count++, "flagNoDisturb", getFlagNoDisturb()));
		if(getOpportunityId() != null) sb.append(__wrapNumber(count++, "opportunityId", getOpportunityId()));
		if(getContactId() != null) sb.append(__wrapNumber(count++, "contactId", getContactId()));
		if(getCustomerId() != null) sb.append(__wrapNumber(count++, "customerId", getCustomerId()));
		if(getGender() != null) sb.append(__wrapNumber(count++, "gender", getGender()));
		if(getPendingDepartmentId() != null) sb.append(__wrapString(count++, "pendingDepartmentId", getPendingDepartmentId()));
		if(getPosition() != null) sb.append(__wrapString(count++, "position", getPosition()));
		if(getWechat() != null) sb.append(__wrapString(count++, "wechat", getWechat()));
		if(getWeibo() != null) sb.append(__wrapString(count++, "weibo", getWeibo()));
		if(getPostcode() != null) sb.append(__wrapString(count++, "postcode", getPostcode()));
		if(getMemo() != null) sb.append(__wrapString(count++, "memo", getMemo()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getLeadId() != null) res.put("leadId", getLeadId());
		if(getEventType() != null) res.put("eventType", getEventType());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getStatusFollowup() != null) res.put("statusFollowup", getStatusFollowup());
		if(getLeadContactName() != null) res.put("leadContactName", getLeadContactName());
		if(getPotentialCustomerName() != null) res.put("potentialCustomerName", getPotentialCustomerName());
		if(getTelephone() != null) res.put("telephone", getTelephone());
		if(getMobile() != null) res.put("mobile", getMobile());
		if(getEmail() != null) res.put("email", getEmail());
		if(getAreaProvince() != null) res.put("areaProvince", getAreaProvince());
		if(getAreaCity() != null) res.put("areaCity", getAreaCity());
		if(getAreaDistrict() != null) res.put("areaDistrict", getAreaDistrict());
		if(getDetailedAddress() != null) res.put("detailedAddress", getDetailedAddress());
		if(getLeadSourceId() != null) res.put("leadSourceId", getLeadSourceId());
		if(getDateLatestActivity() != null) res.put("dateLatestActivity", getDateLatestActivity());
		if(getMarketingEventId() != null) res.put("marketingEventId", getMarketingEventId());
		if(getEmployeeIdLatestFollowup() != null) res.put("employeeIdLatestFollowup", getEmployeeIdLatestFollowup());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getFlagLocked() != null) res.put("flagLocked", getFlagLocked());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getFlagNoDisturb() != null) res.put("flagNoDisturb", getFlagNoDisturb());
		if(getOpportunityId() != null) res.put("opportunityId", getOpportunityId());
		if(getContactId() != null) res.put("contactId", getContactId());
		if(getCustomerId() != null) res.put("customerId", getCustomerId());
		if(getGender() != null) res.put("gender", getGender());
		if(getPendingDepartmentId() != null) res.put("pendingDepartmentId", getPendingDepartmentId());
		if(getPosition() != null) res.put("position", getPosition());
		if(getWechat() != null) res.put("wechat", getWechat());
		if(getWeibo() != null) res.put("weibo", getWeibo());
		if(getPostcode() != null) res.put("postcode", getPostcode());
		if(getMemo() != null) res.put("memo", getMemo());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("leadId")) != null) setLeadId(__getInt(val)); 
		if((val = values.get("eventType")) != null) setEventType(__getInt(val)); 
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getInt(val)); 
		if((val = values.get("statusFollowup")) != null) setStatusFollowup(__getInt(val)); 
		if((val = values.get("leadContactName")) != null) setLeadContactName(__getString(val));
		if((val = values.get("potentialCustomerName")) != null) setPotentialCustomerName(__getString(val));
		if((val = values.get("telephone")) != null) setTelephone(__getString(val));
		if((val = values.get("mobile")) != null) setMobile(__getString(val));
		if((val = values.get("email")) != null) setEmail(__getString(val));
		if((val = values.get("areaProvince")) != null) setAreaProvince(__getInt(val)); 
		if((val = values.get("areaCity")) != null) setAreaCity(__getInt(val)); 
		if((val = values.get("areaDistrict")) != null) setAreaDistrict(__getInt(val)); 
		if((val = values.get("detailedAddress")) != null) setDetailedAddress(__getString(val));
		if((val = values.get("leadSourceId")) != null) setLeadSourceId(__getString(val));
		if((val = values.get("dateLatestActivity")) != null) setDateLatestActivity(__getDate(val)); 
		if((val = values.get("marketingEventId")) != null) setMarketingEventId(__getInt(val)); 
		if((val = values.get("employeeIdLatestFollowup")) != null) setEmployeeIdLatestFollowup(__getInt(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("flagLocked")) != null) setFlagLocked(__getBoolean(val));
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("flagNoDisturb")) != null) setFlagNoDisturb(__getBoolean(val));
		if((val = values.get("opportunityId")) != null) setOpportunityId(__getInt(val)); 
		if((val = values.get("contactId")) != null) setContactId(__getInt(val)); 
		if((val = values.get("customerId")) != null) setCustomerId(__getInt(val)); 
		if((val = values.get("gender")) != null) setGender(__getInt(val)); 
		if((val = values.get("pendingDepartmentId")) != null) setPendingDepartmentId(__getString(val));
		if((val = values.get("position")) != null) setPosition(__getString(val));
		if((val = values.get("wechat")) != null) setWechat(__getString(val));
		if((val = values.get("weibo")) != null) setWeibo(__getString(val));
		if((val = values.get("postcode")) != null) setPostcode(__getString(val));
		if((val = values.get("memo")) != null) setMemo(__getString(val));
	}

	protected java.lang.Integer  __lead_id ;
	protected java.lang.Integer  __event_type ;
	protected java.lang.Integer  __employee_id_maintainer ;
	protected java.lang.Integer  __status_followup ;
	protected java.lang.String  __lead_contact_name ;
	protected java.lang.String  __potential_customer_name ;
	protected java.lang.String  __telephone ;
	protected java.lang.String  __mobile ;
	protected java.lang.String  __email ;
	protected java.lang.Integer  __area_province ;
	protected java.lang.Integer  __area_city ;
	protected java.lang.Integer  __area_district ;
	protected java.lang.String  __detailed_address ;
	protected java.lang.String  __lead_source_id ;
	protected java.util.Date  __date_latest_activity ;
	protected java.lang.Integer  __marketing_event_id ;
	protected java.lang.Integer  __employee_id_latest_followup ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.lang.Boolean  __flag_locked ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Boolean  __flag_no_disturb ;
	protected java.lang.Integer  __opportunity_id ;
	protected java.lang.Integer  __contact_id ;
	protected java.lang.Integer  __customer_id ;
	protected java.lang.Integer  __gender ;
	protected java.lang.String  __pending_department_id ;
	protected java.lang.String  __position ;
	protected java.lang.String  __wechat ;
	protected java.lang.String  __weibo ;
	protected java.lang.String  __postcode ;
	protected java.lang.String  __memo ;
}
