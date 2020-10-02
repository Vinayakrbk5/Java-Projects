package com.xworkz.lesson.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.lesson.dto.SpeakerDto;
import com.xworkz.lesson.dto.VirusDto;

public class VirusDAOImpl implements VirusDAO {

	@Override
	public VirusDAO findByName(String name) {
		return null;
	}

	@Override
	public void deleteById(int id) {

		System.out.println("Starting : ");
		System.out.println("Creating Configuration :");
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(VirusDto.class);
		SessionFactory factory = config.buildSessionFactory();

		System.out.println("Creating Session :");
		Session session = factory.openSession();
		try {
			System.out.println("Starting Transaction :");
			
			Transaction trans = session.beginTransaction();

			VirusDto vdto = session.get(VirusDto.class, id);

			if (vdto != null) {
				System.out.println("Value got before clear() is :" + vdto);
//				session.clear();
				session.delete(vdto);
				session.flush();
				session.evict(vdto);
		System.out.println("Value got after clear() is :"+vdto);
				trans.commit();
			} else {
				System.out.println("object is " + vdto);
			}
		} finally {
			session.close();
			factory.close();
		}
	}

	@Override
	public void updateNameById(String name, int id) {
		System.out.println("updated " + name + " by it's " + id);
		System.out.println("Starting : ");
		System.out.println("Creating Configuration :");
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(VirusDto.class);
		SessionFactory factory = config.buildSessionFactory();

		System.out.println("Creating Session :");
		Session session = factory.openSession();
		try {
			System.out.println("Starting Transaction :");
			
			Transaction trans = session.beginTransaction();

//			VirusDto vdto = session.get(VirusDto.class, id);
			VirusDto virusdto=new VirusDto();
			virusdto.setName("Covid-19");
			virusdto.setOrigin("Wuhan");
			virusdto.setSize("Macro");
			virusdto.setKilledtillnow(10000);
			virusdto.setSpreadtype("Virul-through");
			virusdto.setVid(id);
			
//			if (vdto != null) {
//				System.out.println("Value got before clear() is :" + vdto);
//				session.clear();
				virusdto.setName(name);
				session.saveOrUpdate(virusdto);
				
//				session.flush();
//				session.evict(vdto);
//		System.out.println("Value got after clear() is :"+vdto);
				trans.commit();
//			} else {
//				System.out.println("object is " + vdto);
//			}
		} finally {
			session.close();
			factory.close();
		}
	}

	@Override
	public void insert(VirusDto dto) {

		System.out.println("Starting : ");
		System.out.println("Creating Configuration :");
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(VirusDto.class);
		SessionFactory factory = config.buildSessionFactory();

		System.out.println("Creating Session :");
		Session session = factory.openSession();
		try {
			System.out.println("Starting Transaction :");
			Transaction trans = session.beginTransaction();
			Serializable serializable = session.save(dto);
//		session.flush();
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing session and factory");
			session.close();
			factory.close();
			System.out.println("End :");
		}
	}

}
