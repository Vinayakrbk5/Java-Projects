package ThreadsImplementingRunnableInterface;

public class PyramidUsingLamdaExpression {
	public static void main(String[] args) {
		Runnable r1=new Runnable() {

			@Override
			public synchronized void run() {
				for(int i=0;i<6;i++)
				{
					for(int j=0;j<i+1;j++)
					{
					System.out.print(" * ");
					}
					System.out.println();
				}
				
			}

		};
		Thread t1=new Thread(r1);
		t1.start();
		
		Runnable r2=()->{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			for(int i=0;i<6;i++)
			{
//				try {
//					Thread.currentThread().sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				};
				for(int j=0;j<6-i;j++)
				{
				System.out.print(" * ");
				}
				System.out.println();
			}
		};
			Thread t2=new Thread(r2);
			t2.start();
		
					

	}
			
}

