package com.xworkz.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.dto.CycloneDTO;
import com.xworkz.singleton.SFSingleton;

public class CycloneDAOImpl implements CycloneDAO {

	SessionFactory factory = SFSingleton.readSFObject();

	@Override
	public void create(CycloneDTO dto) {

		System.out.println("START : create :" + this.getClass().getSimpleName());
//		System.out.println("Creating Configuration");
//		Configuration configuration=new Configuration();
//		configuration.configure();
//		configuration.addAnnotatedClass(CycloneDTO.class);

//		System.out.println("Creating Session Factory");
//		SessionFactory factory=configuration.buildSessionFactory();
		Session session = factory.openSession();

		try {
			System.out.println("Starting Transaction ");
			Transaction trans = session.beginTransaction();
			session.save(dto);
//		 System.out.println("Closing Session and Factory");
			trans.commit();
		} catch (Exception e) {
			System.err.println("Something went wrong in session");
		} finally {
			session.close();
		}
//		 factory.close();
		System.out.println("END: create");

	}

	@Override
	public void saveList(List<CycloneDTO> list) {
		System.out.println("Start : SaveList");

//		Configuration config=new Configuration();
//		config.configure();
//		config.addAnnotatedClass(CycloneDTO.class);
//		SessionFactory factory=config.buildSessionFactory();

		Session session = factory.openSession();
		try {
			Transaction trans = session.beginTransaction();
			for (CycloneDTO cdto : list) {
				session.save(cdto);
			}
			trans.commit();
		} catch (Exception e) {
			System.err.println("Something went wrong in Session");
		}
		session.close();
		factory.close();

		System.out.println("End : SaveList");

	}

	@Override
	public CycloneDTO fetchById(int id) {

		System.out.println("Start : fetching");

//		Configuration config=new Configuration();
//		config.configure();
//		config.addAnnotatedClass(CycloneDTO.class);
//		SessionFactory factory=config.buildSessionFactory();

		Session session = factory.openSession();
		CycloneDTO cdto = null;
		try {

			Transaction trans = session.beginTransaction();
			cdto = session.get(CycloneDTO.class, id);
			if (cdto != null) {
				System.out.println("fetching is successful");
				trans.commit();
				System.out.println("End : fetching");
			} else {
				System.out.println("fetching is unsuccessful");
			}
		} catch (Exception e) {
			System.err.println("Something went wrong in Session");
		} finally {
			session.close();
		}
//		factory.close();

		return cdto;

	}

	@Override
	public void updateAreaAffetctedById(double area, int pk) {

		System.out.println("Start:updateAreaAffetctedById ");

//		Configuration config=new Configuration();
//		config.configure();
//		config.addAnnotatedClass(CycloneDTO.class);
//		SessionFactory factory=config.buildSessionFactory();

		Session session = factory.openSession();
		try {
			Transaction trans = session.beginTransaction();
			CycloneDTO cdto = session.get(CycloneDTO.class, pk);
			if (cdto != null) {
				System.out.println("Update done succesfully");
				cdto.setareaAfftected(area);
				session.update(cdto);
				trans.commit();
			} else {
				System.out.println("update is unsuccessful");
			}
		} catch (Exception e) {
			System.err.println("Something went wrong");
		} finally {
			session.close();
		}
//		factory.close();

		System.out.println("End : updateAreaAffetctedById");

	}

	@Override
	public void deleteById(int id) {

		System.out.println("Start :deleteById");

//		Configuration config=new Configuration();
//		config.configure();
//		config.addAnnotatedClass(CycloneDTO.class);
//		SessionFactory factory=config.buildSessionFactory();
		Session session = factory.openSession();
		try {
			Transaction trans = session.beginTransaction();
			CycloneDTO cdto = session.get(CycloneDTO.class, id);
			if (cdto != null) {
				System.out.println("deleted successfully");
				session.delete(cdto);
				trans.commit();
			} else {
				System.out.println("delete is unsuccesful");
			}
		} catch (Exception e) {
			System.err.println("Something went wrong in Session");
		} finally {
			session.close();
		}
//		 factory.close();

		System.out.println("End : deleteById");

	}

	@Override
	public void updateAreaAffetctedAndDisasterManagementById(double area, boolean dm, int pk) {
		System.out.println("Start : updateAreaAffetctedAndDisasterManagementById");
//		Configuration config=new Configuration();
//		config.configure();
//		config.addAnnotatedClass(CycloneDTO.class);
//		SessionFactory  factory=config.buildSessionFactory();

		Session session = factory.openSession();
		try {
			Transaction trans = session.beginTransaction();
			CycloneDTO cdto = session.get(CycloneDTO.class, pk);
			if (cdto != null) {
				System.out.println("Update is successful");
				cdto.setareaAfftected(area);
				cdto.setDesastermanagement(dm);
				session.update(cdto);
				trans.commit();
			}
		} catch (Exception e) {
			System.err.println("Something went wrong in Session");
		} finally {
			session.close();
		}
//		factory.close();

		System.out.println("End : updateAreaAffetctedAndDisasterManagementById");
	}

	@Override
	public void updateNameById(String name, int pk) {
		System.out.println("Start : updateNameById");
//		Configuration config=new Configuration();
//		config.configure();
//		config.addAnnotatedClass(CycloneDTO.class);
//		SessionFactory factory=config.buildSessionFactory();

		Session session = factory.openSession();
		try {
			Transaction trans = session.beginTransaction();
			CycloneDTO cdto = session.get(CycloneDTO.class, pk);
			if (cdto != null) {
				System.out.println("Update is successful");
				cdto.setName(name);
				session.update(cdto);
				trans.commit();
			}
		} catch (Exception e) {
			System.err.println("Something went wrong in session");
		} finally {
			session.close();
		}
//		factory.close();

		System.out.println("End : updateNameById");
	}

}
