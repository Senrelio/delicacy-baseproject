Ext.define('erp.view.EmptyPanel', {
	extend : 'Ext.panel.Panel',
	xtype : 'emptyPanel',

	requires: [
		'Ext.layout.container.HBox',
    ],

    profiles: {
        classic: {
            width: 500,
            height: 400,
            titleWidth: 150
        },
        neptune: {
            height: 400,
            width: 500,
            titleWidth: 150
        },
        graphite: {
            height: 500,
            width: 650,
            titleWidth: 220
        }
    },

    width: '100%',
    height: '100%',
    
    bodyPadding:'0 600',

    layout: 'hbox',

    bodyStyle: {
        'vertical-align':'middle',
        'text-align':'center',
    },
    
    items: {
    	xtype:'panel',
    	html: '<div class="my-personalmanage-empty"><div><img src="classic/resources/images/no_date.png"></div><p>暂时木有数据，先看看其他页面吧。</p></div>',
    }
});
