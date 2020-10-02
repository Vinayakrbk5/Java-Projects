package com.xworkz.laptop;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.singleton.SFSingleton;

public class LaptopDAOImpl implements LaptopDAO {
	SessionFactory factory = SFSingleton.createSessionFactory();

	@Override
	public void save(List<LaptopDTO> list) {
		Session session = factory.openSession();
		try {

			for (LaptopDTO dto : list) {
				session.beginTransaction().begin();
				session.save(dto);
				session.getTransaction().commit();

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	@Override
	public void fetchById(String id) {
		Session session=factory.openSession();
		try {
			
//			LaptopDTO dto=session.get(LaptopDTO.class, id);
			Query query=session.getNamedQuery("fetchById");
			query.setParameter("id", id);

			Object[] obj=(Object[]) query.uniqueResult();
			for(Object dto:obj)
			{
			System.out.print(dto+",");
			}
			System.out.println();
//			LaptopDTO dto=(LaptopDTO) obj;
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}
	@Override
	public List<LaptopDTO> fetchAll() {
		Session session=factory.openSession();
try {
			
			Query query=session.getNamedQuery("fetchAll");
			
			List<LaptopDTO> list=query.list();
			System.out.println("In dao "+list);
			return list;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
		
	}
	@Override
	public void fetchBrandName() {
		Session session=factory.openSession();
		try {
			Query query=session.getNamedQuery("fetchBrandName");
			List<String> list=query.list();
			list.forEach(p->System.out.println(p));			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}
	@Override
	public void updateBrandNameById(String name, Integer id) {
		Session session=factory.openSession();
		try {
			session.beginTransaction().begin();
			LaptopDTO dto=session.get(LaptopDTO.class, id);
//			LaptopDTO dto=new LaptopDTO();
			if(Objects.nonNull(dto))
			{
				System.out.println("Object is not null");
				dto.setBrand(name);
				session.update(dto);
				session.getTransaction().commit();
			}
			else
			{ 
				System.out.println("Object is null");
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
		String hql="select lap from LaptopDTO lap";// Read
		String hql1="insert into ";
		
	}
	@Override
	public void insert(LaptopDTO dto) {
		Session sessio =factory.openSession();
		try {
			String hql="insert into laptop_table(BRAND_NAME,PRICE) values('"+dto.getBrand()+"',"+dto.getPrice()+")";
			Query query=sessio.createSQLQuery(hql);
//			query.setParameter("id", dto.getlId());
//			query.setParameter("brand", dto.getBrand());
//			query.setParameter("price", dto.getPrice());
			int res=query.executeUpdate();
			if(res>0)
			{
				System.out.println("Inserted");
			}
			else
			{
				System.out.println("Not inserted");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			sessio.close();
		}
		
	}

}
