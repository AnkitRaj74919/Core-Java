package com.OOPS.HAS_A.Composition;

public class Car {

	String name;
	Engine e;
	
	Car(){
		
	}
	
	Car(String name,Engine e)
	{
		this.name=name;
		this.e=e;
	}
}
