Ext.define('erp.sysmanage.mainfunction.view.CommonMainFunctionPanel', {
	extend: 'Ext.tree.Panel',
	xtype: 'commonmainfunctionpanel',

	reference: 'commonmainfunctionreference',
	
	id:'commonmainfunctionrepanel',

	controller: 'mainfunctionController',

	requires: [
		'erp.sysmanage.mainfunction.store.PermissionMainFunctionStore',
		'erp.sysmanage.mainfunction.controller.MainFunctionController',
		'Ext.tree.plugin.TreeViewDragDrop'
	],

	checkPropagation: 'both',

	rootVisible: false,

	useArrows: true,

	frame: true,
	
	height: '100%',
	
	selectionMode:'MULTI',
	
	store: {
		type: 'permissionmainfunctionStore'
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

	columns: [
		{
			xtype: 'treecolumn',
			sortable: false,
			text: '功能名称',
			dataIndex: 'functionName',
			flex: 1,
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value) { return value; },
			align: 'start'
		}
		,
		{
			text: '功能编号',
			flex:1,
			dataIndex: 'functionCode',
			editor: {
				xtype: 'textfield',
			},
			renderer: function(value) { return value; },
			align: 'center'
		}
		,
		{
			text: '功能类型',
			flex:1,
			dataIndex: 'functionType',
			editor: {
				xtype: 'combobox',
				displayField: 'label',
				valueField: 'id',
				queryMode: 'local',
				store: Delicacy.generateOptionStore('functionTypes', true),
			},
			renderer: function(value) { return Delicacy.getLabelByValue('functionTypes', value); },
			align: 'center'
		}
	],

	getValues: function() {
		var me = this;
		var store = me.getStore();
		var data = new Array();
		var names = ['functionId','parentId'];
		Delicacy.getDataFromTreeRoot(store.getRoot(), data, names);
		return data;
	},

});
