package uoa.assignment1.character;

public abstract class GameCharacter {
    
	private String name ="";
	
	private int health; 
	
	public int row;
	public int column;
	
	
	public GameCharacter (String name) {
		this.name = name;
	}
	
	public abstract void hurtCharacter (GameCharacter character);
	
	public abstract boolean successfulDefense ();
	
	
	public String sayName() {
	return this.name; 
	}

	public int getHealth() {
		return -1;
	}

	public void setHealth(int health) {
		//complete
	}
}

