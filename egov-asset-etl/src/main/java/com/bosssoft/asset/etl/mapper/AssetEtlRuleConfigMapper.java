/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Wed Sep 13 00:04:57 CST 2017
 */
package com.bosssoft.asset.etl.mapper;

import org.apache.ibatis.annotations.Param;

import com.bosssoft.asset.etl.entity.AssetEtlRuleConfig;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;
import com.bosssoft.platform.persistence.common.Mapper;
import com.bosssoft.platform.runtime.exception.BusinessException;

/**
 * 类说明: 字段中间对照关系表 Mapper接口（ Mapper层） .
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-09-13   xiedeshou　　　新建
 * </pre>

 */

public interface AssetEtlRuleConfigMapper extends Mapper<AssetEtlRuleConfig>{



/**
	 * 
	 * 查询字段中间对照关系表分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return AssetEtlRuleConfigPage列表
	 * @throws BusinessException 自定义异常
	 *
	 */
	public Page<AssetEtlRuleConfig> queryAssetEtlRuleConfigPage(@Param("searcher")Searcher searcher,@Param("page")Page<AssetEtlRuleConfig> page);
			


}