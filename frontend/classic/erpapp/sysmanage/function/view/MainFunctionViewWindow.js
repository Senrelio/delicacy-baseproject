Ext.define('erp.function.view.MainFunctionViewWindow', {
	extend: 'Ext.window.Window',

	xtype: 'mainfunctionviewwindow',

	requires: [
		'erp.function.view.MainFunctionViewPanel'
	],

	layout: 'hbox',

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
			xtype: 'panel',
			flex: 1,
			layout: 'vbox',
			items: [
				{
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
