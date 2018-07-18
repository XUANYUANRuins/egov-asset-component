/**
 * 福建博思软件 1997-2018 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Sun Mar 25 13:15:40 CST 2018
 */
package com.bosssoft.egov.asset.activiti.mapper;

import org.apache.ibatis.annotations.Param;

import com.bosssoft.egov.asset.activiti.entity.ActivitiPermissionExt;
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
 * 2018-03-25   jinbiao　　　新建
 * </pre>

 */

public interface ActivitiPermissionExtMapper extends Mapper<ActivitiPermissionExt>{



/**
	 * 
	 * 查询分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return ActivitiPermissionExtPage列表
	 * @throws BusinessException 自定义异常
	 *
	 */
	public Page<ActivitiPermissionExt> queryActivitiPermissionExtPage(@Param("searcher")Searcher searcher,@Param("page")Page<ActivitiPermissionExt> page);
	
	public int delActivitiPermissionExtOrg(@Param("activitiKey")String activitiKey,@Param("busType")String busType,@Param("assignUsers")String assignUsers);
	
	public int delActivitiPermissionExtBus(@Param("activitiKey")String activitiKey,@Param("busType")String busType,@Param("assignUsers")String assignUsers);
	
	public int delActivitiPermissionExtById(@Param("id")Long id);
			
}