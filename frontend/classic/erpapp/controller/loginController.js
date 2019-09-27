Ext.define('erp.controller.loginController', {
    extend: 'Ext.app.ViewController',

    alias: 'controller.loginController',

    // 密码框睁眼闭眼
    showPasswords: function (e, t) {
        var cmp1 = Ext.getCmp("passwordsShowId");
        var cmp2 = Ext.getCmp("passwordsHideId");
        if (cmp1.hidden) {
            var val = cmp2.getValue();
            cmp1.setValue(val);
            cmp1.show();
            cmp2.hide();
        } else {
            var val = cmp1.getValue();
            cmp2.setValue(val);
            cmp1.hide();
            cmp2.show();
        }

    },

    registerNewAccountClick: function () {
        var logincontainer = Ext.getCmp('logincontainer');
        logincontainer.hide();
        var registerPanel = Ext.getCmp('registercontent');
        registerPanel.show();
    },

    VerificationCodeClick: function () {
        alert('1');
    },

    // 账号登录事件
    accountloginClick: function () {
        // 获取组件方法 var win = arguments[0].ownerCt.ownerCt; 或 var formPanel =
        // Ext.getCmp('accountLoginFormPanel');
        var formPanel = Ext.getCmp('accountLoginFormPanel');
        if (formPanel && formPanel.form) {
            var values = formPanel.form.getValues();
        }
        console.log(values);
        var theConstructor = {pageself:this};
        Delicacy.callOperation('EP_LoginCheck', '', values, this.callbackProcess, theConstructor);
        const params = {
            caller: "noVerify"
        };
        // Delicacy.callOperation('EP_GenerateMainFunctionTree', '', params, this.loadUserFunctions, theConstructor);
    },

    callbackProcess: function (resp, options) {
        debugger;
        if (resp.result === 'true') {
            location.hash = '0';
            window.location.reload();
        } else {
            alert('用户名或密码错误');
            document.querySelectorAll('input').forEach(function (i) {
                i.value = null
            });
        }
    },

    loadUserFunctions: function (resp, options) {
        localStorage.setItem("accessibleFunctions", JSON.stringify(resp));
        location.hash = '0';
        window.location.reload();
    },

    // 验证码登陆
    VerificationCodeLoginClick: function () {
        // 获取组件方法 var win = arguments[0].ownerCt.ownerCt; 或 var formPanel =
        // Ext.getCmp('accountLoginFormPanel');
        var formPanel = Ext.getCmp('VerificationCodeLoginFormPanel');
        if (formPanel && formPanel.form) {
            // 获取表单数据
            var values = formPanel.form.getValues();
        }
        console.log(values);
    },

    //	重置密码
    forgetPasswordsClick: function () {
//		var mainContainer = Ext.getCmp('maincontainer');
        var logincontainer = Ext.getCmp('logincontainer');
        logincontainer.hide();
        var resetPasswordsPanel = Ext.getCmp('resetPasswordId');
        resetPasswordsPanel.show();
    },
    onLoginCheck: function (button, e) {
        var grid = button.ownerCt;
        var email = Delicacy.lookupReference(grid, 'email');
        var password = Delicacy.lookupReference(grid, 'password');
        // debugger;

    },


});
