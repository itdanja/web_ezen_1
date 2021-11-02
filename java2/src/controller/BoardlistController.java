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
		
		// 1. DAO ȣ�� 
		ObservableList<Board> boards =  BoardDao.getboardDao().boardlist();
		// 2. ���̺���� �ʵ� ��������  
		TableColumn tc = boardlist.getColumns().get(0);// ���̺���� ù��° �ʵ� 
		tc.setCellValueFactory( new PropertyValueFactory<>("b_no")); // ��ü�� �ʵ�� [ ����Ʈ�� ��üȭ Ŭ������ �ʵ�� ���� ] 
										
			tc = boardlist.getColumns().get(1); // ���̺���� �ι�° �ʵ� 
			tc.setCellValueFactory( new PropertyValueFactory<>("b_title"));
			
			tc = boardlist.getColumns().get(2); // ���̺���� ����° �ʵ� 
			tc.setCellValueFactory( new PropertyValueFactory<>("b_write"));
			
			tc = boardlist.getColumns().get(3); // ���̺���� �׹�° �ʵ� 
			tc.setCellValueFactory( new PropertyValueFactory<>("b_date") );
			
			tc = boardlist.getColumns().get(4); // ���̺���� �ټ���° �ʵ� 
			tc.setCellValueFactory( new PropertyValueFactory<>("b_view") );
		
		// 3. ���̺�信 ����Ʈ ����
		boardlist.setItems(boards);
		// 4. Ŭ���� �������� ������ ������ ��ȯ
		//boardlist.setOnMouseClicked( e -> { ���� return } );
				//  �μ� -> ���� : �͸�޼ҵ� [ 1ȸ�� �޼ҵ� ]
		boardlist.setOnMouseClicked( e -> { 
			if( e.getButton().equals( MouseButton.PRIMARY ) ) { // �ش� �̺�Ʈ�� Ŭ���̸� 
				board = boardlist.getSelectionModel().getSelectedItem();
								// ���̺�信 ���õ� ���� ������[ ��ü ]
				MainpageController.getinstance().loadpage("boardview");
			}
		} ) ;		
	}
	public static Board board;
	
    @FXML
    private TableView<Board> boardlist;
    			// ���̺� ���� ��ü�� Ŭ������ : ���׸�

    @FXML
    private Button btnwrite;

    @FXML
    void write(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardwrite");
    }
}















