package Operation_Class;

public class Test_Class extends Operation_Test_Class {
	public static void main(String []args) {
		Model_Test ref = new Model_Test();
		ref.setNumber(1);
		ref.setBool(true);
		ref.setF(2.0f);
		ref.setName("abhay");
		Operation_Test_Class obj =new Operation_Test_Class();
		obj.print();
		obj.listprint();
		obj.hashmap();
		obj.setprint();
		obj.array();
		
		
		
	
	}

}
