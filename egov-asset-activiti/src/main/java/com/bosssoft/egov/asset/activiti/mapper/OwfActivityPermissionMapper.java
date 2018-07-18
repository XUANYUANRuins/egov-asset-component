/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Sat Nov 19 13:42:48 CST 2016
 */
package com.bosssoft.egov.asset.activiti.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bosssoft.egov.asset.activiti.entity.OwfActivityPermission;
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
 * 2016-11-19   jinbiao　　　新建
 * </pre>

 */

public interface OwfActivityPermissionMapper extends Mapper<OwfActivityPermission>{



/**
	 * 
	 * 查询分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return OwfActivityPermissionPage列表
	 * @throws BusinessException 自定义异常
	 *
	 */
	public Page<OwfActivityPermission> queryOwfActivityPermissionPage(@Param("searcher")Searcher searcher,@Param("page")Page<OwfActivityPermission> page);
		
	
	public List<OwfActivityPermission> queryOwfActivityPermissionByProcessDefId(@Param("defId")String defId,@Param("userTaskId")String userTaskId);
	
	public List<OwfActivityPermission> queryOwfActivityPermissionByProcessByDefId(@Param("defId")String defId);
	
	public List<OwfActivityPermission> updateVersionQuery(@Param("likeKey")String likeKey);

	public void updateVersion(@Param("id")Integer id,@Param("nowKey")String nowKey);

	public void deletePermissionWhenDeleteProcess(@Param("likeId")String likeId);

	public List<OwfActivityPermission> getListByRoleLike(@Param("like")String like, @Param("userTaskDef")String userTaskDef, @Param("pdefid")String pdefid);
	
	public List<OwfActivityPermission> getListByRoleCodeLike(@Param("like") String like, @Param("pdefid") String pdefid);

}