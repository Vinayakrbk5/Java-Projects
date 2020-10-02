package com.xworkz.employee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void create(EmployeeDTO edto) {
		
		System.out.println("Start:Create: Employee Class");
		Configuration config=new Configuration();
		config.configure(); //  just loads meta information don't validates
		config.addAnnotatedClass(EmployeeDTO.class);// just loads annotated class as Employee class don't validates(check)
		SessionFactory factory=config.buildSessionFactory(); // creates session factory object
		
		Session session=factory.openSession(); // creates Session object
		Transaction trans=session.beginTransaction();// tells we are beginning transaction
		Serializable serializable=session.save(edto);// checks wether Employee class is entity class or not by checking annotations
		trans.commit();// checks for correct mapping database and table
		session.close();
		factory.close();
		
		System.out.println("End :Create: Employee Class");
	}

	@Override
	public EmployeeDTO readById(int eid) {
		System.out.println("Start: Read");
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(EmployeeDTO.class);
		SessionFactory factory=config.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		EmployeeDTO edto=session.get(EmployeeDTO.class, eid);
		if(edto!=null)
		{
			System.out.println("Reading is Successful");
		}
		else
		{
			System.out.println("Cannot able to read");
		}
		trans.commit();
		session.close();
		factory.close();
		
		
		System.out.println("End: Read");
		
		return edto;
		
		

	}

	@Override
	public void updateNameById(String name, int id) {
		System.out.println("Start : Update");
		
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(EmployeeDTO.class);
		SessionFactory factory=config.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		EmployeeDTO edto=session.get(EmployeeDTO.class, id);
		if(edto!=null)
		{
			System.out.println("Object is not null");
			edto.setName(name);
			session.update(edto);
		}else
		{
			System.out.println("Object is null we cannot update");
		}
		trans.commit();
		session.close();
		factory.close();
		
		System.out.println("End: Update");
		
		
	}

	@Override
	public void deleteById(int eid) {
		System.out.println("Start: delete Operation");
		
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(EmployeeDTO.class);
		SessionFactory factory=config.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		EmployeeDTO edto=session.get(EmployeeDTO.class, eid);
		if(edto!=null)
		{
			System.out.println("object is not null");
			session.delete(edto);
		}
		else
		{
			System.out.println("Object is null");
		}
		trans.commit();
		session.close();
		factory.close();
		
		
		
		
		
		System.out.println("End: delete Operation");
	}

	@SuppressWarnings("null")
	@Override
	public List<EmployeeDTO> readAll() {
		System.out.println("Start: readAll Operation");
		
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(EmployeeDTO.class);
		SessionFactory factory=config.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
//		int size
//		ArrayList<EmployeeDTO> arrlist=session.createQuery(all);
//		int i=1;
//		int j=0;
//		EmployeeDTO edto=null;
//		do
//		{
//			arrlist.add(session.get(EmployeeDTO.class, i++));
//			arrlist.add(j++, edto);
//		}
//		while(edto!=null);
		
//		CriteriaBuilder cb=session.getC;
		trans.commit();
		session.close();
		factory.close();
		
		System.out.println("End: readAll Operation");
		
		
		return null;
	}
	
	


}
