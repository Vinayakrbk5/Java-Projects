package com.xworkz.car;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.singleton.SFSingleton;

public class CarDAOImpl implements CarDAO{
	SessionFactory factory=SFSingleton.createSessionFactory();

	@Override
	public void save(List<CarDTO> list) {
		Session session=factory.openSession();
		
		try {
			for(CarDTO dto:list)
			{
				session.beginTransaction().begin();
			session.save(dto);
			session.getTransaction().commit();
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}
	
	@Override
	public CarDTO fetchBYBrnadName(String brandName) {
		Session session=factory.openSession();
		try {
			Query query=session.getNamedQuery("fetchBYBrnadName");
			query.setParameter("brand", brandName);
			 CarDTO cdto=(CarDTO) query.uniqueResult();
//			 System.out.println(cdto);
			 return cdto;
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			session.close();
		}
		return null;
	}
	
	@Override
	public CarDTO fetchByPrice(Double price) {
		Session session =factory.openSession();
		try {
			
			Query query=session.getNamedQuery("fetchByPrice");
			query.setParameter("price", price);
			CarDTO cdto= (CarDTO) query.uniqueResult();
			
			System.out.println(cdto);
			return cdto;
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

}
