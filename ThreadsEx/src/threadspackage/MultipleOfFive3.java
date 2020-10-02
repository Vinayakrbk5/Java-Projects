package threadspackage;

public class MultipleOfFive3  implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread MultipleOfFive1:"+Thread.currentThread().getName());
		for(int i=11;i<=15;i++)
		{
			System.out.println(i * 5);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("MultipleOfFive3 try catch block");
			}
		}
		System.out.println("Ending MultipleOfFive3");
	}

}
