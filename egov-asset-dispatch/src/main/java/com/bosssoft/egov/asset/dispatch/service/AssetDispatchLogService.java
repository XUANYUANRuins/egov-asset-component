/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Sun Jan 22 17:20:52 CST 2017
 */
package com.bosssoft.egov.asset.dispatch.service;

import java.util.List;

import com.bosssoft.egov.asset.dispatch.entity.AssetDispatchLog;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;



/**
 * 调度执行日志Service类接口 .
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-01-22   Administrator　　　新建
 * </pre>
 */
public interface AssetDispatchLogService {

/**
	 * 增加调度执行日志.
	 * 
	 * @param assetDispatchLog 调度执行日志
	 */
	public void addAssetDispatchLog(AssetDispatchLog assetDispatchLog);

	/**
	 * 删除调度执行日志及相关信息.
	 * 
	 * @param assetDispatchLog 调度执行日志
	 */
	public void delAssetDispatchLog(AssetDispatchLog assetDispatchLog);

	/**
	 * 修改调度执行日志.
	 * 
	 * @param assetDispatchLog 调度执行日志
	 */
	public void updateAssetDispatchLog(AssetDispatchLog assetDispatchLog);

	/**
	 * 获取调度执行日志列表.
	 * 
	 */
	public List<AssetDispatchLog> getAssetDispatchLogList(AssetDispatchLog assetDispatchLog);

    public AssetDispatchLog getAssetDispatchLog(AssetDispatchLog assetDispatchLog);
    
    public AssetDispatchLog getAssetDispatchLogById(AssetDispatchLog assetDispatchLog);
    
    public AssetDispatchLog getAssetDispatchLogById(Long logId);

   	/**
	 * 获取调度执行日志分页.
	 * 
		 */
	public Page<AssetDispatchLog> queryAssetDispatchLogPage(Searcher searcher, Page<AssetDispatchLog> page);
	
	public AssetDispatchLog queryOneIsExist(String logId);
	
}
 