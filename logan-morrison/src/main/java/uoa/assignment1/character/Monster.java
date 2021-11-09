package uoa.assignment1.character;

import java.util.Random;

public class Monster extends GameCharacter {

	public  Monster(String name) {
		super(name);
	}
    
    
	public void hurtCharacter(GameCharacter character) {
        boolean defending = character.successfulDefense();
		if (defending == false) {
            int current = character.getHealth();
            int damage = current - 20;
            character.setHealth(damage);
        }
            
	}

	
	public boolean successfulDefense() {
		Random ran = new Random();
        return ran.nextBoolean();
	}

	
	public String decideMove () {
		Random ran = new Random();
        int choice = ran.nextInt(4);
        if (choice == 0){
            return "up";
        }
        else if (choice == 1){
            return "down";
        }
        else if (choice == 2){
            return "right";
        }
        else{
            return "left";
        }
	}

}
