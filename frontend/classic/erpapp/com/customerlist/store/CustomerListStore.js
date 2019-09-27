Ext.define('erp.com.customerlist.store.CustomerListStore', {
	extend: 'Ext.data.Store',

	alias: 'store.customerlistStore',

	requires: [
		'Delicacy'
	],

	constructor: function() {
		this.callParent(arguments);
	},

	fields: [
		'customerId', 'customerCode', 'leadId', 'entityType', 'employeeIdMaintainer', 'customerName', 'level', 'parentCustomerId', 'industryId', 'areaProvince', 'areaCity', 'areaDistrict', 'dateLatestActivity', 'employeeIdLatestFollowup', 'dateCreated', 'employeeIdCreated', 'dateUpdated', 'employeeIdUpdated', 'departmentId', 'flagLocked', 'flagIndustrialCommercialRegistered', 'flagNoDisturb', 'dateLatestVisit', 'daycountNotVisited', 'detailedAddress', 'postcode', 'telephone', 'fax', 'companyWebsiteLink', 'weibo', 'numberEmployees', 'annualRevenue', 'memo'
	],

	autoLoad: true,

	pageSize: 20,

	load: function(options){
		var queryValues = {
			currentPage: this.currentPage,
			pageLines: this.config.pageSize
		};
		var searchform = Delicacy.lookupDockedReference(this.viewComponent,'customerlistsearchreference');
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
			action: 'NQ_CustomerList',
			subaction: 'find'
			// additional condition or sort info write just like this below
			// addtionalCondition: encodeURIComponent('employee_id <> 0 order by employee_id')
		}
	})
});
