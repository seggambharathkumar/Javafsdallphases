package core.programs;

public class Y extends N{
	public static void main(String[] args)
	{
		M objM = new M();
		objM.publicMethod();
		
		Y objY = new Y();
		objY.protectedMethod();
		objY.publicMethod();
		
		X objX = new X();
		System.out.println("long variable of X:"+objX.longVar);
		System.out.println("float variable of X:"+objX.floatVar);
		System.out.println("char variable of X:"+objX.charVar);
	}

}