package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmQuotation extends GenericBase implements BaseFactory<BaseCrmQuotation>, Comparable<BaseCrmQuotation> 
{


	public static BaseCrmQuotation newInstance(){
		return new BaseCrmQuotation();
	}

	@Override
	public BaseCrmQuotation make(){
		BaseCrmQuotation b = new BaseCrmQuotation();
		return b;
	}

	public final static java.lang.String CS_QUOTATION_ID = "quotation_id" ;
	public final static java.lang.String CS_QUOTATION_CODE = "quotation_code" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_FLAG_LOCKED = "flag_locked" ;
	public final static java.lang.String CS_CUSTOMER_NAME = "customer_name" ;
	public final static java.lang.String CS_OPPORTUNITY_NAME = "opportunity_name" ;
	public final static java.lang.String CS_QUOTATION_TITLE = "quotation_title" ;
	public final static java.lang.String CS_DATE_VALIDATION = "date_validation" ;
	public final static java.lang.String CS_STAGE_QUOTATION = "stage_quotation" ;
	public final static java.lang.String CS_DATE_CALLED = "date_called" ;
	public final static java.lang.String CS_DATE_LATEST_SYNC = "date_latest_sync" ;
	public final static java.lang.String CS_SUM_QUOTATION = "sum_quotation" ;
	public final static java.lang.String CS_CONTACT_NAME = "contact_name" ;
	public final static java.lang.String CS_CONTACT_MOBILE = "contact_mobile" ;
	public final static java.lang.String CS_CONTACT_EMAIL = "contact_email" ;
	public final static java.lang.String CS_MEMO = "memo" ;
	public final static java.lang.String CS_PRICE_LIST_ID = "price_list_id" ;
	public final static java.lang.String CS_SUM_LISTED = "sum_listed" ;
	public final static java.lang.String CS_SUM_DISCOUNT = "sum_discount" ;
	public final static java.lang.String CS_QUOTATION_MAIN = "quotation_main" ;

	public final static java.lang.String ALL_CAPTIONS = "报价单编码,报价单编号,维护人员工编码,所属部门,创建人编码,创建日期,修改人编码,修改日期,是否被锁定,客户名称,销售机会名称,报价单名称,有效日期,报价单阶段,报价时间,最近同步时间,总金额,联系人姓名,联系人手机号,联系人邮箱,备注,价目表编码,标准总价,总折扣额,主报价单";

	public java.lang.Integer getQuotationId() {
		return this.__quotation_id;
	}

	public void setQuotationId( java.lang.Integer value ) {
		this.__quotation_id = value;
	}

	public java.lang.Integer getQuotationCode() {
		return this.__quotation_code;
	}

	public void setQuotationCode( java.lang.Integer value ) {
		this.__quotation_code = value;
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return this.__employee_id_maintainer;
	}

	public void setEmployeeIdMaintainer( java.lang.Integer value ) {
		this.__employee_id_maintainer = value;
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

	public java.lang.Boolean getFlagLocked() {
		return this.__flag_locked;
	}

	public void setFlagLocked( java.lang.Boolean value ) {
		this.__flag_locked = value;
	}

	public java.lang.Integer getCustomerName() {
		return this.__customer_name;
	}

	public void setCustomerName( java.lang.Integer value ) {
		this.__customer_name = value;
	}

	public java.lang.Integer getOpportunityName() {
		return this.__opportunity_name;
	}

	public void setOpportunityName( java.lang.Integer value ) {
		this.__opportunity_name = value;
	}

	public java.lang.String getQuotationTitle() {
		return this.__quotation_title;
	}

	public void setQuotationTitle( java.lang.String value ) {
		this.__quotation_title = value;
	}

	public java.util.Date getDateValidation() {
		return this.__date_validation;
	}

	public void setDateValidation( java.util.Date value ) {
		this.__date_validation = value;
	}

	public java.lang.Integer getStageQuotation() {
		return this.__stage_quotation;
	}

	public void setStageQuotation( java.lang.Integer value ) {
		this.__stage_quotation = value;
	}

	public java.util.Date getDateCalled() {
		return this.__date_called;
	}

	public void setDateCalled( java.util.Date value ) {
		this.__date_called = value;
	}

	public java.util.Date getDateLatestSync() {
		return this.__date_latest_sync;
	}

	public void setDateLatestSync( java.util.Date value ) {
		this.__date_latest_sync = value;
	}

	public java.math.BigDecimal getSumQuotation() {
		return this.__sum_quotation;
	}

	public void setSumQuotation( java.math.BigDecimal value ) {
		this.__sum_quotation = value;
	}

	public java.lang.Integer getContactName() {
		return this.__contact_name;
	}

	public void setContactName( java.lang.Integer value ) {
		this.__contact_name = value;
	}

	public java.lang.String getContactMobile() {
		return this.__contact_mobile;
	}

	public void setContactMobile( java.lang.String value ) {
		this.__contact_mobile = value;
	}

	public java.lang.String getContactEmail() {
		return this.__contact_email;
	}

	public void setContactEmail( java.lang.String value ) {
		this.__contact_email = value;
	}

	public java.lang.String getMemo() {
		return this.__memo;
	}

	public void setMemo( java.lang.String value ) {
		this.__memo = value;
	}

	public java.lang.Integer getPriceListId() {
		return this.__price_list_id;
	}

	public void setPriceListId( java.lang.Integer value ) {
		this.__price_list_id = value;
	}

	public java.math.BigDecimal getSumListed() {
		return this.__sum_listed;
	}

	public void setSumListed( java.math.BigDecimal value ) {
		this.__sum_listed = value;
	}

	public java.math.BigDecimal getSumDiscount() {
		return this.__sum_discount;
	}

	public void setSumDiscount( java.math.BigDecimal value ) {
		this.__sum_discount = value;
	}

	public java.lang.Integer getQuotationMain() {
		return this.__quotation_main;
	}

	public void setQuotationMain( java.lang.Integer value ) {
		this.__quotation_main = value;
	}

	public void cloneCopy(BaseCrmQuotation __bean){
		__bean.setQuotationId(getQuotationId());
		__bean.setQuotationCode(getQuotationCode());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setFlagLocked(getFlagLocked());
		__bean.setCustomerName(getCustomerName());
		__bean.setOpportunityName(getOpportunityName());
		__bean.setQuotationTitle(getQuotationTitle());
		__bean.setDateValidation(getDateValidation());
		__bean.setStageQuotation(getStageQuotation());
		__bean.setDateCalled(getDateCalled());
		__bean.setDateLatestSync(getDateLatestSync());
		__bean.setSumQuotation(getSumQuotation());
		__bean.setContactName(getContactName());
		__bean.setContactMobile(getContactMobile());
		__bean.setContactEmail(getContactEmail());
		__bean.setMemo(getMemo());
		__bean.setPriceListId(getPriceListId());
		__bean.setSumListed(getSumListed());
		__bean.setSumDiscount(getSumDiscount());
		__bean.setQuotationMain(getQuotationMain());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getQuotationId() == null ? "" : getQuotationId());
		sb.append(",");
		sb.append(getQuotationCode() == null ? "" : getQuotationCode());
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
		sb.append(getFlagLocked() == null ? "" : getFlagLocked());
		sb.append(",");
		sb.append(getCustomerName() == null ? "" : getCustomerName());
		sb.append(",");
		sb.append(getOpportunityName() == null ? "" : getOpportunityName());
		sb.append(",");
		sb.append(getQuotationTitle() == null ? "" : getQuotationTitle());
		sb.append(",");
		sb.append(getDateValidation() == null ? "" : sdf.format(getDateValidation()));
		sb.append(",");
		sb.append(getStageQuotation() == null ? "" : getStageQuotation());
		sb.append(",");
		sb.append(getDateCalled() == null ? "" : sdf.format(getDateCalled()));
		sb.append(",");
		sb.append(getDateLatestSync() == null ? "" : sdf.format(getDateLatestSync()));
		sb.append(",");
		sb.append(getSumQuotation() == null ? "" : getSumQuotation());
		sb.append(",");
		sb.append(getContactName() == null ? "" : getContactName());
		sb.append(",");
		sb.append(getContactMobile() == null ? "" : getContactMobile());
		sb.append(",");
		sb.append(getContactEmail() == null ? "" : getContactEmail());
		sb.append(",");
		sb.append(getMemo() == null ? "" : getMemo());
		sb.append(",");
		sb.append(getPriceListId() == null ? "" : getPriceListId());
		sb.append(",");
		sb.append(getSumListed() == null ? "" : getSumListed());
		sb.append(",");
		sb.append(getSumDiscount() == null ? "" : getSumDiscount());
		sb.append(",");
		sb.append(getQuotationMain() == null ? "" : getQuotationMain());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmQuotation o) {
		return __quotation_id == null ? -1 : __quotation_id.compareTo(o.getQuotationId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__quotation_id);
		hash = 97 * hash + Objects.hashCode(this.__quotation_code);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__flag_locked);
		hash = 97 * hash + Objects.hashCode(this.__customer_name);
		hash = 97 * hash + Objects.hashCode(this.__opportunity_name);
		hash = 97 * hash + Objects.hashCode(this.__quotation_title);
		hash = 97 * hash + Objects.hashCode(this.__date_validation);
		hash = 97 * hash + Objects.hashCode(this.__stage_quotation);
		hash = 97 * hash + Objects.hashCode(this.__date_called);
		hash = 97 * hash + Objects.hashCode(this.__date_latest_sync);
		hash = 97 * hash + Objects.hashCode(this.__sum_quotation);
		hash = 97 * hash + Objects.hashCode(this.__contact_name);
		hash = 97 * hash + Objects.hashCode(this.__contact_mobile);
		hash = 97 * hash + Objects.hashCode(this.__contact_email);
		hash = 97 * hash + Objects.hashCode(this.__memo);
		hash = 97 * hash + Objects.hashCode(this.__price_list_id);
		hash = 97 * hash + Objects.hashCode(this.__sum_listed);
		hash = 97 * hash + Objects.hashCode(this.__sum_discount);
		hash = 97 * hash + Objects.hashCode(this.__quotation_main);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmQuotation o = (BaseCrmQuotation)obj;
		if(!Objects.equals(this.__quotation_id, o.getQuotationId())) return false;
		if(!Objects.equals(this.__quotation_code, o.getQuotationCode())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__flag_locked, o.getFlagLocked())) return false;
		if(!Objects.equals(this.__customer_name, o.getCustomerName())) return false;
		if(!Objects.equals(this.__opportunity_name, o.getOpportunityName())) return false;
		if(!Objects.equals(this.__quotation_title, o.getQuotationTitle())) return false;
		if(!Objects.equals(this.__date_validation, o.getDateValidation())) return false;
		if(!Objects.equals(this.__stage_quotation, o.getStageQuotation())) return false;
		if(!Objects.equals(this.__date_called, o.getDateCalled())) return false;
		if(!Objects.equals(this.__date_latest_sync, o.getDateLatestSync())) return false;
		if(!Objects.equals(this.__sum_quotation, o.getSumQuotation())) return false;
		if(!Objects.equals(this.__contact_name, o.getContactName())) return false;
		if(!Objects.equals(this.__contact_mobile, o.getContactMobile())) return false;
		if(!Objects.equals(this.__contact_email, o.getContactEmail())) return false;
		if(!Objects.equals(this.__memo, o.getMemo())) return false;
		if(!Objects.equals(this.__price_list_id, o.getPriceListId())) return false;
		if(!Objects.equals(this.__sum_listed, o.getSumListed())) return false;
		if(!Objects.equals(this.__sum_discount, o.getSumDiscount())) return false;
		if(!Objects.equals(this.__quotation_main, o.getQuotationMain())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getQuotationId() != null) sb.append(__wrapNumber(count++, "quotationId", getQuotationId()));
		if(getQuotationCode() != null) sb.append(__wrapNumber(count++, "quotationCode", getQuotationCode()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapNumber(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getFlagLocked() != null) sb.append(__wrapBoolean(count++, "flagLocked", getFlagLocked()));
		if(getCustomerName() != null) sb.append(__wrapNumber(count++, "customerName", getCustomerName()));
		if(getOpportunityName() != null) sb.append(__wrapNumber(count++, "opportunityName", getOpportunityName()));
		if(getQuotationTitle() != null) sb.append(__wrapString(count++, "quotationTitle", getQuotationTitle()));
		if(getDateValidation() != null) sb.append(__wrapDate(count++, "dateValidation", getDateValidation()));
		if(getStageQuotation() != null) sb.append(__wrapNumber(count++, "stageQuotation", getStageQuotation()));
		if(getDateCalled() != null) sb.append(__wrapDate(count++, "dateCalled", getDateCalled()));
		if(getDateLatestSync() != null) sb.append(__wrapDate(count++, "dateLatestSync", getDateLatestSync()));
		if(getSumQuotation() != null) sb.append(__wrapDecimal(count++, "sumQuotation", getSumQuotation()));
		if(getContactName() != null) sb.append(__wrapNumber(count++, "contactName", getContactName()));
		if(getContactMobile() != null) sb.append(__wrapString(count++, "contactMobile", getContactMobile()));
		if(getContactEmail() != null) sb.append(__wrapString(count++, "contactEmail", getContactEmail()));
		if(getMemo() != null) sb.append(__wrapString(count++, "memo", getMemo()));
		if(getPriceListId() != null) sb.append(__wrapNumber(count++, "priceListId", getPriceListId()));
		if(getSumListed() != null) sb.append(__wrapDecimal(count++, "sumListed", getSumListed()));
		if(getSumDiscount() != null) sb.append(__wrapDecimal(count++, "sumDiscount", getSumDiscount()));
		if(getQuotationMain() != null) sb.append(__wrapNumber(count++, "quotationMain", getQuotationMain()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getQuotationId() != null) res.put("quotationId", getQuotationId());
		if(getQuotationCode() != null) res.put("quotationCode", getQuotationCode());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getFlagLocked() != null) res.put("flagLocked", getFlagLocked());
		if(getCustomerName() != null) res.put("customerName", getCustomerName());
		if(getOpportunityName() != null) res.put("opportunityName", getOpportunityName());
		if(getQuotationTitle() != null) res.put("quotationTitle", getQuotationTitle());
		if(getDateValidation() != null) res.put("dateValidation", getDateValidation());
		if(getStageQuotation() != null) res.put("stageQuotation", getStageQuotation());
		if(getDateCalled() != null) res.put("dateCalled", getDateCalled());
		if(getDateLatestSync() != null) res.put("dateLatestSync", getDateLatestSync());
		if(getSumQuotation() != null) res.put("sumQuotation", getSumQuotation());
		if(getContactName() != null) res.put("contactName", getContactName());
		if(getContactMobile() != null) res.put("contactMobile", getContactMobile());
		if(getContactEmail() != null) res.put("contactEmail", getContactEmail());
		if(getMemo() != null) res.put("memo", getMemo());
		if(getPriceListId() != null) res.put("priceListId", getPriceListId());
		if(getSumListed() != null) res.put("sumListed", getSumListed());
		if(getSumDiscount() != null) res.put("sumDiscount", getSumDiscount());
		if(getQuotationMain() != null) res.put("quotationMain", getQuotationMain());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("quotationId")) != null) setQuotationId(__getInt(val)); 
		if((val = values.get("quotationCode")) != null) setQuotationCode(__getInt(val)); 
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("flagLocked")) != null) setFlagLocked(__getBoolean(val));
		if((val = values.get("customerName")) != null) setCustomerName(__getInt(val)); 
		if((val = values.get("opportunityName")) != null) setOpportunityName(__getInt(val)); 
		if((val = values.get("quotationTitle")) != null) setQuotationTitle(__getString(val));
		if((val = values.get("dateValidation")) != null) setDateValidation(__getDate(val)); 
		if((val = values.get("stageQuotation")) != null) setStageQuotation(__getInt(val)); 
		if((val = values.get("dateCalled")) != null) setDateCalled(__getDate(val)); 
		if((val = values.get("dateLatestSync")) != null) setDateLatestSync(__getDate(val)); 
		if((val = values.get("sumQuotation")) != null) setSumQuotation(__getDecimal(val));  
		if((val = values.get("contactName")) != null) setContactName(__getInt(val)); 
		if((val = values.get("contactMobile")) != null) setContactMobile(__getString(val));
		if((val = values.get("contactEmail")) != null) setContactEmail(__getString(val));
		if((val = values.get("memo")) != null) setMemo(__getString(val));
		if((val = values.get("priceListId")) != null) setPriceListId(__getInt(val)); 
		if((val = values.get("sumListed")) != null) setSumListed(__getDecimal(val));  
		if((val = values.get("sumDiscount")) != null) setSumDiscount(__getDecimal(val));  
		if((val = values.get("quotationMain")) != null) setQuotationMain(__getInt(val)); 
	}

	protected java.lang.Integer  __quotation_id ;
	protected java.lang.Integer  __quotation_code ;
	protected java.lang.Integer  __employee_id_maintainer ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Boolean  __flag_locked ;
	protected java.lang.Integer  __customer_name ;
	protected java.lang.Integer  __opportunity_name ;
	protected java.lang.String  __quotation_title ;
	protected java.util.Date  __date_validation ;
	protected java.lang.Integer  __stage_quotation ;
	protected java.util.Date  __date_called ;
	protected java.util.Date  __date_latest_sync ;
	protected java.math.BigDecimal  __sum_quotation ;
	protected java.lang.Integer  __contact_name ;
	protected java.lang.String  __contact_mobile ;
	protected java.lang.String  __contact_email ;
	protected java.lang.String  __memo ;
	protected java.lang.Integer  __price_list_id ;
	protected java.math.BigDecimal  __sum_listed ;
	protected java.math.BigDecimal  __sum_discount ;
	protected java.lang.Integer  __quotation_main ;
}
