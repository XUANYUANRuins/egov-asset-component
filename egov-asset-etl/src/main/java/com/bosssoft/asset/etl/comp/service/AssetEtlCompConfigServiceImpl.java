package com.bosssoft.asset.etl.comp.service;

/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Mon Sep 11 21:08:37 CST 2017
 */

import java.util.List;
import com.bosssoft.asset.etl.comp.entity.AssetEtlCompConfig;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bosssoft.asset.etl.comp.service.AssetEtlCompConfigService;
import com.bosssoft.asset.etl.comp.mapper.AssetEtlCompConfigMapper;


/**
 * 类说明: AssetEtlCompConfigService接口实现类. 
 *
 * 类用途：
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-09-11   xiedeshou　　　新建
 * </pre>
 */
@Service
public class AssetEtlCompConfigServiceImpl implements AssetEtlCompConfigService {

	private static Logger logger = LoggerFactory.getLogger(AssetEtlCompConfigServiceImpl.class);

	// TODO 添加需要的Mapper
	@Autowired
	private AssetEtlCompConfigMapper assetEtlCompConfigMapper;
	
	/**
	 *
	 * @param assetEtlCompConfig
	 */
	public void addAssetEtlCompConfig(AssetEtlCompConfig assetEtlCompConfig)  {
		assetEtlCompConfigMapper.insert(assetEtlCompConfig);
	}

	/**
	 *
	 * @param assetEtlCompConfig
	 */
	public void delAssetEtlCompConfig(AssetEtlCompConfig assetEtlCompConfig)  {
		assetEtlCompConfigMapper.deleteByPrimaryKey(assetEtlCompConfig);
	}

	/**
	 *
	 * @param assetEtlCompConfig
	 */
	public void updateAssetEtlCompConfig(AssetEtlCompConfig assetEtlCompConfig)  {
		assetEtlCompConfigMapper.updateByPrimaryKey(assetEtlCompConfig);
	}

	/**
	 *
	 * @param assetEtlCompConfig
	 * @retrun
	 */
	public List<AssetEtlCompConfig> getAssetEtlCompConfigList(AssetEtlCompConfig assetEtlCompConfig)  {
		return assetEtlCompConfigMapper.select(assetEtlCompConfig);
	}

	/**
	 *
	 * @param searcher
	 * @param page
	 * @retrun
	 */
	public Page<AssetEtlCompConfig> queryAssetEtlCompConfigPage(Searcher searcher, Page<AssetEtlCompConfig> page)  {
		return assetEtlCompConfigMapper.queryAssetEtlCompConfigPage(searcher, page);
	}


}