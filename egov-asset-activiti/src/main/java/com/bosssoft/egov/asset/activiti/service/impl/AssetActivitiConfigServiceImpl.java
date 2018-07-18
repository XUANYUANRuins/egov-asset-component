package com.bosssoft.egov.asset.activiti.service.impl;

/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Wed Mar 01 15:14:17 CST 2017
 */

import java.util.List;
import com.bosssoft.egov.asset.activiti.entity.AssetActivitiConfig;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bosssoft.egov.asset.activiti.service.AssetActivitiConfigService;
import com.bosssoft.egov.asset.activiti.mapper.AssetActivitiConfigMapper;


/**
 * 类说明: AssetActivitiConfigService接口实现类. 
 *
 * 类用途：
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-03-01   jinbiao　　　新建
 * </pre>
 */
@Service
public class AssetActivitiConfigServiceImpl implements AssetActivitiConfigService {

	private static Logger logger = LoggerFactory.getLogger(AssetActivitiConfigServiceImpl.class);

	// TODO 添加需要的Mapper
	@Autowired
	private AssetActivitiConfigMapper assetActivitiConfigMapper;
	
	/**
	 *
	 * @param assetActivitiConfig
	 */
	public void addAssetActivitiConfig(AssetActivitiConfig assetActivitiConfig)  {
		assetActivitiConfigMapper.insert(assetActivitiConfig);
	}

	/**
	 *
	 * @param assetActivitiConfig
	 */
	public void delAssetActivitiConfig(AssetActivitiConfig assetActivitiConfig)  {
		assetActivitiConfigMapper.deleteByPrimaryKey(assetActivitiConfig);
	}

	/**
	 *
	 * @param assetActivitiConfig
	 */
	public void updateAssetActivitiConfig(AssetActivitiConfig assetActivitiConfig)  {
		assetActivitiConfigMapper.updateByPrimaryKey(assetActivitiConfig);
	}

	/**
	 *
	 * @param assetActivitiConfig
	 * @retrun
	 */
	public List<AssetActivitiConfig> getAssetActivitiConfigList(AssetActivitiConfig assetActivitiConfig)  {
		return null;
	}

	/**
	 *
	 * @param searcher
	 * @param page
	 * @retrun
	 */
	public Page<AssetActivitiConfig> queryAssetActivitiConfigPage(Searcher searcher, Page<AssetActivitiConfig> page)  {
		return assetActivitiConfigMapper.queryAssetActivitiConfigPage(searcher, page);
	}

	public AssetActivitiConfig getOneConfigByKeyAndUserTaskDef(AssetActivitiConfig config) {
		return assetActivitiConfigMapper.selectOne(config);
	}

}