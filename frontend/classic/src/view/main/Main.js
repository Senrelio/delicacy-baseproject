Ext.define('erp.view.main.Main', {
    extend: 'Ext.container.Viewport',
    requires:[
		'Ext.button.*',
		'Ext.draw.*',
        'Ext.tab.*',
        'Ext.layout.*'
    ],
    
    id:'mainView',

    controller: 'main',
    viewModel: 'main',

    layout: 'border',
    stateful: true,
    stateId: 'erp-viewport',

    items: [
    	{
        region: 'north',
        xtype: 'appHeader',
        height:50,
    }
    	, {
        region: 'center',
        xtype: 'contentPanel',
        reference: 'contentPanel',
        ariaRole: 'main',
        dockedItems: [{
            xtype: 'navigation-toolbar'
        }]
    }
    ],

    applyState: function(state) {
        this.getController().applyState(state);

    },

    getState: function() {
        return this.getController().getState();
    }
});
