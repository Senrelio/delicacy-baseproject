Ext.define('erp.sysmanage.mainfunction.controller.MainFunctionController', {
	extend: 'Ext.app.ViewController',

	alias: 'controller.mainfunctionController',

	onToolAdd: function(button){
		var treePanel = button.ownerCt.ownerCt;
		var target = treePanel.getRootNode();
		var node = {
			leaf: true,
			functionName: '新建',
			parentId: 0,
			__newCreatedRecord: true
		};
		node = target.appendChild(node);
		treePanel.findPlugin('rowediting').startEdit(node, 0);
	},

	onActionDelete: function (grid, rowIndex, colIndex, item, e, record) {
		grid.selectedRecord = record;
		grid.selectedIndex = rowIndex;
		this.deleteProcess(grid, this, record);
	},

	onRightClick: function(grid, record, tr, rowIndex, e, opts){
		var me = this;
		e.stopEvent();
		var menu = Delicacy.generateContextAddMenu(grid, record, me, me.menuItemNew, rowIndex, '新建子项');
		menu.showAt(e.pageX, e.pageY);
	},

	menuItemNew: function(){
		var menuItem = arguments[0];
		var menu = menuItem.parentMenu;
		var treePanel = menu.source.ownerCt;
		var target = treePanel.selModel.getSelection()[0] || treePanel.getRootNode();
		var parentData = target.getData();
		var node = {
			leaf: true,
			functionName: '新建',
			parentId: 0,
			__newCreatedRecord: true
		};
		var parentData = target.getData();
		node = target.appendChild(node);
		if (!target.isExpanded()) target.expand(false);
		treePanel.findPlugin('rowediting').startEdit(node, 0);
	},

	deleteProcess: function(grid, me, record){
		var data = record.getData();
		var tipmessage = '确定要删除 '+data.functionName+'?';
		Ext.Msg.confirm('删除菜单功能表', tipmessage, function(opts){
			if(opts === 'yes'){
				var options = {source: grid, record: record};
				Delicacy.callOperation('ST_MainFunction', 'delete', data, me.deleteCallback, options);
			}
		});
	},

	deleteCallback: function(resp, options){
		if(resp.ResultSet.status === 0){
			var grid = options.source;
				var record = grid.selectedRecord;
				var parentNode = record.parentNode;
				parentNode.removeChild(record);
		}
	}

});
