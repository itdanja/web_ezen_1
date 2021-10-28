package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class LoginController {
	

    @FXML
    private Label btnsignup;

    @FXML
    private AnchorPane loginpane;

    @FXML
    private BorderPane mainboardpane;

    @FXML
    void signup(MouseEvent event) {
    	loadpage("signup");
    }
    // boarderpane center º¯°æ 
    public void loadpage( String page ) {
    	try {
    		Parent parent = FXMLLoader.load(
    				getClass().getResource("/fxml/"+page+".fxml"));
    		mainboardpane.setCenter(parent);
    	}
    	catch (Exception e) {}
    }
    
	

}
