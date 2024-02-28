package Multithreading;

public class ThreadDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(8);
		MyThread t=new MyThread();
		System.out.println(Thread.currentThread().getPriority());
		
		//t.setPriority(10);
		t.start();
		
		for ( int j=0;j<10;j++)
		{
			System.out.println("Main thread");
		}
	}

}
