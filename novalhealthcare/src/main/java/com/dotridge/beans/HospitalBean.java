package com.dotridge.beans;

import java.io.Serializable;

public class HospitalBean implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int hospitalId;
	private String hospitalName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private int zipCode;
	private String email;
	private long phone;
	private long fax;
	private String logo;
	private String registrationDocument;
	private String status;
	
	
	
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public long getFax() {
		return fax;
	}
	public void setFax(long fax) {
		this.fax = fax;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getRegistrationDocument() {
		return registrationDocument;
	}
	public void setRegistrationDocument(String registrationDocument) {
		this.registrationDocument = registrationDocument;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	@Override
	public String toString() {
		return "HospitalBean [hospitalId=" + hospitalId + ", hospitalName="
				+ hospitalName + ", address1=" + address1 + ", address2="
				+ address2 + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + ", email=" + email + ", phone="
				+ phone + ", fax=" + fax + ", logo=" + logo
				+ ", registrationDocument=" + registrationDocument
				+ ", status=" + status + "]";
	}
	
	
	
	
	
	
	
}
