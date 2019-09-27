/*
 * This file launches the application by asking Ext JS to create
 * and launch() the Application class.
 */
Ext.application({
    extend: 'erp.Application',

    name: 'erp',

    requires: [
        
    ],

    // The name of the initial view to create.
//    mainView: 'erp.view.loginPanel'
});
