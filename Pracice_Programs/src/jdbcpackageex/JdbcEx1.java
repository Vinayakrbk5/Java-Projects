package jdbcpackageex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx1 {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/practicesql";
//		"jdbc:mysql://localhost:3306/classicmodels"
		String user="root";
		String password="xworkz";
		
		// now using practicesql database
		String querry11="use practicesql;";
		try(Connection con=DriverManager.getConnection(url,user,password);
				Statement stmt=con.createStatement())
		{
			stmt.executeLargeUpdate(querry11);
			System.out.println("now practicesql database is using");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		// now dropping table if exists
		String querry="drop table if exists personaldetails;";
		try(Connection con=DriverManager.getConnection(url,user,password);
				Statement stmt=con.createStatement())
		{
			stmt.executeLargeUpdate(querry);
			System.out.println("table is droped if it exists");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//now creating new table
		String querry1="create table personaldetails (id int,name varchar(50),city varchar(50)); ";
		try(Connection con=DriverManager.getConnection(url,user,password);
				Statement stmt=con.createStatement())
		{
			stmt.executeLargeUpdate(querry1);
			System.out.println("one new table is created successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		// now inserting elements into table
		String querry2= "insert into personaldetails values "
				+ "(1,'Vinayak','Bangalore'),(2,'Vishal','Rabkavi'),(3,'Nakul','Mandya'),(4,'Sohil','Baglkot');";
		try(Connection con=DriverManager.getConnection(url,user,password);
				Statement stmt=con.createStatement())
		{
			System.out.println(stmt.executeLargeUpdate(querry2)+" records are inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// displaying table elements
		String querry22="select * from personaldetails order by name";
		try(Connection con=DriverManager.getConnection(url,user,password);
				Statement stmt=con.createStatement();ResultSet resultset=stmt.executeQuery(querry22))
		{
			System.out.println("Table Contents are: ");
			System.out.println("ID"+"\t\t"+"Name"+"\t\t"+"City");
			while(resultset.next())
			{
			
				System.out.print(resultset.getInt(1));
				System.out.print("\t\t"+resultset.getString(2)+"\t\t");
				System.out.println(resultset.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
