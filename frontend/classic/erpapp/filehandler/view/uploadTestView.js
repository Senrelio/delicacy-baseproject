Ext.define('erp.uploadtest.view.uploadTestView', {
    extend: 'Ext.Panel',
    controller: 'uploadTestController',
    items: [{
        xtype: 'box',
        padding: '50',
        autoEl: {
            tag: 'input',
            type: 'file',
            name: 'files',
            multiple: true
        }
    },{
        xtype: 'button',
        text: 'upload',
        listeners: {
            click: 'upload'
        }
    }]
})