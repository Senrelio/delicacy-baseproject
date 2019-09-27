Ext.define('erp.com.contactlist.store.CrmContactsCustomerStore', {
	extend: 'Ext.data.ArrayStore',

	alias: 'store.contactlistcrmcontactscustomerStore',

	requires: [
		'Delicacy'
	],

	constructor: function() {
		this.callParent(arguments);
	},

	fields: [
		'contactsCustomersId', 'contactsId', 'customersId'
	],

	autoLoad: false

});
