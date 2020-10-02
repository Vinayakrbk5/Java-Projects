package com.xworkz.nation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.singleton.SFSingleton;

public class NationDAOImpl implements NationDAO {

	SessionFactory factory = SFSingleton.createSessionFactory();

	@Override
	public void create(List<NationDTO> list) {
		System.out.println("Start : Create ");

		Session session = factory.openSession();
		try {
			System.out.println("Beginning Transaction");
			Transaction trans = session.beginTransaction();
			for (NationDTO ndto : list) {
				session.save(ndto);

			}
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		System.out.println("End : Create");
	}

	@Override
	public void updateNameById(String name, int id) {

		Session session = factory.openSession();
		try {
			Transaction trans = session.beginTransaction();
			NationDTO ndto = session.get(NationDTO.class, id);
			if (ndto != null) {
				System.out.println("Update is successful");
				ndto.setName(name);
				session.update(ndto);
				trans.commit();
			}
		} catch (Exception e) {
			System.err.println("Exception occurred, something went wrong");
		}

		finally {
			session.close();
		}
	}

	@Override
	public NationDTO readById(int id) {

		Session session = factory.openSession();
		try {
			Transaction trans = session.beginTransaction();

			NationDTO ndto = session.get(NationDTO.class, id);
			if (ndto != null) {
				System.out.println("Successfully read");
				trans.commit();
				return ndto;
			}
			else
			{
				System.out.println("read is unsuccessful,so we are going to get null value");
				return ndto;
			}
		} finally {
			session.close();
		}

	}

	@Override
	public void deleteById(int id) {
		
		Session session=factory.openSession();
		try {
		Transaction trans=session.beginTransaction();
		NationDTO ndto=session.get(NationDTO.class, id);
		if(ndto!=null)
		{
			System.out.println("Delete is Successful");
		session.delete(ndto);
		trans.commit();
		}
		else {
			System.out.println("Delete is unsuccessful");
		}
		}
		finally {
			session.close();
		}
		
	}

}
