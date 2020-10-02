package ThreadsInDeadLock;

public class CommonResource {
	public synchronized  void res1()
	{
		System.out.println("Start of Resource 1");
		System.out.println("This is India");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		res2();
//		System.out.println("End of Resource 1");
		
		
	}
	public synchronized void res2()
	{
		System.out.println("Start of Resource 2");
		System.out.println("This is Vinayak");
//			notifyAll();
		
		System.out.println("End of Resource 2");
		notifyAll();
			
	}

}
