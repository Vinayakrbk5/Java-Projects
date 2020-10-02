package ThreadSuncronization;

public class JointAccountTester {
	public static void main(String[] args) {
		JointAccount jacc=new JointAccount();
		Thread t1=new Thread() {
			public void run() {
				Thread.currentThread().setName("Vinayak");
				jacc.get1(2000);
			}
		};
		t1.start();
		
		Thread t2=new Thread() {
			public void run() {
				Thread.currentThread().setName("Vishal");
				jacc.get1(2000);
			}
		};
		t2.start();
		
		Thread t3=new Thread() {
			public void run() {
			Thread.currentThread().setName("Vijay");
				jacc.get1(1000);
			}
		};
		t3.start();
		
		Thread t4=new Thread() {
			public void run() {
				Thread.currentThread().setName("Vinod");
				jacc.get1(1500);
				
			}
		};
		t4.start();
	}

}
