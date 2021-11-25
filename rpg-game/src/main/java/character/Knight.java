package character;

import player.Player;

public class Knight extends Character{

	private String weapon;
	
	public Knight(String name, Player player, double damage, String weapon) {
		super(name, player, damage);
		this.weapon = weapon;
	}
	

	public String getWeapon() {
		return weapon;
	}


	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	



	// protect himself (PV, degat)
			//> boolean protected true > degat = null ou pour autres degats /2
		// hit (perso, degats) 
			//>if is not protected & not dead> perso.pv - degats
}
