Ext.define('erp.com.customerlist.view.CustomerToContactsSourcePanel', {
	extend: 'Ext.grid.Panel',
	xtype: 'customerlistcustomertocontactssourcepanel',

	reference: 'customerlistcustomertocontactssourcereference',

	controller: 'customerlistcustomertocontactssourceController',

	border: false,

	columnLines: true,

	requires: [
		'erp.com.customerlist.controller.CustomerToContactsSourceController',
		'Ext.grid.plugin.BufferedRenderer'
	],

	margin: 10,

	header: false, 

	height: '100%',

	store: { type: 'array', isBufferedStore: false },

	plugins: [
		'bufferedrenderer'
	],

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
		me.setData();
	},

	onRender: function(){
		this.callParent(arguments);
	},

	setData: function(record) {
		this.dataFromParent = record;
		var params = {};
		var options = {source: this};
		Delicacy.callOperation('ST_CrmContact', 'find', params, this.processResponse, options);
	},

	processResponse: function(resp, options) {
		var data = resp.ResultSet.Result;
		options.source.getStore().setData(data);
	},

	getValues: function() {
		var me = this;
		var store = me.getStore();
		return {detailCustomerToContactsSource: Delicacy.getDataFromCollection(store.getData())};
	},

	getSelectedItems: function() {
		var me = this;
		var selection = me.getSelection();
		return Delicacy.getDataFromCollection(selection);
	},

	columns: [
		{
			text: '姓名',
			dataIndex: 'contactName',
			flex: 1
		}
		,
		{
			text: '联系人编码',
			dataIndex: 'contactId',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '维护人员工编码',
			dataIndex: 'employeeIdMaintainer',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '主体类型',
			dataIndex: 'entityType',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '电话',
			dataIndex: 'telephone',
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value, cmp) { return value; },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '手机',
			dataIndex: 'mobile',
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value, cmp) { return value; },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '电子邮件',
			dataIndex: 'email',
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value, cmp) { return value; },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '出生日期',
			dataIndex: 'birthday',
			renderer: function(value, cmp) { return Ext.util.Format.date(value, 'Y-m-d'); },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '最近活动时间',
			dataIndex: 'dateLatestActivity',
			renderer: function(value, cmp) { return Ext.util.Format.date(value, 'Y-m-d'); },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '创建日期',
			dataIndex: 'dateCreated',
			renderer: function(value, cmp) { return Ext.util.Format.date(value, 'Y-m-d'); },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '创建人',
			dataIndex: 'employeeIdCreated',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '最近修改日',
			dataIndex: 'dateUpdated',
			renderer: function(value, cmp) { return Ext.util.Format.date(value, 'Y-m-d'); },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '最近修改人',
			dataIndex: 'employeeIdUpdated',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '是否被锁定',
			dataIndex: 'flagLocked',
			renderer: function(value, cmp) { return value? '是' : '否'; },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '是否为免打扰联系人',
			dataIndex: 'flagNoDisturb',
			renderer: function(value, cmp) { return value? '是' : '否'; },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '联系人角色',
			dataIndex: 'contactRole',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '部门',
			dataIndex: 'departmentId',
			renderer: function(value, cmp) { return Delicacy.getLabelByValue('departments', value); },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '职务',
			dataIndex: 'position',
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value, cmp) { return value; },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '微信',
			dataIndex: 'wechat',
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value, cmp) { return value; },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '微博',
			dataIndex: 'weibo',
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value, cmp) { return value; },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '省',
			dataIndex: 'areaProvince',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '市',
			dataIndex: 'areaCity',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '区',
			dataIndex: 'areaDistrict',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '详细地址（不包括省市区）',
			dataIndex: 'detailedAddress',
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value, cmp) { return value; },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '邮政编码',
			dataIndex: 'postcode',
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value, cmp) { return value; },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '性别',
			dataIndex: 'gender',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '备注',
			dataIndex: 'memo',
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value, cmp) { return value; },
			hidden: true,
			align: 'start'
		}
	]
});
