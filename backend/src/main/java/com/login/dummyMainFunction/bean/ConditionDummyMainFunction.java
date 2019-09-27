package com.login.dummyMainFunction.bean;

import delicacy.common.GenericCondition;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConditionDummyMainFunction extends GenericCondition {

	public ConditionDummyMainFunction(){
		setParameterCount(2);
	}

	public Integer getUserId() {
		return this.__user_id;
	}

	public void setUserId( Integer value ) {
		this.__user_id = value;
	}

	public Integer getFunctionType() {
		return this.__function_type;
	}

	public void setFunctionType( Integer value ) {
		this.__function_type = value;
	}

	@Override
	public String toJSONString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toJSONString());
		if(getUserId() != null) sb.append(__wrapNumber(1, "userId", getUserId()));
		if(getFunctionType() != null) sb.append(__wrapNumber(1, "functionType", getFunctionType()));
		return sb.toString();
	}

	@Override
	public void setDataFromMap(Map<String, Object> values){
		super.setDataFromMap(values);
		Object val;
		if((val = values.get("userId")) != null) setUserId(__getInt(val));
		if((val = values.get("functionType")) != null) setFunctionType(__getInt(val));
	}

	@Override
	public Set<String> getNotNullNames(){
		Set<String> res = new HashSet<>();
		if(getUserId() != null) res.add("userId");
		if(getFunctionType() != null) res.add("functionType");
		return res;
	}

	private Integer __user_id = null;
	private Integer __function_type = null;
}

