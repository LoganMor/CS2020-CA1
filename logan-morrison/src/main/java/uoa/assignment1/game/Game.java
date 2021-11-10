package uoa.assignment1.game;

import uoa.assignment1.character.Monster;

public class Game {
    

    public Map map;
    
    Game (int height, int width) {
        map = new Map(height, width);
        map.printLayout();
    }
    			
    public Map getMap() {
        return this.map;
    }
    
    public boolean nextRound (String input) {
        boolean gameOver = false;
        GameLogic logic = new GameLogic();
        if (this.map.characters[0].getHealth() > 0){
            logic.moveCharacter(input, this.map, this.map.characters[0]);
            System.out.println("Player is moving " + input);
            Monster mover = new Monster("mover");
            for (int x=1; x<this.map.characters.length; x++){
                if (this.map.characters[x].getHealth() > 0) {
                    String move = mover.decideMove();
                    logic.moveCharacter(move, this.map, this.map.characters[x]);
                    String name = this.map.characters[x].sayName();
                    System.out.println(name + " is moving " + move);
                }
            }
            for (int x=0; x<this.map.characters.length; x++){
                int health = this.map.characters[x].getHealth();
                String strHealth = Integer.toString(health);
                String name = this.map.characters[x].sayName();
                System.out.println("Health " + name + ":  " + strHealth);
            }
        }
        if (this.map.characters[0].getHealth() == 0){
            gameOver = true;
            System.out.println("YOU HAVE DIED!");
        }
        if (this.map.characters[1].getHealth() == 0){
            if (this.map.characters[2].getHealth() == 0){
                if (this.map.characters[3].getHealth() == 0){
                    gameOver = true;
                    System.out.println("YOU HAVE WON!");
                }
            }
        }
        return gameOver;
        
    }
   
}