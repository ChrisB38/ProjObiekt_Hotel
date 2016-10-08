/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projobiekt_hotel;

import java.util.Date;
/**
 *
 * @author Bieron
 */
public class Reservations {
    
    public Reservations(long reservedRoomNumber,Date reservationStart, Date reservationEnd) {
        this.reservedRoomNumber = reservedRoomNumber;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
    }
    
    private long reservedRoomNumber;
    private Date reservationStart;
    private Date reservationEnd;
    
}
