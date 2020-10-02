package com.xworkz.bus;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.singleton.SFSingleton;

public class BusDAOImpl implements BusDAO {

	SessionFactory factory = SFSingleton.createSessionFactory();

	@Override
	public void create(BusDTO bdto) {
		System.out.println("Start : session");
		Session session = factory.openSession();

		try {
			Transaction trans = session.beginTransaction();
			session.save(bdto);
			trans.commit();
			System.out.println("End : Session");
		} catch (Exception e) {

			System.err.println("Something went wrong in session");
		} finally {
			System.out.println("Closing session");
			session.close();
		}

	}

	@Override
	public BusDTO fetchByname(String name) {
		System.out.println("Start : Session");
		Session session = factory.openSession();
		try {
			String sqlquery = "select BD from BusDTO BD where BD.busName='" + name + "'";
			Query query = session.createQuery(sqlquery);
//			Object obj=query.uniqueResult();
//			BusDTO bdto=(BusDTO) obj;

			BusDTO bdto = (BusDTO) query.uniqueResult();
			System.out.println("End : Session");
			return bdto;

		} catch (Exception e) {

//			e.printStackTrace();
			System.err.println("Something went wrong in session");
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public void deleteByCapacityAndId(Integer capacity, Integer id) {
		System.out.println("Start : Session");
		Session session = factory.openSession();

		try {
			String sqldelete = "delete from BusDTO where busCapacity=" + capacity + " and busId=" + id;
			Query query = session.createQuery(sqldelete);

			int res = query.executeUpdate();
			if (res > 0) {
				System.out.println("delete is successful");
			} else {
				System.out.println("delete is unsuccessful");
			}
			System.out.println("End : Session");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing session");
			session.close();
		}

	}

	@Override
	public void updateIdByName(Integer id, String name) {

		System.out.println("Start : Session");
		Session session = factory.openSession();
		try {
			String sqlupdate = "Update BusDTO set busId=" + id + " where busName='" + name + "'";
			Query query = session.createQuery(sqlupdate);
			int res = query.executeUpdate();
			if (res > 0) {
				System.out.println("Update is successful");
			} else {
				System.out.println("Update is unsuccessful");
			}
			System.out.println("End : Session");
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public Long fetchCount() {
		Session session=factory.openSession();
		try {
			String hql="select count(bus) from BusDTO bus";
			Query query=session.createQuery(hql);
			Long count=(Long) query.uniqueResult();
			return count;
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		finally {
			session.close();
		}
		return null;
	}

	@Override
	public Long fetchByBusName() {
		Session session=factory.openSession();
		try {
			String hql="select count(bus.busName) from BusDTO bus";
			Query query=session.createQuery(hql);
			Long count=(Long) query.uniqueResult();
			return count;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			session.close();
		}
		
		return null;
	}

	@Override
	public Integer fetchMaxByCapacity() {
		Session session=factory.openSession();
		try {
			String hql="select max(bus.busCapacity) from BusDTO bus";
			Query query=session.createQuery(hql);
			Integer maxCap=(Integer) query.uniqueResult();
			System.out.println("in dao "+maxCap);
			return maxCap;
		}catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			session.close();
		}
		return null;
	}

	@Override
	public Long fetchSumByCapacity() {
		Session session=factory.openSession();
		try {
			String hql="select sum(bus.busCapacity) from BusDTO bus";
			Query query=session.createQuery(hql);
			Long totSum=(Long) query.uniqueResult();
			System.out.println("in dao "+totSum);
			return totSum;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return null;
	}

	@Override
	public Integer fetchSecondMaxByCapacity() {
		Session session=factory.openSession();
		try {
			String hql="select bus.busCapacity from BusDTO bus order by busCapacity desc ";
//			String sql="select * from BUS_TABLE order by BUS_CAPACITY desc limit 1,1";
			Query query=session.createQuery(hql);
			query.setFirstResult(2);
			query.setMaxResults(1);
//			SQLQuery query=session.createSQLQuery(sql);
//			Object obj=query.uniqueResult();
//			System.out.println(obj);
			Integer secMax=(Integer) query.uniqueResult();
			return secMax;
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return null;
	}

	@Override
	public Object fetchBusNameAndCapacityById(int bId) {
		Session session=factory.openSession();
		System.out.println("Start : Session");
		try {
			String hql="select bus.busName,bus.busCapacity from BusDTO bus where busId="+bId;
			Query query=session.createQuery(hql);
			List bus=query.list();
			System.out.println("Hi Hello");
			
			Iterator itr=bus.iterator();
			while(itr.hasNext())
			{
				Object a[]=(Object[])itr.next();
				System.out.println(a[0] +" and "+a[1]);
				ArrayList arrList=new ArrayList<>();
				arrList.add(a[0]);
				arrList.add(a[1]);
				return arrList;
			}
//			String busName=(String) bus.get(0);
//			System.out.println(busName);
//			Integer capacity=(Integer) bus.get(2);
//			System.out.println(capacity);
//			for(BusDTO obj:bus)
//			{
//				String busName=(String)obj.;
//				Integer capacity=(Integer)obj[1];
//				System.out.println(busName);
//				System.out.println(capacity);
//			}
			return null;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			System.out.println("End : Session");
		}
		
		return null;
	}

	@Override
	public List<Object[]> fetchBusNameAndCountByCapacity(int capacity) {
		Session session=factory.openSession();
		String sql="select BUS_NAME,count(BUS_NAME) over(order by BUS_NAME) as row_num from BUS_TABLE where BUS_CAPACITY="+capacity;
		Query query=session.createSQLQuery(sql);
		List<Object[]> list=query.list();
		return list;
	}

}
