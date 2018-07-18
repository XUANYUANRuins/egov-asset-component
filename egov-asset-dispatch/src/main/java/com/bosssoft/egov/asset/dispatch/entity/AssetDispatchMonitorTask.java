/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Mon Feb 20 09:39:36 CST 2017
 */
package com.bosssoft.egov.asset.dispatch.entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bosssoft.egov.asset.common.idgenerator.GUID;

/**
 * 对象.
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-02-20   jinbiao　　　新建
 * </pre>
 */
 @Table(name = "ASSET_DISPATCH_MONITOR_TASK")
public class AssetDispatchMonitorTask implements java.io.Serializable {

	private static final long serialVersionUID = 170220094047098L;
	
	// Fields
	
	/**
	 * id.
	 */
	@Id
    @Column(name = "TASKID")
	private String taskid;
	/**
	 * 编码.
	 */
    @Column(name = "TASKCODE")
	private String taskcode;
	/**
	 * 任务名称.
	 */
    @Column(name = "TASKNAME")
	private String taskname;
	/**
	 * bean完整路径.
	 */
    @Column(name = "TASKOBJ")
	private String taskobj;
	/**
	 * cron表达式.
	 */
    @Column(name = "TASKQUARTZ")
	private String taskquartz;
	/**
	 * 额外参数（内部自用只负责携带）.
	 */
    @Column(name = "TASKPARAMS")
	private String taskparams;
	/**
	 * 任务状态.
	 */
    @Column(name = "TASKSTATE")
	private String taskstate;
	/**
	 * 辅助1.
	 */
    @Column(name = "FZ1")
	private String fz1;
	/**
	 * 辅助2.
	 */
    @Column(name = "FZ2")
	private String fz2;
	/**
	 * 辅助3.
	 */
    @Column(name = "FZ3")
	private String fz3;
	/**
	 * 辅助4.
	 */
    @Column(name = "FZ4")
	private String fz4;
	/**
	 * 辅助5.
	 */
    @Column(name = "FZ5")
	private String fz5;
	
	// Constructors
 
    /** default constructor */
	public AssetDispatchMonitorTask() {
		this.taskid = GUID.newGUID();
		this.taskcode = GUID.newGUID();
	}

	/**
	 * id.
	 * @return
	 */
	public String getTaskid() {
		return this.taskid;
	}

	/**
	 * id.
	 * @param taskid
	 */
	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}

	/**
	 * 编码.
	 * @return
	 */
	public String getTaskcode() {
		return this.taskcode;
	}

	/**
	 * 编码.
	 * @param taskcode
	 */
	public void setTaskcode(String taskcode) {
		this.taskcode = taskcode;
	}

	/**
	 * 任务名称.
	 * @return
	 */
	public String getTaskname() {
		return this.taskname;
	}

	/**
	 * 任务名称.
	 * @param taskname
	 */
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	/**
	 * bean完整路径.
	 * @return
	 */
	public String getTaskobj() {
		return this.taskobj;
	}

	/**
	 * bean完整路径.
	 * @param taskobj
	 */
	public void setTaskobj(String taskobj) {
		this.taskobj = taskobj;
	}

	/**
	 * cron表达式.
	 * @return
	 */
	public String getTaskquartz() {
		return this.taskquartz;
	}

	/**
	 * cron表达式.
	 * @param taskquartz
	 */
	public void setTaskquartz(String taskquartz) {
		this.taskquartz = taskquartz;
	}

	/**
	 * 额外参数（内部自用只负责携带）.
	 * @return
	 */
	public String getTaskparams() {
		return this.taskparams;
	}

	/**
	 * 额外参数（内部自用只负责携带）.
	 * @param taskparams
	 */
	public void setTaskparams(String taskparams) {
		this.taskparams = taskparams;
	}

	/**
	 * 任务状态.
	 * @return
	 */
	public String getTaskstate() {
		return this.taskstate;
	}

	/**
	 * 任务状态.
	 * @param taskstate
	 */
	public void setTaskstate(String taskstate) {
		this.taskstate = taskstate;
	}

	/**
	 * 辅助1.
	 * @return
	 */
	public String getFz1() {
		return this.fz1;
	}

	/**
	 * 辅助1.
	 * @param fz1
	 */
	public void setFz1(String fz1) {
		this.fz1 = fz1;
	}

	/**
	 * 辅助2.
	 * @return
	 */
	public String getFz2() {
		return this.fz2;
	}

	/**
	 * 辅助2.
	 * @param fz2
	 */
	public void setFz2(String fz2) {
		this.fz2 = fz2;
	}

	/**
	 * 辅助3.
	 * @return
	 */
	public String getFz3() {
		return this.fz3;
	}

	/**
	 * 辅助3.
	 * @param fz3
	 */
	public void setFz3(String fz3) {
		this.fz3 = fz3;
	}

	/**
	 * 辅助4.
	 * @return
	 */
	public String getFz4() {
		return this.fz4;
	}

	/**
	 * 辅助4.
	 * @param fz4
	 */
	public void setFz4(String fz4) {
		this.fz4 = fz4;
	}

	/**
	 * 辅助5.
	 * @return
	 */
	public String getFz5() {
		return this.fz5;
	}

	/**
	 * 辅助5.
	 * @param fz5
	 */
	public void setFz5(String fz5) {
		this.fz5 = fz5;
	}

}