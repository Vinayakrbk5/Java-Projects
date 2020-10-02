package com.xworkz.lesson.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.lesson.dto.CableDto;
import com.xworkz.singleton.Singleton;

public class CableDAOImpl implements CableDAO {

	SessionFactory factory = Singleton.returnSFObject();;

	@Override
	public CableDto findById(String id) {

		System.out.println("Start: findtypeById ");

		Session session = factory.openSession();

//			Transaction trans=session.beginTransaction();  // no need to use Transaction for only reading data
		CableDto cdto = session.get(CableDto.class, id);
		try {
			if (cdto != null) {
				System.out.println("Reading is Successfull");
			} else {
				System.out.println("Reading is unsuccessful");
			}
		} finally {
			session.close();
		}
		System.out.println("End : findtypeById");
		return cdto;
	}

	@Override
	public void deleteByid(String id) {

		System.out.println("Start : deleteByid");
		Session session = factory.openSession();
		try {
			Transaction trans = session.beginTransaction();
			CableDto cdto = session.get(CableDto.class, id);
			if (cdto != null) {
				session.delete(cdto);
				trans.commit();

			}
			else
			{
				System.out.println("delete is unsucceeful");
			}
		} finally {
			session.close();
		}

		System.out.println("End : deleteByid");

	}

	@Override
	public void updatecontentById(String content, String id) {

		System.out.println("Start: updatecontentById");
		Session session = factory.openSession();
		try {
			Transaction trans = session.beginTransaction();
			CableDto cdto = session.get(CableDto.class, id);
			if (cdto != null) {
				cdto.setContent(content);
				session.update(cdto);
				trans.commit();
			}
			else {
				System.out.println("cannot update,since object is null");
			}

		} finally {
			session.close();
		}
		System.out.println("End : updatecontentById");

	}

	@Override
	public void insert(CableDto cabledto) {

		System.out.println("Start:");

		System.out.println("Creating Session");
		Session session = factory.openSession();
		try {
			System.out.println("Starting Transaction");
			Transaction trans = session.beginTransaction();
			session.save(cabledto);
			trans.commit();

			System.out.println("Closing Session and Factory");
		} finally {
			session.close();
		}
		System.out.println("End:");

	}

}
