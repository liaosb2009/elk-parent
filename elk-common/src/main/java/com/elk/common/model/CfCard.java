package com.elk.common.model;

import java.io.Serializable;

public class CfCard implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String userId;
	private String type;
	private String testResult;
	private String serialNumber;// 连接标志
	private String manufacturer;// 主板生产厂商
	private Integer status;// 判断状态

	private String createTime;
	private String updateTime;
	private String endTime;

	private String devicemodel;
	private String luWwnDeviceId;
	private String firmwareVersion;
	private String userCapacity;
	private String localTimeIs;
	private String sectorSize;
	private String aTAVersion;
	private String cfCardSerialNumber;
	private String smartSupportIs;

	 

	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
 
 

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public String getDevicemodel() {
		return devicemodel;
	}

	public void setDevicemodel(String devicemodel) {
		this.devicemodel = devicemodel;
	}

	public String getLuWwnDeviceId() {
		return luWwnDeviceId;
	}

	public void setLuWwnDeviceId(String luWwnDeviceId) {
		this.luWwnDeviceId = luWwnDeviceId;
	}

	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	public String getUserCapacity() {
		return userCapacity;
	}

	public void setUserCapacity(String userCapacity) {
		this.userCapacity = userCapacity;
	}

	public String getLocalTimeIs() {
		return localTimeIs;
	}

	public void setLocalTimeIs(String localTimeIs) {
		this.localTimeIs = localTimeIs;
	}

	public String getSectorSize() {
		return sectorSize;
	}

	public void setSectorSize(String sectorSize) {
		this.sectorSize = sectorSize;
	}

	public String getaTAVersion() {
		return aTAVersion;
	}

	public void setaTAVersion(String aTAVersion) {
		this.aTAVersion = aTAVersion;
	}

	public String getCfCardSerialNumber() {
		return cfCardSerialNumber;
	}

	public void setCfCardSerialNumber(String cfCardSerialNumber) {
		this.cfCardSerialNumber = cfCardSerialNumber;
	}

	public String getSmartSupportIs() {
		return smartSupportIs;
	}

	public void setSmartSupportIs(String smartSupportIs) {
		this.smartSupportIs = smartSupportIs;
	}

}
