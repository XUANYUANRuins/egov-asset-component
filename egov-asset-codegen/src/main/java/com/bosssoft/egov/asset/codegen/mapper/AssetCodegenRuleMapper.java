/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Wed Dec 07 08:29:00 CST 2016
 */
package com.bosssoft.egov.asset.codegen.mapper;

import org.apache.ibatis.annotations.Param;

import com.bosssoft.egov.asset.codegen.entity.AssetCodegenRule;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.persistence.common.Mapper;
import com.bosssoft.platform.common.lang.data.Searcher;

/**
 * 类说明:  Mapper接口（ Mapper层） .
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2016-12-07   xiedeshou　　　新建
 * </pre>

 */

public interface AssetCodegenRuleMapper extends Mapper<AssetCodegenRule>{



/**
	 * 
	 * 查询分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return AssetCodegenRulePage列表
	 * @throws BusinessException 自定义异常
	 *
	 */
	public Page<AssetCodegenRule> queryAssetCodegenRulePage(@Param("searcher")Searcher searcher,@Param("page")Page<AssetCodegenRule> page);
			


}