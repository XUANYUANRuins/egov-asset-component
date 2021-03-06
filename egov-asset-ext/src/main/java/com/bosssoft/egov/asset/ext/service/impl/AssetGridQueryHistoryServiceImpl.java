/*******************************************************************************
 * 福建博思软件1997-2017 版权所有
 * 
 * Auto generated by Bosssoft Studio version 1.0 beta
 * 2017年12月29日上午10:39:22
 *******************************************************************************/
package com.bosssoft.egov.asset.ext.service.impl;

import org.springframework.stereotype.Service;

import com.bosssoft.egov.asset.common.util.DateUtilsExt;
import com.bosssoft.egov.asset.common.util.StringUtilsExt;
import com.bosssoft.egov.asset.ext.cache.AssetGridQueryHistoryCacheManager;
import com.bosssoft.egov.asset.ext.entity.AssetGridQueryHistory;
import com.bosssoft.egov.asset.ext.service.AssetGridQueryHistoryService;
import com.bosssoft.egov.asset.ext.utils.AssetGridExtCacheUtil;
import com.bosssoft.platform.runtime.web.response.AjaxResult;

/**
 * @ClassName	类名：AssetGridQueryHistoryServiceImpl.java
 * @Description	功能说明：TODO
 * <pre>
 * @date		创建日期：2017年12月29日
 * @author		创建人：chenzhibin
 * @version		版本号：V1.0
 * <pre>
 *-------------------修订记录---------------------
 */
@Service
public class AssetGridQueryHistoryServiceImpl implements AssetGridQueryHistoryService {

	@Override
	public AssetGridExtCacheUtil<AssetGridQueryHistory> getGridQueryHistory(AssetGridQueryHistory history) {
		String message = validationQueryHistory(history);
		if(!StringUtilsExt.isBlank(message)){
			throw new RuntimeException(message);
		}
		
		return AssetGridQueryHistoryCacheManager.getInstance().get(history);
	}

	@Override
	public AjaxResult saveQueryHistory(AssetGridQueryHistory history) {
		AjaxResult result = validationQueryHistory(history, "历史查询记录已清空！");
		if(result.getStatusCode() == AjaxResult.STATUS_ERROR){
			return result;
		}
		String queryName = DateUtilsExt.getNowDateTime().substring(0, 14) + 
				(StringUtilsExt.isBlank(history.getQueryName()) ? "" : (":" + history.getQueryName()));
		history.setQueryName(queryName.length() > 200 ? queryName.substring(0, 190) + "..." : queryName);
		
		AssetGridQueryHistory queryHistory = AssetGridQueryHistoryCacheManager.getInstance().put(history, 5);
		result.setData(queryHistory);
		
		return result;
	}

	@Override
	public AjaxResult clearQueryHistory(AssetGridQueryHistory history) {
		AjaxResult result = validationQueryHistory(history, "历史查询记录已清空！");
		if(result.getStatusCode() == AjaxResult.STATUS_ERROR){
			return result;
		}
		
		AssetGridQueryHistoryCacheManager.getInstance().clear(history, true);
		
		return result;
	}

	/**
	 * <p>功能说明：数据验证
	 * </p>
	 * <p>参数说明：
	 * @param history
	 * @param msg
	 * @return
	 * </p>
	 *
	 * @date	创建时间：2017年12月29日
	 * @author	作者：chenzhibin
	 */
	private AjaxResult validationQueryHistory(AssetGridQueryHistory history, String msg){
		AjaxResult result = new AjaxResult(AjaxResult.STATUS_SUCCESS, msg);
		
		String message = validationQueryHistory(history);
		if(!StringUtilsExt.isBlank(message)){
			result.setStatusCode(AjaxResult.STATUS_ERROR);
			result.setMessage(message);
			return result;
		}
		
		return result;
	}
	
	private String validationQueryHistory(AssetGridQueryHistory history){
		if(history == null){
			return "网格配置不存在！";
		}
		
		if(StringUtilsExt.isBlank(history.getUserCode())){
			return "用户信息不存在！";
		}
		
		if(StringUtilsExt.isBlank(history.getGridId())){
			return "网格配置不存在！";
		}
		
		if(StringUtilsExt.isBlank(history.getBizType())){
			return "业务类型不存在！";
		}
		
		return null;
	}
}
