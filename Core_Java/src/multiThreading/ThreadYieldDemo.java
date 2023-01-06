package multiThreading;

public class ThreadYieldDemo extends Thread {

	public void run() {
	
		Thread.currentThread().setPriority(MIN_PRIORITY);
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
	
	public static void main(String[] args) {
		
		ThreadYieldDemo tyd = new ThreadYieldDemo();
		tyd.start();
		Thread.yield();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
	
}
