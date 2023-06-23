package multi_Program;

public class Multi_Thread extends Thread {
	@Override
	public void run() {
			try {
				for(int i = 1; i <= 5; i++)
				{
				Thread.sleep(500);
				System.out.println(i);
				}
			} catch (InterruptedException e) {
				System.out.println();
			}
		}
	}


