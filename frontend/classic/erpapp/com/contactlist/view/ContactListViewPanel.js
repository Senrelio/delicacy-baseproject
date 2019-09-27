Ext.define('erp.com.contactlist.view.ContactListViewPanel', {
	extend: 'Ext.form.Panel',
	xtype: 'contactlistvpanel',

	reference: 'contactlistvreference',

	controller: 'contactlistController',

	header: false,

	height: '100%',

	width: '100%',

	margin: '10 10 10 10',

	onAdd: function(){
	},

	fieldDefaults: {
		msgTarget: 'side',
		labelAlign: 'left',
		labelStyle: 'font-weight:bold'
	},

	layout: 'column',

	defaults: {
		margin: '0 0 0 10',
		columnWidth: 0.25
	},

	items: [
		{
			xtype: 'displayfield',
			name: 'contactId',
			itemId: 'contactId',
			fieldLabel: '联系人编码'
		},
		{
			xtype: 'displayfield',
			name: 'employeeIdMaintainer',
			itemId: 'employeeIdMaintainer',
			fieldLabel: '维护人员工编码'
		},
		{
			xtype: 'displayfield',
			name: 'entityType',
			itemId: 'entityType',
			fieldLabel: '主体类型'
		},
		{
			xtype: 'displayfield',
			name: 'contactName',
			itemId: 'contactName',
			fieldLabel: '姓名'
		},
		{
			xtype: 'displayfield',
			name: 'telephone',
			itemId: 'telephone',
			fieldLabel: '电话'
		},
		{
			xtype: 'displayfield',
			name: 'mobile',
			itemId: 'mobile',
			fieldLabel: '手机'
		},
		{
			xtype: 'displayfield',
			name: 'email',
			itemId: 'email',
			fieldLabel: '电子邮件'
		},
		{
			xtype: 'displayfield',
			format: 'Y-m-d',
			renderer: function(value, cmp) { return Ext.util.Format.date(value, 'Y-m-d'); },
			name: 'birthday',
			itemId: 'birthday',
			fieldLabel: '出生日期'
		},
		{
			xtype: 'displayfield',
			format: 'Y-m-d',
			renderer: function(value, cmp) { return Ext.util.Format.date(value, 'Y-m-d'); },
			name: 'dateLatestActivity',
			itemId: 'dateLatestActivity',
			fieldLabel: '最近活动时间'
		},
		{
			xtype: 'displayfield',
			format: 'Y-m-d',
			renderer: function(value, cmp) { return Ext.util.Format.date(value, 'Y-m-d'); },
			name: 'dateCreated',
			itemId: 'dateCreated',
			fieldLabel: '创建日期'
		},
		{
			xtype: 'displayfield',
			name: 'employeeIdCreated',
			itemId: 'employeeIdCreated',
			fieldLabel: '创建人'
		},
		{
			xtype: 'displayfield',
			format: 'Y-m-d',
			renderer: function(value, cmp) { return Ext.util.Format.date(value, 'Y-m-d'); },
			name: 'dateUpdated',
			itemId: 'dateUpdated',
			fieldLabel: '最近修改日'
		},
		{
			xtype: 'displayfield',
			name: 'employeeIdUpdated',
			itemId: 'employeeIdUpdated',
			fieldLabel: '最近修改人'
		},
		{
			xtype: 'displayfield',
			name: 'contactRole',
			itemId: 'contactRole',
			fieldLabel: '联系人角色'
		},
		{
			xtype: 'displayfield',
			renderer: function(value, cmp) { return Delicacy.getLabelByValue('departments', value); },
			name: 'departmentId',
			itemId: 'departmentId',
			fieldLabel: '部门'
		},
		{
			xtype: 'displayfield',
			name: 'position',
			itemId: 'position',
			fieldLabel: '职务'
		},
		{
			xtype: 'displayfield',
			name: 'wechat',
			itemId: 'wechat',
			fieldLabel: '微信'
		},
		{
			xtype: 'displayfield',
			name: 'weibo',
			itemId: 'weibo',
			fieldLabel: '微博'
		},
		{
			xtype: 'displayfield',
			name: 'areaProvince',
			itemId: 'areaProvince',
			fieldLabel: '省'
		},
		{
			xtype: 'displayfield',
			name: 'areaCity',
			itemId: 'areaCity',
			fieldLabel: '市'
		},
		{
			xtype: 'displayfield',
			name: 'areaDistrict',
			itemId: 'areaDistrict',
			fieldLabel: '区'
		},
		{
			xtype: 'displayfield',
			name: 'detailedAddress',
			itemId: 'detailedAddress',
			fieldLabel: '详细地址（不包括省市区）'
		},
		{
			xtype: 'displayfield',
			name: 'postcode',
			itemId: 'postcode',
			fieldLabel: '邮政编码'
		},
		{
			xtype: 'displayfield',
			name: 'gender',
			itemId: 'gender',
			fieldLabel: '性别'
		},
		{
			xtype: 'displayfield',
			name: 'memo',
			itemId: 'memo',
			fieldLabel: '备注'
		}
		,
		{
			xtype: 'displayfield',
			labelAlign: 'right',
			renderer: function(value, cmp) { if(value) return '是'; else return '否'; },
			name: 'flagLocked',
			itemId: 'flagLocked',
			fieldLabel: '是否被锁定'
		},
		{
			xtype: 'displayfield',
			labelAlign: 'right',
			renderer: function(value, cmp) { if(value) return '是'; else return '否'; },
			name: 'flagNoDisturb',
			itemId: 'flagNoDisturb',
			fieldLabel: '是否为免打扰联系人'
		}

	]
});
