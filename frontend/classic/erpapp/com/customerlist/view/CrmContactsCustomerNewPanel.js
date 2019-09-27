Ext.define('erp.com.customerlist.view.CrmContactsCustomerNewPanel', {
	extend: 'Ext.form.Panel',
	xtype: 'customerlistcrmcontactscustomernpanel',

	reference: 'customerlistcrmcontactscustomernreference',

	header: false,

	height: '100%',

	width: '100%',

	margin: '10 10 10 10',

	onAdd: function(){
	},

	fieldDefaults: {
		msgTarget: 'side',
		labelAlign: 'top',
		labelStyle: 'font-weight:bold'
	},

	layout: 'column',

	defaults: {
		margin: '0 0 0 10',
		columnWidth: 0.5
	},

	items: [
		{
			xtype: 'textfield',
			name: 'contactsId',
			itemId: 'contactsId',
			fieldLabel: '联系人id',
			allowBlank: true
		},
		{
			xtype: 'textfield',
			name: 'customersId',
			itemId: 'customersId',
			fieldLabel: '客户id',
			allowBlank: true
		}
		,


	]
});
