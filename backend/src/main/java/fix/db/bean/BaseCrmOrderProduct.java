package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmOrderProduct extends GenericBase implements BaseFactory<BaseCrmOrderProduct>, Comparable<BaseCrmOrderProduct> 
{


	public static BaseCrmOrderProduct newInstance(){
		return new BaseCrmOrderProduct();
	}

	@Override
	public BaseCrmOrderProduct make(){
		BaseCrmOrderProduct b = new BaseCrmOrderProduct();
		return b;
	}

	public final static java.lang.String CS_ORDER_PRODUCT_ID = "order_product_id" ;
	public final static java.lang.String CS_ORDER_ID = "order_id" ;
	public final static java.lang.String CS_PRODUCT_ID = "product_id" ;
	public final static java.lang.String CS_PRICE_UNIT = "price_unit" ;
	public final static java.lang.String CS_QUANTITY = "quantity" ;
	public final static java.lang.String CS_DISCOUNT_RATE = "discount_rate" ;
	public final static java.lang.String CS_SUM = "sum" ;
	public final static java.lang.String CS_MEMO = "memo" ;
	public final static java.lang.String CS_EMPLOYEE_ID_CREATED = "employee_id_created" ;
	public final static java.lang.String CS_DATE_CREATED = "date_created" ;
	public final static java.lang.String CS_PRICE_UNIT_LISTED = "price_unit_listed" ;
	public final static java.lang.String CS_EMPLOYEE_ID_UPDATED = "employee_id_updated" ;
	public final static java.lang.String CS_DATE_UPDATED = "date_updated" ;
	public final static java.lang.String CS_QUANTITY_TO_DELIVER = "quantity_to_deliver" ;
	public final static java.lang.String CS_QUANTITY_DELIVERED = "quantity_delivered" ;
	public final static java.lang.String CS_FLAG_SQUARED_UP = "flag_squared_up" ;
	public final static java.lang.String CS_DATE_ORDER_PLACED = "date_order_placed" ;
	public final static java.lang.String CS_SUM_TOTAL_LISTED = "sum_total_listed" ;
	public final static java.lang.String CS_AMOUNT_TOTAL_DISCOUNT = "amount_total_discount" ;
	public final static java.lang.String CS_QUANTITY_CHANGE = "quantity_change" ;
	public final static java.lang.String CS_AMOUNT_CHANGE = "amount_change" ;
	public final static java.lang.String CS_ORDER_VERSION = "order_version" ;
	public final static java.lang.String CS_CHANGETYPE = "changeType" ;

	public final static java.lang.String ALL_CAPTIONS = "订单-<产品明细编码,订单编码,产品编码,销售单价,数量,折扣率,总价,备注,创建人编码,创建日期,价格表单价,修改人编码,最近修改日期,未交付数量,已交付数量,是否已结清,下单时间,原总价,总折扣额,变更数量,变更金额,订单版本号,change_type";

	public java.lang.Integer getOrderProductId() {
		return this.__order_product_id;
	}

	public void setOrderProductId( java.lang.Integer value ) {
		this.__order_product_id = value;
	}

	public java.lang.Integer getOrderId() {
		return this.__order_id;
	}

	public void setOrderId( java.lang.Integer value ) {
		this.__order_id = value;
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

	public java.math.BigDecimal getDiscountRate() {
		return this.__discount_rate;
	}

	public void setDiscountRate( java.math.BigDecimal value ) {
		this.__discount_rate = value;
	}

	public java.math.BigDecimal getSum() {
		return this.__sum;
	}

	public void setSum( java.math.BigDecimal value ) {
		this.__sum = value;
	}

	public java.lang.String getMemo() {
		return this.__memo;
	}

	public void setMemo( java.lang.String value ) {
		this.__memo = value;
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

	public java.math.BigDecimal getPriceUnitListed() {
		return this.__price_unit_listed;
	}

	public void setPriceUnitListed( java.math.BigDecimal value ) {
		this.__price_unit_listed = value;
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

	public java.lang.Float getQuantityToDeliver() {
		return this.__quantity_to_deliver;
	}

	public void setQuantityToDeliver( java.lang.Float value ) {
		this.__quantity_to_deliver = value;
	}

	public java.lang.Float getQuantityDelivered() {
		return this.__quantity_delivered;
	}

	public void setQuantityDelivered( java.lang.Float value ) {
		this.__quantity_delivered = value;
	}

	public java.lang.Boolean getFlagSquaredUp() {
		return this.__flag_squared_up;
	}

	public void setFlagSquaredUp( java.lang.Boolean value ) {
		this.__flag_squared_up = value;
	}

	public java.util.Date getDateOrderPlaced() {
		return this.__date_order_placed;
	}

	public void setDateOrderPlaced( java.util.Date value ) {
		this.__date_order_placed = value;
	}

	public java.math.BigDecimal getSumTotalListed() {
		return this.__sum_total_listed;
	}

	public void setSumTotalListed( java.math.BigDecimal value ) {
		this.__sum_total_listed = value;
	}

	public java.math.BigDecimal getAmountTotalDiscount() {
		return this.__amount_total_discount;
	}

	public void setAmountTotalDiscount( java.math.BigDecimal value ) {
		this.__amount_total_discount = value;
	}

	public java.lang.Float getQuantityChange() {
		return this.__quantity_change;
	}

	public void setQuantityChange( java.lang.Float value ) {
		this.__quantity_change = value;
	}

	public java.math.BigDecimal getAmountChange() {
		return this.__amount_change;
	}

	public void setAmountChange( java.math.BigDecimal value ) {
		this.__amount_change = value;
	}

	public java.lang.Integer getOrderVersion() {
		return this.__order_version;
	}

	public void setOrderVersion( java.lang.Integer value ) {
		this.__order_version = value;
	}

	public java.lang.Integer getChangetype() {
		return this.__changetype;
	}

	public void setChangetype( java.lang.Integer value ) {
		this.__changetype = value;
	}

	public void cloneCopy(BaseCrmOrderProduct __bean){
		__bean.setOrderProductId(getOrderProductId());
		__bean.setOrderId(getOrderId());
		__bean.setProductId(getProductId());
		__bean.setPriceUnit(getPriceUnit());
		__bean.setQuantity(getQuantity());
		__bean.setDiscountRate(getDiscountRate());
		__bean.setSum(getSum());
		__bean.setMemo(getMemo());
		__bean.setEmployeeIdCreated(getEmployeeIdCreated());
		__bean.setDateCreated(getDateCreated());
		__bean.setPriceUnitListed(getPriceUnitListed());
		__bean.setEmployeeIdUpdated(getEmployeeIdUpdated());
		__bean.setDateUpdated(getDateUpdated());
		__bean.setQuantityToDeliver(getQuantityToDeliver());
		__bean.setQuantityDelivered(getQuantityDelivered());
		__bean.setFlagSquaredUp(getFlagSquaredUp());
		__bean.setDateOrderPlaced(getDateOrderPlaced());
		__bean.setSumTotalListed(getSumTotalListed());
		__bean.setAmountTotalDiscount(getAmountTotalDiscount());
		__bean.setQuantityChange(getQuantityChange());
		__bean.setAmountChange(getAmountChange());
		__bean.setOrderVersion(getOrderVersion());
		__bean.setChangetype(getChangetype());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getOrderProductId() == null ? "" : getOrderProductId());
		sb.append(",");
		sb.append(getOrderId() == null ? "" : getOrderId());
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
		sb.append(getMemo() == null ? "" : getMemo());
		sb.append(",");
		sb.append(getEmployeeIdCreated() == null ? "" : getEmployeeIdCreated());
		sb.append(",");
		sb.append(getDateCreated() == null ? "" : sdf.format(getDateCreated()));
		sb.append(",");
		sb.append(getPriceUnitListed() == null ? "" : getPriceUnitListed());
		sb.append(",");
		sb.append(getEmployeeIdUpdated() == null ? "" : getEmployeeIdUpdated());
		sb.append(",");
		sb.append(getDateUpdated() == null ? "" : sdf.format(getDateUpdated()));
		sb.append(",");
		sb.append(getQuantityToDeliver() == null ? "" : getQuantityToDeliver());
		sb.append(",");
		sb.append(getQuantityDelivered() == null ? "" : getQuantityDelivered());
		sb.append(",");
		sb.append(getFlagSquaredUp() == null ? "" : getFlagSquaredUp());
		sb.append(",");
		sb.append(getDateOrderPlaced() == null ? "" : sdf.format(getDateOrderPlaced()));
		sb.append(",");
		sb.append(getSumTotalListed() == null ? "" : getSumTotalListed());
		sb.append(",");
		sb.append(getAmountTotalDiscount() == null ? "" : getAmountTotalDiscount());
		sb.append(",");
		sb.append(getQuantityChange() == null ? "" : getQuantityChange());
		sb.append(",");
		sb.append(getAmountChange() == null ? "" : getAmountChange());
		sb.append(",");
		sb.append(getOrderVersion() == null ? "" : getOrderVersion());
		sb.append(",");
		sb.append(getChangetype() == null ? "" : getChangetype());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmOrderProduct o) {
		return __order_product_id == null ? -1 : __order_product_id.compareTo(o.getOrderProductId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__order_product_id);
		hash = 97 * hash + Objects.hashCode(this.__order_id);
		hash = 97 * hash + Objects.hashCode(this.__product_id);
		hash = 97 * hash + Objects.hashCode(this.__price_unit);
		hash = 97 * hash + Objects.hashCode(this.__quantity);
		hash = 97 * hash + Objects.hashCode(this.__discount_rate);
		hash = 97 * hash + Objects.hashCode(this.__sum);
		hash = 97 * hash + Objects.hashCode(this.__memo);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_created);
		hash = 97 * hash + Objects.hashCode(this.__date_created);
		hash = 97 * hash + Objects.hashCode(this.__price_unit_listed);
		hash = 97 * hash + Objects.hashCode(this.__employee_id_updated);
		hash = 97 * hash + Objects.hashCode(this.__date_updated);
		hash = 97 * hash + Objects.hashCode(this.__quantity_to_deliver);
		hash = 97 * hash + Objects.hashCode(this.__quantity_delivered);
		hash = 97 * hash + Objects.hashCode(this.__flag_squared_up);
		hash = 97 * hash + Objects.hashCode(this.__date_order_placed);
		hash = 97 * hash + Objects.hashCode(this.__sum_total_listed);
		hash = 97 * hash + Objects.hashCode(this.__amount_total_discount);
		hash = 97 * hash + Objects.hashCode(this.__quantity_change);
		hash = 97 * hash + Objects.hashCode(this.__amount_change);
		hash = 97 * hash + Objects.hashCode(this.__order_version);
		hash = 97 * hash + Objects.hashCode(this.__changetype);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmOrderProduct o = (BaseCrmOrderProduct)obj;
		if(!Objects.equals(this.__order_product_id, o.getOrderProductId())) return false;
		if(!Objects.equals(this.__order_id, o.getOrderId())) return false;
		if(!Objects.equals(this.__product_id, o.getProductId())) return false;
		if(!Objects.equals(this.__price_unit, o.getPriceUnit())) return false;
		if(!Objects.equals(this.__quantity, o.getQuantity())) return false;
		if(!Objects.equals(this.__discount_rate, o.getDiscountRate())) return false;
		if(!Objects.equals(this.__sum, o.getSum())) return false;
		if(!Objects.equals(this.__memo, o.getMemo())) return false;
		if(!Objects.equals(this.__employee_id_created, o.getEmployeeIdCreated())) return false;
		if(!Objects.equals(this.__date_created, o.getDateCreated())) return false;
		if(!Objects.equals(this.__price_unit_listed, o.getPriceUnitListed())) return false;
		if(!Objects.equals(this.__employee_id_updated, o.getEmployeeIdUpdated())) return false;
		if(!Objects.equals(this.__date_updated, o.getDateUpdated())) return false;
		if(!Objects.equals(this.__quantity_to_deliver, o.getQuantityToDeliver())) return false;
		if(!Objects.equals(this.__quantity_delivered, o.getQuantityDelivered())) return false;
		if(!Objects.equals(this.__flag_squared_up, o.getFlagSquaredUp())) return false;
		if(!Objects.equals(this.__date_order_placed, o.getDateOrderPlaced())) return false;
		if(!Objects.equals(this.__sum_total_listed, o.getSumTotalListed())) return false;
		if(!Objects.equals(this.__amount_total_discount, o.getAmountTotalDiscount())) return false;
		if(!Objects.equals(this.__quantity_change, o.getQuantityChange())) return false;
		if(!Objects.equals(this.__amount_change, o.getAmountChange())) return false;
		if(!Objects.equals(this.__order_version, o.getOrderVersion())) return false;
		if(!Objects.equals(this.__changetype, o.getChangetype())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getOrderProductId() != null) sb.append(__wrapNumber(count++, "orderProductId", getOrderProductId()));
		if(getOrderId() != null) sb.append(__wrapNumber(count++, "orderId", getOrderId()));
		if(getProductId() != null) sb.append(__wrapNumber(count++, "productId", getProductId()));
		if(getPriceUnit() != null) sb.append(__wrapDecimal(count++, "priceUnit", getPriceUnit()));
		if(getQuantity() != null) sb.append(__wrapNumber(count++, "quantity", getQuantity()));
		if(getDiscountRate() != null) sb.append(__wrapDecimal(count++, "discountRate", getDiscountRate()));
		if(getSum() != null) sb.append(__wrapDecimal(count++, "sum", getSum()));
		if(getMemo() != null) sb.append(__wrapString(count++, "memo", getMemo()));
		if(getEmployeeIdCreated() != null) sb.append(__wrapNumber(count++, "employeeIdCreated", getEmployeeIdCreated()));
		if(getDateCreated() != null) sb.append(__wrapDate(count++, "dateCreated", getDateCreated()));
		if(getPriceUnitListed() != null) sb.append(__wrapDecimal(count++, "priceUnitListed", getPriceUnitListed()));
		if(getEmployeeIdUpdated() != null) sb.append(__wrapNumber(count++, "employeeIdUpdated", getEmployeeIdUpdated()));
		if(getDateUpdated() != null) sb.append(__wrapDate(count++, "dateUpdated", getDateUpdated()));
		if(getQuantityToDeliver() != null) sb.append(__wrapNumber(count++, "quantityToDeliver", getQuantityToDeliver()));
		if(getQuantityDelivered() != null) sb.append(__wrapNumber(count++, "quantityDelivered", getQuantityDelivered()));
		if(getFlagSquaredUp() != null) sb.append(__wrapBoolean(count++, "flagSquaredUp", getFlagSquaredUp()));
		if(getDateOrderPlaced() != null) sb.append(__wrapDate(count++, "dateOrderPlaced", getDateOrderPlaced()));
		if(getSumTotalListed() != null) sb.append(__wrapDecimal(count++, "sumTotalListed", getSumTotalListed()));
		if(getAmountTotalDiscount() != null) sb.append(__wrapDecimal(count++, "amountTotalDiscount", getAmountTotalDiscount()));
		if(getQuantityChange() != null) sb.append(__wrapNumber(count++, "quantityChange", getQuantityChange()));
		if(getAmountChange() != null) sb.append(__wrapDecimal(count++, "amountChange", getAmountChange()));
		if(getOrderVersion() != null) sb.append(__wrapNumber(count++, "orderVersion", getOrderVersion()));
		if(getChangetype() != null) sb.append(__wrapNumber(count++, "changetype", getChangetype()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getOrderProductId() != null) res.put("orderProductId", getOrderProductId());
		if(getOrderId() != null) res.put("orderId", getOrderId());
		if(getProductId() != null) res.put("productId", getProductId());
		if(getPriceUnit() != null) res.put("priceUnit", getPriceUnit());
		if(getQuantity() != null) res.put("quantity", getQuantity());
		if(getDiscountRate() != null) res.put("discountRate", getDiscountRate());
		if(getSum() != null) res.put("sum", getSum());
		if(getMemo() != null) res.put("memo", getMemo());
		if(getEmployeeIdCreated() != null) res.put("employeeIdCreated", getEmployeeIdCreated());
		if(getDateCreated() != null) res.put("dateCreated", getDateCreated());
		if(getPriceUnitListed() != null) res.put("priceUnitListed", getPriceUnitListed());
		if(getEmployeeIdUpdated() != null) res.put("employeeIdUpdated", getEmployeeIdUpdated());
		if(getDateUpdated() != null) res.put("dateUpdated", getDateUpdated());
		if(getQuantityToDeliver() != null) res.put("quantityToDeliver", getQuantityToDeliver());
		if(getQuantityDelivered() != null) res.put("quantityDelivered", getQuantityDelivered());
		if(getFlagSquaredUp() != null) res.put("flagSquaredUp", getFlagSquaredUp());
		if(getDateOrderPlaced() != null) res.put("dateOrderPlaced", getDateOrderPlaced());
		if(getSumTotalListed() != null) res.put("sumTotalListed", getSumTotalListed());
		if(getAmountTotalDiscount() != null) res.put("amountTotalDiscount", getAmountTotalDiscount());
		if(getQuantityChange() != null) res.put("quantityChange", getQuantityChange());
		if(getAmountChange() != null) res.put("amountChange", getAmountChange());
		if(getOrderVersion() != null) res.put("orderVersion", getOrderVersion());
		if(getChangetype() != null) res.put("changetype", getChangetype());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("orderProductId")) != null) setOrderProductId(__getInt(val)); 
		if((val = values.get("orderId")) != null) setOrderId(__getInt(val)); 
		if((val = values.get("productId")) != null) setProductId(__getInt(val)); 
		if((val = values.get("priceUnit")) != null) setPriceUnit(__getDecimal(val));  
		if((val = values.get("quantity")) != null) setQuantity(__getFloat(val));  
		if((val = values.get("discountRate")) != null) setDiscountRate(__getDecimal(val));  
		if((val = values.get("sum")) != null) setSum(__getDecimal(val));  
		if((val = values.get("memo")) != null) setMemo(__getString(val));
		if((val = values.get("employeeIdCreated")) != null) setEmployeeIdCreated(__getInt(val)); 
		if((val = values.get("dateCreated")) != null) setDateCreated(__getDate(val)); 
		if((val = values.get("priceUnitListed")) != null) setPriceUnitListed(__getDecimal(val));  
		if((val = values.get("employeeIdUpdated")) != null) setEmployeeIdUpdated(__getInt(val)); 
		if((val = values.get("dateUpdated")) != null) setDateUpdated(__getDate(val)); 
		if((val = values.get("quantityToDeliver")) != null) setQuantityToDeliver(__getFloat(val));  
		if((val = values.get("quantityDelivered")) != null) setQuantityDelivered(__getFloat(val));  
		if((val = values.get("flagSquaredUp")) != null) setFlagSquaredUp(__getBoolean(val));
		if((val = values.get("dateOrderPlaced")) != null) setDateOrderPlaced(__getDate(val)); 
		if((val = values.get("sumTotalListed")) != null) setSumTotalListed(__getDecimal(val));  
		if((val = values.get("amountTotalDiscount")) != null) setAmountTotalDiscount(__getDecimal(val));  
		if((val = values.get("quantityChange")) != null) setQuantityChange(__getFloat(val));  
		if((val = values.get("amountChange")) != null) setAmountChange(__getDecimal(val));  
		if((val = values.get("orderVersion")) != null) setOrderVersion(__getInt(val)); 
		if((val = values.get("changetype")) != null) setChangetype(__getInt(val)); 
	}

	protected java.lang.Integer  __order_product_id ;
	protected java.lang.Integer  __order_id ;
	protected java.lang.Integer  __product_id ;
	protected java.math.BigDecimal  __price_unit ;
	protected java.lang.Float  __quantity ;
	protected java.math.BigDecimal  __discount_rate ;
	protected java.math.BigDecimal  __sum ;
	protected java.lang.String  __memo ;
	protected java.lang.Integer  __employee_id_created ;
	protected java.util.Date  __date_created ;
	protected java.math.BigDecimal  __price_unit_listed ;
	protected java.lang.Integer  __employee_id_updated ;
	protected java.util.Date  __date_updated ;
	protected java.lang.Float  __quantity_to_deliver ;
	protected java.lang.Float  __quantity_delivered ;
	protected java.lang.Boolean  __flag_squared_up ;
	protected java.util.Date  __date_order_placed ;
	protected java.math.BigDecimal  __sum_total_listed ;
	protected java.math.BigDecimal  __amount_total_discount ;
	protected java.lang.Float  __quantity_change ;
	protected java.math.BigDecimal  __amount_change ;
	protected java.lang.Integer  __order_version ;
	protected java.lang.Integer  __changetype ;
}
