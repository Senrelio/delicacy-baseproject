Ext.define('erp.com.customerlist.controller.CustomerListNewController', {
	extend: 'Ext.app.ViewController',

	alias: 'controller.customerlistNewController',

	windowConfirm: function (btn) {
		var me = this;
		var win = me.getView();
		var data = win.getValues();
		var options = {source: win};
		Delicacy.callOperation('ST_CrmCustomerWithC', 'save', data, me.saveCallback, options);
	},

	saveCallback: function(resp, options){
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
		var i = l.activeItem.id.split('customerlist-')[1];
		var next = parseInt(i, 10) + incr;
		l.setActiveItem(next);
		me.down('#customerlist-prev').setDisabled(next===0);
		me.down('#customerlist-next').setDisabled(next===-1);
	}
});
