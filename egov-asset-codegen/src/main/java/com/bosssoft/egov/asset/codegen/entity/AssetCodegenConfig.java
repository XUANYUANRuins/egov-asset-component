/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Wed Dec 07 08:28:12 CST 2016
 */
package com.bosssoft.egov.asset.codegen.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 对象.
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2016-12-07   xiedeshou　　　新建
 * </pre>
 */
 @Table(name = "asset_codegen_config")
public class AssetCodegenConfig implements java.io.Serializable {

	private static final long serialVersionUID = 161207082824578L;
	
	// Fields
	
	/**
	 * .
	 */
	@Id
    @Column(name = "CFG_ID")
	private Long cfgId;
	/**
	 * .
	 */
    @Column(name = "ORG_ID")
	private String orgId;
	/**
	 * .
	 */
    @Column(name = "BIZ_TYPE")
	private String bizType;
	/**
	 * .
	 */
    @Column(name = "BIZ_NAME")
	private String bizName;
	/**
	 * .
	 */
    @Column(name = "SEQ_RESET")
	private String seqReset;
	/**
	 * .
	 */
    @Column(name = "CUR_NO")
	private Integer curNo;
	/**
	 * .
	 */
    @Column(name = "CUR_CODE")
	private String curCode;
	/**
	 * .
	 */
    @Column(name = "CUR_RESET")
	private String curReset;
    
    /**
      * 编码生成策略 ADD 新增时计算编码 ADD2SAVE 新增保存时计算编码
      */
    @Column(name = "GEN_RULE")
    private String genRule;
    
    /**
     * 分隔符 即各规则组合的字符
     */
    @Column(name = "SEP_STR")
    private String separator;   
    
    @Column(name = "STEP")
    private String step;
    
    /**
     * genType
     * 作用域 全局 （系统公用）局部（单位公用）
     */
    @Column(name = "GEN_TYPE")
    private String genType;
	/**
	 * .
	 */
    @Column(name = "STATUS")
	private String status;
	/**
	 * .
	 */
    @Column(name = "CREATOR_ID")
	private String creatorId;
	/**
	 * .
	 */
    @Column(name = "CREATOR")
	private String creator;
	/**
	 * .
	 */
    @Column(name = "CREATE_TIME")
	private String createTime;
	/**
	 * .
	 */
    @Column(name = "REMARK")
	private String remark;
    
    @Transient
    private List<AssetCodegenRule> rules = new ArrayList<AssetCodegenRule>(0);
	
	// Constructors
 
    /** default constructor */
	public AssetCodegenConfig() {
	}

	/**
	 * .
	 * @return
	 */
	public Long getCfgId() {
		return this.cfgId;
	}

	/**
	 * .
	 * @param cfgId
	 */
	public void setCfgId(Long cfgId) {
		this.cfgId = cfgId;
	}

	/**
	 * .
	 * @return
	 */
	public String getOrgId() {
		return this.orgId;
	}

	/**
	 * .
	 * @param orgId
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	/**
	 * .
	 * @return
	 */
	public String getBizType() {
		return this.bizType;
	}

	/**
	 * .
	 * @param bizType
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	/**
	 * .
	 * @return
	 */
	public String getBizName() {
		return this.bizName;
	}

	/**
	 * .
	 * @param bizName
	 */
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	/**
	 * .
	 * @return
	 */
	public String getSeqReset() {
		return this.seqReset;
	}

	/**
	 * .
	 * @param seqReset
	 */
	public void setSeqReset(String seqReset) {
		this.seqReset = seqReset;
	}

	/**
	 * .
	 * @return
	 */
	public Integer getCurNo() {
		return this.curNo;
	}

	/**
	 * .
	 * @param curNo
	 */
	public void setCurNo(Integer curNo) {
		this.curNo = curNo;
	}

	/**
	 * .
	 * @return
	 */
	public String getCurCode() {
		return this.curCode;
	}

	/**
	 * .
	 * @param curCode
	 */
	public void setCurCode(String curCode) {
		this.curCode = curCode;
	}

	/**
	 * .
	 * @return
	 */
	public String getCurReset() {
		return this.curReset;
	}

	/**
	 * .
	 * @param curReset
	 */
	public void setCurReset(String curReset) {
		this.curReset = curReset;
	}

	/**
	 * .
	 * @return
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * .
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * .
	 * @return
	 */
	public String getCreatorId() {
		return this.creatorId;
	}

	/**
	 * .
	 * @param creatorId
	 */
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	/**
	 * .
	 * @return
	 */
	public String getCreator() {
		return this.creator;
	}

	/**
	 * .
	 * @param creator
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * .
	 * @return
	 */
	public String getCreateTime() {
		return this.createTime;
	}

	/**
	 * .
	 * @param createTime
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * .
	 * @return
	 */
	public String getRemark() {
		return this.remark;
	}

	/**
	 * .
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<AssetCodegenRule> getRules() {
		return rules;
	}

	public void setRules(List<AssetCodegenRule> rules) {
		this.rules = rules;
	}

	public String getGenRule() {
		return genRule;
	}

	public void setGenRule(String genRule) {
		this.genRule = genRule;
	}

	public String getSeparator() {
		return separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public String getGenType() {
		return genType;
	}

	public void setGenType(String genType) {
		this.genType = genType;
	}
}