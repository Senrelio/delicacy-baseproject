Ext.define('erp.sysmanage.mainfunction.view.MainFunctionViewPanel', {
	extend: 'Ext.form.Panel',
	xtype: 'mainfunctionvpanel',

	reference: 'mainfunctionvreference',

	controller: 'mainfunctionController',

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
						xtype: 'displayfield',
						name: 'functionId',
						itemId: 'functionId',
						fieldLabel: '功能编码'
					},
					{
						xtype: 'displayfield',
						name: 'functionCode',
						itemId: 'functionCode',
						fieldLabel: '功能代码'
					},
					{
						xtype: 'displayfield',
						name: 'privilegeType',
						itemId: 'privilegeType',
						fieldLabel: '数据权限类型'
					},
					{
						xtype: 'displayfield',
						name: 'className',
						itemId: 'className',
						fieldLabel: '类名称'
					},
					{
						xtype: 'displayfield',
						renderer: function(value, field) { return Ext.util.Format.number(value, '0,000,000,000.00'); },
						name: 'marginBottom',
						itemId: 'marginBottom',
						fieldLabel: '底部'
					},
					{
						xtype: 'displayfield',
						name: 'seqNo',
						itemId: 'seqNo',
						fieldLabel: '序号'
					}				]}
				,
				{ padding: 10, 
					items: [
					{
						xtype: 'displayfield',
						name: 'functionName',
						itemId: 'functionName',
						fieldLabel: '功能名称'
					},
					{
						xtype: 'displayfield',
						name: 'applicationId',
						itemId: 'applicationId',
						fieldLabel: '应用系统'
					},
					{
						xtype: 'displayfield',
						name: 'icon',
						itemId: 'icon',
						fieldLabel: '图标'
					},
					{
						xtype: 'displayfield',
						name: 'iconColor',
						itemId: 'iconColor',
						fieldLabel: '图标颜色'
					},
					{
						xtype: 'displayfield',
						name: 'executeName',
						itemId: 'executeName',
						fieldLabel: '执行程序'
					},
					{
						xtype: 'displayfield',
						name: 'organizationId',
						itemId: 'organizationId',
						fieldLabel: '组织机构代码'
					}				]}
				,
				{ padding: 10, 
					items: [
					{
						xtype: 'displayfield',
						name: 'parentId',
						itemId: 'parentId',
						fieldLabel: '上级代码'
					},
					{
						xtype: 'displayfield',
						name: 'functionType',
						itemId: 'functionType',
						fieldLabel: '3-数据权限'
					},
					{
						xtype: 'displayfield',
						name: 'styleName',
						itemId: 'styleName',
						fieldLabel: '样式'
					},
					{
						xtype: 'displayfield',
						renderer: function(value, field) { return Ext.util.Format.number(value, '0,000,000,000.00'); },
						name: 'marginTop',
						itemId: 'marginTop',
						fieldLabel: '顶部空间'
					},
					{
						xtype: 'displayfield',
						name: 'remark',
						itemId: 'remark',
						fieldLabel: '备注'
					}				]}

			]
		}
		,
		{
			xtype: 'fieldcontainer',
			layout: 'hbox',

			items: [
				{
					xtype: 'displayfield',
					labelAlign: 'right',
					renderer: function(value, field) { if(value) return '是'; else return '否'; },
					name: 'enabled',
					itemId: 'enabled',
					fieldLabel: '可用'
				},
				{
					xtype: 'displayfield',
					labelAlign: 'right',
					renderer: function(value, field) { if(value) return '是'; else return '否'; },
					name: 'leaf',
					itemId: 'leaf',
					fieldLabel: '叶子节点'
				},
				{
					xtype: 'displayfield',
					labelAlign: 'right',
					renderer: function(value, field) { if(value) return '是'; else return '否'; },
					name: 'isMobile',
					itemId: 'isMobile',
					fieldLabel: '移动端'
				}
			]
		}

	]
});
