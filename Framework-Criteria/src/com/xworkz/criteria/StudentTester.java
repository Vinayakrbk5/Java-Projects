package com.xworkz.criteria;

import java.util.List;

import com.xworkz.SFSingleton;

public class StudentTester {

	public static void main(String[] args) {
		System.out.println("Start : main Method");
		try {
		StudentDAO sdao=new StudentDAOImpl();
//		List<StudentDTO> list=sdao.fetchById();
//		list.forEach(System.out::println);
		
		sdao.checkNull();
		
//		System.out.println("Number of rows are :"+sdao.rowCount());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			SFSingleton.closeSF();
		}
		System.out.println("End : main method");
	}

}
