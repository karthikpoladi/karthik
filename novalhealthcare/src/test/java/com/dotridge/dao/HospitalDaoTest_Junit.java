package com.dotridge.dao;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.dotridge.domain.Hospital;

public class HospitalDaoTest_Junit {
	private HospitalDao hospDao;
	
	@Before
	public void setUp()
	{
	hospDao=new HospitalDaoImpl();
	
	}
	@Test
	public void testGetAllHospitals()
	{
		List<Hospital> allHospitals = hospDao.getAllHospitals();
		Assert.assertNotNull(allHospitals);
		Assert.assertEquals(1,allHospitals.size() );
	}
	@Ignore
	/*@Test
	public void addHospitals() throws CloneNotSupportedException
	
	{
		Hospital hospital = new Hospital();
		hospital.setHospitalId(2);
		hospital.setHospitalName("image");
		hospital.setAddress1("hyd");
		hospital.setAddress2("hyd2");
		hospital.setCity("hyd3");
		hospital.setEmail("image@email.com");
		
		hospital.setCreatedBy("karthik");
		hospital.setCreatedDate(createdDate);
		hospital.setModifiedBy("karthik");
		hospital.setModifiedDate(modifiedDate);
		
		hospital.setLogo("logo");
		hospital.setPhone(phone);
		hospital.setRegistrationDocument();
		hospital.setState(state);
		hospital.setStatus(status);
		hospital.getZipCode();
		
		Hospital hospital1 = (Hospital) hospital.clone();
		Hospital Hospital2 = hospDao.createHospital(hospital1);*/
		
	 // Assert.assertNull(hospital1);
	/*  Assert.assertNotEquals(hospital1, Hospital2);
	  
		
	}
	*/
	/*public void testAddHospital()
	{
		Hospital hospital = new Hospital();

		  hospital.setHospitalName("Yashoda");
		  hospital.setCity("Hyderabad");
		  hospital.setAddress("Secundrabad");
		  hospital.setAddress1("SomagiGuda");
		  hospital.setState("Telengana");
		  hospital.setEmail("yashoda@services.com");
		  hospital.setPhone(9700201883l);
		  hospital.setFax(404567845l);
		  hospital.setZipcode(500026);
		  hospital.setCreatedBy("superAdmin");
		  hospital.setModifiedBy("superAdmin");
		  hospital.setStatus("Inactive");
		  Date date = new Date();
		  hospital.setCreatedDate(date);
		  hospital.setModifiedDate(date);
		  hospital.setLogo("");
		  hospital.setRegistrationDocument("");
	}*/
	@After
	public void tearDown(){
		hospDao=null;
		
	}

}
