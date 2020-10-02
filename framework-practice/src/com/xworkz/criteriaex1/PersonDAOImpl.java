package com.xworkz.criteriaex1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.ordering.antlr.Factory;

import com.xworkz.singleton.SFSingleton;

public class PersonDAOImpl implements PersonDAO{

	private SessionFactory Factory=SFSingleton.createSessionFactory();
	
	@Override
	public void readRecords() {
		Session session=Factory.openSession();
		try {
			Criteria criteria=session.createCriteria(PersonDTO.class);
//			criteria.add(Restrictions.isNull("age"));
//			Criterion age=Restrictions.between("age", 23, 25);
//			Criterion name=Restrictions.like("personName", "%k");
//			criteria.setFirstResult(0);
//			criteria.setMaxResults(2);
//			criteria.add(Restrictions.and(age,name));
			
//			criteria.addOrder(Order.desc("age"));
//			criteria.setFirstResult(0);
//			criteria.setMaxResults(2);
//			criteria.add(Restrictions.or(Restrictions.lt("age", 25),Restrictions.between("personId", 2, 4)));
			
//			Criterion cr1=Restrictions.lt("age", 25);
//			Criterion cr2=Restrictions.between("personId", 2, 4);
//			criteria.add(Restrictions.or(cr1,cr2));
//			List<PersonDTO> pdto=criteria.list();
//			for(PersonDTO dto:pdto)
//			{
//				System.out.println(dto);
//			}
			
			Criteria res=criteria.setProjection(Projections.property("personName"));
			System.out.println(res.list());
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
	}

}
