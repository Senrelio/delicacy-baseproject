Ext.define('erp.Application', {
    extend: 'Ext.app.Application',
    namespace: 'erp',

    requires: [

        'StringBuilder',
        'Delicacy',
        'StaticUtils',
        'ERPPermissionStatic',
        'Ext.app.*',
        'Ext.grid.*',
        'Ext.form.*',
        'Ext.tree.*',
        'Ext.d3.*',
        'Ext.exporter.*',
        'Ext.calendar.*',
        'Ext.ux.*',
        'proxy.DelicacyAjax',
        'proxy.DelicacyJsonp',
        'proxy.DelicacyTreeAjax',
        'proxy.DelicacyTreeJsonp',
        'erp.ValidateUtils',
        'erp.store.Thumbnails',
        'erp.view.thumbnails.Thumbnails',
        'erp.controller.Global',
        'erp.store.Navigation',
        'erp.view.CodeContent',
        'erp.view.CodePreview',
        'erp.view.ContentPanel',
        'erp.view.Header',
        'erp.view.ProfileSwitcher',
        'erp.view.main.Main',
        'erp.view.main.MainController',
        'erp.view.main.MainModel',
        'erp.view.navigation.Breadcrumb',
        'erp.view.navigation.Tree',
        'TreePicker',
        'erp.controller.WorkflowProcessor',
        'erp.controller.WorkflowController',
        'erp.view.loginPanel'
    ],
    
    controllers: [
        'Global'
    ],

    init: function() {
        var me = this;
        var host = window.location.hostname;
        if (host === '127.0.0.1' || host.startsWith('localhost')) {
            Delicacy._ENV_DEVELOPMENT = true;
        } else {
            Delicacy._ENV_DEVELOPMENT = false;
        }
        if (host === '192.168.2.30') Delicacy._ENV_DEVELOPMENT = false;
        if (host.startsWith('192.168')) {
            Delicacy._DEFAULT_JSONP_URL = 'http://127.0.0.1:9080/DelicacyServlet';
        } else {
            Delicacy._DEFAULT_JSONP_URL = 'http://127.0.0.1:9080/DelicacyServlet';
        }
        Delicacy.domainValueInit();
        Delicacy.loadDropdownBackend();
        if ('nocss3' in Ext.Object.fromQueryString(location.search)) {
            Ext.supports.CSS3BorderRadius = false;
            Ext.getBody().addCls('x-nbr x-nlg');
        }

        Ext.create('erp.store.Navigation', {
            storeId: 'navigation',
            viewref: me
        });

        // Set the default route to start the application.
        this.setDefaultToken('-1');

        Ext.setGlyphFontFamily('Pictos');
        Ext.tip.QuickTipManager.init();

        if (!Ext.platformTags.test) {
            Ext.state.Manager.setProvider(Ext.create('Ext.state.CookieProvider'));
        }
    },

    launch: function() {
        //Delicacy.domainValueInit();
    	var hash = location.hash.toString();
    	if(hash){//如果hash值不为空，将页面设置成网站内容界面，如果为空则设置成登录界面
    		var arr = hash.split('#');
    		if(arr.length < 2 || arr[1] === '-1'){
    			this.setMainView('erp.view.loginPanel');
    		}else{
    			this.setMainView('erp.view.main.Main');
    		}
        }else {
            this.setMainView('erp.view.loginPanel');
        }
//        var view = 'erp.view.loginPanel';
//    	var view = this.viewPanel;
//        if (/[?&]solo\b/.test(location.search)) {
//            view = 'erp.view.main.Solo'
//        }else if(/[?&]solo\b/.test(location.search)){
//        	view = 'erp.view.loginPanel'
//        }
//    	this.setMainView(view);
//        this.setMainView({
//            xclass: view
//        });

    }
}, function() {
    erp.toast = function(title) {
        var html = Ext.String.format.apply(String, Array.prototype.slice.call(arguments, 1));

        if (!html) {
            html = title;
            title = null;
        }

        new Ext.window.Toast({
            title: title,
            html: html,
            width: 400,
            align: 't'
        }).show();
    };
});