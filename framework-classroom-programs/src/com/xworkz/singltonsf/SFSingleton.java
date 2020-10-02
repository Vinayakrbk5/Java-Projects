package com.xworkz.singltonsf;

	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;


	public class SFSingleton {
		private static SessionFactory factory;
		
		public static SessionFactory returnSF()
		{
			System.out.println("returning Sessionfactory object");
			return factory;
		}
		 static {
			 System.out.println("Creating configuration");
			 Configuration config=new Configuration();
			 config.configure();
			 factory=config.buildSessionFactory();
		 }
		 public static void closeSF()
		 {
			 if(factory!=null)
			 {
				 System.out.println("Closing sessionfactory ");
				 factory.close();
			 }
		 }
	}
