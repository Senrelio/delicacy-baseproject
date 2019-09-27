Ext.define('proxy.DelicacyTreeJsonp', {
    extend: 'Ext.data.proxy.JsonP',
	
	alias: 'proxy.delicacytreejsonpproxy',
	
	url: Delicacy._DEFAULT_JSONP_URL,
	
	api: {
		'read': Delicacy._DEFAULT_JSONP_URL
	},
	
	extractResponseData: function(response){
		return Delicacy.extractResponseData(response);
	},
	
	reader: {
		type: 'json',
		totalProperty: 'ResultSet.totalResultsAvailable',
		rootProperty: 'ResultSet.Result',
		messageProperty: 'errors',
		transform:{
			fn: function(data){
				var arr = Delicacy.processResponseData(data);
				var res = {
					text: '.',
					children: arr
				};
				console.log(res);
				return res;
			},
			scope: this
		}
	}
});