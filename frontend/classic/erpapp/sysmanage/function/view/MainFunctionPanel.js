Ext.define('erp.function.view.MainFunctionPanel', {
	extend: 'Ext.tree.Panel',
	xtype: 'mainfunctionpanel',

	reference: 'mainfunctionreference',

	controller: 'mainfunctionController',

	requires: [
		'erp.function.store.MainFunctionStore',
		'erp.function.controller.MainFunctionController',
		'Ext.tree.plugin.TreeViewDragDrop'
	],

	padding: 10,

	checkPropagation: 'both',

	rootVisible: false,

	useArrows: true,

	frame: true,

	enableDD: true,

	margin: 10,

	header: false, 

	height: '100%',

	draggable: false,

	viewConfig: {
		plugins: {
			treeviewdragdrop: {
				ddGroup: 'single-tree-drag-drop',
				appendOnly: true,
				sortOnDrop: true,
				containerScroll: true,
				copy: false
			}
		}
	},

	store: {
		type: 'mainfunctionStore'
	},

	plugins: {
		rowediting: {
			clicksToEdit: 2
		}
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

	dockedItems: [
		{
			xtype: 'toolbar',
			dock: 'top',
			items: [{
				iconCls: 'x-fa fa-plus green',
				text: '新增',
				handler: 'onToolAdd'
			}]
		}
	],

	columns: [
		{
			xtype: 'treecolumn',
			sortable: false,
			text: '功能名称',
			dataIndex: 'functionName',
			flex: 2,
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value) { return value; },
			align: 'start'
		}
		,
		{
			text: '功能编码',
			dataIndex: 'functionId',
			editor: {
				xtype: 'numberfield',
			},
			renderer: function(value) { return Ext.util.Format.number(value, '0000000000'); },
			align: 'end'
		}
		,
		{
			text: '上级代码',
			dataIndex: 'parentId',
			editor: {
				xtype: 'numberfield',
			},
			renderer: function(value) { return Ext.util.Format.number(value, '0000000000'); },
			align: 'end'
		}
		,
		{
			text: '功能代码',
			dataIndex: 'functionCode',
			flex: 1,
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value) { return value; },
			align: 'start'
		}
		,
		{
			text: '应用系统',
			dataIndex: 'applicationId',
			editor: {
				xtype: 'numberfield',
			},
			renderer: function(value) { return Ext.util.Format.number(value, '0000000000'); },
			align: 'end'
		}
		,
		{
			text: '功能类型,1-菜单,2-按钮,3-数据权限',
			dataIndex: 'functionType',
			editor: {
				xtype: 'numberfield',
			},
			renderer: function(value) { return Ext.util.Format.number(value, '0000000000'); },
			align: 'end'
		}
		,
		{
			text: '权限类型',
			dataIndex: 'privilegeType',
			editor: {
				xtype: 'numberfield',
			},
			renderer: function(value) { return Ext.util.Format.number(value, '0000000000'); },
			align: 'end'
		}
		,
		{
			xtype: 'actioncolumn',
			width: 30,
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
		rowcontextmenu: 'onRightClick',
		drop: 'onTreeNodeDrop',
		edit: function(editor, context, eOpts){
			var values = context.record.data;
			var subaction = 'update';
			if(values.__newCreatedRecord) subaction = 'save';
			Delicacy.callOperation('ST_MainFunction', subaction, values, function(resp){
				if(resp.ResultSet.status === 0){
					var res = resp.ResultSet.Result[0];
						delete context.record.data['__newCreatedRecord'];
					context.record.set(res);
					context.record.commit();
				} else {
					var record = context.record;
					var parentNode = record.parentNode;
					parentNode.removeChild(record);
				}
			});
		},
		canceledit: function(editor, context, eOpts){
			var values = context.record.data;
			if(values.__newCreatedRecord){
				var record = context.record;
				var parentNode = record.parentNode;
				parentNode.removeChild(record);
			}
		}
	}

});
