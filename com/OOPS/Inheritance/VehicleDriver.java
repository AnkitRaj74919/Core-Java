package com.OOPS.Inheritance;

public class VehicleDriver {

	 public static void main(String[] args)
	 {
		 System.out.println("CAR DETAILS");
		 System.out.println("=================");
		 Vehicle v1=new Car(12345,"BLACK","BMW",4567);
		  v1.getDetails();
		  v1.Start();
		  v1.Stop();
		 
		  System.out.println(v1.toString());
		  System.out.println(v1.hashCode());
		  System.out.println(v1.equals(v1));
		  Car c2=(Car)v1;
		  
		  c2.Start();
		  System.out.println(c2);
		  System.out.println(c2.hashCode());
		  System.out.println(c2.equals(v1));
		  
		  
		  System.out.println("MoDEL NO:"+c2.modelNo);
		  System.out.println("=================");
		  System.out.println("BUS DETAILS");
		  System.out.println("=================");
		  Vehicle v2=new Bus(546137,"WHITE","ABCD",67);
		  v2.getDetails();
		  Bus b1=(Bus)v2;
		  System.out.println("Number of Seat is:"+b1.seats);

	 }
}
