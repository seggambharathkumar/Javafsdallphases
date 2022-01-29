package core.programs;

public class P {
	
	private void privateMethod(){
		System.out.println("In a private method of class p");
	}
	void defaultMethod(){
		System.out.println("In a default method of class p");
	}
	protected void protectedMethod(){
		System.out.println("In a protected method of class p");
	}
	public void publicMethod(){
		System.out.println("In a public method of class p");
	}
	public static void main(String [] args){
		M objM = new M();
		N objN = new N();
		System.out.println("long variable of class M: "+ objM.longvar);
		System.out.println("float variable of class M: "+objM.floatvar);
	}
}