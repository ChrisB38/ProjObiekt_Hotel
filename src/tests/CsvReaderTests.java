package tests;

import static org.junit.Assert.*;
import projobiekt_hotel.*;
import java.io.File;
import java.util.ArrayList;
import org.junit.Test;


public class CsvReaderTests {
	
	@Test
	public void testReadUsersList() throws Exception {
		String testFile = new File(this.getClass().getResource("/tests/resources/users.csv").getFile()).getAbsolutePath();
		CsvReader reader = new CsvReader();
		ArrayList<User> users = reader.readUsersList(testFile);
		
		assertEquals(2, users.size());
		
		User firstUser = users.get(0);
		User secondUser = users.get(1);

		assertEquals("foo@bar.pl", firstUser.mailAddress());
		assertEquals("Jan Kowalski", firstUser.name());
		assertEquals(UserRole.EMPLOYEE, firstUser.role());
		assertEquals("a@b.com", secondUser.mailAddress());
		assertEquals("Anna Nowak", secondUser.name());
		assertEquals(UserRole.GUEST, secondUser.role());
	}


	@Test
	public void testReadUserLine() throws Exception{
		CsvReader reader = new CsvReader();
		String line = "foo@bar.pl,900150983cd24fb0d6963f7d28e17f72,Stefan Batory,employee";
		User user = reader.readUserLine(line);
		
		assertEquals("foo@bar.pl", user.mailAddress());
		assertEquals("900150983cd24fb0d6963f7d28e17f72", user.passwordHash());
		assertEquals("Stefan Batory", user.name());
		assertEquals(UserRole.EMPLOYEE, user.role());
	}
	
	@Test
	public void testReadMalformedUserLine() {
		CsvReader reader = new CsvReader();
		String wrongLine = "foo@bar.pl,employee";
		
		try {
			reader.readUserLine(wrongLine);
			fail("Exception not thrown");
		} catch(Exception e) {
			assertEquals("wrong line in csv file", e.getMessage());
		}
	}	
	
	@Test
	public void testReadRoomsList() {
		String testFile = new File(this.getClass().getResource("/tests/resources/rooms.csv").getFile()).getAbsolutePath();
		CsvReader reader = new CsvReader();
		ArrayList<Room> rooms = reader.readRoomsList(testFile);
		
		assertEquals(4, rooms.size());
		
		Room firstRoom = rooms.get(0);
		Room secondRoom = rooms.get(1);
		Room thirdRoom = rooms.get(2);
		Room fourthRoom = rooms.get(3);
		
		assertEquals(5, firstRoom.number());
		assertEquals(120, firstRoom.price());
		assertEquals(2, secondRoom.people());
		assertEquals(true, secondRoom.hasBath());
		assertEquals(false, secondRoom.hasKitchen());
		assertEquals(3, thirdRoom.people());
		assertEquals(240, fourthRoom.price());
		assertEquals(true, fourthRoom.hasKitchen());
	}
	
	@Test
	public void testReadRoomLine() throws Exception {
		CsvReader reader = new CsvReader();
		String line = "3,2,135,true,false,true";
		Room room = reader.readRoomLine(line);
		
		assertEquals(3, room.number());
		assertEquals(2, room.people());
		assertEquals(135, room.price());
		assertEquals(true, room.hasBath());
		assertEquals(false, room.hasKitchen());
		assertEquals(true, room.hasGoodWindowView());
	}
	
	@Test
	public void testMalformedRoomLine() {
		CsvReader reader = new CsvReader();
		String wrongLine = "3,2,true,false,true";
		try {
			reader.readRoomLine(wrongLine);
			fail("Exception not thrown");
		} catch(Exception e) {
			assertEquals("wrong line in csv file", e.getMessage());
		}
				
	}

}
