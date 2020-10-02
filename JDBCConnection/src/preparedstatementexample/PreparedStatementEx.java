package preparedstatementexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import constant.DBConstant;

public class PreparedStatementEx {
	public static void main(String[] args) {
		String sqlquerry = "Select * from customer where id=?";

		try (Connection conn = DriverManager.getConnection(DBConstant.URL, DBConstant.USER, DBConstant.PASSWORD);
				PreparedStatement prestmt = conn.prepareStatement(sqlquerry)) {
			prestmt.setInt(1, 2);

			try (ResultSet resultset = prestmt.executeQuery()) {

				while (resultset.next()) {
					System.out.print("Customer ID : " + resultset.getInt(1));
					System.out.print("  Customer Name: " + resultset.getString(2));
					System.out.println("  Customer Phone: " + resultset.getString(3));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}
}