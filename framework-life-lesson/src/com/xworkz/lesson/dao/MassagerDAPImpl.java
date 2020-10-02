package com.xworkz.lesson.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.lesson.dto.MassagerDto;

public class MassagerDAPImpl implements MassagerDAO {

	@Override
	public MassagerDAO findByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByType(String type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePriceRangeByType(String pricerange, String type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(MassagerDto massagerdto) {
		System.out.println("Start:");
		System.out.println("Creating Configuration");
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(MassagerDto.class);
		
		System.out.println("Creating Session factory");
		SessionFactory factory=config.buildSessionFactory();
		
		System.out.println("Creating Session ");
		Session session=factory.openSession();
		System.out.println("Starting Transaction");
		Transaction trans=session.beginTransaction();
		Serializable serializable=session.save(massagerdto);
		
		trans.commit();
		
		System.out.println("Closing Session and factory");
		session.close();
		factory.close();
		System.out.println("End: ");
	}

}
