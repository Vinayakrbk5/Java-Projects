package com.xworkz.singleton;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class SFSingleton {
	
	 private static SessionFactory factory;
	 public static SessionFactory readSFObject()
	 {
		 
		 return factory;
	 }
	 
	 public static void closeSF()
	 {
		 if(factory!=null && !factory.isClosed()) {
		factory.close(); 
	 }
	 }
	 static {
		 try {
			 System.out.println("Creating Configuration");
		 Configuration config=new Configuration();
		 config.configure();
		 factory=config.buildSessionFactory();
	 }
	 catch(Exception e)
		 {
		 System.err.println("Something went wrong in session factory");
		 }
	 }
}
