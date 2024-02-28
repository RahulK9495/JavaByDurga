package Multithreading;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {


		MyThreadJoin t=new MyThreadJoin();
		t.start();
		
		//t.join(5000);
		for ( int i=0;i<10;i++)
		{
			System.out.println("Ram Thread");
		}
	}

}
