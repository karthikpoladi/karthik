package com.dotridge.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotridge.beans.AdminBean;
import com.dotridge.dao.AdminDao;
import com.dotridge.dao.HospitalDao;
import com.dotridge.domain.Admin;
import com.dotridge.domain.Hospital;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;
	@Autowired
	private HospitalDao hospitalDao;

	public Admin mapBeanToDomain(AdminBean adminBean) {
		Date date = new Date();

		Admin admin = new Admin();
		admin.setHospital(hospitalDao.getHospitalByUniqueName(adminBean.getHospitalName()));
		admin.setAdminId(adminBean.getAdminId());
		admin.setFirstName(adminBean.getFirstName());
		admin.setMiddleName(adminBean.getMiddleName());
		admin.setLastName(adminBean.getLastName());
		admin.setEmail(adminBean.getEmail());
		admin.setPassword(adminBean.getPassword());
		admin.setPhone(adminBean.getPhone());
		admin.setProfileDocuments(adminBean.getProfileDocuments());
		admin.setStatus(adminBean.isStatus());
		admin.setCreatedBy("");
		admin.setCreatedDate(date);
		admin.setModifiedBy("");
		admin.setModifiedDate(date);

		return admin;
	}

	public AdminBean mapDomainToBean(Admin admin) {
		AdminBean adminBean = new AdminBean();
		adminBean.setHospitalName(admin.getHospital().getHospitalName());
		adminBean.setAdminId(admin.getAdminId());
		adminBean.setFirstName(admin.getFirstName());
		adminBean.setMiddleName(admin.getMiddleName());
		adminBean.setLastName(admin.getLastName());
		adminBean.setEmail(admin.getEmail());
		adminBean.setPassword(admin.getPassword());
		adminBean.setPhone(admin.getPhone());
		adminBean.setProfileDocuments(admin.getProfileDocuments());
		adminBean.setStatus(admin.isStatus());
		return adminBean;
	}

	@Override
	public AdminBean createAdmin(AdminBean adminBean) {
		System.out.println("service reached");
		// TODO Auto-generated method stub
		Admin adminDomain = mapBeanToDomain(adminBean);
		System.out.println(adminDomain.getAdminId());
		adminBean = mapDomainToBean(adminDao.createAdmin(adminDomain));
		return adminBean;
	}

	@Override
	public AdminBean updateAdmin(AdminBean adminBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminBean getAdminById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminBean> getAdminByName(String adminName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminBean> getAdminByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminBean> getAdminByAddress1(String address1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminBean> getAdminByPhone(long phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminBean> getAdminByStatus(Boolean status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminBean> getAllAdmins()

	{
		List<Admin> allAdmins = adminDao.getAllAdmins();
		List<AdminBean> adminBeans = null;
		if (allAdmins != null && !allAdmins.isEmpty()) 
		{
			adminBeans = new ArrayList<AdminBean>();
			for (Admin admin : allAdmins) 
			{
				adminBeans.add(mapDomainToBean(admin));
			}
		}

		return adminBeans;

	}

	@Override
	public boolean deleteAdmin(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<AdminBean> getAllAdminsByPagining(int currentPage,
			int numberOfRecords) {
		// TODO Auto-generated method stub
		return null;
	}

}
