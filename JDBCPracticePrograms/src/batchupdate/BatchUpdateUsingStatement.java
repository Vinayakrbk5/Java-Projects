package batchupdate;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import singletonpackages.SingleTonClass;

public class BatchUpdateUsingStatement {

	public void batchUpdate(int[] a)
	{
	Connection conn=SingleTonClass.getInstance().getConnection();
	try(Statement stmt=conn.createStatement())
	{
		for(int i:a) {
		stmt.addBatch("delete from customer where id="+i);
		}
		int[] x=stmt.executeBatch();
		int count=0;
		for(int j:x)
		{
			count+=j;
			if(count==1&&j==1)
			System.out.println(j+" one row is deleted");
			else if(count>1&&j==1)
				System.out.println("now "+count+" rows are deleted");
			else
				System.out.println("can't delete because id is not matching");
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
