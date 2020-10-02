package LamdaFunctionAndAnonymousClass;

public class StudentTester {
	public static void main(String[] args) {
		Student st=new Student() {

			@Override
			public void say() {
				System.out.println("This is Anonymous class");
			}
			
		};
		st.say();
		
		Student std=()->System.out.println("This is Lamda Function");
		std.say();
	
	Employee emp=new Employee("Karnataka") {
		@Override
		public void print() {
			System.out.println("This is India");
		}
	};
	emp.print();
	
	Thread t1=new Thread() {
		public void run() {
			System.out.println("Thread name is :"+Thread.currentThread().getName());
			System.out.println("This is Thread Class");
		}
	};
	t1.start();
	
	Runnable r1=new Runnable() {
		public void run() {
			System.out.println("Thread name is :"+Thread.currentThread().getName());
			System.out.println("This is Runnable in anonymous class");
		}
	};
	Thread t2=new Thread(r1);
	t2.start();
	
		Runnable r3=()->System.out.println("This lamda function in Thread");
		Thread t3=new Thread(r3);

	}
	
	
}

