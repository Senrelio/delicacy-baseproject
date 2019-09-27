Ext.define('erp.com.customerlist.controller.DetailCrmContactsCustomerController', {
	extend: 'Ext.app.ViewController',

	alias: 'controller.detailcustomerlistcrmcontactscustomerController',

	onItemCopy: function(){
		var me = this;
		var panel = me.getView();
		var leftGrid = Delicacy.lookupReference(panel, 'customerlistcustomertocontactssourcereference');
		var rightGrid = Delicacy.lookupReference(panel, 'customerlistcrmcontactscustomerreference');
		if(Delicacy.isNullOrUndefined(leftGrid) || Delicacy.isNullOrUndefined(rightGrid)) return;
		var original = rightGrid.originalData;
		var targetData = Delicacy.getDataFromCollection(rightGrid.store.getData());
		var selectedData = leftGrid.getSelection();
		if(Delicacy.isNullOrEmpty(selectedData)) return;
		for(var i = 0; i < selectedData.length; i++) {
			var d = selectedData[i];
			if(Delicacy.findData(d.getData(), targetData, this.compareFunc)) continue;
			var data = d.getData();
			var newData = {};
			newData['contactsId'] = data['contactId'];
			if(original) {
				var originalData = original.getData();
				newData['customersId'] = originalData['customerId'];
			}
			rightGrid.store.insert(0, newData);
		}
	},

	compareFunc: function(o1, o2) {
		if(o1.contactId == o2.contactsId) return true;
		return false;
	}

});
