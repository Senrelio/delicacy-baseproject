Ext.define('erp.com.contactlist.view.DetailCrmContactsCustomerPanel', {
	extend: 'Ext.panel.Panel',

	xtype: 'detailcontactlistcrmcontactscustomerpanel',

	reference: 'detailcontactlistcrmcontactscustomerreference',

	requires: [
		'erp.com.contactlist.controller.DetailCrmContactsCustomerController',
		'erp.com.contactlist.view.CrmContactsCustomerPanel',
		'erp.com.contactlist.view.ContactToCustomerSourcePanel'
	],

	border: false,

	layout: 'hbox',

	controller: 'contactlistcrmcontactscustomerController',

	setData: function(record) {
		this.originalData = record;
		var source = this.lookupReference('contactlistcontacttocustomersourcereference');
		source.setData(record);
		var target = this.lookupReference('contactlistcrmcontactscustomerreference');
		target.setData(record);
	},

	getValues: function() {
		var target = this.lookupReference('contactlistcrmcontactscustomerreference');
		return target.getValues();
	},

	items: [{
			xtype: 'contactlistcontacttocustomersourcepanel',
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
			xtype: 'contactlistcrmcontactscustomerpanel',
			border: true,
			style: 'border: 1px solid gray;border-radius: 7px;box-shadow: 3px 3px 2px #888888;',
			flex: 1
	}]
});
