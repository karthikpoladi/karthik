package com.dotridge.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dotridge.domain.Hospital;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class HospitalDaoTest {
@Autowired
	  private HospitalDao hospDao;
	

@Test
public void testGetAllHospitals()
{
	List<Hospital> allHospitals = hospDao.getAllHospitals();
	Assert.assertNotNull(allHospitals);
	Assert.assertEquals(1,allHospitals.size() );
}
}
