/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Fri Sep 15 09:37:29 CST 2017
 */
package com.bosssoft.egov.asset.amc.user.model;
import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 对象.
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-09-15   BS　　　新建
 * </pre>
 */
 @Table(name = "AIMS_USER_MAIN")
public class AimsUserMain implements java.io.Serializable {

	private static final long serialVersionUID = 170915093832359L;
	
	// Fields
	
	/**
	 * .
	 */
    @Column(name = "ID")
	private Long id;
	/**
	 * 用户ID.
	 */
    @Column(name = "USER_ID")
	private String userId;
	/**
	 * 用户账号.
	 */
    @Column(name = "USER_CODE")
	private String userCode;
	/**
	 * 创建时间.
	 */
    @Column(name = "CREATE_DATE")
	private String createDate;
	/**
	 * 最后修改时间.
	 */
    @Column(name = "MODIFY_DATE")
	private String modifyDate;
	/**
	 * 审核时间.
	 */
    @Column(name = "AUDIT_DATE")
	private String auditDate;
	/**
	 * 审核人.
	 */
    @Column(name = "AUDITOR")
	private String auditor;
	/**
	 * 业务状态.
	 */
    @Column(name = "BIZ_STATUS")
	private Integer bizStatus;
	/**
	 * 业务状态名称.
	 */
    @Column(name = "BIZ_STATUS_NAME")
	private String bizStatusName;
	/**
	 * 业务类型.
	 */
    @Column(name = "BUS_TYPE")
	private String busType;
	/**
	 * 业务类型名称.
	 */
    @Column(name = "BUS_TYPE_NAME")
	private String busTypeName;
    /**
	 * 状态.
	 */
    @Column(name = "STATUS")
    private Integer status;
	
    /**
	 * 创建者.
	 */
    @Column(name = "CREATOR")
    private String creator;
    
    /**
	 * 创建者ID.
	 */
    @Column(name = "CREATOR_ID")
    private String creatorId;
    /**
	 * 单位编码.
	 */
    @Column(name = "ORG_CODE")
    private String orgCode;
    
    /**
	 * 单位ID.
	 */
    @Column(name = "ORG_ID")
    private Long orgId;
    
    /**
   	 * 单位名称.
   	 */
    @Column(name = "ORG_NAME")
    private String orgName;
    
    /**
   	 * 区划ID.
   	 */
    @Column(name = "RGN_ID")
    private Long rgnId;
    
    /**
   	 * 区划编码.
   	 */
    @Column(name = "RGN_CODE")
    private String rgnCode;
    
    /**
   	 * 区划名称.
   	 */
    @Column(name = "RGN_NAME")
    private String rgnName;
    
    /**
   	 * 意见.
   	 */
    @Column(name = "AUDIT_COMMENT")
    private String auditComment;
    
    /**
     * 用户名
     */
    @Column(name = "USER_NAME")
    private String userName;
    
	// Constructors
 
    /** default constructor */
	public AimsUserMain() {
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
	 * 用户ID.
	 * @return
	 */
	public String getUserId() {
		return this.userId;
	}

	/**
	 * 用户ID.
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 用户账号.
	 * @return
	 */
	public String getUserCode() {
		return this.userCode;
	}

	/**
	 * 用户账号.
	 * @param userCode
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	/**
	 * 创建时间.
	 * @return
	 */
	public String getCreateDate() {
		return this.createDate;
	}

	/**
	 * 创建时间.
	 * @param createDate
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	/**
	 * 最后修改时间.
	 * @return
	 */
	public String getModifyDate() {
		return this.modifyDate;
	}

	/**
	 * 最后修改时间.
	 * @param modifyDate
	 */
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	/**
	 * 审核时间.
	 * @return
	 */
	public String getAuditDate() {
		return this.auditDate;
	}

	/**
	 * 审核时间.
	 * @param auditDate
	 */
	public void setAuditDate(String auditDate) {
		this.auditDate = auditDate;
	}

	/**
	 * 审核人.
	 * @return
	 */
	public String getAuditor() {
		return this.auditor;
	}

	/**
	 * 审核人.
	 * @param auditor
	 */
	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	/**
	 * 业务状态.
	 * @return
	 */
	public Integer getBizStatus() {
		return this.bizStatus;
	}

	/**
	 * 业务状态.
	 * @param bizStatus
	 */
	public void setBizStatus(Integer bizStatus) {
		this.bizStatus = bizStatus;
	}

	/**
	 * 业务状态名称.
	 * @return
	 */
	public String getBizStatusName() {
		return this.bizStatusName;
	}

	/**
	 * 业务状态名称.
	 * @param bizStatusName
	 */
	public void setBizStatusName(String bizStatusName) {
		this.bizStatusName = bizStatusName;
	}

	/**
	 * 业务类型.
	 * @return
	 */
	public String getBusType() {
		return this.busType;
	}

	/**
	 * 业务类型.
	 * @param busType
	 */
	public void setBusType(String busType) {
		this.busType = busType;
	}

	/**
	 * 业务类型名称.
	 * @return
	 */
	public String getBusTypeName() {
		return this.busTypeName;
	}

	/**
	 * 业务类型名称.
	 * @param busTypeName
	 */
	public void setBusTypeName(String busTypeName) {
		this.busTypeName = busTypeName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Long getRgnId() {
		return rgnId;
	}

	public void setRgnId(Long rgnId) {
		this.rgnId = rgnId;
	}

	public String getRgnCode() {
		return rgnCode;
	}

	public void setRgnCode(String rgnCode) {
		this.rgnCode = rgnCode;
	}

	public String getRgnName() {
		return rgnName;
	}

	public void setRgnName(String rgnName) {
		this.rgnName = rgnName;
	}

	public String getAuditComment() {
		return auditComment;
	}

	public void setAuditComment(String auditComment) {
		this.auditComment = auditComment;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}