
/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Sat Sep 23 11:36:09 CST 2017
 */
package com.bosssoft.asset.etl.service;

import java.util.List;
import com.bosssoft.asset.etl.entity.AssetEtlConfigAttr;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bosssoft.asset.etl.service.AssetEtlConfigAttrService;
import com.bosssoft.asset.etl.mapper.AssetEtlConfigAttrMapper;


/**
 * 类说明: AssetEtlConfigAttrService接口实现类. 
 *
 * 类用途：
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-09-23   xiedeshou　　　新建
 * </pre>
 */
@Service
public class AssetEtlConfigAttrServiceImpl implements AssetEtlConfigAttrService {

	private static Logger logger = LoggerFactory.getLogger(AssetEtlConfigAttrServiceImpl.class);

	// TODO 添加需要的Mapper
	@Autowired
	private AssetEtlConfigAttrMapper assetEtlConfigAttrMapper;
	
	/**
	 *
	 * @param assetEtlConfigAttr
	 */
	public void addAssetEtlConfigAttr(AssetEtlConfigAttr assetEtlConfigAttr)  {
		assetEtlConfigAttrMapper.insertSelective(assetEtlConfigAttr);
	}

	/**
	 *
	 * @param assetEtlConfigAttr
	 */
	public void delAssetEtlConfigAttr(AssetEtlConfigAttr assetEtlConfigAttr)  {
		assetEtlConfigAttrMapper.deleteByPrimaryKey(assetEtlConfigAttr);
	}

	/**
	 *
	 * @param assetEtlConfigAttr
	 */
	public void updateAssetEtlConfigAttr(AssetEtlConfigAttr assetEtlConfigAttr)  {
		assetEtlConfigAttrMapper.updateByPrimaryKey(assetEtlConfigAttr);
	}

	/**
	 *
	 * @param assetEtlConfigAttr
	 * @retrun
	 */
	public List<AssetEtlConfigAttr> getAssetEtlConfigAttrList(AssetEtlConfigAttr assetEtlConfigAttr)  {
		return assetEtlConfigAttrMapper.select(assetEtlConfigAttr);
	}

	/**
	 *
	 * @param searcher
	 * @param page
	 * @retrun
	 */
	public Page<AssetEtlConfigAttr> queryAssetEtlConfigAttrPage(Searcher searcher, Page<AssetEtlConfigAttr> page)  {
		return assetEtlConfigAttrMapper.queryAssetEtlConfigAttrPage(searcher, page);
	}


}