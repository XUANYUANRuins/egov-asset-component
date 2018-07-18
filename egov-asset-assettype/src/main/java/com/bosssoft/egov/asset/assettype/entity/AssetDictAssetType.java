/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Sun Nov 20 15:03:20 CST 2016
 */
package com.bosssoft.egov.asset.assettype.entity;
import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 对象.asset_dict_asset_type 资产类型表
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2016-11-20   xiedeshou　　　新建
 * </pre>
 */
 @Table(name = "asset_dict_asset_type")
public class AssetDictAssetType implements java.io.Serializable {

	private static final long serialVersionUID = 161120150328591L;
	
	// Fields
	
	/**
	 * .
	 */
    @Column(name = "ASSET_TYPE_ID")
	private Long assetTypeId;
	/**
	 * .
	 */
    @Column(name = "ASSET_TYPE_CODE")
	private String assetTypeCode;
	/**
	 * .
	 */
    @Column(name = "ASSET_TYPE_NAME")
	private String assetTypeName;
	/**
	 * .
	 */
    @Column(name = "ASSET_TYPE_PID")
	private Long assetTypePid;
	/**
	 * .
	 */
    @Column(name = "ASSET_TYPE_PCODE")
	private String assetTypePcode;
	/**
	 * .
	 */
    @Column(name = "ASSET_TYPE_PNAME")
	private String assetTypePname;
	/**
	 * .
	 */
    @Column(name = "ASSET_TYPE_TITLE")
	private String assetTypeTitle;
	/**
	 * .
	 */
    @Column(name = "RANK")
	private Integer rank;
	/**
	 * .
	 */
    @Column(name = "ISLEAF")
	private Integer isleaf;
	/**
	 * .
	 */
    @Column(name = "STATUS")
	private String status;
	/**
	 * .
	 */
    @Column(name = "REMARK")
	private String remark;
	/**
	 * .
	 */
    @Column(name = "CREATOR")
	private String creator;
	/**
	 * .
	 */
    @Column(name = "CREATEDATE")
	private String createdate;
	/**
	 * .
	 */
    @Column(name = "STR01")
	private String str01;
	/**
	 * .
	 */
    @Column(name = "STR02")
	private String str02;
	/**
	 * .
	 */
    @Column(name = "STR03")
	private String str03;
	/**
	 * .
	 */
    @Column(name = "STR04")
	private String str04;
	/**
	 * .
	 */
    @Column(name = "STR05")
	private String str05;
	// Constructors
 
    /** default constructor */
	public AssetDictAssetType() {
	}

	/**
	 * .
	 * @return
	 */
	public Long getAssetTypeId() {
		return this.assetTypeId;
	}

	/**
	 * .
	 * @param assetTypeId
	 */
	public void setAssetTypeId(Long assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	/**
	 * .
	 * @return
	 */
	public String getAssetTypeCode() {
		return this.assetTypeCode;
	}

	/**
	 * .
	 * @param assetTypeCode
	 */
	public void setAssetTypeCode(String assetTypeCode) {
		this.assetTypeCode = assetTypeCode;
	}

	/**
	 * .
	 * @return
	 */
	public String getAssetTypeName() {
		return this.assetTypeName;
	}

	/**
	 * .
	 * @param assetTypeName
	 */
	public void setAssetTypeName(String assetTypeName) {
		this.assetTypeName = assetTypeName;
	}

	/**
	 * .
	 * @return
	 */
	public Long getAssetTypePid() {
		return this.assetTypePid;
	}

	/**
	 * .
	 * @param assetTypePid
	 */
	public void setAssetTypePid(Long assetTypePid) {
		this.assetTypePid = assetTypePid;
	}

	/**
	 * .
	 * @return
	 */
	public String getAssetTypePcode() {
		return this.assetTypePcode;
	}

	/**
	 * .
	 * @param assetTypePcode
	 */
	public void setAssetTypePcode(String assetTypePcode) {
		this.assetTypePcode = assetTypePcode;
	}

	/**
	 * .
	 * @return
	 */
	public String getAssetTypePname() {
		return this.assetTypePname;
	}

	/**
	 * .
	 * @param assetTypePname
	 */
	public void setAssetTypePname(String assetTypePname) {
		this.assetTypePname = assetTypePname;
	}

	/**
	 * .
	 * @return
	 */
	public String getAssetTypeTitle() {
		return this.assetTypeTitle;
	}

	/**
	 * .
	 * @param assetTypeTitle
	 */
	public void setAssetTypeTitle(String assetTypeTitle) {
		this.assetTypeTitle = assetTypeTitle;
	}

	/**
	 * .
	 * @return
	 */
	public Integer getRank() {
		return this.rank;
	}

	/**
	 * .
	 * @param rank
	 */
	public void setRank(Integer rank) {
		this.rank = rank;
	}

	/**
	 * .
	 * @return
	 */
	public Integer getIsleaf() {
		return this.isleaf;
	}

	/**
	 * .
	 * @param isleaf
	 */
	public void setIsleaf(Integer isleaf) {
		this.isleaf = isleaf;
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
	public String getCreatedate() {
		return this.createdate;
	}

	/**
	 * .
	 * @param createdate
	 */
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	/**
	 * .
	 * @return
	 */
	public String getStr01() {
		return this.str01;
	}

	/**
	 * .
	 * @param str01
	 */
	public void setStr01(String str01) {
		this.str01 = str01;
	}

	/**
	 * .
	 * @return
	 */
	public String getStr02() {
		return this.str02;
	}

	/**
	 * .
	 * @param str02
	 */
	public void setStr02(String str02) {
		this.str02 = str02;
	}

	/**
	 * .
	 * @return
	 */
	public String getStr03() {
		return this.str03;
	}

	/**
	 * .
	 * @param str03
	 */
	public void setStr03(String str03) {
		this.str03 = str03;
	}

	/**
	 * .
	 * @return
	 */
	public String getStr04() {
		return this.str04;
	}

	/**
	 * .
	 * @param str04
	 */
	public void setStr04(String str04) {
		this.str04 = str04;
	}

	/**
	 * .
	 * @return
	 */
	public String getStr05() {
		return this.str05;
	}

	/**
	 * .
	 * @param str05
	 */
	public void setStr05(String str05) {
		this.str05 = str05;
	}
	
	/**
     * 以下用在下拉树上
     * 
	 */
	public boolean isParent(){
		return !isLeaf();
	}
	
	public boolean getIsParent() {		
		return 0 == (isleaf ==null? 0 : isleaf);
	}
	
	public boolean isLeaf(){
		return (isleaf ==null? 0 : isleaf) == 1;
	}
}