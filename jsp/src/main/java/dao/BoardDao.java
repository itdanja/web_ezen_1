package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDao {
	
	private Connection con;
	private ResultSet rs;
	private PreparedStatement ps;
	
	// 2. 생성자 
	public BoardDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jsp?serverTimezone=UTC" , "root","1234");
		
		}
		catch (Exception e) {System.out.println("[연동 실패]");}
	}
	public static BoardDao boarddao = new BoardDao() ; 	// 3. Dao 객체 생성
	public static BoardDao gemboarddao() { return boarddao; } // 4. Dao 객체 반환
	
}
