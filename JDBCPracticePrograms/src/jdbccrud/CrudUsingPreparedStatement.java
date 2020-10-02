package jdbccrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUsingPreparedStatement {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/practicesql";
		String user = "root";
		String password = "xworkz";
		String sqlquerry = "update  customer set customername=? where id=?;";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement prestmt = conn.prepareStatement(sqlquerry)) 
		{
			prestmt.setString(1, "Vinayak");
			prestmt.setInt(2, 4);
		System.out.println(prestmt.executeUpdate()+" row is updated");	
			
		prestmt.setString(1, "Vishal");
		prestmt.setInt(2, 5);
	System.out.println(prestmt.executeUpdate()+" row is updated");	
		
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
