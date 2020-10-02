package com.xworkz.onetoone;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentUtil {

	private static SessionFactory factory;
	
	public static SessionFactory returnSF()
	{
		try {
		System.out.println("Start :Creating Configuration");
		Configuration config=new Configuration();
		config.configure();
		factory=config.buildSessionFactory();
		System.out.println("End :Creating Configuration");
//		return factory;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
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
