package uoa.assignment1.character;

import java.util.Random;

public class Monster extends GameCharacter {

	public  Monster(String name) {
		super(name);
	}


	public void hurtCharacter(GameCharacter character) {
		if (successfulDefense() == false) {
            this.setHealth(this.getHealth() - 20);
        }
            
	}

	
	public boolean successfulDefense() {
		Random ran = new Random();
        int defense = ran.nextInt(2);
        boolean success = false;
        if (defense == 0) {
            return false;
        }
        else {
            return true;
        }
	}


	
	public String decideMove () {
		
		return "move";
	}

}
