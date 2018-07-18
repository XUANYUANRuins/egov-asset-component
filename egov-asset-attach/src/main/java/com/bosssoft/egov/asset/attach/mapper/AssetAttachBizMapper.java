/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Fri Dec 02 09:07:24 CST 2016
 */
package com.bosssoft.egov.asset.attach.mapper;

import org.apache.ibatis.annotations.Param;

import com.bosssoft.egov.asset.attach.entity.AssetAttachBiz;
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
 * 2016-12-02   xiedeshou　　　新建
 * </pre>

 */

public interface AssetAttachBizMapper extends Mapper<AssetAttachBiz>{



/**
	 * 
	 * 查询分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return AssetAttachBizPage列表
	 * @throws BusinessException 自定义异常
	 *
	 */
	public Page<AssetAttachBiz> queryAssetAttachBizPage(@Param("searcher")Searcher searcher,@Param("page")Page<AssetAttachBiz> page);
			


}