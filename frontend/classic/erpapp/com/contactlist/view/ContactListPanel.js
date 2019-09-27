Ext.define('erp.com.contactlist.view.ContactListPanel', {
	extend: 'Ext.grid.Panel',
	xtype: 'contactlistpanel',

	reference: 'contactlistreference',

	controller: 'contactlistController',

	padding: 10,

	columnLines: true,

	requires: [
		'erp.com.contactlist.store.ContactListStore',
		'erp.com.contactlist.controller.ContactListController',
		'erp.com.contactlist.view.ContactListSearchPanel',
		'erp.com.contactlist.view.CrmContactsCustomerView',
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
		var storeInstance = Ext.create('erp.com.contactlist.store.ContactListStore', {viewComponent: me});
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
			xtype: 'contactlistsearchpanel', 
			dock: 'top',
			collapsible: true,
			collapsed: true
		}
	],

	columns: [
		{
			text: '联系人编码',
			dataIndex: 'contactId',
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
			text: '主体类型',
			dataIndex: 'entityType',
			renderer: function(value, cmp) { return Ext.util.Format.number(value, '0000000000'); },
			hidden: false,
			align: 'end'
		}
		,
		{
			text: '姓名',
			dataIndex: 'contactName',
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
			text: '电话',
			dataIndex: 'telephone',
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value, cmp) { return value; },
			hidden: false,
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
			hidden: false,
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
