package clueGame;

public class RoomCell extends BoardCell{
	private Character roomInital;
	private DoorDirection doorDirection;
	public enum DoorDirection{
		UP,DOWN,LEFT,RIGHT,NONE
	}
	public Boolean isRoom(){
		return true;
	}
	public DoorDirection getDoorDirection(){
		return doorDirection;
		
	}
	//void draw(){
	//	
	//}
	public Character getInitial() {
		// TODO Auto-generated method stub
		return null;
	}
}