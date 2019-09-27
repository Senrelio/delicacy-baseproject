/**
 * This view is an example list of people.
 */
Ext.define('erp.view.MainContainer', {
	extend: 'Ext.Container',
    xtype: 'maincontainer',
    id:'maincontainer',
    
    requires : [ 'erp.controller.loginController' ],

    fullscreen:true,

    layout:'fit',

    items:[
        {
            xtype: 'loginPanel' ,
            hidden:false
        },
        {
            xtype: 'resetPasswordsPanel' ,
            hidden:true
        },
        {
           xtype: 'registerPanel' ,
           hidden:true
        }
    ]

});
