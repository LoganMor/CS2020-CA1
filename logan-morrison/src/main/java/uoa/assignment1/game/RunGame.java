package uoa.assignment1.game;

import java.util.Scanner;

public class RunGame {

	private static boolean gameOver = false;

	public static void main(String[] args) {
		
        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int round = 0;
        
        Game game = new Game(height, width);
        
        while (!gameOver) {
            round++;
            String roundStr = Integer.toString(round);
            System.out.println("Round " + roundStr);
            Scanner reader = new Scanner(System.in);
            
			//complete the code
		}
	}

}
