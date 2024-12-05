package com.OOPS.Abstract_class;

public class Driver {

	 public static void main(String[] args) {
		
		 Vehicle v1=new ElectricCar(45345,"TESLA",2024);
		 System.out.println(v1.name);
		 System.out.println(v1.engineNo);
		 v1.start();
		 v1.drive();
		 v1.accelerate();
		 v1.stop();
		 
		 Car c1=(Car)v1;
		 c1.openGate();
		 c1.playMusic();
		System.out.println(c1.modelNo);
	}
}
