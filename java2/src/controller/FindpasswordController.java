package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class FindpasswordController {
    @FXML
    private Label btnback;

    @FXML
    private Button btnfindpassword;

    @FXML
    private AnchorPane findpasswordpane;

    @FXML
    private Label lblconfirm;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtid;

    @FXML
    void back(MouseEvent event) {
    	LoginController.getinstance().loadpage("login");
    }

    @FXML
    void findpassword(ActionEvent event) {

    }
}
