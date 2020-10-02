package storedprocedures;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import singletonpackages.SingleTonClass;

public class StoredProcedureUsingPreparedStatement {

	public static void main(String[] args) {
		String sqlproc="call proc("+5+",'"+"Vinayak"+"','"+"Bhilawadi"+"','"+"v@gmail.com"+"',"+987987+");";
		String sqlquery="call proc(?,?,?,?,?);";
		Connection conn=SingleTonClass.getInstance().getConnection();
		try(PreparedStatement prestmt=conn.prepareStatement(sqlquery);
				Statement stmt=conn.createStatement())
		{
//			prestmt.setInt(1, 5);
//			prestmt.setString(2, "Vinayak");
//			prestmt.setString(3, "Bhilawadi");
//			prestmt.setString(4, "v@gmail.com");
//			prestmt.setInt(5,987459);
			
			
			
			boolean res=stmt.execute(sqlproc);
			


			System.out.println("one row is inserted  :"+res);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
