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
import java.net.URL;
import java.util.ResourceBundle;
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
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Keh Perick
 */
public class TestForLoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
     @FXML
    private JFXButton loginBtn;
    @FXML
    private JFXTextField usernameField;
    @FXML
    private JFXPasswordField passwordField;
    @FXML
    private AnchorPane loginPane;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }   
    
    @FXML
    private void gainAccess(ActionEvent event){
         JFXSnackbar errorSnackBar=new JFXSnackbar(loginPane);
            
        EventHandler handler=(EventHandler) (Event event1) -> {
            System.out.println("Try again");
            usernameField.setText("");
            usernameField.setFocusTraversable(true);
            passwordField.setText("");
            errorSnackBar.close();
        };
        if (!usernameField.getText().equals("paul") || !usernameField.getText().equals("password")) {
           
            errorSnackBar.show("Username  or  password  is  incorrect. Please try again","Try again", 5000,handler);
            
            errorSnackBar.setEffect(new DropShadow(4, Color.rgb(0, 0, 0, .251)));
            
        }
        
        else if (usernameField.getText().equals("admin") && passwordField.getText().equals("admin")){
            System.out.println("Login Successfull");
        }
    }

    
}










