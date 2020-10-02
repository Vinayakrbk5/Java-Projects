package com.xworkz.criteria;

import java.util.List;
import java.util.Objects;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.xworkz.SFSingleton;

public class StudentDAOImpl implements StudentDAO{
SessionFactory factory=SFSingleton.getSessionFactory();

	@Override
	public List<StudentDTO> fetchById() {
		Session session =factory.openSession();
		try {
			Criteria cr=session.createCriteria(StudentDTO.class);
//			cr.add(Restrictions.eq("age",22));
//			cr.add(Restrictions.between("age", 23, 26));
			cr.addOrder(Order.asc("name"));
			cr.add(Restrictions.like("name", "vInAyAk"));
			List<StudentDTO> list=cr.list();
				return list;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
		
	}
	@Override
		public Double rowCount() {
			Session session=factory.openSession();
			try {
				
				Criteria cr=session.createCriteria(StudentDTO.class);
				cr.setProjection(Projections.avg("age"));
				List count=cr.list();
				return (Double) count.get(0);
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
			return null;
		}
	
	@Override
		public void checkNull() {
			Session session =factory.openSession();
			try {
				Criteria cr=session.createCriteria(StudentDTO.class);
//				cr.setFirstResult(0);
//				cr.setMaxResults(3);
//				Criterion id=Restrictions.eq("sId", 25);
//				Criterion age=Restrictions.eqOrIsNull("age", 24);
//				Criterion name=Restrictions.like("name", "vinayak");
//				cr.add(Restrictions.and(id,name));
//				cr.addOrder(Order.asc("name"));
				
//				Criteria res=cr.setProjection(Projections.rowCount()); // counts number of rows
//				System.out.println(res);
//				cr.setProjection(Projections.count("name")); // count number of name fields excluding null values
//				cr.setProjection(Projections.countDistinct("name")); count number of distinct columns of name field
//				cr.setProjection(Projections.avg("age")); // perform average operation on age field
//				cr.setProjection(Projections.min("age")); // select minimum one
				cr.setProjection(Projections.max("name"));// select maximum one
				cr.setProjection(Projections.sum("age")); // adds total values
				
//				cr.addOrder(Order.desc("age"));
				List list=cr.list();
				if(Objects.nonNull(list) && !list.isEmpty())
				{
					System.out.println("Object is not null");
					list.forEach(p->System.out.println(p));
				}
				else
				{
					System.out.println("object is null or empty");
				}
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
			
		}

}
