package Synchronization;

public class MyThread1 extends Thread{

	Show s;

	public MyThread1(Show s) {
		this.s = s;
	}
	
	public void run() {
		
		s.showN();
	}
}
