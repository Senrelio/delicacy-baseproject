Ext.define('proxy.DelicacyTreeAjax', {
    extend: 'proxy.DelicacyAjax',
	
	alias: 'proxy.delicacytreeajaxproxy',
	
	url: Delicacy._DEFAULT_SERVER_URL,
	
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
				return res;
			},
			scope: this
		}
	}
});