package com.OOPS.Encapuslation;

public class CarDriver {
   
	public static void main(String[] args) {
		
		Car c=new Car();
		c.setName("Maruti");
		System.out.println("name is :"+c.getName());
		c.setPrice(3264561);
		System.out.println("price is:"+c.getPrice());
	}
}
