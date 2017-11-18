package com.dotridge.beans;

import java.io.Serializable;

import com.dotridge.domain.Hospital;

public class AdminBean implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	 
	 private String hospitalName;
	 private int adminId;
	 private String firstName;
	 private String middleName;
	 private String lastName;
	 private long phone;
	 private String email;
	 private String password;
	 private String profileDocuments;
	 private boolean status;
	 
	 public String getHospitalName() {
	  return hospitalName;
	 }
	 public void setHospitalName(String hospitalName) {
	  this.hospitalName = hospitalName;
	 }
	 public int getAdminId() {
	  return adminId;
	 }
	 public void setAdminId(int adminId) {
	  this.adminId = adminId;
	 }
	 public String getFirstName() {
	  return firstName;
	 }
	 public void setFirstName(String firstName) {
	  this.firstName = firstName;
	 }
	 public String getMiddleName() {
	  return middleName;
	 }
	 public void setMiddleName(String middleName) {
	  this.middleName = middleName;
	 }
	 public String getLastName() {
	  return lastName;
	 }
	 public void setLastName(String lastName) {
	  this.lastName = lastName;
	 }
	 public long getPhone() {
	  return phone;
	 }
	 public void setPhone(long phone) {
	  this.phone = phone;
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
	 public String getProfileDocuments() {
	  return profileDocuments;
	 }
	 public void setProfileDocuments(String profileDocuments) {
	  this.profileDocuments = profileDocuments;
	 }
	 public boolean isStatus() {
	  return status;
	 }
	 public void setStatus(boolean status) {
	  this.status = status;
	 }
	 @Override
	 public String toString() {
	  return "AdminBean [hospitalName=" + hospitalName + ", adminId=" + adminId + ", firstName=" + firstName
	    + ", middleName=" + middleName + ", lastName=" + lastName + ", phone=" + phone + ", email=" + email
	    + ", password=" + password + ", profileDocuments=" + profileDocuments + ", status=" + status + "]";
	 }
	 @Override
	 public int hashCode() {
	  final int prime = 31;
	  int result = 1;
	  result = prime * result + adminId;
	  result = prime * result + ((email == null) ? 0 : email.hashCode());
	  result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	  result = prime * result + ((hospitalName == null) ? 0 : hospitalName.hashCode());
	  result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
	  result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
	  result = prime * result + ((password == null) ? 0 : password.hashCode());
	  result = prime * result + (int) (phone ^ (phone >>> 32));
	  result = prime * result + ((profileDocuments == null) ? 0 : profileDocuments.hashCode());
	  result = prime * result + (status ? 1231 : 1237);
	  return result;
	 }
	 @Override
	 public boolean equals(Object obj) {
	  if (this == obj)
	   return true;
	  if (obj == null)
	   return false;
	  if (getClass() != obj.getClass())
	   return false;
	  AdminBean other = (AdminBean) obj;
	  if (adminId != other.adminId)
	   return false;
	  if (email == null) {
	   if (other.email != null)
	    return false;
	  } else if (!email.equals(other.email))
	   return false;
	  if (firstName == null) {
	   if (other.firstName != null)
	    return false;
	  } else if (!firstName.equals(other.firstName))
	   return false;
	  if (hospitalName == null) {
	   if (other.hospitalName != null)
	    return false;
	  } else if (!hospitalName.equals(other.hospitalName))
	   return false;
	  if (lastName == null) {
	   if (other.lastName != null)
	    return false;
	  } else if (!lastName.equals(other.lastName))
	   return false;
	  if (middleName == null) {
	   if (other.middleName != null)
	    return false;
	  } else if (!middleName.equals(other.middleName))
	   return false;
	  if (password == null) {
	   if (other.password != null)
	    return false;
	  } else if (!password.equals(other.password))
	   return false;
	  if (phone != other.phone)
	   return false;
	  if (profileDocuments == null) {
	   if (other.profileDocuments != null)
	    return false;
	  } else if (!profileDocuments.equals(other.profileDocuments))
	   return false;
	  if (status != other.status)
	   return false;
	  return true;
	}
	
	
}
