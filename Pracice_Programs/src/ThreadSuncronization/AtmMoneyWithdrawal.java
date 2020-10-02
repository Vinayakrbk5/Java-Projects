package ThreadSuncronization;

public class AtmMoneyWithdrawal {
	int tamount=0;
	int n=0;
	
	public synchronized void tellToCustomer(int amount)
	{
		tamount=amount;
		if(tamount>n)
		{
			System.out.println("Money available in the ATM is :"+tamount);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Money deposited in the ATM is "+amount);
		tamount=tamount+amount;
		System.out.println("Total Money available in the ATM after deposit is :"+tamount);
		notify();
	}
	
	public  synchronized void askToBank(int num)
	{
		System.out.println("Money available in the ATM before Withdrawal is :"+tamount);
		n=num;
		if(tamount<n)
		{
			int no=num;
			System.out.println("Money is not available to the "+Thread.currentThread().getName()+" in the ATM to withdraw "+num+" amount");
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				num=no;
			}
			
		}
		System.out.println("Amount withdrawn by "+Thread.currentThread().getName()+" is :"+num);
		tamount=tamount-num;
		System.out.println("Amount remained in ATM after withdrawal is :"+tamount);
		
	}

}
