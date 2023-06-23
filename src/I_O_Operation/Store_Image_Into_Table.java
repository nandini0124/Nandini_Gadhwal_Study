package I_O_Operation;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import customer_db_connection.CustomerConnection;

public class Store_Image_Into_Table {
	

	public static void main(String[] args) {
		Connection con = CustomerConnection.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("insert into imageinsert values(?,?)");
			FileInputStream fs = new FileInputStream("D://nandini.jpg");
			ps.setInt(1, 1);
			ps.setBinaryStream(2, fs);
			int i = ps.executeUpdate();
			System.out.println(i);
		}catch(IOException | SQLException e) {
			System.out.println(e);
		}
		
		
	}

}
