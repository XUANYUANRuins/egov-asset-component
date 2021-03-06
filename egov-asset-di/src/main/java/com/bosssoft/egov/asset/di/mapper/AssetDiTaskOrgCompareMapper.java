/**
 * 福建博思软件 1997-2018 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Tue Jan 16 10:22:39 CST 2018
 */
package com.bosssoft.egov.asset.di.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bosssoft.egov.asset.di.entity.AssetDiTaskOrgCompare;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;
import com.bosssoft.platform.persistence.common.Mapper;
import com.bosssoft.platform.runtime.exception.BusinessException;

/**
 * 类说明: 接口导入单位对照表 Mapper接口（ Mapper层） .
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2018-01-16   xiedeshou　　　新建
 * </pre>

 */

public interface AssetDiTaskOrgCompareMapper extends Mapper<AssetDiTaskOrgCompare>{



/**
	 * 
	 * 查询接口导入单位对照表分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return AssetDiTaskOrgComparePage列表
	 * @throws BusinessException 自定义异常
	 *
	 */
	public Page<AssetDiTaskOrgCompare> queryAssetDiTaskOrgComparePage(@Param("searcher")Searcher searcher,@Param("page")Page<AssetDiTaskOrgCompare> page);

	/**
	 * 
	 * <p>函数名称：  getAssetDiTaskOrgCompareFromTmp      </p>
	 * <p>功能说明：获取当前对照数据包对应对照单位信息 根据当前批次及单位 
	 *
	 * </p>
	 *<p>参数说明：</p>
	 * @param orgId
	 * @param batchId
	 * @return
	 *
	 * @date   创建时间：2018年1月17日
	 * @author 作者：xds (mailto:xiedeshou@bosssoft.com.cn)
	 */
    public List<AssetDiTaskOrgCompare> getAssetDiTaskOrgCompareFromTmp(@Param("orgId")Long orgId,@Param("batchId")Long batchId);
			


}