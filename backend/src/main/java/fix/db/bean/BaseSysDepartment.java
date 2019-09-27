package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseSysDepartment extends GenericBase implements BaseFactory<BaseSysDepartment>, Comparable<BaseSysDepartment> 
{


	public static BaseSysDepartment newInstance(){
		return new BaseSysDepartment();
	}

	@Override
	public BaseSysDepartment make(){
		BaseSysDepartment b = new BaseSysDepartment();
		return b;
	}

	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_DEPARTMENT_CODE = "department_code" ;
	public final static java.lang.String CS_DEPARTMENT_NAME = "department_name" ;
	public final static java.lang.String CS_PARENT_DEPARTMENT_ID = "parent_department_id" ;
	public final static java.lang.String CS_DEPARTMENT_TYPE = "department_type" ;
	public final static java.lang.String CS_DEPARTMENT_SECOND_TYPE = "department_second_type" ;
	public final static java.lang.String CS_ENTITY_TYPE = "entity_type" ;
	public final static java.lang.String CS_AREA_CODE = "area_code" ;
	public final static java.lang.String CS_BUSINESS = "business" ;
	public final static java.lang.String CS_PRODUCT_LINE = "product_line" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;

	public final static java.lang.String ALL_CAPTIONS = "部门编码,部门代码,部门名称,父级部门编码,部门类型,二级部门类型,主体类型,地区编码,所属业务,所属产品线,创建时间,创建人编码,修改时间,修改人编码";

	public java.lang.Integer getDepartmentId() {
		return this.__department_id;
	}

	public void setDepartmentId( java.lang.Integer value ) {
		this.__department_id = value;
	}

	public java.lang.String getDepartmentCode() {
		return this.__department_code;
	}

	public void setDepartmentCode( java.lang.String value ) {
		this.__department_code = value;
	}

	public java.lang.String getDepartmentName() {
		return this.__department_name;
	}

	public void setDepartmentName( java.lang.String value ) {
		this.__department_name = value;
	}

	public java.lang.Integer getParentDepartmentId() {
		return this.__parent_department_id;
	}

	public void setParentDepartmentId( java.lang.Integer value ) {
		this.__parent_department_id = value;
	}

	public java.lang.Byte getDepartmentType() {
		return this.__department_type;
	}

	public void setDepartmentType( java.lang.Byte value ) {
		this.__department_type = value;
	}

	public java.lang.Byte getDepartmentSecondType() {
		return this.__department_second_type;
	}

	public void setDepartmentSecondType( java.lang.Byte value ) {
		this.__department_second_type = value;
	}

	public java.lang.Integer getEntityType() {
		return this.__entity_type;
	}

	public void setEntityType( java.lang.Integer value ) {
		this.__entity_type = value;
	}

	public java.lang.String getAreaCode() {
		return this.__area_code;
	}

	public void setAreaCode( java.lang.String value ) {
		this.__area_code = value;
	}

	public java.lang.String getBusiness() {
		return this.__business;
	}

	public void setBusiness( java.lang.String value ) {
		this.__business = value;
	}

	public java.lang.String getProductLine() {
		return this.__product_line;
	}

	public void setProductLine( java.lang.String value ) {
		this.__product_line = value;
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

	public void cloneCopy(BaseSysDepartment __bean){
		__bean.setDepartmentId(getDepartmentId());
		__bean.setDepartmentCode(getDepartmentCode());
		__bean.setDepartmentName(getDepartmentName());
		__bean.setParentDepartmentId(getParentDepartmentId());
		__bean.setDepartmentType(getDepartmentType());
		__bean.setDepartmentSecondType(getDepartmentSecondType());
		__bean.setEntityType(getEntityType());
		__bean.setAreaCode(getAreaCode());
		__bean.setBusiness(getBusiness());
		__bean.setProductLine(getProductLine());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		String strDepartmentId = delicacy.system.executor.SelectValueCache.getSelectValue("departments", String.valueOf(getDepartmentId()));
		sb.append(strDepartmentId == null ? "" : strDepartmentId);
		sb.append(",");
		sb.append(getDepartmentCode() == null ? "" : getDepartmentCode());
		sb.append(",");
		sb.append(getDepartmentName() == null ? "" : getDepartmentName());
		sb.append(",");
		sb.append(getParentDepartmentId() == null ? "" : getParentDepartmentId());
		sb.append(",");
		sb.append(getDepartmentType() == null ? "" : getDepartmentType());
		sb.append(",");
		sb.append(getDepartmentSecondType() == null ? "" : getDepartmentSecondType());
		sb.append(",");
		sb.append(getEntityType() == null ? "" : getEntityType());
		sb.append(",");
		sb.append(getAreaCode() == null ? "" : getAreaCode());
		sb.append(",");
		sb.append(getBusiness() == null ? "" : getBusiness());
		sb.append(",");
		sb.append(getProductLine() == null ? "" : getProductLine());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseSysDepartment o) {
		return __department_id == null ? -1 : __department_id.compareTo(o.getDepartmentId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__department_code);
		hash = 97 * hash + Objects.hashCode(this.__department_name);
		hash = 97 * hash + Objects.hashCode(this.__parent_department_id);
		hash = 97 * hash + Objects.hashCode(this.__department_type);
		hash = 97 * hash + Objects.hashCode(this.__department_second_type);
		hash = 97 * hash + Objects.hashCode(this.__entity_type);
		hash = 97 * hash + Objects.hashCode(this.__area_code);
		hash = 97 * hash + Objects.hashCode(this.__business);
		hash = 97 * hash + Objects.hashCode(this.__product_line);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseSysDepartment o = (BaseSysDepartment)obj;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__department_code, o.getDepartmentCode())) return false;
		if(!Objects.equals(this.__department_name, o.getDepartmentName())) return false;
		if(!Objects.equals(this.__parent_department_id, o.getParentDepartmentId())) return false;
		if(!Objects.equals(this.__department_type, o.getDepartmentType())) return false;
		if(!Objects.equals(this.__department_second_type, o.getDepartmentSecondType())) return false;
		if(!Objects.equals(this.__entity_type, o.getEntityType())) return false;
		if(!Objects.equals(this.__area_code, o.getAreaCode())) return false;
		if(!Objects.equals(this.__business, o.getBusiness())) return false;
		if(!Objects.equals(this.__product_line, o.getProductLine())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getDepartmentCode() != null) sb.append(__wrapString(count++, "departmentCode", getDepartmentCode()));
		if(getDepartmentName() != null) sb.append(__wrapString(count++, "departmentName", getDepartmentName()));
		if(getParentDepartmentId() != null) sb.append(__wrapNumber(count++, "parentDepartmentId", getParentDepartmentId()));
		if(getDepartmentType() != null) sb.append(__wrapNumber(count++, "departmentType", getDepartmentType()));
		if(getDepartmentSecondType() != null) sb.append(__wrapNumber(count++, "departmentSecondType", getDepartmentSecondType()));
		if(getEntityType() != null) sb.append(__wrapNumber(count++, "entityType", getEntityType()));
		if(getAreaCode() != null) sb.append(__wrapString(count++, "areaCode", getAreaCode()));
		if(getBusiness() != null) sb.append(__wrapString(count++, "business", getBusiness()));
		if(getProductLine() != null) sb.append(__wrapString(count++, "productLine", getProductLine()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getDepartmentCode() != null) res.put("departmentCode", getDepartmentCode());
		if(getDepartmentName() != null) res.put("departmentName", getDepartmentName());
		if(getParentDepartmentId() != null) res.put("parentDepartmentId", getParentDepartmentId());
		if(getDepartmentType() != null) res.put("departmentType", getDepartmentType());
		if(getDepartmentSecondType() != null) res.put("departmentSecondType", getDepartmentSecondType());
		if(getEntityType() != null) res.put("entityType", getEntityType());
		if(getAreaCode() != null) res.put("areaCode", getAreaCode());
		if(getBusiness() != null) res.put("business", getBusiness());
		if(getProductLine() != null) res.put("productLine", getProductLine());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("departmentCode")) != null) setDepartmentCode(__getString(val));
		if((val = values.get("departmentName")) != null) setDepartmentName(__getString(val));
		if((val = values.get("parentDepartmentId")) != null) setParentDepartmentId(__getInt(val)); 
		if((val = values.get("departmentType")) != null) setDepartmentType(__getByte(val));  
		if((val = values.get("departmentSecondType")) != null) setDepartmentSecondType(__getByte(val));  
		if((val = values.get("entityType")) != null) setEntityType(__getInt(val)); 
		if((val = values.get("areaCode")) != null) setAreaCode(__getString(val));
		if((val = values.get("business")) != null) setBusiness(__getString(val));
		if((val = values.get("productLine")) != null) setProductLine(__getString(val));
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
	}

	protected java.lang.Integer  __department_id ;
	protected java.lang.String  __department_code ;
	protected java.lang.String  __department_name ;
	protected java.lang.Integer  __parent_department_id ;
	protected java.lang.Byte  __department_type ;
	protected java.lang.Byte  __department_second_type ;
	protected java.lang.Integer  __entity_type ;
	protected java.lang.String  __area_code ;
	protected java.lang.String  __business ;
	protected java.lang.String  __product_line ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Integer  __employee_id_updated ;
}
