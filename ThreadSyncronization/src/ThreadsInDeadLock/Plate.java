package ThreadsInDeadLock;

public class Plate {
	int golgappa;
	boolean available;
	
	public synchronized void serve(int golgappa)
	{
		if(available==true)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Golgappa given to Consumer:"+golgappa);
		this.golgappa=golgappa;
		available=true;
		notifyAll();
	}
	
	public  synchronized void get()
	{
		if(available==false)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Golgappa Consumed by consumer:"+golgappa);
		available=false;
		notifyAll();
	}

}
