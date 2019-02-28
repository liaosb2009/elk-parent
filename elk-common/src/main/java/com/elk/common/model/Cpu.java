package com.elk.common.model;

import java.io.Serializable;

/**
 * 检测cpu的类
 * 
 * @author liao
 *
 */
public class Cpu implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;// 自增id
	private String userId;
	private String manufacturer;// 生产厂商
	private String serialNumber;// 主板序列号,唯一约束
	private Integer status;// 测试状态0,1

	private String family;// 系列号
	private String cpuManufacturer;// cpu生产厂商
	private String cpuId;
	private String signature;//cpu信号
	private String cpuVersion;
	private String externalClock;//外频
	private String cpuMaxSpeed;// 最大转速
	private String currentSpeed;// 目前转速
	private String coreCount;// 核心数
	private String coreEnabled;// 是否开启
	private String cpuStatus;// cpu状态
	private String threadCount;// 线程数

	private String psn, userid;// 序列号，用户id
	private String createTime, updateTime, endTime;// 创建时间，更新时间，结束时间
	private String testResult;// 测试结果
	private String type;
	
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	 

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getCpuManufacturer() {
		return cpuManufacturer;
	}

	public void setCpuManufacturer(String cpuManufacturer) {
		this.cpuManufacturer = cpuManufacturer;
	}

	public String getCpuId() {
		return cpuId;
	}

	public void setCpuId(String cpuId) {
		this.cpuId = cpuId;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getCpuVersion() {
		return cpuVersion;
	}

	public void setCpuVersion(String cpuVersion) {
		this.cpuVersion = cpuVersion;
	}

	public String getExternalClock() {
		return externalClock;
	}

	public void setExternalClock(String externalClock) {
		this.externalClock = externalClock;
	}

	public String getCpuMaxSpeed() {
		return cpuMaxSpeed;
	}

	public void setCpuMaxSpeed(String cpuMaxSpeed) {
		this.cpuMaxSpeed = cpuMaxSpeed;
	}

	public String getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(String currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public String getCoreCount() {
		return coreCount;
	}

	public void setCoreCount(String coreCount) {
		this.coreCount = coreCount;
	}

	public String getCoreEnabled() {
		return coreEnabled;
	}

	public void setCoreEnabled(String coreEnabled) {
		this.coreEnabled = coreEnabled;
	}

	public String getCpuStatus() {
		return cpuStatus;
	}

	public void setCpuStatus(String cpuStatus) {
		this.cpuStatus = cpuStatus;
	}

	public String getThreadCount() {
		return threadCount;
	}

	public void setThreadCount(String threadCount) {
		this.threadCount = threadCount;
	}

	public String getPsn() {
		return psn;
	}

	public void setPsn(String psn) {
		this.psn = psn;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

 

}
