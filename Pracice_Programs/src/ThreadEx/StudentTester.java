package ThreadEx;

public class StudentTester {
	public static void main(String[] args) {
		Student st=new Student();
		Thread t1=new Thread() {
			public void run() {
				st.set();
				
			} 
		};
		t1.start();
		
		Thread t2=new Thread() {
			public void run() {
				st.set();
			} 
		};
		t2.start();
	}
	
	
}
