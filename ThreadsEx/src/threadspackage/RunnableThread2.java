package threadspackage;

public class RunnableThread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Bye");
		System.out.println("Second Thread :"+Thread.currentThread().getName());
		System.out.println("Karnataka");
	}

	
}
