Ext.define('erp.view.Header', {
    extend: 'Ext.toolbar.Toolbar',
    xtype: 'appHeader',
    id: 'app-header',
    
    style:'background-color:#35baf6;color:#fff;',
    items:[
        {
            xtype:'label',
            bind:{
                text:'test backend system'
            },
            style:'font-size:20px;font-weight:bold;'
        },'->',
        {
            xtype:'label',
            bind:{
                text:'当前用户：',
            },
        },
        {
            xtype:'label',
            margin:'0 10 0 20',
            bind:{
                text:'退出系统',
            },
            listeners: {
            	click:{
            		element:'el',
            		fn:'quitClick'
            	}
            }
        },
    ]
    
//    title: '创意设计企业信息化管理系统',
//    height: 52,
//    layout: {
//        type: 'hbox',
//        align: 'middle'
//    },
//
//    initComponent: function() {
//        document.title = this.title;
//
//        this.items = [];
//		
//		if (!Ext.getCmp('app-header-logo')) {
//			this.items.push({
//                xtype: 'component',
//				id: 'app-header-logo',
//				cls: [ 'ext', 'ext-sencha' ]
//            });
//		}
//		
//		if (!Ext.getCmp('app-header-title')) {
//			this.items.push({
//                xtype: 'component',
//				id: 'app-header-title',
//				html: this.title,
//				flex: 1
//            });
//		}
//
//        if (!Ext.getCmp('options-toolbar')) {
//            this.items.push({
//                xtype: 'profileSwitcher'
//            });
//        }
//
//        this.callParent();
//    }
});
