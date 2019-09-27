Ext.define('erp.sysmanage.mainfunction.view.MainFunctionPanel', {
	extend: 'Ext.tree.Panel',
	xtype: 'mainfunctionpanel',

	reference: 'mainfunctionreference',

	controller: 'mainfunctionController',

	requires: [
		'erp.sysmanage.mainfunction.store.MainFunctionStore',
		'erp.sysmanage.mainfunction.controller.MainFunctionController',
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
			flex: 3,
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value) { return value; },
			align: 'start'
		}
		,
		{
			text: '功能编号',
			flex:2,
			dataIndex: 'functionCode',
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value) { return value; },
			align: 'start'
		}
		,
		{
			text: '功能类型',
			flex:2,
			dataIndex: 'functionType',
			editor: {
				xtype: 'combobox',
				displayField: 'label',
				valueField: 'id',
				queryMode: 'local',
				store: Delicacy.generateOptionStore('functionTypes', true),
			},
			renderer: function(value) { return Delicacy.getLabelByValue('functionTypes', value); },
			align: 'end'
		}
		,
		{
			text: '执行程序',
			flex:2,
			dataIndex: 'executeName',
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value) { return value; },
			align: 'start'
		}
		,
		{
			xtype: 'actioncolumn',
			flex:1,
			text:'操作类型',
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
			if(!Delicacy.isNullOrEmpty(values)){
				delete values['icon'];
			}
			values.tableName = 'MainFunction';
			values.subaction = 'saveOrUpdate';
			Delicacy.callOperation('EP_TableProcess', subaction, values, function(resp){
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
