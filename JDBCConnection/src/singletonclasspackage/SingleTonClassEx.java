package singletonclasspackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import constant.DBConstant;

public class SingleTonClassEx {
	private static SingleTonClassEx instance = null;

	private SingleTonClassEx() {
	}

	public static SingleTonClassEx getInstance() {
		if (instance == null) {
			instance = new SingleTonClassEx();
		}
		return instance;
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			if (conn == null)
				return conn = DriverManager.getConnection(DBConstant.URL, DBConstant.USER, DBConstant.PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

	}
}
