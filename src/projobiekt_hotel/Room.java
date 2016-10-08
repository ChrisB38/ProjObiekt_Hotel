/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projobiekt_hotel;

/**
 *
 * @author Bieron
 */
public class Room {
    
    Room(long roomNumber,int pepoleInRoom,long reservationPrice,boolean hasBath,boolean hasKitchen, boolean hasGoodWindowView) {
        this.roomNumber = roomNumber;
        this.pepoleInRoom = pepoleInRoom;
        this.reservationPrice = reservationPrice;
        this.hasBath = hasBath;
        this.hasKitchen = hasKitchen;
        this.hasGoodWindowView = hasGoodWindowView;
    }
    
    private long roomNumber;
    private int pepoleInRoom;
    private long reservationPrice;
    private boolean hasBath;
    private boolean hasKitchen;
    private boolean hasGoodWindowView;
}
