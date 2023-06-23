package customer_db_connection;

public class Customer {
	
	private int customerid;
	private String customername;
	private String customerlastname;
	private int customerage;
	private String customeraddress;
	private int cutomermono;
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomerlastname() {
		return customerlastname;
	}
	public void setCustomerlastname(String customerlastname) {
		this.customerlastname = customerlastname;
	}
	public int getCustomerage() {
		return customerage;
	}
	public void setCustomerage(int customerage) {
		this.customerage = customerage;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	public int getCutomermono() {
		return cutomermono;
	}
	public void setCutomermono(int cutomermono) {
		this.cutomermono = cutomermono;
	}
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customerlastname=" + customerlastname + ", customerage=" + customerage + ", customeraddress="
				+ customeraddress + ", cutomermono=" + cutomermono + "]";
	}
	
	

}
