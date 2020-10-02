package com.xworkz.preparedstatement;

import java.util.ArrayList;
import java.util.List;

public class BatchUpdateTester {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student(1, "Vinayak", 25));
		list.add(new Student(2, "Vishal", 23));
		list.add(new Student(4, "nikhil", 21));
		
		BatchUpdate batchupdate=new BatchUpdate();
		batchupdate.batchUpdate(list,"Chetan",1,21);
	}

}
