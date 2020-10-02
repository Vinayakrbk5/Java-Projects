package assignmentontransaction;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import assignmentonbatchupdate.Customer;
import singletonclasspackage.SingleTonClassEx;

public class CustomerUpdateUsingTransaction {

	public static void main(String[] args) {
		ArrayList<Customer> custlist = new ArrayList<>();
		custlist.add(new Customer(1, "Amar", "9847885843"));
		custlist.add(new Customer(5, "Akbar", "9876358764"));
		custlist.add(new Customer(6, "Antony", "8775765763"));

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = SingleTonClassEx.getInstance().getConnection();
			stmt = conn.createStatement();
			conn.setAutoCommit(false);
			for (Customer cust : custlist) {
				String sqlinsert = "insert into customer values(" + cust.getId() + ",'" + cust.getName() + "','"
						+ cust.getPhoneno() + "');";

				stmt.addBatch(sqlinsert);
			}
			int[] a = stmt.executeBatch();
			int count = 0;
			for (int i : a) {
				count=count+i;
				if(count<2)
				{
				System.out.println(count + " row is inserted");
				}
				else
				{
					System.out.println("now "+count+" rows are inserted");
				}
			}

			conn.setAutoCommit(true);

		} catch (SQLException e) {

			System.out.println("Rolling back due to an exception");
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
