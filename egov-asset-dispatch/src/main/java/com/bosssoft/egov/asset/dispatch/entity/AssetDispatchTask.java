/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Sun Jan 22 17:20:52 CST 2017
 */
package com.bosssoft.egov.asset.dispatch.entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 调度-调度表 存放具体作业关联定时配置信息对象.
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-01-22   Administrator　　　新建
 * </pre>
 */
 @Table(name = "ASSET_DISPATCH_TASK")
public class AssetDispatchTask implements java.io.Serializable {

	private static final long serialVersionUID = 170122172130639L;
	
	// Fields
	
	/**
	 * .
	 */
	@Id
    @Column(name = "ID")
	private String id;
	/**
	 * 调度编码.
	 */
    @Column(name = "CODE")
	private String code;
	/**
	 * 调度名称.
	 */
    @Column(name = "NAME")
	private String name;
	/**
	 * 调度时间表达式.
	 */
    @Column(name = "QUARTZ_EXP")
	private String quartzExp;
	/**
	 * .
	 */
    @Column(name = "JOB_ID")
	private String jobId;
	/**
	 * .
	 */
    @Column(name = "JOB_CODE")
	private String jobCode;
	/**
	 * .
	 */
    @Column(name = "JOB_NAME")
	private String jobName;
	/**
	 * 参数.
	 */
    @Column(name = "PARAMS")
	private String params;
	/**
	 * 状态0 停用 1 启用.
	 */
    @Column(name = "STATUS")
	private String status;
	/**
	 * 备注信息.
	 */
    @Column(name = "REAMRK")
	private String reamrk;
	
	// Constructors
 
    /** default constructor */
	public AssetDispatchTask() {
	}

	/**
	 * .
	 * @return
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * .
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 调度编码.
	 * @return
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * 调度编码.
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 调度名称.
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 调度名称.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 调度时间表达式.
	 * @return
	 */
	public String getQuartzExp() {
		return this.quartzExp;
	}

	/**
	 * 调度时间表达式.
	 * @param quartzExp
	 */
	public void setQuartzExp(String quartzExp) {
		this.quartzExp = quartzExp;
	}

	/**
	 * .
	 * @return
	 */
	public String getJobId() {
		return this.jobId;
	}

	/**
	 * .
	 * @param jobId
	 */
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	/**
	 * .
	 * @return
	 */
	public String getJobCode() {
		return this.jobCode;
	}

	/**
	 * .
	 * @param jobCode
	 */
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	/**
	 * .
	 * @return
	 */
	public String getJobName() {
		return this.jobName;
	}

	/**
	 * .
	 * @param jobName
	 */
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	/**
	 * 参数.
	 * @return
	 */
	public String getParams() {
		return this.params;
	}

	/**
	 * 参数.
	 * @param params
	 */
	public void setParams(String params) {
		this.params = params;
	}

	/**
	 * 状态0 停用 1 启用.
	 * @return
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * 状态0 停用 1 启用.
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 备注信息.
	 * @return
	 */
	public String getReamrk() {
		return this.reamrk;
	}

	/**
	 * 备注信息.
	 * @param reamrk
	 */
	public void setReamrk(String reamrk) {
		this.reamrk = reamrk;
	}

}