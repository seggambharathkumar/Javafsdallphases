package javafsdallphases;

public class Polymorphism20 
	{
	public int sum(int x, int y) 
	    { 
	return (x + y); 
	    } 
	public int sum(int x, int y, int z) 
	    { 
	return (x + y + z); 
	    } 
	public double sum(double x, double y) 
	    { 
	return (x + y); 
	    } 
	public static void main(String args[]) 
	    { 
	        Polymorphism20 s = new Polymorphism20(); 
	System.out.println(s.sum(10, 20)); 
	System.out.println(s.sum(10, 20, 30)); 
	System.out.println(s.sum(10.5, 20.5)); 
	    } 
	}
