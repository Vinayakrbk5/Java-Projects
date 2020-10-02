package ThreadsExtendingThreadClass;

public class ThreadsTester { 
	public static void main(String[] args) {
//		Thread t1=new Thread(new Thread1());
//		t1.start();
//		
//		Thread t2=new SThread(new Thread2());
//		t2.start();
		
		Table table=new Table();
		Thread1 t1=new Thread1(table);
		t1.start();
		
		Thread2 t2=new Thread2(table);
		t2.start();
	}

}
