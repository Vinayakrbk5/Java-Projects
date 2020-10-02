package storedprocedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import singletonpackages.SingleTonClass;

public class StoredProcedure {

	public static void main(String[] args) {
		String sqlinsert="call proc(?,?,?,?,?);";
		Connection conn=SingleTonClass.getInstance().getConnection();
		try(CallableStatement callstmt=conn.prepareCall(sqlinsert))
		{
			callstmt.setInt(1, 5);
			callstmt.setString(2, "Vinayak");
			callstmt.setString(3, "Bhilawadi");
			callstmt.setString(4, "v@gmail.com");
			callstmt.setInt(5,987459);
			boolean result=callstmt.execute();
		
			System.out.print(callstmt.getInt(1));
			System.out.print("\t"+callstmt.getString(2)+"\t");
			System.out.print(callstmt.getString(3));
			System.out.print("\t"+callstmt.getString(4)+"\t");
			System.out.print(callstmt.getInt(5));
			System.out.println("one row is inserted  :"+result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
