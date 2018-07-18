/*******************************************************************************
 * 福建博思软件1997-2017 版权所有
 * 
 * Auto generated by Bosssoft Studio version 1.0 beta
 * 2017年12月6日下午5:12:25
 *******************************************************************************/
package com.bosssoft.asset.etl.task;

import java.io.File;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.bosssoft.asset.etl.core.EtlConst;
import com.bosssoft.asset.etl.service.AssetEtlExportTaskService;
import com.bosssoft.egov.asset.common.util.DateUtilsExt;

/**
 * @ClassName	类名：AutoClearEtlExportTask.java
 * @Description	功能说明：定时自动清除导出任务
 * <pre>
 * @date		创建日期：2017年12月6日
 * @author		创建人：chenzhibin
 * @version		版本号：V1.0
 * <pre>
 *-------------------修订记录---------------------
 */
public class AutoClearEtlExportTask {
	private static final Logger logger = LoggerFactory.getLogger(AutoClearEtlExportTask.class);
	
	@Autowired
	private AssetEtlExportTaskService expTaskService;
	
	/**
	 * 清除几天前的数据，默认7
	 */
	@Value("${etl.auto.clear.task.day:7}")
	private int day;
	
	/**
	 * <p>功能说明：执行清除任务
	 * </p>
	 * <p>参数说明：
	 * </p>
	 *
	 * @date	创建时间：2017年12月6日
	 * @author	作者：chenzhibin
	 */
	public void executeTask(){
		logger.debug("===> 定时任务开始执行...");
		day = day > 0 ? day : 7;
		clearEtlExportTask();
		clearEtlExportFile();
	}

	/**
	 * <p>功能说明：清除过期文件
	 * </p>
	 * <p>参数说明：
	 * </p>
	 *
	 * @date	创建时间：2017年12月6日
	 * @author	作者：chenzhibin
	 */
	private void clearEtlExportFile() {
		File file = new File(EtlConst.ETL_EXPORT_TASK_PATH);
		logger.debug("----------------------------------------------------");
		logger.debug("开始清除导出目录[{}]下的过期文件......", file.getPath());
		logger.debug("已清除{}个过期文件......", deleteFile(file));
		logger.debug("----------------------------------------------------");
	}
	
	/**
	 * <p>功能说明：删除文件
	 * </p>
	 * <p>参数说明：
	 * @param file 遍历所要删除的文件或目录
	 * </p>
	 *
	 * @date	创建时间：2017年12月6日
	 * @author	作者：chenzhibin
	 */
	private int deleteFile(File file){
		int count = 0;
		
		if(file.exists()){
			if(file.isDirectory()){
				File[] listFiles = file.listFiles();
				for(File listFile : listFiles){
					count += deleteFile(listFile);
				}
				String[] list = file.list();
				if(list == null || list.length == 0){
					logger.debug("删除目录{}{}", file.getPath(), file.delete() ? "成功" : "失败");
				}
			} else{
				// 判断是否超期
				long time = day * 60 * 60 * 24 * 1000;
				if(System.currentTimeMillis() - file.lastModified() > time){
					logger.debug("删除文件{}", file.getPath());
					file.delete();
					count++;
				}
			}
		}
		
		return count;
	}

	/**
	 * <p>功能说明：清除过期任务
	 * </p>
	 * <p>参数说明：
	 * </p>
	 *
	 * @date	创建时间：2017年12月6日
	 * @author	作者：chenzhibin
	 */
	private void clearEtlExportTask() {
		// 获取day天之前的数据
		Date date = DateUtilsExt.addDays(DateUtilsExt.getNowDate(), -day);
		String time = DateUtilsExt.formatDate(date.getTime(), "yyyyMMddHHmmssSSS");
		// 删除过期任务
		logger.debug("----------------------------------------------------");
		logger.debug("开始清除过期任务，过期时间点{}......", time);
		int count = expTaskService.deleteTimeoutExportTask(time);
		logger.debug("已清除{}条过期任务......", count);
	}
}