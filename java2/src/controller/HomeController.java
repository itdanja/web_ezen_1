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
			ArrayList<ProductDate> productDates = ProductDao.getProductDao().productdatelist();
			for( ProductDate productDate : productDates ) {
				// 3. 계열 설정 
					// 1. 값 설정 
					XYChart.Data data =   new XYChart.Data<>(productDate.getDate() , productDate.getCount() );
						// 2. 값에 노드 설정 [ //data.setNode( 컨테이너 ); ]
//							AnchorPane anchorPane = new AnchorPane();	// 1. 컨테이너 만들기 
//								Label label = new Label(productDate.getCount()+""); // 2. 레이블 생성 
//								label.setPadding( new Insets(5) );	// * setPadding( new Insets(수치) ) : 안쪽 여백 
//							anchorPane.getChildren().add(label);	// 3. 컨테이너 레이블 넣기 
//				
//						data.setNode(anchorPane); // 4. 값에 컨테이너 넣기 
					// 2. 계열에 값 넣기 
					series.getData().add( data ); 
			}
		// ** y축 설정 
		lc.getYAxis().setAutoRanging(false); // y축 자동설정 끄기 
		lc.getData().add(series); // 4. 계열을 차트에 넣기 
		
		// 레이블 증감 설정 [ 
		if( productDates.get( productDates.size()-1 ).getCount() >productDates.get(productDates.size()-2).getCount() ) {
					// 리스트내 마지막 객체내 날짜의 수  > 리스트내 마지막 전 객체내 날짜의 수 
			lbldecrease.setVisible(false); // 감소 레이블 숨기기 
		}else {
			lblincrease.setVisible(false); // 증가 레이블 숨
		}

		// 차트에 다른 계열 추가 
//		XYChart.Series series2 = new XYChart.Series<>();
//			series2.setName("테스트");
//			series2.getData().add( new XYChart.Data<>("2021-11-08" , 5));
//			series2.getData().add( new XYChart.Data<>("2021-11-05" , -10));
//			series2.getData().add( new XYChart.Data<>("2021-11-04" , 15));
//		lc.getData().add(series2);
		
		
		// 막대차트 
		XYChart.Series series2 = new XYChart.Series<>(); // 1. 계열 생성 
		
		//3. 계열에 값 넣기 
			HashMap< String , Integer> hashMap = 
					ProductDao.getProductDao().productcategorylist();
			// Map 컬렉션 < key , value > 
			String maxcategorykey = " ";
			int max =0;
			for( String key : hashMap.keySet() ) {
				if( hashMap.get(key) > max ) {
					max = hashMap.get(key);
					maxcategorykey = key;
				}
				// map에 전체 키를 가져와서 반복문
				XYChart.Data data = 
						new XYChart.Data<>( key , hashMap.get(key) );
				series2.getData().add(data);
			}
		//4. 차트에 계열 넣기 
		bc.getData().add(series2);
		lblcategory.setText( maxcategorykey );
		
		// 원형차트 [ 중복제거-> 미완성 ]
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
