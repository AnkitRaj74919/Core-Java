package com.OOPS.Inheritance;

public class Car extends Vehicle {
      
	 int modelNo;
	   int y=32;

	Car(int engineNo,String color,String name,int modelNo)
	{
	 super(engineNo,color,name);
	 this.modelNo=modelNo;
	}

	 
	  public void Start()
	{
	  System.out.println("Car Start");
	 }
	  
	 
	   
	  public void openGate()
	{
	  System.out.println("Car Gate is open");
	 }
	}

