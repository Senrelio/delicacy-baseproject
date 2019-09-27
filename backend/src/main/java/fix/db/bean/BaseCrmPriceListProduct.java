package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmPriceListProduct extends GenericBase implements BaseFactory<BaseCrmPriceListProduct>, Comparable<BaseCrmPriceListProduct> 
{


	public static BaseCrmPriceListProduct newInstance(){
		return new BaseCrmPriceListProduct();
	}

	@Override
	public BaseCrmPriceListProduct make(){
		BaseCrmPriceListProduct b = new BaseCrmPriceListProduct();
		return b;
	}

	public final static java.lang.String CS_PRICE_LIST_PRODUCT_ID = "price_list_product_id" ;
	public final static java.lang.String CS_PRICE_LIST_ID = "price_list_id" ;
	public final static java.lang.String CS_PRODUCT_ID = "product_id" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_PRICE_UNIT_LISTED = "price_unit_listed" ;
	public final static java.lang.String CS_FLAG_STANDARD_PRICE_UNIT = "flag_standard_price_unit" ;
	public final static java.lang.String CS_PRICE_UNIT = "price_unit" ;
	public final static java.lang.String CS_FLAG_ENABLED = "flag_enabled" ;
	public final static java.lang.String CS_MEMO = "memo" ;

	public final static java.lang.String ALL_CAPTIONS = "价格表-<产品明细编码,价格表编码,产品编码,所属部门,创建人编码,创建日期,修改人编码,修改日期,标准单价,是否使用标准单价,价格表价格,是否已启用,备注";

	public java.lang.Integer getPriceListProductId() {
		return this.__price_list_product_id;
	}

	public void setPriceListProductId( java.lang.Integer value ) {
		this.__price_list_product_id = value;
	}

	public java.lang.Integer getPriceListId() {
		return this.__price_list_id;
	}

	public void setPriceListId( java.lang.Integer value ) {
		this.__price_list_id = value;
	}

	public java.lang.Integer getProductId() {
		return this.__product_id;
	}

	public void setProductId( java.lang.Integer value ) {
		this.__product_id = value;
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

	public java.lang.Float getPriceUnitListed() {
		return this.__price_unit_listed;
	}

	public void setPriceUnitListed( java.lang.Float value ) {
		this.__price_unit_listed = value;
	}

	public java.lang.Boolean getFlagStandardPriceUnit() {
		return this.__flag_standard_price_unit;
	}

	public void setFlagStandardPriceUnit( java.lang.Boolean value ) {
		this.__flag_standard_price_unit = value;
	}

	public java.lang.Float getPriceUnit() {
		return this.__price_unit;
	}

	public void setPriceUnit( java.lang.Float value ) {
		this.__price_unit = value;
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

	public void cloneCopy(BaseCrmPriceListProduct __bean){
		__bean.setPriceListProductId(getPriceListProductId());
		__bean.setPriceListId(getPriceListId());
		__bean.setProductId(getProductId());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setPriceUnitListed(getPriceUnitListed());
		__bean.setFlagStandardPriceUnit(getFlagStandardPriceUnit());
		__bean.setPriceUnit(getPriceUnit());
		__bean.setFlagEnabled(getFlagEnabled());
		__bean.setMemo(getMemo());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getPriceListProductId() == null ? "" : getPriceListProductId());
		sb.append(",");
		sb.append(getPriceListId() == null ? "" : getPriceListId());
		sb.append(",");
		sb.append(getProductId() == null ? "" : getProductId());
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
		sb.append(getPriceUnitListed() == null ? "" : getPriceUnitListed());
		sb.append(",");
		sb.append(getFlagStandardPriceUnit() == null ? "" : getFlagStandardPriceUnit());
		sb.append(",");
		sb.append(getPriceUnit() == null ? "" : getPriceUnit());
		sb.append(",");
		sb.append(getFlagEnabled() == null ? "" : getFlagEnabled());
		sb.append(",");
		sb.append(getMemo() == null ? "" : getMemo());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmPriceListProduct o) {
		return __price_list_product_id == null ? -1 : __price_list_product_id.compareTo(o.getPriceListProductId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__price_list_product_id);
		hash = 97 * hash + Objects.hashCode(this.__price_list_id);
		hash = 97 * hash + Objects.hashCode(this.__product_id);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__price_unit_listed);
		hash = 97 * hash + Objects.hashCode(this.__flag_standard_price_unit);
		hash = 97 * hash + Objects.hashCode(this.__price_unit);
		hash = 97 * hash + Objects.hashCode(this.__flag_enabled);
		hash = 97 * hash + Objects.hashCode(this.__memo);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmPriceListProduct o = (BaseCrmPriceListProduct)obj;
		if(!Objects.equals(this.__price_list_product_id, o.getPriceListProductId())) return false;
		if(!Objects.equals(this.__price_list_id, o.getPriceListId())) return false;
		if(!Objects.equals(this.__product_id, o.getProductId())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__price_unit_listed, o.getPriceUnitListed())) return false;
		if(!Objects.equals(this.__flag_standard_price_unit, o.getFlagStandardPriceUnit())) return false;
		if(!Objects.equals(this.__price_unit, o.getPriceUnit())) return false;
		if(!Objects.equals(this.__flag_enabled, o.getFlagEnabled())) return false;
		if(!Objects.equals(this.__memo, o.getMemo())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getPriceListProductId() != null) sb.append(__wrapNumber(count++, "priceListProductId", getPriceListProductId()));
		if(getPriceListId() != null) sb.append(__wrapNumber(count++, "priceListId", getPriceListId()));
		if(getProductId() != null) sb.append(__wrapNumber(count++, "productId", getProductId()));
		if(getDepartmentId() != null) sb.append(__wrapString(count++, "departmentId", getDepartmentId()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapString(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapString(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getPriceUnitListed() != null) sb.append(__wrapNumber(count++, "priceUnitListed", getPriceUnitListed()));
		if(getFlagStandardPriceUnit() != null) sb.append(__wrapBoolean(count++, "flagStandardPriceUnit", getFlagStandardPriceUnit()));
		if(getPriceUnit() != null) sb.append(__wrapNumber(count++, "priceUnit", getPriceUnit()));
		if(getFlagEnabled() != null) sb.append(__wrapBoolean(count++, "flagEnabled", getFlagEnabled()));
		if(getMemo() != null) sb.append(__wrapString(count++, "memo", getMemo()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getPriceListProductId() != null) res.put("priceListProductId", getPriceListProductId());
		if(getPriceListId() != null) res.put("priceListId", getPriceListId());
		if(getProductId() != null) res.put("productId", getProductId());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getPriceUnitListed() != null) res.put("priceUnitListed", getPriceUnitListed());
		if(getFlagStandardPriceUnit() != null) res.put("flagStandardPriceUnit", getFlagStandardPriceUnit());
		if(getPriceUnit() != null) res.put("priceUnit", getPriceUnit());
		if(getFlagEnabled() != null) res.put("flagEnabled", getFlagEnabled());
		if(getMemo() != null) res.put("memo", getMemo());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("priceListProductId")) != null) setPriceListProductId(__getInt(val)); 
		if((val = values.get("priceListId")) != null) setPriceListId(__getInt(val)); 
		if((val = values.get("productId")) != null) setProductId(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getString(val));
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getString(val));
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getString(val));
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("priceUnitListed")) != null) setPriceUnitListed(__getFloat(val));  
		if((val = values.get("flagStandardPriceUnit")) != null) setFlagStandardPriceUnit(__getBoolean(val));
		if((val = values.get("priceUnit")) != null) setPriceUnit(__getFloat(val));  
		if((val = values.get("flagEnabled")) != null) setFlagEnabled(__getBoolean(val));
		if((val = values.get("memo")) != null) setMemo(__getString(val));
	}

	protected java.lang.Integer  __price_list_product_id ;
	protected java.lang.Integer  __price_list_id ;
	protected java.lang.Integer  __product_id ;
	protected java.lang.String  __department_id ;
	protected java.lang.String  __employee_id_created ;
	protected java.util.Date  __date_created ;
	protected java.lang.String  __employee_id_updated ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Float  __price_unit_listed ;
	protected java.lang.Boolean  __flag_standard_price_unit ;
	protected java.lang.Float  __price_unit ;
	protected java.lang.Boolean  __flag_enabled ;
	protected java.lang.String  __memo ;
}
