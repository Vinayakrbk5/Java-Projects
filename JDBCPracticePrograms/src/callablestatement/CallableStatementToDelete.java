package callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import singletonpackages.SingleTonClass;

public class CallableStatementToDelete {

	public static void main(String[] args) {

//		String deletequery="delete from customer where customerid=?;";
//		String selectquery="select * from customer;";
		String insertquery="insert into customer values" + 
				"("+1+",'"+"vinayak"+"',"+99879878+"),("+2+",'"+"vishal"+"',"+9898798+"),("+3+",'"+"Sharath"+"',"+98792387+");";
				
		Connection conn=SingleTonClass.getInstance().getConnection();
		try(Statement calstmt=conn.createStatement())
		{
//			calstmt.setInt(1, 1);
//			calstmt.executeUpdate();
//			System.out.println("Record is deleted Successfully");
			
//			ResultSet res=calstmt.executeQuery();
//			while (res.next()) {
//				System.out.print(res.getInt(1));
//				System.out.print("\t\t" + res.getString(2) + "\t\t");
//				System.out.println(res.getInt(3));
//			}
			calstmt.executeLargeUpdate(insertquery);
			System.out.println("inserted Successfully");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
