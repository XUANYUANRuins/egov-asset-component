/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Tue Dec 26 11:26:04 CST 2017
 */
package com.bosssoft.egov.asset.lifecycle.service;

import java.util.List;

import com.bosssoft.egov.asset.lifecycle.entity.AssetLifeLog;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;




/**
 * Service类接口 .
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-12-26   Wiesel　　　新建
 * </pre>
 */
public interface AssetLifeLogService {

/**
	 * 增加.
	 * 
	 * @param assetLifeLog 
	 */
	public void addAssetLifeLog(AssetLifeLog assetLifeLog);

	/**
	 * 删除及相关信息.
	 * 
	 * @param assetLifeLog 
	 */
//	public void delAssetLifeLog(AssetLifeLog assetLifeLog);

	/**
	 * 修改.
	 * 
	 * @param assetLifeLog 
	 */
	public void updateAssetLifeLog(AssetLifeLog assetLifeLog);

	/**
	 * 获取列表.
	 * 
	 */
	public List<AssetLifeLog> getAssetLifeLogList(AssetLifeLog assetLifeLog);

	/**
	 * 获取列表.
	 * 
	 */
	public AssetLifeLog getAssetLifeLog(Long id);



   	/**
	 * 获取分页.
	 * 
		 */
	public Page<AssetLifeLog> queryAssetLifeLogPage(Searcher searcher, Page<AssetLifeLog> page);
			
    
}
 