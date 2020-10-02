package threadspackage;

public class RunnableThread extends Thread implements Runnable 
{

	@Override
	public void run() {
		System.out.println("Hello World");
		System.out.println("First Thread :"+Thread.currentThread().getName());
		System.out.println("Thread Id:"+Thread.currentThread().getId());
		System.out.println("Bangalore");
//		System.out.println("Preority :"+Thread.currentThread().getState());
//		System.out.println(Thread.currentThread().isDaemon());
	}
	

}
