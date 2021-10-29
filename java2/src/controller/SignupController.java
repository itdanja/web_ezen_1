package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class SignupController {

    @FXML
    private Label btnback;

    @FXML
    private Button btnsignup;

    @FXML
    private Label lblconfirm;

    @FXML
    private AnchorPane signuppane;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtid;

    @FXML
    private TextField txtname;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private PasswordField txtpasswordconfirm;

    @FXML
    void signup(ActionEvent event) {

    }

    @FXML
    void back(MouseEvent event) {
    		// !! 새로운 객체 선언시에는 새로운 메모리
    	// LoginController loginController = new LoginController();
    		
    		// 동일한 메모리 사용하기 위해서 this 키워드를 사용한 객체 호출 
    	LoginController.getinstance().loadpage("login");
    }
}
