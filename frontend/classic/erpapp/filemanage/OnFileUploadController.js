Ext.define('erp.controller.OnFileUploadController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.onFileUploadController',
    reference: 'fileUploadController',
    
    requires: [
		'Delicacy'
	],
	DEFAULT_MAX_FILE_SIZE: 10,
    fileSubmit: function() {
        var form = this.lookupReference('fileForm').getForm();
        var params = {};
    	params.uploader = 394;
    	params.applicationId = 1;
        if (form.isValid()) {
        	if(this.validateFileSize()){
        		Ext.Msg.alert('Error', '文件太大');
        		return;
        	}
            form.submit({
                url: Delicacy._DEFAULT_FILE_SERVER_URL,
                params:params,
                waitMsg: 'Uploading your files...',
                useDefaultXhrHeader:false,
                success: this.fileUploadSuccess,
                failure: this.fileUploadFailure
            });
        }
        
//        fileEl = Ext.getCmp('Filedata').fileInputEl.dom;
//        var fd =new FormData();
//        fd.append('Filedata',fileEl.files[0]);
//        Ext.Ajax.request({
//            url:url,
//            cors:true,
//            useDefaultXhrHeader:false,
//            method:'post',
//            rawData:fd,
//            waitMsg: 'Uploading your photo...',
//            headers: {
//                "Content-Type":''   /* 最重要的部分，将Content-Type设置成null，ExtJs则会由内部的XMLHTTPRequest自动生成包含boundary的Content-Type，否则在使用rawData的情况下，ExtJs会将Content-Type设置成text/plain */
//            },
//            success:function (res,opts) {
//                alert('success');
//            },
//            failure:function (res,opts) {
//                alert('failure');
//            }
//        });

    },
    
    fileCancel: function() {
//        this.lookupReference('fileForm').getForm().reset();
    	Ext.getCmp('uploadWindow').destroy();
    },

    fileUploadSuccess: function(form, action) {
        Ext.Msg.alert('Success', 'Processed file "' + action.result.file + '" on the server');
    	var win = Ext.getCmp('uploadWindow');
    	win.fileUploadCallBack(this.response);
        win.destroy();
    },

    fileUploadFailure: function(form, action) {
        var json = Delicacy.extractResponseData(this.response.responseText, null, false);
        var jsonpp = Delicacy.processResponseData(json);
        console.log(jsonpp);
        if(jsonpp.ResultSet.status >= 0){
        	Ext.Msg.alert('Success', '上传成功');
        	var win = Ext.getCmp('uploadWindow');
        	win.fileUploadCallBack(jsonpp);
            win.destroy();
        }else{
        	Ext.getCmp('uploadWindow').destroy();
        	Ext.Msg.alert("Error", jsonpp.ResultSet.errors);
        }
    },
    
    //验证图片大小
    validateFileSize: function(){
        //取控件DOM对象
        var field = document.getElementById('Filedata');
        //取控件中的input元素
        var inputs = field.getElementsByTagName('input');
        var fileInput = null;
        var il = inputs.length;
        //取出input 类型为file的元素
        for(var i = 0; i < il; i ++){
            if(inputs[i].type == 'file'){
                fileInput = inputs[i];
                break;
            }
        }
        if(fileInput != null){
            var fileSize = this.getFileSize(fileInput);
            //不允许上传超过限定大小的文件，默认最大文件为10MB
            var maxSize = Ext.getCmp('uploadWindow')._FILE_SIZE;
            if(Delicacy.isNullOrEmpty(maxSize)){
            	maxSize = this.DEFAULT_MAX_FILE_SIZE;
            }
            return fileSize > maxSize;
        }
        return false;
    },

    //计算文件大小，返回文件大小值，单位MB
    getFileSize: function (target) {
        var isIE = /msie/i.test(navigator.userAgent) && !window.opera;
        var fs = 0;
        if (isIE && !target.files) {
            var filePath = target.value;
            var fileSystem = new ActiveXObject("Scripting.FileSystemObject");
            var file = fileSystem.GetFile(filePath);
            fs = file.Size;
        } else if (target.files && target.files.length > 0) {
            fs = target.files[0].size;
        } else {
            fs = 0;
        }
        if (fs > 0) {
            fs = fs / 1024 / 1024;
        }
        return fs;
    }
});
