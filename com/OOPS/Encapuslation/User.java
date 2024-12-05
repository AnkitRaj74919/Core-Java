package com.OOPS.Encapuslation;

import java.util.Scanner;

public class User {
    
	int loginId=74919;
	int mobNo;
	String name;

	Scanner sc=new Scanner(System.in);
	
	public void setName(String name)
	{
		System.out.println("Enter the Login Id for setName");
		int id=sc.nextInt();
		if(id==loginId)
		{
			System.out.println("Validation Succesful");
		}
		else
		{
			System.out.println("You have entered a wrong login id");
		}
		this.name=name;
	}
	
	public void setMobNo(int mobNo)
	{
		System.out.println("Enter the login id for set mobile no");
		int mob=sc.nextInt();
		if(mob==loginId)
		{
			System.out.println("validation successful");
		}
		else
		{
			System.out.println("you have entered a wrong login id");
		}
		this.mobNo=mobNo;
	}
	
	public String getName()
	{
		System.out.println("Enter the Login Id for getName");
		int id=sc.nextInt();
		if(id==loginId)
		{
			System.out.println("Validation Succesful");
		}
		else
		{
			System.out.println("You have entered a wrong login id");
		}
		return name;
    }
	
	
	public int getMobNo()
	{
		System.out.println("Enter the Login Id for getMobNo");
		int mob=sc.nextInt();
		if(mob==loginId)
		{
			System.out.println("Validation Succesful");
		}
		else
		{
			System.out.println("You have entered a wrong login id");
		}
		return mobNo;
	}
}
