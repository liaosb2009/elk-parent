package com.elk.common.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 权限类
 * 
 * @author liao
 *
 */
public class Permission implements Serializable{

	 
	private static final long serialVersionUID = 1L;
	private Integer id, pid;
	private String name, url;
	private List<Permission> children = new ArrayList<Permission>();
	private boolean open = true;
	private boolean checked = false;
	private String icon;

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

	public List<Permission> getChildren() {
		return children;
	}

	public void setChildren(List<Permission> children) {
		this.children = children;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
