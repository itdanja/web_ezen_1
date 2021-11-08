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
		// 전체 수 
		lbltotalmember.setText( MemberDao.getMemberDao().membercount()+"" );	lbltotalmember.setAlignment(Pos.CENTER); // 정렬 
		lbltotalboard.setText( BoardDao.getboardDao().boardcount()+"" );		lbltotalboard.setAlignment(Pos.CENTER);
		lbltotalproduct.setText( ProductDao.getProductDao().productcount()+"");	lbltotalproduct.setAlignment(Pos.CENTER);
		
		// 선 차트 예시 
//		XYChart.Series series = new XYChart.Series<>();	// 1. 계열 생성 
//		series.setName("테스트"); 						// 2. 계열 이름 
//			XYChart.Data data1 =  new XYChart.Data<>("1" , 30);// 3. 데이터 생성 
//		series.getData().add( data1 );					// 4. 계열에 데이터 넣기 
//		lc.getData().add(series); 						// 5. 계열을 차트에 넣기 
		
//		// 선차트에 날짜별 제품수 표시
//		XYChart.Series series = new XYChart.Series<>();	// 1.계열 생성 
//		series.setName("등록 수"); // 2. 계열 이름
//			ObservableList<Product> products = ProductDao.getProductDao().productlist(); // 모든 제품 리스트 
//			ArrayList< ProductDate > dates = new ArrayList<>(); // 날짜별 개수를 저장하는 리스트 
//	
//			for( Product product : products ) {	// 모든 제품 하나씩 객체 꺼내기 
//				String date = product.getP_date().split(" ")[0]; // 날짜만 가져오기 
//				Boolean datecheck = true; // 중복체크 
//				for( int i = 0 ; i<dates.size() ; i++  ) {	
//					if( dates.get(i).getDate().equals(date) ) { // 만약에 날짜별 개수 리스트에 동일한 날짜가 있으면 
//						dates.get(i).setCount( dates.get(i).getCount() +1 ); // 개수 ++ 
//						datecheck = false; break;
//					}
//				}
//				if( datecheck)dates.add( new ProductDate(date , 1) ); // 동일한 날짜가 없으면 리스트에 추가 
//			}
//			
//			for( ProductDate date : dates  ) {	// 날짜별 개수 리스트에서 하나씩 객체 꺼내기 
//				XYChart.Data data = new XYChart.Data<>( date.getDate()+"" , date.getCount() ); // 객체를 값 에 넣기 
//				series.getData().add(data); // 3. 계열에 값 넣기 
//			}
//		lc.getData().add(series); // 4. 계열을 차트에 넣기 
		
		//
		XYChart.Series series = new XYChart.Series<>();	 // 1.계열생성 
		series.setName("제품 수"); // 2.계열이름
			// DB 쿼리[QUERY: select 검색결과 ] : 리스트내 객체 하나씩 꺼내기
			for( ProductDate productDate : ProductDao.getProductDao().productdatelist() ) {
				// 3. 계열 값 넣기 
				series.getData().add( new XYChart.Data<>(productDate.getDate() , productDate.getCount() ) ); 
			}
		lc.getData().add(series); // 4. 계열을 차트에 넣기 
		
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
