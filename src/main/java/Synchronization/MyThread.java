package Synchronization;

public class MyThread extends Thread{
	
	String name;
	Display d;
	
	public MyThread(String name,Display d)
	{
		this.name=name;
		this.d=d;
	}
	
	public void run()
	{
		d.wish(name);
	}

}
