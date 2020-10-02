package com.xworkz.creatingthread;

public class StudentTester {

	public static void main(String[] args) {
		Student st=new Student();
		Thread1 t1=new Thread1(st);
		Thread th=new Thread(t1);
		th.start();
		System.out.println();
		
		Thread2 t2=new Thread2(st);
		t2.start();
		System.out.println();
		Thread t3=new Thread() {
			public void run() {
				Thread.currentThread().setName("Bangalore");
				System.out.println("Created Thread "+Thread.currentThread().getName());
				System.out.println("Preority of thread "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
				st.display();
				
			};
		};
		t3.start();
		
		Runnable runObj=new Runnable() {
			
			@Override
			public void run() {
				System.out.println();
				st.display();
				
			}
		};
		Thread runTh=new Thread(runObj);
		runTh.start();
		
		Runnable runObj2=()->{
			Thread.currentThread().setName("Lamda Expression");
			System.out.println("Thread Name is :"+Thread.currentThread().getName());
			System.out.println("This is Overidden method");};
		Thread th4=new Thread(runObj2);
		th4.start();

		StudentInterface stud=(a,b)->System.out.println("Sum of a and b is "+(a*b));
		stud.create(10, 20);
	}

}
