package com.bosssoft.egov.asset.dispatch.service.impl;

/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Mon Feb 20 09:42:50 CST 2017
 */

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosssoft.egov.asset.dispatch.entity.AssetDispatchMonitorTask;
import com.bosssoft.egov.asset.dispatch.mapper.AssetDispatchMonitorTaskMapper;
import com.bosssoft.egov.asset.dispatch.service.AssetDispatchMonitorTaskService;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;


/**
 * 类说明: AssetDispatchMonitorTaskService接口实现类. 
 *
 * 类用途：
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-02-20   jinbiao　　　新建
 * </pre>
 */
@Service
public class AssetDispatchMonitorTaskServiceImpl implements AssetDispatchMonitorTaskService {

	private static Logger logger = LoggerFactory.getLogger(AssetDispatchMonitorTaskServiceImpl.class);

	// TODO 添加需要的Mapper
	@Autowired
	private AssetDispatchMonitorTaskMapper assetDispatchMonitorTaskMapper;
	
	/**
	 *
	 * @param assetDispatchMonitorTask
	 */
	public void addAssetDispatchMonitorTask(AssetDispatchMonitorTask assetDispatchMonitorTask)  {
		assetDispatchMonitorTaskMapper.insert(assetDispatchMonitorTask);
	}

	/**
	 *
	 * @param assetDispatchMonitorTask
	 */
	public void delAssetDispatchMonitorTask(AssetDispatchMonitorTask assetDispatchMonitorTask)  {
		assetDispatchMonitorTaskMapper.deleteByPrimaryKey(assetDispatchMonitorTask);
	}

	/**
	 *
	 * @param assetDispatchMonitorTask
	 */
	public void updateAssetDispatchMonitorTask(AssetDispatchMonitorTask assetDispatchMonitorTask)  {
		assetDispatchMonitorTaskMapper.updateByPrimaryKey(assetDispatchMonitorTask);
	}

	/**
	 *
	 * @param assetDispatchMonitorTask
	 * @retrun
	 */
	public List<AssetDispatchMonitorTask> getAssetDispatchMonitorTaskList(AssetDispatchMonitorTask assetDispatchMonitorTask)  {
		return assetDispatchMonitorTaskMapper.select(assetDispatchMonitorTask);
	}

	/**
	 *
	 * @param searcher
	 * @param page
	 * @retrun
	 */
	public Page<AssetDispatchMonitorTask> queryAssetDispatchMonitorTaskPage(Searcher searcher, Page<AssetDispatchMonitorTask> page)  {
		return null;
	}

	public AssetDispatchMonitorTask queryOneByPrimaryKey(String key){
		return assetDispatchMonitorTaskMapper.selectByPrimaryKey(key);
	}

}