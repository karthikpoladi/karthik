package com.dotridge.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = SessionFactoryUtil.getfactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		System.out.println(factory.hashCode());
	}
			
}
