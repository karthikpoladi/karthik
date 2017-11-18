package novalhealthcare;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.dotridge.dao.AdminDao;
import com.dotridge.dao.AdminDaoImpl;
import com.dotridge.domain.Admin;
import com.dotridge.domain.Hospital;
import com.dotridge.util.SessionFactoryUtil;

public class adminDomainTest 
{
	public static void main(String[] args) 
	{
		createAdmin();
		//updateAdminById();
		//getAdminById();
		//getAdminByName();
		//getAllAdmins();
		//getAllAdminsByPagining();
		//deleteAdmin();
	}

	private static void createAdmin() 
	{
		Date date = new Date();
		/*try
		{
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
			date = simpleDateFormat.parse("23-10-2017");
		}
		catch (ParseException e) 
		{
			e.printStackTrace();
		}*/
		/*HospitalDomain hospitalDomain = new HospitalDomain();
		hospitalDomain.setHospitalName("Manipal");
		hospitalDomain.setAddress1("Benz Circle");
		hospitalDomain.setCity("Vijayawada");
		hospitalDomain.setState("Andhra Pradesh");
		hospitalDomain.setZipCode(526356);
		hospitalDomain.setEmail("manipal@gmail.com");
		hospitalDomain.setPhone(9635862345L);
		hospitalDomain.setFax(7539514268L);
		hospitalDomain.setStatus("true");
		hospitalDomain.setCreatedBy("Yugandhar");
		hospitalDomain.setCreatedDate(date);
		hospitalDomain.setModifiedBy("Yugandhar");
		hospitalDomain.setModifiedDate(date);*/
		
		Session session = SessionFactoryUtil.getfactory().openSession();
		Hospital hospital = (Hospital)session.get(Hospital.class, 2);
		
		Admin adminDomain = new Admin();
		adminDomain.setHospital(hospital);
		adminDomain.setFirstName("Sai");
		adminDomain.setLastName("Devarapalli");
		adminDomain.setEmail("sai@gmail.com");
		adminDomain.setPassword("sai5599");
		adminDomain.setPhone(9492123494L);
		adminDomain.setStatus(true);
		adminDomain.setCreatedBy("Yugandhar");
		adminDomain.setCreatedDate(date);
		adminDomain.setModifiedBy("Yugandhar");
		adminDomain.setModifiedDate(date);
		
		AdminDao adminDao = new AdminDaoImpl();
		Admin adminDomain2 = adminDao.createAdmin(adminDomain);
		System.out.println(adminDomain2);
	}
	
	private static void updateAdminById()
	{
		AdminDao adminDao = new AdminDaoImpl();
		Admin adminDomain = adminDao.updateAdmin(1);
		System.out.println(adminDomain);
	}
	
	private static void getAdminById() 
	{
		AdminDao adminDao = new AdminDaoImpl();
		Admin adminDomain = adminDao.getAdminById(1);
		System.out.println(adminDomain);
	}
	
	private static void getAdminByName() 
	{
		AdminDao adminDao = new AdminDaoImpl();
		List<Admin> adminDomains = adminDao.getAdminByName("sai");
		for(Admin a1 : adminDomains)
		{
			System.out.print(a1.getFirstName() + ", ");
			System.out.print(a1.getLastName() + ", ");
			System.out.print(a1.getEmail() + ", ");
			System.out.print(a1.getPassword() + ", ");
			System.out.print(a1.getPhone() + ", ");
			System.out.print(a1.isStatus() + ", ");
			System.out.print(a1.getCreatedBy() + ", ");
			System.out.print(a1.getCreatedDate() + ", ");
			System.out.print(a1.getModifiedBy() + ", ");
			System.out.println(a1.getModifiedDate());
		}
	}
	
	private static void getAllAdmins() 
	{
		AdminDao adminDao = new AdminDaoImpl();
		List<Admin> adminDomains = adminDao.getAllAdmins();
		for(Admin a1 : adminDomains)
		{
			System.out.print(a1.getFirstName() + ", ");
			System.out.print(a1.getLastName() + ", ");
			System.out.print(a1.getEmail() + ", ");
			System.out.print(a1.getPassword() + ", ");
			System.out.print(a1.getPhone() + ", ");
			System.out.print(a1.isStatus() + ", ");
			System.out.print(a1.getCreatedBy() + ", ");
			System.out.print(a1.getCreatedDate() + ", ");
			System.out.print(a1.getModifiedBy() + ", ");
			System.out.println(a1.getModifiedDate());
		}
	}
	
	private static void getAllAdminsByPagining() 
	{
		AdminDao adminDao = new AdminDaoImpl();
		List<Admin> adminDomains = adminDao.getAllAdminsByPagining(1, 1);
		for(Admin a1 : adminDomains)
		{
			System.out.print(a1.getFirstName() + ", ");
			System.out.print(a1.getLastName() + ", ");
			System.out.print(a1.getEmail() + ", ");
			System.out.print(a1.getPassword() + ", ");
			System.out.print(a1.getPhone() + ", ");
			System.out.print(a1.isStatus() + ", ");
			System.out.print(a1.getCreatedBy() + ", ");
			System.out.print(a1.getCreatedDate() + ", ");
			System.out.print(a1.getModifiedBy() + ", ");
			System.out.println(a1.getModifiedDate());
		}
	}
	
	private static void deleteAdmin() 
	{
		AdminDao adminDao = new AdminDaoImpl();
		boolean value = adminDao.deleteAdmin(1);
		if(value = true)
		{
			System.out.println("One row deleted successfully");
		}
		else
			System.out.println("deletion failed or record not found with the specified Id");
	}
}
