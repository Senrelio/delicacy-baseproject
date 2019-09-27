package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmPriceList extends GenericBase implements BaseFactory<BaseCrmPriceList>, Comparable<BaseCrmPriceList> 
{


	public static BaseCrmPriceList newInstance(){
		return new BaseCrmPriceList();
	}

	@Override
	public BaseCrmPriceList make(){
		BaseCrmPriceList b = new BaseCrmPriceList();
		return b;
	}

	public final static java.lang.String CS_PRICE_LIST_ID = "price_list_id" ;
	public final static java.lang.String CS_PRICE_LIST_NAME = "price_list_name" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_FLAG_ENABLED = "flag_enabled" ;
	public final static java.lang.String CS_MEMO = "memo" ;
	public final static java.lang.String CS_FLAG_STANDARD_PRICE_LIST = "flag_standard_price_list" ;
	public final static java.lang.String CS_FLAG_LOCKED = "flag_locked" ;

	public final static java.lang.String ALL_CAPTIONS = "价目表编码,价格表名称,维护人员工编码,所属部门,创建人编码,创建日期,修改人编码,修改日期,是否已启用,描述,是否为标准价格表,是否被锁定";

	public java.lang.Integer getPriceListId() {
		return this.__price_list_id;
	}

	public void setPriceListId( java.lang.Integer value ) {
		this.__price_list_id = value;
	}

	public java.lang.String getPriceListName() {
		return this.__price_list_name;
	}

	public void setPriceListName( java.lang.String value ) {
		this.__price_list_name = value;
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

	public java.lang.Boolean getFlagEnabled() {
		return this.__flag_enabled;
	}

	public void setFlagEnabled( java.lang.Boolean value ) {
		this.__flag_enabled = value;
	}

	public java.lang.String getMemo() {
		return this.__memo;
	}

	public void setMemo( java.lang.String value ) {
		this.__memo = value;
	}

	public java.lang.Boolean getFlagStandardPriceList() {
		return this.__flag_standard_price_list;
	}

	public void setFlagStandardPriceList( java.lang.Boolean value ) {
		this.__flag_standard_price_list = value;
	}

	public java.lang.Boolean getFlagLocked() {
		return this.__flag_locked;
	}

	public void setFlagLocked( java.lang.Boolean value ) {
		this.__flag_locked = value;
	}

	public void cloneCopy(BaseCrmPriceList __bean){
		__bean.setPriceListId(getPriceListId());
		__bean.setPriceListName(getPriceListName());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setFlagEnabled(getFlagEnabled());
		__bean.setMemo(getMemo());
		__bean.setFlagStandardPriceList(getFlagStandardPriceList());
		__bean.setFlagLocked(getFlagLocked());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getPriceListId() == null ? "" : getPriceListId());
		sb.append(",");
		sb.append(getPriceListName() == null ? "" : getPriceListName());
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
		sb.append(getFlagEnabled() == null ? "" : getFlagEnabled());
		sb.append(",");
		sb.append(getMemo() == null ? "" : getMemo());
		sb.append(",");
		sb.append(getFlagStandardPriceList() == null ? "" : getFlagStandardPriceList());
		sb.append(",");
		sb.append(getFlagLocked() == null ? "" : getFlagLocked());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmPriceList o) {
		return __price_list_id == null ? -1 : __price_list_id.compareTo(o.getPriceListId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__price_list_id);
		hash = 97 * hash + Objects.hashCode(this.__price_list_name);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__flag_enabled);
		hash = 97 * hash + Objects.hashCode(this.__memo);
		hash = 97 * hash + Objects.hashCode(this.__flag_standard_price_list);
		hash = 97 * hash + Objects.hashCode(this.__flag_locked);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmPriceList o = (BaseCrmPriceList)obj;
		if(!Objects.equals(this.__price_list_id, o.getPriceListId())) return false;
		if(!Objects.equals(this.__price_list_name, o.getPriceListName())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__flag_enabled, o.getFlagEnabled())) return false;
		if(!Objects.equals(this.__memo, o.getMemo())) return false;
		if(!Objects.equals(this.__flag_standard_price_list, o.getFlagStandardPriceList())) return false;
		if(!Objects.equals(this.__flag_locked, o.getFlagLocked())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getPriceListId() != null) sb.append(__wrapNumber(count++, "priceListId", getPriceListId()));
		if(getPriceListName() != null) sb.append(__wrapString(count++, "priceListName", getPriceListName()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapString(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getDepartmentId() != null) sb.append(__wrapString(count++, "departmentId", getDepartmentId()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapString(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapString(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getFlagEnabled() != null) sb.append(__wrapBoolean(count++, "flagEnabled", getFlagEnabled()));
		if(getMemo() != null) sb.append(__wrapString(count++, "memo", getMemo()));
		if(getFlagStandardPriceList() != null) sb.append(__wrapBoolean(count++, "flagStandardPriceList", getFlagStandardPriceList()));
		if(getFlagLocked() != null) sb.append(__wrapBoolean(count++, "flagLocked", getFlagLocked()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getPriceListId() != null) res.put("priceListId", getPriceListId());
		if(getPriceListName() != null) res.put("priceListName", getPriceListName());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getFlagEnabled() != null) res.put("flagEnabled", getFlagEnabled());
		if(getMemo() != null) res.put("memo", getMemo());
		if(getFlagStandardPriceList() != null) res.put("flagStandardPriceList", getFlagStandardPriceList());
		if(getFlagLocked() != null) res.put("flagLocked", getFlagLocked());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("priceListId")) != null) setPriceListId(__getInt(val)); 
		if((val = values.get("priceListName")) != null) setPriceListName(__getString(val));
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getString(val));
		if((val = values.get("departmentId")) != null) setDepartmentId(__getString(val));
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getString(val));
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getString(val));
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("flagEnabled")) != null) setFlagEnabled(__getBoolean(val));
		if((val = values.get("memo")) != null) setMemo(__getString(val));
		if((val = values.get("flagStandardPriceList")) != null) setFlagStandardPriceList(__getBoolean(val));
		if((val = values.get("flagLocked")) != null) setFlagLocked(__getBoolean(val));
	}

	protected java.lang.Integer  __price_list_id ;
	protected java.lang.String  __price_list_name ;
	protected java.lang.String  __employee_id_maintainer ;
	protected java.lang.String  __department_id ;
	protected java.lang.String  __employee_id_created ;
	protected java.util.Date  __date_created ;
	protected java.lang.String  __employee_id_updated ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Boolean  __flag_enabled ;
	protected java.lang.String  __memo ;
	protected java.lang.Boolean  __flag_standard_price_list ;
	protected java.lang.Boolean  __flag_locked ;
}
