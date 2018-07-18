/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Fri Dec 02 09:05:47 CST 2016
 */
package com.bosssoft.egov.asset.attach.entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 对象.
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2016-12-02   xiedeshou　　　新建
 * </pre>
 */
 @Table(name = "asset_attach_biz")
public class AssetAttachBiz implements java.io.Serializable {

	private static final long serialVersionUID = 161202090558835L;
	
	// Fields
	
	/**
	 * 应用系统ID.
	 */
    @Column(name = "APP_ID")
	private String appId;
	/**
	 * .
	 */
    @Id
    @Column(name = "ID")
	private Long id;
	/**
	 * 业务标识编码.
	 */
    @Column(name = "BIZ_TYPE")
	private String bizType;
	/**
	 * 业务名称.
	 */
    @Column(name = "BIZ_NAME")
	private String bizName;
	/**
	 * 对应附件表.
	 */
    @Column(name = "ATTACH_TBL")
	private String attachTbl;
    
    @Column(name = "UPLOAD_TYPE")
    private String uploadType;
	/**
	 * 状态.
	 */
    @Column(name = "STATUS")
	private String status;
	/**
	 * 备注.
	 */
    @Column(name = "REMARK")
	private String remark;
	
	// Constructors
 
    /** default constructor */
	public AssetAttachBiz() {
	}

	/**
	 * 应用系统ID.
	 * @return
	 */
	public String getAppId() {
		return this.appId;
	}

	/**
	 * 应用系统ID.
	 * @param appId
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * .
	 * @return
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * .
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 业务标识编码.
	 * @return
	 */
	public String getBizType() {
		return this.bizType;
	}

	/**
	 * 业务标识编码.
	 * @param bizType
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * 业务名称.
	 * @return
	 */
	public String getBizName() {
		return this.bizName;
	}

	/**
	 * 业务名称.
	 * @param bizName
	 */
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	/**
	 * 对应附件表.
	 * @return
	 */
	public String getAttachTbl() {
		return this.attachTbl;
	}

	/**
	 * 对应附件表.
	 * @param attachTbl
	 */
	public void setAttachTbl(String attachTbl) {
		this.attachTbl = attachTbl;
	}

	/**
	 * 状态.
	 * @return
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * 状态.
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 备注.
	 * @return
	 */
	public String getRemark() {
		return this.remark;
	}

	/**
	 * 备注.
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUploadType() {
		return uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}

}