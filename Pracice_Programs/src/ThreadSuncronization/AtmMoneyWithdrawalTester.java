package ThreadSuncronization;

public class AtmMoneyWithdrawalTester {
	public static void main(String[] args) {
		AtmMoneyWithdrawal atm=new AtmMoneyWithdrawal();
		
		Thread t=new Thread() {
			public void run() {
				Thread.currentThread().setName("Manager");
				atm.tellToCustomer(500000);
			}
		};
		t.start();
		
		Thread t1=new Thread() {
			public void run() {
				Thread.currentThread().setName("Vishal");
				atm.askToBank(25000);
			}
		};
		t1.start();
		
		Thread t2=new Thread() {
			public void run() {
				Thread.currentThread().setName("Vinayak");
				atm.askToBank(220000);
			}
		};
		t2.start();
		
		Thread t3=new Thread() {
			public void run() {
				Thread.currentThread().setName("Vinod");
				atm.askToBank(225000);
			}
		};
		t3.start();
		
		Thread t4=new Thread() {
			public void run() {
				Thread.currentThread().setName("Vijay");
				atm.askToBank(150000);
			}
		};
		t4.start();
	}

}
