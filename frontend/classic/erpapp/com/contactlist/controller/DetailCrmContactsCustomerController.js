Ext.define('erp.com.contactlist.controller.DetailCrmContactsCustomerController', {
	extend: 'Ext.app.ViewController',

	alias: 'controller.detailcontactlistcrmcontactscustomerController',

	onItemCopy: function(){
		var me = this;
		var panel = me.getView();
		var leftGrid = Delicacy.lookupReference(panel, 'contactlistcontacttocustomersourcereference');
		var rightGrid = Delicacy.lookupReference(panel, 'contactlistcrmcontactscustomerreference');
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
			newData['customersId'] = data['customerId'];
			if(original) {
				var originalData = original.getData();
				newData['contactsId'] = originalData['contactId'];
			}
			rightGrid.store.insert(0, newData);
		}
	},

	compareFunc: function(o1, o2) {
		if(o1.customerId == o2.customersId) return true;
		return false;
	}

});
