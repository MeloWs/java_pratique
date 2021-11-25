package character;
import java.util.List;

import player.Player;

public abstract class Character implements ICharacter{
	 private String name;
	 private Player player;
	 private double health = 130;
	 private boolean counterAttack = false;
	 private double damage = 5;
	 
	public Character(String name, Player player, double damage) {

		this.name = name;
		this.player = player;
		this.damage = damage;
		
	}


	public String getName() {
		return name;
	}


	public Player getPlayer() {
		return player;
	}


	public void setPlayer(Player player) {
		this.player = player;
	}


	public double getHealth() {
		return health;
	}


	public void setHealth(double health) {
		this.health = health;
	}


	public boolean isCounterAttack() {
		return counterAttack;
	}


	public void setCounterAttack(boolean counterAttack) {
		this.counterAttack = counterAttack;
	}

	
	public double getDamage() {
		return damage;
	}


	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	public double isProtected(Character target) {
		//this.setCounterAttack(true);
		
		if (target.isCounterAttack() == true) {
			if (target.getClass().getSimpleName() == "Knight") {
				damage = 0;
				System.out.println("Your enemy is protected, you can't hit him.");
			}
			else {
				System.out.println("Your enemy is protected, damages are divided by 2.");
				damage = damage/2;
			}
		} 
		
		return damage;
	}
	
	public void attack(List<Character> target, int characterId) {
		//characterid = au numéro dans la liste
		if (target.get(characterId).getHealth() == 0) {
			System.out.println("You cannot hit your enemy anymore, he/she is already dead");
		} 
		else {
			this.setCounterAttack(false);
			damage = isProtected(target.get(characterId));
			if (damage >= target.get(characterId).getHealth()) {
				target.get(characterId).setHealth(0);
				target.remove(characterId);
				System.out.println("You killed your enemy");
			} 
			else {
				target.get(characterId).setHealth(target.get(characterId).getHealth() - damage);
				System.out.println("You hit " + target.get(characterId).getName()+ " and his health is now " + target.get(characterId).getHealth() );
			}
			
		}
	}
	
	public void counterAttack() {
		
		this.setCounterAttack(true);
	}
	
	public void getHealed() {
		
	}

//	@Override
//	public String toString() {
//		return "Character [name=" + name + ", player=" + player + ", health=" + health + ", counterAttack="
//				+ counterAttack + "]";
//	}

	
	 
	
	

	// protect himself (PV, degat)
		//> boolean protected true > degat = null ou pour autres degats /2
	// hit (perso, degats) 
		//>if is not protected & not dead> perso.pv - degats
	
	
}
