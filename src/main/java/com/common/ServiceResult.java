package com.common;

import java.io.Serializable;


/**
 * 对Service层返回结果的封装
 *
 *
 */
public class ServiceResult<T> implements Serializable{
	
	private static final long serialVersionUID = 232345343322341L;

	/** 返回的数据对象 */
	private T data;
 
	/** 是否调用成功  */
	private Boolean success = true;
	
	/** 信息  */
	private String  msg;
	
	/** 编码  */
	private String  code;
	
	public ServiceResult() {
	}
	
	public ServiceResult(T data) {
		this.data = data;
	}
	
	
	public ServiceResult(Boolean success, String msg) {
		this.success = success;
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
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
}
