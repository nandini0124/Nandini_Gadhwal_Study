package customer_db_connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerInterfaceImpliment implements CustomerInterfase {
	Connection con = CustomerConnection.getConnection();

	@Override
	public List<Customer> readAllCustomer() throws SQLException {
		List<Customer> list = new ArrayList<>();
		String sql = "select * from Customer";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			Customer c = new Customer();
			c.setCustomerid(rs.getInt(1));
			c.setCustomername(rs.getString(2));
			c.setCustomerlastname(rs.getString(3));
			c.setCustomerage(rs.getInt(4));
			c.setCustomeraddress(rs.getString(5));
			c.setCutomermono(rs.getInt(6));
			list.add(c);
		}
		return list;

	}

	@Override
	public Customer readcoustomerBYID(int id) {
		Customer c =new Customer();
		try {
		PreparedStatement ps =con.prepareStatement("select * from customer Where customerid=?");
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			c.setCustomerid(rs.getInt(1));
			c.setCustomername(rs.getString(2));
			c.setCustomerlastname(rs.getString(3));
			
		}
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
		return c;
	}

	@Override
	public int createcustomer(Customer cust) {
		int data = 0;
		try {
			PreparedStatement ps = con.prepareStatement("insert into Customer values (?,?,?,?,?,?)");
			ps.setInt(1, cust.getCustomerid());
			ps.setString(2, cust.getCustomername());
			ps.setString(3, cust.getCustomerlastname());
			ps.setInt(4, cust.getCustomerage());
			ps.setString(5, cust.getCustomeraddress());
			ps.setInt(6, cust.getCutomermono());
			data = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		return data;
	}

	@Override
	public boolean updatacustomer(Customer cust) {
		try {
			PreparedStatement ps = con.prepareStatement("update Customer set customername=? Where customerid=?");
			ps.setString(1, cust.getCustomername());
			ps.setInt(2, cust.getCustomerid());
			int i = ps.executeUpdate();
			if (i == 0) {
				return false;
			}
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}

		return true;
	}

	@Override
	public boolean deletcustomer(int id) {
		try {
		PreparedStatement ps = con.prepareStatement("delete from customer Where customerid=?");
		ps.setInt(1, id);
		int i =ps.executeUpdate();
		if(i==0) {
			return false;
			
		}
			
		} catch(Exception e) {
			System.out.println(e);
		}
			return true;
		
		}

	@Override
	public Customer readcustomerByIdAndName(int id, String name) {
		Customer c =new Customer();
		try {
		PreparedStatement ps =con.prepareStatement("select * from customer Where customerid=? and customername=?");
		ps.setInt(1, id);
		ps.setString(2, name);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			
			c.setCustomerid(rs.getInt(1));
			c.setCustomername(rs.getString(2));
			c.setCustomerlastname(rs.getString(3));
			c.setCustomerage(rs.getInt(4));
			c.setCustomeraddress(rs.getString(5));
			c.setCutomermono(rs.getInt(6));
		}
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
		return c;
	
	}

	@Override
	public List<Customer> readcustomerByFirstChar(String name) {
		List<Customer> list = new ArrayList<>();
		try {
		PreparedStatement ps = con.prepareStatement("select * FROM customer WHERE customername LIKE '"+name.charAt(0)+"%'");
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
			Customer c = new Customer();
			c.setCustomerid(rs.getInt(1));
			c.setCustomername(rs.getString(2));
			c.setCustomerlastname(rs.getString(3));
			c.setCustomerage(rs.getInt(4));
			c.setCustomeraddress(rs.getString(5));
			c.setCutomermono(rs.getInt(6));
			list.add(c);
		
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	
		
		return list;
	}

}

