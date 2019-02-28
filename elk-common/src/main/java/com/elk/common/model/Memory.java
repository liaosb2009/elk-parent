package com.elk.common.model;

import java.io.Serializable;

/**
 * 内存类
 * 
 * @author liao
 *
 */
public class Memory implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String type;
	// 标志符
	private String userid;
	private String serialNumber;
	private String manufacturer;
	// 读取的信息
	private String totalWidth;
	private String dataWidth;
	private String memorySize;
	private String memoryFormFactor;
	private String locator;
	private String bankLocator;
	private String memoryType;
	private String memorySpeed;
	private String memoryManufacturer;
	private String memorySerialNumber;
	private String memoryAssetTag;
	private String memoryPartNumber;
	private Integer status;// 状态0未完成，1完成,2,3,4将有redis来存入
	private String result;
	// 创建的信息
	private String createTime;
	private String endTime;
	private String updateTime;
	
	
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
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

	public String getTotalWidth() {
		return totalWidth;
	}

	public void setTotalWidth(String totalWidth) {
		this.totalWidth = totalWidth;
	}

	public String getDataWidth() {
		return dataWidth;
	}

	public void setDataWidth(String dataWidth) {
		this.dataWidth = dataWidth;
	}

	public String getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(String memorySize) {
		this.memorySize = memorySize;
	}

	public String getMemoryFormFactor() {
		return memoryFormFactor;
	}

	public void setMemoryFormFactor(String memoryFormFactor) {
		this.memoryFormFactor = memoryFormFactor;
	}

	public String getLocator() {
		return locator;
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}

	public String getBankLocator() {
		return bankLocator;
	}

	public void setBankLocator(String bankLocator) {
		this.bankLocator = bankLocator;
	}

	public String getMemoryType() {
		return memoryType;
	}

	public void setMemoryType(String memoryType) {
		this.memoryType = memoryType;
	}

	public String getMemorySpeed() {
		return memorySpeed;
	}

	public void setMemorySpeed(String memorySpeed) {
		this.memorySpeed = memorySpeed;
	}

	public String getMemoryManufacturer() {
		return memoryManufacturer;
	}

	public void setMemoryManufacturer(String memoryManufacturer) {
		this.memoryManufacturer = memoryManufacturer;
	}

	public String getMemorySerialNumber() {
		return memorySerialNumber;
	}

	public void setMemorySerialNumber(String memorySerialNumber) {
		this.memorySerialNumber = memorySerialNumber;
	}

	public String getMemoryAssetTag() {
		return memoryAssetTag;
	}

	public void setMemoryAssetTag(String memoryAssetTag) {
		this.memoryAssetTag = memoryAssetTag;
	}

	public String getMemoryPartNumber() {
		return memoryPartNumber;
	}

	public void setMemoryPartNumber(String memoryPartNumber) {
		this.memoryPartNumber = memoryPartNumber;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

 

}
