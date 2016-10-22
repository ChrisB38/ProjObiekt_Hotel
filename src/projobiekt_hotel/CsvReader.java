package projobiekt_hotel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;


public class CsvReader {
	private static final String separator;
	
	static {
		separator = ",";
	}
	
	
	public ArrayList<User> readUsersList(String filename)
	{
		ArrayList<User> users = new ArrayList<User>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filename));
			
			String line;
			while( (line = reader.readLine()) != null) {
				try {
					User newUser = readUserLine(line);
					users.add(newUser);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return users;
	}
	
	public User readUserLine(String line) throws Exception
	{
		String[] elements = line.split(separator);
		if(elements.length != 4){
			throw new Exception("wrong line in csv file");
		}
		
		String mailAddress = elements[0];
		String passwordHash = elements[1];
		String name = elements[2];
		UserRole userRole = UserRole.fromString(elements[3]);
		
		return new User(mailAddress, passwordHash, name, userRole);
	}
	
	public ArrayList<Room> readRoomsList(String filename){
		ArrayList<Room> rooms = new ArrayList<Room>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filename));
			
			String line;
			while( (line = reader.readLine()) != null) {
				try {
					Room newRoom = readRoomLine(line);
					rooms.add(newRoom);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return rooms;
	}
	
	public Room readRoomLine(String line) throws Exception
	{
		String[] elements = line.split(separator);
		if(elements.length != 6){
			throw new Exception("wrong line in csv file");
		}
		
		int roomNumber = Integer.parseInt(elements[0]);
		int maxPeople = Integer.parseInt(elements[1]);
		int price = Integer.parseInt(elements[2]);
		boolean hasBath = Boolean.parseBoolean(elements[3]);
		boolean hasKitchen = Boolean.parseBoolean(elements[4]);
		boolean hasGoodWindowView = Boolean.parseBoolean(elements[5]);
		
		return new Room(roomNumber, maxPeople, price, hasBath, hasKitchen, hasGoodWindowView);
	}
	
	public ArrayList<Reservation> readReservationsList(String filename) {
		ArrayList<Reservation> reservations = new ArrayList<Reservation>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filename));
			
			String line;
			while( (line = reader.readLine()) != null) {
				try {
					Reservation newReservation = readReservationLine(line);
					reservations.add(newReservation);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return reservations;
	}
	
	public Reservation readReservationLine(String line) throws Exception {
		String[] elements = line.split(separator);
		if(elements.length != 5){
			throw new Exception("wrong line in csv file");
		}
		
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		
		int roomNumber = Integer.parseInt(elements[0]);
		Calendar startDate = Calendar.getInstance(); 
		startDate.setTime(format.parse(elements[1]));
		Calendar endDate = Calendar.getInstance(); 
		endDate.setTime(format.parse(elements[2]));
		String reservingUserMail = elements[3];
		String clientMail = elements[4];
		
		return new Reservation(roomNumber, startDate, endDate, reservingUserMail, clientMail);
	}

}
