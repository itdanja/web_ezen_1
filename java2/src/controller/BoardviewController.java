package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import dao.BoardDao;
import domain.Board;
import domain.Reply;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BoardviewController implements Initializable {
	
	Board board = BoardlistController.board;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 댓글 리스트 로드 
		replytableload();
	
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
    private TextArea txtreply;
    
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
    private TableView<Reply> replylist;

    // 테이블 값 로드 메소드 [ 새로 고침을 하기위해서 메소드화 ] 
    public void replytableload() {
    	
    	ObservableList< Reply > replys = BoardDao.getboardDao().replylist( board.getB_no() );
    	
    	TableColumn tc = replylist.getColumns().get(0); // 테이블내 첫번째 열 
    	tc.setCellValueFactory( new PropertyValueFactory<>("r_no")); // 리스트내 댓글번호
    	
    	tc = replylist.getColumns().get(1); // 테이블내 두번째 열 
    	tc.setCellValueFactory( new PropertyValueFactory<>("r_write")); // 리스트내 댓글작성자 
    	
    	tc = replylist.getColumns().get(2); // 테이블내 세번째 열 
    	tc.setCellValueFactory( new PropertyValueFactory<>("r_contents"));  // 리스트내 댓글내용
    	
    	
    	tc = replylist.getColumns().get(3); // 테이블내 네번째 열 
    	tc.setCellValueFactory( new PropertyValueFactory<>("r_date"));   // 리스트내 댓글작성일 
    	
    	replylist.setItems(replys);
    }
    
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
    	Reply reply = new Reply( 
    			txtreply.getText() , 
    			MainpageController.getinstance().getloginid()  , 
    			board.getB_no()  
    			); 
    	boolean result =  BoardDao.getboardDao().replywrite( reply );
    	if( result  ) { 
    		Alert alert = new Alert( AlertType.INFORMATION); 
    		alert.setHeaderText("댓글 등록");
    		alert.showAndWait();
    		// 댓글 리스트 로드
    		replytableload();
    		// 댓글 입력창 초기화
    		txtreply.setText("");
    	}
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
























