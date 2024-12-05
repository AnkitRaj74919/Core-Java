package com.OOPS.method_chaining;

public class Employ {
      
	String name;
	int id;
	double salary;
	int age;
	
	
	Employ(String name,int id,double salary, int age)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.age=age;
	}
	
	public Employ getName(Employ e)
	{
		System.out.println("Name is :"+name);
		return this;
	}
	

	public Employ getId(Employ e)
	{
		System.out.println("Id is :"+id);
		return this;
	}
	

	public Employ getSalary(Employ e)
	{
		System.out.println("Salary is :"+salary);
		return this;
	}
	

	public Employ getAge(Employ e)
	{
		System.out.println("Age is :"+age);
		return this;
	}
}
