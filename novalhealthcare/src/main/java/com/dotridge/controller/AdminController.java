package com.dotridge.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dotridge.beans.AdminBean;
import com.dotridge.beans.HospitalBean;
import com.dotridge.service.AdminService;
import com.dotridge.service.HospitalService;
import com.dotridge.util.ServiceConstants;

@Controller
@RequestMapping("/adminMgmt")
public class AdminController {
	@Autowired
	private AdminService adminService;
	@Autowired
	private HospitalService hospitalService;
	
	@RequestMapping(value="/getAllAdmins")
	public String viewAllAdmins(Model model)
	{
		try
		{
			List<AdminBean> adminBeansList = adminService.getAllAdmins();
			System.out.println(adminBeansList.size());
			int uiListSize = adminBeansList.size();
			int recordsPerPage = Math.round((uiListSize / ServiceConstants.NUMBER_OF_RECORDS_PER_PAGE) + 1);
			List<Integer> pageBarList = new ArrayList<Integer>();
			for(int i = 0; i < recordsPerPage; i++)
			{
				pageBarList.add(i + 1);
			}
			System.out.println("recordsPerPage : " + recordsPerPage);
			System.out.println("pageBarList : " + pageBarList.size());
			model.addAttribute("pageBarList",pageBarList);
			model.addAttribute("uiAdminsList",adminBeansList);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "getUsersBoard";
	}
	

	
	@RequestMapping("/getAdminRegPage")
	public String getAdminRegPage(Model model)
	{
	List<HospitalBean> hList=hospitalService.getAllHospitals();
	
	Set<String> hospitalNameList=new HashSet<String>();
	for(HospitalBean hBeans:hList)
	{
		hospitalNameList.add(hBeans.getHospitalName());
	}
	
	
	model.addAttribute("hospitalNameList", hospitalNameList);
	
	AdminBean adminBean=new AdminBean();
	model.addAttribute("adminBean", adminBean);
	return "addAdminFormDef";
}
	@RequestMapping("/addAdmin")
	public String addAdmin(@ModelAttribute("adminBean") AdminBean adminBean,Model model){
		adminBean=adminService.createAdmin(adminBean);
		if(adminBean.getAdminId()>0)
			System.out.println(adminBean.getAdminId());
		{
			List<AdminBean> adminBeansList = adminService.getAllAdmins();
			model.addAttribute("uiAdminsList", adminBeansList);

		}
		return "getUsersBoard";

	}
	
}
