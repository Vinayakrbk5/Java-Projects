package storedprocedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import singletonpackages.SingleTonClass;

public class callstatementUsingInOutParameter {

	public static void main(String[] args) {
		String selectproc="call inoutprocedure(?,?);";
		
		Connection conn=SingleTonClass.getInstance().getConnection();
		try(CallableStatement calstmt=conn.prepareCall(selectproc))
		{
			calstmt.setInt(1, 6);
			calstmt.registerOutParameter(2, Types.INTEGER);
			calstmt.execute();
			int res=calstmt.getInt(2);
			System.out.println("Output of stored procedure is :"+res);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
