package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Board;
import dto.Reply;

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

		// 모든 게시물 출력
		public ArrayList<Board> boardlist( int startrow , int listsize ,  String key , String keyword ){
			
			ArrayList<Board> boards = new ArrayList<Board>(); 
			String sql = null;
			
			if( key ==null && keyword ==null ) { // 1. 검색이 없을경우
				sql ="select * from board order by b_num DESC limit ? , ?";
			}else { // 2. 검색이 있을경우
				if( key.equals("b_writer")  ) {		 //작성자 검색 : 작성자 -> 회원번호
					int m_num = MemberDao.getmemberDao().getmembernum(keyword);
					sql ="select * from board where m_num = "+ m_num +" order by b_num desc limit ? , ?";
				}else if( key.equals("b_num") ) {	//번호 검색 : 일치한 값만 검색
					sql ="select * from board where b_num = "+ keyword +" order by b_num desc limit ? , ? ";
				}else {								 // 제목 혹은 내용 검색 : 포함된 값 검색 
					sql ="select * from board where "+key+" like '%"+keyword+"%' order by b_num desc limit ? , ?";
				}
			}
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
		
	// 게시물 총 개수 반환 메소드 
	public int boardcount( String key , String keyword) {
		String sql = null;
		
		if( key == null && keyword == null ) { // 검색이 없을때	[ 조건 없는 모든 레코드 개수 세기 ]
			sql="select count(*) from board";
		}else {  // 검색이 있을때 [ 조건 레코드 개수 세기 ]
			if( key.equals("b_writer")  ) {		 //작성자 검색 : 작성자 -> 회원번호
				int m_num = MemberDao.getmemberDao().getmembernum(keyword);
				sql ="select count(*) from board where m_num = "+ m_num ;
			}else if( key.equals("b_num") ) {	//번호 검색 : 일치한 값만 검색
				sql ="select count(*) from board where b_num = "+ keyword;
			}else {								 // 제목 혹은 내용 검색 : 포함된 값 검색 
				sql ="select count(*) from board where "+key+" like '%"+keyword+"%'";
			}
		}
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();	
			if( rs.next() ) { return rs.getInt(1); }
		}catch (Exception e) {} return 0;
	}
	
	// 댓글 등록 메소드 
	public boolean replywrite( Reply reply ) {
		
		try {
			String sql = "insert into reply(r_contents , m_num , b_num) values(?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, reply.getR_contents());
			ps.setInt(2, reply.getM_num());
			ps.setInt(3, reply.getB_num());
			ps.executeUpdate(); return true;
		}catch (Exception e) {} return false;
	}
	
	// 현재 게시물의 댓글 출력 
	public ArrayList<Reply> replylist( int b_num){
		
		ArrayList<Reply> replies = new ArrayList<Reply>();
		try {
			String sql = "select * from reply where b_num="+b_num;
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) {
				
				Reply reply = new Reply(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getInt(5));
				replies.add(reply);
			}
			return replies;
		}catch (Exception e) {} return null;
	}
	// 현재 댓글 삭제 메소드 
	public boolean replydelete( int r_num ) {
		
		try {
			String sql="delete from reply where r_num="+r_num;
			ps=con.prepareStatement(sql);
			ps.executeUpdate(); return true;
		}catch (Exception e) {} return false;
	}
}























