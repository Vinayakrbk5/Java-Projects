package ThreadsInDeadLock;

public class Thread1  extends Thread{
	private CommonResource cr;
	public Thread1(CommonResource cr)
	{
		this.cr=cr;
	}
	@Override
	public void run() {
		cr.Resource1();
	}

}
