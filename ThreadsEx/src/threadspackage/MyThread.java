package threadspackage;

public class MyThread extends Thread{
	@Override
	public void run() {
//		System.out.println("New Thread created :"+Thread.currentThread().getName());
		System.out.println("Thread Id:"+Thread.currentThread().getId());
//		Thread.currentThread().setName("Vinayak");  // setting Thread name
		System.out.println("New Thread created :"+Thread.currentThread().getName());
		for(int i=0;i<10;i++)
		{
			System.out.print(i+" ");
		}

	}

}
