package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import domain.Board;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


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
		// 2. �Խù� ��ü��ȸ �޼ҵ� 
		public ObservableList<Board> boardlist(){
			// 0. ����Ʈ ���� 
			ObservableList<Board> boards = FXCollections.observableArrayList();
			// 1. ���� ���� ��� �������� 
			String sql = "select * from board";
			try {
				preparedStatement = connection.prepareStatement(sql);
				resultSet =  preparedStatement.executeQuery();
				// 2. �˻���[����] ���ڵ��� �ϳ��� ��üȭ 
				while( resultSet.next() ) {
						// ��������� ���ڵ尡 ������ ���� �ݺ��ϸ鼭 ��üȭ
					Board board = new Board(
							resultSet.getInt(1), 
							resultSet.getString(2),
							resultSet.getString(3), 
							resultSet.getString(4), 
							resultSet.getString(5), 
							resultSet.getInt(6) );
					// ��ü�� ����Ʈ�� ��� 
					boards.add(board);
				}
				return boards;
			}
			catch (Exception e) {} return boards;
			
			
			
		}
	
		// 3. �Խù� ���� �޼ҵ� 
	
		// 4. �Խù� ���� �޼ҵ� 
	
		// 5. �Խù� ������ȸ �޼ҵ� 

	
}
