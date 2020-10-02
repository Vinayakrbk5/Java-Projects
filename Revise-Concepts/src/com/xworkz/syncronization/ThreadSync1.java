package com.xworkz.syncronization;

public class ThreadSync1 extends Thread {

	Student student;
	public ThreadSync1(Student std) {
		this.student=std;
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName("Vinayak");
		System.out.println(Thread.currentThread().getName());
		student.send();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
