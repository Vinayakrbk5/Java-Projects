package com.xworkz.singleton;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.dto.SanitizerDTO;

public class SFSingleton {


	private static SessionFactory factory;
	
	public static SessionFactory returnSFObject()
	{
		System.out.println("Creating Configuration");
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(SanitizerDTO.class);
		factory=config.buildSessionFactory();
		return factory;
	}
	
	public static void closeSF()
	{
		if( factory!=null)
		{
			System.out.println("Closing Session factory");
			factory.close();
		}
	}
}
