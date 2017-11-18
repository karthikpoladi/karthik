package com.dotridge.dao;

import java.util.List;

import com.dotridge.domain.Admin;

public interface AdminDao {

public Admin createAdmin(Admin adminDomain);
	
	public Admin updateAdmin(int id);
	
	public Admin getAdminById(int id);
	
	public List<Admin> getAdminByName(String firstName);
	
	public List<Admin> getAllAdmins();
	
	public boolean deleteAdmin(int id);
	
	public List<Admin> getAllAdminsByPagining(int currentPage, int numberOfRecords);

}
