package com.xworkz.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.dto.GhostDTO;
import com.xworkz.singltonsf.SFSingleton;

public class GhostDAOImpl implements GhostDAO{
SessionFactory factory=SFSingleton.returnSF();
	@Override
	public void create(GhostDTO gdto) {
		Session session =factory.openSession();
		try {
			Transaction trans=session.beginTransaction();
			session.save(gdto);
			trans.commit();
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			session.close();
		}
	}

	@Override
	public void updateDangerBYId(int id, boolean danger) {
		
		Session session=factory.openSession();
		try {
			Transaction trans=session.beginTransaction();
			GhostDTO gdto=session.get(GhostDTO.class, id);
			if(gdto!=null)
			{
			gdto.setDanger(danger);
			session.update(gdto);
			trans.commit();
			}
		}
		catch (Exception e) {
		System.err.println("Something went wrong in updateDangerBYId method");
		}
		finally {
			session.close();
		}
	}

	@Override
	public void deleteById(int id) {
		
		Session session=factory.openSession();
		try {
		GhostDTO gdto=session.get(GhostDTO.class, id);
		if(gdto!=null)
		{
			Transaction trans=session.beginTransaction();
			session.delete(gdto);
			trans.commit();
		}
		}
		finally {
			session.close();
		}
	}

	@Override
	public void updateGenderAndDateById(char g, Date d, int id) {
		
		Session session=factory.openSession();
		try {
			Transaction trans=session.beginTransaction();
			GhostDTO gdto=session.get(GhostDTO.class, id);
			if(gdto!=null)
			{
				gdto.setGender(g);
				gdto.setDate(d);
				session.update(gdto);
				trans.commit();
			}
		}
		finally {
			session.close();
		}
	}


}
