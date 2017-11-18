package com.dotridge.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dotridge.domain.Hospital;
import com.dotridge.util.SessionFactoryUtil;


@Repository
public class HospitalDaoImpl implements HospitalDao 
{
@Autowired
private SessionFactory sessionFactory;
	public Hospital createHospital(Hospital hospital) 
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(hospital);
		session.getTransaction().commit();
		session.close();
		return hospital;
	}

	public Hospital updateHospital(Hospital hospital) 
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.update(hospital);
		session.getTransaction().commit();
		session.close();
		return hospital;
	}

	public Hospital getHospitalById(int id) 
	{
		//System.out.println(id);
		//SessionFactory sessionFactory = SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Hospital hospital = (Hospital)session.load(Hospital.class, id);
		session.getTransaction().commit();
		//session.close();
		return hospital;
	}

	public List<Hospital> getHospitalByName(String hospitalName) 
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		String hql = "from Hospital h where h.hospitalName like:hospitalName";
		Query query = session.createQuery(hql);
		query.setParameter("hospitalName", "%" + hospitalName + "%");
		List<Hospital> hospitals = query.list();
		session.close();
		return hospitals;
	}

	public List<Hospital> getAllHospitals() 
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		String hql = "from Hospital";
		Query query = session.createQuery(hql);
		List<Hospital> hospitals = query.list();
		session.close();
		return hospitals;
	}
	public boolean deleteHospital(int id) 
	{
		//SessionFactory sessionFactory = SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Hospital hospital = (Hospital)session.load(Hospital.class, id);
		session.delete(hospital);
		
		session.getTransaction().commit();
		Hospital hospital1 = (Hospital)session.get(Hospital.class, id);
		//System.out.println(hospital);
	
		if(hospital1==null)
		{
			return true;
		}
		return false;
	}

	public List<Hospital> getAllHospitalsByPagining(int currentPage, int numberOfRecords) 
	{
		//SessionFactory sessionFactory = SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		String hql = "from Hospital";
		Query query = session.createQuery(hql);
		query.setFirstResult((currentPage - 1) * numberOfRecords);
		query.setMaxResults(numberOfRecords);
		List<Hospital> hospitals = query.list();
		session.close();
		return hospitals;
	}

	@Override
	public List<Hospital> getHospitalByEmail(String email) {
		// TODO Auto-generated method stub

		//SessionFactory sessionFactory = SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		String hql = "from Hospital h where h.email like:email";
		Query query = session.createQuery(hql);
		query.setParameter("email", "%" + email + "%");
		List<Hospital> hospitals = query.list();
		session.close();
		return hospitals;
	}

	@Override
	public Hospital getHospitalByUniqueName(String Name) {
		
		//SessionFactory sessionFactory=SessionFactoryUtil.getfactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		String hql = "from Hospital h where h.hospitalName=:hospitalName";
		Query query = session.createQuery(hql);
		query.setParameter("hospitalName",Name);
		Hospital hospital = (Hospital) query.uniqueResult();
		
		return hospital;
	}

}
