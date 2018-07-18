/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Fri Dec 23 00:11:51 CST 2016
 */
package com.bosssoft.egov.asset.cms.controller;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bosssoft.egov.asset.aims.api.config.entity.AssetSysConfig;
import com.bosssoft.egov.asset.aims.api.config.service.ConfigService;
import com.bosssoft.egov.asset.cache.CacheHelper;
import com.bosssoft.egov.asset.common.idgenerator.ComponetIdGen;
import com.bosssoft.egov.asset.common.util.DateUtilsExt;
import com.bosssoft.egov.asset.common.util.MapUtilsExt;
import com.bosssoft.egov.asset.common.util.SpringObjectUtilsExt;
import com.bosssoft.egov.asset.common.util.StringUtilsExt;
import com.bosssoft.egov.asset.runtime.User;
import com.bosssoft.egov.asset.runtime.web.context.AppContext;
import com.bosssoft.egov.cms.entity.AssetBizUser;
import com.bosssoft.egov.cms.entity.CmsNotice;
import com.bosssoft.egov.cms.service.AssetBizUserService;
import com.bosssoft.egov.cms.service.CmsNoticeService;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;
import com.bosssoft.platform.common.lang.expression.LogicExpression;
import com.bosssoft.platform.common.lang.expression.ValueExpression;
import com.bosssoft.platform.runtime.web.binding.annotation.AjaxResponseBody;
import com.bosssoft.platform.runtime.web.context.WebApplicationContext;
import com.bosssoft.platform.runtime.web.response.AjaxResult;
import com.bosssoft.platform.runtime.web.response.GridData;
import com.bosssoft.platform.runtime.web.response.PageResult;



@Controller
@RequestMapping(value="egov/asset/cms/notice",name="通知公告首页")
public class CmsNoticeController {

	@Autowired
	private CmsNoticeService cmsNoticeService;
	
	@Autowired
	private AssetBizUserService bizUserService;
	
	@Resource
	@Qualifier(ConfigService.REFERENCE_BEAN_NAME)
	private ConfigService configService;

  /**
     * 列表页面
	 */
    @RequestMapping(value = "showIndex.do",name="通知公告接收入口页面")
    public String showIndex() {
        return "egov/asset/cms/notice/cmsnotice_index.ui";
    }
 
    /**
     * 列表页面
	 */
    @RequestMapping(value = "showRecordedIndex.do",name="通知公告录入页面")
    public String showRecordedIndex() {    
        return "egov/asset/cms/notice/cmsnotice_recorded.ui";
    }
    
    @RequestMapping(value = "showViewIndex.do",name="通知公告列表查看")
    public String showViewIndex(Model model) {
    	 Map<String,Object> params = WebApplicationContext.getContext().getWebRequestContext().getRequestParamsMap();
		 Map<String,Object> data = new HashMap<String,Object>();		 
		 data.put("params", MapUtilsExt.copyNewMap(params));
		 model.addAllAttributes(data);
        return "egov/asset/cms/notice/cmsnotice_view.ui";
    }
    
     /**
     * 新增页面
	 */
    @RequestMapping(value = "showAdd.do",name="通知公告首页新增页面")
    public String showAdd(Model modle) {
    	User user = AppContext.getAppContext().getSessionUser();    	
    	CmsNotice notice = new CmsNotice();
    	notice.setId(ComponetIdGen.newWKID());
    	notice.setRealeaseUser(user.getUserCode() + " " + user.getUserName());
    	notice.setRealeaseUserId(user.getUserId());
    	notice.setRealeaseDate(DateUtilsExt.getCurrentDate());
    	modle.addAttribute("notice", notice);    	
        return "egov/asset/cms/notice/cmsnotice_add.ui";
    }
    /**
     * 
     * <p>函数名称：   showEdit     </p>
     * <p>功能说明： 查看编辑页面
     *
     * </p>
     *<p>参数说明：</p>
     * @param id
     * @param model
     * @return
     *
     * @date   创建时间：2016年12月24日
     * @author 作者：xds
     */
    @RequestMapping(value = "showEdit.do",name="通知公告编辑")
    public String showEdit(Long id,Model model){
    	CmsNotice notice = cmsNoticeService.getCmsNotice(StringUtilsExt.toString(id));
    	model.addAttribute("notice",notice);    	
    	return "egov/asset/cms/notice/cmsnotice_add.ui";
    }
    @RequestMapping(value = "showNoticeDetail.do",name="通知公告查看")
    public String showNoticeDetail(String id, Model model){
    	CmsNotice notice = cmsNoticeService.getCmsNotice(id);
    	notice.setAttachCnt(cmsNoticeService.getAttachCount(id+""));
    	model.addAttribute("notice", notice);
    	return "egov/asset/cms/notice/cmsnotice_detail";
    }
    
    @RequestMapping(value = "getReadCount.do",name="通知公告阅读数")
    @ResponseBody
    public Map<String,Object> getReadCount(String id, Model model){
    	User user = AppContext.getAppContext().getSessionUser();    	
    	Map<String,Object> result = new HashMap<String,Object>();
    	if(StringUtilsExt.isEmpty(id)){
    		result.put("flag", false);	
    	} else {
    	  result.put("flag", true);
    	  result.put("cnt", cmsNoticeService.getReadCount(id, user.getUserCode()));
    	}
    	return result;
    }
    
   /**
     * 新增
     * @param cmsNotice 新增信息
	 */
    @RequestMapping(value = "doInsert.do",name="通知公告首页保存",method=RequestMethod.POST)
    @AjaxResponseBody
    public AjaxResult doInsert(CmsNotice cmsNotice)  {
        User user = AppContext.getAppContext().getSessionUser();
    	cmsNotice.setOrgId(user.getOrgLongId());
    	cmsNotice.setRgnId(user.getRgnId());
    	cmsNotice.setRealeaseUserId(user.getUserId());
      	cmsNoticeService.addCmsNotice(cmsNotice);    
      	CacheHelper.getInstance("EGOV-INDEX-NOTICE").clear();//清空下缓存类
      	return AjaxResult.SUCCESS;
    }
    
   /**
     * 修改
     * @param cmsNotice 修改信息
	 */
    @RequestMapping(value = "doUpdate.do",name="通知公告首页修改", method = RequestMethod.POST)
    @AjaxResponseBody
    public AjaxResult doUpdate(CmsNotice cmsNotice)  {
		if(cmsNotice.getIsTop() == null){
			cmsNotice.setIsTop(0);
		}
		if(cmsNotice.getIsPortal() == null){
			cmsNotice.setIsPortal(0);
		}
    	cmsNoticeService.updateCmsNotice(cmsNotice);
      	CacheHelper.getInstance("EGOV-INDEX-NOTICE").clear();//清空下缓存类    	
		return AjaxResult.SUCCESS;
    }
    
    /**
     * 
     * <p>函数名称：  queryNoticeByLoginView      </p>
     * <p>功能说明： 获取登录页通知公告列表
     *
     * </p>
     *<p>参数说明：</p>
     * @param model
     * @return
     *
     * @date   创建时间：2016年12月28日
     * @author 作者：xds
     */
    @RequestMapping(value = "queryNoticeByLoginView.do",name="通知公告-获取登录页通知公告列表")
    @ResponseBody
    public List<CmsNotice> queryNoticeByLoginView(Model model){
    	List<CmsNotice> noticeList = cmsNoticeService.getCmsNoticeListByLoginView(10);    	
    	return noticeList;
    }
    
    /**
     * 删除
     * @param cmsNotice 删除条件
	 */
	 @RequestMapping(value = "doDelete.do",name="通知公告首页删除" ,method = RequestMethod.POST)
	 @AjaxResponseBody
	 public AjaxResult doDelete(CmsNotice cmsNotice)  {
		cmsNoticeService.delCmsNotice(cmsNotice);
      	CacheHelper.getInstance("EGOV-INDEX-NOTICE").clear();//清空下缓存类		
		return AjaxResult.SUCCESS;
	 }
	   /**
     * 获取单条记录
     * @param  cmsNotice 条件
	 */
	 @RequestMapping(value="getCmsNotice.do")
	 @AjaxResponseBody
	 public CmsNotice getCmsNotice(CmsNotice cmsNotice) {
		return cmsNoticeService.getCmsNotice(cmsNotice);
	}
	 
	  /**
     * 获取列表
     * @param  cmsNotice 条件
	 */
	 @RequestMapping(value="getCmsNoticeList.do",name="通知公告首页查询列表")
	 @AjaxResponseBody
	 public List<CmsNotice> getCmsNoticeList(CmsNotice cmsNotice) {
		return cmsNoticeService.getCmsNoticeList(cmsNotice);
	}
	 /**
     * 获取分页
     * @param searcher 查询条件
     * @param page 分页信息
	 */
	 @RequestMapping(value="queryCmsNoticePage.do",name="通知公告首页分页查询")
	 @AjaxResponseBody
	 public  GridData queryCmsNoticePage(Searcher searcher, Page<CmsNotice> page,String status,String searchType,String timeType) {
		 StringBuffer condition = new StringBuffer();
		 if(StringUtilsExt.isNotBlank(status)){
			 searcher.addCondition("STATUS", status);
		 }
		 if(StringUtilsExt.isNotBlank(searchType)){
			 if(searchType.equals("1")){
				 LogicExpression logic = new LogicExpression();
				 logic.setOr(true);
				 logic.setLeft(new ValueExpression("TYPE", 0));
				 logic.setRight(new ValueExpression("TYPE", 1));
				 searcher.addCondition(logic);
			 } else if (searchType.equals("5")){
				 searcher.addCondition("TYPE", 5);
			 }
		 }
		 //0 近期公告
		 if(StringUtilsExt.equals(timeType, "0")){
			 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			 Date end = new Date();
			 Date start = DateUtilsExt.addDays(end,-7);
			 String endDate = format.format(end);
			 String startDate = format.format(start);
			 condition.append(" AND START_DATE >= '").append(startDate).append("'");
			 condition.append(" AND END_DATE <= '").append(endDate).append("'");
		 }
		 User user = AppContext.getAppContext().getSessionUser();
		 //return new GridData(new PageResult<CmsNotice>(cmsNoticeService.queryCmsNoticePage(searcher, page,condition.toString(),"ORDER BY realease_date DESC",user.getUserCode())));
		 Page<CmsNotice> noticePage = cmsNoticeService.queryCmsNoticePage(searcher, page,condition.toString(),"ORDER BY realease_date DESC",user.getUserCode());

		 AssetSysConfig assetSysConfig = new AssetSysConfig();
		 assetSysConfig.setConfigCode("NOTICE");
		 assetSysConfig.setConfigType("INDEX_CONFIG");
		 List<AssetSysConfig> list = configService.getAssetSysConfigList(assetSysConfig);
		 if(!SpringObjectUtilsExt.isEmpty(list) && !list.isEmpty()){
			 AssetSysConfig config = list.get(0);
			 String[] configStr = StringUtilsExt.toString(config.getConfigValue()).split(",");
			 for(int i = 0;i < configStr.length;i++){
				 //遍历每一条记录
				 for(int j =0;j < noticePage.size();j++){
					 CmsNotice notice = noticePage.get(j);
					 if(notice != null && notice.getId() != null){
						 if(StringUtilsExt.convertNullToString(notice.getId()).equals(configStr[i])){
							 //表明是首页弹窗
							 notice.setIsShow("1");
						 }
					 }
				 }
			 }
		 }
		 
		 return new GridData(new PageResult<CmsNotice>(noticePage));
	}
	 
	 @RequestMapping(value="updateReadRecord.do",name="更新公告读取次数")
	 @ResponseBody
	 public Map<String,Object> updateReadRecord(Model model,Long id){
	     User user = AppContext.getAppContext().getSessionUser();

		 Map<String,Object> result = new HashMap<String,Object>();
		 AssetBizUser bizUser = new AssetBizUser();
		 bizUser.setBizId(ComponetIdGen.newWKID());
		 bizUser.setBizId(id);
		 bizUser.setBizType("NOTICE");
		 bizUser.setCount(1);
		 bizUser.setUserCode(user.getUserCode());
		 bizUser.setUserId(user.getUserId());
		 bizUserService.updateOrInsertAssetBizUserRecord(bizUser);
		 return result;
	 }
	 
	 
	 /**
	  * 
	  * <p>函数名称：setIndexNoticeConfig        </p>
	  * <p>功能说明：设置首页弹窗公告信息，已读信息会清除，重置为0
	  *
	  * </p>
	  *<p>参数说明：</p>
	  * @param id 公告id
	  * @param reset 是否重置 值设置 此ID 
	  * @return
	  *
	  * @date   创建时间：2017年8月13日
	  * @author 作者：xds
	  */
	 @RequestMapping(value="updateIndexNoticeConfig.do",name="更新公告读取次数")
	 @ResponseBody
	 public Map<String,Object> setIndexNoticeConfig(List<String> id, boolean reset){
		 Map<String,Object> result = new HashMap<String,Object>();
		 if(id != null && id.size() > 10){
			 result.put("flag", false);
	         result.put("msg", "最多只能设置10条记录！");
	         return result;
		 }
		 AssetSysConfig assetSysConfig = new AssetSysConfig();
		 assetSysConfig.setConfigCode("NOTICE");
		 assetSysConfig.setConfigType("INDEX_CONFIG");
		 List<AssetSysConfig> list = configService.getAssetSysConfigList(assetSysConfig);
		 if(list == null || list.isEmpty()){ //不存在
			 assetSysConfig.setConfigId(ComponetIdGen.newWKID());
			 assetSysConfig.setConfigRemark("需要弹窗的公共信息");
			 assetSysConfig.setConfigValue(StringUtilsExt.join(id, ","));
			 assetSysConfig.setAppId("egov-asset-aims");
			 configService.addAssetSysConfig(assetSysConfig);
		 } else {
			 assetSysConfig = list.get(0);
			 //删除相应公告的查看记录
			 if(!SpringObjectUtilsExt.isEmpty(id)){
				 bizUserService.batchDeleteByBizId("NOTICE", id);
			 } 
			 //重置
			 if(reset){				 
				 assetSysConfig.setConfigValue(StringUtilsExt.join(id, ","));				 
			 } else {
				//无值
				 if(StringUtilsExt.isBlank(assetSysConfig.getConfigValue())){
					 assetSysConfig.setConfigValue(StringUtilsExt.join(id, ","));		
				 } else {
					 List<String> idStr = new ArrayList<String>();
					 for(int i = 0;i < id.size();i++){
						 int count = StringUtilsExt.countMatches(assetSysConfig.getConfigValue(), id.get(i));
						 if(count == 0){
							 idStr.add(id.get(i));
						 }
					 }
					 if(idStr != null && idStr.size() > 0){
						 String[] configStr = assetSysConfig.getConfigValue().split(",");
						 int count = idStr.size();
						 if(configStr != null && !SpringObjectUtilsExt.isEmpty(configStr)){
							 count = count+configStr.length;
						 }
						 if(count > 10){
							 result.put("flag", false);
					         result.put("msg", "最多只能设置10条记录！");
					         return result; 
						 }
						 assetSysConfig.setConfigValue(assetSysConfig.getConfigValue() + "," + StringUtilsExt.join(idStr, ","));
					 }
					 		
				 }
			 }
			 //更新
			 configService.updateAssetSysConfig(assetSysConfig);
			 
		 }
         result.put("flag", true);
         result.put("msg", "设置成功");
		 return result;
	 }
	 
	 
}