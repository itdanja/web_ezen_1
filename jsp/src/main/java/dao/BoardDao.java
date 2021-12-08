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
	public static BoardDao getboarddao() { return boarddao; } // 4. Dao 객체 반환
	
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
	public ArrayList<Board> boardlist( int startrow , int listsize){
		ArrayList<Board> boards = new ArrayList<Board>(); 
		String sql ="select * from board order by b_num DESC limit ? , ?";
															// limit 시작번호 , 제한개수
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, startrow);  ps.setInt(2, listsize);
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
	
	// 모든 게시물 출력
	public ArrayList<Board> boardlist2( String key , String keyword ){
		ArrayList<Board> boards = new ArrayList<Board>(); 
		String sql ="select * from board where "+key+" like '%"+keyword+"%' order by b_num desc";
															// limit 시작번호 , 제한개수
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
	
	// 게시물번호의 해당 게시물 가져오기 
	public Board getboard( int b_num) {
		String sql = "select * from board where b_num=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, b_num);
			rs = ps.executeQuery();
			if( rs.next() ) {
				Board board = new Board( rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3),
						 rs.getInt(4), 
						 rs.getString(5),
						 rs.getString(6),
						 rs.getInt(7),
						 rs.getInt(8));
				return board;
			}
		}catch (Exception e) {} return null;
		
	}
	// 게시물번호의 해당 게시물 가져오기 
		public boolean boardcount( int b_num) {
			String sql = "update board set b_view = b_view+1 where b_num = ?";
			try {
				ps = con.prepareStatement(sql);
				ps.setInt(1, b_num); 	ps.executeUpdate();
				return true;
			}catch (Exception e) {} return false;
		}
	// 게시물 삭제 메소드 
		public boolean boarddelete( int b_num ) {
			String sql = "delete from board where b_num =?";
			try {
				ps = con.prepareStatement(sql);
				ps.setInt(1, b_num); 	ps.executeUpdate();
				return true;
			}catch (Exception e) {} return false;
		}
	// 게시물 수정 메소드 
		public boolean boardupdate( Board board ) {
			String sql = "update board set b_title=? , b_contents=? , b_file=? "
						+ "where b_num = ?";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, board.getB_title() );  	
				ps.setString(2, board.getB_contents());
				ps.setString(3, board.getB_file() );	
				ps.setInt(4, board.getB_num() );
				ps.executeUpdate();
				return true;
			}catch (Exception e) {} return false;
		}
		
	// 게시물 총 개수 반환 메소드 
	public int boardcount() {
		String sql ="select count(*) from board"; // count(*) : 개수함수 => 레코드 개수
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();	
			if( rs.next() ) { return rs.getInt(1); }
		}catch (Exception e) {} return 0;
	}
}















