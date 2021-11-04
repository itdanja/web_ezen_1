package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.ProductDao;
import domain.Product;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

public class ProductlistController implements Initializable { // 화면 로드[열림] 되었을때 초기값 인터페이스 
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		//1. DB에서 제품목록 가져오기
		ObservableList<Product> products = ProductDao.getProductDao().productlist();
		//2. 제품목록을 테이블뷰에 넣어주기 
		productlist.setItems(products);
		//3. 테이블뷰에 열 를 하나씩 가져와서 리스트내 객체에 필드와 연결 
		TableColumn tc = productlist.getColumns().get(0);
			tc.setCellValueFactory( new PropertyValueFactory<>("p_name"));
		tc = productlist.getColumns().get(1);
			tc.setCellValueFactory( new PropertyValueFactory<>("p_category"));
		tc = productlist.getColumns().get(2);
			tc.setCellValueFactory( new PropertyValueFactory<>("p_price"));
		tc = productlist.getColumns().get(3);
			tc.setCellValueFactory( new PropertyValueFactory<>("p_activation"));
		tc = productlist.getColumns().get(4);
			tc.setCellValueFactory( new PropertyValueFactory<>("p_date"));
			
		
	}
	
	@FXML
    private Button btndelete;

    @FXML
    private Button btnregister;

    @FXML
    private Button btnupdate;

    @FXML
    private Label lblmid;

    @FXML
    private Label lblpcontents;

    @FXML
    private Label lblpname;

    @FXML
    private Label lblpprice;

    @FXML
    private ImageView pimg;

    @FXML
    private TableView<Product> productlist;

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void register(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productregister");
    }

    @FXML
    void update(ActionEvent event) {

    }

}
