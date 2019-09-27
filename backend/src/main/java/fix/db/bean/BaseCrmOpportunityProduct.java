package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmOpportunityProduct extends GenericBase implements BaseFactory<BaseCrmOpportunityProduct>, Comparable<BaseCrmOpportunityProduct> 
{


	public static BaseCrmOpportunityProduct newInstance(){
		return new BaseCrmOpportunityProduct();
	}

	@Override
	public BaseCrmOpportunityProduct make(){
		BaseCrmOpportunityProduct b = new BaseCrmOpportunityProduct();
		return b;
	}

	public final static java.lang.String CS_OPPORTUNITY_PRODUCT_ID = "opportunity_product_id" ;
	public final static java.lang.String CS_OPPORTUNITY_ID = "opportunity_id" ;
	public final static java.lang.String CS_PRODUCT_ID = "product_id" ;
	public final static java.lang.String CS_PRICE_UNIT = "price_unit" ;
	public final static java.lang.String CS_QUANTITY = "quantity" ;
	public final static java.lang.String CS_DISCOUNT_RATE = "discount_rate" ;
	public final static java.lang.String CS_SUM = "sum" ;
	public final static java.lang.String CS_PRICE_UNIT_LISTED = "price_unit_listed" ;
	public final static java.lang.String CS_ENTITY_TYPE = "entity_type" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_MEMO = "memo" ;

	public final static java.lang.String ALL_CAPTIONS = "销售机会-产品-明细表编码,销售机会编码,产品编码,销售单价,数量,折扣率,总价,价格表产品单价,主体类型,创建日期,创建人编码,最近修改日期,修改人编码,备注";

	public java.lang.Integer getOpportunityProductId() {
		return this.__opportunity_product_id;
	}

	public void setOpportunityProductId( java.lang.Integer value ) {
		this.__opportunity_product_id = value;
	}

	public java.lang.Integer getOpportunityId() {
		return this.__opportunity_id;
	}

	public void setOpportunityId( java.lang.Integer value ) {
		this.__opportunity_id = value;
	}

	public java.lang.Integer getProductId() {
		return this.__product_id;
	}

	public void setProductId( java.lang.Integer value ) {
		this.__product_id = value;
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

	public java.lang.Float getDiscountRate() {
		return this.__discount_rate;
	}

	public void setDiscountRate( java.lang.Float value ) {
		this.__discount_rate = value;
	}

	public java.math.BigDecimal getSum() {
		return this.__sum;
	}

	public void setSum( java.math.BigDecimal value ) {
		this.__sum = value;
	}

	public java.math.BigDecimal getPriceUnitListed() {
		return this.__price_unit_listed;
	}

	public void setPriceUnitListed( java.math.BigDecimal value ) {
		this.__price_unit_listed = value;
	}

	public java.lang.Integer getEntityType() {
		return this.__entity_type;
	}

	public void setEntityType( java.lang.Integer value ) {
		this.__entity_type = value;
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

	public java.lang.String getMemo() {
		return this.__memo;
	}

	public void setMemo( java.lang.String value ) {
		this.__memo = value;
	}

	public void cloneCopy(BaseCrmOpportunityProduct __bean){
		__bean.setOpportunityProductId(getOpportunityProductId());
		__bean.setOpportunityId(getOpportunityId());
		__bean.setProductId(getProductId());
		__bean.setPriceUnit(getPriceUnit());
		__bean.setQuantity(getQuantity());
		__bean.setDiscountRate(getDiscountRate());
		__bean.setSum(getSum());
		__bean.setPriceUnitListed(getPriceUnitListed());
		__bean.setEntityType(getEntityType());
		__bean.setDateCreated(getDateCreated());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setMemo(getMemo());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getOpportunityProductId() == null ? "" : getOpportunityProductId());
		sb.append(",");
		sb.append(getOpportunityId() == null ? "" : getOpportunityId());
		sb.append(",");
		sb.append(getProductId() == null ? "" : getProductId());
		sb.append(",");
		sb.append(getPriceUnit() == null ? "" : getPriceUnit());
		sb.append(",");
		sb.append(getQuantity() == null ? "" : getQuantity());
		sb.append(",");
		sb.append(getDiscountRate() == null ? "" : getDiscountRate());
		sb.append(",");
		sb.append(getSum() == null ? "" : getSum());
		sb.append(",");
		sb.append(getPriceUnitListed() == null ? "" : getPriceUnitListed());
		sb.append(",");
		sb.append(getEntityType() == null ? "" : getEntityType());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getMemo() == null ? "" : getMemo());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmOpportunityProduct o) {
		return __opportunity_product_id == null ? -1 : __opportunity_product_id.compareTo(o.getOpportunityProductId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__opportunity_product_id);
		hash = 97 * hash + Objects.hashCode(this.__opportunity_id);
		hash = 97 * hash + Objects.hashCode(this.__product_id);
		hash = 97 * hash + Objects.hashCode(this.__price_unit);
		hash = 97 * hash + Objects.hashCode(this.__quantity);
		hash = 97 * hash + Objects.hashCode(this.__discount_rate);
		hash = 97 * hash + Objects.hashCode(this.__sum);
		hash = 97 * hash + Objects.hashCode(this.__price_unit_listed);
		hash = 97 * hash + Objects.hashCode(this.__entity_type);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__memo);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmOpportunityProduct o = (BaseCrmOpportunityProduct)obj;
		if(!Objects.equals(this.__opportunity_product_id, o.getOpportunityProductId())) return false;
		if(!Objects.equals(this.__opportunity_id, o.getOpportunityId())) return false;
		if(!Objects.equals(this.__product_id, o.getProductId())) return false;
		if(!Objects.equals(this.__price_unit, o.getPriceUnit())) return false;
		if(!Objects.equals(this.__quantity, o.getQuantity())) return false;
		if(!Objects.equals(this.__discount_rate, o.getDiscountRate())) return false;
		if(!Objects.equals(this.__sum, o.getSum())) return false;
		if(!Objects.equals(this.__price_unit_listed, o.getPriceUnitListed())) return false;
		if(!Objects.equals(this.__entity_type, o.getEntityType())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__memo, o.getMemo())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getOpportunityProductId() != null) sb.append(__wrapNumber(count++, "opportunityProductId", getOpportunityProductId()));
		if(getOpportunityId() != null) sb.append(__wrapNumber(count++, "opportunityId", getOpportunityId()));
		if(getProductId() != null) sb.append(__wrapNumber(count++, "productId", getProductId()));
		if(getPriceUnit() != null) sb.append(__wrapDecimal(count++, "priceUnit", getPriceUnit()));
		if(getQuantity() != null) sb.append(__wrapNumber(count++, "quantity", getQuantity()));
		if(getDiscountRate() != null) sb.append(__wrapNumber(count++, "discountRate", getDiscountRate()));
		if(getSum() != null) sb.append(__wrapDecimal(count++, "sum", getSum()));
		if(getPriceUnitListed() != null) sb.append(__wrapDecimal(count++, "priceUnitListed", getPriceUnitListed()));
		if(getEntityType() != null) sb.append(__wrapNumber(count++, "entityType", getEntityType()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getMemo() != null) sb.append(__wrapString(count++, "memo", getMemo()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getOpportunityProductId() != null) res.put("opportunityProductId", getOpportunityProductId());
		if(getOpportunityId() != null) res.put("opportunityId", getOpportunityId());
		if(getProductId() != null) res.put("productId", getProductId());
		if(getPriceUnit() != null) res.put("priceUnit", getPriceUnit());
		if(getQuantity() != null) res.put("quantity", getQuantity());
		if(getDiscountRate() != null) res.put("discountRate", getDiscountRate());
		if(getSum() != null) res.put("sum", getSum());
		if(getPriceUnitListed() != null) res.put("priceUnitListed", getPriceUnitListed());
		if(getEntityType() != null) res.put("entityType", getEntityType());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getMemo() != null) res.put("memo", getMemo());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("opportunityProductId")) != null) setOpportunityProductId(__getInt(val)); 
		if((val = values.get("opportunityId")) != null) setOpportunityId(__getInt(val)); 
		if((val = values.get("productId")) != null) setProductId(__getInt(val)); 
		if((val = values.get("priceUnit")) != null) setPriceUnit(__getDecimal(val));  
		if((val = values.get("quantity")) != null) setQuantity(__getFloat(val));  
		if((val = values.get("discountRate")) != null) setDiscountRate(__getFloat(val));  
		if((val = values.get("sum")) != null) setSum(__getDecimal(val));  
		if((val = values.get("priceUnitListed")) != null) setPriceUnitListed(__getDecimal(val));  
		if((val = values.get("entityType")) != null) setEntityType(__getInt(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("memo")) != null) setMemo(__getString(val));
	}

	protected java.lang.Integer  __opportunity_product_id ;
	protected java.lang.Integer  __opportunity_id ;
	protected java.lang.Integer  __product_id ;
	protected java.math.BigDecimal  __price_unit ;
	protected java.lang.Float  __quantity ;
	protected java.lang.Float  __discount_rate ;
	protected java.math.BigDecimal  __sum ;
	protected java.math.BigDecimal  __price_unit_listed ;
	protected java.lang.Integer  __entity_type ;
	protected java.util.Date  __date_created ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.lang.String  __memo ;
}
