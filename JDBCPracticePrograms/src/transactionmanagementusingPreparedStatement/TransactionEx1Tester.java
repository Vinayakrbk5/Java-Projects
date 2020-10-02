package transactionmanagementusingPreparedStatement;

public class TransactionEx1Tester {

	public static void main(String[] args) {
		TranactionEx1 trans=new TranactionEx1();
		trans.insertRecord("9093898749", 1000, "Vishal", "Vi@gmail.com", "ICICI", 846);
	}
}
