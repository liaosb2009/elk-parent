package com.elk.common.model;

import java.io.Serializable;

public class AJAXResult implements Serializable{

	
	private static final long serialVersionUID = 1L;
	public boolean success;
	public Object data;
	public String error;
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
}
