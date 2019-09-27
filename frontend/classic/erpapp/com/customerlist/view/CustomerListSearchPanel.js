Ext.define('erp.com.customerlist.view.CustomerListSearchPanel', {
	extend: 'Ext.form.Panel',
	xtype: 'customerlistsearchpanel',

	reference: 'customerlistsearchreference',

	controller: 'customerlistController',

	header: false,

	height: '100%',

	width: '100%',

	margin: '10 0 0 0',

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
		columnWidth: 0.50
	},

	padding: 10,

	items: [
		{
			padding: 10,
			xtype: 'textfield',
			name: 'customerName',
			itemId: 'customerName',
			fieldLabel: '客户名称',
			allowBlank: true
		}



	]
});
