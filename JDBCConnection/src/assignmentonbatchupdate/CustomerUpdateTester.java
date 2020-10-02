package assignmentonbatchupdate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import singletonclasspackage.SingleTonClassEx;

public class CustomerUpdateTester {

public static void main(String[] args) {
	ArrayList<Customer> custlist=new ArrayList<>();
	custlist.add(new Customer(1, "Amar", "9847885843"));
	custlist.add(new Customer(5, "Akbar", "9876358764"));
	custlist.add(new Customer(3, "Antony", "8775765763"));

	String sqlupdate="update customer set customername=?,phonenumber=? where id=?;";
	
	try(Connection conn=SingleTonClassEx.getInstance().getConnection();
	PreparedStatement prestmt=conn.prepareStatement(sqlupdate))
	{
		for(Customer cust:custlist)
		{
			prestmt.setString(1, cust.getName());
			prestmt.setString(2, cust.getPhoneno());
			prestmt.setInt(3, cust.getId());
			prestmt.addBatch();
		}
		int a[]=prestmt.executeBatch();
		for(int i:a)
		{
			if(i==1)
			{
				System.out.println(i+" row is updated");
			}
			else
			{
				System.out.println("There is one row which is mismatching to customer id, so can't update table");
			}
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
