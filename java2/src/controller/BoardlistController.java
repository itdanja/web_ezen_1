package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import dao.BoardDao;
import domain.Board;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class BoardlistController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// 1. DAO 호출 
		ObservableList<Board> boards =  BoardDao.getboardDao().boardlist();
		// 2. 테이블뷰의 필드 가져오기  
		TableColumn tc = boardlist.getColumns().get(0);// 테이블뷰의 첫번째 필드 
		tc.setCellValueFactory( new PropertyValueFactory<>("b_no")); // 객체내 필드명 [ 리스트내 객체화 클래스내 필드명 동일 ] 
										
			tc = boardlist.getColumns().get(1); // 테이블뷰의 두번째 필드 
			tc.setCellValueFactory( new PropertyValueFactory<>("b_title"));
			
			tc = boardlist.getColumns().get(2); // 테이블뷰의 세번째 필드 
			tc.setCellValueFactory( new PropertyValueFactory<>("b_write"));
			
			tc = boardlist.getColumns().get(3); // 테이블뷰의 네번째 필드 
			tc.setCellValueFactory( new PropertyValueFactory<>("b_date") );
			
			tc = boardlist.getColumns().get(4); // 테이블뷰의 다섯번째 필드 
			tc.setCellValueFactory( new PropertyValueFactory<>("b_view") );
		
		// 3. 테이블뷰에 리스트 설정
		boardlist.setItems(boards);
		// 4. 클릭한 아이템을 가지고 페이지 전환
		//boardlist.setOnMouseClicked( e -> { 정의 return } );
				//  인수 -> 정의 : 익명메소드 [ 1회성 메소드 ]
		boardlist.setOnMouseClicked( e -> { 
			if( e.getButton().equals( MouseButton.PRIMARY ) ) { // 해당 이벤트가 클릭이면 
				board = boardlist.getSelectionModel().getSelectedItem();
								// 테이블뷰에 선택된 모델의 아이템[ 객체 ]
				MainpageController.getinstance().loadpage("boardview");
			}
		} ) ;		
	}
	public static Board board;
	
    @FXML
    private TableView<Board> boardlist;
    			// 테이블에 넣을 객체의 클래스명 : 제네릭

    @FXML
    private Button btnwrite;

    @FXML
    void write(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardwrite");
    }
}















