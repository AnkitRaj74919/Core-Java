package com.OOPS.Object_Class;

public class Driver1 {
      
	public static void main(String[] args) {
		Fruit f1=new Fruit("mango", 120, 3.2);
		System.out.println(f1);
		System.out.println(f1.name);
		System.out.println(f1.price);
		System.out.println(f1.weight);
		System.out.println("==================");
		A.test(f1);
		
	}
}
