Ext.define('erp.view.querypanel', {
	extend: 'Ext.form.Panel',
	xtype: 'querypanel',
	
	//namespace: 'erpapp',
	
	header: false,
	
	minWidth: 300,
    minHeight: 110,
	
	padding: 0,
	
	reference: 'employeeQueryForm',
	
	controller: 'employeeControl',
	
	onAdded: function(){
		
	},
	
	fieldDefaults: {
		msgTarget: 'side',
		labelAlign: 'top',
		labelWidth: 100,
		labelStyle: 'font-weight:bold'
	},
	
	dockedItems: [{
		xtype: 'toolbar',
		dock: 'right',
		layout: 'vbox',
		items: [{
			
            iconCls: 'x-fa fa-search green'
        },{
			iconCls: 'x-fa fa-plus green'
		}]
	}],
	
	items: [{
		xtype: 'fieldcontainer',
		
		labelStyle: 'font-weight:bold;padding:0;',
		layout: 'hbox',
		defaultType: 'textfield',
		padding: 20,
		
		fieldDefaults: {
			labelAlign: 'top'
		},

		items: [{
			flex: 1,
			name: 'employeeName',
			itemId: 'employeeName',
			afterLabelTextTpl: [
				'<span style="color:red;font-weight:bold" data-qtip="Required">*</span>'
			],
			fieldLabel: '姓名',
			allowBlank: true,
			listeners: {
				change: 'onCompanyChange'
			}
		}, {
			width: 30,
			name: 'gender',
			fieldLabel: 'MI',
			margin: '0 0 0 5',
			listeners: {
				change: 'onCompanyChange'
			}
		}, {
			xtype: 'combobox',
			flex: 2,
			name: 'companyId',
			publishes: 'value',
			fieldLabel: '公司',
			displayField: 'label',
			valueField: 'id',
			afterLabelTextTpl: [
				'<span style="color:red;font-weight:bold" data-qtip="Required">*</span>'
			],
			//store: Delicacy.generateOptionStore('company_records', true),
			queryMode: 'local',
			allowBlank: true,
			margin: '0 0 0 5',
			listeners: {
				'beforerender': function(cmp, opts){
					cmp.setStore(Delicacy.generateOptionStore('company_records', false));
				},
				change: 'onCompanyChange'
			}
		}]
	}]
});