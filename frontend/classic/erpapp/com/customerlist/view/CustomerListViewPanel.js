Ext.define('erp.com.customerlist.view.CustomerListViewPanel', {
	extend: 'Ext.form.Panel',
	xtype: 'customerlistvpanel',

	reference: 'customerlistvreference',

	controller: 'customerlistController',

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
			name: 'customerId',
			itemId: 'customerId',
			fieldLabel: '客户编码'
		},
		{
			xtype: 'displayfield',
			name: 'customerCode',
			itemId: 'customerCode',
			fieldLabel: '客户编号'
		},
		{
			xtype: 'displayfield',
			name: 'leadId',
			itemId: 'leadId',
			fieldLabel: '销售线索编码'
		},
		{
			xtype: 'displayfield',
			name: 'entityType',
			itemId: 'entityType',
			fieldLabel: '主体类型'
		},
		{
			xtype: 'displayfield',
			name: 'employeeIdMaintainer',
			itemId: 'employeeIdMaintainer',
			fieldLabel: '维护人员工编码'
		},
		{
			xtype: 'displayfield',
			name: 'customerName',
			itemId: 'customerName',
			fieldLabel: '客户名称'
		},
		{
			xtype: 'displayfield',
			name: 'level',
			itemId: 'level',
			fieldLabel: '客户级别(重点客户，普通客户，非优先客户)'
		},
		{
			xtype: 'displayfield',
			name: 'parentCustomerId',
			itemId: 'parentCustomerId',
			fieldLabel: '父级客户编码'
		},
		{
			xtype: 'displayfield',
			name: 'industryId',
			itemId: 'industryId',
			fieldLabel: '行业'
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
			format: 'Y-m-d',
			renderer: function(value, cmp) { return Ext.util.Format.date(value, 'Y-m-d'); },
			name: 'dateLatestActivity',
			itemId: 'dateLatestActivity',
			fieldLabel: '最近活动时间'
		},
		{
			xtype: 'displayfield',
			name: 'employeeIdLatestFollowup',
			itemId: 'employeeIdLatestFollowup',
			fieldLabel: '最近跟进员工编码'
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
			renderer: function(value, cmp) { return Delicacy.getLabelByValue('departments', value); },
			name: 'departmentId',
			itemId: 'departmentId',
			fieldLabel: '所属部门编码'
		},
		{
			xtype: 'displayfield',
			format: 'Y-m-d',
			renderer: function(value, cmp) { return Ext.util.Format.date(value, 'Y-m-d'); },
			name: 'dateLatestVisit',
			itemId: 'dateLatestVisit',
			fieldLabel: '最近拜访时间'
		},
		{
			xtype: 'displayfield',
			name: 'daycountNotVisited',
			itemId: 'daycountNotVisited',
			fieldLabel: '未拜访天数'
		},
		{
			xtype: 'displayfield',
			name: 'detailedAddress',
			itemId: 'detailedAddress',
			fieldLabel: '详细地址'
		},
		{
			xtype: 'displayfield',
			name: 'postcode',
			itemId: 'postcode',
			fieldLabel: '邮政编码'
		},
		{
			xtype: 'displayfield',
			name: 'telephone',
			itemId: 'telephone',
			fieldLabel: '电话'
		},
		{
			xtype: 'displayfield',
			name: 'fax',
			itemId: 'fax',
			fieldLabel: '传真'
		},
		{
			xtype: 'displayfield',
			name: 'companyWebsiteLink',
			itemId: 'companyWebsiteLink',
			fieldLabel: '公司网址'
		},
		{
			xtype: 'displayfield',
			name: 'weibo',
			itemId: 'weibo',
			fieldLabel: '微博'
		},
		{
			xtype: 'displayfield',
			name: 'numberEmployees',
			itemId: 'numberEmployees',
			fieldLabel: '总人数'
		},
		{
			xtype: 'displayfield',
			name: 'annualRevenue',
			itemId: 'annualRevenue',
			fieldLabel: ''
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
			name: 'flagIndustrialCommercialRegistered',
			itemId: 'flagIndustrialCommercialRegistered',
			fieldLabel: '有无工商登记'
		},
		{
			xtype: 'displayfield',
			labelAlign: 'right',
			renderer: function(value, cmp) { if(value) return '是'; else return '否'; },
			name: 'flagNoDisturb',
			itemId: 'flagNoDisturb',
			fieldLabel: '是否为免打扰客户'
		}

	]
});
