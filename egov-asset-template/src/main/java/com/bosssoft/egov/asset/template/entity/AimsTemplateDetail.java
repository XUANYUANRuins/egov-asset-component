/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Sun Jan 22 13:27:50 CST 2017
 */
package com.bosssoft.egov.asset.template.entity;
import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 对象.
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-01-22   Administrator　　　新建
 * </pre>
 */
 @Table(name = "AIMS_TEMPLATE_DETAIL")
public class AimsTemplateDetail implements java.io.Serializable {

	private static final long serialVersionUID = 170122132821990L;
	
	// Fields
	
	/**
	 * ID.
	 */
    @Column(name = "MODULE_ITEM_ID")
	private Long moduleItemId;
	/**
	 * 编码.
	 */
    @Column(name = "MODULE_ITEM_CODE")
	private String moduleItemCode;
	/**
	 * 名称.
	 */
    @Column(name = "MODULE_ITEM_NAME")
	private String moduleItemName;
	/**
	 * 模板ID.
	 */
    @Column(name = "MODULE_ID")
	private Long moduleId;
	/**
	 * 模板编码.
	 */
    @Column(name = "MODULE_CODE")
	private String moduleCode;
	/**
	 * 模板名称.
	 */
    @Column(name = "MODULE_NAME")
	private String moduleName;
    /**
     * 模板取数sql语句
     */
    @Column(name = "MODULE_SQL")
    private String moduleSql;
    /**
     * 模版数据二次处理bean(bean名称，不是包名)
     */
    @Column(name = "MODULE_PROCESS_BEAN")
    private String moduleProcessBean;
	/**
	 * 是否全局.
	 */
    @Column(name = "IS_GLOABL")
	private String isGloabl;
	/**
	 * 创建时间.
	 */
    @Column(name = "CREATE_DATE")
	private String createDate;
	/**
	 * 创建者.
	 */
    @Column(name = "CREATOR")
	private String creator;
	/**
	 * 修改时间.
	 */
    @Column(name = "MODIFY_DATE")
	private String modifyDate;
	/**
	 * 版本.
	 */
    @Column(name = "VERSION")
	private Long version;
	/**
	 * 是否默认.
	 */
    @Column(name = "IS_DEFAULT")
	private String isDefault;
	/**
	 * 是否公用.
	 */
    @Column(name = "IS_PUBLIC")
	private String isPublic;
	/**
	 * 状态.
	 */
    @Column(name = "STATUS")
	private Integer status;
	/**
	 * 单位ID.
	 */
    @Column(name = "ORG_ID")
	private Long orgId;
	/**
	 * 单位编码.
	 */
    @Column(name = "ORG_CODE")
	private String orgCode;
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
	 * 自定义字段1.
	 */
    @Column(name = "STR01")
	private String str01;
	/**
	 * 自定义字段2.
	 */
    @Column(name = "STR02")
	private String str02;
	/**
	 * 自定义字段3.
	 */
    @Column(name = "STR03")
	private String str03;
	/**
	 * 自定义字段4.
	 */
    @Column(name = "STR04")
	private String str04;
	/**
	 * 自定义字段5.
	 */
    @Column(name = "STR05")
	private String str05;
	/**
	 * 模板文件.
	 */
    @Column(name = "MODULE_FILE")
    private byte[] moduleFile;
    /**
	 * 模板文件名称.
	 */
    @Column(name = "FILE_NAME")
    private String fileName;
	
	// Constructors
 
    /** default constructor */
	public AimsTemplateDetail() {
	}

	/**
	 * ID.
	 * @return
	 */
	public Long getModuleItemId() {
		return this.moduleItemId;
	}

	/**
	 * ID.
	 * @param moduleItemId
	 */
	public void setModuleItemId(Long moduleItemId) {
		this.moduleItemId = moduleItemId;
	}

	/**
	 * 编码.
	 * @return
	 */
	public String getModuleItemCode() {
		return this.moduleItemCode;
	}

	/**
	 * 编码.
	 * @param moduleItemCode
	 */
	public void setModuleItemCode(String moduleItemCode) {
		this.moduleItemCode = moduleItemCode;
	}

	/**
	 * 名称.
	 * @return
	 */
	public String getModuleItemName() {
		return this.moduleItemName;
	}

	/**
	 * 名称.
	 * @param moduleItemName
	 */
	public void setModuleItemName(String moduleItemName) {
		this.moduleItemName = moduleItemName;
	}

	/**
	 * 模板ID.
	 * @return
	 */
	public Long getModuleId() {
		return this.moduleId;
	}

	/**
	 * 模板ID.
	 * @param moduleId
	 */
	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	/**
	 * 模板编码.
	 * @return
	 */
	public String getModuleCode() {
		return this.moduleCode;
	}

	/**
	 * 模板编码.
	 * @param moduleCode
	 */
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	/**
	 * 模板名称.
	 * @return
	 */
	public String getModuleName() {
		return this.moduleName;
	}

	/**
	 * 模板名称.
	 * @param moduleName
	 */
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	/**
	 * 模板取数sql语句
	 * @return
	 */
	
	public String getModuleSql() {
		return moduleSql;
	}
	/**
	 * 模板取数sql语句
	 * @param moduleSql
	 */
	public void setModuleSql(String moduleSql) {
		this.moduleSql = moduleSql;
	}

	/**
	 * 模版数据二次处理bean(bean名称，不是包名)
	 * @return
	 */
	public String getModuleProcessBean() {
		return moduleProcessBean;
	}

	/**
	 * 模版数据二次处理bean(bean名称，不是包名)
	 * @param moduleProcessBean
	 */
	public void setModuleProcessBean(String moduleProcessBean) {
		this.moduleProcessBean = moduleProcessBean;
	}

	/**
	 * 是否全局.
	 * @return
	 */
	public String getIsGloabl() {
		return this.isGloabl;
	}

	/**
	 * 是否全局.
	 * @param isGloabl
	 */
	public void setIsGloabl(String isGloabl) {
		this.isGloabl = isGloabl;
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
	 * 创建者.
	 * @return
	 */
	public String getCreator() {
		return this.creator;
	}

	/**
	 * 创建者.
	 * @param creator
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * 修改时间.
	 * @return
	 */
	public String getModifyDate() {
		return this.modifyDate;
	}

	/**
	 * 修改时间.
	 * @param modifyDate
	 */
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	/**
	 * 版本.
	 * @return
	 */
	public Long getVersion() {
		return this.version;
	}

	/**
	 * 版本.
	 * @param version
	 */
	public void setVersion(Long version) {
		this.version = version;
	}

	/**
	 * 是否默认.
	 * @return
	 */
	public String getIsDefault() {
		return this.isDefault;
	}

	/**
	 * 是否默认.
	 * @param isDefault
	 */
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	/**
	 * 是否公用.
	 * @return
	 */
	public String getIsPublic() {
		return this.isPublic;
	}

	/**
	 * 是否公用.
	 * @param isPublic
	 */
	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	}

	/**
	 * 状态.
	 * @return
	 */
	public Integer getStatus() {
		return this.status;
	}

	/**
	 * 状态.
	 * @param status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 单位ID.
	 * @return
	 */
	public Long getOrgId() {
		return this.orgId;
	}

	/**
	 * 单位ID.
	 * @param orgId
	 */
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	/**
	 * 单位编码.
	 * @return
	 */
	public String getOrgCode() {
		return this.orgCode;
	}

	/**
	 * 单位编码.
	 * @param orgCode
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	/**
	 * 单位名称.
	 * @return
	 */
	public String getOrgName() {
		return this.orgName;
	}

	/**
	 * 单位名称.
	 * @param orgName
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/**
	 * 区划ID.
	 * @return
	 */
	public Long getRgnId() {
		return this.rgnId;
	}

	/**
	 * 区划ID.
	 * @param rgnId
	 */
	public void setRgnId(Long rgnId) {
		this.rgnId = rgnId;
	}

	/**
	 * 区划编码.
	 * @return
	 */
	public String getRgnCode() {
		return this.rgnCode;
	}

	/**
	 * 区划编码.
	 * @param rgnCode
	 */
	public void setRgnCode(String rgnCode) {
		this.rgnCode = rgnCode;
	}

	/**
	 * 区划名称.
	 * @return
	 */
	public String getRgnName() {
		return this.rgnName;
	}

	/**
	 * 区划名称.
	 * @param rgnName
	 */
	public void setRgnName(String rgnName) {
		this.rgnName = rgnName;
	}

	/**
	 * 自定义字段1.
	 * @return
	 */
	public String getStr01() {
		return this.str01;
	}

	/**
	 * 自定义字段1.
	 * @param str01
	 */
	public void setStr01(String str01) {
		this.str01 = str01;
	}

	/**
	 * 自定义字段2.
	 * @return
	 */
	public String getStr02() {
		return this.str02;
	}

	/**
	 * 自定义字段2.
	 * @param str02
	 */
	public void setStr02(String str02) {
		this.str02 = str02;
	}

	/**
	 * 自定义字段3.
	 * @return
	 */
	public String getStr03() {
		return this.str03;
	}

	/**
	 * 自定义字段3.
	 * @param str03
	 */
	public void setStr03(String str03) {
		this.str03 = str03;
	}

	/**
	 * 自定义字段4.
	 * @return
	 */
	public String getStr04() {
		return this.str04;
	}

	/**
	 * 自定义字段4.
	 * @param str04
	 */
	public void setStr04(String str04) {
		this.str04 = str04;
	}

	/**
	 * 自定义字段5.
	 * @return
	 */
	public String getStr05() {
		return this.str05;
	}

	/**
	 * 自定义字段5.
	 * @param str05
	 */
	public void setStr05(String str05) {
		this.str05 = str05;
	}
	/**
	 * 模板文件.
	 * @return
	 */
	public byte[] getModuleFile() {
		return moduleFile;
	}
	/**
	 * 模板文件.
	 * @param moduleFile
	 */
	public void setModuleFile(byte[] moduleFile) {
		this.moduleFile = moduleFile;
	}
	/**
	 * 模板文件名称.
	 * @return
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * 模板文件名称.
	 * @param fileName
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}