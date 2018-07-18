/**
 * * Auto generated by Bossssoft Studio version 1.0 beta
 * Fri Dec 23 13:02:08 CST 2016
 */
//define(['引入外部js模块或控件'],function('引入外部js或控件的别名'){})
define(
		[ 
		  "app/widgets/window/app-dialog",
		  "app/app-pagebase"],
		function(Dialog,PageBase) {
		   var CmsNoticeDlg = PageBase.extend({
		             //类初始化
		            initialize : function() {
						CmsNoticeDlg .superclass.initialize.call(this);
					},
					ACTION:{
						ADD:"ADD",
						EDIT:"EDIT",
						VIEW:"VIEW"
					},
					//存储弹出窗口回调
					showPageCallBack:null,
					//当前窗口状态
					indexAction:null,
					
					//存放通知公告内容
					content:null,
					//控件监听事件  格式：#控件id#:{事件名:事件方法}
					listeners:{
						//正文上传失败提示：
						uploadContentJspDemo:{
							uploadError:function(obj){
								 if($.type(obj)!=='object'){
				                        return;
				                    }
				                    if($.type(obj.responseText) === 'undefined' || obj.responseText.indexOf('File upload failed,maybe file is too large!') >=0){
				                        $messager.warn('上传失败，正文大小不可超过5M！');
				                    }else{
				                        $messager.warn('上传失败！');
				                    }

							}
						},
						//附件上传失败提示：
						uploadJspDemo:{
							uploadError:function(obj){
								 if($.type(obj)!=='object'){
				                        return;
				                    }
				                    if($.type(obj.responseText) === 'undefined' || obj.responseText.indexOf('File upload failed,maybe file is too large!') >=0){
				                        $messager.warn('上传失败，附件大小不可超过5M！');
				                    }else{
				                        $messager.warn('上传失败！');
				                    }

							}
						},
							//保存
							cmsNoticePage_saveBtn : {
								click : function() {
								   var self=CmsNoticeDlg.getInstance();
									self.doSave({isSaveClose:true})
								}
							},
							//关闭
							cmsNoticePage_closeBtn : {
								click : function() {
									
									$.closeDialog();
									
								}
							}
					},
					//下载
					downloadAll:function(url){
						$.uiExtend({type:'download',url:url,options:{onFail:function(){
							$a.assetMsg.warn('无附件或者附件文件不存在!');
						}}});
					},
					downloadAll1:function(url){
						$.uiExtend({type:'download',url:url,options:{onFail:function(){
							$a.assetMsg.warn('无正文下载!');
						}}});
					},
					loadData:function(param,callback){
						var url="egov/asset/cms/notice/getCmsNotice.do"
						$.ajaxCall({
							url : url,
							data : param,
							callback : function(data) {
								$A("#cmsNoticePage_form").refreshFormData(data);
								if (callback){
									callback();
								}
							}
						})
					},
					//保存数据cofig:{isSaveAdd:"保存并新增",isSaveClose:"保存关闭",isSaveView:"保存查看"}可自行扩展
					doSave:function(config,callback){
						var url="";
						if (this.indexAction == this.ACTION.ADD) {
							url="egov/asset/cms/notice/doInsert.do"
						}
						if (this.indexAction == this.ACTION.EDIT) {
							url="egov/asset/cms/notice/doUpdate.do"
						}
						//判断结束时间小于等于开始时间
						var startDate = $A("#startDate").datetime("getValue");
						var endDate = $A("#endDate").datetime("getValue");
						if(startDate > endDate){
							$a.assetMsg.warn("结束时间必须大于等于开始时间！");
							return;
						}
						
						//使用ckeditor往文本域中赋值
						//$A("#content").val(CKEDITOR.instances.content.getData());
						$A("#content").val(UE.getEditor('content1').getContent());
						var content = $A("#content").val();
						if(content == ""){
							$a.assetMsg.warn("发布内容不能为空！");
							return;
						}
						var _self=CmsNoticeDlg.getInstance();
						
						$A('#cmsNoticePage_form').sumbitAllComp({
								submitMode : 'all',
								url : url,
								callback : function(json) {
									var action = "";
									if(_self.indexAction == _self.ACTION.ADD){
										action = "add";
									}
									if(_self.indexAction == _self.ACTION.EDIT){
										action = "edit";
									}
									if (action == "add") {
										$a.assetMsg.success("新增成功！");
									}
									if (action == "edit") {
										$a.assetMsg.success("修改成功！");
									}
									if (config.isSaveAdd) {
										$A("#cmsNoticePage_form").clearFormEditorValue();
										_self.indexAction = _self.ACTION.ADD;
									} else if (config.isSaveClose) {
										$.closeDialog();
										_self.indexAction = "";
									} else if (config.isSaveView) {
										$A("#cmsNoticePage_form").toggleFormState("view");
										_self.indexAction = _self.ACTION.VIEW;
									}
									if (_self.showPageCallBack) {
										_self.showPageCallBack();
									}
									
									
									//CKEDITOR.instances['content'].destroy();
									var editor = UE.getEditor('content1');
									editor.destroy();
								}
							});		
					},
					// 显示弹出窗口，action
					// 窗口状态来源，ACTION:{ADD:"",EDIT:"",VIEW:""}//可自行扩展
					showPage:function(action,data,callback){
				    this.showPageCallBack=callback||function(){};
					var self=this;
					
					this.indexAction=action;
					var prjId = "";
					var url = "";
					var id = "";
					if (this.indexAction == this.ACTION.ADD) {
						url = "egov/asset/cms/notice/showAdd.do"
					} else if (this.indexAction == this.ACTION.EDIT){
						url = "egov/asset/cms/notice/showEdit.do";
						id = data.id;
					} else {
						url = "egov/asset/cms/notice/showNoticeDetail.do";
						id = data.id;
					}				
					 var options = {
							url : url,
							dialogId : "noticeAdd" + id,
							title : "",
							wrapper : true,
							hasheader : true,
							reload : true,
							params:{
								   id : id
							},
							closeCallback:function(){
								if(callback){
									//callback();
									//UE.getEditor('content1').destroy();
								}
							},
							onPageLoad : function(obj) {
						if (self.indexAction == self.ACTION.ADD) {
							    $A("#cmsNoticePage").height("auto");
								$A('#title').textbox('focus');
								$A(".dialog-header >h5").html("新增通知公告");
							}
						if (self.indexAction == self.ACTION.EDIT) {
							    $A("#cmsNoticePage").height("auto"); 
								$A(".dialog-header >h5").html("修改通知公告");
								//$A("#cmsNoticePage_form").refreshFormData(data);
								var content = $A("#content").textbox("getValue");
								$A("#contentRevert").html('<span id="test">'+ content +'</span>');
								self.content = $A("#contentRevert >span#test").text();
								//self.content = "<p><strong>测试为空</strong></p>";
								var type = $A("#type").combobox("getValue");
								if(type == '0'){
									$A("#type").combobox("setText","通知");
								}else if(type == '1'){
									$A("#type").combobox("setText","公告");
								}else if(type == '5'){
								    $A("#type").combobox("setText","制度");
								}else if(type == '9'){
									$A("#type").combobox("setText","其他");
								}
								//回写通知公告状态值：
								var status = $A("#status").combobox("getValue");
								if(data.status == '2'){
								    $A("#status").combobox("setText","发布");
								}
								
								var isPortal = document.getElementById('isPortal0');//通过getElementById获取节点
								var isTop = document.getElementById("isTop0");
								
								if(isPortal == "1"){
									isPortal.checked = true;//设置checked为选中状态
								}
								if(isTop == "1"){
									isTop.checked = true;
								}
								
								var editor = UE.getEditor('content1');
								editor.ready( function( ) {
									UE.getEditor('content1').setContent(self.content);
								});
								/*$A("#cmsNoticePage_form").refreshFormData(data);
								self.content = data.content;
								if(data.type == '0'){
									$A("#type").combobox("setText","通知");
								}else if(data.type == '1'){
									$A("#type").combobox("setText","公告");
								}else if(data.type == '5'){
								    $A("#type").combobox("setText","制度");
								}else if(data.type == '9'){
									$A("#type").combobox("setText","其他");
								}
								//回写通知公告状态值：
								if(data.status == '2'){
								    $A("#status").combobox("setText","发布");
								}
								
								var isPortal = document.getElementById('isPortal0');//通过getElementById获取节点
								var isTop = document.getElementById("isTop0");
								
								if(data.isPortal == "1"){
									isPortal.checked = true;//设置checked为选中状态
								}
								if(data.isTop == "1"){
									isTop.checked = true;
								}
								

								var editor = UE.getEditor('content');
								editor.ready( function( ) {
									UE.getEditor('content').setContent(self.content);
								});*/

								
								
						}
						if (self.indexAction == self.ACTION.VIEW) {
								$A("#cmsNoticePage_saveBtn").hide();
								//if(!!!data.type)
								if(data.type == null || data.type == ''){
									$A(".dialog-header >h5").html("查看通知公告详细信息");
								} else {
									if(data.type == '1' || data.type == '0'){
										$A(".dialog-header >h5").html("查看公告");
									} else if (data.type == '5'){
										$A(".dialog-header >h5").html("查看制度");
									} 								   
								}
								/*//回写通知公告类型值：
							     if(data.type == '0'){
								     $A("#type").combobox("setText","通知");
							     }else if(data.type == '1'){
								     $A("#type").combobox("setText","公告");
							     }else if(data.type == '5'){
								     $A("#type").combobox("setText","制度");
							     }else if(data.type == '9'){
								     $A("#type").combobox("setText","其他");
							     }
							      //回写通知公告状态值：
							     if(data.status == '2'){
								     $A("#status").combobox("setText","发布");
							     }*/
							   }
							}
						};
//					$.openModalDialog(options);
					$.uiExtend({
		                type:'dialog',      
		                options:options
		            });
					
				
					},
					//页面加载后初始化
					initPage:function(){
						var self = CmsNoticeDlg.getInstance();
						
						/*if(UE != undefined && UE != null){
							var editor = UE.getEditor('content');
							console.log("2"+editor);
							editor.ready( function( ) {
								 console.log(editor);
								 UE.getEditor('content').setContent(self.content);
								 
							});
						}*/
					},
					//控件属性重置
					initUIExtConfig : function() {
						this.uiExtConfig={
							//格式 #控件id#:function(控件属性集类){ config.setAttr("控件属性名","属性值"),// 网格，下拉网格，特殊设置config.getColumn("网列id").setAttr("列属性名","列属性值")config.getButton("网格内包含的按钮id").setAttr("handler","点击事件")  }
								
						
						}
					}

		 });
		   //创建窗体类单例
			 CmsNoticeDlg.getInstance=function(){
		     if (!this.instance){
		    	 this.instance =new CmsNoticeDlg();
		     }
		     return this.instance;
		 }
		
		 return  CmsNoticeDlg.getInstance();
	   })