package com.elk.common.controller;


import com.elk.common.model.AJAXResult;

/**
 * 保证线程安全
 * @author liao
 *
 */
public class BaseController {

	//private AJAXResult result;
	private ThreadLocal<AJAXResult> result = new ThreadLocal<AJAXResult>();
	
	protected void start() {
		result.set(new AJAXResult());
	}
	
	protected Object end() {
		Object obj = result.get();
		result.remove();
		return obj;
	}
	
	protected void data(Object obj) {
		AJAXResult r = result.get();
		r.setData(obj);
	}
	
	protected void success() {
		AJAXResult r = result.get();
		r.setSuccess(true);
	}
	
	protected void error(String error) {
		AJAXResult r = result.get();
		r.setError(error);
	}
	
	protected void success(boolean flg) {
		AJAXResult r = result.get();
		r.setSuccess(flg);
	}
	
	protected void fail() {
		success(false);
	}
}
