/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import hotel.management.system.routes.Routes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Keh Perick
 */
public class HomepageController implements Initializable {

    @FXML
    private JFXTextField namefield;
    @FXML
    private JFXTextField ageField;
    @FXML
    private JFXDatePicker arrivalDateField;
    @FXML
    private JFXDatePicker offDateField;
    @FXML
    private JFXTextField roomCountField;
    @FXML
    private JFXButton pendBtn;
    @FXML
    private JFXButton to5Star;
    @FXML
    private JFXButton to3Star;
    @FXML
    private JFXButton to2Star;
    @FXML
    private AnchorPane rghtAnchorpane;
    @FXML
    private JFXButton bookRoomBtn;
    @FXML
    private JFXButton passClient;
    @FXML
    private JFXButton notificationBtn;
    @FXML
    private JFXButton historyBtn;
    @FXML
    private JFXButton helpBtn;
    @FXML
    private JFXButton aboutBtn;
    @FXML
    private JFXTextField idField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pendAction(ActionEvent event) {
        pendBtn.setDisable(true);
    }

    @FXML
    private void goto5StarScene(ActionEvent event) throws IOException {
      
           
            Task<Boolean> task=new Task<Boolean>() {
           @Override
           protected Boolean call() throws Exception {
          try{
             AnchorPane pane=FXMLLoader.load(getClass().getResource(Routes.ROOMLISTSCENE));
            rghtAnchorpane.getChildren().add(pane);
            // TODO
        } catch (IOException ex) {
            Logger.getLogger(HomepageController.class.getName()).log(Level.SEVERE, null, ex);
        }
          return true;
           }
       };
        Platform.runLater(task);
            // TODO
        
    }

    @FXML
    private void goto3StarScene(ActionEvent event) {
        Task<Boolean> task=new Task<Boolean>() {
           @Override
           protected Boolean call() throws Exception {
          try{
            BorderPane pane=FXMLLoader.load(getClass().getResource(Routes.ROOMLISTSCENE));
            rghtAnchorpane.getChildren().add(pane);
            // TODO
        } catch (IOException ex) {
            Logger.getLogger(HomepageController.class.getName()).log(Level.SEVERE, null, ex);
        }
          return true;
           }
       };
        Platform.runLater(task);
    }

    @FXML
    private void goto2StarScene(ActionEvent event) {
        Task<Boolean> task=new Task<Boolean>() {
           @Override
           protected Boolean call() throws Exception {
          try{
            AnchorPane pane=FXMLLoader.load(getClass().getResource(Routes.ROOMLISTSCENE));
            rghtAnchorpane.getChildren().add(pane);
            // TODO
        } catch (IOException ex) {
            Logger.getLogger(HomepageController.class.getName()).log(Level.SEVERE, null, ex);
        }
          return true;
           }
       };
        
        Platform.runLater(task);
    }

    @FXML
    private void openBookScene(ActionEvent event) throws IOException {
        AnchorPane pane=FXMLLoader.load(getClass().getResource(Routes.DEFAULTVIEW));
            rghtAnchorpane.getChildren().add(pane);
    }
    
}






















