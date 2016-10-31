package com.zrun.common;


public class Result{
	/**
	 * 程序执行是否成功
	 */
	private boolean success=true;
	
	/**
	 * 程序执行结果的提示信息，一般情况下程序执行成功不需要
	 */
	private String message;
	
	/**
	 * 用来封装业务数据
	 */
	private Object data; 
	
	/**
	 * 使用默认构造器创建Result，
	 * success=true；
	 * message=null；
	 * data=null； 
	 */
	public Result(){
		
	}
	
	/**
	 * 使用次构造其创建Result，
	 * success=true；
	 * message=null；
	 * data=传入的参数
	 * ；
	 * @param data
	 */
	public Result(Object data){
		this.data=data;
	}

	public Result(boolean success, String message, Object data) {
		super();
		this.success = success;
		this.message = message;
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
