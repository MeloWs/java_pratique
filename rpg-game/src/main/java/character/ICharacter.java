package character;

import java.util.List;

public interface ICharacter {
	
	void attack(List<Character> target, int characterId);
	
	void counterAttack();

}
