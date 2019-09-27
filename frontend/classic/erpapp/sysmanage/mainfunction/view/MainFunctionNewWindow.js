Ext.define('erp.sysmanage.mainfunction.view.MainFunctionNewWindow', {
	extend: 'Ext.window.Window',

	xtype: 'mainfunctionnewwindow',

	requires: [
		'erp.sysmanage.mainfunction.controller.MainFunctionNewController',
		'erp.sysmanage.mainfunction.view.MainFunctionNewPanel'
	],

	layout: 'card',

	minWidth: 300,

	minHeight: 380,

	scrollable: true,

	resizable: true,

	modal: true,

	controller: 'mainfunctionNewController',

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
			xtype: 'mainfunctionnpanel'
	}],

	loadData: function (record) {
		this.originalData = record;
		if(record) {
			var __mainfunction = Delicacy.lookupReference(this, 'mainfunctionnreference');
			__mainfunction.form.loadRecord(record);
		} 
	},

	getValues: function() {
		var res = this.originalData;
		if(!res) res = {}; else res = res.getData();
		res.enabled = false;
		res.leaf = false;
		res.isMobile = false;
		var __mainfunction = Delicacy.lookupReference(this, 'mainfunctionnreference');
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
