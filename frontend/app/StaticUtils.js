Ext.define('StaticUtils', {

	statics: {
		//必填项的字符
		notAllowBlack:'<font color="red">*</font>',
		
		PARENT_PROCESS_TYPE_1 : 1,//报销类型父级1
	  	PARENT_PROCESS_TYPE_2 : 12,//报销类型父级12
	  	PARENT_PROCESS_TYPE_3 : 32,//报销类型父级32
	  	PARENT_PROCESS_TYPE_4 : 38,//报销类型父级38
	  	
		//定义模块类型**********
		ACTIVITY_TYPE_1 : 1,//我的发起(发起/进行中)
		ACTIVITY_TYPE_2 : 2,//我的驳回(已驳回)
		ACTIVITY_TYPE_3 : 3,//我的归档(已完成)
	  	ACTIVITY_TYPE_4 : 4,//待办-审核
	  	ACTIVITY_TYPE_5 : 5,//待办-知会
	  	ACTIVITY_TYPE_6 : 6,//待办-任务池
	  	ACTIVITY_TYPE_7 : 7,//已办-审核
	  	ACTIVITY_TYPE_8 : 8,//已办-知会
	  	ACTIVITY_TYPE_9 : 9,//已办-任务池
	  	
	  	//定义流程类型
	  	PROCESS_TYPE_FILLCHECK : 15,//打卡申请
	  	PROCESS_TYPE_31 : 31,//物品申请
	  	PROCESS_TYPE_33 : 33,//用车申请
	  	PROCESS_TYPE_34 : 34,//名片申请
	  	PROCESS_TYPE_35 : 35,//刻章申请
	  	PROCESS_TYPE_36 : 36,//采购申请
	  	PROCESS_TYPE_37 : 37,//薪资发放申请
	  	PROCESS_TYPE_40 : 40,//网络权限
	  	
	  	//赋权对象类型
	  	PERMISSION_OBJECT_TYPE_EMP : 1,//人员
	  	PERMISSION_OBJECT_TYPE_ROLE : 2,//角色
	  	PERMISSION_OBJECT_TYPE_DEP_ROLE : 3,//部门角色
	  	
	  	//流程节点类型
	  	NODE_ACTIVITY_TYPE_START : 0,//开始节点
	  	NODE_ACTIVITY_TYPE_END : 1,//结束节点
	  	NODE_ACTIVITY_TYPE_AUDIT : 2,//审核节点
	  	NODE_ACTIVITY_TYPE_HANDEL : 3,//处理节点
	  	NODE_ACTIVITY_TYPE_ATTENTION : 4,//知会节点
	  	
	  	//流程节点审批类型
	  	NODE_AUDIT_TYPE_AUDIT : 1,//审批节点审批
	  	NODE_AUDIT_TYPE_POOLED : 2,//任务池节点审批
	  	
	  	//流程发起、待办、已办类型
	  	WORKFLOW_HANDEL_TYPE_APPLY:0,//发起
	  	WORKFLOW_HANDEL_TYPE_UNDO:1,//待办
	  	WORKFLOW_HANDEL_TYPE_DONE:2,//已办
	  	
	}
	
});