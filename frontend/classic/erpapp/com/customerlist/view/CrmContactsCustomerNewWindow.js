Ext.define('erp.com.customerlist.view.CrmContactsCustomerNewWindow', {
	extend: 'Ext.window.Window',

	xtype: 'customerlistcrmcontactscustomernewwindow',

	requires: [
		'erp.com.customerlist.controller.CrmContactsCustomerNewController',
		'erp.com.customerlist.view.CrmContactsCustomerNewPanel'
	],

	layout: 'card',

	minWidth: 300,

	minHeight: 380,

	scrollable: true,

	resizable: true,

	modal: true,

	controller: 'crmcontactscustomerNewController',

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

	items: [{
			xtype: 'crmcontactscustomernpanel'
	}],

	loadData: function (record) {
		this.originalData = record;
		if(record) {
		} 
	},

	getValues: function() {
		var res = this.originalData;
		if(!res) res = {}; else res = res.getData();
		return res;
	},

	bbar: ['->',
		{
			xtype: 'button',
			iconCls: 'x-fa fa-check-circle green',
			text: '确认',
			handler: 'windowConfirm'
		},

		{
			xtype: 'button',
			iconCls: 'x-fa fa-times-circle red',
			text: '取消',
			handler: function() { var win = arguments[0].ownerCt.ownerCt; win.destroy(); } 
		}
	]
});
