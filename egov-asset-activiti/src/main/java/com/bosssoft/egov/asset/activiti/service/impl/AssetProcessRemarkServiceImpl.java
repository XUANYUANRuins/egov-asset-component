package com.bosssoft.egov.asset.activiti.service.impl;

/**
 * 福建博思软件 1997-2016 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Fri Nov 25 16:04:28 CST 2016
 */

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosssoft.egov.asset.activiti.entity.AssetActivitiBus;
import com.bosssoft.egov.asset.activiti.entity.AssetProcessRemark;
import com.bosssoft.egov.asset.activiti.mapper.AssetProcessRemarkMapper;
import com.bosssoft.egov.asset.activiti.service.AssetActivitiBusService;
import com.bosssoft.egov.asset.activiti.service.AssetProcessRemarkService;
import com.bosssoft.egov.asset.common.util.OrderByUtil;
import com.bosssoft.egov.asset.common.util.StringUtilsExt;
import com.bosssoft.egov.asset.runtime.web.context.AppContext;
import com.bosssoft.platform.common.lang.data.Page;
import com.bosssoft.platform.common.lang.data.Searcher;
import com.bosssoft.platform.common.utils.StringUtils;

/**
 * 类说明: AssetProcessRemarkService接口实现类.
 *
 * 类用途：
 *
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2016-11-25   jinbiao　　　新建
 * </pre>
 */
@Service
public class AssetProcessRemarkServiceImpl implements AssetProcessRemarkService {

	private static Logger logger = LoggerFactory.getLogger(AssetProcessRemarkServiceImpl.class);

	// TODO 添加需要的Mapper
	@Autowired
	private AssetProcessRemarkMapper assetProcessRemarkMapper;

	@Autowired
	private AssetActivitiBusService actservice;

	/**
	 *
	 * @param assetProcessRemark
	 */
	public void addAssetProcessRemark(AssetProcessRemark assetProcessRemark) {
		assetProcessRemark.setAppId(AppContext.getAppContext().getAppConfiguration().getAppId());
		assetProcessRemark.setAppName(AppContext.getAppContext().getAppConfiguration().getAppName());
		assetProcessRemarkMapper.insertSelective(assetProcessRemark);
	}

	/**
	 *
	 * @param assetProcessRemark
	 */
	public void delAssetProcessRemark(AssetProcessRemark assetProcessRemark) {
		assetProcessRemarkMapper.deleteByPrimaryKey(assetProcessRemark);
	}

	/**
	 *
	 * @param assetProcessRemark
	 */
	public void updateAssetProcessRemark(AssetProcessRemark assetProcessRemark) {
		assetProcessRemarkMapper.updateByPrimaryKey(assetProcessRemark);
	}

	/**
	 *
	 * @param assetProcessRemark
	 * @retrun
	 */
	public List<AssetProcessRemark> getAssetProcessRemarkList(AssetProcessRemark assetProcessRemark) {
		return assetProcessRemarkMapper.select(assetProcessRemark);
	}

	/**
	 *
	 * @param searcher
	 * @param page
	 * @retrun
	 */
	public Page<AssetProcessRemark> queryAssetProcessRemarkPage(Searcher searcher, Page<AssetProcessRemark> page) {
		return assetProcessRemarkMapper.queryAssetProcessRemarkPage(searcher, page);
	}

	/**
	 *
	 * @param 取出特定用户特定类型的指定操作
	 * 
	 *            已审核，已退回tab
	 * 
	 * @param result
	 *            用户的处理方式
	 * @retrun
	 */
	public List<Object> queryAuditorDesignatedBusRemarkByResult(String userId, String busType, String checkResult) {
		// 去除之前的操作记录，取出最新的操作记录
		List<Object> ids = new ArrayList<Object>();
		AssetActivitiBus aset = actservice.queryAssetActivitiBus(busType);
		boolean hasActvitiBus = false;
		if (aset == null) {
			//以下累赘为报废带来的情况，过渡
			List<AssetActivitiBus> listAll = actservice.getAssetActivitiBusList();
			for (AssetActivitiBus assetActivitiBus : listAll) {
				if(assetActivitiBus.getBusType().contains(busType)){
					aset = assetActivitiBus;
					hasActvitiBus = true;
				}
			}if(!hasActvitiBus){
				return ids;
			}else{
				String key = aset.getDeploymentKey();
				String type = key.split("\\_")[0];
				busType = "%" + type + "%";
				List<AssetProcessRemark> list = assetProcessRemarkMapper.queryAuditorDesignatedBusRemarkByResult(userId, busType, checkResult);

				List<AssetProcessRemark> copy = OrderByUtil.sort(list, "operateDate desc");
				// List<AssetProcessRemark> copy1 = OrderByUtil.sort(copy,
				// "procInstId desc");
				List<String> recordBusId = new ArrayList<String>();
				// List<String> recordPId = new ArrayList<String>();
				for (AssetProcessRemark remark : copy) {
					if (!recordBusId.contains(remark.getBusId())) {
						// if (!recordBusId.contains(remark.getBusId())) {
						// recordBusId.add(remark.getBusId());
						recordBusId.add(remark.getBusId());
						ids.add(remark.getBusId());
						// }
					}
				}
				if (ids.size() > 0) {
					return this.getNew(ids, userId, checkResult);
				}
				return ids;
			}
		} else {
			String key = aset.getDeploymentKey();
			String type = key.split("\\_")[0];
			busType = "%" + type + "%";
			List<AssetProcessRemark> list = assetProcessRemarkMapper.queryAuditorDesignatedBusRemarkByResult(userId, busType, checkResult);

			List<AssetProcessRemark> copy = OrderByUtil.sort(list, "operateDate desc");
			// List<AssetProcessRemark> copy1 = OrderByUtil.sort(copy,
			// "procInstId desc");
			List<String> recordBusId = new ArrayList<String>();
			// List<String> recordPId = new ArrayList<String>();
			for (AssetProcessRemark remark : copy) {
				if (!recordBusId.contains(remark.getBusId())) {
					// if (!recordBusId.contains(remark.getBusId())) {
					// recordBusId.add(remark.getBusId());
					recordBusId.add(remark.getBusId());
					ids.add(remark.getBusId());
					// }
				}
			}
			if (ids.size() > 0) {
				return this.getNew(ids, userId, checkResult);
			}
			return ids;
		}
	}

	public List<Object> getNew(List<Object> ids, String userId, String checkResult) {
		List<Object> idsResult = new ArrayList<Object>();
		for (int i = 0, len = ids.size(); i < len; i++) {
			String busId = StringUtilsExt.convertNullToString(ids.get(i));
			List<AssetProcessRemark> remarks = assetProcessRemarkMapper.queryHisByUserIdBusId(userId, busId);
			if (remarks != null && remarks.size() > 0) {
				if (checkResult.equals(remarks.get(0).getCheckResult().toString())) {
					idsResult.add(remarks.get(0).getBusId().toString());
				}
			}
		}
		return idsResult;
	}

	// 审核流程制造
	public List<AssetProcessRemark> queryBusinessHistory(String businessId, String pId) {
		
		return assetProcessRemarkMapper.queryBusinessHistory(businessId, pId);
	}

	/**
	 *
	 * @param 取出特定用户特定类型的指定操作
	 * @param result
	 *            用户的处理方式
	 * @retrun
	 */
	public Page<AssetProcessRemark> queryAssetProcessRemarkDesigatedBusCheckPage(Page<AssetProcessRemark> page, String userId, String busType) {

		// return
		// assetProcessRemarkMapper.queryAssetProcessRemarkDesigatedBusCheckPage(page,
		// userId, busType);
		//
		// return
		// assetProcessRemarkMapper.queryAssetProcessRemarkDesigatedPage(page,
		// businessId)
		return null;
	}

	public Page<AssetProcessRemark> queryAssetProcessRemarkByActiviti(Searcher searcher, Page<AssetProcessRemark> page, List<Long> params) {

		return assetProcessRemarkMapper.queryAssetProcessRemarkByActiviti(searcher, page, params);
	}

	// 获取指定业务的所有操作记录
	public Page<AssetProcessRemark> queryAssetProcessRemarkByBusinessIdPage(Page<AssetProcessRemark> page, String businessId) {
		return assetProcessRemarkMapper.queryAssetProcessRemarkDesigatedPage(page, businessId);
	}

	public List<AssetProcessRemark> queryHisByUserIdPidBusId(String userId, String pId, String busId) {
		return assetProcessRemarkMapper.queryHisByUserIdPidBusId(userId, pId, busId);
	}
	public List<AssetProcessRemark> queryHistoryByPId(String pId) {
		return assetProcessRemarkMapper.queryHistoryByPId(pId);
	}
	
	public int updatePIdByBusId(String busId, String pId, String busType) {
		return assetProcessRemarkMapper.updatePIdByBusId(busId, pId, busType);
	}
	
	public int updatePIdByBusIdAndBusType(String busId, String pId, String busType) {
		return assetProcessRemarkMapper.updatePIdByBusIdAndBusType(busId, pId, busType);
	}
	public int updateBusTypeByBusIdAndPid(String busId, String pId,String busType) {
		return assetProcessRemarkMapper.updateBusTypeByBusIdAndPid(busId, pId, busType);
	}
	public int deleteByBusIdAndPId(String busId,String pId){
		return assetProcessRemarkMapper.deleteByBusIdAndPId(busId,pId);
	}
	
	public List<AssetProcessRemark> queryListByBusId(String busId){
		return assetProcessRemarkMapper.queryListByBusId(busId);
	}

	public List<AssetProcessRemark> queryHisByUserIdPidBusIdByCheck(String userId, String pId, Integer checkResult){
		AssetProcessRemark remark = new AssetProcessRemark();
		remark.setOperatorId(userId);
		remark.setId(null);
		remark.setProcInstId(pId);
		remark.setCheckResult(checkResult);
		
		return assetProcessRemarkMapper.select(remark);
	}
	
	public void deleteRemarkByBusIdDeploymentTemp(String busId,String deploymentKey,Integer status) {
		assetProcessRemarkMapper.deleteRemarkByBusIdDeploymentTemp(busId,deploymentKey,status);
	}
	public int deleteRemarkByBusIdTemp(String busId, Integer status) {
		return assetProcessRemarkMapper.deleteRemarkByBusIdTemp(busId ,status);
	}

	public int countTempData(Object busId) {
		String businessId = StringUtilsExt.convertNullToString(busId);
		if(StringUtils.isNullOrBlank(businessId)){
			return 0;
		}
		List<AssetProcessRemark> list = this.queryListByBusId(businessId);
		if (list != null && list.size() > 0) {
			return list.size();
		}
		return 0;
	}
	
	public int updateBusTypeByIdAndStatus(String busId, Integer status, String busType) {
		return assetProcessRemarkMapper.updateBusTypeByIdAndStatus(busId, status, busType);
	}

	public String queryRoleNameByRoleCode(String roleCode) {
		return assetProcessRemarkMapper.queryRoleNameByRoleCode(roleCode);
	}

	public List<AssetProcessRemark> queryListByBusIdNoReturn(String busId) {
		return assetProcessRemarkMapper.queryListByBusIdNoReturn(busId);
	}

	public List<AssetProcessRemark> getAssetProcessRemarkListByCondition(String condition) {
		
		return assetProcessRemarkMapper.getAssetProcessRemarkListByCondition(condition);
	}
}