package com.OOPS.Object_Class;

public class A {
     
	public static void test(Object o)
	{
		System.out.println("This is Test Method");
		System.out.println(o);
		Fruit k=(Fruit)o;
		System.out.println(k.name);
		System.out.println(k.price);
		System.out.println(k.weight);
		
	}
}
