package ThreadsInDeadLock;

public class Thread2 extends Thread {
	CommonResource rc;
	public Thread2(CommonResource rc)
	{
		this.rc=rc;
	}
	@Override
	public void run() {
		System.out.println("Thread name in Thread2 is :"+Thread.currentThread().getName());
		rc.res2();
	}
}
