package uoa.assignment1.game;

import uoa.assignment1.character.GameCharacter;
import uoa.assignment1.character.Monster;
import uoa.assignment1.character.Player;

public class Map {

public String [][] layout;
public GameCharacter characters [];
     
  public Map (int height, int width) {
	 int mapHeight = height;
     int mapWidth = width;
     layout = new String [mapHeight][mapWidth];
     characters = new GameCharacter[4];
     initialiseArray();
     
     /* initialise player*/
     Player player = new Player("Player");
     player.row = mapHeight - 1;
     player.column = mapWidth - 1;
     characters[0] = player;
     this.layout[player.row][player.column] = "*";
     
     /* initialise monster1 (top right) */
     Monster monster1 = new Monster("Monster1");
     monster1.row = 0;
     monster1.column = mapWidth - 1;
     characters[1] = monster1;
     layout[monster1.row][monster1.column] = "%";
     
     /* initialise monster2 (bottom left) */
     Monster monster2 = new Monster("Monster2");
     monster2.row = mapHeight - 1;
     monster2.column = 0;
     characters[2] = monster2;
     layout[monster2.row][monster2.column] = "%";
     
     /* initialise monster3 (top left) */
     Monster monster3 = new Monster("Monster3");
     monster3.row = 0;
     monster3.column = 0;
     characters[3] = monster3;
     layout[monster3.row][monster3.column] = "%";
    
  }
 
  private void initialiseArray() {
      for (int x=0; x < this.layout.length; x++){
          for (int y=0; y < this.layout[x].length; y++){
              this.layout[x][y] = ".";
          }
      }
  }
  
  
    public void printLayout() {
        for (String x[] : layout){
            for (String y : x){
                System.out.print(y);
            }
            System.out.println("\n");
        }
    }
}
