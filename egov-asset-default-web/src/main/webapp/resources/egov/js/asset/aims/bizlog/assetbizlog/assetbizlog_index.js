/**
 * * Auto generated by Bossssoft Studio version 1.0 beta
 * Thu Dec 29 00:06:03 CST 2016
 */
//define(['引入外部js模块或控件'],function('引入外部js或控件的别名'){})
define(
		[ 
		  "app/widgets/window/app-dialog",
		  "app/app-pagebase"],
		function(Dialog,PageBase) {
		   var AssetBizLogModel = PageBase.extend({
		             //类初始化
		            initialize : function() {
						AssetBizLogModel.superclass.initialize.call(this);
					},
					//控件监听事件  格式：#控件id#:{事件名:事件方法}
					listeners:{
					    //新增按钮事件
						assetBizLogPage_btnAdd:{
							click: function(){
							
							}
						},
						//新增按钮事件
						assetBizLogPage_btnQuery:{
							click:function(){
								$("#assetBizLogPage_query").xquery("toggle");
							}
						}	
					},
					//页面加载后初始化
					initPage:function(){
						$("#assetBizLogPage_query").xquery("toggle");
							
					},
					formaterOperType:function(value){
						if(value == 'ADD'){
							return "新增";
						} else if(value == 'UPDATE'){
							return "更新";
						} else if(value == 'DELETE'){
							return "删除";
						} else if(value == 'AUDIT'){
							return "审核";
						} else if(value == 'COMMIT'){
							return "提交审核";
						} else if(value == 'RETURN'){
							return "退回";
						}  else if(value == 'CANCELPASS'){
							return "取消审核";
						}  else if(value == 'REJECT'){
							return "驳回";
						} else if(value == 'CANCELRETURN'){
							return "取消退回";
						} else if(value == 'CANCELRETURN'){
							return "暂存";
						}  else {
							return "其他";
						} 
					},
					//显示查看业
					showViewPage:function(data,e){
					    var _self=this;
//						dlg.showPage(dlg.ACTION.VIEW,data,function(){
//							_self.refreshData();
//						});
					},
					refreshData:function(){
						$("#assetBizLogPage_grid").grid("reload");
					},
					//显示编辑业
					showEditPage:function(data,e){
						 var _self=this;
//						dlg.showPage(dlg.ACTION.EDIT,data,function(){
//						     _self.refreshData();
//						});
					},
					doDeleteData:function(data,e){
						 var _self=this;
						 $messager.confirm("确认删除当前记录吗？", {
							okCall : function() {
								var url = "egov/asset/aims/bizlog/assetbizlog/doDelete.do";
								$app.ajax.ajaxCall({
									url : url,
									data : data,
									callback : function() {
										_self.refreshData();
										
									}
								});
							}
						});
					},
					
					//控件属性重置
					initUIExtConfig : function() {
					    var _self=this;
						this.uiExtConfig={
							//格式 #控件id#:function(控件属性集类){ config.setAttr("控件属性名","属性值"),// 网格，下拉网格，特殊设置config.getColumn("网列id").setAttr("列属性名","列属性值")config.getButton("网格内包含的按钮id").setAttr("handler","点击事件")  }
							assetBizLogPage_grid:function(config){
								config.getButton("assetBizLogPage_grid_btnEdit").setAttr("handler",_self.showEditPage);
								config.getButton("assetBizLogPage_grid_btnView").setAttr("handler",_self.showViewPage);
								config.getButton("assetBizLogPage_grid_btnDel").setAttr("handler",_self.doDeleteData);
							}
						
						}
					}

		 });
		 AssetBizLogModel.getInstance=function(){
		     if (!this.instance){
		    	 this.instance =new AssetBizLogModel();
		     }
		     return this.instance;
		 }
		
		 return  AssetBizLogModel.getInstance();
	   })