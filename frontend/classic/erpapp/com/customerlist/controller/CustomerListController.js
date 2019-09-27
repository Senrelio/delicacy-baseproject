Ext.define('erp.com.customerlist.controller.CustomerListController', {
	extend: 'Ext.app.ViewController',

	alias: 'controller.customerlistController',

	onToolAdd: function(){
		// 第一个参数是按钮本身，它的上级控件是toolbar，toolbar上级是Grid
		var grid = arguments[0].ownerCt.ownerCt;
		var win = Ext.create('erp.com.customerlist.view.CustomerListNewWindow', {grid: grid, isNewCreated: true});
		win.loadData();
		win.show();
	},

	onToolEdit: function(){
		var grid = arguments[0].ownerCt.ownerCt;
		var selected = grid.getSelection();
		if(Delicacy.isNullOrEmpty(selected)) return;
		this.showEditWindow(grid, selected[0]);
	},

	onActionEdit: function (grid, rowIndex, colIndex, item, e, record) {
		this.showEditWindow(grid, record);
	},

	onActionDelete: function (grid, rowIndex, colIndex, item, e, record) {
		this.deleteProcess(grid, this, record.getData());
	},

	onActionAttribute: function (grid, rowIndex, colIndex, item, e, record) {
		this.showViewWindow(grid, record);
	},

	onToolSearch: function(){
		var me = this;
		var grid = arguments[0].ownerCt.ownerCt;
		var searchPanel = Delicacy.lookupDockedReference(grid, 'customerlistsearchreference');
		if(!searchPanel) return;
		if(searchPanel.collapsed) searchPanel.expand();
		else { searchPanel.collapse();  grid.store.reload(); }
	},

	rowdblclick: function(grid, record, ele, rowIndex, e, eOpts){
		this.showViewWindow(grid, record);
	},

	onRightClick: function(grid, record, tr, rowIndex, e, opts){
		var me = this;
		e.stopEvent();
		var menu = Delicacy.generateContextMenu(grid, record, me, me.menuItemEdit, me.menuItemDelete, me.menuItemView, rowIndex);
		menu.showAt(e.pageX, e.pageY);
	},

	menuItemEdit: function(){
		var menuItem = arguments[0];
		var menu = menuItem.parentMenu;
		menu.config.sourceControl.showEditWindow(menu.config.source, menu.config.selectedData);
	},

	menuItemView: function(){
		var menuItem = arguments[0];
		var menu = menuItem.parentMenu;
		menu.config.sourceControl.showViewWindow(menu.config.source, menu.config.selectedData);
	},

	menuItemDelete: function(){
		var menuItem = arguments[0];
		var menu = menuItem.parentMenu;
		var data = menu.config.selectedData.getData();
		var grid = menu.config.source;
		var me = menu.config.sourceControl;
		var rowIndex = menu.config.rowIndex;
		me.deleteProcess(grid, me, data);
	},

	deleteProcess: function(grid, me, data){
		var tipmessage = '确定要删除 '+data.customerCode+'?';
		Ext.Msg.confirm('删除CustomerList', tipmessage, function(opts){
			if(opts === 'yes'){
				var options = {source: grid};
				Delicacy.callOperation('ST_CrmCustomer', 'delete', data, me.deleteCallback, options);
			}
		});
	},

	deleteCallback: function(resp, options){
		if(resp.ResultSet.status === 0){
			var grid = options.source;
			grid.getStore().reload();
		}
	}, 

	showViewWindow: function(grid, record){
		var win = Ext.create('erp.com.customerlist.view.CustomerListViewWindow', {grid: grid});
		win.loadData(record);
		win.show();
	},

	showEditWindow: function(grid, record){
		var win = Ext.create('erp.com.customerlist.view.CustomerListEditWindow', {grid: grid});
		win.loadData(record);
		win.show();
	},

});
