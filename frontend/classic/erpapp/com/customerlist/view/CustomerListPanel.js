Ext.define('erp.com.customerlist.view.CustomerListPanel', {
	extend: 'Ext.grid.Panel',
	xtype: 'customerlistpanel',

	reference: 'customerlistreference',

	controller: 'customerlistController',

	padding: 10,

	columnLines: true,

	requires: [
		'erp.com.customerlist.store.CustomerListStore',
		'erp.com.customerlist.controller.CustomerListController',
		'erp.com.customerlist.view.CustomerListSearchPanel',
		'erp.com.customerlist.view.CrmContactsCustomerView',
		'Ext.grid.plugin.BufferedRenderer',
		'Ext.toolbar.Paging'
	],

	margin: 10,

	header: false, 

	height: '100%',

	plugins: {
		rowwidget: {
			widget: {
				header: false,
				xtype: 'crmcontactscustomerview',
				bbar:{
					xtype: 'toolbar',
					items: ['->',
						{
							xtype: 'button',
							iconCls: 'x-fa fa-times-circle red',
							text: '关闭',
							handler: 'closeRowDetail'
						}
					]
				}
			}
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
		var storeInstance = Ext.create('erp.com.customerlist.store.CustomerListStore', {viewComponent: me});
		me.setStore(storeInstance);
		me.getView().on({'expandbody': me.expandBodyClick});
	},

	expandBodyClick: function(rowNode, record, expandRow, childGrid){
		childGrid.selectedRecord = record;
		childGrid.selectedRowIndex = record.store.indexOf(record);
		childGrid.setData(record);
	},

	onRender: function(){
		this.callParent(arguments);
	},

	dockedItems: [
		{
			xtype: 'toolbar',
			dock: 'top',
			items: [{
				iconCls: 'x-fa fa-plus green',
				text: '新增',
				handler: 'onToolAdd'
			}, {
				iconCls: 'x-fa fa-edit green',
				text: '修改',
				tooltip: '修改',
				handler: 'onToolEdit'
			}, {
				iconCls: 'x-fa fa-search green',
				tooltip: '查询',
				handler: 'onToolSearch'
			}]
		}
		,
		{
			xtype: 'customerlistsearchpanel', 
			dock: 'top',
			collapsible: true,
			collapsed: true
		}
	],

	columns: [
		{
			text: '客户编码',
			dataIndex: 'customerId',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: false,
			align: 'end'
		}
		,
		{
			text: '客户编号',
			dataIndex: 'customerCode',
			flex: 2,
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value, cmp) { return value; },
			hidden: false,
			align: 'start'
		}
		,
		{
			text: '销售线索编码',
			dataIndex: 'leadId',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: false,
			align: 'end'
		}
		,
		{
			text: '主体类型',
			dataIndex: 'entityType',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: false,
			align: 'end'
		}
		,
		{
			text: '维护人员工编码',
			dataIndex: 'employeeIdMaintainer',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: false,
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
			hidden: false,
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
			text: '',
			dataIndex: 'annualRevenue',
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
		,
		{
			xtype: 'actioncolumn',
			text: '操作类型',
			width: 75,
			menuDisabled: true,
			sortable: false,
			items: [
				{
					iconCls: 'x-fa fa-edit green',
					tooltip: '编辑',
					stopSelection: false,
					handler: 'onActionEdit'
				}
				,
				{
					iconCls: 'x-fa fa-remove red',
					tooltip: '删除',
					stopSelection: false,
					handler: 'onActionDelete'
				}
				,
				{
					iconCls: 'x-fa fa-eye green',
					tooltip: '属性',
					stopSelection: false,
					handler: 'onActionAttribute'
				}
			]
		}
	],

	bbar: {
		xtype: 'pagingtoolbar',
		displayInfo: false
	},

	listeners: {
		rowcontextmenu: 'onRightClick',
		rowdblclick: 'rowdblclick'
	}

});
