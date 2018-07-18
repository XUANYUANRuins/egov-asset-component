/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Tue Sep 12 20:34:02 CST 2017
 */
package com.bosssoft.asset.etl.comp.mapper;

import org.apache.ibatis.annotations.Param;

import com.bosssoft.asset.etl.comp.entity.AssetEtlCompConfigDb;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;
import com.bosssoft.platform.persistence.common.Mapper;
import com.bosssoft.platform.runtime.exception.BusinessException;

/**
 * 类说明: 数据库输入输出配置 Mapper接口（ Mapper层） .
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-09-12   xiedeshou　　　新建
 * </pre>

 */

public interface AssetEtlCompConfigDbMapper extends Mapper<AssetEtlCompConfigDb>{



/**
	 * 
	 * 查询数据库输入输出配置分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return AssetEtlCompConfigDbPage列表
	 * @throws BusinessException 自定义异常
	 *
	 */
	public Page<AssetEtlCompConfigDb> queryAssetEtlCompConfigDbPage(@Param("searcher")Searcher searcher,@Param("page")Page<AssetEtlCompConfigDb> page);
			


}