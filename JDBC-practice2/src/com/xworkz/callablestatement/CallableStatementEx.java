package com.xworkz.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.xworkz.singleton.ConnectionSingleton;

public class CallableStatementEx {
	public static void main(String[] args) {
		
	int id=1;
	String name="Vinayak";
	int age=25;
	Connection conn=ConnectionSingleton.getConnection();
	String query="select * from student_table";
	
	String createProc="create procedure proc_test(in pid int,in pname varchar(50),in p_age int) begin "+
						"insert into student_table values(pid,pname,p_age); end ";
	String callproc="call proc_test("+id+",'"+name+"',"+age+");";
	
	String calloutproc="call proc_test1(?,?)";
	try {
		CallableStatement calstmt=conn.prepareCall(createProc);
		CallableStatement calstmt1=conn.prepareCall(callproc);
		CallableStatement calstmt2=conn.prepareCall(calloutproc);
		calstmt2.setInt(1, id);
		calstmt2.registerOutParameter(2, Types.INTEGER);
		calstmt2.execute();
		System.out.println(calstmt2.getString(2));
//		int result=calstmt.executeUpdate();
		
		
//		System.out.println(result);
//		calstmt1.execute();
//		if(result>0)
//		{
//			System.out.println("Procedure is created successfully");
//		}
//		else
//		{
//			System.out.println("not created");
//		}
//		while(result.next())
//		{
//			System.out.print(result.getInt(1)+","+result.getString(2)+","+result.getInt(3));
//			System.out.println();
//		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}

}
