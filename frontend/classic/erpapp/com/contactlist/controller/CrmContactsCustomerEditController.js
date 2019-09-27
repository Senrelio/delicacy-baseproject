Ext.define('erp.com.contactlist.controller.CrmContactsCustomerEditController', {
	extend: 'Ext.app.ViewController',

	alias: 'controller.contactlistcrmcontactscustomerEditController',

	windowConfirm: function (btn) {
		var me = this;
		var win = me.getView();
		var data = win.getValues();
		var grid = win.config.grid;
		var originalData = win.originalData;
		originalData.set(data);
		win.destroy();
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
		var i = l.activeItem.id.split('crmcontactscustomer-')[1];
		var next = parseInt(i, 10) + incr;
		l.setActiveItem(next);
		me.down('#crmcontactscustomer-prev').setDisabled(next===0);
		me.down('#crmcontactscustomer-next').setDisabled(next===-1);
	}
});
