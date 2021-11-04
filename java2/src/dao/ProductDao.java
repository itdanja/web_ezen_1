package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Product;

public class ProductDao {
	
	// 1. 鞘靛 
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
		// 按眉 
	public static ProductDao productDao = new ProductDao();	
	// 2. 积己磊
	public ProductDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC" , 
					"root" , "1234");
		}catch (Exception e) {}
	}
	
	// 3. 皋家靛 
	public static ProductDao getProductDao() { return productDao; }
		// 1. 力前 殿废 
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
		// 2. 力前 格废 
	
		// 3. 力前 昏力 
	
		// 4. 力前 荐沥 
	
	
	
	
	

}
