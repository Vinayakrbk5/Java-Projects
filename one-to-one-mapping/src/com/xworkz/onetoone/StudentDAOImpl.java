package com.xworkz.onetoone;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentDAOImpl implements StudentDAO{
SessionFactory factory=StudentUtil.returnSF();

	@Override
	public void save(StudentDTO dto) {
		Session session=factory.openSession();
		try {
			System.out.println("Creating Transaction");
			Transaction trans=session.beginTransaction();
			session.save(dto);
			trans.commit();
			System.out.println("End session");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}

}
