Ext.define('erp.ValidateUtils', {
	override: 'Ext.form.field.VTypes',
	
	int: function(value){
		return this.intRe.test(value);
	},
	
	intRe: /^[0-9]*$/,
	
	intText: '请输入数字',
	
	number: function(value){
		return this.numberRe.test(value);
	},
	numberRe: /^(-?\d+)(\.\d+)?$/,
	
	numberText: '请输入数字',
	
	tel: function(value){
		return this.telRe.test(value);
	},
	
	telRe: /^0(10|2[0-5789]|\\d{3})\\d{7,8}$/,
	
	telText: '请输入正确的电话号码',
	
	mobile: function(value){
		return this.mobileRe.test(value);
	},
	
	mobileRe: /^[1][3-9]\\d{9}$|^[8][5][2]\\d{8}$|^[6]([8|6])\\d{5}$/,
	
	mobileText: '请输入正确的手机号码'
	
});