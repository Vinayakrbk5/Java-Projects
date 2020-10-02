package threadspackage;

public class MultipleOfFive2 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread MultipleOfFive1:"+Thread.currentThread().getName());
		for(int i=6;i<11;i++)
		{
			System.out.println(i * 5);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("MultipleOfFive2 try catch block");
			}
		}
		System.out.println("Ending MultipleOfFive2");
	}

}
