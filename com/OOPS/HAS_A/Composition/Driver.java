package com.OOPS.HAS_A.Composition;

public class Driver {

	public static void main(String[] args) {
		
		Car c1=new Car("TATA",new Engine(120));
		System.out.println("Car object address"+c1);
		System.out.println("Car engine object address"+c1.e);
		System.out.println("car name is:"+c1.name);
		System.out.println("Car engine horse power is:"+c1.e.hp);
		c1.e.start();
	     c1=null;
	}
}
