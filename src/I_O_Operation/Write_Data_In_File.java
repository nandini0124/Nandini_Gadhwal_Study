package I_O_Operation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import customer_db_connection.Customer;
import customer_db_connection.CustomerInterfaceImpliment;


public class Write_Data_In_File {
	public static void main(String[] args) throws IOException, SQLException {
		
		CustomerInterfaceImpliment cu =new CustomerInterfaceImpliment();
		List<Customer> listCustomer = cu.readAllCustomer();
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		
		try {
			fw=new FileWriter("D://Customer.txt",true);
			bw=new BufferedWriter(fw);
			
			
			for(Customer c : listCustomer) {
	            bw.write(c.toString());
	            bw.write("\n");
			}
			
		}catch(Exception e){
			System.out.println(e);
			
		}finally {
			bw.close();
	}

	
	}

}
