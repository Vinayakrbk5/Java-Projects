package transactionmanagementusingStatement;

public class TransactionExTester {

	public static void main(String[] args) {
		TransactionEx tran=new TransactionEx();
		tran.insertRecords("9848579873", 2000, "Vinayak", "v@gmail.com", "SBI", 786);
		
		System.out.println();
		
		tran.displayrecords();
	}

}
