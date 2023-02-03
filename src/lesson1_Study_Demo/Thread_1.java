package lesson1_Study_Demo;

public class Thread_1 implements Runnable{

	String xString ;
	public Thread_1(String string) {
		this.xString = string;
	}
	@Override
	public void run() {
		System.out.println(xString);
		
	}
	
	public static void main(String[] args) {
		
		Thread_1 thread_1 = new Thread_1("hey");
		Thread thread = new Thread(thread_1);
		
		thread.start();
	}
	

}
