package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import dao.BoardDao;
import domain.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BoardviewController implements Initializable {
	
	Board board = BoardlistController.board;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
			// 조회수 증가
			BoardDao.getboardDao().viewupdate( board.getB_no() );
			
		txttitle.setText( board.getB_title()  );
		txtcontents.setText( board.getB_contents() );
		lblwriter.setText( "작성자 : " + board.getB_write() );
		lbldate.setText("작성일 : "+ board.getB_date().split(" ")[0] );
		lblview.setText("조회수 : " + ( board.getB_view() + 1 ) );
	
		
		if( !MainpageController.getinstance().getloginid()
				.equals( board.getB_write() ) ) {
			// 게시물 작성자와 로그인된 아이디가 다를경우 
				// 버튼 숨기기 
			btndelete.setVisible(false);
			btnupdate.setVisible(false);
		}
	//		txttitle.setDisable(false);
	//		txtcontents.setDisable(false);
	//		txttitle.setEditable(false);
	//		txtcontents.setEditable(false);
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
    	
    	Alert alert = new Alert( AlertType.CONFIRMATION);
    	alert.setHeaderText("해당 게시물을 삭제하시겠습니까?");
    	alert.setTitle("알림");
    	Optional<ButtonType> optional = alert.showAndWait();
    	if( optional.get() == ButtonType.OK ) {
    		// 삭제 진행 
    		boolean result = BoardDao.getboardDao().delete( board.getB_no() );
    		if(result) { MainpageController.getinstance().loadpage("boardlist"); }
    	}
    }

    @FXML
    void replywrite(ActionEvent event) {

    }

    boolean upcheck = true;  // 업데이트 버튼 스위치 변수 
    @FXML
    void update(ActionEvent event) {
    	Alert alert = new Alert( AlertType.INFORMATION );
    	if(upcheck ) {
	    	alert.setHeaderText("내용 수정후 다시 버튼 클릭시 수정 완료 됩니다");
	    	alert.showAndWait();
	    	txttitle.setEditable(true);
	    	txtcontents.setEditable(true);
	    	upcheck = false;
    	}
    	else {
    		BoardDao.getboardDao().update( board.getB_no() , txttitle.getText() , txtcontents.getText() );// DB 처리
    		alert.setHeaderText("게시물이 수정 되었습니다.");
	    	alert.showAndWait();
	    	upcheck = true;
	    	txttitle.setEditable(false);
	    	txtcontents.setEditable(false);
    	}
    		
    }

}
























