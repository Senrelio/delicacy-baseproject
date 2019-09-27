/**
 * This view is an example list of people.
 */
Ext.define(
				'erp.view.registerPanel',
				{
					extend : 'Ext.panel.Panel',
					xtype : 'registerPanel',
					id:'registercontent',
					bodyStyle : 'overflow: auto;',
					controller : 'registerController',
					// namespace: 'erpapp',
					requires : [ 'erp.controller.registerController' ],

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
						id : 'registerId',
						width : 1000,
						minHeight : 850,
						items : [
							{
								html:"<p style='cursor:pointer;color:#c2c2c2;'>back</p>",
								listeners:{
									click:{fn:'backToLoginClick',
										element:'el'}
								}
								
							},
							
								{
									html : '创建企业账号',
									bodyStyle : 'color:#FF9800;font-size:20px;',
									style : {
										'text-align' : 'center',
//										marginTop : '55px',
										marginTop : '0',
										height : '24px',
										'line-height':'24px',
										color : 'rgba(255, 152, 0, 1)',
										'font-weight' : 'bold',
										'font-family' : 'SourceHanSansSC-regular',
										'letter-spaceing' : '3px'
									}
								},
								{
									html : '每个企业只需创建一次企业账号，创建者默认为系统管理员',
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
									xtype:'panel',
									width:1000,
									height:65,
									bodyStyle:'background:none!important;',
									style:'background-color:#f2f2f2;position:absolute;top:142px;'
								},
								{
									xtype : 'tabpanel',
									bodyStyle : 'background:none;',
									id:'register',
									width:484,
									height:600,
									style : {
										position : 'absolute',
										top : '142px',
										right : '265px'
									},
									items : [ {
										title : '创建企业账号',
										titleAlign : 'center',
										xtype : 'form',
										id : 'createCompanyAccount',
										bodyStyle : 'background:none;',
											items:[
												{
													xtype : 'textfield',
													height : 36,
													fieldLabel : '姓名',
													labelAlign : 'right',
													fieldBodyCls : 'fieldBody',
//													fiedCls 和fieldStyle效果不一样     fieldStyle有时会自动多加一个样式 
													fieldStyle : "border: 1px solid #D9D9D9;border-radius:4px;width:350px;",
													labelStyle : "color:#101010; font-size:14px;line-height:36px; ",
													labelWidth:128,                 //label宽度style定义可能会有内层不一样的情况 ，用labelWidth就不会了
													afterLabelTextTpl : [ '<span class="requiredIcon" data-qtip="Required">*</span>' ],
													name : 'name',
													allowBlank : false,
													style:'margin:45px 4px 0 0 ;'
												},
												{
													html : '<span class="textInputAttention">请输入您的姓名</span>',
													bodyStyle : 'color:#999;',
													height:28,
													style : 'margin-left:133px;'
												},
												{
													xtype : 'textfield',
													height : 36,
													fieldLabel : '手机号/邮箱账号:',
													labelAlign : 'right',
													fieldBodyCls : 'fieldBody',
													fieldStyle : "border: 1px solid #D9D9D9;border-radius:4px;width:350px;",
													labelStyle : "color:#101010; font-size:14px; ",
													labelWidth:128,                 //label宽度style定义可能会有内层不一样的情况 ，用labelWidth就不会了  而且两种设一样的值显示不一样
													afterLabelTextTpl : [ '<span class="requiredIcon" data-qtip="Required">*</span>' ],
													name : 'phone',
													allowBlank : false, // requires a non-empty
													// value
													style:'margin:28px 4px 0 0 ;'
												},
												{
													html : '<span class="textInputAttention">一个手机号只能注册一个企业，注册的手机号为登录账号</span>',
													bodyStyle : 'color:#999;',
													height:28,
													style : 'margin-left:133px;'
												},
												{
													xtype : 'panel',
													layout : 'column',
													width : 484,
													height : 36,
													style :'margin-top:20px;',
													items : [
															{
																xtype : 'textfield',
																height : 36,
																fieldLabel : '验证码:',
																fieldBodyCls : 'fieldBody',
																labelAlign : 'right',
																fieldStyle : "border: 1px solid #D9D9D9;border-radius:4px;width:204px;margin-right:20px;",
																labelStyle : "color:#101010; font-size:14px;",
																labelWidth:128,  
																afterLabelTextTpl : [ '<span class="requiredIcon" data-qtip="Required">*</span>' ],
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
													html : '<span class="textInputAttention">请查收手机短信，并填写短信中的验证码</span>',
													bodyStyle : 'color:#999;',
													height:28,
													style : 'margin-left:133px;'
												},
												{
													xtype : 'textfield',
													height : 36,
													fieldLabel : '公司名称:',
													labelAlign : 'right',
													fieldBodyCls : 'fieldBody',
													fieldStyle : "border: 1px solid #D9D9D9;border-radius:4px;width:350px;",
													labelStyle : "color:#101010; font-size:14px; ",
													labelWidth:128,                 //label宽度style定义可能会有内层不一样的情况 ，用labelWidth就不会了  而且两种设一样的值显示不一样
													afterLabelTextTpl : [ '<span class="requiredIcon" data-qtip="Required">*</span>' ],
													name : 'companyName',
													allowBlank : false, // requires a non-empty
													// value
													style:'margin:28px 4px 0 0 ;'
												},
												{
													html : '<span class="textInputAttention">请填写您的公司名称</span>',
													bodyStyle : 'color:#999;',
													height:28,
													style : 'margin-left:133px;'
												},
												{
													xtype:'panel',
													width:503,
													height:1,
													bodyStyle:'background:none!important;',
													style:'background-color:#bbb;margin:26px 0;'
												},
												{
													xtype : 'fieldcontainer',
													bodyStyle : 'background:none;',
													defaultType : 'checkboxfield',
													items : [{
																xtype: 'checkboxfield',
																style:'margin-left:114px;',
																labelWidth:214,
																name: 'agreement',
																boxLabel: '我已阅读并同意公司《服务协议》',
                                                               //boxLabel 即label在框右   fieldLabel在框左 
																allowBlank: true
															}]
												},
												{
													html : "<input type='button' class='buttonCls' value='创建企业账号' style='margin:0 0 0 66px;cursor:pointer;letter-spacing:0;'/>",
													bodyStyle : 'background:none;',
													listeners : {
														click : {
															fn : 'createCompanyAccountClick',
															element : 'el'
														}
													}
												}
											]
									},
									 {
										title : '加入已有企业账号',
										titleAlign : 'center',
										xtype : 'form',
										id : 'joinCompanyAccount',
										bodyStyle : 'background:none;',
											items:[
												{
													xtype : 'textfield',
													height : 36,
													fieldLabel : '姓名',
													labelAlign : 'right',
													fieldBodyCls : 'fieldBody',
//													fiedCls 和fieldStyle效果不一样     fieldStyle有时会自动多加一个样式 
													fieldStyle : "border: 1px solid #D9D9D9;border-radius:4px;width:350px;",
													labelStyle : "color:#101010; font-size:14px;line-height:36px; ",
													labelWidth:128,                 //label宽度style定义可能会有内层不一样的情况 ，用labelWidth就不会了
													afterLabelTextTpl : [ '<span class="requiredIcon" data-qtip="Required">*</span>' ],
													name : 'name',
													allowBlank : false,
													style:'margin:45px 4px 0 0 ;'
												},
												{
													html : '<span class="textInputAttention">请输入您的姓名</span>',
													bodyStyle : 'color:#999;',
													height:28,
													style : 'margin-left:133px;'
												},
												{
													xtype : 'textfield',
													height : 36,
													fieldLabel : '手机号/邮箱账号:',
													labelAlign : 'right',
													fieldBodyCls : 'fieldBody',
													fieldStyle : "border: 1px solid #D9D9D9;border-radius:4px;width:350px;",
													labelStyle : "color:#101010; font-size:14px; ",
													labelWidth:128,                 //label宽度style定义可能会有内层不一样的情况 ，用labelWidth就不会了  而且两种设一样的值显示不一样
													afterLabelTextTpl : [ '<span class="requiredIcon" data-qtip="Required">*</span>' ],
													name : 'phone',
													allowBlank : false, // requires a non-empty
													// value
													style:'margin:28px 4px 0 0 ;'
												},
												{
													html : '<span class="textInputAttention">一个手机号只能注册一个企业，注册的手机号为登录账号</span>',
													bodyStyle : 'color:#999;',
													height:28,
													style : 'margin-left:133px;'
												},
												{
													xtype : 'panel',
													layout : 'column',
													width : 484,
													height : 36,
													style :'margin-top:20px;',
													items : [
															{
																xtype : 'textfield',
																height : 36,
																fieldLabel : '验证码:',
																fieldBodyCls : 'fieldBody',
																labelAlign : 'right',
																fieldStyle : "border: 1px solid #D9D9D9;border-radius:4px;width:204px;margin-right:20px;",
																labelStyle : "color:#101010; font-size:14px;",
																labelWidth:128,  
																afterLabelTextTpl : [ '<span class="requiredIcon" data-qtip="Required">*</span>' ],
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
													html : '<span class="textInputAttention">请查收手机短信，并填写短信中的验证码</span>',
													bodyStyle : 'color:#999;',
													height:28,
													style : 'margin-left:133px;'
												},
												{
													xtype : 'textfield',
													height : 36,
													fieldLabel : '公司编码:',
													labelAlign : 'right',
													fieldBodyCls : 'fieldBody',
													fieldStyle : "border: 1px solid #D9D9D9;border-radius:4px;width:350px;",
													labelStyle : "color:#101010; font-size:14px; ",
													labelWidth:128,                 //label宽度style定义可能会有内层不一样的情况 ，用labelWidth就不会了  而且两种设一样的值显示不一样
													afterLabelTextTpl : [ '<span class="requiredIcon" data-qtip="Required">*</span>' ],
													name : 'companyCode',
													allowBlank : false, // requires a non-empty
													// value
													style:'margin:28px 4px 0 0 ;'
												},
												{
													html : '<span class="textInputAttention">请填写您的公司编码</span>',
													bodyStyle : 'color:#999;',
													height:28,
													style : 'margin-left:133px;'
												},
												{
													xtype:'panel',
													width:503,
													height:1,
													bodyStyle:'background:none!important;',
													style:'background-color:#bbb;margin:26px 0;'
												},
												{
													xtype : 'fieldcontainer',
													bodyStyle : 'background:none;',
													defaultType : 'checkboxfield',
													items : [{
																xtype: 'checkboxfield',
																style:'margin-left:114px;',
																labelWidth:214,
																name: 'agreement',
																boxLabel: '我已阅读并同意公司《服务协议》',
                                                               //boxLabel 即label在框右   fieldLabel在框左 
																allowBlank: true
															}]
												},
											{
													html : "<input type='button' class='buttonCls' value='加入企业' style='margin:0 0 0 66px;letter-spacing:0;'/>",
													bodyStyle : 'background:none;',
													listeners : {
														click : {
															fn : 'joinCompanyAccountClick',
															element : 'el'
														}
													}
												}
											]
									}
									]
								}
								]
					}

					],
					renderTo : Ext.getBody(),
					listeners : {
					// select: 'onItemSelected',
					}
				});
