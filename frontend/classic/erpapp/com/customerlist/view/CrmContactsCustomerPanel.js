Ext.define('erp.com.customerlist.view.CrmContactsCustomerPanel', {
	extend: 'Ext.grid.Panel',
	xtype: 'customerlistcrmcontactscustomerpanel',

	reference: 'customerlistcrmcontactscustomerreference',

	controller: 'customerlistcrmcontactscustomerController',

	border: false,

	columnLines: true,

	requires: [
		'erp.com.customerlist.controller.CrmContactsCustomerController',
		'Ext.grid.plugin.BufferedRenderer',
		'Ext.selection.CellModel'
	],

	margin: 10,

	header: false, 

	height: '100%',

	store: { type: 'array', isBufferedStore: false },

	plugins: {
		cellediting: {
			clicksToEdit: 1
		}
	},

	selType: 'checkboxmodel',

	selMode: {
		mode: 'SINGLE'
	},

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
		this.originalData = record;
		var params = {customersId: record.getData().customerId};
		var options = {source: this};
		Delicacy.callOperation('ST_CrmContactsCustomer', 'find', params, this.processResponse, options);
	},

	processResponse: function(resp, options) {
		var data = resp.ResultSet.Result;
		options.source.getStore().setData(data);
	},

	getValues: function() {
		var me = this;
		var store = me.getStore();
		return {detailCrmContactsCustomer: Delicacy.getDataFromCollection(store.getData())};
	},

	columns: [
		{
			text: '',
			dataIndex: 'contactsCustomersId',
			editor: {
				xtype: 'numberfield',
			},
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: false,
			align: 'end'
		}
		,
		{
			text: '联系人id',
			dataIndex: 'contactsId',
			editor: {
				xtype: 'numberfield',
			},
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: false,
			align: 'end'
		}
		,
		{
			text: '客户id',
			dataIndex: 'customersId',
			editor: {
				xtype: 'numberfield',
			},
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: false,
			align: 'end'
		}
		,
		{
			xtype: 'actioncolumn',
			width: 25,
			menuDisabled: true,
			sortable: false,
			items: [
				{
					iconCls: 'x-fa fa-remove red',
					tooltip: '删除',
					stopSelection: false,
					handler: 'onActionDelete'
				}
			]
		}
	],

	listeners: {
		rowcontextmenu: 'onRightClick'
	}

});
