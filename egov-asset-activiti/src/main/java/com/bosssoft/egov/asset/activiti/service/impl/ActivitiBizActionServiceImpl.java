package com.bosssoft.egov.asset.activiti.service.impl;


/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Sat Mar 04 11:38:35 CST 2017
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosssoft.egov.asset.activiti.entity.ActivitiBizAction;
import com.bosssoft.egov.asset.activiti.mapper.ActivitiBizActionMapper;
import com.bosssoft.egov.asset.activiti.service.ActivitiBizActionService;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;


/**
 * 类说明: ActivitiBizActionService接口实现类. 
 *
 * 类用途：
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-03-04   jinbiao　　　新建
 * </pre>
 */
@Service
public class ActivitiBizActionServiceImpl implements ActivitiBizActionService {

//	private static Logger logger = LoggerFactory.getLogger(ActivitiBizActionServiceImpl.class);

	// TODO 添加需要的Mapper
	@Autowired
	private ActivitiBizActionMapper activitiBizActionMapper;
	
	/**
	 *
	 * @param activitiBizAction
	 */
	public void addActivitiBizAction(ActivitiBizAction activitiBizAction)  {
		activitiBizActionMapper.insert(activitiBizAction);
	}

	/**
	 *
	 * @param activitiBizAction
	 */
	public void delActivitiBizAction(ActivitiBizAction activitiBizAction)  {
		activitiBizActionMapper.deleteByPrimaryKey(activitiBizAction);
	}

	/**
	 *
	 * @param activitiBizAction
	 */
	public void updateActivitiBizAction(ActivitiBizAction activitiBizAction)  {
		activitiBizActionMapper.updateByPrimaryKey(activitiBizAction);
	}

	/**
	 *
	 * @param activitiBizAction
	 * @retrun
	 */
	public List<ActivitiBizAction> getActivitiBizActionList(ActivitiBizAction activitiBizAction)  {
		return activitiBizActionMapper.select(activitiBizAction);
	}
	
	public List<ActivitiBizAction> getActivitiBizActionListByOr(ActivitiBizAction activitiBizAction)  {
		return activitiBizActionMapper.select(activitiBizAction);
	}

	/**
	 *
	 * @param searcher
	 * @param page
	 * @retrun
	 */
	public Page<ActivitiBizAction> queryActivitiBizActionPage(Searcher searcher, Page<ActivitiBizAction> page)  {
		return activitiBizActionMapper.queryActivitiBizActionPage(searcher, page);
	}


}