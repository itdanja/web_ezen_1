package controller;

import java.io.File;

import dao.MemberDao;
import dao.ProductDao;
import domain.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class ProdcutregisterController {
	
    @FXML
    private Button btncancel;

    @FXML
    private Button btnimgadd;

    @FXML
    private Button btnregister;

    @FXML
    private ToggleGroup category;

    @FXML
    private Label lblimgpath;

    @FXML
    private RadioButton opt_1;

    @FXML
    private RadioButton opt_2;

    @FXML
    private RadioButton opt_3;

    @FXML
    private RadioButton opt_4;

    @FXML
    private ImageView pimg;

    @FXML
    private TextArea txtpcontents;

    @FXML
    private TextField txtpname;

    @FXML
    private TextField txtprice;

    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productlist");
    }

    @FXML
    void register(ActionEvent event) {
    	// ��ȿ���˻� ���� 
    	String pname = txtpname.getText();	// ��ǰ��
    	String pcontents = txtpcontents.getText(); // ��ǰ���� 
    	int pprice = Integer.parseInt( txtprice.getText() ) ;// ���� // ������ ����ȯ 
    	String pcategory= "";
    		if( opt_1.isSelected() ) { pcategory="�Ƿ�";}	// �ش� ������ư�� Ŭ�������� 
    		if( opt_2.isSelected() ) { pcategory="�Ź�";}	
    		if( opt_3.isSelected() ) { pcategory="����";}
    		if( opt_4.isSelected() ) { pcategory="ACC";}
    		// �α��ε� id�� ȸ����ȣ �˻� dbó��
    		int m_no = MemberDao.getMemberDao().
    				bnocheck( MainpageController.getinstance().getloginid() );

    	// ��üȭ [ ���� �ʱⰪ = 1 ]  
    	Product product = new Product(pname, pimage, pcontents, pcategory, pprice, 1, m_no);
    	// DBó�� 
    	boolean result =  ProductDao.getProductDao().register(product);
    	
    	Alert alert = new Alert( AlertType.INFORMATION );
    	if( result ) {
    		alert.setHeaderText("��ǰ ��� ����"); alert.showAndWait();	// �޽���â ���� 
    		MainpageController.getinstance().loadpage("productlist"); // ������ ��ȯ 
    	}
    	
    }
    // ���� ��� ã�� 
    private String pimage; // ���ϰ�� ������ ���� 
    private Stage stage; // ���ϰ�� ã�� ȭ�� 
    @FXML
    void imgadd(ActionEvent event) {
    	
    	// 1. ���� ���� Ŭ���� 
    	FileChooser fileChooser = new FileChooser(); // ���� ���ý� ��� ���� 
    	// 2. ���� �������� ����  getExtensionFilters : ������ ���� ���� 
    	fileChooser.getExtensionFilters().add(
    			new ExtensionFilter("�׸����� : Image File" , "*png" , "*jpg" , "*gif" ) );
    	// 3. ���������� ���ϼ���Ŭ���� �ֱ� 
    	File file =  fileChooser.showOpenDialog(stage);
    		// * ������ ������ ����Ŭ������ ���� 
    	lblimgpath.setText("���� ��� : " + file.getPath() );
    		//
    	pimage = file.toURI().toString(); // ������ ����[real] ���
			//	    	System.out.println( "URL ��� : " + file.getPath() );
			//	    	System.out.println( "URI ���  : " + pimage );
    	Image image = new Image( pimage );
    	pimg.setImage(image);
    }


}














