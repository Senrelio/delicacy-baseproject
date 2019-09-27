package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmCustomer extends GenericBase implements BaseFactory<BaseCrmCustomer>, Comparable<BaseCrmCustomer> 
{


	public static BaseCrmCustomer newInstance(){
		return new BaseCrmCustomer();
	}

	@Override
	public BaseCrmCustomer make(){
		BaseCrmCustomer b = new BaseCrmCustomer();
		return b;
	}

	public final static java.lang.String CS_CUSTOMER_ID = "customer_id" ;
	public final static java.lang.String CS_CUSTOMER_CODE = "customer_code" ;
	public final static java.lang.String CS_LEAD_ID = "lead_id" ;
	public final static java.lang.String CS_ENTITY_TYPE = "entity_type" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_CUSTOMER_NAME = "customer_name" ;
	public final static java.lang.String CS_LEVEL = "level" ;
	public final static java.lang.String CS_PARENT_CUSTOMER_ID = "parent_customer_id" ;
	public final static java.lang.String CS_INDUSTRY_ID = "industry_id" ;
	public final static java.lang.String CS_AREA_PROVINCE = "area_province" ;
	public final static java.lang.String CS_AREA_CITY = "area_city" ;
	public final static java.lang.String CS_AREA_DISTRICT = "area_district" ;
	public final static java.lang.String CS_DATE_LATEST_ACTIVITY = "date_latest_activity" ;
	public final static java.lang.String CS_EMPLOYEE_ID_LATEST_FOLLOWUP = "employee_id_latest_followup" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_FLAG_LOCKED = "flag_locked" ;
	public final static java.lang.String CS_FLAG_INDUSTRIAL_COMMERCIAL_REGISTERED = "flag_industrial_commercial_registered" ;
	public final static java.lang.String CS_FLAG_NO_DISTURB = "flag_no_disturb" ;
	public final static java.lang.String CS_DATE_LATEST_VISIT = "date_latest_visit" ;
	public final static java.lang.String CS_DAYCOUNT_NOT_VISITED = "daycount_not_visited" ;
	public final static java.lang.String CS_DETAILED_ADDRESS = "detailed_address" ;
	public final static java.lang.String CS_POSTCODE = "postcode" ;
	public final static java.lang.String CS_TELEPHONE = "telephone" ;
	public final static java.lang.String CS_FAX = "fax" ;
	public final static java.lang.String CS_COMPANY_WEBSITE_LINK = "company_website_link" ;
	public final static java.lang.String CS_WEIBO = "weibo" ;
	public final static java.lang.String CS_NUMBER_EMPLOYEES = "number_employees" ;
	public final static java.lang.String CS_ANNUAL_REVENUE = "annual_revenue" ;
	public final static java.lang.String CS_MEMO = "memo" ;

	public final static java.lang.String ALL_CAPTIONS = "客户编码,客户编号,销售线索编码,主体类型,维护人员工编码,客户名称,客户级别(重点客户，普通客户，非优先客户),父级客户编码,行业,省,市,区,最近活动时间,最近跟进员工编码,创建日期,创建人,最近修改日,最近修改人,所属部门编码,是否被锁定,有无工商登记,是否为免打扰客户,最近拜访时间,未拜访天数,详细地址,邮政编码,电话,传真,公司网址,微博,总人数,销售额,备注";

	public java.lang.Integer getCustomerId() {
		return this.__customer_id;
	}

	public void setCustomerId( java.lang.Integer value ) {
		this.__customer_id = value;
	}

	public java.lang.String getCustomerCode() {
		return this.__customer_code;
	}

	public void setCustomerCode( java.lang.String value ) {
		this.__customer_code = value;
	}

	public java.lang.Integer getLeadId() {
		return this.__lead_id;
	}

	public void setLeadId( java.lang.Integer value ) {
		this.__lead_id = value;
	}

	public java.lang.Integer getEntityType() {
		return this.__entity_type;
	}

	public void setEntityType( java.lang.Integer value ) {
		this.__entity_type = value;
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return this.__employee_id_maintainer;
	}

	public void setEmployeeIdMaintainer( java.lang.Integer value ) {
		this.__employee_id_maintainer = value;
	}

	public java.lang.String getCustomerName() {
		return this.__customer_name;
	}

	public void setCustomerName( java.lang.String value ) {
		this.__customer_name = value;
	}

	public java.lang.Integer getLevel() {
		return this.__level;
	}

	public void setLevel( java.lang.Integer value ) {
		this.__level = value;
	}

	public java.lang.Integer getParentCustomerId() {
		return this.__parent_customer_id;
	}

	public void setParentCustomerId( java.lang.Integer value ) {
		this.__parent_customer_id = value;
	}

	public java.lang.Integer getIndustryId() {
		return this.__industry_id;
	}

	public void setIndustryId( java.lang.Integer value ) {
		this.__industry_id = value;
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

	public java.util.Date getDateLatestActivity() {
		return this.__date_latest_activity;
	}

	public void setDateLatestActivity( java.util.Date value ) {
		this.__date_latest_activity = value;
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

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
	}

	public java.lang.Boolean getFlagLocked() {
		return this.__flag_locked;
	}

	public void setFlagLocked( java.lang.Boolean value ) {
		this.__flag_locked = value;
	}

	public java.lang.Boolean getFlagIndustrialCommercialRegistered() {
		return this.__flag_industrial_commercial_registered;
	}

	public void setFlagIndustrialCommercialRegistered( java.lang.Boolean value ) {
		this.__flag_industrial_commercial_registered = value;
	}

	public java.lang.Boolean getFlagNoDisturb() {
		return this.__flag_no_disturb;
	}

	public void setFlagNoDisturb( java.lang.Boolean value ) {
		this.__flag_no_disturb = value;
	}

	public java.util.Date getDateLatestVisit() {
		return this.__date_latest_visit;
	}

	public void setDateLatestVisit( java.util.Date value ) {
		this.__date_latest_visit = value;
	}

	public java.lang.Integer getDaycountNotVisited() {
		return this.__daycount_not_visited;
	}

	public void setDaycountNotVisited( java.lang.Integer value ) {
		this.__daycount_not_visited = value;
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

	public java.lang.String getTelephone() {
		return this.__telephone;
	}

	public void setTelephone( java.lang.String value ) {
		this.__telephone = value;
	}

	public java.lang.String getFax() {
		return this.__fax;
	}

	public void setFax( java.lang.String value ) {
		this.__fax = value;
	}

	public java.lang.String getCompanyWebsiteLink() {
		return this.__company_website_link;
	}

	public void setCompanyWebsiteLink( java.lang.String value ) {
		this.__company_website_link = value;
	}

	public java.lang.String getWeibo() {
		return this.__weibo;
	}

	public void setWeibo( java.lang.String value ) {
		this.__weibo = value;
	}

	public java.lang.Integer getNumberEmployees() {
		return this.__number_employees;
	}

	public void setNumberEmployees( java.lang.Integer value ) {
		this.__number_employees = value;
	}

	public java.math.BigDecimal getAnnualRevenue() {
		return this.__annual_revenue;
	}

	public void setAnnualRevenue( java.math.BigDecimal value ) {
		this.__annual_revenue = value;
	}

	public java.lang.String getMemo() {
		return this.__memo;
	}

	public void setMemo( java.lang.String value ) {
		this.__memo = value;
	}

	public void cloneCopy(BaseCrmCustomer __bean){
		__bean.setCustomerId(getCustomerId());
		__bean.setCustomerCode(getCustomerCode());
		__bean.setLeadId(getLeadId());
		__bean.setEntityType(getEntityType());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setCustomerName(getCustomerName());
		__bean.setLevel(getLevel());
		__bean.setParentCustomerId(getParentCustomerId());
		__bean.setIndustryId(getIndustryId());
		__bean.setAreaProvince(getAreaProvince());
		__bean.setAreaCity(getAreaCity());
		__bean.setAreaDistrict(getAreaDistrict());
		__bean.setDateLatestActivity(getDateLatestActivity());
		__bean.setEmployeeIdLatestFollowup(getEmployeeIdLatestFollowup());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setFlagLocked(getFlagLocked());
		__bean.setFlagIndustrialCommercialRegistered(getFlagIndustrialCommercialRegistered());
		__bean.setFlagNoDisturb(getFlagNoDisturb());
		__bean.setDateLatestVisit(getDateLatestVisit());
		__bean.setDaycountNotVisited(getDaycountNotVisited());
		__bean.setDetailedAddress(getDetailedAddress());
		__bean.setPostcode(getPostcode());
		__bean.setTelephone(getTelephone());
		__bean.setFax(getFax());
		__bean.setCompanyWebsiteLink(getCompanyWebsiteLink());
		__bean.setWeibo(getWeibo());
		__bean.setNumberEmployees(getNumberEmployees());
		__bean.setAnnualRevenue(getAnnualRevenue());
		__bean.setMemo(getMemo());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getCustomerId() == null ? "" : getCustomerId());
		sb.append(",");
		sb.append(getCustomerCode() == null ? "" : getCustomerCode());
		sb.append(",");
		sb.append(getLeadId() == null ? "" : getLeadId());
		sb.append(",");
		sb.append(getEntityType() == null ? "" : getEntityType());
		sb.append(",");
		sb.append(getEmployeeIdMaintainer() == null ? "" : getEmployeeIdMaintainer());
		sb.append(",");
		sb.append(getCustomerName() == null ? "" : getCustomerName());
		sb.append(",");
		sb.append(getLevel() == null ? "" : getLevel());
		sb.append(",");
		sb.append(getParentCustomerId() == null ? "" : getParentCustomerId());
		sb.append(",");
		sb.append(getIndustryId() == null ? "" : getIndustryId());
		sb.append(",");
		sb.append(getAreaProvince() == null ? "" : getAreaProvince());
		sb.append(",");
		sb.append(getAreaCity() == null ? "" : getAreaCity());
		sb.append(",");
		sb.append(getAreaDistrict() == null ? "" : getAreaDistrict());
		sb.append(",");
		sb.append(getDateLatestActivity() == null ? "" : sdf.format(getDateLatestActivity()));
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
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getFlagLocked() == null ? "" : getFlagLocked());
		sb.append(",");
		sb.append(getFlagIndustrialCommercialRegistered() == null ? "" : getFlagIndustrialCommercialRegistered());
		sb.append(",");
		sb.append(getFlagNoDisturb() == null ? "" : getFlagNoDisturb());
		sb.append(",");
		sb.append(getDateLatestVisit() == null ? "" : sdf.format(getDateLatestVisit()));
		sb.append(",");
		sb.append(getDaycountNotVisited() == null ? "" : getDaycountNotVisited());
		sb.append(",");
		sb.append(getDetailedAddress() == null ? "" : getDetailedAddress());
		sb.append(",");
		sb.append(getPostcode() == null ? "" : getPostcode());
		sb.append(",");
		sb.append(getTelephone() == null ? "" : getTelephone());
		sb.append(",");
		sb.append(getFax() == null ? "" : getFax());
		sb.append(",");
		sb.append(getCompanyWebsiteLink() == null ? "" : getCompanyWebsiteLink());
		sb.append(",");
		sb.append(getWeibo() == null ? "" : getWeibo());
		sb.append(",");
		sb.append(getNumberEmployees() == null ? "" : getNumberEmployees());
		sb.append(",");
		sb.append(getAnnualRevenue() == null ? "" : getAnnualRevenue());
		sb.append(",");
		sb.append(getMemo() == null ? "" : getMemo());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmCustomer o) {
		return __customer_id == null ? -1 : __customer_id.compareTo(o.getCustomerId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__customer_id);
		hash = 97 * hash + Objects.hashCode(this.__customer_code);
		hash = 97 * hash + Objects.hashCode(this.__lead_id);
		hash = 97 * hash + Objects.hashCode(this.__entity_type);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__customer_name);
		hash = 97 * hash + Objects.hashCode(this.__level);
		hash = 97 * hash + Objects.hashCode(this.__parent_customer_id);
		hash = 97 * hash + Objects.hashCode(this.__industry_id);
		hash = 97 * hash + Objects.hashCode(this.__area_province);
		hash = 97 * hash + Objects.hashCode(this.__area_city);
		hash = 97 * hash + Objects.hashCode(this.__area_district);
		hash = 97 * hash + Objects.hashCode(this.__date_latest_activity);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_latest_followup);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__flag_locked);
		hash = 97 * hash + Objects.hashCode(this.__flag_industrial_commercial_registered);
		hash = 97 * hash + Objects.hashCode(this.__flag_no_disturb);
		hash = 97 * hash + Objects.hashCode(this.__date_latest_visit);
		hash = 97 * hash + Objects.hashCode(this.__daycount_not_visited);
		hash = 97 * hash + Objects.hashCode(this.__detailed_address);
		hash = 97 * hash + Objects.hashCode(this.__postcode);
		hash = 97 * hash + Objects.hashCode(this.__telephone);
		hash = 97 * hash + Objects.hashCode(this.__fax);
		hash = 97 * hash + Objects.hashCode(this.__company_website_link);
		hash = 97 * hash + Objects.hashCode(this.__weibo);
		hash = 97 * hash + Objects.hashCode(this.__number_employees);
		hash = 97 * hash + Objects.hashCode(this.__annual_revenue);
		hash = 97 * hash + Objects.hashCode(this.__memo);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmCustomer o = (BaseCrmCustomer)obj;
		if(!Objects.equals(this.__customer_id, o.getCustomerId())) return false;
		if(!Objects.equals(this.__customer_code, o.getCustomerCode())) return false;
		if(!Objects.equals(this.__lead_id, o.getLeadId())) return false;
		if(!Objects.equals(this.__entity_type, o.getEntityType())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__customer_name, o.getCustomerName())) return false;
		if(!Objects.equals(this.__level, o.getLevel())) return false;
		if(!Objects.equals(this.__parent_customer_id, o.getParentCustomerId())) return false;
		if(!Objects.equals(this.__industry_id, o.getIndustryId())) return false;
		if(!Objects.equals(this.__area_province, o.getAreaProvince())) return false;
		if(!Objects.equals(this.__area_city, o.getAreaCity())) return false;
		if(!Objects.equals(this.__area_district, o.getAreaDistrict())) return false;
		if(!Objects.equals(this.__date_latest_activity, o.getDateLatestActivity())) return false;
		if(!Objects.equals(this.__employee_id_latest_followup, o.getEmployeeIdLatestFollowup())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__flag_locked, o.getFlagLocked())) return false;
		if(!Objects.equals(this.__flag_industrial_commercial_registered, o.getFlagIndustrialCommercialRegistered())) return false;
		if(!Objects.equals(this.__flag_no_disturb, o.getFlagNoDisturb())) return false;
		if(!Objects.equals(this.__date_latest_visit, o.getDateLatestVisit())) return false;
		if(!Objects.equals(this.__daycount_not_visited, o.getDaycountNotVisited())) return false;
		if(!Objects.equals(this.__detailed_address, o.getDetailedAddress())) return false;
		if(!Objects.equals(this.__postcode, o.getPostcode())) return false;
		if(!Objects.equals(this.__telephone, o.getTelephone())) return false;
		if(!Objects.equals(this.__fax, o.getFax())) return false;
		if(!Objects.equals(this.__company_website_link, o.getCompanyWebsiteLink())) return false;
		if(!Objects.equals(this.__weibo, o.getWeibo())) return false;
		if(!Objects.equals(this.__number_employees, o.getNumberEmployees())) return false;
		if(!Objects.equals(this.__annual_revenue, o.getAnnualRevenue())) return false;
		if(!Objects.equals(this.__memo, o.getMemo())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getCustomerId() != null) sb.append(__wrapNumber(count++, "customerId", getCustomerId()));
		if(getCustomerCode() != null) sb.append(__wrapString(count++, "customerCode", getCustomerCode()));
		if(getLeadId() != null) sb.append(__wrapNumber(count++, "leadId", getLeadId()));
		if(getEntityType() != null) sb.append(__wrapNumber(count++, "entityType", getEntityType()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapNumber(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getCustomerName() != null) sb.append(__wrapString(count++, "customerName", getCustomerName()));
		if(getLevel() != null) sb.append(__wrapNumber(count++, "level", getLevel()));
		if(getParentCustomerId() != null) sb.append(__wrapNumber(count++, "parentCustomerId", getParentCustomerId()));
		if(getIndustryId() != null) sb.append(__wrapNumber(count++, "industryId", getIndustryId()));
		if(getAreaProvince() != null) sb.append(__wrapNumber(count++, "areaProvince", getAreaProvince()));
		if(getAreaCity() != null) sb.append(__wrapNumber(count++, "areaCity", getAreaCity()));
		if(getAreaDistrict() != null) sb.append(__wrapNumber(count++, "areaDistrict", getAreaDistrict()));
		if(getDateLatestActivity() != null) sb.append(__wrapDate(count++, "dateLatestActivity", getDateLatestActivity()));
		if(getEmployeeIdLatestFollowup() != null) sb.append(__wrapNumber(count++, "employeeIdLatestFollowup", getEmployeeIdLatestFollowup()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getFlagLocked() != null) sb.append(__wrapBoolean(count++, "flagLocked", getFlagLocked()));
		if(getFlagIndustrialCommercialRegistered() != null) sb.append(__wrapBoolean(count++, "flagIndustrialCommercialRegistered", getFlagIndustrialCommercialRegistered()));
		if(getFlagNoDisturb() != null) sb.append(__wrapBoolean(count++, "flagNoDisturb", getFlagNoDisturb()));
		if(getDateLatestVisit() != null) sb.append(__wrapDate(count++, "dateLatestVisit", getDateLatestVisit()));
		if(getDaycountNotVisited() != null) sb.append(__wrapNumber(count++, "daycountNotVisited", getDaycountNotVisited()));
		if(getDetailedAddress() != null) sb.append(__wrapString(count++, "detailedAddress", getDetailedAddress()));
		if(getPostcode() != null) sb.append(__wrapString(count++, "postcode", getPostcode()));
		if(getTelephone() != null) sb.append(__wrapString(count++, "telephone", getTelephone()));
		if(getFax() != null) sb.append(__wrapString(count++, "fax", getFax()));
		if(getCompanyWebsiteLink() != null) sb.append(__wrapString(count++, "companyWebsiteLink", getCompanyWebsiteLink()));
		if(getWeibo() != null) sb.append(__wrapString(count++, "weibo", getWeibo()));
		if(getNumberEmployees() != null) sb.append(__wrapNumber(count++, "numberEmployees", getNumberEmployees()));
		if(getAnnualRevenue() != null) sb.append(__wrapDecimal(count++, "annualRevenue", getAnnualRevenue()));
		if(getMemo() != null) sb.append(__wrapString(count++, "memo", getMemo()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getCustomerId() != null) res.put("customerId", getCustomerId());
		if(getCustomerCode() != null) res.put("customerCode", getCustomerCode());
		if(getLeadId() != null) res.put("leadId", getLeadId());
		if(getEntityType() != null) res.put("entityType", getEntityType());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getCustomerName() != null) res.put("customerName", getCustomerName());
		if(getLevel() != null) res.put("level", getLevel());
		if(getParentCustomerId() != null) res.put("parentCustomerId", getParentCustomerId());
		if(getIndustryId() != null) res.put("industryId", getIndustryId());
		if(getAreaProvince() != null) res.put("areaProvince", getAreaProvince());
		if(getAreaCity() != null) res.put("areaCity", getAreaCity());
		if(getAreaDistrict() != null) res.put("areaDistrict", getAreaDistrict());
		if(getDateLatestActivity() != null) res.put("dateLatestActivity", getDateLatestActivity());
		if(getEmployeeIdLatestFollowup() != null) res.put("employeeIdLatestFollowup", getEmployeeIdLatestFollowup());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getFlagLocked() != null) res.put("flagLocked", getFlagLocked());
		if(getFlagIndustrialCommercialRegistered() != null) res.put("flagIndustrialCommercialRegistered", getFlagIndustrialCommercialRegistered());
		if(getFlagNoDisturb() != null) res.put("flagNoDisturb", getFlagNoDisturb());
		if(getDateLatestVisit() != null) res.put("dateLatestVisit", getDateLatestVisit());
		if(getDaycountNotVisited() != null) res.put("daycountNotVisited", getDaycountNotVisited());
		if(getDetailedAddress() != null) res.put("detailedAddress", getDetailedAddress());
		if(getPostcode() != null) res.put("postcode", getPostcode());
		if(getTelephone() != null) res.put("telephone", getTelephone());
		if(getFax() != null) res.put("fax", getFax());
		if(getCompanyWebsiteLink() != null) res.put("companyWebsiteLink", getCompanyWebsiteLink());
		if(getWeibo() != null) res.put("weibo", getWeibo());
		if(getNumberEmployees() != null) res.put("numberEmployees", getNumberEmployees());
		if(getAnnualRevenue() != null) res.put("annualRevenue", getAnnualRevenue());
		if(getMemo() != null) res.put("memo", getMemo());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("customerId")) != null) setCustomerId(__getInt(val)); 
		if((val = values.get("customerCode")) != null) setCustomerCode(__getString(val));
		if((val = values.get("leadId")) != null) setLeadId(__getInt(val)); 
		if((val = values.get("entityType")) != null) setEntityType(__getInt(val)); 
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getInt(val)); 
		if((val = values.get("customerName")) != null) setCustomerName(__getString(val));
		if((val = values.get("level")) != null) setLevel(__getInt(val)); 
		if((val = values.get("parentCustomerId")) != null) setParentCustomerId(__getInt(val)); 
		if((val = values.get("industryId")) != null) setIndustryId(__getInt(val)); 
		if((val = values.get("areaProvince")) != null) setAreaProvince(__getInt(val)); 
		if((val = values.get("areaCity")) != null) setAreaCity(__getInt(val)); 
		if((val = values.get("areaDistrict")) != null) setAreaDistrict(__getInt(val)); 
		if((val = values.get("dateLatestActivity")) != null) setDateLatestActivity(__getDate(val)); 
		if((val = values.get("employeeIdLatestFollowup")) != null) setEmployeeIdLatestFollowup(__getInt(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("flagLocked")) != null) setFlagLocked(__getBoolean(val));
		if((val = values.get("flagIndustrialCommercialRegistered")) != null) setFlagIndustrialCommercialRegistered(__getBoolean(val));
		if((val = values.get("flagNoDisturb")) != null) setFlagNoDisturb(__getBoolean(val));
		if((val = values.get("dateLatestVisit")) != null) setDateLatestVisit(__getDate(val)); 
		if((val = values.get("daycountNotVisited")) != null) setDaycountNotVisited(__getInt(val)); 
		if((val = values.get("detailedAddress")) != null) setDetailedAddress(__getString(val));
		if((val = values.get("postcode")) != null) setPostcode(__getString(val));
		if((val = values.get("telephone")) != null) setTelephone(__getString(val));
		if((val = values.get("fax")) != null) setFax(__getString(val));
		if((val = values.get("companyWebsiteLink")) != null) setCompanyWebsiteLink(__getString(val));
		if((val = values.get("weibo")) != null) setWeibo(__getString(val));
		if((val = values.get("numberEmployees")) != null) setNumberEmployees(__getInt(val)); 
		if((val = values.get("annualRevenue")) != null) setAnnualRevenue(__getDecimal(val));  
		if((val = values.get("memo")) != null) setMemo(__getString(val));
	}

	protected java.lang.Integer  __customer_id ;
	protected java.lang.String  __customer_code ;
	protected java.lang.Integer  __lead_id ;
	protected java.lang.Integer  __entity_type ;
	protected java.lang.Integer  __employee_id_maintainer ;
	protected java.lang.String  __customer_name ;
	protected java.lang.Integer  __level ;
	protected java.lang.Integer  __parent_customer_id ;
	protected java.lang.Integer  __industry_id ;
	protected java.lang.Integer  __area_province ;
	protected java.lang.Integer  __area_city ;
	protected java.lang.Integer  __area_district ;
	protected java.util.Date  __date_latest_activity ;
	protected java.lang.Integer  __employee_id_latest_followup ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Boolean  __flag_locked ;
	protected java.lang.Boolean  __flag_industrial_commercial_registered ;
	protected java.lang.Boolean  __flag_no_disturb ;
	protected java.util.Date  __date_latest_visit ;
	protected java.lang.Integer  __daycount_not_visited ;
	protected java.lang.String  __detailed_address ;
	protected java.lang.String  __postcode ;
	protected java.lang.String  __telephone ;
	protected java.lang.String  __fax ;
	protected java.lang.String  __company_website_link ;
	protected java.lang.String  __weibo ;
	protected java.lang.Integer  __number_employees ;
	protected java.math.BigDecimal  __annual_revenue ;
	protected java.lang.String  __memo ;
}
