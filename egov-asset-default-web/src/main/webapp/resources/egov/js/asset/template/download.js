/**
 * * Auto generated by Bossssoft Studio version 1.0 beta
 * Sun Jan 22 13:37:36 CST 2017
 */
//define(['引入外部js模块或控件'],function('引入外部js或控件的别名'){})
define(
		[ 
		  "app/widgets/window/app-dialog",
		  "app/app-pagebase"],
		function(Dialog,PageBase) {
		   var DownloadDlg = PageBase.extend({
			 //获取打印控件对象
				bsPrintObj:function(){
					// 此判断，待谷歌浏览器可使用后删除
					/*if (!isIE) {
						$messager.warn("暂时只支持IE浏览器！");
						return;
					}*/
					
				    var bsPrintObject = document.getElementById("_bsNetFun");
				    if (bsPrintObject == undefined || bsPrintObject == null) //if ((_ReportOK == null) || (_ReportOK.Register == undefined))
				    {
				        document.write('<div style="width: 100%; background-color: #fff8dc; text-align: center; vertical-align: middle; line-height: 20pt; padding-bottom: 12px; padding-top: 12px;">');
				            document.write('<strong> 本系统需要安装博思网络组件 才能保证其正常运行<br /></strong>');
				            
				        if( isIE )
				            document.write('<strong><span style="color: #ff0000"> 如浏览器的顶部或底部出现提示条，左键点击提示条并运行加载项，按此方式安装最简便</span><br /></strong>');
				            
				            document.write('<a href="resources/agency/widget/setup.exe"><span style="color: #ff0000"><strong>点击此处下载博思网络组件安装包<br /></strong></span></a>');
				            document.write('博思网络组件安装后，<a href="#" onclick="javascript:document.location.reload();">点击此处</a> 重新加载此网站');
				        document.write('</div>');
				        return false;
				    }	
				    return bsPrintObject ;
				},
		             //类初始化
		            initialize : function() {
						DownloadDlg .superclass.initialize.call(this);
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
					//控件监听事件  格式：#控件id#:{事件名:事件方法}
					listeners:{

					},
					//保存数据cofig:{isSaveAdd:"保存并新增",isSaveClose:"保存关闭",isSaveView:"保存查看"}可自行扩展
					doSave:function(config,callback){
								
					},
					//显示弹出窗口，
					showPage:function(callback){
				    this.showPageCallBack=callback||function(){};
					var self=this;
					 var options = {
							url : "egov/asset/template/showDownLoad.do",
							dialogId : "showDownLoadDlg",
							title : "新增",
							width : 400,
							height : 400,
							wrapper : true,
							hasheader : true,
							reload : true,
							onPageLoad : function(obj) {
								$a('.dialog-header >h5').html('提示信息');
								$A("#download_panel").append("<span>尚未安装打印控件</span><br/>");
//								$A("#download_panel").append("<span><a href='resources/bsnetfun/博思打印组件_1.0.3.0.exe'/></span>");
								
							}
						};
//					$.openModalDialog(options)
					 $.uiExtend({type:'download',url:"resources/bsnetfun/BsPrint1.0.3.0.exe",options:{onFail:function(){
							$a.assetMsg.warn('无附件或者附件文件不存在!');
						}}});
					},
					//页面加载后初始化
					initPage:function(){
						
							
					},
					//控件属性重置
					initUIExtConfig : function() {
						this.uiExtConfig={
							//格式 #控件id#:function(控件属性集类){ config.setAttr("控件属性名","属性值"),// 网格，下拉网格，特殊设置config.getColumn("网列id").setAttr("列属性名","列属性值")config.getButton("网格内包含的按钮id").setAttr("handler","点击事件")  }
								
						
						}
					}

		 });
		   //创建窗体类单例
			 DownloadDlg.getInstance=function(){
		     if (!this.instance){
		    	 this.instance =new DownloadDlg();
		     }
		     return this.instance;
		 }
		
		 return  DownloadDlg.getInstance();
	   })