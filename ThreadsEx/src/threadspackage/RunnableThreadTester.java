package threadspackage;

public class RunnableThreadTester {
	public static void main(String[] args) {
		System.out.println("Thread Name in main Method:"+Thread.currentThread().getName());
		System.out.println("Thread Id in main method:"+Thread.currentThread().getId());
		
		RunnableThread r1=new RunnableThread();
//		Thread t1=new Thread();
		r1.start();
		
		RunnableThread r2=new RunnableThread();
		r2.start();
		
		Thread t2=new Thread(new RunnableThread2());
		t2.start();
		
	}

}
