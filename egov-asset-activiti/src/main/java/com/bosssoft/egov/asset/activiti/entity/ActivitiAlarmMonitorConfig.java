/**
 * 福建博思软件 1997-2017 版权所有
 * Auto generated by Bosssoft Studio version 1.0 beta
 * Tue Jun 20 09:50:10 CST 2017
 */
package com.bosssoft.egov.asset.activiti.entity;
import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 对象.
 * 
 * <pre>
 * 修改记录：
 * 修改日期　　　修改人　　　修改原因
 * 2017-06-20   jinbiao　　　新建
 * </pre>
 */
 @Table(name = "ACTIVITI_ALARM_MONITOR_CONFIG")
public class ActivitiAlarmMonitorConfig implements java.io.Serializable {

	private static final long serialVersionUID = 170620095019798L;
	
	// Fields
	
	/**
	 * id.
	 */
    @Column(name = "ID")
	private Long id;
	/**
	 * 解释说明.
	 */
    @Column(name = "NAME")
	private String name;
	/**
	 * 业务类型.
	 */
    @Column(name = "BUS_TYPE")
	private String busType;
	/**
	 * 监控区域.
	 */
    @Column(name = "ALARM_ZONE")
	private String alarmZone;
	/**
	 * 预警天数.
	 */
    @Column(name = "ALARM_DAY")
	private Long alarmDay;
	/**
	 * 逾期天数.
	 */
    @Column(name = "EXPIRED_DAY")
	private Long expiredDay;
	/**
	 * sql语句.
	 */
    @Column(name = "vSQL")
	private String sql;
    /**
     * sql语句.
     */
    @Column(name = "biz_code")
    private String bizCode;
	
	// Constructors
 
    /** default constructor */
	public ActivitiAlarmMonitorConfig() {
	}

	/**
	 * id.
	 * @return
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * id.
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 解释说明.
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 解释说明.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 业务类型.
	 * @return
	 */
	public String getBusType() {
		return this.busType;
	}

	/**
	 * 业务类型.
	 * @param busType
	 */
	public void setBusType(String busType) {
		this.busType = busType;
	}

	/**
	 * 监控区域.
	 * @return
	 */
	public String getAlarmZone() {
		return this.alarmZone;
	}

	/**
	 * 监控区域.
	 * @param alarmZone
	 */
	public void setAlarmZone(String alarmZone) {
		this.alarmZone = alarmZone;
	}

	/**
	 * 预警天数.
	 * @return
	 */
	public Long getAlarmDay() {
		return this.alarmDay;
	}

	/**
	 * 预警天数.
	 * @param alarmDay
	 */
	public void setAlarmDay(Long alarmDay) {
		this.alarmDay = alarmDay;
	}

	/**
	 * 逾期天数.
	 * @return
	 */
	public Long getExpiredDay() {
		return this.expiredDay;
	}

	/**
	 * 逾期天数.
	 * @param expiredDay
	 */
	public void setExpiredDay(Long expiredDay) {
		this.expiredDay = expiredDay;
	}

	/**
	 * sql语句.
	 * @return
	 */
	public String getSql() {
		return this.sql;
	}

	/**
	 * sql语句.
	 * @param sql
	 */
	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

}