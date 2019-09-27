/**
 * This view is an example list of people.
 */
Ext.define(
				'erp.view.resetPasswordsPanel',
				{
					extend : 'Ext.panel.Panel',
					xtype : 'resetPasswordsPanel',
					id:'resetPasswordId',
					bodyStyle : 'overflow: auto;',
					controller : 'resetPasswordsController',
					// namespace: 'erpapp',
					requires : [ 'erp.controller.resetPasswordsController' ],

					shadow : 'drop',

					shadowOffset : 5,

					header : false,

					selType : 'checkboxmodel',

					constructor : function() {

						this.callParent(arguments);

					},

					width : '100%',
					height : '100%',

					layout : 'center',
					items : [ {
						xtype : 'form', // 引入模板
						id : 'resetPasswordsId',
						width : 1000,
						minHeight : 850,
						items : [
							{
								html:"<p style='cursor:pointer;color#c2c2c2;'>back</p>",
								listeners:{
									click:{fn:'backToLoginClick',
										element:'el'}
								}
								
							},
								{
//									光文本，建议 html:'<span style="">密码</span>' 而html:'密码',style:''这种写法 style height经常不起作用
									html:"<p style='height:20px;margin-top:95px;text-align:center;color:rgba(255, 152, 0, 1);letter-spacing:3px;font-size:20px;font-weight:600;position:relative;'>重置登录密码</p>"
								},
				
								{
									html : '重置登录密码的手机号，一般是您的登录账号或企业里留存的手机号',
									bodyStyle : 'color:#999;font-size:14px;background:none;',
									style : {
										color : '#999',
										'letter-spacing' : '1px',
										'text-align' : 'center',
										marginTop : '15px',
										height : '20px',
										'font-family' : 'SourceHanSansSC-regular'
									}
								},
								{
									xtype : 'textfield',
									height : 36,
									fieldLabel : '手机号/邮箱账号:',
									labelAlign : 'right',
									fieldBodyCls : 'fieldBody',
									fieldStyle : "border: 1px solid #D9D9D9;border-radius:4px;width:350px;",
									labelStyle : "color:#101010; font-size:14px; ",
									labelWidth:130,                 //label宽度style定义可能会有内层不一样的情况 ，用labelWidth就不会了
									afterLabelTextTpl : [ '<span style="color:red; font-weight:bold;margin:0 5px 0 10px;" data-qtip="Required">*</span>' ],
									name : 'email',
									allowBlank : false, // requires a non-empty
									// value
									style : {
										position : 'absolute',
										top : '215px',
										right : '294px'
									}
								},
								{
									html : '请输入您需要重置密码的手机号',
									bodyStyle : 'color:#999;',
									style : {
										height : '26px',
										color : 'rgba(153, 153, 153, 1)',
										'font-size' : '14px',
										'letter-spacing' : '1px',
										'font-family' : 'SourceHanSansSC-regular',
										position : 'absolute',
										top : '255px',
										left : '366px'
									}
								},
								{
									xtype : 'panel',
									layout : 'column',
									width : 453,
									height : 36,
									style : {
										position : 'absolute',
										top : '305px',
										right : '294px'
									},
									items : [
											{
												xtype : 'textfield',
												height : 36,
												fieldLabel : '验证码:',
												fieldBodyCls : 'fieldBody',
												labelAlign : 'right',
												fieldStyle : "border: 1px solid #D9D9D9;border-radius:4px;width:204px;margin-right:20px;",
												labelStyle : "color:#101010; font-size:14px; width:100px;",
												afterLabelTextTpl : [ '<span style="color:red; font-weight:bold;margin:0 5px 0 10px;" data-qtip="Required">*</span>' ],
												name : 'certificationCode',
												allowBlank : false

											},
											{
												html : "<input type='button' value ='获取验证码' style='cursor:pointer;width:124px;height:36px;border:1px solid #1296DB; border-radius:4px;font-size:14px;color:#1296DB;background:transparent;'>",
												listeners : {
													click : {
														fn : 'getCertificationCodeClick',
														element : 'el'
													}
												}
											} ]
								},
								{
									html : '请查收手机短信，并填写短信中的验证码',
									bodyStyle : 'color:#999;',
									style : {
										height : '26px',
										color : 'rgba(153, 153, 153, 1)',
										'font-size' : '14px',
										'letter-spacing' : '1px',
										'font-family' : 'SourceHanSansSC-regular',
										position : 'absolute',
										top : '345px',
										left : '365px'
									}
								},
								{
									xtype : 'textfield',
									fieldBodyCls : 'fieldBody',
									height : 36,
									fieldLabel : '新密码:',
									labelAlign : 'right',
									fieldStyle : "border: 1px solid #D9D9D9;border-radius:4px;width:350px",
									labelStyle : "color:#101010; font-size:14px; width:120px;",
									afterLabelTextTpl : [ '<span style="color:red; font-weight:bold;margin:0 5px 0 10px;" data-qtip="Required">*</span>' ],
									name : 'newPasswords',
									allowBlank : false, // requires a non-empty
									// value
									style : {
										position : 'absolute',
										top : '385px',
										right : '294px'
									}
								},
								{
									html : '8-20位密码，区分大小写',
									bodyStyle : 'color:#999;',
									style : {
										height : '20px',
										color : 'rgba(153, 153, 153, 1)',
										'font-size' : '14px',
										'font-family' : 'SourceHanSansSC-regular',
										position : 'absolute',
										top : '425px',
										left : '365px'
									}
								},
								{
									xtype : 'textfield',
									fieldBodyCls : 'fieldBody',
									height : 36,
									fieldLabel : '确认密码:',
									labelAlign : 'right',
									fieldStyle : "border: 1px solid #D9D9D9;border-radius:4px;width:350px",
									labelStyle : "color:#101010; font-size:14px; width:120px;",
									afterLabelTextTpl : [ '<span style="color:red; font-weight:bold;margin:0 5px 0 10px;" data-qtip="Required">*</span>' ],
									name : 'confirmPasswords',
									allowBlank : false, // requires a non-empty
									// value
									style : {
										position : 'absolute',
										top : '465px',
										right : '294px'
									}
								},
								{
									html : '请再次输入密码',
									bodyStyle : 'color:#999;',
									style : {
										height : '20px',
										color : 'rgba(153, 153, 153, 1)',
										'font-size' : '14px',
										'font-family' : 'SourceHanSansSC-regular',
										position : 'absolute',
										top : '505px',
										left : '365px'
									}
								},
								{
									xtype : 'button',
									width : 350,
									height : 45,
									userCls : 'buttonClass',
									border : '0',
									style : {
										color : 'rgb(255, 255, 255)',
										backgroundColor : 'rgb(255, 152, 0)',
										'background-image' : 'none', // 重点
										borderRadius : '4px',
										position : 'absolute',
										top : '591px',
										left : '326px'
									},
									text : '<span style=" font-weight:normal; font-size:16px;">重置密码</span>', // 重点
									listeners : {
										click : 'resetPasswordsClick'
									}
								} ]
					}

					],
					renderTo : Ext.getBody(),
					listeners : {
					// select: 'onItemSelected',
					}
				});
