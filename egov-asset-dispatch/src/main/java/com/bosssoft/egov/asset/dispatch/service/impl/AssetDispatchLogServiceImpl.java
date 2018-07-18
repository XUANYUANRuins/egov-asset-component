package com.bosssoft.egov.asset.dispatch.service.impl;

/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Sun Jan 22 17:22:00 CST 2017
 */

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosssoft.egov.asset.dispatch.entity.AssetDispatchLog;
import com.bosssoft.egov.asset.dispatch.mapper.AssetDispatchLogMapper;
import com.bosssoft.egov.asset.dispatch.service.AssetDispatchLogService;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;


/**
 * 类说明: AssetDispatchLogService接口实现类. 
 *
 * 类用途：
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-01-22   Administrator　　　新建
 * </pre>
 */
@Service
public class AssetDispatchLogServiceImpl implements AssetDispatchLogService {

	private static Logger logger = LoggerFactory.getLogger(AssetDispatchLogServiceImpl.class);

	// TODO 添加需要的Mapper
	@Autowired
	private AssetDispatchLogMapper assetDispatchLogMapper;
	
	/**
	 *
	 * @param assetDispatchLog
	 */
	public void addAssetDispatchLog(AssetDispatchLog assetDispatchLog)  {
		assetDispatchLogMapper.insert(assetDispatchLog);
	}

	/**
	 *
	 * @param assetDispatchLog
	 */
	public void delAssetDispatchLog(AssetDispatchLog assetDispatchLog)  {
		assetDispatchLogMapper.deleteByPrimaryKey(assetDispatchLog);
	}

	/**
	 *
	 * @param assetDispatchLog
	 */
	public void updateAssetDispatchLog(AssetDispatchLog assetDispatchLog)  {
		assetDispatchLogMapper.updateByPrimaryKey(assetDispatchLog);
	}

	/**
	 *
	 * @param assetDispatchLog
	 * @retrun
	 */
	public List<AssetDispatchLog> getAssetDispatchLogList(AssetDispatchLog assetDispatchLog)  {
		return assetDispatchLogMapper.select(assetDispatchLog);
	}

	/**
	 *
	 * @param searcher
	 * @param page
	 * @retrun
	 */
	public Page<AssetDispatchLog> queryAssetDispatchLogPage(Searcher searcher, Page<AssetDispatchLog> page)  {
		return assetDispatchLogMapper.queryAssetDispatchLogPage(searcher, page);
	}

	@Override
	public AssetDispatchLog getAssetDispatchLog(
			AssetDispatchLog assetDispatchLog) {
		
		return assetDispatchLogMapper.selectOne(assetDispatchLog);
	}

	@Override
	public AssetDispatchLog getAssetDispatchLogById(
			AssetDispatchLog assetDispatchLog) {
		
		return assetDispatchLogMapper.selectByPrimaryKey(assetDispatchLog);
	}

	@Override
	public AssetDispatchLog getAssetDispatchLogById(Long logId) {

		return assetDispatchLogMapper.selectByPrimaryKey(logId);
	}

	public AssetDispatchLog queryOneIsExist(String logId) {
		
		AssetDispatchLog log = assetDispatchLogMapper.selectByPrimaryKey(logId);
		
		return log;
	}


}