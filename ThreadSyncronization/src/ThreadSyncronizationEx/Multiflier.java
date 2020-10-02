package ThreadSyncronizationEx;

public class Multiflier {
	
	public static synchronized void Multifly(int num)
	{
		System.out.println(" Start :Thread  "+Thread.currentThread().getName());
		
		 {
			for(int i=1;i<=10;i++)
		{
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(i*num);
		}
//		}
		System.out.println(" End : Thread name of multifly 16 "+Thread.currentThread().getName());
	}
	}
}
