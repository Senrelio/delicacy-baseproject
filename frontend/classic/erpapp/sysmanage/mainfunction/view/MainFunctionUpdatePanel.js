Ext.define('erp.sysmanage.mainfunction.view.MainFunctionUpdatePanel', {
	extend: 'Ext.form.Panel',
	xtype: 'mainfunctionupanel',

	reference: 'mainfunctionureference',

	padding: 20,

	onAdd: function(){
	},

	fieldDefaults: {
		msgTarget: 'side',
		labelAlign: 'left',
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
						name: 'functionName',
						itemId: 'functionName',
						fieldLabel: '功能名称',
						allowBlank: true
					},
					{
						xtype: 'textfield',
						name: 'applicationId',
						itemId: 'applicationId',
						fieldLabel: '应用系统',
						allowBlank: true
					},
					{
						xtype: 'textfield',
						name: 'icon',
						itemId: 'icon',
						fieldLabel: '图标',
						allowBlank: true
					},
					{
						xtype: 'textfield',
						name: 'iconColor',
						itemId: 'iconColor',
						fieldLabel: '图标颜色',
						allowBlank: true
					},
					{
						xtype: 'textfield',
						name: 'executeName',
						itemId: 'executeName',
						fieldLabel: '执行程序',
						allowBlank: true
					},
					{
						xtype: 'textfield',
						name: 'organizationId',
						itemId: 'organizationId',
						fieldLabel: '组织机构代码',
						allowBlank: true
					}
				]},
				{ padding: 10, 
					items: [
					{
						xtype: 'textfield',
						name: 'parentId',
						itemId: 'parentId',
						fieldLabel: '上级代码',
						allowBlank: true
					},
					{
						xtype: 'textfield',
						name: 'functionType',
						itemId: 'functionType',
						fieldLabel: '3-数据权限',
						allowBlank: true
					},
					{
						xtype: 'textfield',
						name: 'styleName',
						itemId: 'styleName',
						fieldLabel: '样式',
						allowBlank: true
					},
					{
						xtype: 'textfield',
						name: 'marginTop',
						itemId: 'marginTop',
						fieldLabel: '顶部空间',
						allowBlank: true
					},
					{
						xtype: 'textfield',
						name: 'remark',
						itemId: 'remark',
						fieldLabel: '备注',
						allowBlank: true
					}
				]},
				{ padding: 10, 
					items: [
					{
						xtype: 'textfield',
						name: 'functionCode',
						itemId: 'functionCode',
						fieldLabel: '功能代码',
						allowBlank: true
					},
					{
						xtype: 'textfield',
						name: 'privilegeType',
						itemId: 'privilegeType',
						fieldLabel: '数据权限类型',
						allowBlank: true
					},
					{
						xtype: 'textfield',
						name: 'className',
						itemId: 'className',
						fieldLabel: '类名称',
						allowBlank: true
					},
					{
						xtype: 'textfield',
						name: 'marginBottom',
						itemId: 'marginBottom',
						fieldLabel: '底部',
						allowBlank: true
					},
					{
						xtype: 'textfield',
						name: 'seqNo',
						itemId: 'seqNo',
						fieldLabel: '序号',
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
				},
				{
					xtype: 'checkboxfield',
					labelAlign: 'right',
					name: 'leaf',
					itemId: 'leaf',
					fieldLabel: '叶子节点',
					allowBlank: true
				},
				{
					xtype: 'checkboxfield',
					labelAlign: 'right',
					name: 'isMobile',
					itemId: 'isMobile',
					fieldLabel: '移动端',
					allowBlank: true
				}
			]
		}

	]
});
