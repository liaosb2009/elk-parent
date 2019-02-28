package com.elk.common.model;

import java.io.Serializable;

/**
 * 主板信息类,bios,Board,Chassis,详情
 * 
 * @author liao
 *
 */
public class DiskInformation implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;// 主键id
	private String type;
	private String userId;
	// BIOS Information
	private String biosVersion;// bios版本号
	private String biosDate;// bios日期

	// Base Board Information
	private String serialNumber;// 主板序列号,唯一约束
	private String manuFacturer;// 主板生产厂商
	private String productName;// 主板原材料型号
	private String boardVersion;// 主板硬件版本号
	private String boardAsset;// 主板生产日期

	// Chassis Information
	private String chassisNumber;// 平台原材料序列号
	private String chassisAsset;// 平台原材料代码
	// 创建时间
	private String createTime;
	private String endTime;
	
	
	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBiosVersion() {
		return biosVersion;
	}

	public void setBiosVersion(String biosVersion) {
		this.biosVersion = biosVersion;
	}

	public String getBiosDate() {
		return biosDate;
	}

	public void setBiosDate(String biosDate) {
		this.biosDate = biosDate;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getManuFacturer() {
		return manuFacturer;
	}

	public void setManuFacturer(String manuFacturer) {
		this.manuFacturer = manuFacturer;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBoardVersion() {
		return boardVersion;
	}

	public void setBoardVersion(String boardVersion) {
		this.boardVersion = boardVersion;
	}

	public String getBoardAsset() {
		return boardAsset;
	}

	public void setBoardAsset(String boardAsset) {
		this.boardAsset = boardAsset;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getChassisAsset() {
		return chassisAsset;
	}

	public void setChassisAsset(String chassisAsset) {
		this.chassisAsset = chassisAsset;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}
