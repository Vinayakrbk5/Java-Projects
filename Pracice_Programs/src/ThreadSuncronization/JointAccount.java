package ThreadSuncronization;

public class JointAccount {
	int minamount =5000;
	
	public synchronized void get1(int amount)
	{
		if(minamount<1000)
		{
			System.out.println("Sorry "+Thread.currentThread().getName()+" You cannot withdraw the Amount");
			System.out.println("Since your balance is less than 1000 rupees");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		minamount=minamount-amount;
		System.out.println("Amount withdrawn by "+Thread.currentThread().getName()+" is :"+amount);
		System.out.println("Remained Amount is :"+minamount);
	}
	
	}
