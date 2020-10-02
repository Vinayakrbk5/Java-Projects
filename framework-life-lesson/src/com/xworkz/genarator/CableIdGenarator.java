package com.xworkz.genarator;

import java.io.Serializable;
import java.sql.*;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CableIdGenarator implements IdentifierGenerator{

	public static int temp=1;
	@Override
	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
		 String prefix = "Xworkz_";
//		 int temp=4;
	        Connection connection = session.connection();

	        try {
	            Statement statement=connection.createStatement();

	            ResultSet rs=statement.executeQuery("select count(id) as CId from cable_table");

	            if(rs.next())
	            {
	                int id=rs.getInt(1)+1;
	                String generatedId =  prefix+id;  //new Integer(id).toString()
	                System.out.println("Generated Id: " + generatedId);
	                return generatedId;
	            }
	        }
		catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}


}
