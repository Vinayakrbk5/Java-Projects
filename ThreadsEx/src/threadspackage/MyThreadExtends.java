package threadspackage;

public class MyThreadExtends {
	public static void main(String[] args) {
		
		System.out.println("Thread Name :"+Thread.currentThread().getName());
		System.out.println("Thread Id :"+Thread.currentThread().getId());
		MyThread t1=new MyThread();
		t1.start();
		
		MyThread t2=new MyThread();
		t2.start();
		
	}

}
