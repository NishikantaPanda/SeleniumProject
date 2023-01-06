package multiThreading;

public class ThreadCreate2 implements Runnable {

	@Override
	public void run() {

		System.out.println("Thread-one Running");
	}
	
	public static void main(String[] args) {
		
		ThreadCreate2 tc2 = new ThreadCreate2();
		Thread t =new Thread(tc2);
		t.start();
		
	}
	

	
}
