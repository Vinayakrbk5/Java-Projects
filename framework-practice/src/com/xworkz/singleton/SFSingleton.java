package com.xworkz.singleton;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFSingleton {

	private static SessionFactory factory;

	public static SessionFactory createSessionFactory() {
		Configuration config = new Configuration();
		config.configure();
//		config.addAnnotatedClass(BikesDTO.class);
		factory = config.buildSessionFactory();
		return factory;
	}

//	static {
//
//	}

	public static void closeSF() {
		if (factory != null) {
			factory.close();
		}
	}
}
