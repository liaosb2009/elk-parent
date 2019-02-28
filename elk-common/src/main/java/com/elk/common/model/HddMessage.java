package com.elk.common.model;

import java.io.Serializable;

/**
 * 硬盘信息类
 * 
 * @author liao
 *
 */
public class HddMessage implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String userId;
	private String type;
	private String SerialNumber;
	private String manufacturer;
	
	private Integer status;
	
	private String createTime;
	private String updateTime;
	private String endTime;
	private String result;
	
	private String modelFamily;
	private String devicemodel;
	private String hddSerialNumber;
	private String luWwnDeviceId;
	private String firmwareVersion;
	private String userCapacity;
	private String sectorSize;
	private String rotationRate;
	private String ataVersionIs;
	private String sataVersionIs;
	private String localTimeIs;
	private String smartSupportIs;
	private String powerHours;
	private String health;

	
	
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	 
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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
		return SerialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}
 

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
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

	public String getModelFamily() {
		return modelFamily;
	}

	public void setModelFamily(String modelFamily) {
		this.modelFamily = modelFamily;
	}
 
	public String getDevicemodel() {
		return devicemodel;
	}

	public void setDevicemodel(String devicemodel) {
		this.devicemodel = devicemodel;
	}

	public String getHddSerialNumber() {
		return hddSerialNumber;
	}

	public void setHddSerialNumber(String hddSerialNumber) {
		this.hddSerialNumber = hddSerialNumber;
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

	public String getSectorSize() {
		return sectorSize;
	}

	public void setSectorSize(String sectorSize) {
		this.sectorSize = sectorSize;
	}

	public String getRotationRate() {
		return rotationRate;
	}

	public void setRotationRate(String rotationRate) {
		this.rotationRate = rotationRate;
	}

	public String getAtaVersionIs() {
		return ataVersionIs;
	}

	public void setAtaVersionIs(String ataVersionIs) {
		this.ataVersionIs = ataVersionIs;
	}

	public String getSataVersionIs() {
		return sataVersionIs;
	}

	public void setSataVersionIs(String sataVersionIs) {
		this.sataVersionIs = sataVersionIs;
	}

	public String getLocalTimeIs() {
		return localTimeIs;
	}

	public void setLocalTimeIs(String localTimeIs) {
		this.localTimeIs = localTimeIs;
	}

	public String getSmartSupportIs() {
		return smartSupportIs;
	}

	public void setSmartSupportIs(String smartSupportIs) {
		this.smartSupportIs = smartSupportIs;
	}

	public String getPowerHours() {
		return powerHours;
	}

	public void setPowerHours(String powerHours) {
		this.powerHours = powerHours;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

}
