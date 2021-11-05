package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProductDao {
	
	// 1. 필드 
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
		// 객체 
	public static ProductDao productDao = new ProductDao();	
	// 2. 생성자
	public ProductDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC" , 
					"root" , "1234");
		}catch (Exception e) {}
	}
	
	// 3. 메소드 
	public static ProductDao getProductDao() { return productDao; }
		// 1. 제품 등록 
	public boolean register( Product product ) {
		String sql ="insert into product( p_name , p_img , p_contents , p_category , p_price , p_activation , m_no)"
				+ "values(?,?,?,?,?,?,?)"; 
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString( 1 , product.getP_name()  );
			preparedStatement.setString( 2 , product.getP_img()  );
			preparedStatement.setString( 3 , product.getP_contents()  );
			preparedStatement.setString( 4 , product.getP_category()  );
			preparedStatement.setInt( 5 , product.getP_price()  );
			preparedStatement.setInt( 6 , product.getP_activation()  );
			preparedStatement.setInt( 7 , product.getM_no()  );
			preparedStatement.executeUpdate();
			return true;
		}
		catch (Exception e) {} return false;
	}
		// 2. 제품 목록 
	public ObservableList<Product> productlist(){
		// 1. 리스트선언 
		ObservableList<Product> products = FXCollections.observableArrayList();
		String sql = "select * from product order by p_no desc"; // 다 가져오기 
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while( resultSet.next() ) { // 검색결과 레코드가 없을때까지 레코드 하나씩 반환
				// 해당 레코드를 객체화
				Product product = new Product( resultSet.getInt(1) , 
						resultSet.getString(2), 
						resultSet.getString(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getInt(6), 
						resultSet.getInt(7), 
						resultSet.getString(8),
						resultSet.getInt(9));
				// 객체 리스트 저장 
				products.add(product);
			}
			return products;
		}catch (Exception e) {} return products;
		
	}
		// 3. 제품 삭제 [ 제품번호의 해당하는 제품 삭제 ] 
	public boolean delete( int p_no ) {
		String sql = "delete from product where p_no =? ";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, p_no);
			preparedStatement.executeUpdate();
			return true;
		}
		catch (Exception e) {} return false;
	}
		// 4. 제품 수정 
	public boolean update( Product product  ) {
		
		String sql = "update product set p_name=? , p_img=? , "
				+ "p_contents=? , p_category=? , p_price=? where p_no=?";
		try {
			preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setString(1, product.getP_name());
			preparedStatement.setString(2, product.getP_img() );
			preparedStatement.setString(3, product.getP_contents() );
			preparedStatement.setString(4, product.getP_category() );
			preparedStatement.setInt(5, product.getP_price());
			preparedStatement.setInt(6, product.getP_no() );
			preparedStatement.executeUpdate();
			return true;
		}catch (Exception e) {} return false;
		
	}
	
	// 5.
	public ObservableList<Product> myproductlist( int m_no ){
		// 1. 리스트선언 
		ObservableList<Product> products = FXCollections.observableArrayList();
		String sql = "select * from product where m_no = ?  order by p_no desc"; // 다 가져오기 
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt( 1 , m_no ); 
			resultSet = preparedStatement.executeQuery();
			while( resultSet.next() ) { // 검색결과 레코드가 없을때까지 레코드 하나씩 반환
				// 해당 레코드를 객체화
				Product product = new Product( resultSet.getInt(1) , 
						resultSet.getString(2), 
						resultSet.getString(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getInt(6), 
						resultSet.getInt(7), 
						resultSet.getString(8),
						resultSet.getInt(9));
				// 객체 리스트 저장 
				products.add(product);
			}
			return products;
		}catch (Exception e) {} return products;
		
	}
	
	// 6. 제품상태 활성화 변경 
	public boolean activationupdate( int p_activation , int p_no ) {
		
		String sql = "update product set p_activation = ? where p_no=?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt( 1 , p_activation );
			preparedStatement.setInt( 2 , p_no );
			preparedStatement.executeUpdate();
			return true;
		}catch (Exception e) {} return false;
		
	}

}



























