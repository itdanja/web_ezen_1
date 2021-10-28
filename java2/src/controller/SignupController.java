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
    		// !! 새로운 객체 선언시에는 새로운 메모리
    	// LoginController loginController = new LoginController();
    		
    		// 동일한 메모리 사용하기 위해서 this 키워드를 사용한 객체 호출 
    	LoginController.getinstance().loadpage("login");
    }
}
