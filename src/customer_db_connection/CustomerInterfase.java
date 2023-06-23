package customer_db_connection;

import java.sql.SQLException;
import java.util.List;

public interface CustomerInterfase {
	public List<Customer> readAllCustomer() throws SQLException;

	public Customer readcoustomerBYID(int id);

	public int createcustomer(Customer cust);

	public boolean updatacustomer(Customer cust);

	public boolean deletcustomer(int id);

	public Customer readcustomerByIdAndName(int id, String name);

	public List readcustomerByFirstChar(String name);

}
