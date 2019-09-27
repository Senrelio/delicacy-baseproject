Ext.define('erp.com.contactlist.controller.ContactListEditController', {
	extend: 'Ext.app.ViewController',

	alias: 'controller.contactlistEditController',

	windowConfirm: function (btn) {
		var me = this;
		var win = me.getView();
		var data = win.getValues();
		var options = {source: win};
		Delicacy.callOperation('ST_CrmContactWithC', 'update', data, me.updateCallback, options);
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
		var i = l.activeItem.id.split('contactlist-')[1];
		var next = parseInt(i, 10) + incr;
		l.setActiveItem(next);
		me.down('#contactlist-prev').setDisabled(next===0);
		me.down('#contactlist-next').setDisabled(next===-1);
	}
});
