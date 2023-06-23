package customer_db_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class CustomerConnection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_db_connection?characterEncoding=utf8",
					"root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return con;
	}

}
