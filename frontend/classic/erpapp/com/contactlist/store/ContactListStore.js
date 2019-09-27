Ext.define('erp.com.contactlist.store.ContactListStore', {
	extend: 'Ext.data.Store',

	alias: 'store.contactlistStore',

	requires: [
		'Delicacy'
	],

	constructor: function() {
		this.callParent(arguments);
	},

	fields: [
		'contactId', 'employeeIdMaintainer', 'entityType', 'contactName', 'telephone', 'mobile', 'email', 'birthday', 'dateLatestActivity', 'dateCreated', 'employeeIdCreated', 'dateUpdated', 'employeeIdUpdated', 'flagLocked', 'flagNoDisturb', 'contactRole', 'departmentId', 'position', 'wechat', 'weibo', 'areaProvince', 'areaCity', 'areaDistrict', 'detailedAddress', 'postcode', 'gender', 'memo'
	],

	autoLoad: true,

	pageSize: 20,

	load: function(options){
		var queryValues = {
			currentPage: this.currentPage,
			pageLines: this.config.pageSize
		};
		var searchform = Delicacy.lookupDockedReference(this.viewComponent,'contactlistsearchreference');
		if(searchform) {
			var searchValues = searchform.getValues();
			searchValues.includeDetail  = true;
			Delicacy.apply(queryValues, searchValues);
		}
		var pxy = this.getProxy();
		pxy.setExtraParam('content', encodeURIComponent(JSON.stringify(queryValues)));
		pxy.setExtraParam('pageoptions', {
			'currentPage': this.currentPage,
			'totalCount': this.totalCount
		});
		this.callParent(arguments);
	},

	proxy: Delicacy.getProxy({
		extraParams: {
			fromExtjs: true,
			action: 'NQ_ContactList',
			subaction: 'find'
			// additional condition or sort info write just like this below
			// addtionalCondition: encodeURIComponent('employee_id <> 0 order by employee_id')
		}
	})
});
