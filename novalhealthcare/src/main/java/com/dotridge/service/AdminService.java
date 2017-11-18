package com.dotridge.service;

import java.util.List;

import com.dotridge.beans.AdminBean;
import com.dotridge.domain.Admin;

public interface AdminService 
{
public Admin mapBeanToDomain(AdminBean adminBean);
	
	public AdminBean mapDomainToBean(Admin adminDomain);
	
	public AdminBean createAdmin(AdminBean adminBean);
	
	public AdminBean updateAdmin(AdminBean adminBean);
	
	public AdminBean getAdminById(int id);
	
	public List<AdminBean> getAdminByName(String adminName);
	
	public List<AdminBean> getAdminByEmail(String email);
	
	public List<AdminBean> getAdminByAddress1(String address1);
	
	public List<AdminBean> getAdminByPhone(long phoneNumber);
	
	public List<AdminBean> getAdminByStatus(Boolean status);
	
	public List<AdminBean> getAllAdmins();
	
	public boolean deleteAdmin(int id);
	
	public List<AdminBean> getAllAdminsByPagining(int currentPage, int numberOfRecords);

	
}
