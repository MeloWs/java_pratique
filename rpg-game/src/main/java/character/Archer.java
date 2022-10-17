package character;

import java.util.List;

import player.Player;

public class Archer extends Character{

	private String weapon;
	
	
	public Archer(String name, Player player, double damage, String weapon) {
		super(name, player, damage);
		this.weapon = weapon;
	}


	public String getWeapon() {
		return weapon;
	}


	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	@Override
	
	public void attack(List<Character> target, int characterId) {
		super.attack(target, characterId);
		super.attack(target, characterId);
	}
	
	

}
