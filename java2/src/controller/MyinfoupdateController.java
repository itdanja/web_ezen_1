package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MyinfoupdateController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 1. 로그인된 아이디의 DB에서 회원정보 찾기 
		String loginid = MainpageController.getinstance().getloginid();
		Member member =  MemberDao.getMemberDao().getmember(loginid);
		// 2. DB에서 찾은 회원정보 레이블에 넣기 
		lblid.setText( member.getM_id() );
		txtname.setText( member.getM_name() );
		txtemail.setText( member.getM_email() );
		lblpoint.setText( member.getM_point() + "" );
	}
    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("myinfo");
    }

    @FXML
    void update(ActionEvent event) {

    }

    @FXML
    private Button btncancel;

    @FXML
    private Button btnupdate;

    @FXML
    private Label lblid;

    @FXML
    private Label lblpoint;
    

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtname;


}
