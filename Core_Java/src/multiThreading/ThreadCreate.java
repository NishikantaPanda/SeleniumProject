package multiThreading;

public class ThreadCreate extends Thread {
	

	public static void main(String[] args) {
		ThreadCreate tc = new ThreadCreate();
		tc.start();
	}

	public void run() {
		
		System.out.println("Thread-one Running");
	}	
}

