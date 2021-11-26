package character;
import java.util.List;

import player.Player;

public abstract class Character implements ICharacter{
	 private String name;
	 private Player player;
	 private double health = 13;
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
	

	public void attack(List<Character> target, int characterId) {
		double hitDamage = this.damage;
		this.setCounterAttack(false);
		if (target.get(characterId).isCounterAttack() == true) {
			if (target.get(characterId).getClass().getSimpleName().equals("Knight")) {
				System.out.println("Your enemy is protected, you can't hit him.");
				
			} 
			else {
				
				hitDamage = hitDamage / 2;
				if (hitDamage >= target.get(characterId).getHealth()) {
					target.get(characterId).setHealth(0);
					System.out.println("You killed " + target.get(characterId).getName());
					target.remove(characterId);
					}
				else {
				target.get(characterId).setHealth(target.get(characterId).getHealth() - hitDamage);
				System.out.println("Your enemy is protected, damages are divided by 2.");
				}
			}
		} else {
			if (hitDamage >= target.get(characterId).getHealth()) {
				target.get(characterId).setHealth(0);
				System.out.println("You killed " + target.get(characterId).getName());
				target.remove(characterId);
				}
			else {
				target.get(characterId).setHealth(Math.round((target.get(characterId).getHealth() - hitDamage)*10.0)/10.0);
				System.out.println("you inflicted "+hitDamage+" to "+ target.get(characterId).getName()+" and his health is now " + target.get(characterId).getHealth()+" HP" );
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
