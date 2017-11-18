package com.dotridge.dao;

import java.util.List;

import com.dotridge.domain.Hospital;

public interface HospitalDao 
{
	public Hospital createHospital(Hospital hospital);
	
	public Hospital updateHospital(Hospital hospital);
	
	public Hospital getHospitalById(int id);
	
	public List<Hospital> getHospitalByName(String hospitalName);
	
	public List<Hospital> getAllHospitals();
	
	public boolean deleteHospital(int id);
	
	public List<Hospital> getAllHospitalsByPagining(int currentPage, int numberOfRecords);

	public List<Hospital> getHospitalByEmail(String email);
	
	public Hospital getHospitalByUniqueName(String Name);
}
