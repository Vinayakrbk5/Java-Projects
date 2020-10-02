package com.xworkz.creatingthread;

public class Thread1 implements Runnable {
	Student student;
	
	public Thread1(Student std) {
		System.out.println("This is Thread1 Class");
		student=std;
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName("Vinayak");
		System.out.println("Created Thread "+Thread.currentThread().getName());
		System.out.println("Preority of Thread "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
      student.display();
		
	}
	
	


}
