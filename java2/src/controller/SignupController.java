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
    		// !! ���ο� ��ü ����ÿ��� ���ο� �޸�
    	// LoginController loginController = new LoginController();
    		
    		// ������ �޸� ����ϱ� ���ؼ� this Ű���带 ����� ��ü ȣ�� 
    	LoginController.getinstance().loadpage("login");
    }
}
