Ext.define('erp.com.contactlist.view.CrmContactsCustomerView', {
	extend: 'Ext.grid.Panel',
	xtype: 'contactlistcrmcontactscustomerview',

	reference: 'contactlistcrmcontactscustomerviewreference',

	border: false,

	columnLines: true,

	requires: [
		'erp.com.contactlist.controller.CrmContactsCustomerController',
		'Ext.grid.plugin.BufferedRenderer'
	],

	controller: 'crmcontactscustomerController',

	store: {
		type: 'array',
		isBufferedStore: false
	},

	margin: 10,

	header: false, 

	constructor: function(){
		this.callParent(arguments);
	},

	initComponent: function(config){
		var me = this;
		me.callParent(arguments);
	},

	onRender: function(){
		this.callParent(arguments);
	},

	setData: function(record) {
		var me = this;
		var options = {source: me};
		var params = {contactsId: record.getData().contactId};
		Delicacy.callOperation('ST_CrmContactsCustomer', 'find', params, this.callbackOperation, options);
	},

	callbackOperation: function(resp, options) {
		var grid = options.source;
		if(resp.ResultSet.status === 0) {
			grid.store.setData(resp.ResultSet.Result);
		}
	},

	columns: [
		{
			text: '',
			dataIndex: 'contactsCustomersId',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: false,
			align: 'end'
		}
		,
		{
			text: '客户id',
			dataIndex: 'customersId',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: false,
			align: 'end'
		}
	],

	listeners: {
		rowdblclick: 'rowdblclick'
	}

});
