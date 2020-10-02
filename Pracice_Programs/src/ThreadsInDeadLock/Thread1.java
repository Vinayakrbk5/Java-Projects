package ThreadsInDeadLock;

public class Thread1 extends Thread{
	CommonResource rc;
	public Thread1(CommonResource rc)
	{
		this.rc=rc;
	}
	@Override
	public void run() {
		System.out.println("Thread name in Thread1 is :"+Thread.currentThread().getName());
		rc.res1();
	}

}
