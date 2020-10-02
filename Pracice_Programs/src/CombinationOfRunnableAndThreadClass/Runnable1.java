package CombinationOfRunnableAndThreadClass;

public class Runnable1 implements Runnable {
	int num;
	Table tb;
	public Runnable1(Table tb,int n)
	{
		this.tb=tb;
		this.num=n;
		System.out.println("Printing table "+num);
	}
	@Override
	public void run() {
		tb.printTable(num);
	}

}
