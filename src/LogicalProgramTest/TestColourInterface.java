package LogicalProgramTest;

public class TestColourInterface implements ColourInterface{
	@Override
	public void red() {
	System.out.println("red");
		
	}

	@Override
	public void green() {
		System.out.println("green");
		
	}

	@Override
	public void yello() {
		System.out.println("yello");

		
	}

	@Override
	public void pink() {
		System.out.println("pink");
		
	}

	@Override
	public void black() {
		 System.out.println("black");
	}

	@Override
	public void blue() {
		System.out.println("blue");
		
	}

	@Override
	public void gree() {
		System.out.println("gree");
		
	}

	@Override
	public void white() {
		System.out.println("white");
		
	}
	public static void main (String [] args) {
		ColourInterface c1 =new TestColourInterface();
		c1.black();
		c1.blue();
		c1.gree();
		c1.green();
		c1.white();
		c1.red();
}
}
