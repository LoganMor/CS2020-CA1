package uoa.assignment1.game;

public class RunGame {

	private static boolean gameOver = false;

	public static void main(String[] args) {
		
        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        
        Game game = new Game(height, width);
        
        while (!gameOver) {
			//complete the code
		}
	}

}
