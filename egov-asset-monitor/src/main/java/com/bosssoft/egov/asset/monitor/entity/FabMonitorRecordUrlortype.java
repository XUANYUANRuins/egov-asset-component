/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Thu Feb 23 16:01:57 CST 2017
 */
package com.bosssoft.egov.asset.monitor.entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 对象.
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-02-23   jinbiao　　　新建
 * </pre>
 */
 @Table(name = "FAB_MONITOR_RECORD_URLORTYPE")
public class FabMonitorRecordUrlortype implements java.io.Serializable {

	private static final long serialVersionUID = 170223160421289L;
	
	// Fields
	
	/**
	 * ID.
	 */
	@Id
    @Column(name = "ID")
	private String id;
	/**
	 * 类型编码.
	 */
    @Column(name = "TYPE_CODE")
	private String typeCode;
	/**
	 * 类型名称.
	 */
    @Column(name = "TYPE_NAME")
	private String typeName;
	/**
	 * 跳转URL.
	 */
    @Column(name = "URL")
	private String url;
	/**
	 * 记录ID.
	 */
    @Column(name = "RECORD_DETAIL_ID")
	private String recordDetailId;
	/**
	 * URL参数.
	 */
    @Column(name = "PARAM1")
	private String param1;
	
    /**
     * URL参数.
     */
    @Column(name = "PARAM2")
    private String param2;
    
    /**
     * URL参数.
     */
    @Column(name = "PARAM3")
    private String param3;
    
	// Constructors
 
    /** default constructor */
	public FabMonitorRecordUrlortype() {
	}

	/**
	 * ID.
	 * @return
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * ID.
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 类型编码.
	 * @return
	 */
	public String getTypeCode() {
		return this.typeCode;
	}

	/**
	 * 类型编码.
	 * @param typeCode
	 */
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	/**
	 * 类型名称.
	 * @return
	 */
	public String getTypeName() {
		return this.typeName;
	}

	/**
	 * 类型名称.
	 * @param typeName
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	/**
	 * 跳转URL.
	 * @return
	 */
	public String getUrl() {
		return this.url;
	}

	/**
	 * 跳转URL.
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 记录ID.
	 * @return
	 */
	public String getRecordDetailId() {
		return this.recordDetailId;
	}

	/**
	 * 记录ID.
	 * @param recordDetailId
	 */
	public void setRecordDetailId(String recordDetailId) {
		this.recordDetailId = recordDetailId;
	}

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getParam3() {
		return param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}
}