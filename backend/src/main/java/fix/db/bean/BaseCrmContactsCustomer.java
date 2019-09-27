package fix.db.bean;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import delicacy.common.GenericBase;
import delicacy.common.BaseFactory;

public class BaseCrmContactsCustomer extends GenericBase implements BaseFactory<BaseCrmContactsCustomer>, Comparable<BaseCrmContactsCustomer> 
{


	public static BaseCrmContactsCustomer newInstance(){
		return new BaseCrmContactsCustomer();
	}

	@Override
	public BaseCrmContactsCustomer make(){
		BaseCrmContactsCustomer b = new BaseCrmContactsCustomer();
		return b;
	}

	public final static java.lang.String CS_CONTACTS_CUSTOMERS_ID = "contacts_customers_id" ;
	public final static java.lang.String CS_CONTACTS_ID = "contacts_id" ;
	public final static java.lang.String CS_CUSTOMERS_ID = "customers_id" ;

	public final static java.lang.String ALL_CAPTIONS = ",联系人id,客户id";

	public java.lang.Integer getContactsCustomersId() {
		return this.__contacts_customers_id;
	}

	public void setContactsCustomersId( java.lang.Integer value ) {
		this.__contacts_customers_id = value;
	}

	public java.lang.Integer getContactsId() {
		return this.__contacts_id;
	}

	public void setContactsId( java.lang.Integer value ) {
		this.__contacts_id = value;
	}

	public java.lang.Integer getCustomersId() {
		return this.__customers_id;
	}

	public void setCustomersId( java.lang.Integer value ) {
		this.__customers_id = value;
	}

	public void cloneCopy(BaseCrmContactsCustomer __bean){
		__bean.setContactsCustomersId(getContactsCustomersId());
		__bean.setContactsId(getContactsId());
		__bean.setCustomersId(getCustomersId());
	}

	public java.lang.String toCSVString() {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		StringBuilder sb = new StringBuilder();
		sb.append(getContactsCustomersId() == null ? "" : getContactsCustomersId());
		sb.append(",");
		sb.append(getContactsId() == null ? "" : getContactsId());
		sb.append(",");
		sb.append(getCustomersId() == null ? "" : getCustomersId());
		return sb.toString();
	}

	@Override
	public int compareTo(BaseCrmContactsCustomer o) {
		return __contacts_customers_id == null ? -1 : __contacts_customers_id.compareTo(o.getContactsCustomersId());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.__contacts_customers_id);
		hash = 97 * hash + Objects.hashCode(this.__contacts_id);
		hash = 97 * hash + Objects.hashCode(this.__customers_id);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		final BaseCrmContactsCustomer o = (BaseCrmContactsCustomer)obj;
		if(!Objects.equals(this.__contacts_customers_id, o.getContactsCustomersId())) return false;
		if(!Objects.equals(this.__contacts_id, o.getContactsId())) return false;
		if(!Objects.equals(this.__customers_id, o.getCustomersId())) return false;
		return true;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(getContactsCustomersId() != null) sb.append(__wrapNumber(count++, "contactsCustomersId", getContactsCustomersId()));
		if(getContactsId() != null) sb.append(__wrapNumber(count++, "contactsId", getContactsId()));
		if(getCustomersId() != null) sb.append(__wrapNumber(count++, "customersId", getCustomersId()));
		return sb.toString();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> res = new HashMap<>();
		if(getContactsCustomersId() != null) res.put("contactsCustomersId", getContactsCustomersId());
		if(getContactsId() != null) res.put("contactsId", getContactsId());
		if(getCustomersId() != null) res.put("customersId", getCustomersId());
		return res;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		if((val = values.get("contactsCustomersId")) != null) setContactsCustomersId(__getInt(val)); 
		if((val = values.get("contactsId")) != null) setContactsId(__getInt(val)); 
		if((val = values.get("customersId")) != null) setCustomersId(__getInt(val)); 
	}

	protected java.lang.Integer  __contacts_customers_id ;
	protected java.lang.Integer  __contacts_id ;
	protected java.lang.Integer  __customers_id ;
}
