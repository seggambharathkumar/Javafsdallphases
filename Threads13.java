package javafsdallphases;

public class Threads13 extends Thread
	{
		public void run()
		{  
			for(int i=1;i<=5;i++)
			{  
			   try
			   {  
				   Thread.sleep(500);  
			   }
			    catch(Exception e)
			   {
				   System.out.println(e);
			   }  
			   System.out.println(i);  
			  }  
		   }  
			 
		public static void main(String args[])
		{  
			
			 Threads13 t1=new Threads13();  
			 Threads13 t2=new Threads13();  
			 Threads13 t3=new Threads13();  
			 t1.start();  
			 
			 try
			 {  
				 t1.join();  
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }  
			  
			 t2.start();  
			 t3.start();  
			 }  
			}  