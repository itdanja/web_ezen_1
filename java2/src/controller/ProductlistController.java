package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;

public class ProductlistController implements Initializable { // ȭ�� �ε�[����] �Ǿ����� �ʱⰪ �������̽� 
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		//1. DB���� ��ǰ��� ��������
		ObservableList<Product> products = ProductDao.getProductDao().productlist();
		//2. ��ǰ����� ���̺�信 �־��ֱ� 
		productlist.setItems(products);
		//3. ���̺�信 �� �� �ϳ��� �����ͼ� ����Ʈ�� ��ü�� �ʵ�� ���� 
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
			
		// ���̺�信�� Ŭ�������� ������ �������� 
			// 1. ���̺�信 Ŭ�� �̺�Ʈ 
			//productlist.setOnMouseClicked( e -> { ���� } );
			productlist.setOnMouseClicked( e -> { 
				// 2. Ŭ�� �̺�Ʈ�� ���콺 Ŭ���� ������ 
				if( e.getButton().equals( MouseButton.PRIMARY ) ) {
					// 3.���̺�信�� Ŭ���� ���� ������[ ��ü ]
					Product product = productlist.getSelectionModel().getSelectedItem();
					// 4. ���õ� ��ü�� �̹������ �������� 
					Image image = new Image( product.getP_img() );
					pimg.setImage( image );
					// 5. �׿�
					lblpname.setText( product.getP_name() );
					lblpcontents.setText( product.getP_contents() );
						// õ���� ��ǥ ���ڿ� ����� [ String.format("%,d", �� )  ]
					lblpprice.setText( String.format("%,d" , product.getP_price()  ) );
					lblmid.setText( 
							MemberDao.getMemberDao().midcheck( product.getM_no()) 
							);
					
				}
		
			} );
			
		
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
