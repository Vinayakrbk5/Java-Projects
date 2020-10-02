package com.xworkz.singleton;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFSingleton {

	private static SessionFactory factory;

	public static SessionFactory returnSFObject() {
		Configuration config = new Configuration();
		config.configure();
		factory = config.buildSessionFactory();
		return factory;

	}

	public static void closeSF() {
		if (factory != null) {
			factory.close();
		}
	}
}
