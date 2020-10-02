package batcjupdate;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import jdbccrudimpl.Customer;
import singletonclasspackage.SingleTonClassEx;

public class BatchUpdate {

	public void batchupdate(ArrayList<Customer> custlist) {
		String sqldrop = "drop table if exists customer;";
		String sqlcreate = "create table customer (" + "id int, Customername varchar(50),phonenumber varchar(50));";
		String sqlupdate = "update customer set customername='" + "Goa" + "',phonenumber='" + "983475984363"
				+ "'where id=11;";
		String sqldelete = "delete from customer where id=12;";

//		String sqlinsert = "insert into customer values " + "(1,'" + "Narendra Modi" + "','" + "873654848" + "'),"
//				+ "(2,'" + "The Rock" + "','" + "363559447" + "')," + "(3,'" + "John Cena" + "','" + "9873645454"
//				+ "')," + "(4,'" + "Amith Sha" + ',' + "9376547474" + "')," + "(5,'" + "Ramnath Kovind" + ','
//				+ "89065424252" + "');";

		try (Connection conn = SingleTonClassEx.getInstance().getConnection();
				Statement stmt = conn.createStatement()) {

			stmt.addBatch(sqldrop); // to drop table if exists
			stmt.addBatch(sqlcreate); // to create new table

			for (Customer customer : custlist) {
				String sqlinsert = "insert into customer values('" + customer.getCustid() + "','"
						+ customer.getCustname() + "','" + customer.getCustphone() + "');";
				stmt.addBatch(sqlinsert);
			}

			stmt.addBatch(sqlupdate); // to update table
			stmt.addBatch(sqldelete); // to delete record

			int a[] = stmt.executeBatch();
			for (int i : a) {
				System.out.println("Result :" + i);
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
