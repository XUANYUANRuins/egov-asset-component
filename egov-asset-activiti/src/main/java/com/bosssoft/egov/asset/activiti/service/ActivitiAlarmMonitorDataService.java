/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Tue Jun 20 09:49:29 CST 2017
 */
package com.bosssoft.egov.asset.activiti.service;

import java.util.List;

import com.bosssoft.egov.asset.activiti.entity.ActivitiAlarmMonitorData;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;



/**
 * Service类接口 .
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-06-20   jinbiao　　　新建
 * </pre>
 */
public interface ActivitiAlarmMonitorDataService {

/**
	 * 增加.
	 * 
	 * @param activitiAlarmMonitorData 
	 */
	public void addActivitiAlarmMonitorData(ActivitiAlarmMonitorData activitiAlarmMonitorData);

	/**
	 * 删除及相关信息.
	 * 
	 * @param activitiAlarmMonitorData 
	 */
	public void delActivitiAlarmMonitorData(ActivitiAlarmMonitorData activitiAlarmMonitorData);
	
	public void delActivitiAlarmMonitorDataByComplete(int c);

	/**
	 * 修改.
	 * 
	 * @param activitiAlarmMonitorData 
	 */
	public void updateActivitiAlarmMonitorData(ActivitiAlarmMonitorData activitiAlarmMonitorData);

	/**
	 * 获取列表.
	 * 
	 */
	public List<ActivitiAlarmMonitorData> getActivitiAlarmMonitorDataList(ActivitiAlarmMonitorData activitiAlarmMonitorData);




   	/**
	 * 获取分页.
	 * 
		 */
	public Page<ActivitiAlarmMonitorData> queryActivitiAlarmMonitorDataPage(Searcher searcher, Page<ActivitiAlarmMonitorData> page);
			
	public List<ActivitiAlarmMonitorData> queryBySql(String querysql);
	
	public void updateCompleteTimeByBusId( int isComplete, String endTime, String busId, String pid);
	
	public void updateCompleteTimeByBusIdNoPid(int isComplete, String endTime, String busId);
	
	public void delActivitiAlarmMonitorDataAll();
	
	public void insertBySql(String insertsql);
	
	public void addAlarmPro();
	
	public void updateRoleCodeBusId(String roleCode, String busId, String pid);
	
	public void updateRoleCodeBusIdNoPid(String roleCode, String busId);
}
 