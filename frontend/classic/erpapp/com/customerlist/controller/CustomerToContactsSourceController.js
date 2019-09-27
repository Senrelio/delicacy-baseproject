Ext.define('erp.com.customerlist.controller.CustomerToContactsSourceController', {
	extend: 'Ext.app.ViewController',

	alias: 'controller.customerlistcustomertocontactssourceController',

	onToolAdd: function(){
		// 第一个参数是按钮本身，它的上级控件是toolbar，toolbar上级是Grid
		var grid = arguments[0].ownerCt.ownerCt;
		var win = Ext.create('erp.com.customerlist.view.CustomerToContactsSourceNewWindow', {grid: grid, isNewCreated: true});
		win.loadData();
		win.show();
	},

	rowdblclick: function(grid, record, ele, rowIndex, e, eOpts){
		this.showViewWindow(grid, record);
	},

	showViewWindow: function(grid, record){
		var win = Ext.create('erp.com.customerlist.view.CustomerToContactsSourceViewWindow', {grid: grid});
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
