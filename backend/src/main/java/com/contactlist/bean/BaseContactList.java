package com.contactlist.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;
import fix.db.bean.BaseCrmContactsCustomer;

public class BaseContactList extends GenericBase implements BaseFactory<BaseContactList>, Comparable<BaseContactList> 
{


	public static BaseContactList newInstance(){
		return new BaseContactList();
	}

	@Override
	public BaseContactList make(){
		BaseContactList b = new BaseContactList();
		return b;
	}

	public final static java.lang.String CS_CONTACT_ID = "contact_id" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_ENTITY_TYPE = "entity_type" ;
	public final static java.lang.String CS_CONTACT_NAME = "contact_name" ;
	public final static java.lang.String CS_TELEPHONE = "telephone" ;
	public final static java.lang.String CS_MOBILE = "mobile" ;
	public final static java.lang.String CS_EMAIL = "email" ;
	public final static java.lang.String CS_BIRTHDAY = "birthday" ;
	public final static java.lang.String CS_DATE_LATEST_ACTIVITY = "date_latest_activity" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_FLAG_LOCKED = "flag_locked" ;
	public final static java.lang.String CS_FLAG_NO_DISTURB = "flag_no_disturb" ;
	public final static java.lang.String CS_CONTACT_ROLE = "contact_role" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_POSITION = "position" ;
	public final static java.lang.String CS_WECHAT = "wechat" ;
	public final static java.lang.String CS_WEIBO = "weibo" ;
	public final static java.lang.String CS_AREA_PROVINCE = "area_province" ;
	public final static java.lang.String CS_AREA_CITY = "area_city" ;
	public final static java.lang.String CS_AREA_DISTRICT = "area_district" ;
	public final static java.lang.String CS_DETAILED_ADDRESS = "detailed_address" ;
	public final static java.lang.String CS_POSTCODE = "postcode" ;
	public final static java.lang.String CS_GENDER = "gender" ;
	public final static java.lang.String CS_MEMO = "memo" ;

	public final static java.lang.String ALL_CAPTIONS = "联系人编码,维护人员工编码,主体类型,姓名,电话,手机,电子邮件,出生日期,最近活动时间,创建日期,创建人,最近修改日,最近修改人,是否被锁定,是否为免打扰联系人,联系人角色,部门,职务,微信,微博,省,市,区,详细地址（不包括省市区）,邮政编码,性别,备注";

	public java.lang.Integer getContactId() {
		return this.__contact_id;
	}

	public void setContactId( java.lang.Integer value ) {
		this.__contact_id = value;
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return this.__employee_id_maintainer;
	}

	public void setEmployeeIdMaintainer( java.lang.Integer value ) {
		this.__employee_id_maintainer = value;
	}

	public java.lang.Integer getEntityType() {
		return this.__entity_type;
	}

	public void setEntityType( java.lang.Integer value ) {
		this.__entity_type = value;
	}

	public java.lang.String getContactName() {
		return this.__contact_name;
	}

	public void setContactName( java.lang.String value ) {
		this.__contact_name = value;
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

	public java.util.Date getBirthday() {
		return this.__birthday;
	}

	public void setBirthday( java.util.Date value ) {
		this.__birthday = value;
	}

	public java.util.Date getDateLatestActivity() {
		return this.__date_latest_activity;
	}

	public void setDateLatestActivity( java.util.Date value ) {
		this.__date_latest_activity = value;
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

	public java.lang.Boolean getFlagNoDisturb() {
		return this.__flag_no_disturb;
	}

	public void setFlagNoDisturb( java.lang.Boolean value ) {
		this.__flag_no_disturb = value;
	}

	public java.lang.Integer getContactRole() {
		return this.__contact_role;
	}

	public void setContactRole( java.lang.Integer value ) {
		this.__contact_role = value;
	}

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
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

	public java.lang.String getPostcode() {
		return this.__postcode;
	}

	public void setPostcode( java.lang.String value ) {
		this.__postcode = value;
	}

	public java.lang.Integer getGender() {
		return this.__gender;
	}

	public void setGender( java.lang.Integer value ) {
		this.__gender = value;
	}

	public java.lang.String getMemo() {
		return this.__memo;
	}

	public void setMemo( java.lang.String value ) {
		this.__memo = value;
	}

	public java.util.List<BaseCrmContactsCustomer> getDetailCrmContactsCustomer() {
		return this.__detailCrmContactsCustomer;
	}

	public void setDetailCrmContactsCustomer( java.util.List<BaseCrmContactsCustomer> value ) {
		this.__detailCrmContactsCustomer = value;
	}

	public void cloneCopy(BaseContactList __bean){
		__bean.setContactId(getContactId());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setEntityType(getEntityType());
		__bean.setContactName(getContactName());
		__bean.setTelephone(getTelephone());
		__bean.setMobile(getMobile());
		__bean.setEmail(getEmail());
		__bean.setBirthday(getBirthday());
		__bean.setDateLatestActivity(getDateLatestActivity());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setFlagLocked(getFlagLocked());
		__bean.setFlagNoDisturb(getFlagNoDisturb());
		__bean.setContactRole(getContactRole());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setPosition(getPosition());
		__bean.setWechat(getWechat());
		__bean.setWeibo(getWeibo());
		__bean.setAreaProvince(getAreaProvince());
		__bean.setAreaCity(getAreaCity());
		__bean.setAreaDistrict(getAreaDistrict());
		__bean.setDetailedAddress(getDetailedAddress());
		__bean.setPostcode(getPostcode());
		__bean.setGender(getGender());
		__bean.setMemo(getMemo());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getContactId() == null ? "" : getContactId());
		sb.append(",");
		sb.append(getEmployeeIdMaintainer() == null ? "" : getEmployeeIdMaintainer());
		sb.append(",");
		sb.append(getEntityType() == null ? "" : getEntityType());
		sb.append(",");
		sb.append(getContactName() == null ? "" : getContactName());
		sb.append(",");
		sb.append(getTelephone() == null ? "" : getTelephone());
		sb.append(",");
		sb.append(getMobile() == null ? "" : getMobile());
		sb.append(",");
		sb.append(getEmail() == null ? "" : getEmail());
		sb.append(",");
		sb.append(getBirthday() == null ? "" : sdf.format(getBirthday()));
		sb.append(",");
		sb.append(getDateLatestActivity() == null ? "" : sdf.format(getDateLatestActivity()));
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
		sb.append(getFlagNoDisturb() == null ? "" : getFlagNoDisturb());
		sb.append(",");
		sb.append(getContactRole() == null ? "" : getContactRole());
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getPosition() == null ? "" : getPosition());
		sb.append(",");
		sb.append(getWechat() == null ? "" : getWechat());
		sb.append(",");
		sb.append(getWeibo() == null ? "" : getWeibo());
		sb.append(",");
		sb.append(getAreaProvince() == null ? "" : getAreaProvince());
		sb.append(",");
		sb.append(getAreaCity() == null ? "" : getAreaCity());
		sb.append(",");
		sb.append(getAreaDistrict() == null ? "" : getAreaDistrict());
		sb.append(",");
		sb.append(getDetailedAddress() == null ? "" : getDetailedAddress());
		sb.append(",");
		sb.append(getPostcode() == null ? "" : getPostcode());
		sb.append(",");
		sb.append(getGender() == null ? "" : getGender());
		sb.append(",");
		sb.append(getMemo() == null ? "" : getMemo());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseContactList o) {
		return __contact_id == null ? -1 : __contact_id.compareTo(o.getContactId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__contact_id);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__entity_type);
		hash = 97 * hash + Objects.hashCode(this.__contact_name);
		hash = 97 * hash + Objects.hashCode(this.__telephone);
		hash = 97 * hash + Objects.hashCode(this.__mobile);
		hash = 97 * hash + Objects.hashCode(this.__email);
		hash = 97 * hash + Objects.hashCode(this.__birthday);
		hash = 97 * hash + Objects.hashCode(this.__date_latest_activity);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__flag_locked);
		hash = 97 * hash + Objects.hashCode(this.__flag_no_disturb);
		hash = 97 * hash + Objects.hashCode(this.__contact_role);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__position);
		hash = 97 * hash + Objects.hashCode(this.__wechat);
		hash = 97 * hash + Objects.hashCode(this.__weibo);
		hash = 97 * hash + Objects.hashCode(this.__area_province);
		hash = 97 * hash + Objects.hashCode(this.__area_city);
		hash = 97 * hash + Objects.hashCode(this.__area_district);
		hash = 97 * hash + Objects.hashCode(this.__detailed_address);
		hash = 97 * hash + Objects.hashCode(this.__postcode);
		hash = 97 * hash + Objects.hashCode(this.__gender);
		hash = 97 * hash + Objects.hashCode(this.__memo);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseContactList o = (BaseContactList)obj;
		if(!Objects.equals(this.__contact_id, o.getContactId())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__entity_type, o.getEntityType())) return false;
		if(!Objects.equals(this.__contact_name, o.getContactName())) return false;
		if(!Objects.equals(this.__telephone, o.getTelephone())) return false;
		if(!Objects.equals(this.__mobile, o.getMobile())) return false;
		if(!Objects.equals(this.__email, o.getEmail())) return false;
		if(!Objects.equals(this.__birthday, o.getBirthday())) return false;
		if(!Objects.equals(this.__date_latest_activity, o.getDateLatestActivity())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__flag_locked, o.getFlagLocked())) return false;
		if(!Objects.equals(this.__flag_no_disturb, o.getFlagNoDisturb())) return false;
		if(!Objects.equals(this.__contact_role, o.getContactRole())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__position, o.getPosition())) return false;
		if(!Objects.equals(this.__wechat, o.getWechat())) return false;
		if(!Objects.equals(this.__weibo, o.getWeibo())) return false;
		if(!Objects.equals(this.__area_province, o.getAreaProvince())) return false;
		if(!Objects.equals(this.__area_city, o.getAreaCity())) return false;
		if(!Objects.equals(this.__area_district, o.getAreaDistrict())) return false;
		if(!Objects.equals(this.__detailed_address, o.getDetailedAddress())) return false;
		if(!Objects.equals(this.__postcode, o.getPostcode())) return false;
		if(!Objects.equals(this.__gender, o.getGender())) return false;
		if(!Objects.equals(this.__memo, o.getMemo())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getContactId() != null) sb.append(__wrapNumber(count++, "contactId", getContactId()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapNumber(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getEntityType() != null) sb.append(__wrapNumber(count++, "entityType", getEntityType()));
		if(getContactName() != null) sb.append(__wrapString(count++, "contactName", getContactName()));
		if(getTelephone() != null) sb.append(__wrapString(count++, "telephone", getTelephone()));
		if(getMobile() != null) sb.append(__wrapString(count++, "mobile", getMobile()));
		if(getEmail() != null) sb.append(__wrapString(count++, "email", getEmail()));
		if(getBirthday() != null) sb.append(__wrapDate(count++, "birthday", getBirthday()));
		if(getDateLatestActivity() != null) sb.append(__wrapDate(count++, "dateLatestActivity", getDateLatestActivity()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getFlagLocked() != null) sb.append(__wrapBoolean(count++, "flagLocked", getFlagLocked()));
		if(getFlagNoDisturb() != null) sb.append(__wrapBoolean(count++, "flagNoDisturb", getFlagNoDisturb()));
		if(getContactRole() != null) sb.append(__wrapNumber(count++, "contactRole", getContactRole()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getPosition() != null) sb.append(__wrapString(count++, "position", getPosition()));
		if(getWechat() != null) sb.append(__wrapString(count++, "wechat", getWechat()));
		if(getWeibo() != null) sb.append(__wrapString(count++, "weibo", getWeibo()));
		if(getAreaProvince() != null) sb.append(__wrapNumber(count++, "areaProvince", getAreaProvince()));
		if(getAreaCity() != null) sb.append(__wrapNumber(count++, "areaCity", getAreaCity()));
		if(getAreaDistrict() != null) sb.append(__wrapNumber(count++, "areaDistrict", getAreaDistrict()));
		if(getDetailedAddress() != null) sb.append(__wrapString(count++, "detailedAddress", getDetailedAddress()));
		if(getPostcode() != null) sb.append(__wrapString(count++, "postcode", getPostcode()));
		if(getGender() != null) sb.append(__wrapNumber(count++, "gender", getGender()));
		if(getMemo() != null) sb.append(__wrapString(count++, "memo", getMemo()));
		if(getDetailCrmContactsCustomer() != null)  sb.append(__wrapList(count++, "detailCrmContactsCustomer", getDetailCrmContactsCustomer()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getContactId() != null) res.put("contactId", getContactId());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getEntityType() != null) res.put("entityType", getEntityType());
		if(getContactName() != null) res.put("contactName", getContactName());
		if(getTelephone() != null) res.put("telephone", getTelephone());
		if(getMobile() != null) res.put("mobile", getMobile());
		if(getEmail() != null) res.put("email", getEmail());
		if(getBirthday() != null) res.put("birthday", getBirthday());
		if(getDateLatestActivity() != null) res.put("dateLatestActivity", getDateLatestActivity());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getFlagLocked() != null) res.put("flagLocked", getFlagLocked());
		if(getFlagNoDisturb() != null) res.put("flagNoDisturb", getFlagNoDisturb());
		if(getContactRole() != null) res.put("contactRole", getContactRole());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getPosition() != null) res.put("position", getPosition());
		if(getWechat() != null) res.put("wechat", getWechat());
		if(getWeibo() != null) res.put("weibo", getWeibo());
		if(getAreaProvince() != null) res.put("areaProvince", getAreaProvince());
		if(getAreaCity() != null) res.put("areaCity", getAreaCity());
		if(getAreaDistrict() != null) res.put("areaDistrict", getAreaDistrict());
		if(getDetailedAddress() != null) res.put("detailedAddress", getDetailedAddress());
		if(getPostcode() != null) res.put("postcode", getPostcode());
		if(getGender() != null) res.put("gender", getGender());
		if(getMemo() != null) res.put("memo", getMemo());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("contactId")) != null) setContactId(__getInt(val)); 
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getInt(val)); 
		if((val = values.get("entityType")) != null) setEntityType(__getInt(val)); 
		if((val = values.get("contactName")) != null) setContactName(__getString(val));
		if((val = values.get("telephone")) != null) setTelephone(__getString(val));
		if((val = values.get("mobile")) != null) setMobile(__getString(val));
		if((val = values.get("email")) != null) setEmail(__getString(val));
		if((val = values.get("birthday")) != null) setBirthday(__getDate(val)); 
		if((val = values.get("dateLatestActivity")) != null) setDateLatestActivity(__getDate(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("flagLocked")) != null) setFlagLocked(__getBoolean(val));
		if((val = values.get("flagNoDisturb")) != null) setFlagNoDisturb(__getBoolean(val));
		if((val = values.get("contactRole")) != null) setContactRole(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("position")) != null) setPosition(__getString(val));
		if((val = values.get("wechat")) != null) setWechat(__getString(val));
		if((val = values.get("weibo")) != null) setWeibo(__getString(val));
		if((val = values.get("areaProvince")) != null) setAreaProvince(__getInt(val)); 
		if((val = values.get("areaCity")) != null) setAreaCity(__getInt(val)); 
		if((val = values.get("areaDistrict")) != null) setAreaDistrict(__getInt(val)); 
		if((val = values.get("detailedAddress")) != null) setDetailedAddress(__getString(val));
		if((val = values.get("postcode")) != null) setPostcode(__getString(val));
		if((val = values.get("gender")) != null) setGender(__getInt(val)); 
		if((val = values.get("memo")) != null) setMemo(__getString(val));
		if((val = values.get("detailCrmContactsCustomer")) != null) setDetailCrmContactsCustomer(__getList(val, BaseCrmContactsCustomer.newInstance()));
	}

	protected java.lang.Integer  __contact_id ;
	protected java.lang.Integer  __employee_id_maintainer ;
	protected java.lang.Integer  __entity_type ;
	protected java.lang.String  __contact_name ;
	protected java.lang.String  __telephone ;
	protected java.lang.String  __mobile ;
	protected java.lang.String  __email ;
	protected java.util.Date  __birthday ;
	protected java.util.Date  __date_latest_activity ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.lang.Boolean  __flag_locked ;
	protected java.lang.Boolean  __flag_no_disturb ;
	protected java.lang.Integer  __contact_role ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.String  __position ;
	protected java.lang.String  __wechat ;
	protected java.lang.String  __weibo ;
	protected java.lang.Integer  __area_province ;
	protected java.lang.Integer  __area_city ;
	protected java.lang.Integer  __area_district ;
	protected java.lang.String  __detailed_address ;
	protected java.lang.String  __postcode ;
	protected java.lang.Integer  __gender ;
	protected java.lang.String  __memo ;
	protected java.util.List<BaseCrmContactsCustomer> __detailCrmContactsCustomer = null;
}
