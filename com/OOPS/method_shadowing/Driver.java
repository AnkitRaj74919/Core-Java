package com.OOPS.method_shadowing;

public class Driver {
       public static void main(String[] args) {
		
    	   Vehicle.start();
    	   Car.start();
    	   Electric_Car.start();
    	   
    	   Vehicle v1=new Car();
    	   Vehicle v2=new Electric_Car();
    	   
    	   v1.start();
    	   v1.drive();
    	   v2.start();
    	   v2.drive();
	}
}
