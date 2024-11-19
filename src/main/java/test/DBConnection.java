package test;
import java.sql.*;
public class DBConnection {
	private static Connection con =null;
	private DBConnection() {}
		static 
		{
			try {
				Class.forName(DBInfo.driver);
				DriverManager.getConnection(DBInfo.dbURL,DBInfo.uName,DBInfo.pWord);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		public static Connection get() {
			return con;
		}
	}


