package transactionmanagementusingPreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import singletonpackages.SingleTonClass;

public class TranactionEx1 implements TransactionOpsInterface {

	@Override
	public void insertRecord(String phone, int amount, String name, String email, String bank, int cvv) {
		String insertquery1 = "insert into Recharge_info(phoneno,amount) values(?,?);";
		String insertquery2 = "insert into Customer_info values (?,?,?,?);";

		Connection conn = SingleTonClass.getInstance().getConnection();

		try (PreparedStatement prestmt = conn.prepareStatement(insertquery1);
				PreparedStatement prestmt2 = conn.prepareStatement(insertquery2)) {
			
			conn.setAutoCommit(false);
			prestmt.setString(1, phone);
			prestmt.setInt(2, amount);
			int res = prestmt.executeUpdate();
			System.out.println(res + " row is inserted to Recharge_info table");

			prestmt2.setString(1, name);
			prestmt2.setString(2, email);
			prestmt2.setString(3, bank);
			prestmt2.setInt(4, cvv);
			int result = prestmt2.executeUpdate();
			System.out.println(result + " row is inserted to Customer_info table");
			conn.commit();

		} catch (SQLException e) {

			try {
				conn.rollback();
				System.out.println("can't insert record due to an Exception");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

}
