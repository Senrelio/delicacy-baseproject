Ext.define('erp.com.contactlist.controller.CrmContactsCustomerController', {
	extend: 'Ext.app.ViewController',

	alias: 'controller.contactlistcrmcontactscustomerController',

	rowdblclick: function(grid, record, ele, rowIndex, e, eOpts){
		this.showViewWindow(grid, record);
	},

	showViewWindow: function(grid, record){
		var win = Ext.create('erp.com.contactlist.view.CrmContactsCustomerViewWindow', {grid: grid});
		win.loadData(record);
		win.show();
	},

	onActionDelete: function (grid, rowIndex, colIndex, item, e, record) {
		grid.store.removeAt(rowIndex);
	},

	closeRowDetail: function(cmp){
		var ownerGrid = cmp.ownerCt.ownerCt;
		var pi = ownerGrid.measurer;
		pi.toggleRow(ownerGrid.selectedRowIndex, ownerGrid.selectedRecord);
	}
});
