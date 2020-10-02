package joinsex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import singletonpackages.SingleTonClass;

public class Joinsex {

	public static void main(String[] args) {
		Connection conn=SingleTonClass.getInstance().getConnection();
		String joinquery="select * from x left join y on col1=col2 union select * from x right join y on col1=col2";
		try(Statement stmt=conn.createStatement())
		{
			System.out.println("Joining two table using joins");
			System.out.println("Column1"+"\t"+"Column2");
			ResultSet res=stmt.executeQuery(joinquery);
			while(res.next())
			{
				System.out.print(res.getInt(1)+"\t");
				System.out.println(res.getInt(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
