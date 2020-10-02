package com.xworkz.customgenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGeneratorForClassCar implements IdentifierGenerator {
	String prefix = "Vinayak";

	@Override
	public Serializable generate(SessionImplementor session, Object obj) throws HibernateException {
		Connection conn = session.connection();
		try ( Statement stmt = conn.createStatement()) {
			String query = "select count(CAR_ID) from car_table";
			ResultSet res = stmt.executeQuery(query);
			while (res.next()) {
				int id= res.getInt(1) + 1;
				String generate = prefix +id;
				System.out.println("Generated id is :"+generate);
				return generate;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}