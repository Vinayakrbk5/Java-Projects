package ThreadSyncronizationEx;

public class ThreadSyncronizationTeaster {
	public static void main(String[] args) {
		Multiflier fl=new Multiflier();
		Thread1 t1=new Thread1(fl);
//		Thread1 t1=new Thread1(new Multiflier());
		
		Thread2 th2=new Thread2(fl);
		Thread t2=new Thread(th2);
//		Thread t2=new Thread(new Thread2(new Multiflier()));
		
		t1.start();
		t2.start();
		
	}

}
