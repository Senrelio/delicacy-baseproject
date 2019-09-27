Ext.define('erp.controller.WorkflowController', {
	extend: 'Ext.app.ViewController',

	alias: 'controller.workflowController',
	
	//打印
	onPrint: function(){
		var me = this.getView();
		var __executeName = me.__processExecuteName;
        if (Delicacy.isNullOrEmpty(__executeName)) {
        	Ext.MessageBox.alert('提示','没有找到相应的流程处理程序');
        	me.destroy();
            return;
        }
		var pageDirectory = Delicacy.getLabelByValue('workFlowPages',__executeName);
		if(Delicacy.isNullOrEmpty(pageDirectory)){
			Ext.MessageBox.alert('提示','没有找到相应的流程页面');
			me.destroy();
            return;
		}
		var workflowProcessor = Ext.create(pageDirectory);
		var panel = workflowProcessor.getPrintProcessor();
		if(Delicacy.isNullOrEmpty(panel)){
			Ext.MessageBox.alert('提示','没有找到相应的流程页面');
			me.destroy();
            return;
		}
		var html = panel.html;
		if(!Delicacy.isNullOrEmpty(html)){
			Delicacy.print(html);
		}
	},
	
	//查看流程进度
	onProgress: function(){
		var me = this.getView();
		var record = me.__record;
		var win = Ext.create('erp.workflowmange.workflow.view.ScheduleWindow', {processInstanceId: record.processInstanceId});
		win.show();
	},
	
	//流程转交
	onReassign: function(){
		var me = this.getView();
		var employeeId = me.down('#employeeId').getValue();
		if(Delicacy.isNullOrEmpty(employeeId)){
			Ext.MessageBox.alert('提示','请选择转交接收人!');
			return;
		};
		Ext.MessageBox.confirm('提示', '你确认转交审批任务吗？',function(value){
			if(value == 'yes'){
				this.onSubmit(3);
			}
		});
	},
	
	//流程驳回
	onReject: function(){
		Ext.MessageBox.confirm('提示', '你确认驳回该申请吗？',function(value){
			if(value == 'yes'){
				this.onSubmit(1);
			}
		});
	},
	
	//流程回退到上一个节点
	onBackToPrevNode: function(){
		Ext.MessageBox.confirm('提示', '你确认回退该申请到上一个节点吗？',function(value){
			if(value == 'yes'){
				this.onSubmit(2);
			}
		});
	},
	
	//流程回退到发起人
	onBackToApply: function(){
		Ext.MessageBox.confirm('提示', '你确定要回退给申请人吗？',function(value){
			if(value == 'yes'){
				this.onSubmit(4);
			}
		});
	},


	//流程审批同意
	onAgree: function(){
		this.onSubmit(0);
	},
	
	//approvalment审批类型【0:通过; 1:驳回; 2:回退; 3:转交; 4:回退给发起人】
	onSubmit:function(approvalment){
		var me = this.getView();
		var __activityType = me.__activityType;
		var boo = true;
		var userData = null;
		var record = me.__record;
		if(__activityType == StaticUtils.NODE_ACTIVITY_TYPE_AUDIT){
			userData = record;
		}else{
			boo = me.checkData();
			userData = me.getValues();
		}
		if(!boo){
			return;
		}
		if(Delicacy.isNullOrEmpty(userData)){
			return;
		}
		var params = {};
		params.approvalment = approvalment;
		params.userData = userData;
		var processInformation = {};
		processInformation.processId = me.__processId;
		params.processDefinition = processInformation;
		var employeeId = me.down('#employeeId').getValue();
		if(!Delicacy.isNullOrEmpty(employeeId)){
			params.additionalApprovalment = employeeId;
		}
		var processComment = me.down('#approvalComment').getValue();
		if(approvalment == 0 && Delicacy.isNullOrEmpty(processComment)){
			Ext.MessageBox.alert('提示','请填写审核意见');
		}
		var typeFlag = record.typeFlag;
		if(Delicacy.isNullOrEmpty(typeFlag) || typeFlag === 0){
			return;
		}
		Ext.apply(params,record);
		var operateHandel;
		if(typeFlag === StaticUtils.NODE_AUDIT_TYPE_AUDIT){
			operateHandel = 'EP_WorkFlowActivityProcessor';
		}else if(typeFlag === StaticUtils.NODE_AUDIT_TYPE_POOLED){
			operateHandel = 'EP_WorkFlowPooledTaskProcessor';
		}
		if(Delicacy.isNullOrEmpty(operateHandel)){
			return;
		}
		me.down('#win-agree').setDisabled(true);
		Delicacy.callOperation(operateHandel,'update',params,this.auditCallBack,me);
	},
	
	auditCallBack: function(resp,me){
		me.down('#win-agree').setDisabled(false);
		var status = Delicacy.getResponseStatus(resp);
		if(status >= 0){
			Ext.Msg.alert('提示','审批成功');
			me.destroy();
			var grid = me.__businessGrid;
			var storeInstance = grid.getStore();
			var params = {
				processType:me.__processType,
				parentProcessTypeId:me.__parentProcessTypeId,
				handelType:me.__handelType
			};
			storeInstance.load(params)
		}else{
			var errorMsg = Delicacy.getResponseErrorMsg(resp);
			Ext.Msg.alert('提示',errorMsg);
		}
	},

	//流程发起保存
	newWindowConfirm: function(){
		var me = this.getView();
		var boo = me.checkData();
		if(!boo){
			return;
		}
		var userData = me.getValues();
		if(Delicacy.isNullOrEmpty(userData)){
			return;
		}
		var params = {};
		params.userData = userData;
		var processInformation = {};
		processInformation.processId = me.__processId;
		params.processDefinition = processInformation;
		var approval = me.down('#approval').getValue();
		if(!Delicacy.isNullOrEmpty(approval)){
			params.approval = approval;
		}
		me.down('#newWin-submit').setDisabled(true);
		Delicacy.callOperation('EP_NewCreateWorkFlow','save',params,this.newWindowConfirmCallBack,me);
	},
	
	newWindowConfirmCallBack: function(resp,me){
		me.down('#newWin-submit').setDisabled(false);
		var status = Delicacy.getResponseStatus(resp);
		if(status >= 0){
			Ext.Msg.alert('提示','申请成功');
			me.destroy();
		}else{
			var errorMsg = Delicacy.getResponseErrorMsg(resp);
			Ext.Msg.alert('提示',errorMsg);
		}
	},
	
	//页面下一步
	winNext: function(){
		var me = this.getView();
		var panel = me.childPanel;
		var pageCount = panel.getPageCount();
		panel.next();
		var currentPage = panel.currentPage+1;
		me.down('#win-prev').setDisabled(currentPage===1);
		me.down('#win-next').setDisabled(currentPage===pageCount);
	},
	
	//页面上一步
	winPrevious: function(){
		var me = this.getView();
		var panel = me.childPanel;
		var pageCount = panel.getPageCount();
		panel.previous();
		var currentPage = panel.currentPage+1;
		me.down('#win-prev').setDisabled(currentPage===1);
		me.down('#win-next').setDisabled(currentPage===pageCount);
	},
	
});
