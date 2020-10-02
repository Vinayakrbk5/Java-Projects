package com.xworkz.lesson.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.lesson.dto.SpeakerDto;

public class SpaekerDAOImpl implements SpeakerDAO{

			@Override
			public void updateUsedForRangeByType(String usedfor, String type) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public SpeakerDAO findByType(String type) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void deleteByType(String type) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void insert(SpeakerDto speakerdto) {
				
				System.out.println("Start:");
				System.out.println("Creatng Configuration :");
				Configuration config=new Configuration();
				config.configure();
				config.addAnnotatedClass(SpeakerDto.class);
				
				System.out.println("Creating Session factory");
				SessionFactory factory=config.buildSessionFactory();
				
				System.out.println("Creating Session");
				Session session=factory.openSession();
				
				System.out.println("Starting Transaction :");
				Transaction trans=session.beginTransaction();
				Serializable serializable=session.save(speakerdto);
				trans.commit();
				
				System.out.println("Closing sesson and factory");
				session.close();
				factory.close();
				System.out.println("End:");
				
			}
			
			
}
