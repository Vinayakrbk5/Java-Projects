package preparedstatementexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import constant.DBConstant;

public class ReUsePreparedStmt {
	public static void main(String[] args) {
		try
		(Connection conn=DriverManager.getConnection(DBConstant.URL, DBConstant.USER, DBConstant.PASSWORD)){
		String sqlqr="update customer set customername=? where id=?";
				
				try(PreparedStatement prestmt=conn.prepareStatement(sqlqr)){
					prestmt.setString(1, "Bharath");
					prestmt.setInt(2, 4);
					int res=prestmt.executeUpdate();
					System.out.println(res +" row is updated");
				}
				 catch (SQLException e) {
						e.printStackTrace();
					}
				try(PreparedStatement prestmt=conn.prepareStatement(sqlqr)){
					prestmt.setString(1, "Sharath");
					prestmt.setInt(2, 2);
					int res=prestmt.executeUpdate();
					System.out.println("again "+res +" row is updated");
				}
				 catch (SQLException e) {
						e.printStackTrace();
					}
				}
	 catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

