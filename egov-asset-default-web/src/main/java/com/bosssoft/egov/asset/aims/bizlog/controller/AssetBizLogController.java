/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Thu Dec 29 00:04:27 CST 2016
 */
package com.bosssoft.egov.asset.aims.bizlog.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bosssoft.egov.asset.bizlog.entity.AssetBizLog;
import com.bosssoft.egov.asset.bizlog.service.AssetBizLogService;
import com.bosssoft.egov.asset.common.util.MapUtilsExt;
import com.bosssoft.egov.asset.runtime.User;
import com.bosssoft.egov.asset.runtime.web.context.AppContext;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;
import com.bosssoft.platform.runtime.web.binding.annotation.AjaxResponseBody;
import com.bosssoft.platform.runtime.web.context.WebApplicationContext;
import com.bosssoft.platform.runtime.web.response.GridData;
import com.bosssoft.platform.runtime.web.response.PageResult;

@Controller
@RequestMapping(value="egov/asset/aims/bizlog/assetbizlog",name="用户近期操作")
public class AssetBizLogController {

	@Autowired
	private AssetBizLogService assetBizLogService;

  /**
     * 列表页面
	 */
    @RequestMapping(value = "showIndex.do",name="用户近期操作入口页面")
    public String showIndex(Model model) {
		User user = AppContext.getAppContext().getSessionUser();
    	Map<String,Object> params = WebApplicationContext.getContext().getWebRequestContext().getRequestParamsMap();
    	params.put("isLeaf", !user.currentIsParent());
		Map<String,Object> data = new HashMap<String,Object>();		 
		data.put("params", MapUtilsExt.copyNewMap(params));
		model.addAllAttributes(data);
        return "egov/asset/aims/bizlog/assetbizlog/assetbizlog_index.ui";
    }
    
     /**
     * 新增页面
	 */
    @RequestMapping(value = "showAdd.do",name="用户近期操作新增页面")
    public String showAdd() {
        return "egov/asset/aims/bizlog/assetbizlog/assetbizlog_add.ui";
    }
    
   /**
     * 新增
     * @param assetBizLog 新增信息
	 */
    @RequestMapping(value = "doInsert.do",name="用户近期操作保存",method=RequestMethod.POST)
    @AjaxResponseBody
    public void doInsert(AssetBizLog assetBizLog)  {
      	assetBizLogService.addAssetBizLog(assetBizLog);
    }
    
   /**
     * 修改
     * @param assetBizLog 修改信息
	 */
    @RequestMapping(value = "doUpdate.do",name="用户近期操作修改", method = RequestMethod.POST)
    @AjaxResponseBody
    public void doUpdate(AssetBizLog assetBizLog)  {
		assetBizLogService.updateAssetBizLog(assetBizLog);
    }
    
 /**
     * 删除
     * @param assetBizLog 删除条件
	 */
	 @RequestMapping(value = "doDelete.do",name="用户近期操作删除" ,method = RequestMethod.POST)
	 @AjaxResponseBody
	 public void doDelete(AssetBizLog assetBizLog)  {
		assetBizLogService.delAssetBizLog(assetBizLog);
	 }
	   /**
     * 获取单条记录
     * @param  assetBizLog 条件
	 */
	 @RequestMapping(value=" getAssetBizLog")
	 @AjaxResponseBody
	 public AssetBizLog getAssetBizLog(AssetBizLog assetBizLog) {
		return null;
	}
	 
	  /**
     * 获取列表
     * @param  assetBizLog 条件
	 */
	 @RequestMapping(value=" getAssetBizLogList",name="用户近期操作查询列表")
	 @AjaxResponseBody
	 public List<AssetBizLog> getAssetBizLogList(AssetBizLog assetBizLog) {
		return null;
	}
	 /**
     * 获取分页
     * @param searcher 查询条件
     * @param page 分页信息
	 */
	 @RequestMapping(value="queryAssetBizLogPage.do",name="用户近期操作分页查询")
	 @AjaxResponseBody
	 public  GridData queryAssetBizLogPage(Searcher searcher, Page<AssetBizLog> page) {
		 User user = AppContext.getAppContext().getSessionUser();
		 searcher.addCondition("ORG_CODE", user.getOrgCode(),"likes");
		 if(!user.currentIsParent()){
			 searcher.addCondition("USER_CODE", user.getUserCode());
		 }
		 return new GridData(new PageResult<AssetBizLog>(assetBizLogService.queryAssetBizLogPage(searcher, page)));

	}
}