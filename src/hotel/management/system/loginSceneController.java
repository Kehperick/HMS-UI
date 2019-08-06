/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSnackbar;
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
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Keh Perick
 */
public class loginSceneController implements Initializable {
    
    private Label label;
    @FXML
    private JFXButton loginBtn;
    @FXML
    private JFXTextField usernameField;
    @FXML
    private JFXPasswordField passwordField;
    @FXML
    private AnchorPane loginPane;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gotoHomepage(ActionEvent event) {
//        Task<Boolean> task=new Task<Boolean>() {
//           @Override
//           protected Boolean call() throws Exception {
//          try{
//            VBox pane=FXMLLoader.load(getClass().getResource(Routes.HOMEPAGE));
//            loginPane.getChildren().add(pane);
//            // TODO
//        } catch (IOException ex) {
//              System.out.println("Error");
//        }
//          return true;
//           }
//       };
//        
//        Platform.runLater(task);
        
         JFXSnackbar errorSnackBar=new JFXSnackbar(loginPane);
            System.out.println("Testing login in................\n");
        EventHandler handler=(EventHandler) (Event event1) -> {
            System.out.println("Try again");
            usernameField.setText("");
            usernameField.setFocusTraversable(true);
            passwordField.setText("");
            errorSnackBar.close();
        };
        if (!usernameField.getText().equals("paul") && !usernameField.getText().equals("password")) {
           
            errorSnackBar.show("Username  or  password  is  incorrect. Please try again","Try again", 5000,handler);
            
            errorSnackBar.setEffect(new DropShadow(4, Color.rgb(0, 0, 0, .251)));
            System.out.println("Login was not successful....\n");
        }
        
        else if (usernameField.getText().equals("paul") && passwordField.getText().equals("password")){
            Task <Boolean> task1=new Task<Boolean>() {
                @Override
                protected Boolean call() throws Exception {
                    Parent mainWindow=FXMLLoader.load(getClass().getResource(Routes.HOMEPAGE));
                    Scene scene=new Scene(mainWindow);
                    Stage appStage=(Stage) ((Node) event.getSource()).getScene().getWindow();
                    appStage.setScene(scene);
                    appStage.show();
                return true;
                }
            };
            
            System.out.println("Loging successfull...........\n");
            
            Platform.runLater(task1);
        }
    }


   
}









