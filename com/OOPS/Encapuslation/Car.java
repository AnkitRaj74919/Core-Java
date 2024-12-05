package com.OOPS.Encapuslation;

import java.util.Scanner;

public class Car {
	
	int model=123;
	String name;
	double price;
	
	
Scanner sc=new Scanner(System.in);
	
	Car()
	{
		
	}
	
	public String getName()
	{
		System.out.println("Enter The Model for getName validation");
		int m=sc.nextInt();
		if(m==model)		{
			System.out.println("Validation Succesful");
		}
		else
		{
			System.out.println("You have entered a invalid modelNo");
		}
		return name;
	}
	
	public void setName(String name)
	{
		System.out.println("Enter The Model for setName validation");
		int m=sc.nextInt();
		if(m==model)
		{
			System.out.println("Validation Succesful");
		}
		else
		{
			System.out.println("You have entered a invalid modelNo");
		}
		this.name=name;
	}
		

		public double getPrice()
		{
			System.out.println("Enter The modelno for getPrice validation");
			int m=sc.nextInt();
			if(m==model)
			{
				System.out.println("Validation Succesful");
			}
			else
			{
				System.out.println("You have entered a invalid ModelNOO");
			}
			return price;
		}
		
		public void setPrice(double price)
		{
			System.out.println("Enter The modelNo for setPrice validation");
			int m=sc.nextInt();
			if(m==model)
			{
				System.out.println("Validation Succesful");
			}
			else
			{
				System.out.println("You have entered a invalid  modelNo");
			}
			this.price=price;
			
	}
}

