Ext.define('erp.sysmanage.mainfunction.store.PermissionMainFunctionStore', {
	extend: 'Ext.data.TreeStore',

	alias: 'store.permissionmainfunctionStore',

	requires: [
		'Delicacy'
	],

	constructor: function(lastOptions) {
		var me = this, options = { source: this };
		me.callParent(arguments);
		var params = {};
		if(lastOptions){
			if(lastOptions.params){
				params = lastOptions.params;
			}
		}
		Ext.apply(params,{
			'organizationId':Delicacy.getOrganizationId(),
			'optType':'onLoadFunctionList'
		});
		Delicacy.callOperation('EP_MainFunctionProcess', 'find', params, me.callbackProcess, options);
	},

	callbackProcess: function(resp, options){
		var rootNode = Delicacy.generateTreeDataFromResponse(resp, true);
		options.source.setRoot(rootNode);
	},

	fields: [
		'functionId', 'functionName', 'parentId', 'functionCode', 'applicationId', 'functionType', 'privilegeType', 'enabled', 'leaf', 'isMobile', 'icon', 'styleName', 'className', 'iconColor', 'marginTop', 'marginBottom', 'executeName', 'remark', 'seqNo', 'organizationId'
	],

	autoLoad: false,

	rootVisible: false
});
