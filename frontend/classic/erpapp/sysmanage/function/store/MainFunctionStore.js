Ext.define('erp.function.store.MainFunctionStore', {
	extend: 'Ext.data.TreeStore',

	alias: 'store.mainfunctionStore',

	requires: [
		'Delicacy'
	],

	constructor: function() {
		var me = this, options = { source: this };
		me.callParent(arguments);
		var params = {};
		Delicacy.callOperation('EP_GenerateMainFunctionTree', 'find', params, me.callbackProcess, options);
	},

	callbackProcess: function(resp, options){
		var rootNode = Delicacy.generateTreeDataFromResponse(resp, true);
		console.log(rootNode);
		options.source.setRoot(rootNode);
		//var tree = options.source.ownerTree;
		//if(tree) tree.getView().refresh();
	},

	fields: [
		'functionId', 'functionName', 'parentId', 'functionCode', 'applicationId', 'functionType', 'privilegeType', 'enabled', 'leaf', 'isMobile', 'icon', 'styleName', 'className', 'iconColor', 'marginTop', 'marginBottom', 'executeName', 'remark', 'seqNo'
	],

	autoLoad: false,

	rootVisible: false
});
