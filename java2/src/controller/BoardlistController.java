package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class BoardlistController {
	
    @FXML
    private TableView<?> boardlist;

    @FXML
    private Button btnwrite;

    @FXML
    void write(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardwrite");
    }
}
