package jdbccrudimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import constant.DBConstant;

public class PreparedStmtUsingList {

	public static void main(String[] args) {
		ArrayList<Customer> custlist = new ArrayList<>();
		custlist.add(new Customer(10, "Karnataka", "9876543245"));
		custlist.add(new Customer(11, "Kerala", "7867485784765"));
		custlist.add(new Customer(12, "Maharastra", "984636354745"));

		System.out.println(custlist);

		try (Connection conn = DriverManager.getConnection(DBConstant.URL, DBConstant.USER, DBConstant.PASSWORD)) {
			String sqlqr = "insert into customer values (?,?,?);";

			try (PreparedStatement prestmt = conn.prepareStatement(sqlqr)) {
				int count=0;
				for (Customer customer : custlist) {
					prestmt.setInt(1, customer.getCustid());
					prestmt.setString(2, customer.getCustname());
					prestmt.setString(3, customer.getCustphone());
					prestmt.executeUpdate();
					System.out.println((++count) + " row is updated");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
