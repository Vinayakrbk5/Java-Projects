package storedprocedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import singletonpackages.SingleTonClass;

public class CallableStatementUsingoutParameter {

public static void main(String[] args) {
	String selectquery="call outproc2(?,?);";
	Connection conn=SingleTonClass.getInstance().getConnection();
	try(CallableStatement calstmt=conn.prepareCall(selectquery))
	{
		calstmt.setInt(1, 3);
		calstmt.registerOutParameter(2, Types.INTEGER);
		calstmt.execute();
		String custname=calstmt.getString(2);
		System.out.println("Customer Name is :"+custname);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
