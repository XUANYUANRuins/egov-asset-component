package com.bosssoft.egov.asset.attach.service;
/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Fri Dec 02 09:07:45 CST 2016
 */

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosssoft.egov.asset.attach.entity.AssetAttachBiz;
import com.bosssoft.egov.asset.attach.mapper.AssetAttachBizMapper;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;


/**
 * 类说明: AssetAttachBizService接口实现类. 
 *
 * 类用途：
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2016-12-02   xiedeshou　　　新建
 * </pre>
 */
@Service
public class AssetAttachBizServiceImpl implements AssetAttachBizService {

	private static Logger logger = LoggerFactory.getLogger(AssetAttachBizServiceImpl.class);

	// TODO 添加需要的Mapper
	@Autowired
	private AssetAttachBizMapper assetAttachBizMapper;
	
	/**
	 *
	 * @param assetAttachBiz
	 */
	public void addAssetAttachBiz(AssetAttachBiz assetAttachBiz)  {
		assetAttachBizMapper.insert(assetAttachBiz);
	}

	/**
	 *
	 * @param assetAttachBiz
	 */
	public void delAssetAttachBiz(AssetAttachBiz assetAttachBiz)  {
		assetAttachBizMapper.deleteByPrimaryKey(assetAttachBiz);
	}

	/**
	 *
	 * @param assetAttachBiz
	 */
	public void updateAssetAttachBiz(AssetAttachBiz assetAttachBiz)  {
		assetAttachBizMapper.updateByPrimaryKey(assetAttachBiz);
	}

	/**
	 *
	 * @param assetAttachBiz
	 * @retrun
	 */
	public List<AssetAttachBiz> getAssetAttachBizList(AssetAttachBiz assetAttachBiz)  {
		return assetAttachBizMapper.select(assetAttachBiz);
	}

	/**
	 *
	 * @param searcher
	 * @param page
	 * @retrun
	 */
	public Page<AssetAttachBiz> queryAssetAttachBizPage(Searcher searcher, Page<AssetAttachBiz> page)  {
		return assetAttachBizMapper.queryAssetAttachBizPage(searcher, page);
	}

}