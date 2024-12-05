package com.OOPS.Inheritance;

public class Vehicle {
      
	  int engineNo;
	   String color;
	   String name;
	   int x=20;
	   
	   public static void start()
	   {
		   System.out.println("Vehicle start");
		   }
   

	Vehicle(int engineNo,String color,String name)
	{
	   this.engineNo=engineNo;
	   this.color=color;
	   this.name=name;
	}
 
	public void Start()

	{
		System.out.println("Vehicle Start");
	}
	public void Stop()

	{
		System.out.println("Vehicle Stop");
	}
	
	
		public void getDetails()
	
	{
	  System.out.println("Engine no is:"+engineNo);
	  
	  System.out.println("Color is:"+color);
	  
	  System.out.println("Name is:"+name);
	}
}
