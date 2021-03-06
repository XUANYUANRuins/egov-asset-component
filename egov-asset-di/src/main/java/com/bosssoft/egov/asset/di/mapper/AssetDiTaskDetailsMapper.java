/**
 * 福建博思软件 1997-2018 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Sun Jan 14 22:24:55 CST 2018
 */
package com.bosssoft.egov.asset.di.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bosssoft.egov.asset.di.entity.AssetDiTaskDetails;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;
import com.bosssoft.platform.persistence.common.Mapper;
import com.bosssoft.platform.runtime.exception.BusinessException;

/**
 * 类说明:  Mapper接口（ Mapper层） .
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2018-01-14   xiedeshou　　　新建
 * </pre>

 */

public interface AssetDiTaskDetailsMapper extends Mapper<AssetDiTaskDetails>{



/**
	 * 
	 * 查询分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return AssetDiTaskDetailsPage列表
	 * @throws BusinessException 自定义异常
	 *
	 */
	public Page<AssetDiTaskDetails> queryAssetDiTaskDetailsPage(@Param("searcher")Searcher searcher,@Param("page")Page<AssetDiTaskDetails> page);

	/**
	 * 根据任务ID获取任务明细
	 * @param taskId
	 * @return
	 */
	public List<AssetDiTaskDetails> getAssetDiTaskDetailsList(@Param("taskId")String taskId);

}