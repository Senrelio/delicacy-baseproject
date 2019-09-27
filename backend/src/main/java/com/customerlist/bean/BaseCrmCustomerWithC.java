package com.customerlist.bean;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import fix.db.bean.BaseCrmCustomer;
import fix.db.bean.BaseCrmContactsCustomer;

public class BaseCrmCustomerWithC extends BaseCrmCustomer 
{

	public static BaseCrmCustomerWithC newInstance(){
		return new BaseCrmCustomerWithC();
	}

	@Override
	public BaseCrmCustomerWithC make(){
		BaseCrmCustomerWithC b = new BaseCrmCustomerWithC();
		return b;
	}

	public List<BaseCrmContactsCustomer> getDetailCrmContactsCustomer() {
		return this.__detail_crm_contacts_customers;
	}

	public void setDetailCrmContactsCustomer( List<BaseCrmContactsCustomer> value ) {
		this.__detail_crm_contacts_customers = value;
	}

	public BaseCrmCustomer toBase(){
		BaseCrmCustomer base = new BaseCrmCustomer();
		cloneCopy(base);
		return base;
	}

	public void getDataFromBase(BaseCrmCustomer base){
		base.cloneCopy(this);
	}

	public static List<BaseCrmCustomer> getBaseList(List<BaseCrmCustomerWithC> beans) {
		List<BaseCrmCustomer> result = new ArrayList<>();
		if(beans == null || beans.isEmpty()) return result;
		for(BaseCrmCustomerWithC bean : beans) {
			result.add(bean.toBase());
		}
		return result;
	}

	public static List<BaseCrmCustomerWithC> getBeanList(List<BaseCrmCustomer> beans) {
		List<BaseCrmCustomerWithC> result = new ArrayList<>();
		if(beans == null || beans.isEmpty()) return result;
		for(BaseCrmCustomer bean : beans) {
			BaseCrmCustomerWithC val = new BaseCrmCustomerWithC();
			val.getDataFromBase(bean);
			result.add(val);
		}
		return result;
	}

	@Override
	public java.lang.String toJSONString() {

		int count = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(super.toJSONString());
		count = sb.length(); sb.append(__wrapList(count, "detailCrmContactsCustomer", getDetailCrmContactsCustomer()));
		return sb.toString() ;
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		Object val;
		super.setDataFromMap(values);
		if((val = values.get("detailCrmContactsCustomer")) != null) setDetailCrmContactsCustomer(__getList(val, BaseCrmContactsCustomer.newInstance()));
	}

	protected List<BaseCrmContactsCustomer> __detail_crm_contacts_customers ; 
}
