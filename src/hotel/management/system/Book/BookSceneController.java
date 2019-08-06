package hotel.management.system.Book;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import hotel.management.system.room.Room;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import hotel.management.system.connection.Connection;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
/**
 * FXML Controller class
 *
 * @author Keh Perick
 */
public class BookSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
      @FXML
    private JFXTreeTableView<Room> table;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
          try {
              
              //first make a connection
              Connection connect=new Connection();
              
              JFXTreeTableColumn<Room, String> roomRank= new JFXTreeTableColumn<>("Rank");
              roomRank.setPrefWidth(200);
              roomRank.setCellValueFactory((TreeTableColumn.CellDataFeatures<Room, String> param ) -> param.getValue().getValue().rank);
              
              
              JFXTreeTableColumn<Room, String> price= new JFXTreeTableColumn<>("Rank");
              price.setPrefWidth(200);
              price.setCellValueFactory((TreeTableColumn.CellDataFeatures<Room, String> param ) -> param.getValue().getValue().price.asString());
              
              
              JFXTreeTableColumn<Room, String> desc= new JFXTreeTableColumn<>("Description");
              desc.setPrefWidth(200);
              desc.setCellValueFactory((TreeTableColumn.CellDataFeatures<Room, String> param ) -> param.getValue().getValue().description);
              
              JFXTreeTableColumn<Room, String> roomSer= new JFXTreeTableColumn<>("Room Service");
              roomSer.setPrefWidth(200);
              roomSer.setCellValueFactory((TreeTableColumn.CellDataFeatures<Room, String> param ) -> param.getValue().getValue().roomService.asString());
              
              
              JFXTreeTableColumn<Room, String> roomstat= new JFXTreeTableColumn<>("Room State");
              roomstat.setPrefWidth(200);
              roomstat.setCellValueFactory((TreeTableColumn.CellDataFeatures<Room, String> param ) -> param.getValue().getValue().roomState);
              
              
              ObservableList<Room> roomObservableList=connect.roomList();
              // TODO
              
              
              
              
               
               Task task=new Task() {
                  @Override
                  protected Object call() throws Exception {
                      for (int i = 0; i < 100; i++) {
                    
           table.getColumns().setAll(roomRank,price,desc,roomstat,roomSer);
              
               final TreeItem<Room> root=new RecursiveTreeItem<>(roomObservableList, RecursiveTreeObject::getChildren);
               table.setRoot(root);
               table.setShowRoot(false);
               
                System.out.println(""+i);
                updateMessage(Integer.toString(i));
                
                }
            return true;
                  }
              };
               
               Platform.runLater(task);
               
               
               connect.closeConnection();
               
          } catch (SQLException ex) {
              Logger.getLogger(BookSceneController.class.getName()).log(Level.SEVERE, null, ex);
          }
               
    }    
    
}















