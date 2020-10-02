package storedprocedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import singletonpackages.SingleTonClass;

public class CreateProcedureUsingStatement {

	public static void main(String[] args) {
		Connection conn=SingleTonClass.getInstance().getConnection();
		String dropproc="drop procedure if exists outproc2;";
		String selectquery="call outproc2(?,?);";
		String createsql="create procedure outproc2(in custid int,out cname varchar(50)) begin select lastname into cname from customer" + 
				" where customerID=custid; end  ;";
		try(PreparedStatement stmt=conn.prepareStatement(selectquery);Statement stmt1=conn.createStatement();
				CallableStatement calstmt=conn.prepareCall(selectquery))
		{
			
			stmt.execute(dropproc);
			System.out.println(" one procedure is dropped");
			
			stmt.execute(createsql);
			System.out.println(" one procedure is created");
			
			calstmt.setInt(1, 3);
			calstmt.registerOutParameter(2, Types.VARCHAR);
			calstmt.execute();
			System.out.println("Output :"+calstmt.getString(2));
			
		}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
