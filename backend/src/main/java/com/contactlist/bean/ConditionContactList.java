package com.contactlist.bean;

import delicacy.common.GenericCondition;
import java.util.Map;

import java.util.Set;

import java.util.HashSet;

public class ConditionContactList extends GenericCondition{

	public ConditionContactList(){
		setParameterCount(1);
	}

	public java.lang.String getContactName() {
		return this.__contact_name == null ? null : (this.__contact_name.indexOf("%") >= 0 ? this.__contact_name : "%"+this.__contact_name+"%");
	}

	public void setContactName( java.lang.String value ) {
		this.__contact_name = value;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toJSONString());
		if(getContactName() != null) sb.append(__wrapString(1, "contactName", getContactName()));
		return sb.toString();
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		super.setDataFromMap(values);
		Object val;
		if((val = values.get("contactName")) != null) setContactName(__getString(val));
	}

	@Override
	public Set<String> getNotNullNames(){
		Set<String> res = new HashSet<>();
		if(getContactName() != null) res.add("contactName");
		return res;
	}

	private java.lang.String __contact_name = null;
}

