package com.xworkz.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.xworkz.singleton.ConnectionSingleton;

public class CrudOpImpl implements CrudOp {

	Connection conn = ConnectionSingleton.getConnection();

	public CrudOpImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public void createTable() {
		try {
			String createQuery = "create table student_table (stid int,st_name varchar(50),age int)";
			PreparedStatement prestmt = conn.prepareStatement(createQuery);
			prestmt.execute();
			System.out.println("Table is created successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void dropTable() {
		try {
			String dropTable = "drop table if exists student_table";
			PreparedStatement prestmt1 = conn.prepareStatement(dropTable);
			boolean res = prestmt1.execute();
//			System.out.println(res);
			System.out.println("Table is dropped successfully" + res);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void inertRecord(int id, String name, int age) {
		try {
			String insertQuery = "insert into student_table values(?,?,?)";
			PreparedStatement prestmt2 = conn.prepareStatement(insertQuery);
			prestmt2.setInt(1, id);
			prestmt2.setString(2, name);
			prestmt2.setInt(3, age);
//			boolean res=prestmt2.execute();
			int res = prestmt2.executeUpdate();
			if (res > 0) {
				System.out.println("inserted records");
			} else {
				System.out.println("Unable to insert");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void truncateTable() {
		try {

			String truncateQuery = "truncate table student_table";
			PreparedStatement prestmt4 = conn.prepareStatement(truncateQuery);
			prestmt4.execute();
			System.out.println("Truncated Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateNameById(String name, int id) {
		try {
			String updateQuery = "update student_table set st_name=? where stid=?";
			PreparedStatement prestmt5 = conn.prepareStatement(updateQuery);
			prestmt5.setString(1, name);
			prestmt5.setInt(2, id);
			int res = prestmt5.executeUpdate();
			if (res > 0) {
				System.out.println("Updated Successfully");
			} else {
				System.out.println("not updated");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void insertAll(List<Student> list) {
		try {

			String insertQuery = "insert into student_table values(?,?,?)";
			PreparedStatement prestmt6 = conn.prepareStatement(insertQuery);
			int res = 0;
			for (Student stud : list) {
				prestmt6.setInt(1, stud.getStId());
				prestmt6.setString(2, stud.getName());
				prestmt6.setInt(3, stud.getAge());
				res = res + prestmt6.executeUpdate();
			}

			if (res ==3) {
				System.out.println("Insertion is successful");
			} else {
				System.out.println("not inserted all records");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Override
	public void deleteByAge(int age) {
		try {
			String deleteQuery="delete from student_table where age=?";
			PreparedStatement prestme7=conn.prepareStatement(deleteQuery);
			prestme7.setInt(1, age);
			int res=prestme7.executeUpdate();
			if(res>0)
			{
				System.out.println("delete is successful");
			}
			else
			{
				System.out.println("not deleted");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
