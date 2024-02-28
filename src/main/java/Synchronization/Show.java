package Synchronization;

public class Show {
	
	public synchronized void showN()
	{
		for (int i=0; i<=10; i++)
		{
			System.out.print(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	public synchronized void showC()
	{
		for (int i=65; i<=75;i++)
		{
			System.out.print((char)i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
