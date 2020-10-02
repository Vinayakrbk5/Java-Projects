package ThreadsExtendingThreadClass;

public class Thread1 extends Thread {
	Table tb;
	public Thread1(Table tb)
	{
		System.out.println("Printing table 6");
		this.tb=tb;
	}
//	@Override
//	public void run() {
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("4 * "+i+" = "+i*4);
//		}
//		
//	}
	@Override
	public void run() {
		tb.printTable(6);
		
	}

}
