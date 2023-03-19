package programjava;

public class Gabstract extends Nabstract {
	
	public void greet() {                               //abstract method colling
		System.out.println("good");
	}
	public void greet1() {                               //abstract method colling
		System.out.println("good morning");
	}
	public void shap() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
		
		String s = "the java is the most powerfull language";
		System.out.println(s);
	}
	
	public static void main(String [] args) {
		Gabstract G1 =new Gabstract();
		
		G1.greet();
		G1.greet1();
		G1.shap();
		G1.main();
	}


}
