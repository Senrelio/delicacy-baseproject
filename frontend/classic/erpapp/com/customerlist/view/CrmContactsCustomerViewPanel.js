Ext.define('erp.com.customerlist.view.CrmContactsCustomerViewPanel', {
	extend: 'Ext.form.Panel',
	xtype: 'customerlistcrmcontactscustomervpanel',

	reference: 'crmcontactscustomervreference',

	controller: 'customerlistcrmcontactscustomerController',

	header: false,

	height: '100%',

	width: '100%',

	margin: '10 10 10 10',

	onAdd: function(){
	},

	fieldDefaults: {
		msgTarget: 'side',
		labelAlign: 'left',
		labelStyle: 'font-weight:bold'
	},

	layout: 'column',

	defaults: {
		margin: '0 0 0 10',
		columnWidth: 0.25
	},

	items: [
		{
			xtype: 'displayfield',
			name: 'contactsCustomersId',
			itemId: 'contactsCustomersId',
			fieldLabel: ''
		},
		{
			xtype: 'displayfield',
			name: 'contactsId',
			itemId: 'contactsId',
			fieldLabel: '联系人id'
		},
		{
			xtype: 'displayfield',
			name: 'customersId',
			itemId: 'customersId',
			fieldLabel: '客户id'
		}


	]
});
