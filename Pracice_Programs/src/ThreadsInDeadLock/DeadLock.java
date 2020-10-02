package ThreadsInDeadLock;

public class DeadLock {
	public static void main(String[] args) {
		Thread1 t1=new Thread1(new CommonResource());
		Thread2 t2=new Thread2(new CommonResource());
		
		t1.start();
		t2.start();
	}

}
