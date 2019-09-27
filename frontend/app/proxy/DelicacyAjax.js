Ext.define('proxy.DelicacyAjax', {
    extend: 'Ext.data.proxy.Ajax',
	
	alias: 'proxy.delicacyajaxproxy',
	
	requires: [
		'Delicacy',
		'StringBuilder'
	],
	
	constructor : function(){
		this.callParent(arguments);
		this.on('beginprocessresponse', this.beginProcessResponse);
	},
	
	beginProcessResponse: function(source, response, operation){
		var pageoptions = response.request.params.pageoptions ? response.request.params.pageoptions
				: response.request.params.options;
		if(!pageoptions) return;
		var needProcess = response.responseJson && 
			response.responseJson.ResultSet && 
			response.responseJson.ResultSet.totalResultsAvailable === 0 &&
			pageoptions.totalCount;
		if(needProcess){
			response.responseJson.ResultSet.totalResultsAvailable = pageoptions.totalCount;
		}
	},
	
	url: Delicacy._DEFAULT_SERVER_URL,
	
	actionMethods: {
		read: 'POST'
	},
	
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
		return Delicacy.extractResponseData(response, this.extraParams.pageoptions);
	}
	
});