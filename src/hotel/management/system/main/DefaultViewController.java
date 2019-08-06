/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system.main;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import hotel.management.system.HomepageController;
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

/**
 * FXML Controller class
 *
 * @author Keh Perick
 */
public class DefaultViewController implements Initializable {

    @FXML
    private AnchorPane rghtAnchorpane;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pendAction(ActionEvent event) {
    }

    @FXML
    private void goto5StarScene(ActionEvent event) {
          
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
    }

    @FXML
    private void goto2StarScene(ActionEvent event) {
    }
    
}



