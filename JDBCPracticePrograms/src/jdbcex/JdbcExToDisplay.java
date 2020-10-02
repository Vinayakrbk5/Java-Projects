package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExToDisplay {

		public static void main(String[] args) {
			String url="jdbc:mysql://localhost:3306/practicesql";
			String user="root";
			String password="xworkz";
			Connection conn=null;
			Statement stmt=null;
			ResultSet resultset=null;
			String str="select * from personaldetails";
			
			try {
			 conn=DriverManager.getConnection(url, user, password);
			 stmt=conn.createStatement();
			 resultset=stmt.executeQuery(str);
			 System.out.println("ID"+"\t\t"+"Name"+"\t\t"+"City"+"\t\t");
			 while(resultset.next())
			 {
				 System.out.print(resultset.getInt(1));
				 System.out.print("\t\t"+resultset.getString(2)+"\t\t");
				 System.out.println(resultset.getString(3));
			 }
			 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				
//					try {
//						if(conn!=null)
//						conn.close();
//						if(resultset!=null)
//							resultset.close();
//						if(stmt!=null)
//							stmt.close();
//						
//					} catch (SQLException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
			}
		}
	}

