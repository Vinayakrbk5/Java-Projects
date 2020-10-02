package CombinationOfRunnableAndThreadClass;

public class Thread1 extends Thread {
	Table tb;
	int num;
	public Thread1(Table tb,int n) {
		
		this.tb=tb;
		this.num=n;
		System.out.println("Printing table "+num);
		
	}
	@Override
	public void run() {
		tb.printTable(num);
	}

}
