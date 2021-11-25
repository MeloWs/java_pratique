package character;

import player.Player;

public class Wizard extends Character{
	
	private String element;
	private double addPV;

	public Wizard(String name, Player player, double damage, String element) {
		super(name, player, damage);
		this.element = element;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	} 
	

	public void getHealed() {
		addPV = (Math.random()* 10);
		if (this.getHealth() < 130) {
			this.setHealth(getHealth() + addPV);
		}
	}
}
	
	// heal (PV)
			//heal aléatoire ? ou fixe ? > pv + nb de pv. (si toute sa vie ne marche pas)
	