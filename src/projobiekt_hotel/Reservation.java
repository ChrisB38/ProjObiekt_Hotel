package projobiekt_hotel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Reservation {
    
    public Reservation(int reservedRoomNumber, Calendar reservationStart, Calendar reservationEnd,
    		String reservingUserMail, String clientMail) {
        this.reservedRoomNumber = reservedRoomNumber;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
        this.reservingUserMail = reservingUserMail;
        this.clientMail = clientMail;
    }
    
    public int roomNumber(){
    	return reservedRoomNumber;
    }
    
    public Calendar startDate(){
    	return reservationStart;
    }
    
    public Calendar endDate(){
    	return reservationEnd;
    }
    
    public String reservingUserMail(){
    	return reservingUserMail;
    }
    
    public String clientMail(){
    	return clientMail;
    }
    
    public void setStartDate(Calendar reservationStart){
    	this.reservationStart = reservationStart;
    }
    
    public void setEndDate(Calendar reservationEnd){
    	this.reservationEnd = reservationEnd;
    }
    
//    public User reservingUser(){
//    	// TODO to implement with parameter cloud
//    }
//    
//    public User client(){
//    	
//    }
    
    @Override
    public String toString() {
        String line = "";
	DateFormat format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
	Calendar startDate = this.startDate();
	Calendar endDate = this.endDate();
	line += String.valueOf(this.roomNumber());
	line += "," + format.format(startDate.getTime());
	line += "," + format.format(endDate.getTime());
	line += "," + this.reservingUserMail();
	line += "," + this.clientMail();
				
	return line;
    }
    
    private int reservedRoomNumber;
    private Calendar reservationStart;
    private Calendar reservationEnd;
    private String reservingUserMail;
    private String clientMail;
    
}
