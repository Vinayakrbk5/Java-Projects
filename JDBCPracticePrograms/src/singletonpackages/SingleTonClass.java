package singletonpackages;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	import constants.DBConstants;

	public class SingleTonClass {
		private static  SingleTonClass instance=new SingleTonClass();
		Connection conn=null;
		
		private SingleTonClass() {}
		
		public static SingleTonClass getInstance()
		{
//			if(instance== null)
//			{
//				return instance;
//			}
			return instance;
		}
		
		public Connection getConnection()
		{
			if(conn==null)
			{
				try {
					return conn = DriverManager.getConnection(DBConstants.URL,DBConstants.USER,DBConstants.PASSWORD);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return conn;
		}

}
