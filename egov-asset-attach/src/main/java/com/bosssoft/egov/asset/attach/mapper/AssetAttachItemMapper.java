/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Mon Dec 19 16:23:34 CST 2016
 */
package com.bosssoft.egov.asset.attach.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bosssoft.egov.asset.attach.entity.AssetAttachItem;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.persistence.common.Mapper;
import com.bosssoft.platform.common.lang.data.Searcher;
import com.bosssoft.platform.runtime.exception.BusinessException;

/**
 * 类说明: 资源-附件项配置表 Mapper接口（ Mapper层） .
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2016-12-19   Administrator　　　新建
 * </pre>

 */

public interface AssetAttachItemMapper extends Mapper<AssetAttachItem>{



/**
	 * 
	 * 查询资源-附件项配置表分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return AssetAttachItemPage列表
	 * @throws BusinessException 自定义异常
	 *
	 */
	public Page<AssetAttachItem> queryAssetAttachItemPage(@Param("searcher")Searcher searcher,@Param("page")Page<AssetAttachItem> page);
			
	public List<AssetAttachItem> checkAttachmentRequired(@Param("appId")String appId,@Param("bizType")List<String> bizType, @Param("itemType")List<String> itemType, @Param("grade")String grade, @Param("excludeItemCode") List<String> excludeItemCode,@Param("bizId")String bizId);
	
	/**
	 * 
	 * <p>函数名称：  queryAttachmentFileCount      </p>
	 * <p>功能说明： 根据条件查找 附件文件个数
	 *
	 * </p>
	 *<p>参数说明：</p>
	 * @param appId
	 * @param bizType
	 * @param itemType
	 * @param grade
	 * @param bizId
	 * @return
	 *
	 * @date   创建时间：2017年8月13日
	 * @author 作者：xds
	 */
	public List<AssetAttachItem> queryAttachmentFileCount(@Param("appId")String appId,@Param("bizType")List<String> bizType, @Param("itemType")List<String> itemType, @Param("grade")String grade, @Param("excludeItemCode") List<String> excludeItemCode,@Param("bizId")String bizId);


}