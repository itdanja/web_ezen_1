package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Board;


public class BoardDao {
	
	// 1. 필드
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	// 객체
	private static BoardDao boardDao = new BoardDao();
	
	// 2.생성자 [ DB 연동 ] 
	public BoardDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC" , 
					"root" , "1234");
		}
		catch (Exception e) {
			System.out.println("*db 연동 실패");
		}
	}
	// 객체 반환 메소드 
	public static BoardDao getboardDao() { return boardDao; }
	
	// 3. 메소드 [ CRUD ]
		// 1. 게시물 등록 메소드 
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
		// 2. 게시물 조회 메소드 
	
		// 3. 게시물 삭제 메소드 
	
		// 4. 게시물 수정 메소드 
	
		// 5. 게시물 개별조회 메소드 
	
		

	
	
	
	
	
}
