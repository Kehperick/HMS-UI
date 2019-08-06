/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system.connection;

import hotel.management.system.room.Room;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Keh Perick
 */
public class Connection {
    
    //driver name and database url
    private static final String JDBC_DRIVER= "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/HMS";
    
    //database credentials
    private final String USER = "root";
    private final String PASSWORD = "admin";
    private java.sql.Connection connection = null;
    private Statement statement =  null;
    private boolean isConnected =  false;
    
    
    //instantiating a connection in the constructor
    public Connection(){
        try {
            //registring the jdbc driver
            Class.forName(JDBC_DRIVER);
            
            //opening connection to database
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            isConnected=true;
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot register driver");
        } catch (SQLException ex) {
            Logger.getLogger("cannot establish connection with database\nperhaps"
                    + "your credentials is wron").log(Level.OFF, null, ex);
            
        }
    }
    
    //executing a statement to get all available rooms from the database
    public ResultSet getAllRooms() throws SQLException{
        String sql = "SELECT * FROM  room;";
        if(isConnected){
            System.out.println("Connected...Awaiting Transaction\n");
            try {
            statement= connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger("cannot create staetment from the connection being processed").log(Level.SEVERE, null, ex);
        }
        }
        System.out.println("Transaction Done Successfully...\n");
        
        return statement.executeQuery(sql);
    }
    
    public ResultSet getAllClientsInfo() throws SQLException{
        String sql= "SELECT * FROM table client";
        if(isConnected){
            try {
                statement = connection.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger("cannot create sql statement").log(Level.SEVERE, null, ex);
            }
            
        }
        return statement.executeQuery(sql);
    }
    
    //generating an observable list of rooms
    public ObservableList<Room> roomList() throws SQLException{
        ObservableList<Room> list=FXCollections.observableArrayList();
        
        ResultSet rs=getAllRooms();
        
        while (rs.next()) {
        Room room=new Room("2 star", 2500, "its a 2 star room", false, "FREE");
           //retrive column by name
           room.setRank(String.format("%d", rs.getInt("rank")));
           room.setPrice(rs.getInt("price"));
           room.setDescription(rs.getString("description"));
           room.setRoomState(rs.getString("avalability"));
           list.add(new Room(room.getRank(), room.getPrice(), room.getDescription(), false, room.getRoomState()));
        }
        rs.close();
        return list;
    }
    
    //close the dataase connection
    public void closeConnection() throws SQLException{
        if (isConnected) {
            statement.close();
            connection.close();
        }
    }
}















