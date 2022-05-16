package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	static Connection conn;
	
	static {
		try {
			Class.forName("org.h2.Driver");
			
		}catch (ClassNotFoundException e){
			
			e.printStackTrace();
		}
	}
	static Connection makeConnection() throws SQLException{
		String connectionURL = "jdbc:h2:tcp://localhost/~/test";
		String username = "sa";
		String password = "";
		if(conn == null) {
			conn = DriverManager.getConnection(connectionURL, username, password);
		}
		return conn;
	}
}
