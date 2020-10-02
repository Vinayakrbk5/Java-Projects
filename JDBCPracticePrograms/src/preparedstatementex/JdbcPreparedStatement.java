package preparedstatementex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPreparedStatement {

	public void display() {

		String url = "jdbc:mysql://localhost:3306/practicesql";
		String user = "root";
		String password = "xworkz";
		String sqlquerry = "select * from customer;";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement prestmt = conn.prepareStatement(sqlquerry)) {
//			prestmt.setInt(1, 2);
//			prestmt.setInt(2, 1);
			try (ResultSet resset = prestmt.executeQuery()) {
				System.out.println("ID" + "\t" + "Name" + "\t\t" + "City");
				while (resset.next()) {
					System.out.print(resset.getInt(1));
					System.out.print("\t" + resset.getString(2) + "\t");
					System.out.println(resset.getString(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			System.out.println();
//			prestmt.setInt(1, 1);
//			prestmt.setInt(2, 2);
//			try (ResultSet resset1 = prestmt.executeQuery()) {
//
//				System.out.println("ID" + "\t" + "Name" + "\t\t" + "City");
//				while (resset1.next()) {
//					System.out.print(resset1.getInt(1));
//					System.out.print("\t" + resset1.getString(2) + "\t");
//					System.out.println(resset1.getString(3));
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}