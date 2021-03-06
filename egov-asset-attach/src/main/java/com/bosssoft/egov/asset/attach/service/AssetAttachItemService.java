/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Mon Dec 19 16:15:49 CST 2016
 */
package com.bosssoft.egov.asset.attach.service;

import java.util.List;

import com.bosssoft.egov.asset.attach.entity.AssetAttachItem;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;



/**
 * 资源-附件项配置表Service类接口 .
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2016-12-19   Administrator　　　新建
 * </pre>
 */
public interface AssetAttachItemService {

/**
	 * 增加资源-附件项配置表.
	 * 
	 * @param assetAttachItem 资源-附件项配置表
	 */
	public void addAssetAttachItem(AssetAttachItem assetAttachItem);

	/**
	 * 删除资源-附件项配置表及相关信息.
	 * 
	 * @param assetAttachItem 资源-附件项配置表
	 */
	public void delAssetAttachItem(AssetAttachItem assetAttachItem);

	/**
	 * 修改资源-附件项配置表.
	 * 
	 * @param assetAttachItem 资源-附件项配置表
	 */
	public void updateAssetAttachItem(AssetAttachItem assetAttachItem);

	/**
	 * 获取资源-附件项配置表列表.
	 * 
	 */
	public List<AssetAttachItem> getAssetAttachItemList(AssetAttachItem assetAttachItem);




   	/**
	 * 获取资源-附件项配置表分页.
	 * 
		 */
	public Page<AssetAttachItem> queryAssetAttachItemPage(Searcher searcher, Page<AssetAttachItem> page);
			
    
}
 