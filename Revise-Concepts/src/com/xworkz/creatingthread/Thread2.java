package com.xworkz.creatingthread;

public class Thread2 extends Thread {

	Student student;
	
	public Thread2(Student st) {
		System.out.println("This is Thread2 class");
		this.student=st;
	}
	@Override
	public void run() {
		Thread.currentThread().setName("Vishal");
		System.out.println("Created thread "+Thread.currentThread().getName());
		System.out.println("Preority of Thread "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
		student.display();

	}

}
