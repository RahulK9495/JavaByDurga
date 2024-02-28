package Synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {


		/*
		 * Display d1=new Display();
		 * 
		 * MyThread t1=new MyThread("Dhoni", d1); MyThread t2=new MyThread("Kohli", d1);
		 * 
		 * t1.start(); t2.start();
		 */	

	Show s=new Show();
	
	MyThread1 t1=new MyThread1(s);
	MyThread2 t2=new MyThread2(s);
	t1.start();
	t2.start();
	}
}
