package com.xworkz.dao;

import java.util.Date;
import java.util.List;

//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.dto.SanitizerDTO;
import com.xworkz.singleton.SFSingleton;

import javassist.bytecode.stackmap.BasicBlock.Catch;

public class SanitizerDAOImpl implements SanitizerDAO {

	SessionFactory factory = SFSingleton.returnSFObject();

	@Override
	public SanitizerDTO fetchByBrandName(String name) {
		Session session = factory.openSession();
		System.out.println("Start :Session for fetchByBrandName() method");
		System.out.println("Session : Opened");
		try {
//			String hql = "select SD from SanitizerDTO SD where brandName='" + name + "'";
//			String hql = "select SD from SanitizerDTO SD where brandName=:brand";
			
			Query query = session.getNamedQuery("fetchByBrandName");
			query.setParameter("brand", name);
			Object obj=query.uniqueResult();
			SanitizerDTO sdto=(SanitizerDTO) obj;
//			SanitizerDTO sdto = (SanitizerDTO) query.uniqueResult();
//			System.out.println("In impl class"+sdto);
			return sdto;
		} catch (Exception e) {
//			e.printStackTrace();
			System.err.println("Something went wrong in fetchByBrandName() method");
		} finally {
			System.out.println("End :Session for fetchByBrandName() method");;
			session.close();
		}
		return null;

	}

	@Override
	public SanitizerDTO fetchByBrandNameAndQuantity(String name, Integer quantity) {
		Session session = factory.openSession();
		System.out.println("Start :Session for fetchByBrandNameAndQuantity() method");
		try {
//			String hql = "select SD from SanitizerDTO  SD where brandName='" + name + "' and quantity=" + quantity;
//			String hql = "select SD from SanitizerDTO  SD where brandName=:brand and quantity=:qty";
			Query query=session.getNamedQuery("fetchByBrandNameAndQuantity");
			query.setParameter("brand", name);
			query.setParameter("qty", quantity);
			
//			Query query = session.createQuery(hql);
			SanitizerDTO sandto = (SanitizerDTO) query.uniqueResult();
//			System.out.println("In impl"+sandto);
			return sandto;

		} catch (Exception e) {

			System.err.println("Something went wrong in fetchByBrandNameAndQuantity() method ");
//			e.printStackTrace();
		} finally {
			session.close();
			System.out.println("End :Session for fetchByBrandNameAndQuantity() method");
		}
		return null;
	}

	@Override
	public String fetchBrandNameByIdAndQuantity(Integer id, Integer quantity) {
		Session session = factory.openSession();
		System.out.println("Start :Session for fetchBrandNameByIdAndQuantity() method");
		try {
//			String hql = "select SD.brandName from SanitizerDTO SD where SD.sId=" + id + " and SD.quantity='" + quantity+ "'";
//			String hql = "select SD.brandName from SanitizerDTO SD where SD.sId=:sid and SD.quantity=:qty";
			Query query = session.getNamedQuery("fetchBrandNameByIdAndQuantity");
			query.setParameter("sid", id);
			query.setParameter("qty", quantity);
//			SanitizerDTO sdto = (SanitizerDTO) query.uniqueResult();
			String brandName = (String) query.uniqueResult();
			return brandName;

		} catch (Exception e) {

			System.err.println("Something went wrong in fetchBrandNameByIdAndQuantity() method");
			e.printStackTrace();
		} finally {
			session.close();
			System.out.println("End :Session for fetchBrandNameByIdAndQuantity() method");
		}

		return null;
	}

	@Override
	public Integer fetchIdByQuantityAndBrandName(Integer quantity, String name) {
		Session session = factory.openSession();
		System.out.println("Start :Session for fetchIdByQuantityAndBrandName() method");
		try {
//			String hql = "select SD.sId from SanitizerDTO SD where SD.quantity=" + quantity + " and  SD.brandName='"+ name + "'";
//			String hql = "select SD.sId from SanitizerDTO SD where SD.quantity=:qty and  SD.brandName=:brand";
			Query query = session.getNamedQuery("fetchIdByQuantityAndBrandName");
			query.setParameter("qty", quantity);
			query.setParameter("brand", name);
			Integer id = (Integer) query.uniqueResult();
			System.out.println("id in dao is :" + id);
			return id;

		} catch (Exception e) {
			System.err.println("Something went wrong in fetchIdByQuantityAndBrandName()");
			e.printStackTrace();
		} finally {
			session.close();
			System.out.println("End :Session for fetchIdByQuantityAndBrandName() method");
		}

		return null;
	}

	@Override
	public SanitizerDTO fetchByBrandNameAndMFGDate(String name, Date mfgDate) {
		Session session = factory.openSession();
		System.out.println("Start :Session for fetchByBrandNameAndMFGDate() method");
		try {
//			String hql = "select SD from SanitizerDTO SD where brandName='" + name + "' and mFGDate='" + mfgDate + "'";
//			String hql = "select SD from SanitizerDTO SD where brandName=:brand and mFGDate=:date";
			Query query = session.getNamedQuery("fetchByBrandNameAndMFGDate");
			query.setParameter("brand", name);
			query.setParameter("date", mfgDate);
			SanitizerDTO sdto = (SanitizerDTO) query.uniqueResult();
//			System.out.println("in dao class"+sdto);
			return sdto;

		} catch (Exception e) {
			System.err.println("Something went wrong in fetchByBrandNameAndMFGDate()");
			e.printStackTrace();
		} finally {
			session.close();
			System.out.println("End :Session for fetchByBrandNameAndMFGDate() method");
		}

		return null;
	}

	@Override
	public Long fetchCount() {
		Session session = factory.openSession();
		System.out.println("Start :Session for fetchCount() method");
		try {
			String hql = "select count(SD) from SanitizerDTO SD";
			Query query = session.createQuery(hql);
			Long count = (Long) query.uniqueResult();
			return count;

		} catch (Exception e) {
			System.err.println("Some went wrong in fetchCount() method");
		} finally {
			session.close();
			System.out.println("End :Session for fetchCount() method");
		}

		return null;
	}

	@Override
	public Long fetchCountByPrice(Double price) {
		Session session = factory.openSession();
		System.out.println("Start :Session for fetchCountByPrice() method");
		try {
//			String hql = "select count(SD) from SanitizerDTO SD where price=" + price;
//			String hql = "select count(SD) from SanitizerDTO SD where price=:price";
			Query query = session.getNamedQuery("fetchCountByPrice");
			query.setParameter("price", price);
			Long count = (Long) query.uniqueResult();
//			System.out.println(count);
			return count;
		} catch (Exception e) {
			System.err.println("Some thing went wrong in fetchCountByPrice() method");
		} finally {
			session.close();
			System.out.println("End :Session for fetchCountByPrice() method");
		}
		return null;
	}

	@Override
	public Double fetchMaxByPrice() {
		Session session = factory.openSession();
		System.out.println("Start :Session for fetchMaxByPrice() method");
		try {
			String hql = "select max(SD.price) from SanitizerDTO SD";
			Query query = session.createQuery(hql);
			Double maxPrice = (Double) query.uniqueResult();
			return maxPrice;

		} catch (Exception e) {
			System.err.println("Something went wrong in fetchMaxByPrice()");
		} finally {
			session.close();
			System.out.println("End :Session for fetchMaxByPrice() method");
		}
		return null;
	}

	@Override
	public Double fetchSumByPrice() {
		Session session = factory.openSession();
		System.out.println("Start :Session for fetchSumByPrice() method");
		try {
			String hql = "select sum(SD.price) from SanitizerDTO SD";
			Query query = session.createQuery(hql);
			Double totalSum = (Double) query.uniqueResult();
			return totalSum;
		} catch (Exception e) {
			System.err.println("Something went wrong in fetchSumByPrice()");
		} finally {
			session.close();
			System.out.println("End :Session for fetchSumByPrice() method");
		}
		return null;
	}

	@Override
	public Double fetchSecondMaxByPrice() {
		Session session = factory.openSession();
		System.out.println("Start :Session for fetchSecondMaxByPrice() method");
		try {
			String hql = "select SD.price from SanitizerDTO SD order by price desc";
			Query query = session.createQuery(hql);
			query.setFirstResult(1);
			query.setMaxResults(1);
			Double secMax = (Double) query.uniqueResult();
			return secMax;

		} catch (Exception e) {
			System.err.println("Something went wrong in fetchSecondMaxByPrice()");
		} finally {
			session.close();
			System.out.println("End :Session for fetchSecondMaxByPrice() method");
		}
		return null;
	}

	@Override
	public Object fetchBrandAndPriceById(Integer id) {
		Session session = factory.openSession();
		System.out.println("Start :Session for fetchBrandAndPriceById() method");
		try {
//			String hql = "select SD.brandName,SD.price from SanitizerDTO SD where sId=" + id;
//			String hql = "select SD.brandName,SD.price from SanitizerDTO SD where sId=:id";

			Query query = session.getNamedQuery("fetchBrandAndPriceById");
			query.setParameter("id", id);
//			@SuppressWarnings("unchecked")
//			List<Object> sanitizer = query.list();
//			System.out.println("in dao class "+sanitizer.size());
//			if(sanitizer.size()!=0)
//			{
//				System.out.println("It's not empty");
//			Iterator<Object> itr = sanitizer.iterator();
//			while (itr.hasNext()) {
//				Object a[] = (Object[]) itr.next();
//				ArrayList<Object> arrList = new ArrayList<>();
//				arrList.add(a[0]);
//				arrList.add(a[1]);
//				return arrList;
//			}
			Object san=query.uniqueResult();
			Object[] obj=(Object[]) san;
			return obj;
//			}
//			else
//			{
//				System.out.println("It's empty means something entered wrong");
//			}
			

		} catch (Exception e) {
			System.err.println("Something went wrong in Session");
		} finally {
			session.close();
			System.out.println("End :Session for fetchBrandAndPriceById() method");
		}
		return null;
	}

	@Override
	public List<SanitizerDTO> fetchAll() {
		Session session=factory.openSession();
		
		try {
			
			Query query=session.getNamedQuery("fetchAll");
			
			List<SanitizerDTO> list=query.list();
//			System.out.println("In dao "+list);
			return list;
		}catch (Exception e) {
			System.out.println("Something went wrong in fetchAll() method");
		}
		finally {
			session.close();
		}
		return null;
	}

	@Override
	public List<String> fetchAllBrandName() {
		try(Session session=factory.openSession())
		{
			Query query=session.getNamedQuery("fetchAllBrandName");
			List<String> list=query.list();
			return list;
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<String> fetchAllBrandNameByQuantity(Integer quantity) {
		try(Session session=factory.openSession())
		{
			Query query=session.getNamedQuery("fetchAllBrandNameByQuantity");
			query.setParameter("qty", quantity);
			List<String> list=query.list();
			return list;
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<Object[]> fetchAllBrandNameAndPrice() 
	{
		try(Session session=factory.openSession())
		{
			Query query=session.getNamedQuery("fetchAllBrandNameAndPrice");
			List<Object[]> list=query.list();
			return list;
		}catch (Exception e) {
			System.err.println("Something error in fetchAllBrandNameAndPrice() method");
		}
		return null;
	}

	@Override
	public List<Object[]> fetchAllBrandNameAndCountByQuantity(Integer quantity) {
		try(Session session=factory.openSession())
		{
			String sql="select S_BRAND_NAME,count(S_BRAND_NAME) over(order by S_BRAND_NAME)  from sanitizer_table where QUANTITY="+quantity;
//			Query query=session.getNamedQuery("fetchAllBrandNameAndCountByQuantity");
//			query.setParameter("qty", quantity);
			Query query=session.createSQLQuery(sql);
			
			List<Object[]> list=query.list();
			System.out.println(list);
			return list;
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Object> fetchAllBrandNameCountByPrice(Double price) {
		try(Session session=factory.openSession())
		{
			String sql="select count(S_BRAND_NAME) over(order by S_BRAND_NAME)  from sanitizer_table where PRICE=" +price; 
			Query query=session.createSQLQuery(sql);
			List<Object> list=query.list();
//			System.out.println(list);
			return list;
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
