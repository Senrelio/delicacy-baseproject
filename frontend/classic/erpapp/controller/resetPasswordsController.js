Ext.define('erp.controller.resetPasswordsController', {
    extend: 'Ext.app.ViewController',

    alias: 'controller.resetPasswordsController',
	
    resetPasswordsClick: function(){
    	var panel = Ext.getCmp('resetPasswordsId');
    	if(panel&&panel.form){
    		var values = panel.form.getValues();
    	}
	},
	backToLoginClick: function(){
		debugger;
		var logincontainer = Ext.getCmp('logincontainer');
		logincontainer.show();
		var registercontainer = Ext.getCmp('registercontainer');
		registercontainer.hide();
//		debugger;
//		var mainContainer = Ext.getCmp('maincontainer');
//  mainContainer.removeAll();
		
//		var resetPasswordcontainer = Ext.getCmp('resetPasswordcontainer');
//		mainContainer.remove(resetPasswordcontainer,false);
//		resetPasswordcontainer.hide();
//	     mainContainer.add({
//   	 xtype:'loginPanel'
//    });
		},
	getCertificationCodeClick: function(){
		
	}
    
});
