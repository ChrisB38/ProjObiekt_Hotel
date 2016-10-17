package projobiekt_hotel;

import java.io.File;
import java.util.ArrayList;

public class ListsCloud {
	private static ListsCloud cloudInstance = new ListsCloud();
	
	public static ListsCloud getInstance(){
		return cloudInstance;
	}
	
	private ListsCloud(){
		
	}
	
	private void readListsFromFiles(){
		CsvReader reader = new CsvReader();

		String usersFile = new File(this.getClass().getResource("/projobiekt_hotel/resources/users.csv").getFile()).getAbsolutePath();
		String roomsFile = new File(this.getClass().getResource("/projobiekt_hotel/resources/rooms.csv").getFile()).getAbsolutePath();
		String reservationsFile = new File(this.getClass().getResource("/projobiekt_hotel/resources/reservations.csv").getFile()).getAbsolutePath();
		
		users = reader.readUsersList(usersFile);
		rooms = reader.readRoomsList(roomsFile);
//		reservations = reader.readReservationsList(reservationsFile);
	}
	

	public void saveLists()
	{
		
	}
	
	private ArrayList<User> users;
	private ArrayList<Room> rooms;
	private ArrayList<Reservation> reservations;
}
