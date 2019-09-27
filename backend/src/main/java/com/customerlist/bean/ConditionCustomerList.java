package com.customerlist.bean;

import delicacy.common.GenericCondition;
import java.util.Map;

import java.util.Set;

import java.util.HashSet;

public class ConditionCustomerList extends GenericCondition{

	public ConditionCustomerList(){
		setParameterCount(1);
	}

	public java.lang.String getCustomerName() {
		return this.__customer_name == null ? null : (this.__customer_name.indexOf("%") >= 0 ? this.__customer_name : "%"+this.__customer_name+"%");
	}

	public void setCustomerName( java.lang.String value ) {
		this.__customer_name = value;
	}

	@Override
	public java.lang.String toJSONString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toJSONString());
		if(getCustomerName() != null) sb.append(__wrapString(1, "customerName", getCustomerName()));
		return sb.toString();
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		super.setDataFromMap(values);
		Object val;
		if((val = values.get("customerName")) != null) setCustomerName(__getString(val));
	}

	@Override
	public Set<String> getNotNullNames(){
		Set<String> res = new HashSet<>();
		if(getCustomerName() != null) res.add("customerName");
		return res;
	}

	private java.lang.String __customer_name = null;
}

