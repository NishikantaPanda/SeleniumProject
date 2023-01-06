package multiThreading;

public class ThreadPriority extends Thread {

	public static void main(String[] args) {
		
		ThreadPriority tp = new ThreadPriority();
		tp.start();
		System.out.println("main Thread old Priority : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println("main Thread new Priority : "+Thread.currentThread().getPriority());
		
		
		
		
	}
	
	public void run() {
		
		//System.out.println("child Thread old Priority: "+Thread.currentThread().getPriority());
		System.out.println("child Thread new Priority: "+Thread.currentThread().getPriority());
	}
}
