package CrudOpOnCustomerTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;

import constants.DBConstants;

public class InsertCustomerImplTester {

public static void main(String[] args) {
	LinkedList<Customer> llist=new LinkedList<>();
	llist.add(new Customer(7,"Manu","988736498"));
	llist.add(new Customer(8, "Ashish", "986245635"));
	llist.add(new Customer(9, "Shrikanth", "897765288"));
	
	String sqlquerry="insert into customer values(?,?,?);";
	try(Connection conn=DriverManager.getConnection(DBConstants.URL, DBConstants.USER, DBConstants.PASSWORD))
	{
		int count=0;
		PreparedStatement prestmt=conn.prepareStatement(sqlquerry);
		for(Customer customer:llist)
		{
			prestmt.setInt(1, customer.getId());
			prestmt.setString(2, customer.getName());
			prestmt.setString(3, customer.getPhone());
		prestmt.executeUpdate();
		count+=1;
		if(count<2) {
		System.out.println("now "+count+" row is updated");
		}else
		{
			System.out.println("now "+count+" rows are updated");
		}
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
