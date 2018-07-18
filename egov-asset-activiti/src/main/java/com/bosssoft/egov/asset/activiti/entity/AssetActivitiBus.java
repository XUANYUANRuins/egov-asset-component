/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Wed Nov 30 13:41:11 CST 2016
 */
package com.bosssoft.egov.asset.activiti.entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 对象.
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2016-11-30   jinbiao　　　新建
 * </pre>
 */
 @Table(name = "ASSET_ACTIVITI_BUS")
public class AssetActivitiBus implements java.io.Serializable {

	private static final long serialVersionUID = 161130134135388L;
	
	// Fields
	
	/**
	 * ID.
	 */
	@Id
    @Column(name = "ID")
	private Long id;
	/**
	 * 流程部署Key在XML里面id.
	 */
    @Column(name = "DEPLOYMENT_KEY")
	private String deploymentKey;
	/**
	 * 业务系统(单位)类型.
	 */
    @Column(name = "BUS_TYPE")
	private String busType;
	/**
	 * 业务系统名称.
	 */
    @Column(name = "BUS_TYPE_NAME")
	private String busTypeName;
    
    @Column(name = "BUS_CHECK_URL")
    private String busCheckUrl;
    
    @Column(name = "BUS_PTYPE")
    private String busPtype;
    
    @Column(name = "BUS_REJECT_URL")
    private String busRejectUrl;
    
    @Column(name = "BUS_REJECT_NAME")
    private String busRejectName;
    
	
	// Constructors
 
    /** default constructor */
	public AssetActivitiBus() {
	}

	/**
	 * ID.
	 * @return
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * ID.
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 流程部署Key在XML里面id.
	 * @return
	 */
	public String getDeploymentKey() {
		return this.deploymentKey;
	}

	/**
	 * 流程部署Key在XML里面id.
	 * @param deploymentKey
	 */
	public void setDeploymentKey(String deploymentKey) {
		this.deploymentKey = deploymentKey;
	}

	/**
	 * 业务系统(单位)类型.
	 * @return
	 */
	public String getBusType() {
		return this.busType;
	}

	/**
	 * 业务系统(单位)类型.
	 * @param busType
	 */
	public void setBusType(String busType) {
		this.busType = busType;
	}

	/**
	 * 业务系统名称.
	 * @return
	 */
	public String getBusTypeName() {
		return this.busTypeName;
	}

	/**
	 * 业务系统名称.
	 * @param busTypeName
	 */
	public void setBusTypeName(String busTypeName) {
		this.busTypeName = busTypeName;
	}

	public String getBusCheckUrl() {
		return busCheckUrl;
	}

	public void setBusCheckUrl(String busCheckUrl) {
		this.busCheckUrl = busCheckUrl;
	}

	public String getBusPtype() {
		return busPtype;
	}

	public void setBusPtype(String busPtype) {
		this.busPtype = busPtype;
	}

	public String getBusRejectUrl() {
		return busRejectUrl;
	}

	public void setBusRejectUrl(String busRejectUrl) {
		this.busRejectUrl = busRejectUrl;
	}

	public String getBusRejectName() {
		return busRejectName;
	}

	public void setBusRejectName(String busRejectName) {
		this.busRejectName = busRejectName;
	}

}