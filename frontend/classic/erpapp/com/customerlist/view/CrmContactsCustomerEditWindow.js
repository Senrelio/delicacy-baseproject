Ext.define('erp.com.customerlist.view.CrmContactsCustomerEditWindow', {
	extend: 'Ext.window.Window',

	xtype: 'customerlistcrmcontactscustomereditwindow',

	requires: [
		'erp.com.customerlist.controller.CrmContactsCustomerEditController'
	],

	layout: 'card',

	minWidth: 300,

	minHeight: 380,

	scrollable: true,

	resizable: true,

	modal: true,

	controller: 'crmcontactscustomerEditController',

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
			xtype: 'crmcontactscustomerupanel'
	}],

	loadData: function (record) {
		this.originalData = record;
	},

	getValues: function() {
		var res = this.originalData.getData();
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
