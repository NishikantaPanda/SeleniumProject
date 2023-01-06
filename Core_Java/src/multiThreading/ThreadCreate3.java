package multiThreading;

public class ThreadCreate3 extends Thread {
	
	public void run() {
		
		Thread.currentThread().setName("NISHIKANTA");
		System.out.println(Thread.currentThread().getName());
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		
		
		ThreadCreate3 tc3 = new ThreadCreate3();
		tc3.setDaemon(true);
		Thread.currentThread().setName("NISHI");
		System.out.println(Thread.currentThread().getName());
		tc3.start();
		
	}
}
