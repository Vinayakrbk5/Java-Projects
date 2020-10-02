package transactionmanagementusingStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import singletonpackages.SingleTonClass;

public class TransactionEx implements TransactionInterface {

	@Override
	public void insertRecords(String phoneno, int amount, String name, String email, String bank, int cvv) {

		String insertquery = "insert into recharge_info (phoneno,amount) values ('" + phoneno + "'," + amount + ");";
		String insertquery2 = "insert into Customer_info values('" + name + "','" + email + "','" + bank + "'," + cvv
				+ ");";
		Connection conn = SingleTonClass.getInstance().getConnection();
		try (Statement stmt = conn.createStatement(); Statement stmt1 = conn.createStatement()) {

			conn.setAutoCommit(false);
			int res = stmt.executeUpdate(insertquery);
			System.out.println(res + " record  to recharge_info table is inserted");
//			conn.setAutoCommit(true);

			int res1 = stmt1.executeUpdate(insertquery2);
			System.out.println(res1 + " record to Customer_info table is inserted");
			conn.setAutoCommit(true);
//			conn.commit();
		}

		catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("Transaction became fail due to Exception");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		finally {
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void displayrecords() {
		
		Connection conn=SingleTonClass.getInstance().getConnection();
		try(Statement stmt=conn.createStatement();Statement stmt1=conn.createStatement())
		{
			String selectquery="select * from Recharge_info;";
			ResultSet result=stmt.executeQuery(selectquery);
			System.out.println("Recharge_info Table details is :");
			System.out.println("Rechargeid"+"\t"+"Phonenumber"+"\t"+"Amount");
			while(result.next())
			{
			System.out.print(result.getInt(1));
			System.out.print("\t\t"+result.getString(2)+"\t");
			System.out.println(result.getInt(3));
			}
			
			System.out.println();
			System.out.println("Customer_info table details is :");
			System.out.println("Customer Name"+"\t"+"Email Id"+"\t"+"Bank Name"+"\t"+"Cvv Number");
			
			String selectquerry2="select * from Customer_info;";
			ResultSet result2=stmt.executeQuery(selectquerry2);
			while(result2.next())
			{
				System.out.print(result2.getString(1));
				System.out.print("\t\t"+result2.getString(2));
				System.out.print("\t"+result2.getString(3));
				System.out.println("\t\t"+result2.getInt(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
