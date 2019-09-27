Ext.define('erp.com.customerlist.store.CrmContactsCustomerStore', {
	extend: 'Ext.data.ArrayStore',

	alias: 'store.customerlistcrmcontactscustomerStore',

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
