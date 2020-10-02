package EncapsulationConcept;

public class BankAcct {
	private int acctid;
	private double acctbalance=1000;
	
	public void displayacctbalance()
	{
		System.out.println("The account balance is :"+acctbalance);
	}
	public void deposit(double amount)
	{
		if (acctbalance>0)     // if() is used for safety purpose
		{
		acctbalance+=amount;
	}else
	{
		System.out.println("Wrong information");
	}
	
	}
}
