/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Fri Oct 14 15:44:39 CST 2016
 */
package com.bosssoft.egov.asset.aims.api.org.entity;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bosssoft.platform.common.utils.StringUtils;

/**
 * 对象.
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2016-10-14   huangzhenxiong　　　新建
 * </pre>
 */
 @Table(name = "AIMS_BASIC_ORG")
public class AimsBasicOrg implements java.io.Serializable {

	private static final long serialVersionUID = 161014154510783L;
	
	// Fields
	
	/**
	 * 组织机构GUID.
	 */
    @Column(name = "ORG_ID")
    private Long orgId;
	/**
	 * 组织机构父类GUID.
	 */
    @Column(name = "ORG_PID")
    private Long orgPid;
	/**
	 * 组织机构编码.
	 */
    @Column(name = "ORG_CODE")
	private String orgCode;
	/**
	 * 组织机构父类编码.
	 */
    @Column(name = "ORG_PCODE")
	private String orgPcode;
	/**
	 * 组织机构名称.
	 */
    @Column(name = "ORG_NAME")
	private String orgName;
	/**
	 * 组织机构简称.
	 */
    @Column(name = "ORG_TITLE")
	private String orgTitle;
	/**
	 * 级数.
	 */
    @Column(name = "ORG_RANK")
	private Integer orgRank;
	/**
	 * 最细级.
	 */
    @Column(name = "ORG_ISLEAF")
	private String orgIsleaf;
	/**
	 * 使用状态.
	 */
    @Column(name = "ORG_STATUS")
	private String orgStatus;
	/**
	 * 创建者.
	 */
    @Column(name = "CREATOR")
	private String creator;
	/**
	 * 创建时间.
	 */
    @Column(name = "CREATE_DATE")
	private String createDate;
    /**
	 * 创建者ID.
	 */
    @Column(name = "CREATOR_ID")
    private String creatorId;
	/**
	 * 上级编码.
	 */
    @Column(name = "LAST_CODE")
	private String lastCode;
	/**
	 * 执行会计制度编码.
	 */
    @Column(name = "ACC_SYS_CODE")
	private String accSysCode;
	/**
	 * 执行会计制度名称.
	 */
    @Column(name = "ACC_SYS_NAME")
	private String accSysName;
	/**
	 * 资产分类菜单编码.
	 */
    @Column(name = "ASSET_SORT_MENU_CODE")
	private String assetSortMenuCode;
	/**
	 * 资产分类菜单名称.
	 */
    @Column(name = "ASSET_SORT_MENU_NAME")
	private String assetSortMenuName;
	/**
	 * 单位垂管状况编码.
	 */
    @Column(name = "AGEN_PLUMA_CODE")
	private String agenPlumaCode;
	/**
	 * 单位垂管状况名称.
	 */
    @Column(name = "AGEN_PLUMA_NAME")
	private String agenPlumaName;
	/**
	 * 所属财政关系编码.
	 */
    @Column(name = "FINANCES_ATTACH_CODE")
	private String financesAttachCode;
	/**
	 * 所属财政关系名称.
	 */
    @Column(name = "FINANCES_ATTACH_NAME")
	private String financesAttachName;
	/**
	 * 机构行业分类编码.
	 */
    @Column(name = "IND_CODE")
	private String indCode;
	/**
	 * 机构行业分类名称.
	 */
    @Column(name = "IND_NAME")
	private String indName;
	/**
	 * 单位基本性质编码.
	 */
    @Column(name = "ORG_NATURE_CODE")
	private String orgNatureCode;
	/**
	 * 单位基本性质名称.
	 */
    @Column(name = "ORG_NATURE_NAME")
	private String orgNatureName;
	/**
	 * 管理办法编码.
	 */
    @Column(name = "MANAGEMENT_METHOD_CODE")
	private String managementMethodCode;
	/**
	 * 管理办法名称.
	 */
    @Column(name = "MANAGEMENT_METHOD_NAME")
	private String managementMethodName;
	/**
	 * 预算管理级次编码.
	 */
    @Column(name = "BUDGET_MGR_CODE")
	private String budgetMgrCode;
	/**
	 * 预算管理级次名称.
	 */
    @Column(name = "BUDGET_MGR_NAME")
	private String budgetMgrName;
	/**
	 * 单位负责人.
	 */
    @Column(name = "AGEN_PRINCIPAL")
	private String agenPrincipal;
	/**
	 * 财务负责人.
	 */
    @Column(name = "FINANCES_PRINCIPAL")
	private String financesPrincipal;
	/**
	 * 所在区域编码.
	 */
    @Column(name = "AREA_CODE")
	private String areaCode;
	/**
	 * 所在区域名称.
	 */
    @Column(name = "AREA_NAME")
	private String areaName;
	/**
	 * 机构情况编码.
	 */
    @Column(name = "ORG_STATE_CODE")
	private String orgStateCode;
	/**
	 * 机构情况名称.
	 */
    @Column(name = "ORG_STATE_NAME")
	private String orgStateName;
	/**
	 * 填表人.
	 */
    @Column(name = "PREPARER")
	private String preparer;
	/**
	 * 单位业务日期.
	 */
    @Column(name = "AGEN_BUS_DATE")
	private String agenBusDate;
	/**
	 * 成立日期.
	 */
    @Column(name = "BUILD_DATE")
	private String buildDate;
	/**
	 * 批准设立单位.
	 */
    @Column(name = "APPROVE_AGEN")
	private String approveAgen;
	/**
	 * 批准设立文号.
	 */
    @Column(name = "APPROVE_CODE")
	private String approveCode;
	/**
	 * 定编人数.
	 */
    @Column(name = "FIXED_NO")
	private BigDecimal fixedNo;
    
	/**
	 * 开户银行.
	 */
    @Column(name = "BANK")
	private String bank;

	/**
	 * 银行账号.
	 */
    @Column(name = "BANK_ACCOUNT")
	private String bankAccount;

	/**
	 * 单位地址.
	 */
    @Column(name = "ADDR")
	private String addr;

	/**
	 * 备用码.
	 */
    @Column(name = "STANDBY_CODE")
	private String standbyCode;
	/**
	 * 单位资产总账.
	 */
    @Column(name = "AGEN_ASSET_TOTAL")
	private BigDecimal agenAssetTotal;
	/**
	 * 自定义折旧.
	 */
    @Column(name = "SELF_DEFINED_DEPRECIATION")
	private String selfDefinedDepreciation;
	/**
	 * 单位统一编码.
	 */
    @Column(name = "AGEN_UNIFIED_CODE")
	private String agenUnifiedCode;
	/**
	 * 上级单位统一编码.
	 */
    @Column(name = "LAST_AGEN_UNIFIED_CODE")
	private String lastAgenUnifiedCode;
	/**
	 * 单位流水号.
	 */
    @Column(name = "SERIAL_NO")
	private String serialNo;
	/**
	 * 邮编.
	 */
    @Column(name = "POST_CODE")
	private String postCode;
	/**
	 * 电话号码.
	 */
    @Column(name = "PHONE")
	private String phone;
	/**
	 * 购置标准.
	 */
    @Column(name = "BUY_STANDARD")
	private String buyStandard;
	/**
	 * 单位层次代码.
	 */
    @Column(name = "LEVEL_CODE")
	private String levelCode;
	/**
	 * 组织机构代码.
	 */
    @Column(name = "ORG_REG_CODE")
	private String orgRegCode;
	/**
	 * 上报标志.
	 */
    @Column(name = "REPORT_MARK")
	private String reportMark;
	/**
	 * 单位类型编码.
	 */
    @Column(name = "AGEN_TYPE_CODE")
	private String agenTypeCode;
	/**
	 * 单位类型名称.
	 */
    @Column(name = "AGEN_TYPE_NAME")
	private String agenTypeName;
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
	 * 是否上报年报.
	 */
    @Column(name = "ISANNUAL_REPORT")
	private String isannualReport;
	/**
	 * 决算的单位代码.
	 */
    @Column(name = "FINAL_ACC_AGEN_REG_CODE")
	private String finalAccAgenRegCode;
	/**
	 * 所属财政关系编码.
	 */
    @Column(name = "FINANCES_RELATION_CODE")
	private String financesRelationCode;
	/**
	 * 所属财政关系名称.
	 */
    @Column(name = "FINANCES_RELATION_NAME")
	private String financesRelationName;
	/**
	 * 决算单位的报表类型
	 * .
	 */
    @Column(name = "FINAL_ACC_AGEN_REPORT_TYPE")
	private Integer finalAccAgenReportType;
	/**
	 * 单位行业性质编码.
	 */
    @Column(name = "IND_NATURE_CODE")
	private String indNatureCode;
	/**
	 * 单位行业性质名称.
	 */
    @Column(name = "IND_NATURE_NAME")
	private String indNatureName;
    /**
	 * .
	 */
    @Column(name = "RECID")
    private String recid;
    /**
	 * .
	 */
    @Column(name = "PARENTID")
    private String parentid;
    
    /**
	 * 财政预算代码.
	 */
    @Column(name = "FINANCE_BUDGET_CODE")
    private String financeBudgetCode;
    
    /**
	 * 法定代表人.
	 */
    @Column(name = "LEGAL_REPRESENTATIVE")
    private String legalRJepresentive;
    
    /**
	 * 主管部门.
	 */
    @Column(name = "COMPETENT_DEPT")
    private String competentDept;
    
    /**
     * 是否启用折旧.
     */
    @Column(name = "IS_DEPR")
    private String isDepr;
    
    /**
	 * 备注.
	 */
    @Column(name = "REMARK")
    private String remark;
    
    /**
     * 制单日期. 
     */
    @Column(name = "MAKE_DATE")
    private String makeDate;
	
    /**
     * 折旧类型编码. 
     */
    @Column(name = "DEPR_TYPE_CODE")
    public String deprTypeCode;
    
    /**
     * 折旧类型名称. 
     */
    @Column(name = "DEPR_TYPE_NAME")
    public String deprTypeName;
    
    /**
     *  信息是否已经初始化
     */
    @Column(name = "INIT_STATUS")
    private Integer initStatus;
    
    @Transient
    private String roleId;
    
    @Transient
    private String roleCode;
    
    @Transient
    private String roleName;
    
    @Transient
    private String roleType;
    /**
     *  财务负责人电话
     */
    @Column(name="FINANCES_PRINCIPAL_PHONE")
    private String financesPrincipalPhone;
    /**
     *  资产管理员
     */
    @Column(name="ASSET_MANAGER")
    private String assetManager;
    /**
     *  资产管理员电话
     */
    @Column(name="ASSET_MANAGER_PHONE")
    private String assetManagerPhone;
    
    
	// Constructors
 
    /** default constructor */
	public AimsBasicOrg() {
	}

	/**
	 * 组织机构GUID.
	 * @return
	 */
	public Long getOrgId() {
		return this.orgId;
	}

	/**
	 * 组织机构GUID.
	 * @param orgId
	 */
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	/**
	 * 组织机构父类GUID.
	 * @return
	 */
	public Long getOrgPid() {
		return this.orgPid;
	}

	/**
	 * 组织机构父类GUID.
	 * @param orgPid
	 */
	public void setOrgPid(Long orgPid) {
		this.orgPid = orgPid;
	}

	/**
	 * 组织机构编码.
	 * @return
	 */
	public String getOrgCode() {
		return this.orgCode;
	}

	/**
	 * 组织机构编码.
	 * @param orgCode
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	/**
	 * 组织机构父类编码.
	 * @return
	 */
	public String getOrgPcode() {
		return this.orgPcode;
	}

	/**
	 * 组织机构父类编码.
	 * @param orgPcode
	 */
	public void setOrgPcode(String orgPcode) {
		this.orgPcode = orgPcode;
	}

	/**
	 * 组织机构名称.
	 * @return
	 */
	public String getOrgName() {
		return this.orgName;
	}

	/**
	 * 组织机构名称.
	 * @param orgName
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/**
	 * 组织机构简称.
	 * @return
	 */
	public String getOrgTitle() {
		return this.orgTitle;
	}

	/**
	 * 组织机构简称.
	 * @param orgTitle
	 */
	public void setOrgTitle(String orgTitle) {
		this.orgTitle = orgTitle;
	}

	/**
	 * 级数.
	 * @return
	 */
	public Integer getOrgRank() {
		return this.orgRank;
	}

	/**
	 * 级数.
	 * @param orgRank
	 */
	public void setOrgRank(Integer orgRank) {
		this.orgRank = orgRank;
	}

	/**
	 * 最细级.
	 * @return
	 */
	public String getOrgIsleaf() {
		return this.orgIsleaf;
	}

	/**
	 * 最细级.
	 * @param orgIsleaf
	 */
	public void setOrgIsleaf(String orgIsleaf) {
		this.orgIsleaf = orgIsleaf;
	}

	/**
	 * 使用状态.
	 * @return
	 */
	public String getOrgStatus() {
		return this.orgStatus;
	}

	/**
	 * 使用状态.
	 * @param orgStatus
	 */
	public void setOrgStatus(String orgStatus) {
		this.orgStatus = orgStatus;
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
	 * 上级编码.
	 * @return
	 */
	public String getLastCode() {
		return this.lastCode;
	}

	/**
	 * 上级编码.
	 * @param lastCode
	 */
	public void setLastCode(String lastCode) {
		this.lastCode = lastCode;
	}

	/**
	 * 执行会计制度编码.
	 * @return
	 */
	public String getAccSysCode() {
		return this.accSysCode;
	}

	/**
	 * 执行会计制度编码.
	 * @param accSysCode
	 */
	public void setAccSysCode(String accSysCode) {
		this.accSysCode = accSysCode;
	}

	/**
	 * 执行会计制度名称.
	 * @return
	 */
	public String getAccSysName() {
		return this.accSysName;
	}

	/**
	 * 执行会计制度名称.
	 * @param accSysName
	 */
	public void setAccSysName(String accSysName) {
		this.accSysName = accSysName;
	}

	/**
	 * 资产分类菜单编码.
	 * @return
	 */
	public String getAssetSortMenuCode() {
		return this.assetSortMenuCode;
	}

	/**
	 * 资产分类菜单编码.
	 * @param assetSortMenuCode
	 */
	public void setAssetSortMenuCode(String assetSortMenuCode) {
		this.assetSortMenuCode = assetSortMenuCode;
	}

	/**
	 * 资产分类菜单名称.
	 * @return
	 */
	public String getAssetSortMenuName() {
		return this.assetSortMenuName;
	}

	/**
	 * 资产分类菜单名称.
	 * @param assetSortMenuName
	 */
	public void setAssetSortMenuName(String assetSortMenuName) {
		this.assetSortMenuName = assetSortMenuName;
	}

	/**
	 * 单位垂管状况编码.
	 * @return
	 */
	public String getAgenPlumaCode() {
		return this.agenPlumaCode;
	}

	/**
	 * 单位垂管状况编码.
	 * @param agenPlumaCode
	 */
	public void setAgenPlumaCode(String agenPlumaCode) {
		this.agenPlumaCode = agenPlumaCode;
	}

	/**
	 * 单位垂管状况名称.
	 * @return
	 */
	public String getAgenPlumaName() {
		return this.agenPlumaName;
	}

	/**
	 * 单位垂管状况名称.
	 * @param agenPlumaName
	 */
	public void setAgenPlumaName(String agenPlumaName) {
		this.agenPlumaName = agenPlumaName;
	}

	/**
	 * 所属财政关系编码.
	 * @return
	 */
	public String getFinancesAttachCode() {
		return this.financesAttachCode;
	}

	/**
	 * 所属财政关系编码.
	 * @param financesAttachCode
	 */
	public void setFinancesAttachCode(String financesAttachCode) {
		this.financesAttachCode = financesAttachCode;
	}

	/**
	 * 所属财政关系名称.
	 * @return
	 */
	public String getFinancesAttachName() {
		return this.financesAttachName;
	}

	/**
	 * 所属财政关系名称.
	 * @param financesAttachName
	 */
	public void setFinancesAttachName(String financesAttachName) {
		this.financesAttachName = financesAttachName;
	}

	/**
	 * 机构行业分类编码.
	 * @return
	 */
	public String getIndCode() {
		return this.indCode;
	}

	/**
	 * 机构行业分类编码.
	 * @param indCode
	 */
	public void setIndCode(String indCode) {
		this.indCode = indCode;
	}

	/**
	 * 机构行业分类名称.
	 * @return
	 */
	public String getIndName() {
		return this.indName;
	}

	/**
	 * 机构行业分类名称.
	 * @param indName
	 */
	public void setIndName(String indName) {
		this.indName = indName;
	}

	/**
	 * 单位基本性质编码.
	 * @return
	 */
	public String getOrgNatureCode() {
		return this.orgNatureCode;
	}

	/**
	 * 单位基本性质编码.
	 * @param orgNatureCode
	 */
	public void setOrgNatureCode(String orgNatureCode) {
		this.orgNatureCode = orgNatureCode;
	}

	/**
	 * 单位基本性质名称.
	 * @return
	 */
	public String getOrgNatureName() {
		return this.orgNatureName;
	}

	/**
	 * 单位基本性质名称.
	 * @param orgNatureName
	 */
	public void setOrgNatureName(String orgNatureName) {
		this.orgNatureName = orgNatureName;
	}

	/**
	 * 管理办法编码.
	 * @return
	 */
	public String getManagementMethodCode() {
		return this.managementMethodCode;
	}

	/**
	 * 管理办法编码.
	 * @param managementMethodCode
	 */
	public void setManagementMethodCode(String managementMethodCode) {
		this.managementMethodCode = managementMethodCode;
	}

	/**
	 * 管理办法名称.
	 * @return
	 */
	public String getManagementMethodName() {
		return this.managementMethodName;
	}

	/**
	 * 管理办法名称.
	 * @param managementMethodName
	 */
	public void setManagementMethodName(String managementMethodName) {
		this.managementMethodName = managementMethodName;
	}

	/**
	 * 预算管理级次编码.
	 * @return
	 */
	public String getBudgetMgrCode() {
		return this.budgetMgrCode;
	}

	/**
	 * 预算管理级次编码.
	 * @param budgetMgrCode
	 */
	public void setBudgetMgrCode(String budgetMgrCode) {
		this.budgetMgrCode = budgetMgrCode;
	}

	/**
	 * 预算管理级次名称.
	 * @return
	 */
	public String getBudgetMgrName() {
		return this.budgetMgrName;
	}

	/**
	 * 预算管理级次名称.
	 * @param budgetMgrName
	 */
	public void setBudgetMgrName(String budgetMgrName) {
		this.budgetMgrName = budgetMgrName;
	}

	/**
	 * 单位负责人.
	 * @return
	 */
	public String getAgenPrincipal() {
		return this.agenPrincipal;
	}

	/**
	 * 单位负责人.
	 * @param agenPrincipal
	 */
	public void setAgenPrincipal(String agenPrincipal) {
		this.agenPrincipal = agenPrincipal;
	}

	/**
	 * 财务负责人.
	 * @return
	 */
	public String getFinancesPrincipal() {
		return this.financesPrincipal;
	}

	/**
	 * 财务负责人.
	 * @param financesPrincipal
	 */
	public void setFinancesPrincipal(String financesPrincipal) {
		this.financesPrincipal = financesPrincipal;
	}

	/**
	 * 所在区域编码.
	 * @return
	 */
	public String getAreaCode() {
		return this.areaCode;
	}

	/**
	 * 所在区域编码.
	 * @param areaCode
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	/**
	 * 所在区域名称.
	 * @return
	 */
	public String getAreaName() {
		return this.areaName;
	}

	/**
	 * 所在区域名称.
	 * @param areaName
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	/**
	 * 机构情况编码.
	 * @return
	 */
	public String getOrgStateCode() {
		return this.orgStateCode;
	}

	/**
	 * 机构情况编码.
	 * @param orgStateCode
	 */
	public void setOrgStateCode(String orgStateCode) {
		this.orgStateCode = orgStateCode;
	}

	/**
	 * 机构情况名称.
	 * @return
	 */
	public String getOrgStateName() {
		return this.orgStateName;
	}

	/**
	 * 机构情况名称.
	 * @param orgStateName
	 */
	public void setOrgStateName(String orgStateName) {
		this.orgStateName = orgStateName;
	}

	/**
	 * 填表人.
	 * @return
	 */
	public String getPreparer() {
		return this.preparer;
	}

	/**
	 * 填表人.
	 * @param preparer
	 */
	public void setPreparer(String preparer) {
		this.preparer = preparer;
	}

	/**
	 * 单位业务日期.
	 * @return
	 */
	public String getAgenBusDate() {
		return this.agenBusDate;
	}

	/**
	 * 单位业务日期.
	 * @param agenBusDate
	 */
	public void setAgenBusDate(String agenBusDate) {
		this.agenBusDate = agenBusDate;
	}

	/**
	 * 成立日期.
	 * @return
	 */
	public String getBuildDate() {
		return this.buildDate;
	}

	/**
	 * 成立日期.
	 * @param buildDate
	 */
	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}

	/**
	 * 批准设立单位.
	 * @return
	 */
	public String getApproveAgen() {
		return this.approveAgen;
	}

	/**
	 * 批准设立单位.
	 * @param approveAgen
	 */
	public void setApproveAgen(String approveAgen) {
		this.approveAgen = approveAgen;
	}

	/**
	 * 批准设立文号.
	 * @return
	 */
	public String getApproveCode() {
		return this.approveCode;
	}

	/**
	 * 批准设立文号.
	 * @param approveCode
	 */
	public void setApproveCode(String approveCode) {
		this.approveCode = approveCode;
	}

	/**
	 * 定编人数.
	 * @return
	 */
	public BigDecimal getFixedNo() {
		return this.fixedNo;
	}

	/**
	 * 定编人数.
	 * @param fixedNo
	 */
	public void setFixedNo(BigDecimal fixedNo) {
		this.fixedNo = fixedNo;
	}

	/**
	 * 开户银行.
	 * @return
	 */
	public String getBank() {
		return this.bank;
	}

	/**
	 * 开户银行.
	 * @param bank
	 */
	public void setBank(String bank) {
		this.bank = bank;
	}

	/**
	 * 银行账号.
	 * @return
	 */
	public String getBankAccount() {
		return this.bankAccount;
	}

	/**
	 * 银行账号.
	 * @param bankAccount
	 */
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	/**
	 * 单位地址.
	 * @return
	 */
	public String getAddr() {
		return this.addr;
	}

	/**
	 * 单位地址.
	 * @param addr
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	/**
	 * 备用码.
	 * @return
	 */
	public String getStandbyCode() {
		return this.standbyCode;
	}

	/**
	 * 备用码.
	 * @param standbyCode
	 */
	public void setStandbyCode(String standbyCode) {
		this.standbyCode = standbyCode;
	}

	/**
	 * 单位资产总账.
	 * @return
	 */
	public BigDecimal getAgenAssetTotal() {
		return this.agenAssetTotal;
	}

	/**
	 * 单位资产总账.
	 * @param agenAssetTotal
	 */
	public void setAgenAssetTotal(BigDecimal agenAssetTotal) {
		this.agenAssetTotal = agenAssetTotal;
	}

	/**
	 * 自定义折旧.
	 * @return
	 */
	public String getSelfDefinedDepreciation() {
		return this.selfDefinedDepreciation;
	}

	/**
	 * 自定义折旧.
	 * @param selfDefinedDepreciation
	 */
	public void setSelfDefinedDepreciation(String selfDefinedDepreciation) {
		this.selfDefinedDepreciation = selfDefinedDepreciation;
	}

	/**
	 * 单位统一编码.
	 * @return
	 */
	public String getAgenUnifiedCode() {
		return this.agenUnifiedCode;
	}

	/**
	 * 单位统一编码.
	 * @param agenUnifiedCode
	 */
	public void setAgenUnifiedCode(String agenUnifiedCode) {
		this.agenUnifiedCode = agenUnifiedCode;
	}

	/**
	 * 上级单位统一编码.
	 * @return
	 */
	public String getLastAgenUnifiedCode() {
		return this.lastAgenUnifiedCode;
	}

	/**
	 * 上级单位统一编码.
	 * @param lastAgenUnifiedCode
	 */
	public void setLastAgenUnifiedCode(String lastAgenUnifiedCode) {
		this.lastAgenUnifiedCode = lastAgenUnifiedCode;
	}

	/**
	 * 单位流水号.
	 * @return
	 */
	public String getSerialNo() {
		return this.serialNo;
	}

	/**
	 * 单位流水号.
	 * @param serialNo
	 */
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	/**
	 * 邮编.
	 * @return
	 */
	public String getPostCode() {
		return this.postCode;
	}

	/**
	 * 邮编.
	 * @param postCode
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * 电话号码.
	 * @return
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 * 电话号码.
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 购置标准.
	 * @return
	 */
	public String getBuyStandard() {
		return this.buyStandard;
	}

	/**
	 * 购置标准.
	 * @param buyStandard
	 */
	public void setBuyStandard(String buyStandard) {
		this.buyStandard = buyStandard;
	}

	/**
	 * 单位层次代码.
	 * @return
	 */
	public String getLevelCode() {
		return this.levelCode;
	}

	/**
	 * 单位层次代码.
	 * @param levelCode
	 */
	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	/**
	 * 组织机构代码.
	 * @return
	 */
	public String getOrgRegCode() {
		return this.orgRegCode;
	}

	/**
	 * 组织机构代码.
	 * @param orgRegCode
	 */
	public void setOrgRegCode(String orgRegCode) {
		this.orgRegCode = orgRegCode;
	}

	/**
	 * 上报标志.
	 * @return
	 */
	public String getReportMark() {
		return this.reportMark;
	}

	/**
	 * 上报标志.
	 * @param reportMark
	 */
	public void setReportMark(String reportMark) {
		this.reportMark = reportMark;
	}

	/**
	 * 单位类型编码.
	 * @return
	 */
	public String getAgenTypeCode() {
		return this.agenTypeCode;
	}

	/**
	 * 单位类型编码.
	 * @param agenTypeCode
	 */
	public void setAgenTypeCode(String agenTypeCode) {
		this.agenTypeCode = agenTypeCode;
	}

	/**
	 * 单位类型名称.
	 * @return
	 */
	public String getAgenTypeName() {
		return this.agenTypeName;
	}

	/**
	 * 单位类型名称.
	 * @param agenTypeName
	 */
	public void setAgenTypeName(String agenTypeName) {
		this.agenTypeName = agenTypeName;
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
	 * 是否上报年报.
	 * @return
	 */
	public String getIsannualReport() {
		return this.isannualReport;
	}

	/**
	 * 是否上报年报.
	 * @param isannualReport
	 */
	public void setIsannualReport(String isannualReport) {
		this.isannualReport = isannualReport;
	}

	/**
	 * 决算的单位代码.
	 * @return
	 */
	public String getFinalAccAgenRegCode() {
		return this.finalAccAgenRegCode;
	}

	/**
	 * 决算的单位代码.
	 * @param finalAccAgenRegCode
	 */
	public void setFinalAccAgenRegCode(String finalAccAgenRegCode) {
		this.finalAccAgenRegCode = finalAccAgenRegCode;
	}

	/**
	 * 所属财政关系编码.
	 * @return
	 */
	public String getFinancesRelationCode() {
		return this.financesRelationCode;
	}

	/**
	 * 所属财政关系编码.
	 * @param financesRelationCode
	 */
	public void setFinancesRelationCode(String financesRelationCode) {
		this.financesRelationCode = financesRelationCode;
	}

	/**
	 * 所属财政关系名称.
	 * @return
	 */
	public String getFinancesRelationName() {
		return this.financesRelationName;
	}

	/**
	 * 所属财政关系名称.
	 * @param financesRelationName
	 */
	public void setFinancesRelationName(String financesRelationName) {
		this.financesRelationName = financesRelationName;
	}

	/**
	 * 决算单位的报表类型.
	 * @return
	 */
	public Integer getFinalAccAgenReportType() {
		return this.finalAccAgenReportType;
	}

	/**
	 * 决算单位的报表类型.
	 * @param finalAccAgenReportType
	 */
	public void setFinalAccAgenReportType(Integer finalAccAgenReportType) {
		this.finalAccAgenReportType = finalAccAgenReportType;
	}

	/**
	 * 单位行业性质编码.
	 * @return
	 */
	public String getIndNatureCode() {
		return this.indNatureCode;
	}

	/**
	 * 单位行业性质编码.
	 * @param indNatureCode
	 */
	public void setIndNatureCode(String indNatureCode) {
		this.indNatureCode = indNatureCode;
	}

	/**
	 * 单位行业性质名称.
	 * @return
	 */
	public String getIndNatureName() {
		return this.indNatureName;
	}

	/**
	 * 单位行业性质名称.
	 * @param indNatureName
	 */
	public void setIndNatureName(String indNatureName) {
		this.indNatureName = indNatureName;
	}
	/**
	 * .
	 * @return
	 */
	public String getRecid() {
		return recid;
	}
	/**
	 * .
	 * @param recid
	 */
	public void setRecid(String recid) {
		this.recid = recid;
	}
	/**
	 * .
	 * @return
	 */
	public String getParentid() {
		return parentid;
	}
	/**
	 * .
	 * @param parentid
	 */
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	/**
	 * 创建者ID.
	 * @return
	 */
	public String getCreatorId() {
		return creatorId;
	}
	/**
	 * 创建者ID.
	 * @param creatorId
	 */
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	/**
	 * 法定代表人.
	 * @return
	 */
	public String getLegalRJepresentive() {
		return legalRJepresentive;
	}
	/**
	 * 法定代表人.
	 * @param legalRJepresentive
	 */
	public void setLegalRJepresentive(String legalRJepresentive) {
		this.legalRJepresentive = legalRJepresentive;
	}
	/**
	 * 备注.
	 * @return
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 备注.
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 制单日期.
	 * @return
	 */
	public String getMakeDate() {
		return makeDate;
	}
	/**
	 * 制单日期.
	 * @param makeDate
	 */
	public void setMakeDate(String makeDate) {
		this.makeDate = makeDate;
	}
	/**
	 * 财政预算代码.
	 * @return
	 */
	public String getFinanceBudgetCode() {
		return this.financeBudgetCode;
	}
	/**
	 * 财政预算代码.
	 * @param financeBudgetCode
	 */
	public void setFinanceBudgetCode(String financeBudgetCode) {
		this.financeBudgetCode = financeBudgetCode;
	}
	/**
	 * 主管部门.
	 * @return
	 */
	public String getCompetentDept() {
		return competentDept;
	}
	/**
	 * 主管部门.
	 * @param competentDept
	 */
	public void setCompetentDept(String competentDept) {
		this.competentDept = competentDept;
	}
	/**
	 * 是否启用折旧.
	 * @return
	 */
	public String getIsDepr() {
		return isDepr;
	}
	/**
	 * 是否启用折旧.
	 * @param isDepr
	 */
	public void setIsDepr(String isDepr) {
		this.isDepr = isDepr;
	}
	/**
	 * 折旧类型编码.
	 * @return
	 */
	public String getDeprTypeCode() {
		return deprTypeCode;
	}
	/**
	 * 折旧类型编码.
	 * @param deprTypeCode
	 */
	public void setDeprTypeCode(String deprTypeCode) {
		this.deprTypeCode = deprTypeCode;
	}
	/**
	 * 折旧类型名称.
	 * @return
	 */
	public String getDeprTypeName() {
		return deprTypeName;
	}
	/**
	 * 折旧类型名称.
	 * @param deprTypeName
	 */
	public void setDeprTypeName(String deprTypeName) {
		this.deprTypeName = deprTypeName;
	}
	
	public String getTreeNode() {
//		return this.orgCode + " " + this.orgName;
		return getFinanceBudgetCode() + " " + this.orgName;
	}
	
	public boolean isParent() {
		return !isLeaf();
	}

	public boolean getIsParent() {
		return "0".equals(orgIsleaf==null? "0" : orgIsleaf);
	}

	public boolean isLeaf() {
		return (orgIsleaf==null? "0" : orgIsleaf).equals("1");
	}

	public Integer getInitStatus() {
		return initStatus;
	}

	public void setInitStatus(Integer initStatus) {
		this.initStatus = initStatus;
	}
	//拼接  预算编码和单位名称
	public String getBudgetCodeAndName(){
		return StringUtils.ifNullToBlank(this.financeBudgetCode) + " " + this.orgName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getFinancesPrincipalPhone() {
		return financesPrincipalPhone;
	}

	public void setFinancesPrincipalPhone(String financesPrincipalPhone) {
		this.financesPrincipalPhone = financesPrincipalPhone;
	}

	public String getAssetManager() {
		return assetManager;
	}

	public void setAssetManager(String assetManager) {
		this.assetManager = assetManager;
	}

	public String getAssetManagerPhone() {
		return assetManagerPhone;
	}

	public void setAssetManagerPhone(String assetManagerPhone) {
		this.assetManagerPhone = assetManagerPhone;
	}
	
}