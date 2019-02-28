package com.elk.common.model;

import java.io.Serializable;
import java.util.List;
/**
 * 接收复选框所选的id
 * @author liao
 *
 */
public class Datas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<TopsecUser> topsecUsers;
	private List<Integer> ids;

	public List<TopsecUser> getTopsecUsers() {
		return topsecUsers;
	}

	public void setTopsecUsers(List<TopsecUser> topsecUsers) {
		this.topsecUsers = topsecUsers;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

}
