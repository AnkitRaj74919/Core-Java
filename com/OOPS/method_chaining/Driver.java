package com.OOPS.method_chaining;

public class Driver {
 
	     public static void main(String[] args)
	     {
	    	 Employ e1=new 	Employ("Mohan",2727,38283.5,25);
	    	 Employ e2=new 	Employ("Sohan",2828,38333.5,22);
	         Employ e3=new 	Employ("John",2929,38686.5,28);
	    			
	         e1.getName(e1).getId(e1).getSalary(e1).getAge(e1);
	         e2.getName(e2).getId(e2).getSalary(e2).getAge(e2);
	         e3.getName(e3).getId(e3).getSalary(e3).getAge(e3);
	         
	        
	    				
	     }
	    
}
