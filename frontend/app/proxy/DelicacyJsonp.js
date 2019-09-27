Ext.define('proxy.DelicacyJsonp', {
    extend: 'Ext.data.proxy.JsonP',
	
	alias: 'proxy.delicacyjsonpproxy',
	
	requires: [
		'Delicacy',
		'StringBuilder'
	],
	
	url: Delicacy._DEFAULT_JSONP_URL,
	reader: {
		type: 'json',
		totalProperty: 'ResultSet.totalResultsAvailable',
		rootProperty: 'ResultSet.Result',
		messageProperty: 'errors',
		transform:{
			fn: function(data){
				var res = Delicacy.processResponseData(data);
				return res;
			},
			scope: this
		}
	},
	extractResponseData: function(response){
		//console.log(this);
		return Delicacy.extractResponseData(response, this.extraParams.pageoptions);
	}
});