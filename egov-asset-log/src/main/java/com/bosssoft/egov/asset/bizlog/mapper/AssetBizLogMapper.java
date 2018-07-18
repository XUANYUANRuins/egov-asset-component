/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Tue Dec 27 22:57:36 CST 2016
 */
package com.bosssoft.egov.asset.bizlog.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bosssoft.egov.asset.bizlog.entity.AssetBizLog;
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
 * 2016-12-27   Administrator　　　新建
 * </pre>

 */

public interface AssetBizLogMapper extends Mapper<AssetBizLog>{



/**
	 * 
	 * 查询分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return AssetBizLogPage列表
	 * @throws BusinessException 自定义异常
	 *
	 */
	public Page<AssetBizLog> queryAssetBizLogPage(@Param("searcher")Searcher searcher,@Param("page")Page<AssetBizLog> page);
			

	public List<Map<String,Object>> queryPortalBizLogList(@Param("bizLog") AssetBizLog bizLog,@Param("limit") int limit);

}