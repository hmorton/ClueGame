package clueGame;

import java.util.ArrayList;
import java.util.Map;

public class Board {
private ArrayList<BoardCell> cells;
private Map<Character, String> rooms;
private int numRows;
private int numColumns;

public void loadConfigFiles() throws BadConfigFormatException{
	int n=0;
	if(n >4){
		throw new BadConfigFormatException();
	}
}

public int calcIndex(int rowNumber, int columnNumber) {
	int index;
	index = numColumns * (rowNumber-1) + columnNumber;
	return index;
}
public RoomCell getRoomCellAt(int rowNumber, int columnNumber){
	return null;
}
public Map<Character, String> getRooms(){
	return rooms;

}
public int getNumRows(){
	return numRows;
}
public int getNumColumns(){
	return numColumns;
}
}
