package ThreadsInDeadLock;

public class CommonResource {
	public synchronized void Resource1()
	{
		System.out.println("Start Execution of Resource 1");
		System.out.println("Resorce1 name :"+Thread.currentThread().getName());
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Resource2();
		System.out.println("End of Resource 1");
	}
	public synchronized void Resource2() {
		System.out.println("Start Execution of Resource 2");
		System.out.println("Resource2 name :"+Thread.currentThread().getName());
		notifyAll();
//		Resource1();
		System.out.println("End of Resource 2");
	}

}
