package RPGgame;

import java.util.Random;

public class Enemy {
private int damage;
Random rand = new Random ();

	private void attackplayer() {
		// the damage to the player 
		damage = rand.nextInt();
		System.out.print(damage);
	}
	
	public static void main(String[] args) {
		Enemy Fatima = new Enemy();
	Fatima.attackplayer();
	}
}
