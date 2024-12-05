package com.OOPS.method_overloading;

public class Calculator {
     
	public static void add(int a,int b)
	{
		System.out.println("int, int add method");
		System.out.println("sum is: "+(a+b));
	}
	public static void add(int a, double b) {
		System.out.println("int, double add method");
		System.out.println("sum is: "+(a+b));
	}
	public static void add(double a, double b) {
		System.out.println("double, double add method");
		System.out.println("sum is: "+(a+b));
	
	}
}
