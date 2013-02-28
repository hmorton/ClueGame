package clueGame;

public abstract class BoardCell {
	private int row;
	private int column;

	public Boolean isWalkway(){
		return false;
	}
	public Boolean isRoom(){
		return false;
	}
	public Boolean isDoorway(){
		return false;
	}
	//void draw(){
	//	
	//}
}
