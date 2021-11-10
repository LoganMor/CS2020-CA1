package uoa.assignment1.character;

import java.util.Random;

public class Monster extends GameCharacter {

	public  Monster(String name) {
		super(name);
	}
    
    
	public void hurtCharacter(GameCharacter character) {
		if (character.successfulDefense() == false){
            character.setHealth(character.getHealth()-20);
            System.out.println("!!HIT!! " + this.sayName() + " successfully attacked " + character.sayName());
        }
        else{
            System.out.println("!!MISS!! " + character.sayName() + " sucessfully defended against " + this.sayName());
        }
	}

	
	public boolean successfulDefense() {
		Random ran = new Random();
        return ran.nextBoolean();
	}

	
	public String decideMove() {
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
