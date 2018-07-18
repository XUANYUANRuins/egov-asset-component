package com.bosssoft.egov.asset.dispatch.service.impl;

/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Sun Jan 22 17:22:00 CST 2017
 */

import java.util.List;
import com.bosssoft.egov.asset.dispatch.entity.AssetDispatchJob;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bosssoft.egov.asset.dispatch.service.AssetDispatchJobService;
import com.bosssoft.egov.asset.dispatch.mapper.AssetDispatchJobMapper;


/**
 * 类说明: AssetDispatchJobService接口实现类. 
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
public class AssetDispatchJobServiceImpl implements AssetDispatchJobService {

	private static Logger logger = LoggerFactory.getLogger(AssetDispatchJobServiceImpl.class);

	// TODO 添加需要的Mapper
	@Autowired
	private AssetDispatchJobMapper assetDispatchJobMapper;
	
	/**
	 *
	 * @param assetDispatchJob
	 */
	public void addAssetDispatchJob(AssetDispatchJob assetDispatchJob)  {
		assetDispatchJobMapper.insert(assetDispatchJob);
	}

	/**
	 *
	 * @param assetDispatchJob
	 */
	public void delAssetDispatchJob(AssetDispatchJob assetDispatchJob)  {
		assetDispatchJobMapper.deleteByPrimaryKey(assetDispatchJob);
	}

	/**
	 *
	 * @param assetDispatchJob
	 */
	public void updateAssetDispatchJob(AssetDispatchJob assetDispatchJob)  {
		assetDispatchJobMapper.updateByPrimaryKey(assetDispatchJob);
	}

	/**
	 *
	 * @param assetDispatchJob
	 * @retrun
	 */
	public List<AssetDispatchJob> getAssetDispatchJobList(AssetDispatchJob assetDispatchJob)  {
		return assetDispatchJobMapper.select(assetDispatchJob);
	}

	/**
	 *
	 * @param searcher
	 * @param page
	 * @retrun
	 */
	public Page<AssetDispatchJob> queryAssetDispatchJobPage(Searcher searcher, Page<AssetDispatchJob> page)  {
		return assetDispatchJobMapper.queryAssetDispatchJobPage(searcher, page);
	}

	@Override
	public AssetDispatchJob getAssetDispatchJob(AssetDispatchJob dispatchJob) {		
		return assetDispatchJobMapper.selectOne(dispatchJob);
	}

	@Override
	public AssetDispatchJob getAssetDispatchJobById(Long jobId) {
		// TODO Auto-generated method stub
		return assetDispatchJobMapper.selectByPrimaryKey(jobId);
	}

	@Override
	public AssetDispatchJob getAssetDispatchJobById(
			AssetDispatchJob dispatchJob) {
		// TODO Auto-generated method stub
		return assetDispatchJobMapper.selectByPrimaryKey(dispatchJob);
	}


}