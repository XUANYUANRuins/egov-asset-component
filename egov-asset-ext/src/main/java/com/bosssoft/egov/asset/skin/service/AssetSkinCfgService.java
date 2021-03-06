/*******************************************************************************
 * 福建博思软件1997-2017 版权所有
 * 
 * Auto generated by Bosssoft Studio version 1.0 beta
 * 2018年1月26日下午4:07:06
 *******************************************************************************/
package com.bosssoft.egov.asset.skin.service;

import com.bosssoft.egov.asset.skin.entiry.AssetSkinCfg;
import com.bosssoft.platform.runtime.web.response.AjaxResult;

/**
 * @ClassName	类名：AssetSkinCfgService.java
 * @Description	功能说明：皮肤配置service接口
 * <pre>
 * @date		创建日期：2018年1月26日
 * @author		创建人：chenzhibin
 * @version		版本号：V1.0
 * <pre>
 *-------------------修订记录---------------------
 */
public interface AssetSkinCfgService {
	
	/**
	 * <p>功能说明：添加皮肤配置
	 * </p>
	 * <p>参数说明：
	 * @param skin
	 * </p>
	 *
	 * @date	创建时间：2018年1月26日
	 * @author	作者：chenzhibin
	 */
	public AjaxResult addSkinCfg(AssetSkinCfg skin);
	
	/**
	 * <p>功能说明：根据用户获取皮肤配置
	 * </p>
	 * <p>参数说明：
	 * </p>
	 *
	 * @date	创建时间：2018年1月26日
	 * @author	作者：chenzhibin
	 */
	public AssetSkinCfg getSkinCfg();
}
