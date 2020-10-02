package ThreadsExtendingThreadClass;

public class Table {
	int num;
	public synchronized void printTable(int n)
	{
		this.num=n;
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}

}
