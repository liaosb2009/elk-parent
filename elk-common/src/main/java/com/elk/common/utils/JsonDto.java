package com.elk.common.utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 返回信息类
 */
public class JsonDto implements Serializable{

	private static final long serialVersionUID = -8373560921555774486L;

	private Integer code;

	private String msg;

	private Map<String, Object> dataRest = new HashMap<>();

	public JsonDto() {
		this.code = JsonDtoStatus.OK;
		this.msg = JsonDtoStatus.OK_INFO;
	}

	public JsonDto(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, ?> getData() {
		return dataRest;
	}

	public void clearData() {
		this.dataRest.clear();
	}

	public void setData(Map<String, Object> data) {
		this.dataRest = data;
	}

	public void addData(Map<String, Object> dataMap) {
		for (Map.Entry<String, Object> data : dataMap.entrySet()) {
			this.dataRest.put(data.getKey(), data.getValue());
		}
	}

	public void addData(String key, Object value) {
		this.dataRest.put(key, value);
	}
}
