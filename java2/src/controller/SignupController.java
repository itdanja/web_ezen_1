package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class SignupController {

    @FXML
    private Label btnback;

    @FXML
    private AnchorPane signuppane;

    @FXML
    void back(MouseEvent event) {
    		// !! ���ο� ��ü ����ÿ��� ���ο� �޸�
    	// LoginController loginController = new LoginController();
    		
    		// ������ �޸� ����ϱ� ���ؼ� this Ű���带 ����� ��ü ȣ�� 
    	LoginController.getinstance().loadpage("login");
    }
}
