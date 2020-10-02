package CrudOpOnCustomerTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import constants.DBConstants;

public class ToDispayCustomerRecord {
	public void displayRecords() {
		String sqlreadtable = "select * from Customer;";
		try (Connection conn = DriverManager.getConnection(DBConstants.URL, DBConstants.USER, DBConstants.PASSWORD);
				PreparedStatement prestmt2 = conn.prepareStatement(sqlreadtable);
				ResultSet resset = prestmt2.executeQuery()) {
//			System.out.println("Customers records are : ");
			System.out.println("ID" + "\t\t" + "Name" + "\t\t\t" + "PhoneNumber");
			while (resset.next()) {
				System.out.print(resset.getInt(1));
				System.out.print("\t\t" + resset.getString(2) + "\t\t");
				System.out.println(resset.getString(3));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
