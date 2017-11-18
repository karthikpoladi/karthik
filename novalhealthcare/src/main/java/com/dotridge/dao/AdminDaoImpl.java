package com.dotridge.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.dotridge.domain.Admin;
import com.dotridge.util.SessionFactoryUtil;
@Repository
public class AdminDaoImpl implements AdminDao{

	@Override
	public Admin createAdmin(Admin adminDomain) {
		System.out.println("service reached");

		SessionFactory sessionFactory = SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(adminDomain);
		session.getTransaction().commit();
		session.close();
		return adminDomain;
	}

	@Override
	public Admin updateAdmin(int id) {
		SessionFactory sessionFactory = SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Admin adminDomain = (Admin)session.load(Admin.class, id);
		adminDomain.setEmail("sai@gmail.com");
		adminDomain.setModifiedBy("Karthik");
		Date date = new Date();
		adminDomain.setModifiedDate(date);
		session.update(adminDomain);
		session.getTransaction().commit();
		session.close();
		return adminDomain;
	}

	public Admin getAdminById(int id) 
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Admin adminDomain = (Admin)session.load(Admin.class, id);
		session.getTransaction().commit();
		//session.close();
		return adminDomain;
	}

	public List<Admin> getAdminByName(String firstName) 
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		String hql = "from Admin a where a.firstName like:adminFirstName";
		Query query = session.createQuery(hql);
		query.setParameter("adminFirstName", "%" + firstName + "%");
		List<Admin> adminDomains = query.list();
		session.close();
		return adminDomains;
	}

	public List<Admin> getAllAdmins() 
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		String hql = "from Admin";
		Query query = session.createQuery(hql);
		List<Admin> adminDomains = query.list();
		session.close();
		return adminDomains;
	}

	public boolean deleteAdmin(int id) 
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Admin adminDomain = (Admin)session.load(Admin.class, id);
		session.delete(adminDomain);
		session.getTransaction().commit();
		session.close();
		if(adminDomain == null)
		{
			return true;
		}
		return false;
	}

	public List<Admin> getAllAdminsByPagining(int currentPage, int numberOfRecords) 
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		String hql = "from Admin";
		Query query = session.createQuery(hql);
		query.setFirstResult((currentPage - 1) * numberOfRecords);
		query.setMaxResults(numberOfRecords);
		List<Admin> adminDomains = query.list();
		session.close();
		return adminDomains;
	}

}
