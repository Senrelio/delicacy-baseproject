Ext.define('erp.controller.registerController', {
	extend : 'Ext.app.ViewController',

	alias : 'controller.registerController',


	//创建企业账号点击事件
	createCompanyAccountClick : function() {
		var formPanel = Ext.getCmp('createCompanyAccount');
		if (formPanel && formPanel.form) {
			var values = formPanel.form.getValues();
		}
		console.log(values);
	},
	
	//加入已有企业账号点击事件
	joinCompanyAccountClick : function() {
		var formPanel = Ext.getCmp('joinCompanyAccount');
		if (formPanel && formPanel.form) {
			var values = formPanel.form.getValues();
		}
		console.log(values);
	},
//	返回首页
	backToLoginClick:function(){
		var logincontainer = Ext.getCmp('logincontainer');
		logincontainer.show();
		var registercontainer = Ext.getCmp('registercontent');
		registercontainer.hide();
	},
	getCertificationCodeClick: function(){
		
	}

});
