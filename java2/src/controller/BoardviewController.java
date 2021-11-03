package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.BoardDao;
import domain.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BoardviewController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		Board board = BoardlistController.board;
			// ��ȸ�� ����
			BoardDao.getboardDao().viewupdate( board.getB_no() );
			
		txttitle.setText( board.getB_title()  );
		txtcontents.setText( board.getB_contents() );
		lblwriter.setText( "�ۼ��� : " + board.getB_write() );
		lbldate.setText("�ۼ��� : "+ board.getB_date().split(" ")[0] );
		lblview.setText("��ȸ�� : " + board.getB_view() );
	
		
		if( !MainpageController.getinstance().getloginid()
				.equals( board.getB_write() ) ) {
			// �Խù� �ۼ��ڿ� �α��ε� ���̵� �ٸ���� 
				// ��ư ����� 
			btndelete.setVisible(false);
			btnupdate.setVisible(false);
		}
		
	}
    @FXML
    private Label lbldate;

    @FXML
    private Label lblview;

    @FXML
    private Label lblwriter;
	
	
	@FXML
    private Button btncancel;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnreplywrite;

    @FXML
    private Button btnupdate;

    @FXML
    private TableView<?> replylist;

    @FXML
    private TextArea txtcontents;

    @FXML
    private TextField txttitle;

    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardlist");
    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void replywrite(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {

    }

	
}
