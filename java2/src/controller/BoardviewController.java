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
		// ��� ����Ʈ �ε� 
		replytableload();
	
			// ��ȸ�� ����
			BoardDao.getboardDao().viewupdate( board.getB_no() );
			
		txttitle.setText( board.getB_title()  );
		txtcontents.setText( board.getB_contents() );
		lblwriter.setText( "�ۼ��� : " + board.getB_write() );
		lbldate.setText("�ۼ��� : "+ board.getB_date().split(" ")[0] );
		lblview.setText("��ȸ�� : " + ( board.getB_view() + 1 ) );
	
		
		if( !MainpageController.getinstance().getloginid()
				.equals( board.getB_write() ) ) {
			// �Խù� �ۼ��ڿ� �α��ε� ���̵� �ٸ���� 
				// ��ư ����� 
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

    // ���̺� �� �ε� �޼ҵ� [ ���� ��ħ�� �ϱ����ؼ� �޼ҵ�ȭ ] 
    public void replytableload() {
    	
    	ObservableList< Reply > replys = BoardDao.getboardDao().replylist( board.getB_no() );
    	
    	TableColumn tc = replylist.getColumns().get(0); // ���̺� ù��° �� 
    	tc.setCellValueFactory( new PropertyValueFactory<>("r_no")); // ����Ʈ�� ��۹�ȣ
    	
    	tc = replylist.getColumns().get(1); // ���̺� �ι�° �� 
    	tc.setCellValueFactory( new PropertyValueFactory<>("r_write")); // ����Ʈ�� ����ۼ��� 
    	
    	tc = replylist.getColumns().get(2); // ���̺� ����° �� 
    	tc.setCellValueFactory( new PropertyValueFactory<>("r_contents"));  // ����Ʈ�� ��۳���
    	
    	
    	tc = replylist.getColumns().get(3); // ���̺� �׹�° �� 
    	tc.setCellValueFactory( new PropertyValueFactory<>("r_date"));   // ����Ʈ�� ����ۼ��� 
    	
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
    	alert.setHeaderText("�ش� �Խù��� �����Ͻðڽ��ϱ�?");
    	alert.setTitle("�˸�");
    	Optional<ButtonType> optional = alert.showAndWait();
    	if( optional.get() == ButtonType.OK ) {
    		// ���� ���� 
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
    		alert.setHeaderText("��� ���");
    		alert.showAndWait();
    		// ��� ����Ʈ �ε�
    		replytableload();
    		// ��� �Է�â �ʱ�ȭ
    		txtreply.setText("");
    	}
    }

    boolean upcheck = true;  // ������Ʈ ��ư ����ġ ���� 
    @FXML
    void update(ActionEvent event) {
    	Alert alert = new Alert( AlertType.INFORMATION );
    	if(upcheck ) {
	    	alert.setHeaderText("���� ������ �ٽ� ��ư Ŭ���� ���� �Ϸ� �˴ϴ�");
	    	alert.showAndWait();
	    	txttitle.setEditable(true);
	    	txtcontents.setEditable(true);
	    	upcheck = false;
    	}
    	else {
    		BoardDao.getboardDao().update( board.getB_no() , txttitle.getText() , txtcontents.getText() );// DB ó��
    		alert.setHeaderText("�Խù��� ���� �Ǿ����ϴ�.");
	    	alert.showAndWait();
	    	upcheck = true;
	    	txttitle.setEditable(false);
	    	txtcontents.setEditable(false);
    	}
    		
    }

}
























