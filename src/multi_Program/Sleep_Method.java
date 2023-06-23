package multi_Program;

public class Sleep_Method extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 1; i <= 3; i++) {
				Thread.sleep(300);
				System.out.println(i);
				System.out.println(Thread.currentThread().getPriority());
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		Thread t1 = new Sleep_Method();
		t1.start();
		Thread t2 = new Sleep_Method();
		t2.start();

	}
}
