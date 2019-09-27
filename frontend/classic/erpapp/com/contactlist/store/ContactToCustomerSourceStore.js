Ext.define('erp.com.contactlist.store.ContactToCustomerSourceStore', {
	extend: 'Ext.data.ArrayStore',

	alias: 'store.contactlistcontacttocustomersourceStore',

	requires: [
		'Delicacy'
	],

	constructor: function() {
		this.callParent(arguments);
	},

	fields: [
		'customerId', 'customerCode', 'leadId', 'entityType', 'employeeIdMaintainer', 'customerName', 'level', 'parentCustomerId', 'industryId', 'areaProvince', 'areaCity', 'areaDistrict', 'dateLatestActivity', 'employeeIdLatestFollowup', 'dateCreated', 'employeeIdCreated', 'dateUpdated', 'employeeIdUpdated', 'departmentId', 'flagLocked', 'flagIndustrialCommercialRegistered', 'flagNoDisturb', 'dateLatestVisit', 'daycountNotVisited', 'detailedAddress', 'postcode', 'telephone', 'fax', 'companyWebsiteLink', 'weibo', 'numberEmployees', 'annualRevenue', 'memo'
	],

	autoLoad: false

});
