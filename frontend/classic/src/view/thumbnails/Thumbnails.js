Ext.define('erp.view.thumbnails.Thumbnails', {
    extend: 'Ext.view.View',
    xtype: 'thumbnails',
    cls: 'thumbnails',

    reference: 'contentView',
    region: 'center',

    store: 'Thumbnails',

    itemSelector: '.my-thumbnail-item',
    itemCls: 'my-thumbnail-item',
	
	layout: 'dashboard',
	padding: 50,
	
	style:{
		backgroundColor:'#FFF'
	},
	

    itemTpl: [
    	'<div style="border:solid 5px #1296db;border-radius:50%;width:150px;height:150px;text-align:center;line-height:150px;">' +
	       /* '<div style="border:solid 0 #1296db;border-radius:50%;width:160px;height:160px;text-align:center;line-height:160px;margin-top:10px;margin-left:10px;">' +*/
	            '<img src="{icon}" width="85" style="vertical-align:middle"></img>' +
	            '<tpl if="isNew">' +
	                '<div {[this.styles[erp.profileName]]} ' +
	                    'class="x-fa fa-star thumbnail-new" ' +
	                    'data-qtip="Newly added or updated example"></div>' +
	            '<tpl elseif="hasNew">' +
	                '<div {[this.styles[erp.profileName]]} ' +
	                    'class="x-fa fa-star thumbnail-has-new" ' +
	                    'data-qtip="Contains new or updated examples"></div>' +
	            '</tpl>' +
	        /*'</div>' +*/
        '</div>' +
        '<div class="my-thumbnail-text">{text}</div>',
        {
            bkgnd: {
                crisp:           'border-circle',
                material:        'square',
                'crisp-touch':   'circle',
                neptune:         'border-square',
                'neptune-touch': 'square',
                classic:         'rounded-square',
                gray:            'rounded-square',
                triton:          'square'
            },
            styles: {
                // Bring the star close enough to the circle bkgnd to look connected
                crisp:           'style="margin: 8px"',
                'crisp-touch':   'style="margin: 8px"'
            }
        }
    ]
});
