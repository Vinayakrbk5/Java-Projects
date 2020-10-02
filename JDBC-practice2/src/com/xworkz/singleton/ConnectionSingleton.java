package com.xworkz.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.connectionparameter.DBConstants;

public class ConnectionSingleton {

	private static Connection conn;

	public static Connection getConnection() {
		try {
			if (conn == null)
				return conn = DriverManager.getConnection(DBConstants.URL, DBConstants.USER, DBConstants.PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void closeConnection() {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
