Ext.define('erp.sysmanage.mainfunction.controller.MainFunctionEditController', {
	extend: 'Ext.app.ViewController',

	alias: 'controller.mainfunctionEditController',

	windowConfirm: function (btn) {
		var me = this;
		var win = me.getView();
		var data = win.getValues();
		if(data.children) delete data.children;
		var options = {source: win};
		Delicacy.callOperation('ST_MainFunction', 'update', data, me.updateCallback, options);
	},

	updateCallback: function(resp, options){
		if(resp.ResultSet.status === 0){
			var grid = options.source.config.grid;
			options.source.destroy();
			grid.getStore().reload();
		}
	},

	showNext: function () {
		this.doCardNavigation(1);
	},

	showPrevious: function (btn) {
		this.doCardNavigation(-1);
	},

	doCardNavigation: function (incr) {
		var me = this.getView();
		var l = me.getLayout();
		var i = l.activeItem.id.split('mainfunction-')[1];
		var next = parseInt(i, 10) + incr;
		l.setActiveItem(next);
		me.down('#mainfunction-prev').setDisabled(next===0);
		me.down('#mainfunction-next').setDisabled(next===0);
	}
});
