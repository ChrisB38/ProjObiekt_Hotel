package projobiekt_hotel;

import java.util.Date;

public class Reservation {
    
    public Reservation(int reservedRoomNumber, Date reservationStart, Date reservationEnd,
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
    
    public Date startDate(){
    	return reservationStart;
    }
    
    public Date endDate(){
    	return reservationEnd;
    }
    
    public void setStartDate(Date reservationStart){
    	this.reservationStart = reservationStart;
    }
    
    public void setEndDate(Date reservationEnd){
    	this.reservationEnd = reservationEnd;
    }
    
//    public User reservingUser(){
//    	// TODO to implement with parameter cloud
//    }
//    
//    public User client(){
//    	
//    }
    
    private int reservedRoomNumber;
    private Date reservationStart;
    private Date reservationEnd;
    private String reservingUserMail;
    private String clientMail;
    
}
