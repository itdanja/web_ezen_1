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
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

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
			for( ProductDate productDate : ProductDao.getProductDao().productdatelist() ) {
				// 3. �迭 �� �ֱ� 
				series.getData().add( new XYChart.Data<>(productDate.getDate() , productDate.getCount() ) ); 
			}
		lc.getData().add(series); // 4. �迭�� ��Ʈ�� �ֱ� 
		
	}
	@FXML
	private LineChart lc;
	
	@FXML
	private Label lbltotalmember;
	
	@FXML
	private Label lbltotalboard;
	
	@FXML
	private Label lbltotalproduct;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
