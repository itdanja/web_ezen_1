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

public class MyinfoController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// 1. �α��ε� ���̵��� DB���� ȸ������ ã�� 
		String loginid = MainpageController.getinstance().getloginid();
		Member member =  MemberDao.getMemberDao().getmember(loginid);
		// 2. DB���� ã�� ȸ������ ���̺� �ֱ� 
		lblid.setText( member.getM_id() );
		lblname.setText( member.getM_name() );
		lblemail.setText( member.getM_email() );
		lblpoint.setText( member.getM_point() + "" );
	}
	
    @FXML
    private Label lblpoint;
	
    @FXML
    private Button btndelete;

    @FXML
    private Button btnupdate;

    @FXML
    private Label lblemail;

    @FXML
    private Label lblid;

    @FXML
    private Label lblname;

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {

    }

}
