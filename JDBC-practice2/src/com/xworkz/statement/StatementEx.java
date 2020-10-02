package com.xworkz.statement;

import java.sql.Connection;
import java.sql.Statement;

import com.xworkz.singleton.ConnectionSingleton;

public class StatementEx {

	public static void main(String[] args) {
		try {
			Connection conn=ConnectionSingleton.getConnection();
			Statement stmt=conn.createStatement();
			String createquery="create table student_table (stid int,st_name varchar(50),age int);";
			String dropquery="drop table if exists student_table";
			stmt.addBatch(createquery);
			stmt.addBatch(dropquery);
			int[] arr=stmt.executeBatch();
			for(int i:arr)
			{
				System.out.println(i);
			}
//			int result=stmt.executeUpdate(dropquery);
//			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionSingleton.closeConnection();
		}

	}
}
