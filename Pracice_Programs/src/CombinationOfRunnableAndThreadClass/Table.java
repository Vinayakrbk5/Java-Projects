package CombinationOfRunnableAndThreadClass;

public class Table {
	int num1;
	public synchronized void printTable(int n)
	{
		this.num1=n;
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for(int i=1;i<=10;i++)
		{
			System.out.println(num1+" * "+i+" = "+num1*i);
		}
		System.out.println();
	}

}
