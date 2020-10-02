package com.xworkz.student;

import com.xworkz.serviceforstudent.StudentServiceImpl;

public class StudentTester {

	public static void main(String[] args) {
		StudentDTO sdto=new StudentDTO();
//		sdto.setSid(2);
		sdto.setName("Vinayak");
		sdto.setMobile("979898979");
		sdto.setCity("Bangalore");
		
//		char str=null;
		
		
		StudentServiceImpl studServiceImpl=new StudentServiceImpl();
		studServiceImpl.validateAndCreate(sdto);
//		StudentDAO sdao=new StudentDAOImpl();
//		sdao.create(sdto);
		
	}
}
