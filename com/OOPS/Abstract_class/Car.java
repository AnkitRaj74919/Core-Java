package com.OOPS.Abstract_class;

abstract class Car extends Vehicle {
	
	int modelNo;
	
	Car(int engineNo,String name,int modelNo)
	{
		super( engineNo, name);
		this.modelNo=modelNo;;
	}
     
	public abstract void openGate();
	
	public void playMusic()
	{
		System.out.println("Play music in Car");
	}
}
