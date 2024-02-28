package Multithreading;

public class MyThreadJoin extends Thread{
	
	
	public void run()
	{
		for ( int i=0; i<10; i++)
		{
			System.out.println("Seeta thread");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
