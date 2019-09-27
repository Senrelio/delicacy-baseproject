package com.contactlist.bean;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import fix.db.bean.BaseCrmContact;
import fix.db.bean.BaseCrmContactsCustomer;

public class BaseCrmContactWithC extends BaseCrmContact 
{

	public static BaseCrmContactWithC newInstance(){
		return new BaseCrmContactWithC();
	}

	@Override
	public BaseCrmContactWithC make(){
		BaseCrmContactWithC b = new BaseCrmContactWithC();
		return b;
	}

	public List<BaseCrmContactsCustomer> getDetailCrmContactsCustomer() {
		return this.__detail_crm_contacts_customers;
	}

	public void setDetailCrmContactsCustomer( List<BaseCrmContactsCustomer> value ) {
		this.__detail_crm_contacts_customers = value;
	}

	public BaseCrmContact toBase(){
		BaseCrmContact base = new BaseCrmContact();
		cloneCopy(base);
		return base;
	}

	public void getDataFromBase(BaseCrmContact base){
		base.cloneCopy(this);
	}

	public static List<BaseCrmContact> getBaseList(List<BaseCrmContactWithC> beans) {
		List<BaseCrmContact> result = new ArrayList<>();
		if(beans == null || beans.isEmpty()) return result;
		for(BaseCrmContactWithC bean : beans) {
			result.add(bean.toBase());
		}
		return result;
	}

	public static List<BaseCrmContactWithC> getBeanList(List<BaseCrmContact> beans) {
		List<BaseCrmContactWithC> result = new ArrayList<>();
		if(beans == null || beans.isEmpty()) return result;
		for(BaseCrmContact bean : beans) {
			BaseCrmContactWithC val = new BaseCrmContactWithC();
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
