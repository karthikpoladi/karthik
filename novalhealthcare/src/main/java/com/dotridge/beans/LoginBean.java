package com.dotridge.beans;

import java.io.Serializable;

public class LoginBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3474374178412947681L;
	
	private String userId;
	@Override
	public String toString() {
		return "LoginBean [userId=" + userId + ", password=" + password + "]";
	}
	private String password;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
