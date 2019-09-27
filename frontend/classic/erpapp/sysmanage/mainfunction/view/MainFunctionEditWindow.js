Ext.define('erp.sysmanage.mainfunction.view.MainFunctionEditWindow', {
	extend: 'Ext.window.Window',

	xtype: 'mainfunctioneditwindow',

	requires: [
		'erp.sysmanage.mainfunction.controller.MainFunctionEditController',
		'erp.sysmanage.mainfunction.view.MainFunctionUpdatePanel'
	],

	layout: 'card',

	minWidth: 300,

	minHeight: 380,

	scrollable: true,

	resizable: true,

	modal: true,

	controller: 'mainfunctionEditController',

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

	items: [{
			id: 'mainfunction-0',
			xtype: 'mainfunctionupanel'
	}],

	loadData: function (record) {
		this.originalData = record;
		var __mainfunction = Delicacy.lookupReference(this, 'mainfunctionureference');
		__mainfunction.form.loadRecord(record);
	},

	getValues: function() {
		var res = this.originalData.getData();
		res.enabled = false;
		res.leaf = false;
		res.isMobile = false;
		var __mainfunction = Delicacy.lookupReference(this, 'mainfunctionureference');
		Delicacy.apply(res, __mainfunction.getValues());
		return res;
	},

	bbar: ['->',
		{
			xtype: 'button',
			iconCls: 'x-fa fa-check-circle green',
			text: '确认',
			handler: 'windowConfirm'
		},

		{
			xtype: 'button',
			iconCls: 'x-fa fa-times-circle red',
			text: '取消',
			handler: function() { var win = arguments[0].ownerCt.ownerCt; win.destroy(); } 
		}
	]
});
