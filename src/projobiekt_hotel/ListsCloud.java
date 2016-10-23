package projobiekt_hotel;

import java.io.File;
import java.util.ArrayList;

public class ListsCloud {
	private static ListsCloud cloudInstance = new ListsCloud();
	
	public static ListsCloud getInstance(){
		return cloudInstance;
	}
	
	private ListsCloud(){
		initializeFilePaths();
		readListsFromFiles();
	}
	
	private void initializeFilePaths(){
		usersFile = new File(this.getClass().getResource("/projobiekt_hotel/resources/users.csv").getFile()).getAbsolutePath();
		roomsFile = new File(this.getClass().getResource("/projobiekt_hotel/resources/rooms.csv").getFile()).getAbsolutePath();
		reservationsFile = new File(this.getClass().getResource("/projobiekt_hotel/resources/reservations.csv").getFile()).getAbsolutePath();
	}
	
	private void readListsFromFiles(){
		CsvReader reader = new CsvReader();
	
		users = reader.readUsersList(usersFile);
		rooms = reader.readRoomsList(roomsFile);
		reservations = reader.readReservationsList(reservationsFile);
	}
	
	public ArrayList<User> users(){
		return users;
	}
	
	public ArrayList<Room> rooms(){
		return rooms;
	}
	
	public ArrayList<Reservation> reservations(){
		return reservations;
	}
	

	public boolean saveLists()
	{
		CsvWriter writer = new CsvWriter();
		
		boolean usersSuccess = writer.writeUsersList(users, usersFile);
		boolean roomsSuccess = writer.writeRoomsList(rooms, roomsFile);
		boolean reservationsSuccess = writer.writeReservationsList(reservations, reservationsFile);
		
		return usersSuccess && roomsSuccess && reservationsSuccess;
	}
	
	private String usersFile;
	private String roomsFile;
	private String reservationsFile;
	
	private ArrayList<User> users;
	private ArrayList<Room> rooms;
	private ArrayList<Reservation> reservations;
}
