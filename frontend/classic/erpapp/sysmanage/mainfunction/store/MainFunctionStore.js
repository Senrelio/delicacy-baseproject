Ext.define('erp.sysmanage.mainfunction.store.MainFunctionStore', {
    extend: 'Ext.data.TreeStore',

    alias: 'store.mainfunctionStore',

    requires: [
        'Delicacy'
    ],

    constructor: function () {
        var me = this, options = {source: this};
        me.callParent(arguments);
        var params = {
            organizationId: Delicacy.getOrganizationId(),
            caller: 'rightpanel',
        };
        Delicacy.callOperation('EP_GenerateMainFunctionTree', 'find', params, me.callbackProcess, options);
    },

    callbackProcess: function (resp, options) {
        var rootNode = Delicacy.generateTreeDataFromResponse(resp, false);
        options.source.setRoot(rootNode);
    },

    fields: [
        'functionId', 'functionName', 'parentId', 'functionCode', 'applicationId', 'functionType', 'privilegeType', 'enabled', 'leaf', 'isMobile', 'icon', 'styleName', 'className', 'iconColor', 'marginTop', 'marginBottom', 'executeName', 'remark', 'seqNo', 'organizationId'
    ],

    autoLoad: false,

    rootVisible: false
});
