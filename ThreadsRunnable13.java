package javafsdallphases;

public class ThreadsRunnable13 implements Runnable
{  
	
	public  void run()
	{  
		System.out.println("thread is running...");  
	}  
	  
	public static void main(String args[])
	{  
	
		ThreadsRunnable13 m1=new ThreadsRunnable13();       
		Thread t1 = new Thread(m1);                     
		t1.start();                                     
	}  
}  