/**
 * This view is an example list of people.
 */
Ext.define(
    'erp.view.loginPanel',
    {
        extend: 'Ext.panel.Panel',
        xtype: 'loginPanel',
        id: 'logincontainer',
        bodyStyle: 'background:none;',
        width: '100%',
        height: '100%',
        // style: "background: url('./classic/resources/images/loginBackground.jpg') no-repeat; background-size: cover; background-position: 100% 100%;",
        controller: 'loginController',
        // namespace: 'erpapp',
        requires: ['erp.controller.loginController'],

        shadow: 'drop',

        shadowOffset: 5,

        layout: 'center',
        header: false,

        selType: 'checkboxmodel',

        constructor: function () {

            this.callParent(arguments);
        },

        items: [
            {
                xtype: 'panel',
                bodyStyle: 'background:none;',
                style: {
                    backgroundColor: 'rgb(0,0,0)!important',
                    opacity: 0.51
                },
                width: '100%',
                minHeight: 600
            }
            ,
            {
                xtype: 'loginContent', // 引入模板
                bodyStyle: 'background:none;',
                width: 624,
                minHeight: 600,
                style: {
                    backgroundColor: 'rgba(255,255,255,0.2)!important'
                }
            }

        ],

        renderTo: Ext.getBody(),
        listeners: {
            // select: 'onItemSelected',
        }
    });
