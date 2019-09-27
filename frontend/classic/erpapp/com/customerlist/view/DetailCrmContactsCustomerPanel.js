Ext.define('erp.com.customerlist.view.DetailCrmContactsCustomerPanel', {
	extend: 'Ext.panel.Panel',

	xtype: 'detailcustomerlistcrmcontactscustomerpanel',

	reference: 'detailcustomerlistcrmcontactscustomerreference',

	requires: [
		'erp.com.customerlist.controller.DetailCrmContactsCustomerController',
		'erp.com.customerlist.view.CrmContactsCustomerPanel',
		'erp.com.customerlist.view.CustomerToContactsSourcePanel'
	],

	border: false,

	layout: 'hbox',

	controller: 'customerlistcrmcontactscustomerController',

	setData: function(record) {
		this.originalData = record;
		var source = this.lookupReference('customerlistcustomertocontactssourcereference');
		source.setData(record);
		var target = this.lookupReference('customerlistcrmcontactscustomerreference');
		target.setData(record);
	},

	getValues: function() {
		var target = this.lookupReference('customerlistcrmcontactscustomerreference');
		return target.getValues();
	},

	items: [{
			xtype: 'customerlistcustomertocontactssourcepanel',
			border: true,
			style: 'border: 1px solid gray;border-radius: 7px;box-shadow: 3px 3px 2px #888888;',
			flex: 1
		}, {
			xtype: 'panel',
			width: 60,
			height: '100%',
			layout: 'center',
			items: [{
				xtype: 'button',
				iconCls: 'x-fa fa-angle-double-right green',
				handler: 'onItemCopy'
			}]
		}, {
			xtype: 'customerlistcrmcontactscustomerpanel',
			border: true,
			style: 'border: 1px solid gray;border-radius: 7px;box-shadow: 3px 3px 2px #888888;',
			flex: 1
	}]
});
