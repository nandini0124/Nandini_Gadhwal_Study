package JavaPogramTest;

public class AbstractTest extends AbstractAddWithMethod {

	@Override
	public void greet() {
		System.out.println("good"); 	
		
	}

	@Override
	public void greet1() {
		  int a=10,b=20,c;	
		  c=a+b; 
		  System.out.println(c);
		  
	}

	@Override
	public void shap() {
		String s = "the java is the most powerfull language";
		System.out.println(s);
	}
	
	public static void main (String [] args) {
		AbstractAddWithMethod Abs = new AbstractTest();
		Abs.greet();
		Abs.greet1();
		Abs.shap();
		Abs.main();
		
		
		
	}




}
