package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmContractsOrder extends GenericBase implements BaseFactory<BaseCrmContractsOrder>, Comparable<BaseCrmContractsOrder> 
{


	public static BaseCrmContractsOrder newInstance(){
		return new BaseCrmContractsOrder();
	}

	@Override
	public BaseCrmContractsOrder make(){
		BaseCrmContractsOrder b = new BaseCrmContractsOrder();
		return b;
	}

	public final static java.lang.String CS_CONTRACT_ORDERS_ID = "contract_orders_id" ;
	public final static java.lang.String CS_CONTRACT_ID = "contract_id" ;
	public final static java.lang.String CS_ORDER_ID = "order_id" ;

	public final static java.lang.String ALL_CAPTIONS = "合同_订单表id,合同id,订单id";

	public java.lang.Integer getContractOrdersId() {
		return this.__contract_orders_id;
	}

	public void setContractOrdersId( java.lang.Integer value ) {
		this.__contract_orders_id = value;
	}

	public java.lang.Integer getContractId() {
		return this.__contract_id;
	}

	public void setContractId( java.lang.Integer value ) {
		this.__contract_id = value;
	}

	public java.lang.Integer getOrderId() {
		return this.__order_id;
	}

	public void setOrderId( java.lang.Integer value ) {
		this.__order_id = value;
	}

	public void cloneCopy(BaseCrmContractsOrder __bean){
		__bean.setContractOrdersId(getContractOrdersId());
		__bean.setContractId(getContractId());
		__bean.setOrderId(getOrderId());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getContractOrdersId() == null ? "" : getContractOrdersId());
		sb.append(",");
		sb.append(getContractId() == null ? "" : getContractId());
		sb.append(",");
		sb.append(getOrderId() == null ? "" : getOrderId());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmContractsOrder o) {
		return __contract_orders_id == null ? -1 : __contract_orders_id.compareTo(o.getContractOrdersId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__contract_orders_id);
		hash = 97 * hash + Objects.hashCode(this.__contract_id);
		hash = 97 * hash + Objects.hashCode(this.__order_id);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmContractsOrder o = (BaseCrmContractsOrder)obj;
		if(!Objects.equals(this.__contract_orders_id, o.getContractOrdersId())) return false;
		if(!Objects.equals(this.__contract_id, o.getContractId())) return false;
		if(!Objects.equals(this.__order_id, o.getOrderId())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getContractOrdersId() != null) sb.append(__wrapNumber(count++, "contractOrdersId", getContractOrdersId()));
		if(getContractId() != null) sb.append(__wrapNumber(count++, "contractId", getContractId()));
		if(getOrderId() != null) sb.append(__wrapNumber(count++, "orderId", getOrderId()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getContractOrdersId() != null) res.put("contractOrdersId", getContractOrdersId());
		if(getContractId() != null) res.put("contractId", getContractId());
		if(getOrderId() != null) res.put("orderId", getOrderId());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("contractOrdersId")) != null) setContractOrdersId(__getInt(val)); 
		if((val = values.get("contractId")) != null) setContractId(__getInt(val)); 
		if((val = values.get("orderId")) != null) setOrderId(__getInt(val)); 
	}

	protected java.lang.Integer  __contract_orders_id ;
	protected java.lang.Integer  __contract_id ;
	protected java.lang.Integer  __order_id ;
}
