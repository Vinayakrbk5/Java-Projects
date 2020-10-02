package com.xworkz.laptop;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class LaptopPrimaryKeyGenerator implements IdentifierGenerator{
	String prefix="Vinay";
	@Override
	public Serializable generate(SessionImplementor session, Object obj) throws HibernateException {
		Connection conn=session.connection();
		try(Statement stmt=conn.createStatement();)
		{
		
		String query="select count(LAPTOP_ID) from laptop_table";
		ResultSet result=stmt.executeQuery(query);
		while(result.next())
		{
			int res=result.getInt(1);
			String generate=prefix+res+1;
			return generate;
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	

}
