package com.xworkz.lesson.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.lesson.dto.RocketDto;

public class RocketDAOImpl implements RocketDAO {

	public RocketDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public RocketDAO findByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByCost(String cost) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCostByType(String cost, String type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(RocketDto rocketdto) {
		System.out.println("Start:");
		System.out.println("Creating Configuration :");
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(RocketDto.class);
		
		System.out.println("Creating Session factory :");
		SessionFactory factory=config.buildSessionFactory();
		System.out.println("Creating Session");
		Session session=factory.openSession();
		
		System.out.println("Starting Transaction:");
		Transaction trans=session.beginTransaction();
		session.save(rocketdto);
		trans.commit();
		
		System.out.println("Closing session and factory");
		session.close();
		factory.close();
		System.out.println("end:");
	}

}
