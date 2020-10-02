package EncapsulationConcept;

public class BankAcctTester {

	public static void main(String[] args) {
		BankAcct sbi=new BankAcct();
		sbi.displayacctbalance();
		sbi.deposit(5000);
		sbi.displayacctbalance();
		sbi.deposit(-2000);
		sbi.displayacctbalance();
		sbi.deposit(-9000);
		sbi.displayacctbalance();
	}

}
