package com.dotridge.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotridge.beans.HospitalBean;
import com.dotridge.dao.HospitalDao;
import com.dotridge.domain.Hospital;

@Service
public class HospitalServiceImpl implements HospitalService 
{
	@Autowired
	private HospitalDao hospitalDao;
	public Hospital mapBeanToDomain(HospitalBean hospitalBean) 
	{
		Date date = new Date();
		
		Hospital hospital = new Hospital();
		hospital.setHospitalId(hospitalBean.getHospitalId());
		hospital.setHospitalName(hospitalBean.getHospitalName());
		hospital.setAddress1(hospitalBean.getAddress1());
		hospital.setAddress2(hospitalBean.getAddress2());
		hospital.setCity(hospitalBean.getCity());
		hospital.setState(hospitalBean.getState());
		hospital.setZipCode(hospitalBean.getZipCode());
		hospital.setEmail(hospitalBean.getEmail());
		hospital.setPhone(hospitalBean.getPhone());
		hospital.setFax(hospitalBean.getFax());
		hospital.setLogo(hospitalBean.getLogo());
		hospital.setRegistrationDocument(hospitalBean.getRegistrationDocument());
		hospital.setStatus(hospitalBean.getStatus());
		hospital.setCreatedBy("Karthik");
		hospital.setCreatedDate(date);
		hospital.setModifiedBy("Karthik");
		hospital.setModifiedDate(date);
		return hospital;
	}

	public HospitalBean mapDomainToBean(Hospital hospitalDomain) 
	{
		HospitalBean hospitalBean = new HospitalBean();
		hospitalBean.setHospitalId((hospitalDomain.getHospitalId()));
		hospitalBean.setHospitalName(hospitalDomain.getHospitalName());
		hospitalBean.setAddress1(hospitalDomain.getAddress1());
		hospitalBean.setAddress2(hospitalDomain.getAddress2());
		hospitalBean.setCity(hospitalDomain.getCity());
		hospitalBean.setState(hospitalDomain.getState());
		hospitalBean.setZipCode(hospitalDomain.getZipCode());
		hospitalBean.setEmail(hospitalDomain.getEmail());
		hospitalBean.setPhone(hospitalDomain.getPhone());
		hospitalBean.setFax(hospitalDomain.getFax());
		hospitalBean.setLogo(hospitalDomain.getLogo());
		hospitalBean.setRegistrationDocument(hospitalDomain.getRegistrationDocument());
		hospitalBean.setStatus(hospitalDomain.getStatus());
		return hospitalBean;
	}

	public HospitalBean createHospital(HospitalBean hospitalBean) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public HospitalBean updateHospital(HospitalBean hospBean) 
	{
		Hospital hosp=mapBeanToDomain(hospBean);
		hosp = hospitalDao.updateHospital(hosp);
		hospBean=mapDomainToBean(hosp);
		return hospBean;
		
		
	}

	public HospitalBean getHospitalById(int id) 
	{
		HospitalBean hospitalBean = mapDomainToBean(hospitalDao.getHospitalById(id));
		return hospitalBean;
	}

	public List<HospitalBean> getHospitalByName(String hospitalName) 
	{
		List<Hospital> hospitalByName = hospitalDao.getHospitalByName(hospitalName);
		List<HospitalBean> hospListByName=null;
		if(hospitalByName!=null && !hospitalByName.isEmpty()){
		hospListByName=new ArrayList<HospitalBean>();
		for(Hospital hospital:hospitalByName){
			HospitalBean hospBean=mapDomainToBean(hospital);
			hospListByName.add(hospBean);
			
		}
		}
		return hospListByName;
	}

	private Hospital mapBeanToDomain(String hospitalName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<HospitalBean> getAllHospitals() 
	{
		List<Hospital> hospitalList= hospitalDao.getAllHospitals();
		List<HospitalBean> uiHospitalList = null;
		if(hospitalList != null && !hospitalList.isEmpty())
		{
			uiHospitalList = new ArrayList<HospitalBean>();
			for(Hospital hospitalDomain : hospitalList)
			{
				HospitalBean hospitalBean = mapDomainToBean(hospitalDomain);
				uiHospitalList.add(hospitalBean);
			}
			return uiHospitalList;
		}
		else
			throw new RuntimeException("No Hospital Available");
	}

	public boolean deleteHospital(int id) 
	{
		// TODO Auto-generated method stub
		return hospitalDao.deleteHospital(id);
		
	}

	public List<HospitalBean> getAllHospitalsByPagining(int currentPage, int numberOfRecords) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HospitalBean addHospital(HospitalBean hospitalBean) {
		// TODO Auto-generated method stub
		
		Hospital hosp=mapBeanToDomain(hospitalBean);
		hosp = hospitalDao.createHospital(hosp);
		hospitalBean=mapDomainToBean(hosp);
		return hospitalBean;
	}

	@Override
	public List<HospitalBean> getHospitalByEmail(String email) {
		List<Hospital> hospitalByEmail = hospitalDao.getHospitalByEmail(email);
		List<HospitalBean> hospListByEmail=null;
		if(hospitalByEmail!=null && !hospitalByEmail.isEmpty()){
		hospListByEmail=new ArrayList<HospitalBean>();
		for(Hospital hospital:hospitalByEmail){
			HospitalBean hospBean=mapDomainToBean(hospital);
			hospListByEmail.add(hospBean);
			
		}
		}
		return hospListByEmail;
	}

	@Override
	public List<HospitalBean> getHospitalByAddress1(String searchValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HospitalBean> getHospitalByPhone(long parseLong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HospitalBean> getHospitalByStatus(Boolean valueOf) {
		// TODO Auto-generated method stub
		return null;
	}

}
