package Weapon_game_project;

import java.util.Scanner;

public class Game {
	
	Game(){
		System.out.println("=========Game has Started=========");
	}

      
	   public Weapon  selectWeapon()
	   {
		   Scanner sc= new Scanner(System.in);
		   System.out.println("Enter the Score:");
		   int score = sc.nextInt();
		   sc.close();
		   if(score<=400) {
			   System.out.println("You got Knife");
		       Knife k = new Knife();
		       return k;
		    }
		   else if(score<=800)
		   {   
			   System.out.println("Press 1 for Knife");
			   System.out.println("Press 2 for Gun");
			   int choice =sc.nextInt();
			   if(choice==1)
			   {
				   System.out.println("You got Knife");
				   Knife k=new Knife();
				   return k;
			   }else if(choice==2)
			   {
				   System.out.println("You got Gun");
				   Gun g= new Gun();
				   return g;
			   }else
			   {
				   System.out.println("Not a Valid Choice");
				   return selectWeapon();
			   }
		   }
		   else if(score<=1200)
		   {
			   
			   System.out.println("Press 1 for Knife");
			   System.out.println("Press 2 for Gun");
			   System.out.println("Press 3 for Bomb");
			   
			   int choice =sc.nextInt();
			   if(choice==1)
			   {
				   System.out.println("You got Knife");
				   Knife k=new Knife();
				
				   return k;
			   }else if(choice==2)
			   {
				   System.out.println("You got Gun");
				   Gun g= new Gun();
				   return g;
			   }else if(choice==3)
			   {
				   System.out.println("You got Bomb");
				   Bomb b=new Bomb();
				   
				   return b;
			   }
			   else
			   {
				   System.out.println("Not A Valid Choice");
			   }
		   }
		   else
		   {
			   System.out.println("You have to select weapon");
		   }
		   
		return 	selectWeapon();
}
}
