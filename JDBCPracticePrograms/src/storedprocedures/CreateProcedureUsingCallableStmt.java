package storedprocedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;

import singletonpackages.SingleTonClass;

public class CreateProcedureUsingCallableStmt {

	public static void main(String[] args) {
//		String createproc="drop procedure if exists inoutprocedure;";
		String createsql="delimiter // create procedure outproc2(in custid int,out cname varchar(50)) begin select lastname into cname from customer" + 
				" where customerID=custid; end // delimiter ;";
		Connection conn=SingleTonClass.getInstance().getConnection();
		try(CallableStatement calstmt=conn.prepareCall(createsql))
		{
			ResultSet res=calstmt.executeQuery();
//			while(res.next())
//			{
			System.out.println("Procedure dropped successfully?:"+res);
//			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
