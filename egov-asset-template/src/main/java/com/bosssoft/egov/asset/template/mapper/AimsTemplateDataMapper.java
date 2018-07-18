/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Tue Jul 18 17:04:19 CST 2017
 */
package com.bosssoft.egov.asset.template.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bosssoft.egov.asset.template.entity.AimsTemplateData;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;
import com.bosssoft.platform.persistence.common.Mapper;
import com.bosssoft.platform.runtime.exception.BusinessException;

/**
 * 类说明: 打印模版取数表 Mapper接口（ Mapper层） .
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-07-18   Linxt　　　新建
 * </pre>

 */

public interface AimsTemplateDataMapper extends Mapper<AimsTemplateData>{



/**
	 * 
	 * 查询打印模版取数表分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return AimsTemplateDataPage列表
	 * @throws BusinessException 自定义异常
	 *
	 * <pre>
	 * 修改日期　　　修改人　　　修改原因
     * 2017-07-18   Linxt　　　新建
	 * </pre>
	 */
	public Page<AimsTemplateData> queryAimsTemplateDataPage(@Param("searcher")Searcher searcher,@Param("page")Page<AimsTemplateData> page);

	public List<AimsTemplateData> queryByModuleItemId(@Param("moduleItemId") Long moduleItemId);
	
	public List<AimsTemplateData> geTemplateDatasByBizId(@Param("moduleItemId") Long moduleItemId,@Param("bizId") String bizId);
	
	public AimsTemplateData queryOne(@Param("id")Long id);
	/**
	 * 根据id修改取数模板信息
	 * @param aimsTemplateData
	 * @return
	 */
	public int updateById(AimsTemplateData aimsTemplateData);
	/**
	 * 跟id删除
	 * @param aimsTemplateData
	 * @return
	 */
	public int deleteById(AimsTemplateData aimsTemplateData);
}