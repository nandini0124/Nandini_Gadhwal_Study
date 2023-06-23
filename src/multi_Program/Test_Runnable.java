package multi_Program;

public class Test_Runnable {
	public static void main(String[] args) throws InterruptedException {
		Runnable_Interface r = new Runnable_Interface();
		Thread t = new Thread(r);
		t.start();
		for (int i = 1; i <= 5; i++) {
			Thread.sleep(500);
			System.out.println("main thread");
		}
	}

}
