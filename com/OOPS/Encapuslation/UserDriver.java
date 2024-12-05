package com.OOPS.Encapuslation;

public class UserDriver {
    
	public static void main(String[] args) {
		
		User u=new User();
		u.setName("Chandan");
		u.setMobNo(67325);
		System.out.println("Name is:"+u.getName());
		System.out.println("Mobile no is:"+u.getMobNo());
	}
}
