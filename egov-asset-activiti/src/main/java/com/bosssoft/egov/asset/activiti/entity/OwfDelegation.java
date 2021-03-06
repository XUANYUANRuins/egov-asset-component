/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Tue Nov 15 10:42:05 CST 2016
 */
package com.bosssoft.egov.asset.activiti.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 对象.
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2016-11-15   jinbiao　　　新建
 * </pre>
 */
 @Table(name = "owf_delegation")
public class OwfDelegation implements java.io.Serializable {

	private static final long serialVersionUID = 161115104229525L;
	
	// Fields
	
	/**
	 * .
	 */
	@Id
    @Column(name = "ID")
	private Long id;
	/**
	 * .
	 */
    @Column(name = "DELEGATED")
	private String delegated;
	/**
	 * .
	 */
    @Column(name = "DELEGATE")
	private String delegate;
	/**
	 * .
	 */
    @Column(name = "OP_TIME")
	private Date opTime;
    
    @Transient
    private String delegatedName;
    
    @Transient
    private String delegateName;
	
	// Constructors
 
    /** default constructor */
	public OwfDelegation() {
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
	public String getDelegated() {
		return this.delegated;
	}

	/**
	 * .
	 * @param delegated
	 */
	public void setDelegated(String delegated) {
		this.delegated = delegated;
	}

	/**
	 * .
	 * @return
	 */
	public String getDelegate() {
		return this.delegate;
	}

	/**
	 * .
	 * @param delegate
	 */
	public void setDelegate(String delegate) {
		this.delegate = delegate;
	}

	/**
	 * .
	 * @return
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+08:00") 
	public Date getOpTime() {
		return this.opTime;
	}

	/**
	 * .
	 * @param opTime
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+08:00") 
	public void setOpTime(Date opTime) {
		this.opTime = opTime;
	}

	public String getDelegatedName() {
		return delegatedName;
	}

	public void setDelegatedName(String delegatedName) {
		this.delegatedName = delegatedName;
	}

	public String getDelegateName() {
		return delegateName;
	}

	public void setDelegateName(String delegateName) {
		this.delegateName = delegateName;
	}

}