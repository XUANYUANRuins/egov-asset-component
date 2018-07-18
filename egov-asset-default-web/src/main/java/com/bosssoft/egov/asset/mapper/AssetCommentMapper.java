/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Tue May 23 14:48:33 CST 2017
 */
package com.bosssoft.egov.asset.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bosssoft.egov.asset.entity.AssetComment;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;
import com.bosssoft.platform.persistence.common.Mapper;
import com.bosssoft.platform.runtime.exception.BusinessException;

/**
 * 类说明: 常用意见 Mapper接口（ Mapper层） .
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-05-23   Administrator　　　新建
 * </pre>

 */

public interface AssetCommentMapper extends Mapper<AssetComment>{



/**
	 * 
	 * 查询常用意见分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return AssetCommentPage列表
	 * @throws BusinessException 自定义异常
	 *
	 */
	public Page<AssetComment> queryAssetCommentPage(@Param("searcher")Searcher searcher,@Param("page")Page<AssetComment> page);
			

	public List<AssetComment> queryAssetCommentListByUserCode(@Param("userCode")String userCode);
    
	public int addComment(@Param("list")List<AssetComment> list);
}