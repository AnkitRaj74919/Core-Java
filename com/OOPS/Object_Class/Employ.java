package com.OOPS.Object_Class;

public class Employ {
    String name;
    int id;
    double salary;
    Employ()
    {
    }
    	Employ(String name, int id,double salary)
    	{
    		this.name=name;
    		this.id=id;
    		this.salary=salary;		
    	}
    	
    	public String toString()
    	{
    		return "Name: "+name+"ID: "+id+"Salary: "+salary;
    	}
    	public int hashCode()
    	{
    		return id;
    		
    }
    	public boolean equals(Object o)
    	{
    		Employ x=(Employ) o;
    		return this.id==x.id && this.salary==x.salary;
    	}
    	
    	public void finalize()
    	{
    		System.out.println("Close database connection");
    		System.out.println("Close   connection");
    		System.out.println("Close database connection");
    		
    		
    	}
}
