Ext.define('erp.com.contactlist.view.ContactToCustomerSourcePanel', {
	extend: 'Ext.grid.Panel',
	xtype: 'contactlistcontacttocustomersourcepanel',

	reference: 'contactlistcontacttocustomersourcereference',

	controller: 'contactlistcontacttocustomersourceController',

	border: false,

	columnLines: true,

	requires: [
		'erp.com.contactlist.controller.ContactToCustomerSourceController',
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
		Delicacy.callOperation('ST_CrmCustomer', 'find', params, this.processResponse, options);
	},

	processResponse: function(resp, options) {
		var data = resp.ResultSet.Result;
		options.source.getStore().setData(data);
	},

	getValues: function() {
		var me = this;
		var store = me.getStore();
		return {detailContactToCustomerSource: Delicacy.getDataFromCollection(store.getData())};
	},

	getSelectedItems: function() {
		var me = this;
		var selection = me.getSelection();
		return Delicacy.getDataFromCollection(selection);
	},

	columns: [
		{
			text: '客户编号',
			dataIndex: 'customerCode',
			flex: 1
		}
		,
		{
			text: '客户编码',
			dataIndex: 'customerId',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '销售线索编码',
			dataIndex: 'leadId',
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
			text: '维护人员工编码',
			dataIndex: 'employeeIdMaintainer',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '客户名称',
			dataIndex: 'customerName',
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value, cmp) { return value; },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '客户级别(重点客户，普通客户，非优先客户)',
			dataIndex: 'level',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '父级客户编码',
			dataIndex: 'parentCustomerId',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '行业',
			dataIndex: 'industryId',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
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
			text: '最近活动时间',
			dataIndex: 'dateLatestActivity',
			renderer: function(value, cmp) { return Ext.util.Format.date(value, 'Y-m-d'); },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '最近跟进员工编码',
			dataIndex: 'employeeIdLatestFollowup',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
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
			text: '所属部门编码',
			dataIndex: 'departmentId',
			renderer: function(value, cmp) { return Delicacy.getLabelByValue('departments', value); },
			hidden: true,
			align: 'start'
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
			text: '有无工商登记',
			dataIndex: 'flagIndustrialCommercialRegistered',
			renderer: function(value, cmp) { return value? '是' : '否'; },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '是否为免打扰客户',
			dataIndex: 'flagNoDisturb',
			renderer: function(value, cmp) { return value? '是' : '否'; },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '最近拜访时间',
			dataIndex: 'dateLatestVisit',
			renderer: function(value, cmp) { return Ext.util.Format.date(value, 'Y-m-d'); },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '未拜访天数',
			dataIndex: 'daycountNotVisited',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '详细地址',
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
			text: '传真',
			dataIndex: 'fax',
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value, cmp) { return value; },
			hidden: true,
			align: 'start'
		}
		,
		{
			text: '公司网址',
			dataIndex: 'companyWebsiteLink',
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
			text: '总人数',
			dataIndex: 'numberEmployees',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: true,
			align: 'end'
		}
		,
		{
			text: '销售额',
			dataIndex: 'annualRevenue',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0,000,000,000.00'); },
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
