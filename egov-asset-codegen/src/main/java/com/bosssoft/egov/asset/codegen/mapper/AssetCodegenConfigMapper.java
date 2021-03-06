/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Wed Dec 07 08:29:00 CST 2016
 */
package com.bosssoft.egov.asset.codegen.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bosssoft.egov.asset.codegen.entity.AssetCodegenConfig;
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

public interface AssetCodegenConfigMapper extends Mapper<AssetCodegenConfig>{



/**
	 * 
	 * 查询分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return AssetCodegenConfigPage列表
	 * @throws BusinessException 自定义异常
	 *
	 */
	public Page<AssetCodegenConfig> queryAssetCodegenConfigPage(@Param("searcher")Searcher searcher,@Param("page")Page<AssetCodegenConfig> page);
			

	@Update(" UPDATE ASSET_CODEGEN_CONFIG SET CUR_NO = CUR_NO + (STEP*#{count}) WHERE ORG_ID = #{orgId} and BIZ_TYPE = #{bizType} AND STATUS=1")
	public int updateMax(@Param("orgId") String orgId, @Param("bizType") String bizType,@Param("count") int count);

	@Select(" SELECT MAX(GEN_RULE) AS GEN_RULE FROM ASSET_CODEGEN_CONFIG WHERE ORG_ID = #{orgId} and BIZ_TYPE = #{bizType} AND STATUS=1")
	public String getGenRule(@Param("orgId") String orgId, @Param("bizType") String bizType);
	
}