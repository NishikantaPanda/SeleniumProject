package multiThreading;

public class SleepDemo extends Thread{

	public void run() {
		
		try {
			
			for(int i=1; i<=5;i++) {
				Thread.sleep(1000); 
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args)  {
		
		SleepDemo sd = new SleepDemo();
		sd.start();
	}

}
