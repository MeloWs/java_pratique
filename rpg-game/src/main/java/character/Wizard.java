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
	
	@Override
	public void getHealed() {
		addPV = (Math.random()* 10);
		if (this.getHealth() < 130) {
			if (this.getHealth() + addPV > 130 ) {
				this.setHealth(130);
			}
			this.setHealth(getHealth() + addPV);
		}
	}
}
	

	