/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Sat Mar 04 11:38:21 CST 2017
 */
package com.bosssoft.egov.asset.activiti.mapper;

import org.apache.ibatis.annotations.Param;

import com.bosssoft.egov.asset.activiti.entity.ActivitiBizAction;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.persistence.common.Mapper;
import com.bosssoft.platform.common.lang.data.Searcher;
import com.bosssoft.platform.runtime.exception.BusinessException;

/**
 * 类说明:  Mapper接口（ Mapper层） .
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-03-04   jinbiao　　　新建
 * </pre>

 */

public interface ActivitiBizActionMapper extends Mapper<ActivitiBizAction>{



/**
	 * 
	 * 查询分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return ActivitiBizActionPage列表
	 * @throws BusinessException 自定义异常
	 *
	 */
	public Page<ActivitiBizAction> queryActivitiBizActionPage(@Param("searcher")Searcher searcher,@Param("page")Page<ActivitiBizAction> page);
			


}