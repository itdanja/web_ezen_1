package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Board;


public class BoardDao {
	
	// 1. �ʵ�
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	// ��ü
	private static BoardDao boardDao = new BoardDao();
	
	// 2.������ [ DB ���� ] 
	public BoardDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC" , 
					"root" , "1234");
		}
		catch (Exception e) {
			System.out.println("*db ���� ����");
		}
	}
	// ��ü ��ȯ �޼ҵ� 
	public static BoardDao getboardDao() { return boardDao; }
	
	// 3. �޼ҵ� [ CRUD ]
		// 1. �Խù� ��� �޼ҵ� 
	public boolean write( Board board ) {
		String sql = "insert into board( b_title , b_contents , b_write ) values( ? , ? , ? )";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString( 1 , board.getB_title() );
			preparedStatement.setString( 2 , board.getB_contents() );
			preparedStatement.setString( 3 , board.getB_write() );
			preparedStatement.executeUpdate();
			return true;
		}catch (Exception e) {}
		return false;
	}
		// 2. �Խù� ��ȸ �޼ҵ� 
	
		// 3. �Խù� ���� �޼ҵ� 
	
		// 4. �Խù� ���� �޼ҵ� 
	
		// 5. �Խù� ������ȸ �޼ҵ� 
	
		

	
	
	
	
	
}
