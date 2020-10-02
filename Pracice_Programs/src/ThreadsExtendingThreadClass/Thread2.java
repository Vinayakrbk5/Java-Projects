package ThreadsExtendingThreadClass;

public class Thread2 extends Thread{
	Table tb;
	Thread2(Table tb)
	{
		System.out.println("Printing table 25" );
		this.tb=tb;
	}
//	@Override
//	public void run() {
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("15 * "+i+" = "+i*15);
//		}
//	}
	
	@Override
	public void run() {
//		Thread.currentThread().suspend();
		tb.printTable(25);
//		System.out.println(Thread.currentThread().yield(););
	}

}
