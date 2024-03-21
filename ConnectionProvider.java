package studdentApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	static Connection con = null;
	
	public static Connection connectionCreate() {
		
		String url = "jdbc:mysql://localhost:3306/student_manage";
		
		String userName = "root";
		
		String password = "root";
		
		try {
			
			con = DriverManager.getConnection(url, userName, password);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return con;
	}
}
