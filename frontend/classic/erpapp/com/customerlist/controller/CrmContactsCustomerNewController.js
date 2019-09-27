Ext.define('erp.com.customerlist.controller.CrmContactsCustomerNewController', {
	extend: 'Ext.app.ViewController',

	alias: 'controller.customerlistcrmcontactscustomerNewController',

	windowConfirm: function (btn) {
		var me = this;
		var win = me.getView();
		var data = win.getValues();
		var grid = win.config.grid;
		grid.store.insert(0, data);
		win.destroy();
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
		var i = l.activeItem.id.split('crmcontactscustomer-')[1];
		var next = parseInt(i, 10) + incr;
		l.setActiveItem(next);
		me.down('#crmcontactscustomer-prev').setDisabled(next===0);
		me.down('#crmcontactscustomer-next').setDisabled(next===-1);
	}
});
