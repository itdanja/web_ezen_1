package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import dao.MemberDao;
import dao.ProductDao;
import domain.Product;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;

public class ProductlistController implements Initializable { // 화면 로드[열림] 되었을때 초기값 인터페이스 
	
    @FXML
    private Button btnactivation;

    @FXML
    void activation(ActionEvent event) {
    
    	btnactivation.setText(product.getActivation());	// 1. 선택 제품의 상태가 버튼 텍스트에 표시 
    	int pa = product.getP_activation();				// 2. 선택 제품의 상태를 가져오기 
    	int ch = pa + 1;								// 3. 상태 변경 [ 1-> 2 , 2->3 , 3-> 1 ]
    	if( ch > 3 ) ch = 1;
    	
    	if( ch == 1 ) {	// 4. 변경된 상태가 1 이면 판매중 업데이트 처리 
    		ProductDao.getProductDao().activationupdate(  1  ,  product.getP_no() ); // 업데이트 db 처리
    		producttableload();	// 테이블 새로고침 
    		btnactivation.setText("판매중"); // 버튼 텍스트 변경
    	}
    	if( ch == 2 ) {	
    		ProductDao.getProductDao().activationupdate(  2  ,  product.getP_no() );
    		producttableload();
    		btnactivation.setText("거래중");
    	}
    	if( ch == 3 ) {
    		ProductDao.getProductDao().activationupdate(  3  ,  product.getP_no() );
    		producttableload();
    		btnactivation.setText("거래완료");
    	}
    	
    }
    
    public void producttableload() {
    	
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
    				tc.setCellValueFactory( new PropertyValueFactory<>("activation"));
    			tc = productlist.getColumns().get(4);
    				tc.setCellValueFactory( new PropertyValueFactory<>("p_date"));
    				
    			// 테이블뷰에서 클릭했을때 아이템 가져오기 
    				// 1. 테이블뷰에 클릭 이벤트 
    				//productlist.setOnMouseClicked( e -> { 정의 } );
    				productlist.setOnMouseClicked( e -> { 
    					// 2. 클릭 이벤트가 마우스 클릭과 같으면 
    					if( e.getButton().equals( MouseButton.PRIMARY ) ) {
    						// 3.테이블뷰에서 클릭한 모델의 아이템[ 객체 ]
    						product = productlist.getSelectionModel().getSelectedItem();
    						// 4. 선택된 객체내 이미지경로 가져오기 
    						Image image = new Image( product.getP_img() );
    						pimg.setImage( image );
    						// 5. 그외
    						lblpname.setText( product.getP_name() );
    						lblpcontents.setText( product.getP_contents() );
    							// 천단위 쉼표 문자열 만들기 [ String.format("%,d", 값 )  ]
    						lblpprice.setText( String.format("%,d" , product.getP_price()  ) );
    							// 회원번호 -> 회원id 
    						String writer = MemberDao.getMemberDao().midcheck( product.getM_no() );
    						lblmid.setText( writer );
    						if( MainpageController.getinstance().getloginid().equals(  writer )) {
    							// 로그인 아이디가 등록한 아이디와 동일하면 
    							btndelete.setVisible(true);
    							btnupdate.setVisible(true);
    							btnactivation.setVisible(true);
    						}else {
    							btndelete.setVisible(false);
    							btnupdate.setVisible(false);
    							btnactivation.setVisible(false);
    						}
    						// 버튼 텍스트 
    						btnactivation.setText( product.getActivation() );
    						
    					}
    				} );
    	
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 버튼 숨기기 
		btndelete.setVisible(false);
		btnupdate.setVisible(false);
		btnactivation.setVisible(false);
		producttableload();
		
	}
	
	public static Product product;
	
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
    	
    	Alert alert = new Alert( AlertType.CONFIRMATION );
    	alert.setHeaderText(" 제품을 삭제 하시겠습니까?" );
    	Optional<ButtonType> optional = alert.showAndWait();
    	if( optional.get() == ButtonType.OK ) {
    		// DB 처리 
    		ProductDao.getProductDao().delete( product.getP_no() );
    		
    		Alert alert2 = new Alert( AlertType.INFORMATION );
    		alert2.setHeaderText(" 삭제 되었습니다 "); alert2.showAndWait();
    		MainpageController.getinstance().loadpage("productlist");
    	}
    	
    }

    @FXML
    void register(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productregister");
    }

    @FXML
    void update(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productupdate");
    }

}
















