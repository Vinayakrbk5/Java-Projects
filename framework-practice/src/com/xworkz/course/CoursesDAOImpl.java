package com.xworkz.course;

import java.util.List;
import java.util.Objects;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.singleton.SFSingleton;

public class CoursesDAOImpl implements CoursesDAO{
	SessionFactory factory=SFSingleton.createSessionFactory();

	@Override
	public CourseDTO fetchByCourseName(String courseName) {
		Session session=factory.openSession();
		try {
			String hql="select Cor from CourseDTO Cor where courseName='"+courseName+"'";
			Query query=session.createQuery(hql);
			Object obj=query.uniqueResult();
			CourseDTO cdto=(CourseDTO) obj; 
			
			if(Objects.nonNull(cdto))
			{
				System.out.println("fetching is successful");
				return cdto;
			}
			else {
				System.out.println("Fetching is unsuccessful");
			}
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			session.close();
		}
		return null;
	}

	@Override
	public void saveRecords(String cName,int fees) {
		Session session=factory.openSession();
		try {
			String hql="insert into CourseDTO(courseName,fees) values('"+cName+"',"+fees+")";
			Query query=session.createQuery(hql);
			int res=query.executeUpdate();
			if(res>0)
			{
				System.out.println("Insertion is Successful");
			}
			else
			{
				System.out.println("Insertion is UnSuccessful");
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			session.close();
		}
		
	}

	@Override
	public List<CourseDTO> fetchAll() {
		Session session=factory.openSession();
		try {
			String hql="select cor from CourseDTO cor";
			Query query=session.createQuery(hql);
			List<CourseDTO> list=query.list();
			return list;
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}
	
	@Override
	public List<String> fetchAllCourseName() {
		Session session=factory.openSession();
		try {
			
			String hql="select cor.courseName from CourseDTO cor";
			Query query=session.createQuery(hql);
			List<String> names=query.list();
			return names;
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			session.close();
		}
		return null;
	}
	
	@Override
	public List<Object[]> fetchAllCourseNameAndCount() {
		Session session=factory.openSession();
		try {
			String hql="select cor.courseName,count(cor.courseName) from CourseDTO cor group by cor.courseName";
			Query query=session.createQuery(hql);
			List<Object[]> objArray=query.list();
			return objArray;
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	@Override
	public void updateCourseNameById(String courseName, int id) {
		Session session=factory.openSession();
		try {
			String hql="update CourseDTO cor set cor.courseName=:cname where cor.id=:cid"; // alias for table is optional
			Query query=session.createQuery(hql);										   // you give are not anyway it will execute
			query.setParameter("cname", courseName);
			query.setParameter("cid", id);
			int res=query.executeUpdate();
			if(res>0)
			{
				System.out.println("Update is successfull");
			}
			else {
				System.out.println("Update is unsuccessful");
			}
				
			}
			catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
	}
	
	@Override
	public void updateCourseNameAndIdByFees(String name, int fees, int id) {
		Session session=factory.openSession();
		try {
			session.beginTransaction().begin();
//			String hql="update CourseDTO cor set  cor.courseName=:cName, cor.cid=:id where cor.fees=:fee";
//			Query query=session.createQuery(hql);
			Query query=session.getNamedQuery("updateCourseNameAndIdByFees");
			query.setParameter("cName", name);
			query.setParameter("id", id);
			query.setParameter("fee", fees);
			int res=query.executeUpdate();
			session.getTransaction().commit();
			if(res>0)
			{
				System.out.println("Update is Successful");
			}
			else {
				System.out.println("Update is unsuccessful");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
	
	@Override
	public void deleteByCourseName(String name) {
		Session session=factory.openSession();
		try {
			Query query=session.getNamedQuery("deleteByCourseName");
			query.setParameter("name", name);
			int res=query.executeUpdate();
			if(res>0)
			{
				System.out.println("delete is successful");
			}
			else {
				System.out.println("delete is unsuccessful");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
	}
	
	@Override
	public void deleteByIdAndFees(int id, int fees) {
		Session session=factory.openSession();
		try {
			Query query=session.getNamedQuery("deleteByIdAndFees");
			query.setParameter("id", id);
			query.setParameter("fees", fees);
			int res=query.executeUpdate();
			if(res>0)
			{
				System.out.println("delete is successful");
			}
			else
			{
				System.out.println("delete is unsuccessful");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}

}
