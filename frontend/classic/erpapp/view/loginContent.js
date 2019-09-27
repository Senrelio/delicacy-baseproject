Ext.define(
    'erp.view.loginContent',
    {
        extend: 'Ext.Container',
        xtype: 'loginContent',
        bodyStyle: 'background:none;',
        id: 'loginContent',
        requires: [],
//					padding : '55 135 45 135',
        padding: '29 135 36 135',
        // layout: 'center',
        items: [
            {
                xtype: 'panel',
                bodyStyle: 'background:none;',
                layout: 'column',
                width: 353,
                margin: '0 0 22 0',
                height: 'auto',
                items: [
                    // {
                    //     xtype: 'image',
                    //     src: Ext
                    //         .getResourcePath('images/jaIcon.png'),
                    //     // './classic/resources/images/jaIcon.png',
                    //     width: 77,
                    //     height: 36,
                    //     margin: '0 5 0 5'
                    // },
                    {
                        bodyStyle: 'background:none;',
                        html: '<span style= "font-size:19px; height: 36px;  line-height: 36px;text-align:right; margin: [0,8px] ;color:black;font-weight:400; font-family: SourceHanSansSC; ">FIX 重构测试平台</span>'
                    }]
            },
            Ext
                .create(
                    'Ext.tab.Panel',
                    {
                        xtype: 'Ext.tab.Panel',
                        id: 'login',
                        bodyStyle: 'background:none;',
                        width: 353,
                        height: 'auto',
                        minTabWidth: 170,
                        activeTab: 0,
                        plain: true,
                        items: [
                            {
                                title: '账号登录',
                                titleAlign: 'center',
                                focusCls: 'tabFocusCls',
                                xtype: 'form',
                                id: 'accountLoginFormPanel',
                                bodyStyle: 'background:none;',
                                items: [


                                    {
                                        xtype: 'panel',
                                        bodyStyle: 'background:none;',
                                        style: 'margin-top:40px;',
                                        items: [{
                                            xtype: 'textfield',
                                            fieldLabel: '邮箱/电话',
//															             id:'adition3',
                                            labelAlign: 'top',
                                            labelStyle: 'color:#fff;font-size:14px;',
                                            name: 'email',
                                            reference: 'email',
                                            bodyStyle: 'background:none;',
                                            allowBlank: false,
                                            fieldStyle: 'border-radius:4px;width: 348px; height:45px;'
                                        }]
                                    },
//															         显示字符
                                    {
                                        xtype: 'panel',
                                        bodyStyle: 'background:none;',
                                        items: [{
                                            id: 'passwordsShowId',
                                            xtype: 'textfield',
                                            hidden: 'true',
                                            fieldLabel: '密码',
                                            labelAlign: 'top',
                                            labelStyle: 'color:#fff;font-size:14px;',
                                            name: 'passwordsShow',
                                            bodyStyle: 'background:none;',
                                            allowBlank: false,
                                            focusCls: 'focus',
                                            fieldStyle: 'border-radius:4px;width: 348px; height:45px;'
                                        },
                                            {
                                                html: "<img style='width:20px;height:20px;' src='" + Ext.getResourcePath('images/closeEye.png') + "'/>",
                                                bodyStyle: 'background:none;',
                                                style: 'width:20px;height:20px;position:absolute;right:25px;top:43px;cursor:pointer;',
                                                listeners: {
                                                    click: {
                                                        fn: 'showPasswords',
                                                        element: 'el'
                                                    }
                                                }

                                            }
                                        ]
                                    },
//																         密码类型
                                    {
                                        xtype: 'panel',
                                        bodyStyle: 'background:none;',
                                        items: [{
                                            id: 'passwordsHideId',
                                            xtype: 'textfield',
                                            inputType: 'password',
                                            fieldLabel: '密码',
                                            labelAlign: 'top',
                                            labelStyle: 'color:#fff;font-size:14px;',
                                            name: 'passwordsHide',
                                            reference: 'password',
                                            bodyStyle: 'background:none;',
                                            allowBlank: false,
                                            focusCls: 'focus',
                                            fieldStyle: 'border-radius:4px;width: 348px; height:45px;'
                                        },
                                            {
                                                html: "<img style='width:20px;height:20px;' src='" + Ext.getResourcePath('images/eye.png') + "'/>",
                                                bodyStyle: 'background:none;',
                                                style: 'width:20px;height:20px;position:absolute;right:25px;top:43px;cursor:pointer;',
                                                listeners: {
                                                    click: {
                                                        fn: 'showPasswords',
                                                        element: 'el'
                                                    }
                                                }

                                            }
                                        ]
                                    },
                                    // {
                                    //     html: '<div id="verifyFailNote" style="text-align: right; color: red; background-color: transparent;">invalid password or account</div>',
                                    // },
                                    {
                                        xtype: 'panel',
                                        bodyStyle: 'background:none;',
                                        layout: 'column',
                                        style: 'margin-top:15px;',
                                        items: [
                                            {
                                                xtype: 'fieldcontainer',
                                                bodyStyle: 'background:none;',
                                                defaultType: 'checkboxfield',
                                                items: [{
                                                    xtype: 'checkboxfield',
                                                    style: 'margin-left:-25px;',
                                                    labelAlign: 'right',
                                                    labelStyle: 'color:#fff;font-size:14px;',
                                                    name: 'rememberPassStatus',
                                                    itemId: 'rememberPassStatus',
                                                    fieldLabel: '记住密码',
                                                    allowBlank: true
                                                }]
                                            },
                                            {
                                                html: "<span style='color:black;font-size:14px;cursor:pointer;'>忘记密码?</span>",
                                                bodyStyle: 'background:none;',
                                                cls: 'forgetPasswords',
                                                listeners: {
                                                    click: {
                                                        fn: 'forgetPasswordsClick',
                                                        element: 'el'
                                                    }
                                                }
                                            }]
                                    },
                                    {
                                        xtype: 'button',
                                        text: 'login',
                                        handler: 'onLoginCheck',
                                        // html: "<input type='button' class='buttonCls' value='登录' style='margin-top:20px;'/>",
                                        bodyStyle: 'background:none;',
                                        listeners: {
                                            click: {
                                                fn: 'accountloginClick',
                                                element: 'el'
                                            }
                                        }
                                    },
                                    // {
                                    //     xtype: 'panel',
                                    //     layout: 'column',
                                    //     bodyStyle: 'background:none;',
                                    //     height: 'auto',
                                    //     margin: '20 0 20 0',
                                    //     items: [
                                    //         {
                                    //             xtype: 'image',
                                    //             bodyStyle: 'background:none;',
                                    //             src: Ext
                                    //                 .getResourcePath('images/qqIcon.png'),
                                    //             width: 30,
                                    //             height: 30,
                                    //             margin: '0 25 0 75'
                                    //         },
                                    //         {
                                    //             width: 1,
                                    //             height: 20,
                                    //             bodyStyle: 'background:none;',
                                    //             style: {
                                    //                 background: 'rgb(187, 187, 187)',
                                    //                 margin: '5px 0'
                                    //             }
                                    //         },
                                    //         {
                                    //             xtype: 'image',
                                    //             bodyStyle: 'background:none;',
                                    //             src: Ext
                                    //                 .getResourcePath('images/wxIcon.png'),
                                    //             width: 30,
                                    //             height: 30,
                                    //             margin: '0 25 0 25'
                                    //         },
                                    //         {
                                    //             width: 1,
                                    //             height: 20,
                                    //             bodyStyle: 'background:none;',
                                    //             style: {
                                    //                 background: 'rgb(187, 187, 187)',
                                    //                 margin: '5px 0'
                                    //             }
                                    //         },
                                    //         {
                                    //             xtype: 'image',
                                    //             bodyStyle: 'background:none;',
                                    //             src: Ext
                                    //                 .getResourcePath('images/zfbIcon.png'),
                                    //             width: 30,
                                    //             height: 30,
                                    //             margin: '0 25 0 25'
                                    //         }]
                                    // },
                                    {
                                        xtype: 'panel',
                                        bodyStyle: 'background:none;',
                                        layout: 'column',
                                        // style:{textAligh:'center'},
                                        margin: '20 0 0 87',
                                        height: 'auto',
                                        items: [
                                            {
                                                bodyStyle: 'background:none;',
                                                html: "<span style='font-size:14px;color:black;font-weight:400;font-family:SourceHanSansSC;'>还没有账号?</span>"
                                            },
                                            {
                                                bodyStyle: 'background:none;',
                                                html: "<span style='font-size:14px;color:#FF9800;font-weight:400;font-family:SourceHanSansSC;padding-left:7px;cursor:pointer;'>注册新账号</span>",
                                                listeners: {
                                                    click: {
                                                        fn: 'registerNewAccountClick',
                                                        element: 'el'
                                                    }
                                                }
                                            }]
                                    }]

                            },
                            // 验证码登录
                            {
                                title: '验证码登录',
                                xtype: 'form',
                                id: 'VerificationCodeLoginFormPanel',
                                bodyStyle: 'background:none;',
                                items: [
                                    {
                                        xtype: 'panel',
                                        bodyStyle: 'background:none;',
                                        style: 'margin-top:40px;',
                                        items: [{
                                            xtype: 'textfield',
                                            fieldLabel: '手机号码',
                                            labelAlign: 'top',
                                            labelStyle: 'color:#fff;font-size:14px;',
                                            name: 'email',
                                            bodyStyle: 'background:none;',
                                            allowBlank: false,
                                            fieldStyle: 'border-radius:4px;width: 348px; height:45px;'
                                        }]
                                    },
                                    {
                                        xtype: 'panel',
                                        bodyStyle: 'background:none;',
                                        style: 'display:float;',
                                        items: [{
                                            style: 'float:left;;',
                                            xtype: 'textfield',
                                            fieldLabel: '短信验证码',
                                            labelAlign: 'top',
                                            labelStyle: 'color:#fff;font-size:14px;',
                                            name: 'VerificationCode',
                                            bodyStyle: 'background:none;',
                                            allowBlank: false,
                                            fieldStyle: 'border-radius:4px;width: 204px; height:45px;'
                                        }, {
                                            bodyStyle: 'background:none;',
                                            html: "<input type='button' class='buttonCls' value='获取验证码' style='float:left;margin:29px 0 0 55px;height:45px;width:124px;font-size:14px;letter-spacing:0;background-color:#fff;color:#1296DB;cursor:pointer;'/>",
                                            listeners: {
                                                click: {
                                                    fn: 'VerificationCodeClick',
                                                    element: 'el'
                                                }
                                            }
                                        }]
                                    },
                                    {
                                        xtype: 'panel',
                                        bodyStyle: 'background:none;',
                                        layout: 'column',
                                        style: 'margin-top:15px;',
                                        items: [
                                            {
                                                xtype: 'fieldcontainer',
                                                bodyStyle: 'background:none;',
                                                defaultType: 'checkboxfield',
                                                items: [{
                                                    xtype: 'checkboxfield',
                                                    style: 'margin-left:-25px;',
                                                    labelAlign: 'right',
                                                    labelStyle: 'color:#fff;font-size:14px;',
                                                    name: 'rememberPassStatus',
                                                    itemId: 'rememberPassStatus',
                                                    fieldLabel: '记住密码',
                                                    allowBlank: true
                                                }]
                                            },
                                            {
                                                html: "<span style='color:black;font-size:14px;cursor:pointer;'>忘记密码?</span>",
                                                bodyStyle: 'background:none;',
                                                cls: 'forgetPasswords',
                                                listeners: {
                                                    click: {
                                                        fn: 'forgetPasswordsClick',
                                                        element: 'el'
                                                    }
                                                }
                                            }]
                                    },
                                    {
                                        html: "<input type='button' class='buttonCls' value='登录' style='margin-top:20px;cursor:pointer;'/>",
                                        bodyStyle: 'background:none;',
                                        listeners: {
                                            click: {
                                                fn: 'VerificationCodeLoginClick',
                                                element: 'el'
                                            }
                                        }
                                    },
                                    {
                                        xtype: 'panel',
                                        layout: 'column',
                                        height: 'auto',
                                        margin: '20 0 20 0',
                                        bodyStyle: 'background:none;',
                                        items: [
                                            {
                                                xtype: 'image',
                                                src: Ext
                                                    .getResourcePath('images/qqIcon.png'),
                                                bodyStyle: 'background:none;',
                                                width: 30,
                                                height: 30,
                                                margin: '0 25 0 75'
                                            },
                                            {
                                                width: 1,
                                                height: 20,
                                                bodyStyle: 'background:none;',
                                                style: {
                                                    background: 'rgb(255, 255, 255)',
                                                    margin: '5px 0'
                                                }
                                            },
                                            {
                                                xtype: 'image',
                                                bodyStyle: 'background:none;',
                                                src: Ext
                                                    .getResourcePath('images/wxIcon.png'),
                                                width: 30,
                                                height: 30,
                                                margin: '0 25 0 25'
                                            },
                                            {
                                                width: 1,
                                                height: 20,
                                                bodyStyle: 'background:none;',
                                                style: {
                                                    background: 'rgb(255, 255, 255)',
                                                    margin: '5px 0'
                                                }
                                            },
                                            {
                                                xtype: 'image',
                                                bodyStyle: 'background:none;',
                                                src: Ext
                                                    .getResourcePath('images/zfbIcon.png'),
                                                width: 30,
                                                height: 30,
                                                margin: '0 25 0 25'
                                            }]
                                    },
                                    {
                                        xtype: 'panel',
                                        bodyStyle: 'background:none;',
                                        layout: 'column',
                                        // style:{textAligh:'center'},
                                        margin: '20 0 0 87',
                                        height: 'auto',
                                        items: [
                                            {
                                                bodyStyle: 'background:none;',
                                                html: "<span style='font-size:14px;color:black;font-weight:400;font-family:SourceHanSansSC;'>还没有账号?</span>"
                                            },
                                            {
                                                bodyStyle: 'background:none;',
                                                html: "<span style='font-size:14px;color:#FF9800;font-weight:400;font-family:SourceHanSansSC;padding-left:7px;cursor:pointer;'>注册新账号</span>",
                                                listeners: {
                                                    click: {
                                                        fn: 'registerNewAccountClick',
                                                        element: 'el'
                                                    }
                                                }
                                            }]
                                    }]
                            }]
                    })],
        renderTo: Ext.getBody(),
        listeners: {}
    });
