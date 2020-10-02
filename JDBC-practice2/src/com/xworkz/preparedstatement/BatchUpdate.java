package com.xworkz.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.singleton.ConnectionSingleton;

public class BatchUpdate {
	Connection conn = ConnectionSingleton.getConnection();

	public void batchUpdate(List<Student> list,String name,int id,int did) {
		String createQuery = "create table student_table (stid int,st_name varchar(50),age int)";
		String dropTable = "drop table if exists student_table";
//		String insertQuery = "insert into student_table values(?,?,?)";
		String truncateQuery = "truncate table student_table";
		String updateQuery = "update student_table set st_name='"+name+"' where stid="+id;
		String deleteQuery = "delete from student_table where age="+did;

		
		try {
			Statement stmt=conn.createStatement();
//			PreparedStatement prestmt=conn.prepareStatement(createQuery);
////			PreparedStatement prestmt1=conn.prepareStatement(dropTable);
//			PreparedStatement prestmt2=conn.prepareStatement(insertQuery);
////			PreparedStatement prestmt3=conn.prepareStatement(truncateQuery);
//			PreparedStatement prestmt4=conn.prepareStatement(updateQuery);
//			PreparedStatement prestmt5=conn.prepareStatement(deleteQuery);
//			prestmt.addBatch();
//			prestmt1.addBatch();
//			prestmt2.addBatch();
//			prestmt3.addBatch();
//			prestmt4.addBatch();
//			prestmt5.addBatch();
			
//			int[] res=
			stmt.addBatch(createQuery);
			
//			stmt.addBatch(dropTable);
			for(Student stud:list)
			{
				String insertQuery1 = "insert into student_table values("+stud.getStId()+",'"+stud.getName()+"',"+stud.getAge()+")";
			stmt.addBatch(insertQuery1);
			}
//			stmt.addBatch(truncateQuery);
			
			stmt.addBatch(updateQuery);
			stmt.addBatch(deleteQuery);
			int res[]=stmt.executeBatch();
			for(int i:res)
			{
				System.out.println(i);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
