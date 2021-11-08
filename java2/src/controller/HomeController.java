package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import dao.BoardDao;
import dao.MemberDao;
import dao.ProductDao;
import domain.Product;
import domain.ProductDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class HomeController implements Initializable {
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// ��ü �� 
		lbltotalmember.setText( MemberDao.getMemberDao().membercount()+"" );	lbltotalmember.setAlignment(Pos.CENTER); // ���� 
		lbltotalboard.setText( BoardDao.getboardDao().boardcount()+"" );		lbltotalboard.setAlignment(Pos.CENTER);
		lbltotalproduct.setText( ProductDao.getProductDao().productcount()+"");	lbltotalproduct.setAlignment(Pos.CENTER);
		
		// �� ��Ʈ ���� 
//		XYChart.Series series = new XYChart.Series<>();	// 1. �迭 ���� 
//		series.setName("�׽�Ʈ"); 						// 2. �迭 �̸� 
//			XYChart.Data data1 =  new XYChart.Data<>("1" , 30);// 3. ������ ���� 
//		series.getData().add( data1 );					// 4. �迭�� ������ �ֱ� 
//		lc.getData().add(series); 						// 5. �迭�� ��Ʈ�� �ֱ� 
		
//		// ����Ʈ�� ��¥�� ��ǰ�� ǥ��
//		XYChart.Series series = new XYChart.Series<>();	// 1.�迭 ���� 
//		series.setName("��� ��"); // 2. �迭 �̸�
//			ObservableList<Product> products = ProductDao.getProductDao().productlist(); // ��� ��ǰ ����Ʈ 
//			ArrayList< ProductDate > dates = new ArrayList<>(); // ��¥�� ������ �����ϴ� ����Ʈ 
//	
//			for( Product product : products ) {	// ��� ��ǰ �ϳ��� ��ü ������ 
//				String date = product.getP_date().split(" ")[0]; // ��¥�� �������� 
//				Boolean datecheck = true; // �ߺ�üũ 
//				for( int i = 0 ; i<dates.size() ; i++  ) {	
//					if( dates.get(i).getDate().equals(date) ) { // ���࿡ ��¥�� ���� ����Ʈ�� ������ ��¥�� ������ 
//						dates.get(i).setCount( dates.get(i).getCount() +1 ); // ���� ++ 
//						datecheck = false; break;
//					}
//				}
//				if( datecheck)dates.add( new ProductDate(date , 1) ); // ������ ��¥�� ������ ����Ʈ�� �߰� 
//			}
//			
//			for( ProductDate date : dates  ) {	// ��¥�� ���� ����Ʈ���� �ϳ��� ��ü ������ 
//				XYChart.Data data = new XYChart.Data<>( date.getDate()+"" , date.getCount() ); // ��ü�� �� �� �ֱ� 
//				series.getData().add(data); // 3. �迭�� �� �ֱ� 
//			}
//		lc.getData().add(series); // 4. �迭�� ��Ʈ�� �ֱ� 
		
		//
		XYChart.Series series = new XYChart.Series<>();	 // 1.�迭���� 
		series.setName("��ǰ ��"); // 2.�迭�̸�
		
			// DB ����[QUERY: select �˻���� ] : ����Ʈ�� ��ü �ϳ��� ������
			ArrayList<ProductDate> productDates = ProductDao.getProductDao().productdatelist();
			for( ProductDate productDate : productDates ) {
				// 3. �迭 ���� 
					// 1. �� ���� 
					XYChart.Data data =   new XYChart.Data<>(productDate.getDate() , productDate.getCount() );
						// 2. ���� ��� ���� [ //data.setNode( �����̳� ); ]
//							AnchorPane anchorPane = new AnchorPane();	// 1. �����̳� ����� 
//								Label label = new Label(productDate.getCount()+""); // 2. ���̺� ���� 
//								label.setPadding( new Insets(5) );	// * setPadding( new Insets(��ġ) ) : ���� ���� 
//							anchorPane.getChildren().add(label);	// 3. �����̳� ���̺� �ֱ� 
//				
//						data.setNode(anchorPane); // 4. ���� �����̳� �ֱ� 
					// 2. �迭�� �� �ֱ� 
					series.getData().add( data ); 
			}
		// ** y�� ���� 
		lc.getYAxis().setAutoRanging(false); // y�� �ڵ����� ���� 
		lc.getData().add(series); // 4. �迭�� ��Ʈ�� �ֱ� 
		
		// ���̺� ���� ���� [ 
		if( productDates.get( productDates.size()-1 ).getCount() >productDates.get(productDates.size()-2).getCount() ) {
					// ����Ʈ�� ������ ��ü�� ��¥�� ��  > ����Ʈ�� ������ �� ��ü�� ��¥�� �� 
			lbldecrease.setVisible(false); // ���� ���̺� ����� 
		}else {
			lblincrease.setVisible(false); // ���� ���̺� ��
		}

		// ��Ʈ�� �ٸ� �迭 �߰� 
//		XYChart.Series series2 = new XYChart.Series<>();
//			series2.setName("�׽�Ʈ");
//			series2.getData().add( new XYChart.Data<>("2021-11-08" , 5));
//			series2.getData().add( new XYChart.Data<>("2021-11-05" , -10));
//			series2.getData().add( new XYChart.Data<>("2021-11-04" , 15));
//		lc.getData().add(series2);
		
		
		// ������Ʈ 
		XYChart.Series series2 = new XYChart.Series<>(); // 1. �迭 ���� 
		
		//3. �迭�� �� �ֱ� 
			HashMap< String , Integer> hashMap = 
					ProductDao.getProductDao().productcategorylist();
			// Map �÷��� < key , value > 
			String maxcategorykey = " ";
			int max =0;
			for( String key : hashMap.keySet() ) {
				if( hashMap.get(key) > max ) {
					max = hashMap.get(key);
					maxcategorykey = key;
				}
				// map�� ��ü Ű�� �����ͼ� �ݺ���
				XYChart.Data data = 
						new XYChart.Data<>( key , hashMap.get(key) );
				series2.getData().add(data);
			}
		//4. ��Ʈ�� �迭 �ֱ� 
		bc.getData().add(series2);
		lblcategory.setText( maxcategorykey );
		
		// ������Ʈ [ �ߺ�����-> �̿ϼ� ]
		ObservableList< Product > products = ProductDao.getProductDao().productlist(); 
		ObservableList< PieChart.Data > observableList = FXCollections.observableArrayList();
		for( Product product : products ) {

			observableList.add( new PieChart.Data( product.getActivation() , 1 ) );

		}
		
		pc.setData(observableList); 
		
	}
	
	@FXML
	private PieChart pc;
	
	@FXML
	private Label lblcategory;
	
	@FXML
	private BarChart bc;
	
	@FXML
	private Label lblincrease;

	@FXML
	private Label lbldecrease;

	@FXML
	private LineChart lc;
	
	@FXML
	private Label lbltotalmember;
	
	@FXML
	private Label lbltotalboard;
	
	@FXML
	private Label lbltotalproduct;

	
	
	
	
	
	
	
	
	
	
	
	
	
}
