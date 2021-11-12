package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainpageController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		lblloginid.setText( LoginController.getinstance().getid() );
		loadpage("home"); // mainpage ���� ��� home.fxml ��ġ
	}
	
	@FXML
    private Button btnchatting;

    @FXML
    private Button btncommunity;

    @FXML
    private Button btnhome;

    @FXML
    private Button btnlogout;

    @FXML
    private Button btnmyinfo;

    @FXML
    private Button btnproduct;

    @FXML
    private AnchorPane cp;

    @FXML
    private Label lblloginid;

    @FXML
    private AnchorPane lp;

    @FXML
    private BorderPane mainpageborderpane;
    
    // ��üȭ 
    	// ���� 
    public static MainpageController instance;
    	// ������ 
    public MainpageController() {
		instance = this; // [ ���� Ŭ������ ��� ��� ���� ] 
	}
    	// ��ü ��ȯ 
    public static MainpageController getinstance() {
    	return instance;
    }
    
    public String getloginid() {
    	return lblloginid.getText();
    }
    
    // ��� pane �����ϴ� �޼ҵ� 
    public void loadpage( String page ) {
    	try {
    		Parent parent = FXMLLoader.load( 
    				getClass().getResource("/fxml/"+page+".fxml"));
    		mainpageborderpane.setCenter(parent);
    	}
    	catch (Exception e) {}
    }
    
    

    @FXML
    void chatting(ActionEvent event) {
    	loadpage("chatting");
    }

    @FXML
    void community(ActionEvent event) {
    	loadpage("boardlist");
    }

    @FXML
    void home(ActionEvent event) {
  
    	loadpage("home" );
    	
    }
    @FXML // �α׾ƿ� �޼ҵ� [ ���� �������� �ݰ� -> login �������� ���� ]  
    void logout(ActionEvent event) {
    	
    	// 0. �޽���â ���� [ Alert : �޽���Ŭ���� ] 
    	Alert alert = new Alert( AlertType.CONFIRMATION ); // Ȯ�� ��� ��ư
    	alert.setContentText(" �α׾ƿ� ");
    	alert.setHeaderText(" �α׾ƿ� �Ͻðڽ��ϱ�? ");
    	alert.setTitle("Ȯ��");
    	
    	// �޽��� ��ư�� �������� [ Optional Ŭ���� : null �������ִ� Ŭ���� ] 
    	Optional<ButtonType> optional = alert.showAndWait();
    	if( optional.get() == ButtonType.OK ) { // ��ưŸ���� ok �̸� 
    		
    		// 1. main �������� ����� 
    		btnlogout.getScene().getWindow().hide();
    		
    		// 2. login �������� ���� 
    		Stage stage = new Stage();
    		try {
	    		Parent parent = FXMLLoader.load( getClass().getResource("/fxml/login.fxml"));
	    		Scene scene = new Scene( parent );
	    		stage.setScene(scene);
	    			stage.setResizable(false); // �������� ũ�� ���� 
	    			stage.setTitle("Nike"); // �������� �̸� 
	    			// �������� ������ 
	    				// 1. �̹��� �ҷ�����
	    				Image image = new Image("file:C:\\Users\\505-t\\git\\web_ezen_1\\java2\\src\\fxml\\stageicon.png");
	    				stage.getIcons().add(image);
	    		stage.show();
    		}
    		catch (Exception e) {
				// TODO: handle exception
			}
    		
    	}
    	
    }

    @FXML
    void myinfo(ActionEvent event) {
    	loadpage("myinfo");
    }

    @FXML
    void product(ActionEvent event) {
    	loadpage("productlist");
    }

}


















