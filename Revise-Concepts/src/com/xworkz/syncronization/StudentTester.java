package com.xworkz.syncronization;

public class StudentTester {

	public static void main(String[] args) {
		Student stud=new Student();
		ThreadSync1 th1=new ThreadSync1(stud);
		th1.start();
		System.out.println();
		
		
		ThreadSync2 t2=new ThreadSync2(stud);
		Thread th2=new Thread(t2);
		th2.start();
	}

}
