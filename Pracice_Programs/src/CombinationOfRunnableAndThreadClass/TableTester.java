package CombinationOfRunnableAndThreadClass;

public class TableTester {
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable1(new Table(),28));
		t1.start();
		
		Thread t2=new Thread(new Thread1(new Table(),35));
		t2.start();
		
	}

}
