/**
 * 
 */
package com.dotridge.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author ALWAR
 *
 */
public class SessionFactoryUtil {

	private static SessionFactory factory;

	private SessionFactoryUtil() {

	}

	public static synchronized SessionFactory getfactory() {
		if (factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
		}

		return factory;

	}
}
 
