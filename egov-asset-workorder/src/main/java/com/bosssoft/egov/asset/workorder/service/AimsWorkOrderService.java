/**
 * 福建博思软件 1997-2018 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Fri Jan 05 11:27:51 CST 2018
 */
package com.bosssoft.egov.asset.workorder.service;

import java.util.List;
import com.bosssoft.egov.asset.workorder.entity.AimsWorkOrder;
import com.bosssoft.platform.common.lang.data.Searcher;
import com.bosssoft.platform.common.lang.data.Page;



/**
 * 单据标准字段Service类接口 .
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2018-01-05   Win　　　新建
 * </pre>
 */
public interface AimsWorkOrderService {

/**
	 * 增加单据标准字段.
	 * 
	 * @param aimsWorkOrder 单据标准字段
	 */
	public void addAimsWorkOrder(AimsWorkOrder aimsWorkOrder);

	/**
	 * 删除单据标准字段及相关信息.
	 * 
	 * @param aimsWorkOrder 单据标准字段
	 */
	public void delAimsWorkOrder(AimsWorkOrder aimsWorkOrder);

	/**
	 * 修改单据标准字段.
	 * 
	 * @param aimsWorkOrder 单据标准字段
	 */
	public void updateAimsWorkOrder(AimsWorkOrder aimsWorkOrder);

	/**
	 * 获取单据标准字段列表.
	 * 
	 */
	public AimsWorkOrder getAimsWorkOrderList(AimsWorkOrder aimsWorkOrder);

   	/**
	 * 获取单据标准字段分页.
	 * 
		 */
	public Page<AimsWorkOrder> queryAimsWorkOrderPage(Searcher searcher, Page<AimsWorkOrder> page);
	//批删除
	public int batchDelete(AimsWorkOrder aimsWorkOrder);
	//新增
	public void addRecord(AimsWorkOrder aimsWorkOrder);
    
}
 