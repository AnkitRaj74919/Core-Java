package com.OOPS.HAS_A.Composition;

public class Engine {

	 int hp;
	 
	 Engine()
	 {
		 
	 }
	 
	 Engine(int hp)
	 {
		 this.hp=hp;
	 }
	 
	 public void start()
	 {
		 System.out.println("Start Engine");
	 }
}
