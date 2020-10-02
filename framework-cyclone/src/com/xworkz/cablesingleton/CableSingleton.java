package com.xworkz.cablesingleton;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CableSingleton {

	private static SessionFactory factory;
	public static SessionFactory returnSFObject()
	{
		Configuration config=new Configuration();
		config.configure();
		factory=config.buildSessionFactory();
	return factory;
	
	}
	public static void closeSF()
	{
		if(factory!=null)
		{
			factory.close();
		}
	}
	
	
}
