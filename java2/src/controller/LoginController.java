package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoginController implements Initializable {
										// 초기화 관련된 메소드 제공
	// 현재 클래스를 객체화 [ 클래스 자체의 객체 ] 
		// 1. static 변수 선언 
	private static LoginController instance;
	public LoginController() {
		// 2. 현재 클래스의 메모리 호출 = this
		instance = this; // [ 현재클래스의 멤버 포함 ]
	}
		// 3. private instance반환
	public static LoginController getinstance() {
		return instance;
	}
		// 4. 로그인시 입력된 아이디 반환 
	public String getid() {
		return txtid.getText();
	}
	
	// fxml 실행시 초기값 설정 메소드 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText(""); // 경고메시지는 공백 설정
		
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
    	
    	
    	// 1. Dao객체 login메소드 호출 [ login 메소드의 아이디와 비밀번호 넣기 ] 
    	boolean result =  MemberDao.getMemberDao()
    					.login(txtid.getText(), txtpassword.getText());
    	if( result ) {
    		lblconfirm.setText(" 로그인 성공 ");
    		MemberDao.getMemberDao().pointupdate(txtid.getText(), 10); // 로그인 성공시 포인트 + 10
    	
    		// 기존 스테이지 끄기 
    		btnlogin.getScene().getWindow().hide(); // 해당 버튼의 씬 윈도우 숨기기
    		
    		// 메인페이지 스테이지 실행 
    		Stage stage = new Stage();
    		try {
    			Parent parent = FXMLLoader.load( getClass().getResource("/fxml/mainpage.fxml"));
    			Scene scene = new Scene( parent );
    			// 폰트 로드 
    				//Font.loadFont( getClass().getResourceAsStream("/app/강한육군 Bold.ttf"), 14);
    			// 외부 스타일시트 적용 
    				//scene.getStylesheets().add(getClass().getResource("/app/application.css").toExternalForm());
    			stage.setScene(scene);
	    			stage.setResizable(false); // 스테이지 크기 고정 
	    			stage.setTitle("Nike"); // 스테이지 이름 
	    				Image image = new Image("file:C:\\Users\\505-t\\git\\web_ezen_1\\java2\\src\\fxml\\stageicon.png");
	    				stage.getIcons().add(image);
    			stage.show();
    		}
    		catch (Exception e) {
				// TODO: handle exception
			}
    		
    	}else {
    		lblconfirm.setText(" 로그인 실패 : 동일한 회원정보가 없습니다");
    	}
    	// 아니면 실패 
    }


    @FXML
    void signup(MouseEvent event) {
    	
    	loadpage("signup");
    }
    // boarderpane center 변경 
    public void loadpage( String page ) {
    	try {
    		Parent parent = FXMLLoader.load(
    				getClass().getResource("/fxml/"+page+".fxml"));
    		mainboardpane.setCenter(parent);
    	}
    	catch (Exception e) {}
    }
    
    
    
	

}
