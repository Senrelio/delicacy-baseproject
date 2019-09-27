Ext.define('erp.com.customerlist.controller.CrmContactsCustomerController', {
	extend: 'Ext.app.ViewController',

	alias: 'controller.customerlistcrmcontactscustomerController',

	rowdblclick: function(grid, record, ele, rowIndex, e, eOpts){
		this.showViewWindow(grid, record);
	},

	showViewWindow: function(grid, record){
		var win = Ext.create('erp.com.customerlist.view.CrmContactsCustomerViewWindow', {grid: grid});
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
