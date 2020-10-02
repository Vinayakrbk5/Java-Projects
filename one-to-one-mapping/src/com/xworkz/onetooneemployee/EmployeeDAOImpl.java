package com.xworkz.onetooneemployee;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.onetoone.StudentUtil;

public class EmployeeDAOImpl implements EmployeeDAO {
	SessionFactory factory = StudentUtil.returnSF();

	@Override
	public void save(EmployeeDTO edto, Set<DepartmentDTO> set) {
		Session session = factory.openSession();
		try {
			System.out.println("Start : Session");
			session.beginTransaction().begin();
			for (DepartmentDTO dDto : set) {
				session.save(dDto);
//			session.flush();
			}
			session.save(edto);
			session.getTransaction().commit();
			System.out.println("End : Session");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
