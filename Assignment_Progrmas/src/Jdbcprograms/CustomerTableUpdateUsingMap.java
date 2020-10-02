package Jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

public class CustomerTableUpdateUsingMap {
	static String url = "jdbc:mysql://localhost:3306/practicesql";
	static String user = "root";
	static String password = "xworkz";

	public static void display() {
		String sqldisplay = "select * from customer";
		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			try (PreparedStatement prestmt = conn.prepareStatement(sqldisplay);
					ResultSet resset = prestmt.executeQuery()) {

				System.out.println("Customer ID" + "\t" + "Customer Name" + "\t" + "Phone Number");
				while (resset.next()) {
					System.out.print(resset.getInt(1));
					System.out.print("\t\t" + resset.getString(2) + "\t");
					System.out.println(resset.getString(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		LinkedHashMap<Customer ,Integer> arrlist = new LinkedHashMap<>();
		arrlist.put(new Customer(3, "Amar", "\t" + "9867543265"),1);
		arrlist.put(new Customer(5, "Akbar", "\t" + "7843269658"),2);
		arrlist.put(new Customer(8, "Antony", "\t" + "9554534976"),3);
//		System.out.println(arrlist);
		System.out.println("Customer Table before Updating");
		display();
		System.out.println();
		
		Collection<Customer> key=arrlist.keySet();

		String sqlupdate = "update customer set customername=?,phonenumber=? where id=?;";
		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			try (PreparedStatement prestmt = conn.prepareStatement(sqlupdate)) {
				int count = 0;
				for (Customer cust : key) {
					prestmt.setString(1, cust.getName());
					prestmt.setString(2, cust.getPhoneno());
					prestmt.setInt(3, cust.getId());
					int res = prestmt.executeUpdate();
//					System.out.println(res);
					++count;
					if ((count < 2) && (res == 1)) {
						System.out.println(count + " row is updated");
					} else if ((count >= 2 && res == 1)) {
						System.out.println("now " + count + " rows are updated");
					} else if (res == 0) {
						System.out.println("Customer id " + cust.getId()
								+ " is not matching to customer table so we cannot update details");
					}

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("Customer Table after Updating");
		display();
	}
}
