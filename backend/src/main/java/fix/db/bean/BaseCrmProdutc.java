package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmProdutc extends GenericBase implements BaseFactory<BaseCrmProdutc>, Comparable<BaseCrmProdutc> 
{


	public static BaseCrmProdutc newInstance(){
		return new BaseCrmProdutc();
	}

	@Override
	public BaseCrmProdutc make(){
		BaseCrmProdutc b = new BaseCrmProdutc();
		return b;
	}

	public final static java.lang.String CS_PRODUCT_ID = "product_id" ;
	public final static java.lang.String CS_PRODUCT_NAME = "product_name" ;
	public final static java.lang.String CS_PARENT_ID = "parent_id" ;
	public final static java.lang.String CS_EMPLOYEE_ID_MAINTAINER = "employee_id_maintainer" ;
	public final static java.lang.String CS_PRICE_UNIT_LISTED = "price_unit_listed" ;
	public final static java.lang.String CS_UNIT = "unit" ;
	public final static java.lang.String CS_PRODUCT_IMAGE1 = "product_image1" ;
	public final static java.lang.String CS_DESCRIPTION = "description" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_FLAG_ENABLED = "flag_enabled" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_ENTITY_TYPE = "entity_type" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;

	public final static java.lang.String ALL_CAPTIONS = "产品编码,产品名称,父级产品编码,维护人员工编码,标准价格,销售单位,产品图片,产品描述,创建日期,最近修改日,是否已启用,创建人编码,修改人编码,主体类型,所属部门";

	public java.lang.Integer getProductId() {
		return this.__product_id;
	}

	public void setProductId( java.lang.Integer value ) {
		this.__product_id = value;
	}

	public java.lang.String getProductName() {
		return this.__product_name;
	}

	public void setProductName( java.lang.String value ) {
		this.__product_name = value;
	}

	public java.lang.Integer getParentId() {
		return this.__parent_id;
	}

	public void setParentId( java.lang.Integer value ) {
		this.__parent_id = value;
	}

	public java.lang.Integer getEmployeeIdMaintainer() {
		return this.__employee_id_maintainer;
	}

	public void setEmployeeIdMaintainer( java.lang.Integer value ) {
		this.__employee_id_maintainer = value;
	}

	public java.math.BigDecimal getPriceUnitListed() {
		return this.__price_unit_listed;
	}

	public void setPriceUnitListed( java.math.BigDecimal value ) {
		this.__price_unit_listed = value;
	}

	public java.lang.String getUnit() {
		return this.__unit;
	}

	public void setUnit( java.lang.String value ) {
		this.__unit = value;
	}

	public java.lang.String getProductImage1() {
		return this.__product_image1;
	}

	public void setProductImage1( java.lang.String value ) {
		this.__product_image1 = value;
	}

	public java.lang.String getDescription() {
		return this.__description;
	}

	public void setDescription( java.lang.String value ) {
		this.__description = value;
	}

	public java.util.Date getDateCreated() {
		return this.__date_created;
	}

	public void setDateCreated( java.util.Date value ) {
		this.__date_created = value;
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

	public java.lang.Integer getEmployeeIdCreated() {
		return this.__employee_id_created;
	}

	public void setEmployeeIdCreated( java.lang.Integer value ) {
		this.__employee_id_created = value;
	}

	public java.lang.Integer getEmployeeIdUpdated() {
		return this.__employee_id_updated;
	}

	public void setEmployeeIdUpdated( java.lang.Integer value ) {
		this.__employee_id_updated = value;
	}

	public java.lang.Integer getEntityType() {
		return this.__entity_type;
	}

	public void setEntityType( java.lang.Integer value ) {
		this.__entity_type = value;
	}

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
	}

	public void cloneCopy(BaseCrmProdutc __bean){
		__bean.setProductId(getProductId());
		__bean.setProductName(getProductName());
		__bean.setParentId(getParentId());
		__bean.setEmployeeIdMaintainer(getEmployeeIdMaintainer());
		__bean.setPriceUnitListed(getPriceUnitListed());
		__bean.setUnit(getUnit());
		__bean.setProductImage1(getProductImage1());
		__bean.setDescription(getDescription());
		__bean.setDateCreated(getDateCreated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setFlagEnabled(getFlagEnabled());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setEntityType(getEntityType());
		__bean.setDepartmentId(getDepartmentId());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getProductId() == null ? "" : getProductId());
		sb.append(",");
		sb.append(getProductName() == null ? "" : getProductName());
		sb.append(",");
		sb.append(getParentId() == null ? "" : getParentId());
		sb.append(",");
		sb.append(getEmployeeIdMaintainer() == null ? "" : getEmployeeIdMaintainer());
		sb.append(",");
		sb.append(getPriceUnitListed() == null ? "" : getPriceUnitListed());
		sb.append(",");
		sb.append(getUnit() == null ? "" : getUnit());
		sb.append(",");
		sb.append(getProductImage1() == null ? "" : getProductImage1());
		sb.append(",");
		sb.append(getDescription() == null ? "" : getDescription());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getFlagEnabled() == null ? "" : getFlagEnabled());
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getEntityType() == null ? "" : getEntityType());
		sb.append(",");
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmProdutc o) {
		return __product_id == null ? -1 : __product_id.compareTo(o.getProductId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__product_id);
		hash = 97 * hash + Objects.hashCode(this.__product_name);
		hash = 97 * hash + Objects.hashCode(this.__parent_id);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_maintainer);
		hash = 97 * hash + Objects.hashCode(this.__price_unit_listed);
		hash = 97 * hash + Objects.hashCode(this.__unit);
		hash = 97 * hash + Objects.hashCode(this.__product_image1);
		hash = 97 * hash + Objects.hashCode(this.__description);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__flag_enabled);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__entity_type);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmProdutc o = (BaseCrmProdutc)obj;
		if(!Objects.equals(this.__product_id, o.getProductId())) return false;
		if(!Objects.equals(this.__product_name, o.getProductName())) return false;
		if(!Objects.equals(this.__parent_id, o.getParentId())) return false;
		if(!Objects.equals(this.__employee_id_maintainer, o.getEmployeeIdMaintainer())) return false;
		if(!Objects.equals(this.__price_unit_listed, o.getPriceUnitListed())) return false;
		if(!Objects.equals(this.__unit, o.getUnit())) return false;
		if(!Objects.equals(this.__product_image1, o.getProductImage1())) return false;
		if(!Objects.equals(this.__description, o.getDescription())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__flag_enabled, o.getFlagEnabled())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__entity_type, o.getEntityType())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getProductId() != null) sb.append(__wrapNumber(count++, "productId", getProductId()));
		if(getProductName() != null) sb.append(__wrapString(count++, "productName", getProductName()));
		if(getParentId() != null) sb.append(__wrapNumber(count++, "parentId", getParentId()));
		if(getEmployeeIdMaintainer() != null) sb.append(__wrapNumber(count++, "employeeIdMaintainer", getEmployeeIdMaintainer()));
		if(getPriceUnitListed() != null) sb.append(__wrapDecimal(count++, "priceUnitListed", getPriceUnitListed()));
		if(getUnit() != null) sb.append(__wrapString(count++, "unit", getUnit()));
		if(getProductImage1() != null) sb.append(__wrapString(count++, "productImage1", getProductImage1()));
		if(getDescription() != null) sb.append(__wrapString(count++, "description", getDescription()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getFlagEnabled() != null) sb.append(__wrapBoolean(count++, "flagEnabled", getFlagEnabled()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getEntityType() != null) sb.append(__wrapNumber(count++, "entityType", getEntityType()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getProductId() != null) res.put("productId", getProductId());
		if(getProductName() != null) res.put("productName", getProductName());
		if(getParentId() != null) res.put("parentId", getParentId());
		if(getEmployeeIdMaintainer() != null) res.put("employeeIdMaintainer", getEmployeeIdMaintainer());
		if(getPriceUnitListed() != null) res.put("priceUnitListed", getPriceUnitListed());
		if(getUnit() != null) res.put("unit", getUnit());
		if(getProductImage1() != null) res.put("productImage1", getProductImage1());
		if(getDescription() != null) res.put("description", getDescription());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getFlagEnabled() != null) res.put("flagEnabled", getFlagEnabled());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getEntityType() != null) res.put("entityType", getEntityType());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("productId")) != null) setProductId(__getInt(val)); 
		if((val = values.get("productName")) != null) setProductName(__getString(val));
		if((val = values.get("parentId")) != null) setParentId(__getInt(val)); 
		if((val = values.get("employeeIdMaintainer")) != null) setEmployeeIdMaintainer(__getInt(val)); 
		if((val = values.get("priceUnitListed")) != null) setPriceUnitListed(__getDecimal(val));  
		if((val = values.get("unit")) != null) setUnit(__getString(val));
		if((val = values.get("productImage1")) != null) setProductImage1(__getString(val));
		if((val = values.get("description")) != null) setDescription(__getString(val));
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("flagEnabled")) != null) setFlagEnabled(__getBoolean(val));
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("entityType")) != null) setEntityType(__getInt(val)); 
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
	}

	protected java.lang.Integer  __product_id ;
	protected java.lang.String  __product_name ;
	protected java.lang.Integer  __parent_id ;
	protected java.lang.Integer  __employee_id_maintainer ;
	protected java.math.BigDecimal  __price_unit_listed ;
	protected java.lang.String  __unit ;
	protected java.lang.String  __product_image1 ;
	protected java.lang.String  __description ;
	protected java.util.Date  __date_created ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Boolean  __flag_enabled ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.lang.Integer  __entity_type ;
	protected java.lang.Integer  __department_id ;
}
