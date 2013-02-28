package clueGame;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class clueBoardTests {
	private static Board board;
	public static final int NUM_ROOMS = 10;
	public static final int NUM_ROWS = 22;
	public static final int NUM_COLUMNS = 22;
	public static Map<Character, String> rooms;
	@Before 
	public void setup() {
		board = new Board();
		//board.loadConfigFiles();
		rooms=board.getRooms();
	}
	
	@Test
	public void testException(){
		try{
			board.loadConfigFiles();
		}catch (BadConfigFormatException e){
			e.toString();
		}
	}
	
	@Test
	public void RoomsNumber(){
		int test = rooms.size();
		assertEquals(NUM_ROOMS, test);
	}
	@Test
	public void RoomsMap(){
		assertEquals("Conservatory", rooms.get('C'));
		assertEquals("Ballroom", rooms.get('B'));
		assertEquals("Billiard room", rooms.get('R'));
		assertEquals("Dining room", rooms.get('D'));
		assertEquals("Walkway", rooms.get('W'));
		assertEquals("Kitchen", rooms.get('K'));
		assertEquals("Study", rooms.get('S'));
		assertEquals("Hall", rooms.get('H'));
		assertEquals("Closet", rooms.get('X'));
		assertEquals("Library", rooms.get('L'));
		assertEquals("Lounge", rooms.get('O'));
	}
	@Test
	public void correctBoardDimensions(){
		assertEquals(NUM_ROWS, board.getNumRows());
		assertEquals(NUM_COLUMNS, board.getNumColumns());
}
	@Test
	public void DoorDirections(){
		RoomCell room = board.getRoomCellAt(2,3);
		assertTrue(room.isDoorway());
		assertEquals(RoomCell.DoorDirection.UP, room.getDoorDirection());
		
		room = board.getRoomCellAt(12,3);
		assertTrue(room.isDoorway());
		assertEquals(RoomCell.DoorDirection.DOWN, room.getDoorDirection());
		room = board.getRoomCellAt(18,2);
		assertTrue(room.isDoorway());
		assertEquals(RoomCell.DoorDirection.RIGHT, room.getDoorDirection());
		room = board.getRoomCellAt(18,17);	
		assertTrue(room.isDoorway());
		assertEquals(RoomCell.DoorDirection.LEFT, room.getDoorDirection());
		room = board.getRoomCellAt(13,7);
		assertFalse(room.isDoorway());
	}
	@Test
	public void testRoomInitials() {
		assertEquals(new Character ('L'), board.getRoomCellAt(1, 1).getInitial());
		assertEquals(new Character ('S'), board.getRoomCellAt(1, 6).getInitial());
		assertEquals(new Character ('H'), board.getRoomCellAt(16, 1).getInitial());
		assertEquals(new Character ('B'), board.getRoomCellAt(20, 10).getInitial());
		assertEquals(new Character ('K'), board.getRoomCellAt(19, 19).getInitial());
	}
	
	@Test
	public void testCalcIndex(){
		int test = board.calcIndex(3, 8);
		assertEquals(52, test);
		
		test = board.calcIndex(1, 20);
		assertEquals(20, test);
		
		test = board.calcIndex(21, 22);
		assertEquals(462, test);	
	}
	
	
	
}
