package com.xworkz;

import java.util.Objects;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFSingleton {

	private static SessionFactory factory = null;

	public static SessionFactory getSessionFactory() {
		Configuration config = new Configuration();
		config.configure();
		factory = config.buildSessionFactory();
		return factory;
	}

	public static void closeSF() {
		if (Objects.nonNull(factory)) {
			factory.close();
		}
	}
}
