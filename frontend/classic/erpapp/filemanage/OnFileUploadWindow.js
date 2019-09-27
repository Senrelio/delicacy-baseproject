Ext.define('erp.view.OnFileUploadWindow', {
	extend: 'Ext.window.Window',
	xtype: 'onFileUploadWindow',
	
	requires: [
		'erp.view.OnFileUploadPanel',
		'erp.controller.OnFileUploadController'
	],
	
	controller: 'onFileUploadController',
	
	title: '文件上传',
    id:'uploadWindow',
    width:600,
    height:400,
    autoShow: true, 
    modal: true,
	items: [{
        xtype: 'onFileUploadPanel',
	}],
	
});