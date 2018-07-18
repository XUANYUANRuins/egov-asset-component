package com.bosssoft.egov.asset.attach.service;

/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Sat Jan 07 21:47:51 CST 2017
 */

import java.util.List;
import com.bosssoft.egov.asset.attach.entity.AssetAttachFilestore;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bosssoft.egov.asset.attach.service.AssetAttachFilestoreService;
import com.bosssoft.egov.asset.attach.mapper.AssetAttachFilestoreMapper;


/**
 * 类说明: AssetAttachFilestoreService接口实现类. 
 *
 * 类用途：
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-01-07   Administrator　　　新建
 * </pre>
 */
@Service
public class AssetAttachFilestoreServiceImpl implements AssetAttachFilestoreService {

	private static Logger logger = LoggerFactory.getLogger(AssetAttachFilestoreServiceImpl.class);

	// TODO 添加需要的Mapper
	@Autowired
	private AssetAttachFilestoreMapper assetAttachFilestoreMapper;
	
	/**
	 *
	 * @param assetAttachFilestore
	 */
	public void addAssetAttachFilestore(AssetAttachFilestore assetAttachFilestore)  {
		assetAttachFilestoreMapper.insert(assetAttachFilestore);
	}

	/**
	 *
	 * @param assetAttachFilestore
	 */
	public void delAssetAttachFilestore(AssetAttachFilestore assetAttachFilestore)  {
		assetAttachFilestoreMapper.deleteByPrimaryKey(assetAttachFilestore);
	}

	/**
	 *
	 * @param assetAttachFilestore
	 */
	public void updateAssetAttachFilestore(AssetAttachFilestore assetAttachFilestore)  {
		assetAttachFilestoreMapper.updateByPrimaryKey(assetAttachFilestore);
	}

	/**
	 *
	 * @param assetAttachFilestore
	 * @retrun
	 */
	public List<AssetAttachFilestore> getAssetAttachFilestoreList(AssetAttachFilestore assetAttachFilestore)  {
		return null;
	}

	/**
	 *
	 * @param searcher
	 * @param page
	 * @retrun
	 */
	public Page<AssetAttachFilestore> queryAssetAttachFilestorePage(Searcher searcher, Page<AssetAttachFilestore> page)  {
		return null;
	}

	@Override
	public void saveFile(AssetAttachFilestore assetAttachFilestore) {
		// TODO Auto-generated method stub
		assetAttachFilestoreMapper.saveFiles(assetAttachFilestore.getId(), assetAttachFilestore.getContent());
	}


}