package uoa.assignment1.game;

import java.util.Scanner;
import java.awt.event.KeyAdapter;              
import java.awt.event.KeyEvent;

import uoa.assignment1.character.GameCharacter;
import uoa.assignment1.character.Player;
import uoa.assignment1.character.Monster;

public class GameLogic {

	public static void moveCharacter(String input, Map gameMap, GameCharacter character) {
        if (input != "up" && input != "down" && input != "right" && input != "left"){
            System.out.println("Use only keywords up, down, left, right");
        }
	}
	
}
