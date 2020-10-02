package jdbccrudimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import constant.DBConstant;
import jdbccrud.CustomerOps;

public class Customeropsimpl implements CustomerOps {

//	 method to display the selected record from customer table
	@Override 
	public void displayselectedCustomer(int custid) { 
		Connection conn = null;
		Statement stmt = null;
		ResultSet result = null;
		String askQuerry = "Select * from Customer where id=" + custid + "";
		try {
			conn = DriverManager.getConnection(DBConstant.URL, DBConstant.USER, DBConstant.PASSWORD);
			stmt = conn.createStatement();
			result = stmt.executeQuery(askQuerry);

			System.out.println("Customer Detials of id =" + custid + " is :");
			System.out.println("CustomerId" + "\t" + "Customername" + "\t\t" + "Phonenumber");
			while (result.next()) {
//		    	if()
				int custnum = result.getInt(1); // we can give column name
				String custname = result.getString(2); // column name is not case sensitive
				String custnumber = result.getString(3);

//				System.out.print("Customer Id=" + custnum);
//				System.out.print(", Customer Name= " + custname);
//				System.out.print(", Phone Number= " + custnumber);
				System.out.print(custnum);
				System.out.print("\t\t" + custname + "\t\t");
				System.out.print(custnumber);
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (result != null)
					result.close();

				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

//	method to update customer table 
	@Override
	public void updateCustomerRecord(int id, String custname, String phonenum, int update) {
		try (Connection conn = DriverManager.getConnection(DBConstant.URL, DBConstant.USER, DBConstant.PASSWORD);
				Statement stmt = conn.createStatement()) {
			String sqlQuerry = "update customer set id='" + id + "',customername='" + custname + "',phonenumber='"
					+ phonenum + "' where id =" + update + ";";
			int result = stmt.executeUpdate(sqlQuerry);
			System.out.println("The " + result + " rows are updated here");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("After updating the new updated table is ");
		displayAllRecord();
	}

//	method to delete record from customer table
	@Override
	public void deleteCustomerRecord(int custid) {
		String sqlQuerry = "delete from  customer where id='" + custid + "'";
		try (Connection conn = DriverManager.getConnection(DBConstant.URL, DBConstant.USER, DBConstant.PASSWORD);
				Statement stmt = conn.createStatement()) {

			int result = stmt.executeUpdate(sqlQuerry);
			System.out.println(result + " row is deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("After deleting row the updated table is :");
		displayAllRecord();
	}

//	method to display all records from customer table
	@Override
	public void displayAllRecord() {
		try (Connection conn = DriverManager.getConnection(DBConstant.URL, DBConstant.USER, DBConstant.PASSWORD);
				Statement stmt = conn.createStatement();
				ResultSet result = stmt.executeQuery("select * from customer")) {
			System.out.println("CustomerId" + "\t" + "Customername" + "\t\t" + "Phonenumber");
			while (result.next()) {
				int custnum = result.getInt(1); // we can give column name
				String custname = result.getString(2); // column name is not case sensitive
				String custnumber = result.getString(3);

//				System.out.print("Customer id:" + custnum);
//				System.out.print("  Customer Name : " + custname);
//				System.out.print("  Phone Number " + custnumber);
				System.out.print(custnum);
				System.out.print("\t\t" + custname + "\t\t");
				System.out.print(custnumber);
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//	method to insert record into customer table
	@Override
	public void insertRecord(int custid, String custname, String phone) {
		String insertrecord = "insert into customer values ('" + custid + "','" + custname + "','" + phone + "');";
		try (Connection conn = DriverManager.getConnection(DBConstant.URL, DBConstant.USER, DBConstant.PASSWORD);
				Statement stmt = conn.createStatement()) {
			int result = stmt.executeUpdate(insertrecord);
			System.out.println(result + " record is inserted into Customer Table");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("After inserting the updated Table is :");
		displayAllRecord();
	}

}
