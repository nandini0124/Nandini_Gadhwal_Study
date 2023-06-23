package multi_Program;

public class Runnable_Interface implements Runnable {
	@Override
	public void run() {
		try {
			for (int i = 5; i >= 1; i--) {
				Thread.sleep(500);
				System.out.println(i);
			}

		} catch (Exception e) {
			System.out.println(e); 
		}
		

	}
}
