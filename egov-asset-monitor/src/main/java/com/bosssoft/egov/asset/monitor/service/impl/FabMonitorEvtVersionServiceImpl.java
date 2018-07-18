package com.bosssoft.egov.asset.monitor.service.impl;


/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Mon Jan 16 13:09:59 CST 2017
 */

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosssoft.egov.asset.monitor.entity.FabMonitorEvtVersion;
import com.bosssoft.egov.asset.monitor.mapper.FabMonitorEvtVersionMapper;
import com.bosssoft.egov.asset.monitor.service.FabMonitorEvtVersionService;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;


/**
 * 类说明: FabMonitorEvtVersionService接口实现类. 
 *
 * 类用途：
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-01-16   jinbiao　　　新建
 * </pre>
 */
@Service
public class FabMonitorEvtVersionServiceImpl implements FabMonitorEvtVersionService {

	private static Logger logger = LoggerFactory.getLogger(FabMonitorEvtVersionServiceImpl.class);

	// TODO 添加需要的Mapper
	@Autowired
	private FabMonitorEvtVersionMapper fabMonitorEvtVersionMapper;
	
	/**
	 *
	 * @param fabMonitorEvtVersion
	 */
	public void addFabMonitorEvtVersion(FabMonitorEvtVersion fabMonitorEvtVersion)  {
		fabMonitorEvtVersionMapper.insert(fabMonitorEvtVersion);
	}

	/**
	 *
	 * @param fabMonitorEvtVersion
	 */
	public void delFabMonitorEvtVersion(FabMonitorEvtVersion fabMonitorEvtVersion)  {
		fabMonitorEvtVersionMapper.deleteByPrimaryKey(fabMonitorEvtVersion);
	}

	/**
	 *
	 * @param fabMonitorEvtVersion
	 */
	public void updateFabMonitorEvtVersion(FabMonitorEvtVersion fabMonitorEvtVersion)  {
		fabMonitorEvtVersionMapper.updateByPrimaryKey(fabMonitorEvtVersion);
	}

	/**
	 *
	 * @param fabMonitorEvtVersion
	 * @retrun
	 */
	public List<FabMonitorEvtVersion> getFabMonitorEvtVersionList(FabMonitorEvtVersion fabMonitorEvtVersion)  {
		return null;
	}

	/**
	 *
	 * @param searcher
	 * @param page
	 * @retrun
	 */
	public Page<FabMonitorEvtVersion> queryFabMonitorEvtVersionPage(Searcher searcher, Page<FabMonitorEvtVersion> page) {
		return fabMonitorEvtVersionMapper.queryFabMonitorEvtVersionPage(searcher, page);
	}

	public List<FabMonitorEvtVersion> queryList(Searcher searcher)  {
		return fabMonitorEvtVersionMapper.queryList(searcher,null,null);
	}
	
	public FabMonitorEvtVersion queryByEvtId(String evtId) {
		Searcher searcher = new Searcher();
		searcher.addCondition("fevtId", evtId);
		List<FabMonitorEvtVersion> versions = this.queryList(searcher);
		if(versions == null || versions.size() ==0){
			return null;
		}else{
			return versions.get(0);
		}
	}


}