package projobiekt_hotel;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class CsvWriter {

	public boolean writeUsersList(ArrayList<User> users, String filename) {
		try {
			PrintWriter writer = new PrintWriter(filename, "UTF-8");
			
			for (User user : users) {
				writer.println(userLine(user));
			}
			
			writer.close();
			
		} catch(Exception e) {
			System.out.println("Cannot write users list");
			return false;
		}
		
		return true;
	}
	
	public String userLine(User user){
		String line = "";
		
		line += user.mailAddress();
		line += "," + user.passwordHash();
		line += "," + user.name();
		line += "," + UserRole.toString(user.role());
		
		return line;
	}
	
	public boolean writeRoomsList(ArrayList<Room> rooms, String filename) {
		try {
			PrintWriter writer = new PrintWriter(filename, "UTF-8");
			
			for (Room room : rooms) {
				writer.println(roomLine(room));
			}
			
			writer.close();
			
		} catch(Exception e) {
			System.out.println("Cannot write rooms list");
			return false;
		}
		
		return true;
	}	
		
	public String roomLine(Room room) {
		String line = "";
		
		line += String.valueOf(room.number());
		line += "," + String.valueOf(room.people());
		line += "," + String.valueOf(room.price());
		line += "," + String.valueOf(room.hasBath());
		line += "," + String.valueOf(room.hasKitchen());
		line += "," + String.valueOf(room.hasGoodWindowView());
		
		return line;
	}
	
	public boolean writeReservationsList(ArrayList<Reservation> reservations, String filename) {
		try {
			PrintWriter writer = new PrintWriter(filename, "UTF-8");
			
			for (Reservation reservation : reservations) {
				writer.println(reservationLine(reservation));
			}
			
			writer.close();
			
		} catch(Exception e) {
			System.out.println("Cannot write reservations list");
			return false;
		}
		
		return true;
	}		
	
	public String reservationLine(Reservation reservation) {
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		Calendar startDate = reservation.startDate();
		Calendar endDate = reservation.endDate();
		String line = "";
		
		line += String.valueOf(reservation.roomNumber());
		line += "," + format.format(startDate.getTime());
		line += "," + format.format(endDate.getTime());
		line += "," + reservation.reservingUserMail();
		line += "," + reservation.clientMail();
				
		return line;
	}
	
}
