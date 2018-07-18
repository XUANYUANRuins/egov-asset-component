/*******************************************************************************
 * 福建博思软件1997-2017 版权所有
 * 
 * Auto generated by Bosssoft Studio version 1.0 beta
 * 2017年11月30日下午5:03:32
 *******************************************************************************/


package com.bosssoft.asset.etl.comp.handler;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bosssoft.asset.etl.core.EtlConst;
import com.bosssoft.asset.etl.core.Launcher;
import com.bosssoft.asset.etl.entity.AssetEtlExportTask;
import com.bosssoft.asset.etl.entity.ReportDetail;
import com.bosssoft.asset.etl.service.AssetEtlExportTaskService;
import com.bosssoft.asset.etl.service.AssetEtlExportTaskServiceImpl;
import com.bosssoft.egov.asset.runtime.web.context.AppContext;

/**
 * 类说明：启用线程导出
 *
 * <pre>
 * 修改记录：
 * 修改日期	修改人
 * 2017年11月30日  chenzhibin
 * </pre>
 */
public class ThreadHandler implements Runnable {
	private static final Logger logger = LoggerFactory.getLogger(ThreadHandler.class);
	
	private ReportDetail exportData;
	private Map<String, Object> params;
	private Long taskId;
	
	public ThreadHandler(ReportDetail exportData, Map<String, Object> params, Long taskId) {
		this.exportData = exportData;
		this.params = params;
		this.taskId = taskId;
	}

	@Override
	public void run() {
		try{
			logger.debug("线程开始执行任务[{}]......", taskId);
			updateTask(EtlConst.ETL_EXPORT_TASK_STATUS_EXECUTING, "正在导出");
			Launcher.getInstance().runThreadTask(exportData, params, taskId);
		} catch(Exception e){
			logger.debug("导出excel文件异常...{}...", e.getMessage());
			updateTask(EtlConst.ETL_EXPORT_TASK_STATUS_ERROR, e.getMessage());
		}
	}

	/**
	 * <p>功能说明：执行任务状态变更
	 * </p>
	 * <p>参数说明：
	 * @param status
	 * @param remark
	 * </p>
	 *
	 * @date	创建时间：2017年12月1日
	 * @author	作者：chenzhibin
	 */
	private synchronized void updateTask(String status, String remark) {
		if(taskId != null){
			AssetEtlExportTaskService exportTaskService = AppContext.getAppContext().getBeanContext().getBean(AssetEtlExportTaskServiceImpl.class);
			AssetEtlExportTask exportTask = new AssetEtlExportTask();
			exportTask.setId(taskId);
			exportTask.setStatus(status);
			exportTask.setRemark(remark.length() > 200 ? (remark.substring(0, 180) + "......") : remark);
			exportTaskService.updateAssetEtlExportTask(exportTask);
		}
	}
}
