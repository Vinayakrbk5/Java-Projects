package com.xworkz.syncronization;

public class ThreadSync2 implements Runnable {
	Student student;
	public ThreadSync2(Student std) {
		this.student=std;
	}
	@Override
	public void run() {
		Thread.currentThread().setName("Vishal");
		System.out.println(Thread.currentThread().getName());
		student.recieve();
		
	}
	
	

}
