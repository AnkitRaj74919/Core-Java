package com.OOPS.Abstract_class;

class ElectricCar extends Car{
	
 
	ElectricCar(int engineNo, String name, int modelNo) {
		super(engineNo, name, modelNo);

	}

	public void start()
	{
		System.out.println("Start Electric Car");
	}
	
	public void drive()
	{
		System.out.println("Drive Electric Car");
	}
	
	public void openGate()
	{
		System.out.println("Open the Gate in Electric Car");
	}
}
