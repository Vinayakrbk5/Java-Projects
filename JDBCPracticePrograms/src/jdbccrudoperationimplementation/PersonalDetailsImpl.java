package jdbccrudoperationimplementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import constants.DBConstants;
import jdbccrud.PersonalDetails;

public class PersonalDetailsImpl implements PersonalDetails {

	@Override
	public void displayAllRecords() {
		String sqlquerry="select * from personaldetails";
		
		try (Connection conn=DriverManager.getConnection(DBConstants.URL, DBConstants.USER, DBConstants.PASSWORD);
				Statement stmt=conn.createStatement();ResultSet resultset=stmt.executeQuery(sqlquerry))
		{
			System.out.println("ID"+"\t\t"+"Name"+"\t\t"+"City");
			while(resultset.next())
			{
				System.out.print(resultset.getInt(1));
				System.out.print("\t\t"+resultset.getString(2)+"\t\t");
				System.out.println(resultset.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateTable(int id, String name, String city) {
		
		String sqlquerry="Update personaldetails set Name='"+name+"', city='"+city+"' where id="+id;
		try (Connection conn=DriverManager.getConnection(DBConstants.URL, DBConstants.USER, DBConstants.PASSWORD);
				Statement stmt=conn.createStatement())
		{
			 int result=stmt.executeUpdate(sqlquerry);
			 if(result<2)
				{
				System.out.println(result+" row is updated successfully");
				}
				else
				{
					System.out.println(result+" rows are updated successfully");
				}
			 System.out.println("The new updated table is :");
			 displayAllRecords();
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertRecord(int id, String name, String city) {
		String sqlquerry="insert into personaldetails values ("+id+",'"+name+"','"+city+"');";
		try (Connection conn=DriverManager.getConnection(DBConstants.URL, DBConstants.USER, DBConstants.PASSWORD);
				Statement stmt=conn.createStatement())
		{
			int resultset=stmt.executeUpdate(sqlquerry);
			System.out.println(resultset+" new row is inserted successfully");
			System.out.println("Now newly updated table is :");
			displayAllRecords();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteRecord(int id) {
		
		String sqlquerry="delete from personaldetails where id="+id;

		try(Connection conn=DriverManager.getConnection(DBConstants.URL, DBConstants.USER, DBConstants.PASSWORD);
				Statement stmt=conn.createStatement())
		{
			int result=stmt.executeUpdate(sqlquerry);
			if(result<2)
			{
			System.out.println(result+" row is deleted successfully");
			}
			else
			{
				System.out.println(result+" rows are deleted successfully");
			}
			displayAllRecords();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void displaySelectedRecord(int id) {
		
		String sqlquerry="select *from  personaldetails where id="+id;
		try(Connection conn=DriverManager.getConnection(DBConstants.URL, DBConstants.USER, DBConstants.PASSWORD);
				Statement stmt=conn.createStatement();ResultSet resultset=stmt.executeQuery(sqlquerry))
		{
			System.out.println("ID"+"\t\t"+"Name"+"\t\t"+"City");
			while(resultset.next())
			{
				System.out.print(resultset.getInt(1));
				System.out.print("\t\t"+resultset.getString(2)+"\t\t");
				System.out.println(resultset.getString(3));
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
