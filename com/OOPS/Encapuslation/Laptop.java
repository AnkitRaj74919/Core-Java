package com.OOPS.Encapuslation;
import java.util.Scanner;
public class Laptop {
	int model=9931;
	String name;
	double price;
	
	double weight;
	Scanner sc=new Scanner(System.in);
	
	Laptop()
	{
		
	}
	
	public String getName()
	{
		System.out.println("Enter The ModelNo for getName");
		int modelNo=sc.nextInt();
		if(modelNo==model)
		{
			System.out.println("Validation Succesful");
		}
		else
		{
			System.out.println("You haev entered a invalid modelNo");
		}
		return name;
	}
	
	public void setName(String name)
	{
		System.out.println("Enter The ModelNo for setName");
		int modelNo=sc.nextInt();
		if(modelNo==model)
		{
			System.out.println("Validation Succesful");
		}
		else
		{
			System.out.println("You haev entered a invalid modelNo");
		}
		this.name=name;
	}
		

		public double getPrice()
		{
			System.out.println("Enter The Price for getPrice");
			double price1=sc.nextDouble();
			if(price1==model)
			{
				System.out.println("Validation Succesful");
			}
			else
			{
				System.out.println("You haev entered a invalid modelNo");
			}
			return price;
		}
		
		public void setPrice(double price)
		{
			System.out.println("Enter The Price for setPrice");
			double price1=sc.nextDouble();
			if(price1==model)
			{
				System.out.println("Validation Succesful");
			}
			else
			{
				System.out.println("You have entered a invalid modelNo");
			}
			this.price=price;
			
	}
}
