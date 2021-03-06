/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Wed Dec 07 08:28:12 CST 2016
 */
package com.bosssoft.egov.asset.codegen.service;

import java.util.List;

import com.bosssoft.egov.asset.codegen.entity.AssetCodegenConfig;
import com.bosssoft.egov.asset.codegen.entity.AssetCodegenRule;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;



/**
 * Service类接口 .
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2016-12-07   xiedeshou　　　新建
 * </pre>
 */
public interface AssetCodegenConfigService {

/**
	 * 增加.
	 * 
	 * @param assetCodegenConfig 
	 */
	public void addAssetCodegenConfig(AssetCodegenConfig assetCodegenConfig);
	
	public void addAssetCodegenConfig(AssetCodegenConfig assetCodegenConfig,List<AssetCodegenRule> codegenRules);

	/**
	 * 删除及相关信息.
	 * 
	 * @param assetCodegenConfig 
	 */
	public void delAssetCodegenConfig(AssetCodegenConfig assetCodegenConfig);

	/**
	 * 修改.
	 * 
	 * @param assetCodegenConfig 
	 */
	public void updateAssetCodegenConfig(AssetCodegenConfig assetCodegenConfig);

	/**
	 * 获取列表.
	 * 
	 */
	public List<AssetCodegenConfig> getAssetCodegenConfigList(AssetCodegenConfig assetCodegenConfig);

	/**
	 * 
	 * <p>函数名称：   getAssetCodegenConfig     </p>
	 * <p>功能说明：  根据orgId 及业务类型 获取getAssetCodegenConfig（已包含 规则列表）
	 *               不存在会默认创建一个默认的
	 *
	 * </p>
	 *<p>参数说明：</p>
	 * @param orgId
	 * @param bizType
	 * @return
	 *
	 * @date   创建时间：2016年12月14日
	 * @author 作者：xds
	 */
    public AssetCodegenConfig getAssetCodegenConfig(Object orgId, String bizType);
    /**
	 * 
	 * <p>函数名称：   getAssetCodegenConfig     </p>
	 * <p>功能说明：  根据orgId 及业务类型 获取getAssetCodegenConfig（已包含 规则列表）
	 *               不存在会默认创建一个默认的
	 *
	 * </p>
	 *<p>参数说明：</p>
	 * @param orgId
	 * @param bizType
	 * @param batchCount 一次性返回的批次号
	 * @return
	 *
	 * @date   创建时间：2016年12月14日
	 * @author 作者：xds
	 */
    public AssetCodegenConfig getAssetCodegenConfig(Object orgId, String bizType,int batchCount);
    
    public AssetCodegenConfig getAssetCodegenConfig(AssetCodegenConfig assetCodegenConfig);
    public String getAssetCodegenConfigGenRule(Object orgId, String bizType);
    public int updateAssetCodegenConfigSelective(AssetCodegenConfig assetCodegenConfig);

   	/**
	 * 获取分页.
	 * 
		 */
	public Page<AssetCodegenConfig> queryAssetCodegenConfigPage(Searcher searcher, Page<AssetCodegenConfig> page);
			
	/**
	 * 
	 * <p>函数名称： isGobel       </p>
	 * <p>功能说明：是否为全局变量
	 *
	 * </p>
	 *<p>参数说明：</p>
	 * @param bizType
	 * @return
	 *
	 * @date   创建时间：2017年1月8日
	 * @author 作者：xds
	 */
	public boolean isGobel(String bizType);
    
}
 