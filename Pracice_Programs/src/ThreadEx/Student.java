package ThreadEx;

public class Student {
	public synchronized void set()
	{
//		notify();
		System.out.println("This is Vinayak");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("This is End");
		notify();

	}
}
