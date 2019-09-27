Ext.define('erp.com.contactlist.view.ContactListViewWindow', {
	extend: 'Ext.window.Window',

	xtype: 'contactlistviewwindow',

	requires: [
		'Ext.tab.Panel',
		'erp.com.contactlist.view.ContactListViewPanel',
		'erp.com.contactlist.view.CrmContactsCustomerView'

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
			title: 'ContactList',
			border: true,
			style: 'border: 1px solid gray;border-radius: 7px;box-shadow: 3px 3px 2px #888888;',
			width: '100%',
			flex: 2,
			xtype: 'contactlistvpanel'
		}
,
		{
			title: '',
			border: true,
			style: 'border: 1px solid gray;border-radius: 7px;box-shadow: 3px 3px 2px #888888;',
			width: '100%',
			flex: 2,
			xtype: 'crmcontactscustomerview'
		}
	],

	loadData: function (record) {
		var __contactlist = Delicacy.lookupReference(this, 'contactlistvreference');
		__contactlist.form.loadRecord(record);
		var __detailcrmcontactscustomer = Delicacy.lookupReference(this, 'crmcontactscustomerviewreference');
		__detailcrmcontactscustomer.setData(record);
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
