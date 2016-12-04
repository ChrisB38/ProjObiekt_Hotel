package projobiekt_hotel;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
	
        public Reservation findReservation(String roomNumberStr,String dateStartStr,String dateEndStr,String employeeEmail,String clientEmail) {
            DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            for(Reservation reservation : reservations) {
                String reservRoomNumStr = String.valueOf(reservation.roomNumber());          
                String reservStartDateStr = format.format(reservation.startDate().getTime());
                String reservEndDateStr = format.format(reservation.endDate().getTime());
                
                if(employeeEmail.isEmpty() && clientEmail.isEmpty()) {
                  if(roomNumberStr.equals(reservRoomNumStr) && dateStartStr.equals(reservStartDateStr) && dateEndStr.equals(reservEndDateStr)) {
                    return  reservation;
                  }
                }
                
                if(employeeEmail.isEmpty() && MainFrame.loggedUser.role() == UserRole.GUEST) {
                  if(roomNumberStr.equals(reservRoomNumStr) && dateStartStr.equals(reservStartDateStr) && dateEndStr.equals(reservEndDateStr) && clientEmail.equals(reservation.clientMail()) ) {
                    return  reservation;
                  }
                }
                
                if(roomNumberStr.equals(reservRoomNumStr) && dateStartStr.equals(reservStartDateStr) && dateEndStr.equals(reservEndDateStr) && employeeEmail.equals(reservation.employeeMail()) && clientEmail.equals(reservation.clientMail()) ) {
                    return  reservation;
                }
            }
            return null;
        }
        
        public Room findRoom(String roomNumberStr) {
            for(Room room : rooms) {
                String currentRoomNumberStr = String.valueOf(room.number());
                if(roomNumberStr.equals(currentRoomNumberStr)) {
                    return room;
                }
            }
            return null;
        }
        
        public ArrayList<Reservation> CheckIfDatesContainReservation(Date checkedStartDate,Date checkedEndDate) {
            Calendar cal2 = Calendar.getInstance();
            Calendar cal4 = Calendar.getInstance();
            cal2.setTime(checkedStartDate);
            cal4.setTime(checkedEndDate);
            ArrayList<Reservation> foundReservations = new ArrayList();
            for(Reservation reservation : reservations) {
                Date startDate = reservation.startDate().getTime();
                Date endDate = reservation.endDate().getTime();
                Calendar cal1 = Calendar.getInstance();
                Calendar cal3 = Calendar.getInstance();           
                cal1.setTime(startDate);           
                cal3.setTime(endDate);          
                boolean sameFromDate = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)
                     && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
                boolean sameToDate = cal3.get(Calendar.YEAR) == cal4.get(Calendar.YEAR) && cal3.get(Calendar.DAY_OF_YEAR) == cal4.get(Calendar.DAY_OF_YEAR)
                     && cal3.get(Calendar.MONTH) == cal4.get(Calendar.MONTH);              
               
                if((checkedStartDate.before(startDate) || sameFromDate) && (checkedEndDate.after(endDate) || sameToDate)) {
                    foundReservations.add(reservation);
                }
                else if(checkedStartDate.after(startDate) && (checkedEndDate.before(endDate)) || sameToDate) {
                    foundReservations.add(reservation);
                }
                else if(checkedStartDate.after(startDate) && (checkedEndDate.after(endDate) || sameToDate)) {
                    foundReservations.add(reservation);
                }
           }
           return foundReservations;
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
