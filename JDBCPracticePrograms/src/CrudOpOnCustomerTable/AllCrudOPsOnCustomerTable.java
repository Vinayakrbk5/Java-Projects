package CrudOpOnCustomerTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import constants.DBConstants;

public class AllCrudOPsOnCustomerTable {

	public static void main(String[] args) {
		ToDispayCustomerRecord obj=new ToDispayCustomerRecord();
	
		String sqldroptable = "Drop table if exists customer;";
		String sqlcreatetb = "create table customer (id int, Customername varchar(50),phonenumber varchar(50));";
		String sqlinsert = "insert into customer values \r\n" + "(1,'Narendra Modi','873654848'),"
				+ "(2,'The Rock','363559447'),(3,'John Cena','9873645454'),"
				+ "(4,'Amith Shah','9376547474'),(5,'Ramnath Kovind','89065424252');";

		String sqlreadtable = "Select * from customer;";
		String sqlupdate="update customer set customername=? where id=?;";
		String sqldelete="delete from customer where id =?;";
		ResultSet resset = null;
		
		try (Connection conn = DriverManager.getConnection(DBConstants.URL, DBConstants.USER, DBConstants.PASSWORD)) {
			// code to Drop Customer Table if exists
			PreparedStatement prestmt0 = conn.prepareStatement(sqldroptable);
			prestmt0.executeUpdate(sqldroptable);
			System.out.println("Customer Table is Dropped Successfully");
			prestmt0.close();
			System.out.println();

			// code to Create new Customer Table
			PreparedStatement prestmt = conn.prepareStatement(sqlcreatetb);
			prestmt.executeUpdate();
			System.out.println("new table is created Successfully");
			prestmt.close();
			System.out.println();

			// code to insert records into customer table
			PreparedStatement prestmt1 = conn.prepareStatement(sqlinsert);
			prestmt1.executeUpdate();
			System.out.println("Records are inserted successfully");
			prestmt1.close();
			System.out.println();

			// code to read all records from customer table
			PreparedStatement prestmt2 = conn.prepareStatement(sqlreadtable);
			resset = prestmt2.executeQuery();
			System.out.println("Customers records are : ");
			System.out.println("ID" + "\t\t" + "Name" + "\t\t\t" + "PhoneNumber");
			while (resset.next()) {
				System.out.print(resset.getInt(1));
				System.out.print("\t\t" + resset.getString(2) + "\t\t");
				System.out.println(resset.getString(3));
			}
			prestmt2.close();
			System.out.println();
			
			// code to update customer table
			PreparedStatement prestmt3=conn.prepareStatement(sqlupdate);
			prestmt3.setString(1, "Vinayak"+"\t");
			prestmt3.setInt(2, 4);
			System.out.println(prestmt3.executeUpdate()+" row is updated successfully");
			prestmt3.close();
			System.out.println("New updated Customer Table is :");
			obj.displayRecords();
			System.out.println("");
			prestmt3.close();
			System.out.println();
			
			//code to delete record from Customer table
			
			PreparedStatement prestmt4=conn.prepareStatement(sqldelete);
			prestmt4.setInt(1, 2);
			System.out.println(prestmt4.executeUpdate()+" row is deleted successfully");
			System.out.println("New updated table is :");
			obj.displayRecords();
			prestmt4.close();
			System.out.println();
		} catch (SQLException e) {
			try {
				if (resset != null)
					resset.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

	}
}
