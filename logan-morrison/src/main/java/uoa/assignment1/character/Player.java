package uoa.assignment1.character;

import java.util.Random;

public class Player extends GameCharacter{

	public Player(String name) {
		super(name);
	}

	
	public
	void hurtCharacter(GameCharacter character) {
		if (character.successfulDefense() == false){
            character.setHealth(character.getHealth()-50);
        }
	}

	
	public
	boolean successfulDefense() {
        Random ran = new Random();
        int defense = ran.nextInt(10);
        if (defense <= 2) {
            return true;
        }
        else {
            return false;
        }
	} 
}
