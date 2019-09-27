Ext.define('erp.com.customerlist.view.CrmContactsCustomerViewWindow', {
	extend: 'Ext.window.Window',

	xtype: 'customerlistcrmcontactscustomerviewwindow',

	requires: [
		'Ext.tab.Panel',
		'erp.com.customerlist.view.CrmContactsCustomerViewPanel'
	],

	minWidth: 300,

	minHeight: 380,

	scrollable: true,

	resizable: true,

	modal: true,

	profiles: {
		classic: {
			height: 500
		}, 
		neptune: {
			height: 500
		}, 
		graphite: {
			height: 600
		} 
	},

	width: '90%',

	height: '80%',

	listeners: {
		close: function(source){ source.destroy(); }
	},

	layout: 'vbox',
	items: [
		{
			title: '',
			border: true,
			style: 'border: 1px solid gray;border-radius: 7px;box-shadow: 3px 3px 2px #888888;',
			width: '100%',
			flex: 2,
			xtype: 'crmcontactscustomervpanel'
		}
	],

	loadData: function (record) {
		var __customerlistcrmcontactscustomer = Delicacy.lookupReference(this, 'customerlistcrmcontactscustomervreference');
		__customerlistcrmcontactscustomer.form.loadRecord(record);
	},

	bbar: ['->',
		{
			xtype: 'button',
			iconCls: 'x-fa fa-times-circle red',
			text: '关闭',
			handler: function() { var win = arguments[0].ownerCt.ownerCt; win.destroy(); } 
		}
	]
});
