Ext.define('erp.sysmanage.mainfunction.view.MainFunctionSearchPanel', {
	extend: 'Ext.form.Panel',
	xtype: 'mainfunctionsearchpanel',

	reference: 'mainfunctionsearchreference',

	controller: 'mainfunctionController',

	padding: 10,

	header: false,

	onAdd: function(){
	},

	fieldDefaults: {
		msgTarget: 'side',
		labelAlign: 'top',
		labelWidth: 100,
		labelStyle: 'font-weight:bold'
	},

	layout: 'vbox',

	items: [
		{
			xtype: 'fieldcontainer',
			layout: 'column',

			items: [
				{ padding: 10, 
					items: [
					{
						xtype: 'textfield',
						name: 'functionType',
						itemId: 'functionType',
						fieldLabel: '权限类型',
						allowBlank: true
					}
					,
					{
						xtype: 'textfield',
						name: 'organizationId',
						itemId: 'organizationId',
						fieldLabel: '组织机构代码',
						allowBlank: true
					}
					,
					{
						xtype: 'textfield',
						name: 'functionName',
						itemId: 'functionName',
						fieldLabel: '功能名称',
						allowBlank: true
					}
				]},
				{ padding: 10, 
					items: [
					{
						xtype: 'textfield',
						name: 'privilegeType',
						itemId: 'privilegeType',
						fieldLabel: '数据权限类型',
						allowBlank: true
					}
					,
					{
						xtype: 'textfield',
						name: 'functionCode',
						itemId: 'functionCode',
						fieldLabel: '功能代码',
						allowBlank: true
					}
					,
					{
						xtype: 'textfield',
						name: 'parentId',
						itemId: 'parentId',
						fieldLabel: '上级代码',
						allowBlank: true
					}
				]}
			]
		}
		,
		{
			xtype: 'fieldcontainer',
			layout: 'hbox',

			items: [
				{
					xtype: 'checkboxfield',
					labelAlign: 'right',
					name: 'enabled',
					itemId: 'enabled',
					fieldLabel: '可用',
					allowBlank: true
				}
				,
				{
					xtype: 'checkboxfield',
					labelAlign: 'right',
					name: 'leaf',
					itemId: 'leaf',
					fieldLabel: '叶子节点',
					allowBlank: true
				}
			]
		}
	]
});
