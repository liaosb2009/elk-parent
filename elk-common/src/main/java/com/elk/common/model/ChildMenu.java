package com.elk.common.model;

import java.io.Serializable;
import java.security.KeyStore.PrivateKeyEntry;
import java.util.List;

public class ChildMenu implements Serializable{
 
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer pid;
	private String name;
	private String url;
	
	private List<ChildMenu> childMenus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<ChildMenu> getChildMenus() {
		return childMenus;
	}

	public void setChildMenus(List<ChildMenu> childMenus) {
		this.childMenus = childMenus;
	}
	
	
	

}
