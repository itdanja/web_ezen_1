package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Board;

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
	
	// 게시물 작성
	public boolean boardwrite( Board board ) {
		
		String sql = "insert into board( b_title , b_contents , m_num , b_file) values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);	
			ps.setString(1, board.getB_title() ); 	ps.setString(2, board.getB_contents());
			ps.setInt(3, board.getM_num());			ps.setString(4, board.getB_file());
			ps.executeUpdate();		return true;
		}catch (Exception e) { System.out.println(e);}	return false;	
	}
	// 모든 게시물 출력
	public ArrayList<Board> boardlist(){
		ArrayList<Board> boards = new ArrayList<Board>(); 
		String sql ="select * from board order by b_num DESC";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) {
				
				Board board = new Board( rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3),
						 rs.getInt(4), 
						 rs.getString(5),
						 rs.getString(6),
						 rs.getInt(7),
						 rs.getInt(8));
				boards.add(board);
			}
			return boards;
		}catch (Exception e) {} return null;
	}
	
}








