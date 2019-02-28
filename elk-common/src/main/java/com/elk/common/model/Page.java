package com.elk.common.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 分页所需类
 * 
 * @author liao
 *
 * @param <T>
 */
public class Page<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer pageno;//当前页码
	private Integer totalno;//总页码
	private Integer totalsize;//总条数
	private Integer pagesize;//每页显示
	private List<T> datas=new ArrayList<T>();//数据

	public Integer getPageno() {
		return pageno;
	}

	public void setPageno(Integer pageno) {
		this.pageno = pageno;
	}

	public Integer getTotalno() {
		return totalno;
	}

	public void setTotalno(Integer totalno) {
		this.totalno = totalno;
	}

	public Integer getTotalsize() {
		return totalsize;
	}

	public void setTotalsize(Integer totalsize) {
		this.totalsize = totalsize;
	}

	public Integer getPagesize() {
		return pagesize;
	}

	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

}
