/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Fri Dec 23 00:02:31 CST 2016
 */
package com.bosssoft.egov.cms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bosssoft.egov.cms.entity.CmsNotice;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.persistence.common.Mapper;
import com.bosssoft.platform.common.lang.data.Searcher;

/**
 * 类说明:  Mapper接口（ Mapper层） .
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2016-12-23   xiedeshou　　　新建
 * </pre>

 */

public interface CmsNoticeMapper extends Mapper<CmsNotice>{



/**
	 * 
	 * 查询分页.
	 *	`
	 * @param searcher 查询条件
	 * @param pageable 分页信息
	 * @return CmsNoticePage列表
	 * @throws BusinessException 自定义异常
	 *
	 */
	public List<CmsNotice>  queryCmsNoticePageBy(@Param("searcher")Searcher searcher,@Param("condition")String condition,
			@Param("orderby")String orderby,@Param("userCode")String userCode);
	public Page<CmsNotice> queryCmsNoticePage(@Param("searcher")Searcher searcher,@Param("page")Page<CmsNotice> page,@Param("condition")String condition,@Param("orderby")String orderby,@Param("userCode")String userCode);
			
	public List<CmsNotice> queryCmsNotice(@Param("searcher")Searcher searcher,@Param("userCode")String userCode);


	public List<CmsNotice> queryByDate(@Param("startDate")String startDate,@Param("endDate")String endDate,@Param("userCode")String userCode);

	@Select("SELECT COUNT(1) AS CNT FROM ASSET_ATTACH_FILE WHERE BIZ_ID LIKE ${noticeId}||'%'")
	public int getAttachCount(@Param("noticeId")String noticeId);
	
	@Select("SELECT COUNT(1) AS CNT FROM ASSET_BIZ_USER WHERE BIZ_ID = ${noticeId} AND USER_CODE = '${userCode}'")
	public int getReadCount(@Param("noticeId")String noticeId,@Param("userCode")String userCode);
	
	
}