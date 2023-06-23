package multi_Program;

public class Test_Thread {
	public static void main(String[] args) throws InterruptedException {
		Multi_Thread mul =new Multi_Thread();
		mul.start();
		for(int i = 1; i <= 5; i++)
		{
		Thread.sleep(500);
		System.out.println(i);
		}
	}

}
