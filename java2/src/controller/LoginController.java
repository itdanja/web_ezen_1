package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class LoginController implements Initializable {
										// �ʱ�ȭ ���õ� �޼ҵ� ����
	// ���� Ŭ������ ��üȭ [ Ŭ���� ��ü�� ��ü ] 
		// 1. static ���� ���� 
	private static LoginController instance;
	public LoginController() {
		// 2. ���� Ŭ������ �޸� ȣ�� = this
		instance = this; // [ ����Ŭ������ ��� ���� ]
	}
		// 3. private instance��ȯ
	public static LoginController getinstance() {
		return instance;
	}
	// fxml ����� �ʱⰪ ���� �޼ҵ� 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText(""); // ���޽����� ���� ����
	}
	
    @FXML
    private Label btnfindid;

    @FXML
    private Label btnfindpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Label btnsignup;

    @FXML
    private Label lblconfirm;

    @FXML
    private AnchorPane loginpane;

    @FXML
    private BorderPane mainboardpane;

    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    void findid(MouseEvent event) {
    	loadpage("findid");
    }

    @FXML
    void findpassword(MouseEvent event) {
    	loadpage("findpassword");
    }

    @FXML
    void login(ActionEvent event) {
    	
    	// 1. Dao��ü login�޼ҵ� ȣ�� [ login �޼ҵ��� ���̵�� ��й�ȣ �ֱ� ] 
    	boolean result =  MemberDao.getMemberDao()
    					.login(txtid.getText(), txtpassword.getText());
 
    	if( result ) {
    		lblconfirm.setText(" �α��� ���� ");
    	}else {
    		lblconfirm.setText(" �α��� ���� : ������ ȸ�������� �����ϴ�");
    	}
    	// �ƴϸ� ���� 
    }


    @FXML
    void signup(MouseEvent event) {
    	
    	loadpage("signup");
    }
    // boarderpane center ���� 
    public void loadpage( String page ) {
    	try {
    		Parent parent = FXMLLoader.load(
    				getClass().getResource("/fxml/"+page+".fxml"));
    		mainboardpane.setCenter(parent);
    	}
    	catch (Exception e) {}
    }
    
    
    
	

}
