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
		this.setCounterAttack(false);
		addPV = Math.round((Math.random()* 100)*10.0)/10.0;
		if (this.getHealth() < 13) {
			if (this.getHealth() + addPV > 13 ) {
				this.setHealth(13);
			}
			
			this.setHealth(getHealth() + addPV);
		}
	}
}
	

	