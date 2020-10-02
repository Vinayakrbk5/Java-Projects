package com.xworkz.student;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public void create(StudentDTO sdto) {
		System.out.println("Start : Student Class");
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(StudentDTO.class);
		SessionFactory factory=config.buildSessionFactory();
//		
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		session.save(sdto);
		trans.commit();
		session.close();
		factory.close();
		System.out.println("End :  Student Class");
	}


}
