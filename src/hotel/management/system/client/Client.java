/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system.client;

/**
 *
 * @author Keh Perick
 */
public class Client {
    
    private String name;
    private String idNumber;
    private int age;
    private int duration;
    private int roomsNeeded;
    
    //instantiating the class constructor;
    public Client(){
        
    }

    //constructor holding value initial value state
    public Client(String name, String idNumber, int duration, int roomsNeeded) {
        this.name = name;
        this.idNumber = idNumber;
        this.duration = duration;
        this.roomsNeeded = roomsNeeded;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRoomsNeeded() {
        return roomsNeeded;
    }

    public void setRoomsNeeded(int roomsNeeded) {
        this.roomsNeeded = roomsNeeded;
    }
    
    
}



