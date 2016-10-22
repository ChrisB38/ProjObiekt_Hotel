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
    
    public Room(long roomNumber,int pepoleInRoom,long reservationPrice,boolean hasBath,boolean hasKitchen, boolean hasGoodWindowView) {
        this.roomNumber = roomNumber;
        this.pepoleInRoom = pepoleInRoom;
        this.reservationPrice = reservationPrice;
        this.hasBath = hasBath;
        this.hasKitchen = hasKitchen;
        this.hasGoodWindowView = hasGoodWindowView;
    }
    
    public long number(){
    	return roomNumber;
    }
    
    public int people() {
    	return pepoleInRoom;
    }
    
    public long price(){
    	return reservationPrice;
    }
    
    public boolean hasBath(){
    	return hasBath;
    }
    
    public boolean hasKitchen(){
    	return hasKitchen;
    }
    
    public boolean hasGoodWindowView(){
    	return hasGoodWindowView;
    }
    
    void setNumber(long number){
    	this.roomNumber = number;
    }
    
    void setNumberOfPeople(int peopleInRoom){
    	this.pepoleInRoom = peopleInRoom;
    }
    
    void setPrice(long price){
    	this.reservationPrice = price;
    }
    
    void setBath(boolean hasBath){
    	this.hasBath = hasBath;
    }
    
    void setKitchen(boolean hasKitchen){
    	this.hasKitchen = hasKitchen;
    }
    
    void setGoodWindowView(boolean hasGoodWindowView){
    	this.hasGoodWindowView = hasGoodWindowView;
    }
    
    private long roomNumber;
    private int pepoleInRoom;
    private long reservationPrice;
    private boolean hasBath;
    private boolean hasKitchen;
    private boolean hasGoodWindowView;
}
