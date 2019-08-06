/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system.room;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import java.util.List;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Keh Perick
 */
public class Room extends RecursiveTreeObject<Room>{
    
 
    public StringProperty rank;
    public IntegerProperty price;
    public StringProperty description;
    public StringProperty roomState;
    public BooleanProperty roomService;

    public Room(String rank, Integer price, String description,boolean roomService, String roomState) {
         
         this.rank=new SimpleStringProperty(rank);
         this.price= new SimpleIntegerProperty(price);
         this.description=new SimpleStringProperty(description);
         this.roomService=new SimpleBooleanProperty(roomService);
         this.roomState = new SimpleStringProperty(roomState);
         
    }

   

    
    public final String getRank() {
        return rank.get();
    }

    public final void setRank(String value) {
        rank.set(value);
    }

    public StringProperty rankProperty() {
        return rank;
    }

    public final int getPrice() {
        return price.get();
    }

    public final void setPrice(int value) {
        price.set(value);
    }

    public IntegerProperty priceProperty() {
        return price;
    }

    public final String getDescription() {
        return description.get();
    }

    public final void setDescription(String value) {
        description.set(value);
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public final String getRoomState() {
        return roomState.get();
    }

    public final void setRoomState(String value) {
        roomState.set(value);
    }

    public StringProperty roomStateProperty() {
        return roomState;
    }

    public final boolean isRoomService() {
        return roomService.get();
    }

    public final void setRoomService(boolean value) {
        roomService.set(value);
    }

    public BooleanProperty roomServiceProperty() {
        return roomService;
    }
    

    
}










