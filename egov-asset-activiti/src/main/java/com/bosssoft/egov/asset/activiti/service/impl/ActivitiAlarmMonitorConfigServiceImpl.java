package com.bosssoft.egov.asset.activiti.service.impl;

/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Tue Jun 20 09:50:50 CST 2017
 */

import java.util.List;

import com.bosssoft.egov.asset.activiti.entity.ActivitiAlarmMonitorConfig;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosssoft.egov.asset.activiti.service.ActivitiAlarmMonitorConfigService;
import com.bosssoft.egov.asset.activiti.mapper.ActivitiAlarmMonitorConfigMapper;


/**
 * 类说明: ActivitiAlarmMonitorConfigService接口实现类. 
 *
 * 类用途：
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-06-20   jinbiao　　　新建
 * </pre>
 */
@Service
public class ActivitiAlarmMonitorConfigServiceImpl implements ActivitiAlarmMonitorConfigService {

	private static Logger logger = LoggerFactory.getLogger(ActivitiAlarmMonitorConfigServiceImpl.class);

	// TODO 添加需要的Mapper
	@Autowired
	private ActivitiAlarmMonitorConfigMapper activitiAlarmMonitorConfigMapper;
	
	/**
	 *
	 * @param activitiAlarmMonitorConfig
	 */
	public void addActivitiAlarmMonitorConfig(ActivitiAlarmMonitorConfig activitiAlarmMonitorConfig)  {
		activitiAlarmMonitorConfigMapper.insert(activitiAlarmMonitorConfig);
	}

	/**
	 *
	 * @param activitiAlarmMonitorConfig
	 */
	public void delActivitiAlarmMonitorConfig(ActivitiAlarmMonitorConfig activitiAlarmMonitorConfig)  {
		activitiAlarmMonitorConfigMapper.deleteByPrimaryKey(activitiAlarmMonitorConfig);
	}

	/**
	 *
	 * @param activitiAlarmMonitorConfig
	 */
	public void updateActivitiAlarmMonitorConfig(ActivitiAlarmMonitorConfig activitiAlarmMonitorConfig)  {
		activitiAlarmMonitorConfigMapper.updateByPrimaryKey(activitiAlarmMonitorConfig);
	}

	/**
	 *
	 * @param activitiAlarmMonitorConfig
	 * @retrun
	 */
	public List<ActivitiAlarmMonitorConfig> getActivitiAlarmMonitorConfigList(ActivitiAlarmMonitorConfig activitiAlarmMonitorConfig)  {
		return activitiAlarmMonitorConfigMapper.selectAll();
	}

	/**
	 *
	 * @param searcher
	 * @param page
	 * @retrun
	 */
	public Page<ActivitiAlarmMonitorConfig> queryActivitiAlarmMonitorConfigPage(Searcher searcher, Page<ActivitiAlarmMonitorConfig> page)  {
		return null;
	}

	public int queryNotWorkDay(String beginTime, String endTime) {
		return activitiAlarmMonitorConfigMapper.queryNotWorkDay(beginTime, endTime);
	}


}