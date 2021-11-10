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
        else if (input == "right"){
            moveRight(character, gameMap);
        }
        else if (input == "left"){
            moveLeft(character, gameMap);
        }
        else if (input == "up"){
            moveUp(character, gameMap);
        }
        else if (input == "down"){
            moveDown(character, gameMap);
        }
	}
    
    private static void moveRight(GameCharacter character, Map gameMap){
        String symbol = gameMap.layout[character.row][character.column];
        if (gameMap.layout[0].length - 1 < character.column + 1){
            System.out.println("You can't go right. You lose a move");
        }
        else if (gameMap.layout[character.row][character.column+1] == symbol){
            System.out.println("Monster already there so can't move");
        }
        else {
            int column = character.column;
            character.column = character.column + 1;
            gameMap.layout[character.row][column] = ".";
            gameMap.layout[character.row][character.column] = symbol;
        }
    }
	
    private static void moveLeft(GameCharacter character, Map gameMap){
        String symbol = gameMap.layout[character.row][character.column];
        if (character.column - 1 < 0){
            System.out.println("You can't go left. You lose a move");
        }
        else if (gameMap.layout[character.row][character.column-1] == symbol){
            System.out.println("Monster already there so can't move");
        }
        else {
            int column = character.column;
            character.column = character.column - 1;
            gameMap.layout[character.row][column] = ".";
            gameMap.layout[character.row][character.column] = symbol;
        }
    }
    
    private static void moveUp(GameCharacter character, Map gameMap){
        String symbol = gameMap.layout[character.row][character.column];
        if (character.row - 1 < 0){
            System.out.println("You can't go up. You lose a move");
        }
        else if (gameMap.layout[character.row-1][character.column] == symbol){
            System.out.println("Monster already there so can't move");
        }
        else {
            int row = character.row;
            character.row = character.row - 1;
            gameMap.layout[row][character.column] = ".";
            gameMap.layout[character.row][character.column] = symbol;
        }
    }
    
    private static void moveDown(GameCharacter character, Map gameMap){
        String symbol = gameMap.layout[character.row][character.column];
        if (gameMap.layout.length - 1 < character.row + 1){
            System.out.println("You can't go down. You lose a move");
        }
        else if (gameMap.layout[character.row+1][character.column] == symbol){
            System.out.println("Monster already there so can't move");
        }
        else {
            int row = character.row;
            character.row = character.row + 1;
            gameMap.layout[row][character.column] = ".";
            gameMap.layout[character.row][character.column] = symbol;
        }
    }
}
