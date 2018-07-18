/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Mon Feb 20 09:39:36 CST 2017
 */
package com.bosssoft.egov.asset.dispatch.service;

import java.util.List;

import com.bosssoft.egov.asset.dispatch.entity.AssetDispatchMonitorTask;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;



/**
 * Service类接口 .
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-02-20   jinbiao　　　新建
 * </pre>
 */
public interface AssetDispatchMonitorTaskService {

/**
	 * 增加.
	 * 
	 * @param assetDispatchMonitorTask 
	 */
	public void addAssetDispatchMonitorTask(AssetDispatchMonitorTask assetDispatchMonitorTask);

	/**
	 * 删除及相关信息.
	 * 
	 * @param assetDispatchMonitorTask 
	 */
	public void delAssetDispatchMonitorTask(AssetDispatchMonitorTask assetDispatchMonitorTask);

	/**
	 * 修改.
	 * 
	 * @param assetDispatchMonitorTask 
	 */
	public void updateAssetDispatchMonitorTask(AssetDispatchMonitorTask assetDispatchMonitorTask);

	/**
	 * 获取列表.
	 * 
	 */
	public List<AssetDispatchMonitorTask> getAssetDispatchMonitorTaskList(AssetDispatchMonitorTask assetDispatchMonitorTask);




   	/**
	 * 获取分页.
	 * 
		 */
	public Page<AssetDispatchMonitorTask> queryAssetDispatchMonitorTaskPage(Searcher searcher, Page<AssetDispatchMonitorTask> page);
 
	public AssetDispatchMonitorTask queryOneByPrimaryKey(String key);
}
 