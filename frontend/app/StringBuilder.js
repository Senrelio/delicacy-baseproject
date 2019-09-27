Ext.define('StringBuilder', {
	strings: new Array(''),
	
	constructor: function(val) {
		this.strings = new Array('');
		if (val)
		{
			this.strings.push(val);
		}
	},
	
	append: function(val){
		if (val)
		{
			this.strings.push(val);
		}
	},
	
	clear: function ()
	{
		this.strings.length = 1;
	},
	
	toString: function(){
		return this.strings.join("");
	}
});