/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Sat Nov 19 13:40:53 CST 2016
 */
package com.bosssoft.egov.asset.activiti.service;

import java.util.List;

import com.bosssoft.egov.asset.activiti.entity.ActivitiTaskMoveComboboxShow;
import com.bosssoft.egov.asset.activiti.entity.OwfActivityPermission;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;

/**
 * Service类接口 .
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2016-11-19   jinbiao　　　新建
 * </pre>
 */
public interface OwfActivityPermissionService {

	/**
	 * 增加.
	 * 
	 * @param owfActivityPermission
	 */
	public void addOwfActivityPermission(OwfActivityPermission owfActivityPermission);

	/**
	 * 删除及相关信息.
	 * 
	 * @param owfActivityPermission
	 */
	public void delOwfActivityPermission(OwfActivityPermission owfActivityPermission);

	/**
	 * 修改.
	 * 
	 * @param owfActivityPermission
	 */
	public void updateOwfActivityPermission(OwfActivityPermission owfActivityPermission);

	/**
	 * 获取列表.
	 * 
	 */
	public List<OwfActivityPermission> getOwfActivityPermissionList(OwfActivityPermission owfActivityPermission);

	/**
	 * 获取分页.
	 * 
	 */
	public List<OwfActivityPermission> queryOwfActivityPermissionPage(Searcher searcher, Page<OwfActivityPermission> page);

	public List<OwfActivityPermission> queryOwfActivityPermissionByProcessDefId(String defId, String userTaskId);

	public List<OwfActivityPermission> queryOwfActivityPermissionByProcessDefId(String defId);

	public List<ActivitiTaskMoveComboboxShow> getUserTaskList(OwfActivityPermission owfActivityPermission);

	public void batchDelOwfActivityPermission(List<OwfActivityPermission> owfActivityPermissions);

	public void updateVersion(String nowKey, String likeKey);

	public void deletePermissionWhenDeleteProcess(String likeId);

	public List<OwfActivityPermission> getListByRoleLike(String roleLike, String userTaskDef, String pdefid);

	public List<OwfActivityPermission> getListByRoleCodeLike(String roleLike, String pdefid);
}
