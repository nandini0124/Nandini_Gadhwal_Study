package databaseconnection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Emp_Read_Data_From_DB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
           Connection con =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/nandini?characterEncoding=utf8", "root",
					"root");

		} catch (Exception e) {
			e.printStackTrace();

		}
		PreparedStatement pr =con.prepareStatement("Select * from employee");	
		ResultSet rs = pr.executeQuery();
		while (rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getInt(6)+" "+rs.getString(7)+" "+rs.getInt(8));
			
		}
		con.close();
		pr.close();
		rs.close();
		}

}
