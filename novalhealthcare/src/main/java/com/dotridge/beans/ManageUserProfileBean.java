package com.dotridge.beans;

import java.io.Serializable;

public class ManageUserProfileBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 821589529383540007L;
	
	private String firstName;
	private String lastName;
	@Override
	public String toString() {
		return "ManageUserProfileBean [firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", password=" + password
				+ ", mobile=" + mobile + ", userId=" + userId + "]";
	}
	private String email;
	private String password;
	private String mobile;
	private String userId;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
