package threadspackage;

public class ThreadSleepEx {
	public static void main(String[] args) {
		System.out.println("Main Thread:"+Thread.currentThread().getName());
//		MultipleOfFive1 t1=new MultipleOfFive1();
//		t1.start();
//		
//		MultipleOfFive2 t2=new MultipleOfFive2();
//		t2.start();
//		
//		Thread t3=new Thread(new  MultipleOfFive3());
//		t3.start();
		
		Thread t1=new Thread() {
			public void run() {
				System.out.println("Thread MultipleOfFive1:"+Thread.currentThread().getName());
				for(int i=1;i<6;i++)
				{
					System.out.println(i * 5);
//					try {
//						Thread.sleep(2000);
//					} catch (InterruptedException e) {
//						System.out.println("MultipleOfFive1 try catch block");
//					}
				}
				System.out.println("Ending MultipleOfFive1");
			} 
		};
		t1.start();
		
		Thread t2=new Thread() {
			public void run() {
				System.out.println("Thread MultipleOfFive2:"+Thread.currentThread().getName());
				for(int i=6;i<11;i++)
				{
					System.out.println(i * 5);
//					try {
//						Thread.sleep(2000);
//					} catch (InterruptedException e) {
//						System.out.println("MultipleOfFive2 try catch block");
//					}
				}
				System.out.println("Ending MultipleOfFive2");
			} 
		};
		t2.start();
		
//		Thread t3=new Thread() {
//			public void run() {
//				System.out.println("Thread MultipleOfFive1:"+Thread.currentThread().getName());
//				for(int i=11;i<=15;i++)
//				{
//					System.out.println(i * 5);
//					try {
//						Thread.sleep(2000);
//					} catch (InterruptedException e) {
//						System.out.println("MultipleOfFive1 try catch block");
//					}
//				}
//				System.out.println("Ending MultipleOfFive3");
//			} SS
//		};
//		t3.start();
		
		 Runnable r33=()->{
			System.out.println("Thread MultipleOfFive1:"+Thread.currentThread().getName());
			for(int i=11;i<=15;i++)
			{
				System.out.println(i * 5);
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					System.out.println("MultipleOfFive1 try catch block");
//				}
			}
			System.out.println("Ending MultipleOfFive3");
		}; 
		Thread t33=new Thread(r33);
		t33.start();
		System.out.println("End Main :");
	}
}
	
