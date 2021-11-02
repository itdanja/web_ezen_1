package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.BoardDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class BoardlistController implements Initializable {
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		System.out.println( 
				BoardDao.getboardDao().
				boardlist().toString()
				);
	}
	
	
	
    @FXML
    private TableView<?> boardlist;

    @FXML
    private Button btnwrite;

    @FXML
    void write(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardwrite");
    }
}
