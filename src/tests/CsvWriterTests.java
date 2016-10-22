package tests;

import static org.junit.Assert.*;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import projobiekt_hotel.*;
import org.junit.Test;

public class CsvWriterTests {
	
	@Test
	public void testWriterUsersList() throws Exception {
		String testFile = new File(this.getClass().getResource("/tests/resources/test.csv").getFile()).getAbsolutePath();
		CsvWriter writer = new CsvWriter();
		CsvReader reader = new CsvReader();
		
		User firstUser = new User("foo@bar.com", "900150983cd24fb0d6963f7d28e17f72", "Jan Kowalski", UserRole.EMPLOYEE);
		User secondUser = new User("a@b.pl", "aa0150983cd24fb0d6963f7d28e17f14", "Anna Nowak", UserRole.GUEST);
		ArrayList<User> usersToWrite = new ArrayList<User>();
		usersToWrite.add(firstUser);
		usersToWrite.add(secondUser);
				
		boolean success = writer.writeUsersList(usersToWrite, testFile);
		
		assertEquals(true, success);
		
		ArrayList<User> usersFromRead = reader.readUsersList(testFile);
		
		assertEquals(2, usersFromRead.size());
		
		User firstReadUser = usersFromRead.get(0);
		User secondReadUser = usersFromRead.get(1);
		
		assertEquals("foo@bar.com", firstReadUser.mailAddress());
		assertEquals("Jan Kowalski", firstReadUser.name());
		assertEquals("a@b.pl", secondReadUser.mailAddress());
		assertEquals(UserRole.GUEST, secondReadUser.role());
	
	}

	@Test
	public void testUserLine() {
		CsvWriter writer = new CsvWriter();
		User user = new User("foo@bar.com", "900150983cd24fb0d6963f7d28e17f72", "Jan Kowalski", UserRole.EMPLOYEE);
		String line = writer.userLine(user);
		
		assertEquals("foo@bar.com,900150983cd24fb0d6963f7d28e17f72,Jan Kowalski,employee", line);
	}
	
	@Test
	public void testWriterRoomsList() throws Exception {
		String testFile = new File(this.getClass().getResource("/tests/resources/test.csv").getFile()).getAbsolutePath();
		CsvWriter writer = new CsvWriter();
		CsvReader reader = new CsvReader();
		
		Room firstRoom = new Room(7, 2, 140, true, false, false);
		Room secondRoom = new Room(15, 3, 190, false, true, true);
		ArrayList<Room> roomsToWrite = new ArrayList<Room>();
		roomsToWrite.add(firstRoom);
		roomsToWrite.add(secondRoom);
				
		boolean success = writer.writeRoomsList(roomsToWrite, testFile);
		
		assertEquals(true, success);
		
		ArrayList<Room> roomsFromRead = reader.readRoomsList(testFile);
		
		assertEquals(2, roomsFromRead.size());
		
		Room firstReadRoom = roomsFromRead.get(0);
		Room secondReadRoom = roomsFromRead.get(1);
		
		assertEquals(7, firstReadRoom.number());
		assertEquals(140, firstReadRoom.price());
		assertEquals(true, firstReadRoom.hasBath());
		assertEquals(false, firstReadRoom.hasGoodWindowView());
		assertEquals(15, secondReadRoom.number());
		assertEquals(true, secondReadRoom.hasGoodWindowView());
	
	}	
	
	@Test
	public void testRoomLine() {
		CsvWriter writer = new CsvWriter();
		Room room = new Room(7, 2, 140, true, false, false);
		String line = writer.roomLine(room);
		
		assertEquals("7,2,140,true,false,false", line);
	}
	
	@Test
	public void testWriterReservationsList() throws Exception {
		String testFile = new File(this.getClass().getResource("/tests/resources/test.csv").getFile()).getAbsolutePath();
		CsvWriter writer = new CsvWriter();
		CsvReader reader = new CsvReader();
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		
		Calendar startDate = Calendar.getInstance();
		startDate.setTime(format.parse("20-11-2014"));
		Calendar endDate = Calendar.getInstance();
		endDate.setTime(format.parse("22-11-2014"));
		Reservation firstReservation = new Reservation(14, startDate, endDate, "pracownik@hotel.com", "anna@nowak.pl");		
		
		Calendar startDate2 = Calendar.getInstance();
		startDate2.setTime(format.parse("13-03-2015"));
		Calendar endDate2 = Calendar.getInstance();
		endDate2.setTime(format.parse("20-03-2015"));
		Reservation secondReservation = new Reservation(251, startDate2, endDate2, "jan@kowalski.net", "jan@kowalski.net");		
		
		
		ArrayList<Reservation> reservationsToWrite = new ArrayList<Reservation>();
		reservationsToWrite.add(firstReservation);
		reservationsToWrite.add(secondReservation);
				
		boolean success = writer.writeReservationsList(reservationsToWrite, testFile);
		
		assertEquals(true, success);
		
		ArrayList<Reservation> reservationsFromRead = reader.readReservationsList(testFile);
		
		assertEquals(2, reservationsFromRead.size());
		
		Reservation firstReadReservation = reservationsFromRead.get(0);
		Reservation secondReadReservation = reservationsFromRead.get(1);
		
		assertEquals(14, firstReadReservation.roomNumber());
		assertEquals(2014, firstReadReservation.startDate().get(Calendar.YEAR));
		assertEquals("pracownik@hotel.com", firstReadReservation.reservingUserMail());
		assertEquals(251, secondReadReservation.roomNumber());		
		assertEquals("jan@kowalski.net", secondReadReservation.clientMail());
		assertEquals(13, secondReadReservation.startDate().get(Calendar.DAY_OF_MONTH));
	}		
	
	@Test
	public void testReservationLine() throws Exception {
		CsvWriter writer = new CsvWriter();
		
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		Calendar startDate = Calendar.getInstance();
		startDate.setTime(format.parse("20-11-2014"));
		Calendar endDate = Calendar.getInstance();
		endDate.setTime(format.parse("22-11-2014"));
		
		Reservation reservation = new Reservation(14, startDate, endDate, "pracownik@hotel.com", "anna@nowak.pl");
		String line = writer.reservationLine(reservation);
		
		assertEquals("14,20-11-2014,22-11-2014,pracownik@hotel.com,anna@nowak.pl", line);
	}	

}
