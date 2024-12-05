package Weapon_game_project;

public class Player {
      
	public static void main(String[] args) {
		Game g=new Game();
		Weapon w=g.selectWeapon();
		w.Use();
		
	}
}
