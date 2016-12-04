package projobiekt_hotel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Reservation {
    
    public Reservation(long reservedRoomNumber, Calendar reservationStart, Calendar reservationEnd,
    		String employeeMail, String clientMail) {
        this.reservedRoomNumber = reservedRoomNumber;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
        this.employeeMail = employeeMail;
        this.clientMail = clientMail;
    }
    
    public long roomNumber(){
    	return reservedRoomNumber;
    }
    
    public Calendar startDate(){
    	return reservationStart;
    }
    
    public Calendar endDate(){
    	return reservationEnd;
    }
    
    public String employeeMail(){
    	return employeeMail;
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
    
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeMail = employeeEmail;
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
        if(MainFrame.loggedUser == null || MainFrame.loggedUser.role() == UserRole.GUEST) {
            return line;
        }
	line += "," + this.employeeMail();
	line += "," + this.clientMail();
				
	return line;
    }
    
    private long reservedRoomNumber;
    private Calendar reservationStart;
    private Calendar reservationEnd;
    private String employeeMail;
    private String clientMail;
    
}
