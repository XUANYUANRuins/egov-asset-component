/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Tue May 23 14:51:49 CST 2017
 */
package com.bosssoft.egov.asset.workorder.controller;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bosssoft.egov.asset.basic.BaseController;
import com.bosssoft.egov.asset.codegen.CodeGen;
import com.bosssoft.egov.asset.common.idgenerator.ComponetIdGen;
import com.bosssoft.egov.asset.common.util.DateUtilsExt;
import com.bosssoft.egov.asset.common.util.MapUtilsExt;
import com.bosssoft.egov.asset.common.util.NumberUtilsExt;
import com.bosssoft.egov.asset.common.util.StringUtilsExt;
import com.bosssoft.egov.asset.dictionary.api.AssetDictManager;
import com.bosssoft.egov.asset.dictionary.api.DictItem;
import com.bosssoft.egov.asset.runtime.User;
import com.bosssoft.egov.asset.runtime.web.context.AppContext;
import com.bosssoft.egov.asset.workorder.entity.AimsWorkOrder;
import com.bosssoft.egov.asset.workorder.service.AimsWorkOrderService;
import com.bosssoft.egov.asset.workorder.utils.BizHelper;
import com.bosssoft.egov.asset.workorder.utils.ResultUtils;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;
import com.bosssoft.platform.runtime.exception.BusinessException;
import com.bosssoft.platform.runtime.web.binding.annotation.AjaxResponseBody;
import com.bosssoft.platform.runtime.web.context.WebApplicationContext;
import com.bosssoft.platform.runtime.web.response.AjaxResult;
import com.bosssoft.platform.runtime.web.response.GridData;
import com.bosssoft.platform.runtime.web.response.PageResult;
import com.bosssoft.platform.ui.tags.UIConst;


@Controller
@RequestMapping(value="egov/asset/workorder",name="业务工单")
public class AssetWorkorderController extends BaseController{
	@Autowired
	private AimsWorkOrderService aimsWorkOrderService;
  /**
     * 列表页面
	 */
    @RequestMapping(value = "showIndex.do",name="业务工单入口页面")
    public String showIndex() {
    	String result="egov/asset/workorder/assetworkorder_index.ui";
        return result;
    }
    /**
     * 获取分页
     * @param searcher 查询条件
     * @param page 分页信息
	 */
	 @RequestMapping(value="queryAssetWorkorderPage.do",name="业务工单分页查询")
	 @AjaxResponseBody
	 public  GridData queryAssetWorkorderPage(Searcher searcher, Page<AimsWorkOrder> page) {		
	   //  searcher.addCondition("BIZ_STATUS",0,">=");
	   //  searcher.addCondition("BILL_STATUS",0,"=");			    
	   return new GridData(new PageResult<AimsWorkOrder>(aimsWorkOrderService.queryAimsWorkOrderPage(searcher, page)));
	}
	@RequestMapping(value = "showAdd.do",name="新增修改页面")
    public String showAdd(Model model) {
		Map<String,Object> params = WebApplicationContext.getContext().getWebRequestContext().getRequestParamsMap();		 	
    	String action =	MapUtilsExt.getString(params, "action");
		Long billId=NumberUtilsExt.toLong(StringUtilsExt.convertNullToString(params.get("billId")),-1);       
    	User user = AppContext.getAppContext().getSessionUser();
        Long billIdTmp=NumberUtilsExt.toLong(StringUtilsExt.convertNullToString(billId),-1);
        if(("-1".equals(StringUtilsExt.toString(billIdTmp))||"".equals(StringUtilsExt.toString(billIdTmp)))){ //billId为空时 	    	  		       	
        	AimsWorkOrder aimsWorkOrder = new AimsWorkOrder();
        	aimsWorkOrder.setRgnId(user.getRgnId());
        	aimsWorkOrder.setRgnCode(user.getRgnCode());
        	aimsWorkOrder.setRgnName(user.getRgnName());
        	aimsWorkOrder.setOrgId(user.getOrgLongId());
        	aimsWorkOrder.setOrgCode(user.getOrgCode());
        	aimsWorkOrder.setOrgName(user.getOrgName());
        	aimsWorkOrder.setBillId(ComponetIdGen.newWKID());
        	aimsWorkOrder.setBillDate(DateUtilsExt.getNowDate());
        	aimsWorkOrder.setCreateDate(DateUtilsExt.getNowDateTime());
        	aimsWorkOrder.setCreatorName(user.getUserName());
	    	model.addAttribute("aimsWorkOrder", aimsWorkOrder);	 	    		    	
	    	Map<String,Object> workorder = new HashMap<>();
	    	workorder.put("curMaker", user.getUserName());// 制单人
	    	workorder.put("curCreateDate", DateUtilsExt.getCurrentDate());// 制单日期
	    	workorder.put("curOrgName", user.getOrgName());
	    	workorder.put("OrgCode", user.getOrgCode());
	    	workorder.put("billId", aimsWorkOrder.getBillId());
	    	workorder.put("billDate", aimsWorkOrder.getBillDate());
     	    
	    	Map<String,Object> data = new HashMap<>();   		
   		    data.put("action", "ADD");
   		    data.put("aimsWorkOrder", workorder); 
	    	model.addAttribute(UIConst.UIPAGEMODEL,data);	    	
	    	model.addAttribute("aimsWorkOrder", aimsWorkOrder);  //返回NULL，用于合计	
    	} else {   	
    		AimsWorkOrder aimsWorkOrder1=new AimsWorkOrder();
    		aimsWorkOrder1.setBillId(billId);	    	
    		AimsWorkOrder aimsWorkOrder =aimsWorkOrderService.getAimsWorkOrderList(aimsWorkOrder1);
        	if (aimsWorkOrder==null){
        		Map<String,Object> data = new HashMap<>(); 
       		    data.put("action", "NULL");
       		    model.addAttribute(UIConst.UIPAGEMODEL, data);
       		    return "egov/asset/workorder/assetworkorder_add.ui";       		       	
        	}       	
        	
        	Map<String,Object> workorder = new HashMap<>();
        	workorder.put("billId",aimsWorkOrder.getBillId());
        	workorder.put("bizStatus", aimsWorkOrder.getBizStatus());              	       	
        	workorder.put("OrgCode", user.getOrgCode());
        	workorder.put("billDate", aimsWorkOrder.getBillDate());
    		workorder.put("curMaker", aimsWorkOrder.getCreatorName());// 制单人
    		String createDate=StringUtilsExt.convertNullToString(aimsWorkOrder.getCreateDate());
    		workorder.put("curCreateDate", createDate);
    		//审核日期
    		String auditDate1=StringUtilsExt.convertNullToString(aimsWorkOrder.getAuditor());
    		if (!"".equals(auditDate1)) {
            	Date date = DateUtilsExt.parseDate(aimsWorkOrder.getAuditdate(), "yyyyMMddHHmmssSSS");
            	String auditDate=DateUtilsExt.formatDate(date, "yyyy-MM-dd");
            	workorder.put("auditDate", auditDate);// 
    		} else {
    			workorder.put("auditDate", "");
    		}   	
    		workorder.put("curOrgName", aimsWorkOrder.getOrgName());
    		Map<String,Object> data = new HashMap<>(); 
   		    data.put("action", action);
   		    data.put("aimsDispose", aimsWorkOrder);  		    
  		    
        	model.addAttribute(UIConst.UIPAGEMODEL, data);
        	model.addAttribute("aimsWorkOrder", aimsWorkOrder);	          	        	
    	}
    	return "egov/asset/workorder/assetworkorder_add.ui"; 
	}
	  /**
     * 获取单条记录
     * @param 
	 */
	 @RequestMapping(value="getAimsWorkOrder.do")
	 @AjaxResponseBody
	 public AimsWorkOrder getAimsWorkOrder(AimsWorkOrder aimsWorkOrder) {		 
		return aimsWorkOrderService.getAimsWorkOrderList(aimsWorkOrder);
	}
	 /**
     * 批删除
     * @param 
	 */
	 @RequestMapping(value = "batchDelete.do",name="批删除" ,method = RequestMethod.POST)
	 @ResponseBody
	 public int batchDelete(List<AimsWorkOrder> aimsWorkOrder)  {
	    int count=0;
	    int countSum=0;
	    if (null!=aimsWorkOrder) {	    	
	    	for (AimsWorkOrder aimsWorkOrder2 : aimsWorkOrder) {
	    		count =aimsWorkOrderService.batchDelete(aimsWorkOrder2);
	    		countSum =countSum+count;
	    	}	   	    
	    };
	    return countSum;
	 } 
	 /**
     * 新增
     * @param 新增信息
	 */
    @RequestMapping(value = "doInsert.do",name="新增保存",method=RequestMethod.POST)
    @ResponseBody
    public AjaxResult doInsert(AimsWorkOrder aimsWorkOrder) {
    	if(aimsWorkOrder == null){
    		return ResultUtils.ERROR("空数据无法保存！");
    	}
    	User user = AppContext.getAppContext().getSessionUser();//getCurrUser();
    	
    	// 校验数据
    	/*String result=verify(aimsDispose);
    	if (!"".equals(result))
        	return ResultUtils.ERROR(result);
    	*/
    	//获取单据号
    	String billCode = CodeGen.newBillCodeBySave(BizHelper.getBizTypeByAssetTypeCode("", "WORKORDER"),user.getOrgId(),aimsWorkOrder.getBillCode());
    	aimsWorkOrder.setBillCode(billCode);    
    	//重新赋值    
    	aimsWorkOrder.setRgnId(user.getRgnId());
    	aimsWorkOrder.setRgnCode(user.getRgnCode());
    	aimsWorkOrder.setRgnName(user.getRgnName());
    	aimsWorkOrder.setOrgId(user.getOrgLongId());
    	aimsWorkOrder.setOrgCode(user.getOrgCode());
    	aimsWorkOrder.setOrgName(user.getOrgName());    	
    	aimsWorkOrder.setFinanceBudgetCode(user.getOrg().getFinanceBudgetCode()); 
    	
    	Date date = DateUtilsExt.parseDate(DateUtilsExt.getNowDateTime(), "yyyyMMddHHmmssSSS");
    	String CreateDate=DateUtilsExt.formatDate(date, "yyyy-MM-dd");
    	aimsWorkOrder.setCreateDate(CreateDate);
    	aimsWorkOrder.setCreatorName(user.getUserName());
    	aimsWorkOrder.setCreatorCode(user.getUserCode());
    	aimsWorkOrder.setBizNext(1);
    	try {
    	  aimsWorkOrderService.addRecord(aimsWorkOrder);  
    	} catch (Exception e) {
			e.printStackTrace();
			throw new BusinessException("AIMS_WORKORDER_01", e.getMessage());
		} 	
    	return ResultUtils.SUCCESS("提交处置单据【" + aimsWorkOrder.getBillCode() + "】成功！");
    } 
    /**
     * 修改
     * @param assetComment 修改信息
	 */
    @RequestMapping(value = "doUpdate.do",name="修改", method = RequestMethod.POST)
    @AjaxResponseBody
    public AjaxResult doUpdate(AimsWorkOrder aimsWorkOrder)  {
    	aimsWorkOrderService.updateAimsWorkOrder(aimsWorkOrder);
		return ResultUtils.SUCCESS("更新成功",aimsWorkOrder);
    }
    @RequestMapping("getWorkOrderType.do")
	@ResponseBody
	public List<DictItem> getWorkOrderType(){
		List<DictItem> dictItem = AssetDictManager.getInstance().getDictItems("egov-asset-aims", "AIMS_ORDER_BUS_TYPE");
		return dictItem;
	}
	@RequestMapping(value = "showAttach.do", name = "附件查看页面")
	public String showAttach() {
		return "egov/asset/workorder/workorder_attach.ui";
	} 
}