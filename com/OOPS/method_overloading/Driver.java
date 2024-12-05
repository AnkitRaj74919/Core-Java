package com.OOPS.method_overloading;

public class Driver {
     
	public static void main(String[] args) {
		
		Calculator.add(12, 45.60);
		System.out.println("==============");
		Calculator.add(34, 50);
		System.out.println("================");
		Calculator.add(23.5, 44.3);
		System.out.println("=================");
		Calculator.add(12, 44.7);
		System.out.println("=================");
		Calculator.add('a', 'b');
	
	}
}
