package com.xworkz.DAO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.dto.CompanyDTO;

public class CompanyDAOImpl implements CompanyDAO {
	
//public void call()
//{
//	System.out.println("Start : Read Opeartion");
//	Configuration config=new Configuration();
//	config.configure();
//	config.addAnnotatedClass(CompanyDTO.class);
//	SessionFactory factory=config.buildSessionFactory();
//	Session session=factory.openSession();
//}

	@Override
	public void create(CompanyDTO dto) {
		System.out.println("Start : Create");
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(CompanyDTO.class);
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		Serializable serializable=session.save(dto);
		trans.commit();
		session.close();
		factory.close();
		System.out.println("End: Create");
		
	}

	@Override
	public void readAll() {
		System.out.println("Start : Read Opeartion");
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(CompanyDTO.class);
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		
		List arrlist=session.createQuery("from CompanyDTO c").list();
		Iterator<CompanyDTO> it=arrlist.iterator();
		System.out.println("C_ID"+"\t"+"COMPANY_NAME"+"\t"+"GROSS_PROFIT"+"\t"+"COMPANY_CEO");
//		System.out.println();
		while(it.hasNext())
		{
			CompanyDTO cdto=(CompanyDTO)it.next();
			System.out.print(cdto.getCid()+"\t");
			System.out.print(cdto.getCompanyName()+"\t");
			System.out.print("\t"+cdto.getGrossProfit()+"\t");
			System.out.println("\t"+cdto.getCompanyCEO());
		}
		session.close();
		System.out.println();
		System.out.println("End: Read Operation");
	}

}
