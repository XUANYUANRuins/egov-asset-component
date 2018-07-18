/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Tue Jul 18 15:48:51 CST 2017
 */
package com.bosssoft.egov.asset.template.entity;
import java.sql.Clob;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 打印模版取数表对象.
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-07-18   Linxt　　　新建
 * </pre>
 */
 @Table(name = "AIMS_TEMPLATE_DATA")
public class AimsTemplateData implements java.io.Serializable {

	private static final long serialVersionUID = 170718154942043L;
	
	/**
	 * ID
	 */
	@Id
    @Column(name = "ID")
	private Long id;
	/**
	 * 模板ID
	 */
    @Column(name = "MODULE_ITEM_ID")
	private Long moduleItemId;
	/**
	 * 记录集类型.
	 */
    @Column(name = "MODULE_TYPE")
	private String moduleType;
	/**
	 * .
	 */
    @Column(name = "MODULE_SQL")
	private String  moduleSql;
	/**
	 * 0 关闭 1 开启.
	 */
    @Column(name = "STATUS")
	private String status;
	/**
	 * 备注说明.
	 */
    @Column(name = "REMARK")
	private String remark;
    
    /**
	 * 子报表id
	 */
    @Column(name = "BIZ_ID")
	private String bizId;
	
	// Constructors
 
    /** default constructor */
	public AimsTemplateData() {
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
	 * .
	 * @return
	 */
	public Long getModuleItemId() {
		return this.moduleItemId;
	}

	/**
	 * .
	 * @param moduleItemId
	 */
	public void setModuleItemId(Long moduleItemId) {
		this.moduleItemId = moduleItemId;
	}

	/**
	 * 记录集类型.
	 * @return
	 */
	public String getModuleType() {
		return this.moduleType;
	}

	/**
	 * 记录集类型.
	 * @param moduleType
	 */
	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}

	/**
	 * .
	 * @return
	 */
	public String  getModuleSql() {
		return this.moduleSql;
	}

	/**
	 * .
	 * @param moduleSql
	 */
	public void setModuleSql(String moduleSql) {
		this.moduleSql = moduleSql;
	}

	/**
	 * 0 关闭 1 开启.
	 * @return
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * 0 关闭 1 开启.
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 备注说明.
	 * @return
	 */
	public String getRemark() {
		return this.remark;
	}

	/**
	 * 备注说明.
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 
	 * @return
	 */
	public String getBizId() {
		return bizId;
	}

	/**
	 * 
	 * @param bizId
	 */
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	
	

}