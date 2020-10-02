package ThreadsInDeadLock;

public class DeadLockEx {
	public static void main(String[] args) {
		CommonResource cmr=new CommonResource();
		Thread1 t1=new Thread1(cmr);
		
		Thread2 t2=new Thread2(cmr);
		
		t1.start();
		t2.start();
	}

}
