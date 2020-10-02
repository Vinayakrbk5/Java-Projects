package ThreadsInDeadLock;

public class Thread2 extends Thread {
	private CommonResource cr;
	public Thread2(CommonResource cr)
	{
		this.cr=cr;
	}
	@Override
	public void run() {
		cr.Resource2();
	}


}
