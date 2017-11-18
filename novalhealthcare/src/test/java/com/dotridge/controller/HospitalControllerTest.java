package com.dotridge.controller;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.WebApplicationContext;

import com.dotridge.domain.Hospital;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:novalhealth-servlet.xml","classpath:applicationContext.xml"})
public class HospitalControllerTest {
@Autowired
 private HospitalController hospController;
@Autowired
WebApplicationContext context;
Model model;

@Before
public void setUp()
{
	 model =new BindingAwareModelMap();
}


@Test
public void testGetAllHospitals()
{
	String viewName =hospController.viewAllHospital(model);
	Assert.assertNotNull(viewName);
	Assert.assertEquals("getHospitalBoard",viewName );
}

}

