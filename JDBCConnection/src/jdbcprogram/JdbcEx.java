package jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {
	public static void main(String[] args) {
//		Class.forName(jdbc)=
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/classicmodels";
		String user="root";
		String password="xworkz";
		Statement stmt=null;
		ResultSet resultset=null;
		
		try {
			conn=DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			
			stmt=conn.createStatement(); // creating Enironment
			resultset =stmt.executeQuery("select * from customers");
//			 executes sql statements and returns resultset which contains set of rows and columns
			
			System.out.println("Customer Information is :");
			while(resultset.next())  // move the pointer to the next row
			{
				int custnum=resultset.getInt("customerNumber"); // we can give column name 
//																   as well as column number starting from one
//				int custnum=resultset.getInt(1);
				String custname=resultset.getString("customername"); // column name is not case sensitive
//				String custname=resultset.getString("customerName"); // we can take capital or small letters also
				
				System.out.print(custnum);
				System.out.println("  "+custname);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
			if(resultset!=null)
			resultset.close();
				
			if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}

}
