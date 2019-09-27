package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmQuotationProduct extends GenericBase implements BaseFactory<BaseCrmQuotationProduct>, Comparable<BaseCrmQuotationProduct> 
{


	public static BaseCrmQuotationProduct newInstance(){
		return new BaseCrmQuotationProduct();
	}

	@Override
	public BaseCrmQuotationProduct make(){
		BaseCrmQuotationProduct b = new BaseCrmQuotationProduct();
		return b;
	}

	public final static java.lang.String CS_QUOTATION_PRODUCT_ID = "quotation_product_id" ;
	public final static java.lang.String CS_QUOTATION_PRODUCT_CODE = "quotation_product_code" ;
	public final static java.lang.String CS_DEPARTMENT_ID = "department_id" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_FLAG_LOCKED = "flag_locked" ;
	public final static java.lang.String CS_QUOTATION_ID = "quotation_id" ;
	public final static java.lang.String CS_PRODUCT_NAME = "product_name" ;
	public final static java.lang.String CS_PRICE_UNIT_LISTED = "price_unit_listed" ;
	public final static java.lang.String CS_CUSTOMER_NAME = "customer_name" ;
	public final static java.lang.String CS_UNIT = "unit" ;
	public final static java.lang.String CS_PRICE_UNIT = "price_unit" ;
	public final static java.lang.String CS_QUANTITY = "quantity" ;
	public final static java.lang.String CS_DISCOUNT_RATE = "discount_rate" ;
	public final static java.lang.String CS_AMOUNT = "amount" ;
	public final static java.lang.String CS_MEMO = "memo" ;
	public final static java.lang.String CS_PARENT_ID = "parent_id" ;
	public final static java.lang.String CS_SUM_LISTED = "sum_listed" ;
	public final static java.lang.String CS_AMOUNT_TOTAL_DISCOUNT = "amount_total_discount" ;
	public final static java.lang.String CS_LEVEL = "level" ;

	public final static java.lang.String ALL_CAPTIONS = "报价单-<产品明细编码,报价单-<产品明细编号,所属部门,创建人编码,创建日期,修改人编码,修改日期,是否被锁定,报价单编码,产品名称,价格表价格,客户名称,销售单位,销售单价,数量,折扣率,销售金额,备注,上级明细编码,总原价,总折扣额,明细级别";

	public java.lang.Integer getQuotationProductId() {
		return this.__quotation_product_id;
	}

	public void setQuotationProductId( java.lang.Integer value ) {
		this.__quotation_product_id = value;
	}

	public java.lang.String getQuotationProductCode() {
		return this.__quotation_product_code;
	}

	public void setQuotationProductCode( java.lang.String value ) {
		this.__quotation_product_code = value;
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

	public java.lang.Integer getQuotationId() {
		return this.__quotation_id;
	}

	public void setQuotationId( java.lang.Integer value ) {
		this.__quotation_id = value;
	}

	public java.lang.Integer getProductName() {
		return this.__product_name;
	}

	public void setProductName( java.lang.Integer value ) {
		this.__product_name = value;
	}

	public java.math.BigDecimal getPriceUnitListed() {
		return this.__price_unit_listed;
	}

	public void setPriceUnitListed( java.math.BigDecimal value ) {
		this.__price_unit_listed = value;
	}

	public java.lang.Integer getCustomerName() {
		return this.__customer_name;
	}

	public void setCustomerName( java.lang.Integer value ) {
		this.__customer_name = value;
	}

	public java.lang.String getUnit() {
		return this.__unit;
	}

	public void setUnit( java.lang.String value ) {
		this.__unit = value;
	}

	public java.math.BigDecimal getPriceUnit() {
		return this.__price_unit;
	}

	public void setPriceUnit( java.math.BigDecimal value ) {
		this.__price_unit = value;
	}

	public java.lang.Float getQuantity() {
		return this.__quantity;
	}

	public void setQuantity( java.lang.Float value ) {
		this.__quantity = value;
	}

	public java.math.BigDecimal getDiscountRate() {
		return this.__discount_rate;
	}

	public void setDiscountRate( java.math.BigDecimal value ) {
		this.__discount_rate = value;
	}

	public java.math.BigDecimal getAmount() {
		return this.__amount;
	}

	public void setAmount( java.math.BigDecimal value ) {
		this.__amount = value;
	}

	public java.lang.String getMemo() {
		return this.__memo;
	}

	public void setMemo( java.lang.String value ) {
		this.__memo = value;
	}

	public java.lang.Integer getParentId() {
		return this.__parent_id;
	}

	public void setParentId( java.lang.Integer value ) {
		this.__parent_id = value;
	}

	public java.math.BigDecimal getSumListed() {
		return this.__sum_listed;
	}

	public void setSumListed( java.math.BigDecimal value ) {
		this.__sum_listed = value;
	}

	public java.math.BigDecimal getAmountTotalDiscount() {
		return this.__amount_total_discount;
	}

	public void setAmountTotalDiscount( java.math.BigDecimal value ) {
		this.__amount_total_discount = value;
	}

	public java.lang.Float getLevel() {
		return this.__level;
	}

	public void setLevel( java.lang.Float value ) {
		this.__level = value;
	}

	public void cloneCopy(BaseCrmQuotationProduct __bean){
		__bean.setQuotationProductId(getQuotationProductId());
		__bean.setQuotationProductCode(getQuotationProductCode());
		__bean.setDepartmentId(getDepartmentId());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setFlagLocked(getFlagLocked());
		__bean.setQuotationId(getQuotationId());
		__bean.setProductName(getProductName());
		__bean.setPriceUnitListed(getPriceUnitListed());
		__bean.setCustomerName(getCustomerName());
		__bean.setUnit(getUnit());
		__bean.setPriceUnit(getPriceUnit());
		__bean.setQuantity(getQuantity());
		__bean.setDiscountRate(getDiscountRate());
		__bean.setAmount(getAmount());
		__bean.setMemo(getMemo());
		__bean.setParentId(getParentId());
		__bean.setSumListed(getSumListed());
		__bean.setAmountTotalDiscount(getAmountTotalDiscount());
		__bean.setLevel(getLevel());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getQuotationProductId() == null ? "" : getQuotationProductId());
		sb.append(",");
		sb.append(getQuotationProductCode() == null ? "" : getQuotationProductCode());
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
		sb.append(getQuotationId() == null ? "" : getQuotationId());
		sb.append(",");
		sb.append(getProductName() == null ? "" : getProductName());
		sb.append(",");
		sb.append(getPriceUnitListed() == null ? "" : getPriceUnitListed());
		sb.append(",");
		sb.append(getCustomerName() == null ? "" : getCustomerName());
		sb.append(",");
		sb.append(getUnit() == null ? "" : getUnit());
		sb.append(",");
		sb.append(getPriceUnit() == null ? "" : getPriceUnit());
		sb.append(",");
		sb.append(getQuantity() == null ? "" : getQuantity());
		sb.append(",");
		sb.append(getDiscountRate() == null ? "" : getDiscountRate());
		sb.append(",");
		sb.append(getAmount() == null ? "" : getAmount());
		sb.append(",");
		sb.append(getMemo() == null ? "" : getMemo());
		sb.append(",");
		sb.append(getParentId() == null ? "" : getParentId());
		sb.append(",");
		sb.append(getSumListed() == null ? "" : getSumListed());
		sb.append(",");
		sb.append(getAmountTotalDiscount() == null ? "" : getAmountTotalDiscount());
		sb.append(",");
		sb.append(getLevel() == null ? "" : getLevel());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmQuotationProduct o) {
		return __quotation_product_id == null ? -1 : __quotation_product_id.compareTo(o.getQuotationProductId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__quotation_product_id);
		hash = 97 * hash + Objects.hashCode(this.__quotation_product_code);
		hash = 97 * hash + Objects.hashCode(this.__department_id);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__flag_locked);
		hash = 97 * hash + Objects.hashCode(this.__quotation_id);
		hash = 97 * hash + Objects.hashCode(this.__product_name);
		hash = 97 * hash + Objects.hashCode(this.__price_unit_listed);
		hash = 97 * hash + Objects.hashCode(this.__customer_name);
		hash = 97 * hash + Objects.hashCode(this.__unit);
		hash = 97 * hash + Objects.hashCode(this.__price_unit);
		hash = 97 * hash + Objects.hashCode(this.__quantity);
		hash = 97 * hash + Objects.hashCode(this.__discount_rate);
		hash = 97 * hash + Objects.hashCode(this.__amount);
		hash = 97 * hash + Objects.hashCode(this.__memo);
		hash = 97 * hash + Objects.hashCode(this.__parent_id);
		hash = 97 * hash + Objects.hashCode(this.__sum_listed);
		hash = 97 * hash + Objects.hashCode(this.__amount_total_discount);
		hash = 97 * hash + Objects.hashCode(this.__level);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmQuotationProduct o = (BaseCrmQuotationProduct)obj;
		if(!Objects.equals(this.__quotation_product_id, o.getQuotationProductId())) return false;
		if(!Objects.equals(this.__quotation_product_code, o.getQuotationProductCode())) return false;
		if(!Objects.equals(this.__department_id, o.getDepartmentId())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__flag_locked, o.getFlagLocked())) return false;
		if(!Objects.equals(this.__quotation_id, o.getQuotationId())) return false;
		if(!Objects.equals(this.__product_name, o.getProductName())) return false;
		if(!Objects.equals(this.__price_unit_listed, o.getPriceUnitListed())) return false;
		if(!Objects.equals(this.__customer_name, o.getCustomerName())) return false;
		if(!Objects.equals(this.__unit, o.getUnit())) return false;
		if(!Objects.equals(this.__price_unit, o.getPriceUnit())) return false;
		if(!Objects.equals(this.__quantity, o.getQuantity())) return false;
		if(!Objects.equals(this.__discount_rate, o.getDiscountRate())) return false;
		if(!Objects.equals(this.__amount, o.getAmount())) return false;
		if(!Objects.equals(this.__memo, o.getMemo())) return false;
		if(!Objects.equals(this.__parent_id, o.getParentId())) return false;
		if(!Objects.equals(this.__sum_listed, o.getSumListed())) return false;
		if(!Objects.equals(this.__amount_total_discount, o.getAmountTotalDiscount())) return false;
		if(!Objects.equals(this.__level, o.getLevel())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getQuotationProductId() != null) sb.append(__wrapNumber(count++, "quotationProductId", getQuotationProductId()));
		if(getQuotationProductCode() != null) sb.append(__wrapString(count++, "quotationProductCode", getQuotationProductCode()));
		if(getDepartmentId() != null) sb.append(__wrapNumber(count++, "departmentId", getDepartmentId()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getFlagLocked() != null) sb.append(__wrapBoolean(count++, "flagLocked", getFlagLocked()));
		if(getQuotationId() != null) sb.append(__wrapNumber(count++, "quotationId", getQuotationId()));
		if(getProductName() != null) sb.append(__wrapNumber(count++, "productName", getProductName()));
		if(getPriceUnitListed() != null) sb.append(__wrapDecimal(count++, "priceUnitListed", getPriceUnitListed()));
		if(getCustomerName() != null) sb.append(__wrapNumber(count++, "customerName", getCustomerName()));
		if(getUnit() != null) sb.append(__wrapString(count++, "unit", getUnit()));
		if(getPriceUnit() != null) sb.append(__wrapDecimal(count++, "priceUnit", getPriceUnit()));
		if(getQuantity() != null) sb.append(__wrapNumber(count++, "quantity", getQuantity()));
		if(getDiscountRate() != null) sb.append(__wrapDecimal(count++, "discountRate", getDiscountRate()));
		if(getAmount() != null) sb.append(__wrapDecimal(count++, "amount", getAmount()));
		if(getMemo() != null) sb.append(__wrapString(count++, "memo", getMemo()));
		if(getParentId() != null) sb.append(__wrapNumber(count++, "parentId", getParentId()));
		if(getSumListed() != null) sb.append(__wrapDecimal(count++, "sumListed", getSumListed()));
		if(getAmountTotalDiscount() != null) sb.append(__wrapDecimal(count++, "amountTotalDiscount", getAmountTotalDiscount()));
		if(getLevel() != null) sb.append(__wrapNumber(count++, "level", getLevel()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getQuotationProductId() != null) res.put("quotationProductId", getQuotationProductId());
		if(getQuotationProductCode() != null) res.put("quotationProductCode", getQuotationProductCode());
		if(getDepartmentId() != null) res.put("departmentId", getDepartmentId());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getFlagLocked() != null) res.put("flagLocked", getFlagLocked());
		if(getQuotationId() != null) res.put("quotationId", getQuotationId());
		if(getProductName() != null) res.put("productName", getProductName());
		if(getPriceUnitListed() != null) res.put("priceUnitListed", getPriceUnitListed());
		if(getCustomerName() != null) res.put("customerName", getCustomerName());
		if(getUnit() != null) res.put("unit", getUnit());
		if(getPriceUnit() != null) res.put("priceUnit", getPriceUnit());
		if(getQuantity() != null) res.put("quantity", getQuantity());
		if(getDiscountRate() != null) res.put("discountRate", getDiscountRate());
		if(getAmount() != null) res.put("amount", getAmount());
		if(getMemo() != null) res.put("memo", getMemo());
		if(getParentId() != null) res.put("parentId", getParentId());
		if(getSumListed() != null) res.put("sumListed", getSumListed());
		if(getAmountTotalDiscount() != null) res.put("amountTotalDiscount", getAmountTotalDiscount());
		if(getLevel() != null) res.put("level", getLevel());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("quotationProductId")) != null) setQuotationProductId(__getInt(val)); 
		if((val = values.get("quotationProductCode")) != null) setQuotationProductCode(__getString(val));
		if((val = values.get("departmentId")) != null) setDepartmentId(__getInt(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("flagLocked")) != null) setFlagLocked(__getBoolean(val));
		if((val = values.get("quotationId")) != null) setQuotationId(__getInt(val)); 
		if((val = values.get("productName")) != null) setProductName(__getInt(val)); 
		if((val = values.get("priceUnitListed")) != null) setPriceUnitListed(__getDecimal(val));  
		if((val = values.get("customerName")) != null) setCustomerName(__getInt(val)); 
		if((val = values.get("unit")) != null) setUnit(__getString(val));
		if((val = values.get("priceUnit")) != null) setPriceUnit(__getDecimal(val));  
		if((val = values.get("quantity")) != null) setQuantity(__getFloat(val));  
		if((val = values.get("discountRate")) != null) setDiscountRate(__getDecimal(val));  
		if((val = values.get("amount")) != null) setAmount(__getDecimal(val));  
		if((val = values.get("memo")) != null) setMemo(__getString(val));
		if((val = values.get("parentId")) != null) setParentId(__getInt(val)); 
		if((val = values.get("sumListed")) != null) setSumListed(__getDecimal(val));  
		if((val = values.get("amountTotalDiscount")) != null) setAmountTotalDiscount(__getDecimal(val));  
		if((val = values.get("level")) != null) setLevel(__getFloat(val));  
	}

	protected java.lang.Integer  __quotation_product_id ;
	protected java.lang.String  __quotation_product_code ;
	protected java.lang.Integer  __department_id ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Boolean  __flag_locked ;
	protected java.lang.Integer  __quotation_id ;
	protected java.lang.Integer  __product_name ;
	protected java.math.BigDecimal  __price_unit_listed ;
	protected java.lang.Integer  __customer_name ;
	protected java.lang.String  __unit ;
	protected java.math.BigDecimal  __price_unit ;
	protected java.lang.Float  __quantity ;
	protected java.math.BigDecimal  __discount_rate ;
	protected java.math.BigDecimal  __amount ;
	protected java.lang.String  __memo ;
	protected java.lang.Integer  __parent_id ;
	protected java.math.BigDecimal  __sum_listed ;
	protected java.math.BigDecimal  __amount_total_discount ;
	protected java.lang.Float  __level ;
}
