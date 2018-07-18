/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Mon Jan 16 13:07:41 CST 2017
 */
package com.bosssoft.egov.asset.monitor.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bosssoft.egov.asset.monitor.entity.FabMonitorEvt;
import com.bosssoft.egov.asset.monitor.entity.FabMonitorEvtVersion;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.persistence.common.Mapper;
import com.bosssoft.platform.common.lang.data.Searcher;

/**
 * 类说明: 监控事项版本号表 Mapper接口（ Mapper层） .
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-01-16   jinbiao　　　新建
 * </pre>
 */

public interface FabMonitorEvtVersionMapper extends Mapper<FabMonitorEvtVersion> {

	/**
	 * 
	 * 查询监控事项版本号表分页. `
	 * 
	 * @param searcher
	 *            查询条件
	 * @param pageable
	 *            分页信息
	 * @return FabMonitorEvtVersionPage列表
	 * @throws BusinessException
	 *             自定义异常
	 *
	 */
	public Page<FabMonitorEvtVersion> queryFabMonitorEvtVersionPage(@Param("searcher") Searcher searcher, @Param("page") Page<FabMonitorEvtVersion> page);

	public List<FabMonitorEvtVersion> queryList(@Param("searcher")Searcher searcher,@Param("sortProperty")String sortProperty,@Param("sortDirection")String sortDirection);

}