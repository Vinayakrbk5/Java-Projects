package com.xworkz.preparedstatement;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.singleton.ConnectionSingleton;

public class PreparedStatementEx {

	public static void main(String[] args) {
		try {
			List<Student> list=new ArrayList<>();
			list.add(new Student(1, "Vinayak", 25));
			list.add(new Student(2, "Vishal", 23));
			list.add(new Student(4, "nikhil", 21));
			
			CrudOp crudObj=new CrudOpImpl();
//			crudObj.createTable();
//			crudObj.dropTable();
//			crudObj.inertRecord(5, "Vinayak", 25);
//			crudObj.truncateTable();
//			crudObj.updateNameById("Vishal", 5);
//			crudObj.insertAll(list);
			crudObj.deleteByAge(25);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			ConnectionSingleton.closeConnection();
		}
	}

}
