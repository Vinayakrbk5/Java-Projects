package Jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayTableByUserInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the id to display customer details:");
		int userid = scan.nextInt();
		String url = "jdbc:mysql://localhost:3306/practicesql";
		String user = "root";
		String password = "xworkz";
		String sqlquerry = "select * from Customer where id=?;";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement prestmt = conn.prepareStatement(sqlquerry)) {
			prestmt.setInt(1, userid);
			int count = 0;
			try (ResultSet resset = prestmt.executeQuery()) {
				while (resset.next()) {
					System.out.println("Customer Details whose id is " + userid + " is :");
					System.out.println();
					System.out.println("Customer Id" + "\t" + "Customer Name" + "\t" + "Phone Number");
					System.out.print(resset.getInt(1));
					System.out.print("\t\t" + resset.getString(2) + "\t");
					System.out.println(resset.getString(3));
					count += 1;
				}
				if (count == 0) {
					System.out.println("Customer record is not found for customer id =" + userid);
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
}
