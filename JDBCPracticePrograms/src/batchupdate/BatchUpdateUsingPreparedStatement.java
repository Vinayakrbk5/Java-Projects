package batchupdate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import CrudOpOnCustomerTable.Customer;
import singletonpackages.SingleTonClass;

public class BatchUpdateUsingPreparedStatement {

	public void batchUpdate(ArrayList<Customer> custlist)
		{
		Connection conn=SingleTonClass.getInstance().getConnection();
		String updatequery="Update customer set Customername=?,phonenumber=? where id=?;";
		
		try(PreparedStatement prestmt=conn.prepareStatement(updatequery))
		{
			for(Customer cust:custlist)
			{
				prestmt.setString(1, cust.getName());
				prestmt.setString(2, cust.getPhone());
				prestmt.setInt(3, cust.getId());
				prestmt.addBatch();
			}
			int a[]=prestmt.executeBatch();
			int count=0;
			for(int i:a)
			{
				count+=i;
				if(count==1&&i==1)
				System.out.println(i +" row is updated");
				else if(count>1&&i==1)
					System.out.println("now "+count+" rows are updated");
				else
					System.out.println("Can't update because id is not matching");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
