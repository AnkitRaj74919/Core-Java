package com.OOPS.Abstract_class;

abstract class Vehicle {
	
	int engineNo;
	String name;
	
	Vehicle(int engineNo,String name)
	{
		this.engineNo=engineNo;
		this.name=name;
	}
 
	public abstract void start();
	public abstract void drive();
	
	public void accelerate()
	{
		System.out.println("Vehicle Acclerate");
	}
	
	public void stop()
	{
		System.out.println("Stop Vehicle");
	}
}
