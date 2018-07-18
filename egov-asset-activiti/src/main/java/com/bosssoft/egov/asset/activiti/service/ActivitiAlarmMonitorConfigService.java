/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Tue Jun 20 09:50:10 CST 2017
 */
package com.bosssoft.egov.asset.activiti.service;

import java.util.List;

import com.bosssoft.egov.asset.activiti.entity.ActivitiAlarmMonitorConfig;
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
public interface ActivitiAlarmMonitorConfigService {

/**
	 * 增加.
	 * 
	 * @param activitiAlarmMonitorConfig 
	 */
	public void addActivitiAlarmMonitorConfig(ActivitiAlarmMonitorConfig activitiAlarmMonitorConfig);

	/**
	 * 删除及相关信息.
	 * 
	 * @param activitiAlarmMonitorConfig 
	 */
	public void delActivitiAlarmMonitorConfig(ActivitiAlarmMonitorConfig activitiAlarmMonitorConfig);

	/**
	 * 修改.
	 * 
	 * @param activitiAlarmMonitorConfig 
	 */
	public void updateActivitiAlarmMonitorConfig(ActivitiAlarmMonitorConfig activitiAlarmMonitorConfig);

	/**
	 * 获取列表.
	 * 
	 */
	public List<ActivitiAlarmMonitorConfig> getActivitiAlarmMonitorConfigList(ActivitiAlarmMonitorConfig activitiAlarmMonitorConfig);




   	/**
	 * 获取分页.
	 * 
		 */
	public Page<ActivitiAlarmMonitorConfig> queryActivitiAlarmMonitorConfigPage(Searcher searcher, Page<ActivitiAlarmMonitorConfig> page);
			
 
	public int queryNotWorkDay(String beginTime,String endTime);
}
 