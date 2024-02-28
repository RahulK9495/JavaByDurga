package Synchronization;

public class MyThread2 extends Thread{

	Show s;

	public MyThread2(Show s) {
		this.s = s;
	}
	
	public void run() {
		
		s.showC();
	}
}
