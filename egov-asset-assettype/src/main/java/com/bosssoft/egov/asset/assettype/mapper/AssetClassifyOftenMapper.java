/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Tue Dec 27 22:44:03 CST 2016
 */
package com.bosssoft.egov.asset.assettype.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bosssoft.egov.asset.assettype.entity.AssetClassifyOften;
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

public interface AssetClassifyOftenMapper extends Mapper<AssetClassifyOften>{


	/**
	 * 
	 * 查询分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return AssetDictAssetClassifyPage列表
	 * @throws BusinessException 自定义异常
	 *
	 */
	public Page<AssetClassifyOften> queryAssetDictClassifyPage(@Param("searcher")Searcher searcher,@Param("page")Page<AssetClassifyOften> page);
			

	public List<AssetClassifyOften> queryAssetClassifyMapper(@Param("typeId")String typeId,@Param("table") String table,@Param("orgId") String orgId);
	
	@Select("${sql}")
	public List<AssetClassifyOften> queryAssertClassifyBySql(@Param("sql") String sql);
	
	@Delete("${sql}")
	public int deleteBySql(@Param("sql") String sql);
	
	public int insertClassifyOftenSql(@Param("tableName")String table, @Param("classifyOften") AssetClassifyOften often);

}