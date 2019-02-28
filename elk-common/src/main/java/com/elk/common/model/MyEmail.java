package com.elk.common.model;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;

/**
 * 邮件处理类
 * @author liao
 *
 */

public class MyEmail implements Serializable{
	
	 
	private static final long serialVersionUID = 1L;
	@Value("$spring.mail.host")
	private String host;
	@Value("$spring.mail.username")
	private String name;
	@Value("$spring.mail.password")
	private String password;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	

}
