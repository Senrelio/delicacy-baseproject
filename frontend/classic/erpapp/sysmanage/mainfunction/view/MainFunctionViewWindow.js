Ext.define('erp.sysmanage.mainfunction.view.MainFunctionViewWindow', {
	extend: 'Ext.window.Window',

	xtype: 'mainfunctionviewwindow',

	requires: [
		'Ext.tab.Panel',
		'erp.sysmanage.mainfunction.view.MainFunctionViewPanel'
	],

	minWidth: 300,

	minHeight: 380,

	scrollable: true,

	resizable: true,

	modal: true,

	profiles: {
		classic: {
			height: 500
		}, 
		neptune: {
			height: 500
		}, 
		graphite: {
			height: 600
		} 
	},

	width: 600,

	height: 600,

	listeners: {
		close: function(source){ source.destroy(); }
	},

	items: [
		{
			xtype: 'tabpanel',
			items: [
				{
					title: '菜单功能表',
					xtype: 'mainfunctionvpanel'
				}
			]
		}
	],

	loadData: function (record) {
		var __mainfunction = Delicacy.lookupReference(this, 'mainfunctionvreference');
		__mainfunction.form.loadRecord(record);
	},

	bbar: ['->',
		{
			xtype: 'button',
			iconCls: 'x-fa fa-times-circle red',
			text: '关闭',
			handler: function() { var win = arguments[0].ownerCt.ownerCt; win.destroy(); } 
		}
	]
});
