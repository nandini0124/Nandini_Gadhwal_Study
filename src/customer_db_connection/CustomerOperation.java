package customer_db_connection;

import java.util.List;

import java.sql.SQLException;

public class CustomerOperation {

	public static void main(String[] args) {

		// read();
		// create();

		update();

		// delete();
		//readbyid();
		// readByIdAndName();
		//readByFirstChar();

	}

	private static void readByFirstChar() {
		CustomerInterfaceImpliment c = new CustomerInterfaceImpliment();
		List<Customer> list = c.readcustomerByFirstChar("a");
		for (Customer cd : list) {
			System.out.println(cd);
		}
	}

	private static void readByIdAndName() {
		CustomerInterfaceImpliment s = new CustomerInterfaceImpliment();
		Customer c = s.readcustomerByIdAndName(4, "aarti");
		System.out.println(c);
	}

	private static void readbyid() {
		CustomerInterfaceImpliment cust = new CustomerInterfaceImpliment();
		Customer c = cust.readcoustomerBYID(3);
		System.out.println(c);
	}

	private static void delete() {
		CustomerInterfaceImpliment cust = new CustomerInterfaceImpliment();
		boolean bol = cust.deletcustomer(1);
		if (bol) {
			System.out.println("Record id deleted");
		} else {
			System.out.println("Record is not deleted");
		}
	}

	private static void update() {
		CustomerInterfaceImpliment cust = new CustomerInterfaceImpliment();
		Customer c = new Customer();
		c.setCustomerid(7);
		c.setCustomername("krunali");
		boolean b = cust.updatacustomer(c);
		if (b) {
			System.out.println("Record is updated ");
		} else {
			System.out.println("Record is not updated");
		}
	}

	private static void create() {
		CustomerInterfaceImpliment cu = new CustomerInterfaceImpliment();
		Customer cust = new Customer();
		cust.setCustomerid(7);
		cust.setCustomername("vaishu");
		cust.setCustomerlastname("bhavre");
		cust.setCustomerage(18);
		cust.setCustomeraddress("ujjain");
		cust.setCutomermono(9364687);
		int data = cu.createcustomer(cust);
		if (data == 0) {
			System.out.println("record is not created ");
		} else {
			System.out.println("record is created");
		}
	}

	private static void read() throws SQLException {
		CustomerInterfaceImpliment cu = new CustomerInterfaceImpliment();
		List<Customer> listCustomer = cu.readAllCustomer();
		for (Customer c : listCustomer) {
			System.out.println(c);

		}
	}

}
