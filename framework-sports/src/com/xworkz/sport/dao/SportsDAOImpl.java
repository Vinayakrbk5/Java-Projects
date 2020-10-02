package com.xworkz.sport.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.sport.dto.SportsDTO;

public class SportsDAOImpl implements SportsDAO{


	@Override
	public void create(SportsDTO dto) {
		
		System.out.println("START : create :"+this.getClass().getSimpleName());
		System.out.println("Creating Configuration");
		Configuration configuration=new Configuration();
		configuration.configure("com/xworkz/sport/hibernate/mysql.xml");
		configuration.addAnnotatedClass(SportsDTO.class);
		
		System.out.println("Creating Session Factory");
		SessionFactory factory=configuration.buildSessionFactory();
		 Session session=factory.openSession();
		 
		 System.out.println("Starting Transaction ");
		 Transaction trans=session.beginTransaction();
		 Serializable serializable=session.save(dto);
		 System.out.println("Closing Session and Factory");
		 trans.commit();
		 session.close();
		 factory.close();
		System.out.println("END: create");
		
	}

}
