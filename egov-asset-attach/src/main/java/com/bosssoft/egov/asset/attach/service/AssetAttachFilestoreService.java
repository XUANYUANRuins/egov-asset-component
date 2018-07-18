/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Sat Jan 07 21:43:25 CST 2017
 */
package com.bosssoft.egov.asset.attach.service;

import java.util.List;

import com.bosssoft.egov.asset.attach.entity.AssetAttachFilestore;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;



/**
 * 文件存储表Service类接口 .
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-01-07   Administrator　　　新建
 * </pre>
 */
public interface AssetAttachFilestoreService {

/**
	 * 增加文件存储表.
	 * 
	 * @param assetAttachFilestore 文件存储表
	 */
	public void addAssetAttachFilestore(AssetAttachFilestore assetAttachFilestore);

	/**
	 * 删除文件存储表及相关信息.
	 * 
	 * @param assetAttachFilestore 文件存储表
	 */
	public void delAssetAttachFilestore(AssetAttachFilestore assetAttachFilestore);

	/**
	 * 修改文件存储表.
	 * 
	 * @param assetAttachFilestore 文件存储表
	 */
	public void updateAssetAttachFilestore(AssetAttachFilestore assetAttachFilestore);

	/**
	 * 获取文件存储表列表.
	 * 
	 */
	public List<AssetAttachFilestore> getAssetAttachFilestoreList(AssetAttachFilestore assetAttachFilestore);




   	/**
	 * 获取文件存储表分页.
	 * 
		 */
	public Page<AssetAttachFilestore> queryAssetAttachFilestorePage(Searcher searcher, Page<AssetAttachFilestore> page);
			
	public void saveFile(AssetAttachFilestore assetAttachFilestore);
    
}
 