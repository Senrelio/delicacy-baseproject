Ext.define('erp.com.customerlist.store.CustomerToContactsSourceStore', {
	extend: 'Ext.data.ArrayStore',

	alias: 'store.customerlistcustomertocontactssourceStore',

	requires: [
		'Delicacy'
	],

	constructor: function() {
		this.callParent(arguments);
	},

	fields: [
		'contactId', 'employeeIdMaintainer', 'entityType', 'contactName', 'telephone', 'mobile', 'email', 'birthday', 'dateLatestActivity', 'dateCreated', 'employeeIdCreated', 'dateUpdated', 'employeeIdUpdated', 'flagLocked', 'flagNoDisturb', 'contactRole', 'departmentId', 'position', 'wechat', 'weibo', 'areaProvince', 'areaCity', 'areaDistrict', 'detailedAddress', 'postcode', 'gender', 'memo'
	],

	autoLoad: false

});
