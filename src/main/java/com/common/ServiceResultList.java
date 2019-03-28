package com.common;

import java.io.Serializable;
import java.util.List;

/**
 *
 *  提供分页的对象的数据封装
 * */
public class ServiceResultList<T> implements Serializable{
	 
	private static final long serialVersionUID = 23423423423423L;

	private long totalCount;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	private List<T> data;

	/** 是否调用成功  */
	private Boolean success = true;
	
	/** 信息  */
	private String  msg;
	
	/** 编码  */
	private String  code;
	
	/** 当前页面 */
	private int pageNo;
	
	/** 页面大小  */
	private int pageSize=10;
	
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public ServiceResultList(){}
	
	public ServiceResultList(List<T> data){
		this.data = data;
	}
	
	public ServiceResultList(Boolean success, String msg) {
		this.success = success;
		this.msg = msg;
	}
	
	public ServiceResultList(List<T> data, long totalCount){
		this.data = data;
		this.totalCount = totalCount;
	}
	
	public ServiceResultList(List<T> data, long totalCount, PageInfo pageInfo){
		this.data = data;
		this.totalCount = totalCount;
		this.pageNo = pageInfo.getPageNo();
		this.pageSize = pageInfo.getPageSize();
	}
	public void SUCCESS (List<T> data, long totalCount, int pageSize){
		this.data = data;
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.setSuccess(true);
	}
	public void ERROR(String msg){
		this.setSuccess(false);
		this.setMsg(msg);
	}
	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
 
	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public long getTotalPageCount(){
		return (totalCount + pageSize - 1) / pageSize;
	}
}
