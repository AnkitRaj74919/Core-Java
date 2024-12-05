package com.OOPS.Object_Class;

public class Driver {
     
	public static void main(String[] args)
	{
		Object o;
		Employ e1 =new Employ("Mohan",121,2432.25);
		Employ e2 =new Employ("Sohan",120,3025.25);
		Employ e3 =new Employ("Mohan",121,2432.25);
		Employ e4 =new Employ("Sohan",120,3025.25);
		Employ e5 =new Employ("Mohan",121,2432.25);
	
		System.out.println("=======toString()============");
		System.out.println(e1);
		System.out.println(e2);
	    System.out.println(e3);
        System.out.println("=======hashCode()============");
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
        System.out.println("=========equals(Object o)=======");
        System.out.println(e1==e2);
		System.out.println(e1==e3);
	    System.out.println("======================");
	    System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
	    System.out.println(e1.equals(e4));
	    System.out.println(e2.equals(e4));
	    
	    System.out.println("========fianalize()==========");
	    
	e1=null;
	e2=null;
    System.gc();

}
}
