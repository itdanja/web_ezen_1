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
			// 조회수 증가
			BoardDao.getboardDao().viewupdate( board.getB_no() );
			
		txttitle.setText( board.getB_title()  );
		txtcontents.setText( board.getB_contents() );
		lblwriter.setText( "작성자 : " + board.getB_write() );
		lbldate.setText("작성일 : "+ board.getB_date().split(" ")[0] );
		lblview.setText("조회수 : " + board.getB_view() );
	
		
		if( !MainpageController.getinstance().getloginid()
				.equals( board.getB_write() ) ) {
			// 게시물 작성자와 로그인된 아이디가 다를경우 
				// 버튼 숨기기 
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
